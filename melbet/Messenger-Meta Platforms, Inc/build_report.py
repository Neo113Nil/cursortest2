#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Messenger (com.facebook.orca)."""

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
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=6.8, leading=8.6)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=6.8, leading=8.6)

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
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.AUTHENTICATE_ACCOUNTS, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_ADMIN, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.CALL_PHONE, "
    "android.permission.CAMERA, "
    "android.permission.CAPTURE_VIDEO_OUTPUT, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.CREDENTIAL_MANAGER_SET_ALLOWED_PROVIDERS, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.DETECT_SCREEN_RECORDING, "
    "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_CAMERA, "
    "android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE, "
    "android.permission.FOREGROUND_SERVICE_LOCATION, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.FOREGROUND_SERVICE_PHONE_CALL, "
    "android.permission.FOREGROUND_SERVICE_SPECIAL_USE, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_ACCOUNTS, "
    "android.permission.MANAGE_OWN_CALLS, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_BASIC_PHONE_STATE, "
    "android.permission.READ_CALENDAR, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_AUDIO, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_MEDIA_VISUAL_USER_SELECTED, "
    "android.permission.READ_PHONE_NUMBERS, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.READ_PROFILE, "
    "android.permission.READ_SYNC_SETTINGS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS, "
    "android.permission.SCHEDULE_EXACT_ALARM, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_CALENDAR, "
    "android.permission.WRITE_CONTACTS, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.WRITE_SYNC_SETTINGS, "
    "com.amazon.device.messaging.permission.RECEIVE, "
    "com.android.launcher.permission.INSTALL_SHORTCUT, "
    "com.android.vending.BILLING, "
    "com.facebook.katana.provider.ACCESS, "
    "com.facebook.messaging.appwidget.homescreenwidget.META_AI_APP_WIDGET, "
    "com.facebook.messaging.quicksnap.appwidget.QUICKSNAP_APP_WIDGET, "
    "com.facebook.mlite.provider.ACCESS, "
    "com.facebook.orca.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.facebook.orca.permission.CREATE_SHORTCUT, "
    "com.facebook.orca.permission.CROSS_PROCESS_BROADCAST_MANAGER, "
    "com.facebook.orca.permission.RECEIVE_ADM_MESSAGE, "
    "com.facebook.orca.provider.ACCESS, "
    "com.facebook.permission.prod.FB_APP_COMMUNICATION, "
    "com.facebook.receiver.permission.ACCESS, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.motorola.launcher3.permission.UNREAD_BADGE, "
    "com.nokia.pushnotifications.permission.RECEIVE, "
    "com.oculus.permission.REPORT_EVENTS, "
    "com.oculus.permission.REPORT_EVENTS_DEBUG, "
    "com.oculus.vrshell.BugReportBroadcastReceiverPermission, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE"
)

LIBRARIES = (
    "com.facebook.messenger (MessengerApplication, neue.MainActivity, "
    "messaging, msys, rtc, Meta AI), "
    "com.facebook (BrowserLite/SecureWebView, analytics, ACRA, Lacrima, "
    "React Native, fresco, pushlite/FCM, businessintegrity/"
    "cloakingdetection, gk/Gatekeeper, MobileConfig, prefs/shared), "
    "com.meta (metaai, wearable/acdc), com.fbpay/payments chromecustomtabs, "
    "androidx (appcompat, browser/customtabs, compose 1.10.6, "
    "credentials, work), "
    "com.google.firebase (messaging, iid, components, encoders), "
    "com.google.android.gms (AdvertisingIdClient, auth, location, maps, "
    "mlkit barcode/text, play billing 7.1.1, integrity, app-update), "
    "Install Referrer, exoplayer2, okhttp3 3.14.9, "
    "kotlin/kotlinx (coroutines, atomicfu), "
    "odins (lid_odin_android, ner_odin_android, psi_odin_android, "
    "messenger_psi_odin_model_checker_android), "
    "libraries/foa/fxcache, fx, xplat, obfuscated X/, redex, secondary"
)

SHARED_PREFS = (
    "FbSharedPreferences / LightSharedPreferences / "
    "MessengerLightSharedPreferencesCache (настройки Messenger, сессии); "
    "msys-auth-data (авторизация Messaging); "
    "FacebookApplication / crash_loop_critical_data / lacrima "
    "(отчёты о сбоях, токен при crash-loop); "
    "com.google.android.gms.appid / token_registration_prefs / "
    "token_ack_prefs (push FCM/ADM); "
    "fb_tixu_deferred_deeplink (отложенные deeplink); "
    "MetaAINuxImpressionCache / MetaAIVoiceSessionImpressionCache "
    "(подсказки Meta AI); "
    "acdc-shared-pref (носимые устройства); "
    "LockBoxStorageManager / AUTO_BACKUP_AGENT_METADATA "
    "(резервные копии); "
    "act_dns_cache / playcore_split_install_internal / "
    "asset_metadata_sharedpref_key / terminate_handler_flags_store; "
    "com.facebook.react.modules.i18nmanager.I18nUtil (RTL); "
    "ключей offer_url / cloak / gate для схемы «оффер vs белое приложение» нет"
)

SUSPICIOUS_WORDS = (
    "cloak, cloaking, CloakingDetection, click_id, clickid, postback, "
    "is_bot, offer, landing, landing_url, redirect, gatekeeper, "
    "webview, bot, blacklist, whitelist"
)

SDK_ROWS = [
    (
        "Название приложения",
        "Messenger (com.facebook.orca), "
        "versionName 572.0.0.41.89 (versionCode 344411486), "
        "разработчик Meta Platforms, Inc",
    ),
    ("Android Gradle Plugin", "нет"),
    ("minSdk", "28"),
    ("targetSdk", "36"),
    ("Kotlin", "да + 2.1.0"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", "нет"),
    (
        "Аналитика",
        "Firebase Cloud Messaging / Firebase IID, "
        "Google Advertising ID (AdvertisingIdClient), "
        "Google Play Install Referrer, "
        "Play Services Analytics, "
        "собственная аналитика Messenger/Meta "
        "(AnalyticsLogger, Analytics2, QPL), "
        "Meta Lacrima / ACRA (сбои), "
        "Meta Gatekeeper / MobileConfig (удалённые флаги функций)",
    ),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def build():
    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=12 * mm,
        bottomMargin=12 * mm,
        title="Messenger — APK analysis",
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(
        kv_table(
            SDK_ROWS,
            header=("Параметр", "Значение"),
        )
    )
    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
