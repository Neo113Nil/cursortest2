#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK TikTok (TikTok Pte. Ltd)."""

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
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_LOCAL_NETWORK, "
    "android.permission.ACCESS_MEDIA_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_ADVERTISE, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.BLUETOOTH_SCAN, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_CAMERA, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.FOREGROUND_SERVICE_PHONE_CALL, "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_OWN_CALLS, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_AUDIO, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_MEDIA_VISUAL_USER_SELECTED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REORDER_TASKS, "
    "android.permission.SET_WALLPAPER, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.amazon.device.messaging.permission.RECEIVE, "
    "com.android.launcher.permission.READ_SETTINGS, "
    "com.android.vending.BILLING, "
    "com.google.android.apps.aicore.service.BIND_SERVICE, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.oplus.ocs.permission.third, "
    "com.orange.update.permission.READ_ATTRIBUTION, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.tiktok.manager.SYS_START_PERMISSION, "
    "com.tiktok.preload.permission.IDENTIFY, "
    "com.zhiliao.musically.livewallpaper.permission.wallpaperplugin, "
    "com.zhiliaoapp.musically.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.zhiliaoapp.musically.permission.RECEIVE_ADM_MESSAGE"
)

LIBRARIES = (
    "com.ss.android.ugc.aweme (AwemeHostApplication, SplashActivity, "
    "crossplatform/Spark WebView, commercialize/splash ads, landpage, "
    "hybridkit, ecommerce, live, push), "
    "com.bytedance (keva KV-storage, hybrid.spark, adsdk/ugeno, "
    "analytics, geckoX, lynx, livesdk, bdturing), "
    "com.tiktok / com.tiktokshop / com.tokopedia (Shop partner), "
    "com.appsflyer (AppsFlyerLib attribution), "
    "com.facebook (login, custom tabs, fresco/imagepipeline — без Audience Network), "
    "androidx (appcompat 1.7.1, browser/Custom Tabs 1.3.0, webkit 1.7.0, "
    "compose 1.8.3, lifecycle 2.9.4, room 2.4.3, work 2.7.0, "
    "credentials, biometric, navigation, paging, media), "
    "com.google.firebase (analytics 22.0.1, messaging 23.1.1, "
    "installations, components, datatransport), "
    "com.google.android.gms (AdvertisingIdClient, measurement/"
    "AppMeasurement, common), "
    "com.google.gson, com.android.billingclient, "
    "com.android.installreferrer, "
    "okhttp3, io.reactivex, kotlinx-coroutines 1.7.3, kotlin, "
    "com.stripe, com.amazon (ADM), com.heytap.msp.push, "
    "org.apache.http.legacy, obfuscated X/ + short packages"
)

SHARED_PREFS = (
    "Keva / ttKvStorage / SharedPreferencesManager "
    "(основное локальное хранилище настроек ByteDance); "
    "LoginSharePreferences (сессия входа); "
    "cold_boot_prefs / multi_account_prefs; "
    "ads_ucp_prefs / payload_prefs / sdui_prefs "
    "(рекламные и UI-конфиги внутри продукта); "
    "av_storage_cleanup_frequency_control / ecom_photo_search / "
    "__hybrid_local_test__; "
    "com.facebook.internal.preferences.APP_SETTINGS / APP_GATEKEEPERS "
    "(Facebook SDK, не трафик-клоака); "
    "AppsFlyer internal prefs; "
    "Firebase messaging / GMS appid; "
    "androidx.work.util.preferences; "
    "ключей offer_url / cloak / gate для схемы "
    "«оффер vs белое приложение» нет"
)

SUSPICIOUS_WORDS = (
    "cloak (path rootcloak2), blacklist, whitelist, affiliate, "
    "click_id, clickid, pangle_clickid, landing, payout, deposit, "
    "withdraw, postback (af_installpostback), redirect, "
    "is_bot (param feedback chat URL), slots, webview, loadUrl"
)

SDK_ROWS = [
    (
        "Название приложения",
        "TikTok - Videos, Shop & LIVE (com.zhiliaoapp.musically), "
        "versionName 46.3.3 (versionCode 2024603030), "
        "разработчик TikTok Pte. Ltd",
    ),
    ("Android Gradle Plugin", "нет"),
    ("minSdk", "23"),
    ("targetSdk", "36"),
    ("Kotlin", "да + kotlinx.coroutines 1.7.3"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    (
        "Рекламные сети",
        "TikTok Ads / Pangle (собственная рекламная платформа: "
        "ads.tiktok.com, pangle-ads.com, ad-instantpage-sg.tiktokv.com; "
        "SplashAd, AdLandingPageFullScreenActivity, AdWebSparkActivity); "
        "сторонних медиации AdMob / AppLovin / Unity Ads / ironSource нет",
    ),
    (
        "Аналитика",
        "AppsFlyer, Firebase Analytics 22.0.1, "
        "Firebase Cloud Messaging 23.1.1, Firebase Installations, "
        "Google Advertising ID (AdvertisingIdClient), "
        "Google Play Install Referrer, "
        "Google Measurement / AppMeasurement, "
        "собственная аналитика ByteDance/TikTok "
        "(mon.tiktokv.com, mon.isnssdk.com / AppLog)",
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
        title="TikTok — APK analysis",
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
