#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Telegram (Telegram FZ-LLC)."""

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
    "android.permission.ACCESS_BACKGROUND_LOCATION, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_MEDIA_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.AUTHENTICATE_ACCOUNTS, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.CALL_PHONE, "
    "android.permission.CAMERA, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_CAMERA, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_LOCATION, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.INSTALL_SHORTCUT, "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_ACCOUNTS, "
    "android.permission.MANAGE_OWN_CALLS, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_APP_BADGE, "
    "android.permission.READ_CALL_LOG, "
    "android.permission.READ_CLIPBOARD, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_AUDIO, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_PHONE_NUMBERS, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.READ_PROFILE, "
    "android.permission.READ_SYNC_SETTINGS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REQUEST_INSTALL_PACKAGES, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_CONTACTS, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.WRITE_SYNC_SETTINGS, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.android.launcher.permission.INSTALL_SHORTCUT, "
    "com.android.launcher.permission.UNINSTALL_SHORTCUT, "
    "com.android.vending.BILLING, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE, "
    "org.telegram.messenger.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "org.telegram.messenger.permission.MAPS_RECEIVE"
)

LIBRARIES = (
    "org.telegram (messenger, ui, tgnet, SQLite, PhoneFormat), "
    "org.webrtc, org.aspectj, org.commonmark, org.scilab, "
    "androidx (appcompat, activity, biometric, browser/customtabs support, "
    "car.app, core, credentials, emoji2, exifinterface, fragment, lifecycle, "
    "media, mediarouter, palette, profileinstaller, security-crypto, "
    "sharetarget, startup, vectordrawable, viewpager, webkit), "
    "com.google.firebase (messaging, installations, components, datatransport, "
    "abt, appindexing, encoders), "
    "com.google.android.gms (maps, location, cast, cloudmessaging, auth, "
    "fido, safetynet, tasks, vision, wallet, wearable, clearcut), "
    "com.google.android.exoplayer2, com.google.android.play.core.integrity, "
    "com.google.android.recaptcha, com.google.mlkit (image labeling, language-id), "
    "com.android.billingclient, com.stripe.android, "
    "com.googlecode / com.coremedia / com.mp4parser, "
    "com.carrotsearch, fi.iki.elonen (nanohttpd), "
    "io.noties / ru.noties (markwon), me.vkryl, "
    "Kotlin 2.1.20 / kotlinx.coroutines 1.8.1"
)

SHARED_PREFS = (
    "mainconfig / userconfig / userconfing (аккаунт, настройки клиента); "
    "Notifications (уведомления); "
    "stats / statsN (счётчики сети и звонков StatsController); "
    "themeconfig / chatthemeconfig_* / dayNightThemeSwitchHintCount (темы); "
    "drafts / bot_drafts / voicedrafts_* (черновики); "
    "emoji / hashtag_search_history / recent_reactions_* (история UI); "
    "proxy_list / proxy_enabled (прокси); "
    "shortcut_widget / pipconfig / playback_speed (виджеты и плеер); "
    "purchases / saved_tokens / saved_tokens_login (покупки и токены); "
    "botdownloads_* / botlocation_* / botemojistatus_* / botshare (боты); "
    "langconfig / systemConfig / learning; "
    "ключей offer_url / cloak / gate нет"
)

SUSPICIOUS_DOMAINS = (
    "aomedia.org, aparat.com, api.stripe.com, api.twitch.tv"
)
SUSPICIOUS_DOMAIN_SET = {
    "aomedia.org",
    "aparat.com",
    "api.stripe.com",
    "api.twitch.tv",
}

SUSPICIOUS_WORDS = (
    "affiliate, blacklist, withdraw, offer, redirect, bot, webview"
)

DOMAIN_NOTES = {
    "aomedia.org": (
        "Это служебный адрес стандарта Alliance for Open Media. "
        "В коде ExoPlayer он встречается как схема события "
        "https://aomedia.org/emsg/ID3 для метаданных в видео, а не как "
        "сайт, куда пускают пользователя. VirusTotal без детекций; "
        "открывается публичная страница альянса. К скрытым офферам "
        "и проверке «кому что показать» не относится."
    ),
    "aparat.com": (
        "Иранский видеохостинг. Telegram встраивает ролики Aparat "
        "через WebPlayerView: запрос "
        "http://www.aparat.com/video/video/embed/.../videohash/... "
        "нужен, чтобы показать вложение в чате. VirusTotal 0/91; "
        "снаружи открывается обычная домашняя страница Aparat. "
        "Это плеер контента, не шлюз клоаки."
    ),
    "api.stripe.com": (
        "Официальный программный адрес платёжной библиотеки Stripe "
        "(com.stripe.android): отсюда создают токены карт "
        "(https://api.stripe.com/v1/tokens) для оплаты внутри Telegram. "
        "VirusTotal чистый; корень API отвечает служебной ошибкой JSON. "
        "Это платёжный сервис, не рекламный лендинг и не фильтр трафика."
    ),
    "api.twitch.tv": (
        "Программный адрес Twitch для встроенного плеера: "
        "WebPlayerView ходит на api.twitch.tv/kraken/streams и "
        "access_token канала, чтобы воспроизвести стрим из ссылки в чате. "
        "VirusTotal без детекций, регистратор MarkMonitor. "
        "Нужен для медиа-вложений, а не для скрытой развилки оффера."
    ),
}

SDK_ROWS = [
    (
        "Название приложения",
        "Telegram (org.telegram.messenger), "
        "versionName 12.9.1 (versionCode 69792), "
        "разработчик Telegram FZ-LLC",
    ),
    ("Android Gradle Plugin", "8.6.1"),
    ("minSdk", "23"),
    ("targetSdk", "35"),
    ("Kotlin", "да + 2.1.20"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", "нет"),
    (
        "Аналитика",
        "Firebase Cloud Messaging, Firebase Installations, "
        "собственная StatsController (счётчики трафика и звонков)",
    ),
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
        title="Telegram — APK analysis",
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
