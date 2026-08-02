#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Google Authenticator (Google LLC)."""

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
    "android.permission.CAMERA, "
    "android.permission.WAKE_LOCK, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.INTERNET, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "android.permission.GET_PACKAGE_SIZE, "
    "com.google.android.apps.authenticator2.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Google Clearcut, Google Primes (производительность/сбои), "
    "Google Usage Reporting, Google Phenotype (удалённые флаги), "
    "Google Data Transport / CCT; Firebase Components только как "
    "инфраструктура ML Kit (не Firebase Analytics)"
)

LIBRARIES = (
    "com.google.android.apps.authenticator2, "
    "com.google.apps.tiktok, "
    "com.google.android.libraries.phenotype, "
    "com.google.android.libraries.performance.primes, "
    "com.google.android.libraries.onegoogle, "
    "com.google.android.libraries.androidatgoogle.privacy, "
    "com.google.android.libraries.directboot, "
    "com.google.android.libraries.material, "
    "com.google.android.libraries.social.licenses, "
    "com.google.android.material, "
    "com.google.android.gms (auth, common, feedback, googlehelp, "
    "people, net/Cronet, dynamite), "
    "com.google.mlkit (barcode / codescanner), "
    "com.google.firebase.components, "
    "com.google.android.datatransport, "
    "com.google.protobuf, "
    "com.bumptech.glide, "
    "org.chromium.net (Cronet 151.0.7922.29), "
    "io.grpc / gRPC Java + gRPC for Kotlin, "
    "Dagger, Guava, Gson, Tink, ZXing, "
    "Kotlin / kotlinx.coroutines / kotlinx.serialization / "
    "kotlinx_atomicfu, "
    "androidx (appcompat, browser, biometric, constraintlayout, "
    "coordinatorlayout, core, drawerlayout, fragment, lifecycle, "
    "preference, room, swiperefreshlayout, viewpager2, window, work), "
    "j$ desugar, RxJava2"
)

SHARED_PREFS = (
    "com.google.android.apps.authenticator2_preferences "
    "(настройки Privacy Screen / screen lock через androidx.preference); "
    "accounts (аккаунты One Google); "
    "PhenotypeStickyAccount (привязка аккаунта к Phenotype); "
    "com.google.android.gms.signin; "
    "com.google.mlkit.internal; "
    "primes / primes.battery.snapshot / primes.packageMetric.lastSendTime "
    "(метрик Primes); "
    "androidx.work.util.preferences и androidx.work.util.id; "
    "ANIMATABLE_LOGO_VIEW_FILE_KEY; "
    "OTP-секреты в Room (otp_table), не в SharedPreferences; "
    "ключей offer_url / cloak / gate нет"
)

SUSPICIOUS_WORDS = "нет"

DOMAIN_NOTES = {
    "config.ru": (
        "Это не сетевой адрес из кода приложения, а имя языкового сплита "
        "Android App Bundle: в apk/ лежит config.ru.apk, а в "
        "res/xml/splits0.xml указано split=\"config.ru\" (ресурсы на "
        "русском). Пайплайн проверки доменов принял имя сплита за хост. "
        "В сетевых запросах Google Authenticator этот адрес не "
        "используется: открываются только страницы Google "
        "(support/privacy/terms) через Custom Tabs или внешний браузер. "
        "VirusTotal 0/91; на вид безопасно, к клоаке и офферам не "
        "относится."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    (
        "Название приложения",
        "Google Authenticator (com.google.android.apps.authenticator2), "
        "versionName 7.2 (versionCode 7002011), разработчик Google LLC",
    ),
    ("Android Gradle Plugin", "нет"),
    ("minSdk", "28"),
    ("targetSdk", "37"),
    ("Kotlin", "да"),
    ("Web View", "нет"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    (
        "Подозрительные домены",
        ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет",
    ),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=18 * mm,
        rightMargin=18 * mm,
        topMargin=15 * mm,
        bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Google Authenticator",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Google Authenticator &mdash; Google LLC &mdash; "
            "com.google.android.apps.authenticator2 "
            "(versionName 7.2 / versionCode 7002011)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: com.google.android.apps.authenticator2.xapk, "
            "apk/com.google.android.apps.authenticator2.apk и языковые/"
            "density сплиты (config.*.apk), meta.json, "
            "domain_checks.json / domain_checks.md, "
            "decompiled/resources/AndroidManifest.xml, "
            "res/values/strings.xml и декомпилированные исходники "
            "(com.google.android.apps.authenticator2, "
            "com.google.apps.tiktok, com.google.android.libraries.*, "
            "com.google.mlkit, androidx, org.chromium.net, defpackage и "
            "др.). Сборка через Bazel (не AGP). Точка входа: "
            "Authenticator_Application → MainActivity (список OTP / "
            "добавление кодов). Тихой серверной развилки "
            "«оффер vs белое приложение» нет.",
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

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(
            Paragraph(
                "Данные ниже взяты как есть из готовых проверок пайплайна "
                "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
                "полный список Security vendors' analysis и три "
                "дополнительных пункта в конце.",
                SMALL,
            )
        )

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(
                kv_table(
                    rows,
                    widths=(62 * mm, 108 * mm),
                    header=("Параметр / движок", "Значение / вердикт"),
                )
            )
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
