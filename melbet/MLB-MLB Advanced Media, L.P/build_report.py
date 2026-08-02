#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK MLB (MLB Advanced Media, L.P)."""

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
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.INTERNET, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "com.android.providers.tv.permission.READ_EPG_DATA, "
    "com.android.providers.tv.permission.WRITE_EPG_DATA, "
    "android.permission.POST_NOTIFICATIONS, "
    "com.android.vending.BILLING, "
    "com.bamnetworks.mobile.android.gameday.atbat.permission.C2D_MESSAGE, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "android.permission.VIBRATE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "android.permission.READ_APP_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.AD_SERVICES_CONFIG, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.USE_FINGERPRINT, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.bamnetworks.mobile.android.gameday.atbat.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = (
    "AdMob / Google Mobile Ads / Google Ad Manager, "
    "Google IMA (Interactive Media Ads) + PAL, "
    "Publica (pbs.getpublica.com)"
)

ANALYTICS = (
    "Firebase Analytics, Firebase Crashlytics, Firebase Performance, "
    "Firebase Cloud Messaging, Firebase Remote Config, Firebase Installations / Sessions, "
    "Adobe Experience Platform Mobile SDK (Analytics, Audience, Target, Identity, "
    "Lifecycle, Signal, Edge, Consent, User Profile), "
    "Branch (Adobe Branch extension, OneLink), "
    "OneSignal, Datadog (RUM), Comscore, Conviva, "
    "OpenTelemetry, Google Play Install Referrer"
)

LIBRARIES = (
    "mlb.atbat / mlb.app / mlb.ui (At Bat TV), "
    "com.bamnetworks, "
    "androidx (appcompat, browser, compose, leanback, media3/exoplayer, "
    "navigation, room, work, datastore, lifecycle, webkit, preference), "
    "com.google.android.gms (ads, ads-identifier, cast, location, "
    "measurement, cloud-messaging, tasks), "
    "com.google.firebase (analytics, crashlytics, perf, messaging, "
    "remoteconfig, installations, sessions), "
    "com.google.ads.interactivemedia (IMA/PAL/OMID), "
    "com.adobe.marketing.mobile, "
    "com.onesignal, com.datadog, com.comscore, com.conviva, "
    "io.branch.referral / io.branch.adobe.extension, "
    "com.okta.oidc / com.okta.sdk, "
    "com.apollographql.apollo3, "
    "okhttp3, retrofit2, io.ktor, "
    "coil3, com.bumptech.glide, "
    "com.facebook.shimmer, "
    "Kotlin 2.2.21 / kotlinx.coroutines / kotlinx.serialization, "
    "io.opentelemetry, org.joda"
)

SHARED_PREFS = (
    "one_signal_id_is_set (флаг OneSignal); "
    "mlb_tv_lab_data / mlbtv_stream_lab_data (лабораторные/отладочные "
    "настройки стримов и окружения); "
    "PreferenceManager / EnvironmentSettings (выбор API-окружения); "
    "UserPreferencesSyncWorker (синхронизация пользовательских настроек); "
    "служебные prefs Firebase / Adobe / Datadog / Branch / OneSignal; "
    "ключей offer_url / cloak / gate нет"
)

# Домены из готовых проверок пайплайна (промпт); baseballsavant урезан — не включаем
SUSPICIOUS_DOMAINS = (
    "media-gateway.mlb.com, assets.adobedtm.com, "
    "atbatappconfig.mlb.com, auctions.mlb.com"
)
SUSPICIOUS_DOMAIN_SET = {
    "media-gateway.mlb.com",
    "assets.adobedtm.com",
    "atbatappconfig.mlb.com",
    "auctions.mlb.com",
}

SUSPICIOUS_WORDS = "offer, redirect, clickid, click_id, webview, bot"

DOMAIN_NOTES = {
    "media-gateway.mlb.com": (
        "Это официальный адрес MLB для медиа-запросов приложения "
        "(в строках по умолчанию https://media-gateway.mlb.com/graphql/). "
        "Через него At Bat TV получает данные о трансляциях и правах на "
        "просмотр. VirusTotal без детекций; снаружи отвечает защита "
        "Cloudflare. На вид это штатный сервис MLB, а не скрытый «шлюз» оффера."
    ),
    "assets.adobedtm.com": (
        "CDN Adobe Dynamic Tag Management / Launch: отсюда подгружаются "
        "конфиги аналитики Adobe (файлы satellite-*.json в ADBMobileConfig). "
        "Используется вместе с Adobe Experience Platform в TrackingInitializer. "
        "VirusTotal чистый; это крупный служебный CDN аналитики, не лендинг оффера."
    ),
    "atbatappconfig.mlb.com": (
        "Официальный хост удалённой конфигурации At Bat "
        "(string_override_api_pref_default). Приложение читает отсюда "
        "настройки экранов и переключатели функций обычного MLB TV. "
        "VirusTotal 0/91; ответ NoSuchKey — пустой ключ без вредоносной "
        "страницы. К клоаке и казино-офферам не относится."
    ),
    "auctions.mlb.com": (
        "Официальный сайт MLB Auctions (аутентичные сувениры). "
        "Ссылка лежит в menuConfig.json меню приложения и открывается "
        "как обычная веб-страница MLB. VirusTotal чистый, открывается "
        "публичный магазин аукционов. Это контент бренда, не скрытый оффер."
    ),
}

SDK_ROWS = [
    (
        "Название приложения",
        "MLB (com.bamnetworks.mobile.android.gameday.atbat), "
        "versionName 26.12.0.23 (versionCode 1750000107), "
        "разработчик MLB Advanced Media, L.P",
    ),
    ("Android Gradle Plugin", "8.13.2"),
    ("minSdk", "23"),
    ("targetSdk", "36"),
    ("Kotlin", "да + 2.2.21"),
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
    checks = data.get("checks") or data.get("checked") or data
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
        title="MLB — APK analysis",
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
