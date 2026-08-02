#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Instagram (com.instagram.android)."""

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
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_LOCAL_NETWORK, "
    "android.permission.ACCESS_MEDIA_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.ANSWER_PHONE_CALLS, "
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
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_CAMERA, "
    "android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_LOCATION, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.FOREGROUND_SERVICE_PHONE_CALL, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_ACCOUNTS, "
    "android.permission.MANAGE_OWN_CALLS, "
    "android.permission.MEDIA_PROJECTION, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.NEARBY_WIFI_DEVICES, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_BASIC_PHONE_STATE, "
    "android.permission.READ_CALL_LOG, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_MEDIA_VISUAL_USER_SELECTED, "
    "android.permission.READ_PHONE_NUMBERS, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.READ_PROFILE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.UPDATE_APP_BADGE, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_CREDENTIALS, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_CALENDAR, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.amazon.device.messaging.permission.RECEIVE, "
    "com.android.launcher.permission.INSTALL_SHORTCUT, "
    "com.android.launcher.permission.UNINSTALL_SHORTCUT, "
    "com.android.systemui.permission.ACCESS_AFFORDANCE, "
    "com.android.vending.BILLING, "
    "com.facebook.katana.provider.ACCESS, "
    "com.facebook.services.identity.FEO2, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.instagram.android.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.instagram.android.permission.CROSS_PROCESS_BROADCAST_MANAGER, "
    "com.instagram.android.permission.RECEIVE_ADM_MESSAGE, "
    "com.instagram.direct.permission.DIRECT_APP_THREAD_STORE_SERVICE, "
    "com.instagram.direct.permission.PROTECTED_DEEPLINKING, "
    "com.motorola.launcher3.permission.UNREAD_BADGE, "
    "com.samsung.android.app.smartcapture.permission.PENDING_UPDATE, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE"
)

LIBRARIES = (
    "com.instagram (InstagramAppShell, MainTabActivity, analytics, "
    "inappbrowser, fxcal, bloks, camera, direct, react), "
    "com.facebook (BrowserLite, ACRA, Lacrima, analytics, React Native, "
    "fresco, pushlite/FCM, cloakingdetection), "
    "com.meta, com.fbpay/facebookpay, com.oculus, com.whatsapp, "
    "androidx (appcompat, browser/customtabs, camera, compose 1.11.2, "
    "credentials, media3, room, work), "
    "com.google.firebase (messaging, components), "
    "com.google.android.gms (AdvertisingIdClient), "
    "Install Referrer, mlkit, gson, protobuf, "
    "exoplayer2, okhttp3, org.webrtc, org.pytorch, org.chromium, "
    "ca.psiphon, acamera, libraries/foa/fxcache, fx, fb, go, meta, "
    "Kotlin 2.1.0 / kotlinx, obfuscated X/"
)

SHARED_PREFS = (
    "LoginPreferences / UserPreferences (токен входа, UserId, IsEmployee); "
    "analyticsprefs (собственная аналитика Instagram); "
    "com.google.firebase.messaging / com.google.firebase.fcm / "
    "token_registration_prefs / token_ack_prefs (push FCM/ADM); "
    "msys-auth-data / CID_STORAGE (сессии Messaging); "
    "lacrima / acra_criticaldata_store (отчёты о сбоях); "
    "EncryptedSharedPreferences / __androidx_security_crypto_encrypted_prefs; "
    "DevicePreferences / AuthenticationPreferences / AdPreferences; "
    "tixu_deferred_deeplink / basel_context_storage / stash; "
    "NOTIFICATION_CHANNELS / asset_preferences / SavedEffectPreferences; "
    "ig_bug_report_frequency_tracker / ig_ai_apps_detector_prefs; "
    "playcore_split_install_internal / act_dns_cache; "
    "ключей offer_url / cloak / gate для схемы «оффер vs белое приложение» нет"
)

SUSPICIOUS_WORDS = (
    "cloak, cloaking, blacklist, whitelist, is_bot, gambling, casino, "
    "betting, slots, poker, roulette, clickid, click_id, affiliate, "
    "payout, deposit, withdraw, postback, offer_url, landing, redirect, "
    "bot, webview"
)

SDK_ROWS = [
    (
        "Название приложения",
        "Instagram (com.instagram.android), "
        "versionName 440.1.0.46.86 (versionCode 384611456), "
        "разработчик Instagram / Meta",
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
        "Firebase Cloud Messaging, Firebase Installations, "
        "Google Advertising ID (AdvertisingIdClient), "
        "Google Play Install Referrer, "
        "собственная аналитика Instagram/Meta "
        "(com.instagram.analytics, analyticsprefs), "
        "Meta Lacrima / ACRA (сбои)",
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
        title="Instagram — APK analysis",
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
