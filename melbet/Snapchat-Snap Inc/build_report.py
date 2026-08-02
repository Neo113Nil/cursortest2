#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Snapchat (Snap Inc)."""

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
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_BACKGROUND_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_MEDIA_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.AUTHENTICATE_ACCOUNTS, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_ADMIN, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.BLUETOOTH_SCAN, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.DETECT_SCREEN_RECORDING, "
    "android.permission.FLASHLIGHT, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_LOCATION, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.FOREGROUND_SERVICE_PHONE_CALL, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.HIGH_SAMPLING_RATE_SENSORS, "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_OWN_CALLS, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.NEARBY_WIFI_DEVICES, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_APP_BADGE, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_MEDIA_VISUAL_USER_SELECTED, "
    "android.permission.READ_PHONE_NUMBERS, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.READ_PROFILE, "
    "android.permission.READ_SYNC_SETTINGS, "
    "android.permission.READ_SYNC_STATS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.WRITE_SYNC_SETTINGS, "
    "com.amazon.device.messaging.permission.RECEIVE, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.android.vending.BILLING, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.oplus.systemui.permission.LOCKSCREEN_SHORTCUTS, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.snapchat.android.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.snapchat.android.permission.RECEIVE_ADM_MESSAGE, "
    "com.snapchat.android.permission.UPDATE_STICKER_INDEX, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "com.vivo.notification.permission.BADGE_ICON, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE"
)

LIBRARIES = (
    "com.snap / com.snapchat (mushroom app, ads, blizzard analytics, "
    "ad_web_browser, web core, opera, valdi, composer, bitmoji, "
    "camera, maps, identity, shake2report, crash/snapair, cof), "
    "androidx (appcompat, browser/Custom Tabs 1.8.0, webkit 1.14.0, "
    "core, lifecycle, room, work, credentials, biometric, media, "
    "recyclerview, fragment, startup, emoji), "
    "com.google.firebase (messaging, analytics connector, installations, "
    "datatransport, iid), "
    "com.google.android.gms (auth, location, fido, vision, tasks, common, "
    "flags, identitycredentials, dynamite), "
    "com.google.mlkit, com.google.android.material, com.google.gson, "
    "com.google.protobuf, com.android.billingclient 9.0.0, "
    "com.android.installreferrer, "
    "com.facebook (login, core, custom tabs, fresco, shimmer — без Audience Network), "
    "okhttp3, io.reactivex (RxJava3) + rxdogtag2 + rxkotlin 2.2.0, "
    "dagger 2.60, kotlinx-coroutines 1.6.3, kotlin, "
    "com.mapbox (maps SDK), com.bumptech.glide, "
    "com.looksery (lenses SDK), com.shazam (sig/sigx), "
    "com.braintreepayments, com.razorpay, com.cardinalcommerce, "
    "com.addlive, com.amazon (ADM), com.spotify.sdk, "
    "org.webrtc / opencv / joda-time / bouncycastle, "
    "me.leolin (ShortcutBadger)"
)

SHARED_PREFS = (
    "LanguageSettings (language_code — язык интерфейса); "
    "ValdiKeychain (локальное хранилище Valdi); "
    "PickerStartupLoader; MusicSharedPreferences; "
    "LINKFIRE_PREFERENCES; TinselMapping; "
    "MDP_EXO_PLAYER_CACHE_SIZE_PREF (кэш плеера); "
    "com.google.android.gms.appid / com.google.android.gms.signin; "
    "com.google.mlkit.internal; "
    "com.facebook.sdk.attributionTracking / "
    "com.facebook.sdk.appEventPreferences / "
    "com.facebook.internal.preferences.APP_GATEKEEPERS "
    "(Facebook login/SDK, не трафик-клоака); "
    "com.braintreepayments.api.SHARED_PREFERENCES; "
    "rzp_preference_private (Razorpay); "
    "com.cardinalcommerce.cardinalmobilesdkcmsdk; "
    "multidex.version; "
    "ключей offer_url / cloak / gate / stop_gate для схемы "
    "«оффер vs белое приложение» нет"
)

SUSPICIOUS_WORDS = (
    "gambling, blacklist, whitelist, affiliate, payout, offer, "
    "landing, redirect, bot, slots, webview, loadUrl"
)

SDK_ROWS = [
    (
        "Название приложения",
        "Snapchat (com.snapchat.android), "
        "versionName 14.17.0.48 (versionCode 304072), "
        "разработчик Snap Inc",
    ),
    ("Android Gradle Plugin", "нет"),
    ("minSdk", "23"),
    ("targetSdk", "36"),
    ("Kotlin", "да"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    (
        "Рекламные сети",
        "Snap Ads (собственная рекламная платформа Snapchat: "
        "adserver.snapads.com / adsapi.snapchat.com; "
        "модули com.snap.ads, Ad Web Browser); "
        "сторонних медиации AdMob / AppLovin / Unity Ads / ironSource нет",
    ),
    (
        "Аналитика",
        "Blizzard (собственная аналитика Snap → "
        "app-analytics-v2.snapchat.com / app-analytics-dev.snapchat.com), "
        "Firebase Cloud Messaging, Firebase Analytics connector, "
        "Firebase Installations, Google Advertising ID, "
        "Google Play Install Referrer, "
        "SnapAir / Shake2Report (сбои и отчёты), "
        "Facebook SDK attributionTracking (логин/события)",
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
        title="Snapchat — APK analysis",
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
