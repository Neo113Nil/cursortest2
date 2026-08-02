#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Google Chrome (Google LLC)."""

import os

from reportlab.lib import colors
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
    spaceAfter=5,
)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=7.2, leading=9.2)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=7.2, leading=9.2)
SMALL = ParagraphStyle(
    "SMALL",
    fontName="DJ",
    fontSize=8.4,
    leading=11.6,
    textColor=colors.HexColor("#444444"),
    spaceAfter=6,
)

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


def kv_table(rows, widths=(48 * mm, 122 * mm), header=None, compact=False):
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
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.CAMERA, "
    "android.permission.CAPTURE_KEYBOARD, "
    "android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS, "
    "android.permission.CREDENTIAL_MANAGER_SET_ALLOWED_PROVIDERS, "
    "android.permission.CREDENTIAL_MANAGER_SET_ORIGIN, "
    "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_CAMERA, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_ACCOUNTS, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.QUERY_ADVANCED_PROTECTION_MODE, "
    "android.permission.QUERY_ALL_PACKAGES, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REPOSITION_SELF_WINDOWS, "
    "android.permission.RUN_USER_INITIATED_JOBS, "
    "android.permission.USE_CREDENTIALS, "
    "android.permission.USE_LOOPBACK_INTERFACE, "
    "android.permission.USE_PINNED_WINDOWING_LAYER, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.android.chrome.TOS_ACKED, "
    "com.android.chrome.permission.C2D_MESSAGE, "
    "com.android.chrome.permission.READ_WRITE_BOOKMARK_FOLDERS, "
    "com.android.launcher.permission.INSTALL_SHORTCUT, "
    "com.chrome.permission.DEVICE_EXTRAS, "
    "com.google.android.apps.aicore.service.BIND_SERVICE, "
    "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.DSE, "
    "com.google.android.googlequicksearchbox.permission.LENS_SERVICE, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.sec.enterprise.knox.MDM_CONTENT_PROVIDER"
)

LIBRARIES = (
    "org.chromium.chrome (SplitChromeApplication, ChromeLauncherActivity, "
    "ChromeTabbedActivity, CustomTabActivity, FirstRunActivity), "
    "org.chromium.base / content / components / net / ui / url / media, "
    "org.chromium.content.app (SandboxedProcessService / PrivilegedProcessService), "
    "com.google.android.gms (common, people, wallet, phenotype, cast), "
    "com.google.android.libraries.phenotype, "
    "com.google.android.libraries.surveys, "
    "com.google.android.libraries.sharing.sharekit, "
    "com.google.firebase (messaging, installations, components, datatransport, encoders), "
    "com.google.android.datatransport, "
    "com.google.android.play.core (splits / review / install), "
    "com.google.ar.core, com.google.vr / cardboard, "
    "com.facebook.litho / yoga, "
    "androidx (appcompat, browser/customtabs, compose, credentials, "
    "media3, preference, pdf, window, viewpager2, appsearch), "
    "Kotlin / kotlinx.coroutines, "
    "io.grpc, io.reactivex, Guava / protobuf / flatbuffers"
)

SHARED_PREFS = (
    "ChromeSharedPreferences / SharedPreferencesManager "
    "(настройки браузера, homepage partner URL, developer flag, "
    "extensions URL overrides, Safe Browsing, Glic/AI settings, "
    "verified_digital_asset_links, AccountPicker dismissal count, "
    "Custom Tabs last client package/referrer/task id, "
    "LocaleManager promo/auto-switch, variations_seed_base64 / "
    "variations_initialized); "
    "CloudManagementSharedPreferences (корпоративные политики); "
    "minidump upload counters; "
    "ключей offer_url / cloak / gate для схемы «оффер vs белое приложение» нет"
)

MAIN_ROWS = [
    (
        "Название приложения",
        "Google Chrome (com.android.chrome), "
        "versionName 150.0.7871.186 (versionCode 787118630), "
        "разработчик Google LLC",
    ),
    ("Android Gradle Plugin", "нет"),
    ("minSdk", "29"),
    ("targetSdk", "36"),
    ("Kotlin", "да"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", "нет"),
    (
        "Аналитика",
        "Chrome UMA/UKM / crash reports (clients2.google.com/cr/report), "
        "Chrome Variations / Finch seed (clientservices.googleapis.com/"
        "chrome-variations/seed), "
        "Google Phenotype (удалённые флаги), "
        "Firebase Cloud Messaging / Installations / Components, "
        "Google Data Transport; "
        "не сторонние attribution SDK (AppsFlyer/Adjust и т.п.)",
    ),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", "нет"),
]


def build():
    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=16 * mm,
        rightMargin=16 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Отчёт по анализу APK — Google Chrome",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Google Chrome &mdash; Google LLC &mdash; com.android.chrome "
            "(versionName 150.0.7871.186 / versionCode 787118630)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: com.android.chrome.xapk, базовый "
            "apk/com.android.chrome.apk, feature-сплиты chrome.apk и "
            "on_demand.apk, языковые config.*.apk, meta.json, "
            "domain_checks, AndroidManifest и jadx-исходники "
            "(org.chromium.*, com.google.*, androidx, defpackage). "
            "Сборка Chromium/GN (не AGP). Точка входа: "
            "SplitChromeApplication → com.google.android.apps.chrome.Main → "
            "ChromeLauncherActivity / ChromeTabbedActivity "
            "(при первом запуске — FirstRunActivity / "
            "LightweightFirstRunActivity). Тихой серверной развилки "
            "«оффер vs белое приложение» нет: это обычный браузер Google.",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(
        kv_table(
            MAIN_ROWS,
            widths=(42 * mm, 128 * mm),
            header=("Параметр", "Значение"),
            compact=True,
        )
    )

    story.append(Spacer(1, 4 * mm))
    story.append(Paragraph("Пояснение по доменам и проверкам", H2))
    story.append(
        Paragraph(
            "Кастомных/неизвестных «подозрительных» хостов нет. "
            "В коде встречаются служебные адреса Google "
            "(googleapis, gstatic, chrome.google.com, myaccount.google.com, "
            "support.google.com, clients2/4.google.com и т.п.), "
            "а также aomedia.org как namespace для AV1 emsg/ID3 и "
            "chromium.org как справочная ссылка проекта Chromium — "
            "это известные стандарты/инфраструктура Google, не "
            "неизвестные gate-домены. Хосты bar.com, bit.ly и "
            "chromestatus.com из черновика проверок в строках этого "
            "APK не найдены либо относятся к крупным известным "
            "сервисам и в таблицу подозрительных доменов не входят.",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Phenotype и Chrome Variations — это обычные удалённые "
            "флаги функций браузера (A/B эксперименты Finch), а не "
            "проверка «кому показать казино-оффер». URLBlacklist — "
            "корпоративная политика блокировки сайтов. Слова "
            "affiliate относятся к связанным паролям Chrome Sync, "
            "а не к партнёрским офферам.",
            BODY,
        )
    )

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
