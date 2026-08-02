#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK eFootball™ (KONAMI)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (
    Paragraph,
    SimpleDocTemplate,
    Spacer,
    Table,
    TableStyle,
)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle(
    "H1",
    fontName="DJ-B",
    fontSize=16,
    leading=20,
    spaceAfter=8,
    textColor=colors.HexColor("#12263f"),
)
H2 = ParagraphStyle(
    "H2",
    fontName="DJ-B",
    fontSize=12.5,
    leading=16,
    spaceBefore=12,
    spaceAfter=6,
    textColor=colors.HexColor("#12263f"),
)
BODY = ParagraphStyle(
    "BODY",
    fontName="DJ",
    fontSize=9.3,
    leading=13.4,
    alignment=TA_LEFT,
    spaceAfter=5,
)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (
        str(text)
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
    )


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
    data = []
    if header:
        data.append(
            [
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B
                ),
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B
                ),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    pad = 2 if compact else 3
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), pad),
        ("BOTTOMPADDING", (0, 0), (-1, -1), pad),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_ADMIN, "
    "android.permission.BLUETOOTH_ADVERTISE, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.BLUETOOTH_SCAN, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_MULTICAST_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.DISABLE_KEYGUARD, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.INTERNET, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.android.vending.BILLING, "
    "com.android.vending.CHECK_LICENSE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "jp.konami.pesam.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = "AdMob / Google Mobile Ads, Gadsme (in-game advertising), Applilink (KONAMI cross-promo)"

ANALYTICS = (
    "Firebase Analytics, Firebase Crashlytics, Firebase Messaging, "
    "Firebase Remote Config, Firebase Installations / Sessions, "
    "Google Measurement / App Measurement, Adjust, "
    "Google Play Install Referrer, Play Services Games v2"
)

LIBRARIES = (
    "Unreal Engine 4 (com.epicgames.ue4), "
    "jp.konami.pesam / jp.konami.android.common / ExpansionDownloader / peerlink, "
    "jp.applilink.sdk (Applilink 3.5.8), "
    "gadsme.sdk / gadsme.support, "
    "com.adjust.sdk, "
    "com.google.android.gms (ads, ads-identifier, measurement, auth, games-v2, "
    "location, tasks, basement, cloud-messaging, cronet), "
    "com.google.firebase (analytics, crashlytics, messaging, remoteconfig, "
    "installations, sessions, datatransport), "
    "com.google.android.play (core asset packs / app-update / review / integrity / billing), "
    "androidx (appcompat, browser, core, core-ktx, webkit, work-runtime, room, "
    "datastore, lifecycle, fragment, media, privacysandbox.ads), "
    "Kotlin 1.9.22 / kotlinx.coroutines 1.7.3, "
    "org.chromium.net / support_lib_boundary, "
    "jp.co.cri_vip_android (CRIWARE), "
    "okio, Guava annotations / j2objc"
)

SHARED_PREFS = (
    "LocalNotificationPreferences (UE4 локальные уведомления); "
    "adjust_preferences (сессии/атрибуция Adjust); "
    "admob / google_ads_flags_meta (флаги Google Mobile Ads); "
    "Applilink SDK prefs по типу SDK и package "
    "(user id, install-флаги, cookies, click_id в applilink_click_ids.json)"
)

# Только кастомные/неочевидные хосты; Adjust и crashpad.chromium.org исключены
SUSPICIOUS_DOMAINS = "ads-privacy.gadsme.com, ads.gadsme.com"
SUSPICIOUS_DOMAIN_SET = {"ads-privacy.gadsme.com", "ads.gadsme.com"}

SUSPICIOUS_WORDS = "click_id, clickid"

DOMAIN_NOTES = {
    "ads-privacy.gadsme.com": (
        "Это служебный адрес платформы внутриигровой рекламы Gadsme. "
        "Из нативной библиотеки игры на него ходят запросы, связанные с "
        "политикой/приватностью рекламных вставок в матче. "
        "VirusTotal без детекций; страница ведёт на обычный сайт Gadsme. "
        "На вид это легитимный рекламный SDK, а не скрытый «шлюз» оффера."
    ),
    "ads.gadsme.com": (
        "Основной рекламный хост Gadsme для загрузки и показа in-game баннеров "
        "и видео внутри футбольного матча. "
        "Встроен в нативный код (arm64), рядом с bridge для WebView-креативов. "
        "Проверки VirusTotal чистые, редирект на сайт платформы. "
        "Используется как обычная рекламная сеть внутри игры KONAMI."
    ),
}

SDK_ROWS = [
    ("Название приложения", "eFootball™"),
    ("Android Gradle Plugin", "8.9.0"),
    ("minSdk", "24"),
    ("targetSdk", "35"),
    ("Kotlin", "да + 1.9.22"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", SUSPICIOUS_DOMAINS),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def load_domain_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        data = json.load(f)
    checks = data.get("checks") or data
    if isinstance(checks, dict):
        checks = checks.get("domains") or checks.get("results") or []
    out = []
    for c in checks:
        domain = c.get("domain") or c.get("host")
        if domain not in SUSPICIOUS_DOMAIN_SET:
            continue
        rows = c.get("table_rows") or []
        out.append((domain, [(r["param"], r["value"]) for r in rows]))
    return out


def build():
    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=12 * mm,
        bottomMargin=12 * mm,
        title="eFootball™ — APK analysis",
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(
        kv_table(
            SDK_ROWS,
            header=("Параметр", "Значение"),
        )
    )

    for domain, rows in load_domain_checks():
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(
            kv_table(
                rows,
                header=("Параметр / движок", "Значение / вердикт"),
                compact=True,
            )
        )
        note = DOMAIN_NOTES.get(domain)
        if note:
            story.append(Spacer(1, 4))
            story.append(Paragraph(esc(note), BODY))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
