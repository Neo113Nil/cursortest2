#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Melbet (Ztot Games Studio)."""

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
    KeepTogether,
    PageBreak,
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
BULLET = ParagraphStyle("BULLET", parent=BODY, leftIndent=10, spaceAfter=3.5)
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


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
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
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
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
    "android.permission.INTERNET, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "com.android.vending.BILLING, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.WAKE_LOCK, "
    "android.permission.FOREGROUND_SERVICE, "
    "com.adventuretime.superstorm.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = (
    "AdMob / Google Mobile Ads (баннер, interstitial, rewarded; adapter "
    "com.buildbox.adapter.admob), Google User Messaging Platform / consent "
    "(com.google.android.ump); в списке согласия BuildBox также указан "
    "Vungle (adbox-vungle), отдельного SDK Vungle в пакете нет"
)

ANALYTICS = (
    "Google Play Services Measurement (measurement-base / measurement-sdk-api "
    "через стек AdMob), Google datatransport / CCT; полноценного Firebase "
    "Analytics / Crashlytics / AppsFlyer / Adjust / OneSignal в коде "
    "приложения нет"
)

LIBRARIES = (
    "androidx.appcompat 1.7.0, androidx.activity 1.10.1 (+ktx), "
    "androidx.fragment (+ktx), androidx.core 1.13.1 (+ktx, viewtree), "
    "androidx.browser 1.4.0 (Custom Tabs), androidx.webkit 1.12.1, "
    "androidx.constraintlayout, androidx.coordinatorlayout, "
    "androidx.swiperefreshlayout 1.1.0, androidx.recyclerview, "
    "androidx.preference, androidx.lifecycle, androidx.room, androidx.sqlite, "
    "androidx.work 2.7.0, androidx.startup, androidx.emoji2, "
    "androidx.multidex, androidx.profileinstaller, androidx.window, "
    "androidx.privacysandbox.ads, "
    "Kotlin 1.9.0 + kotlinx-coroutines 1.7.3, "
    "OkHttp + Okio + Retrofit2 (в зависимостях; клоака их не вызывает), "
    "Dagger (annotations), Gson, "
    "Google Play Services (ads 23.3.0, ads-identifier, appset, auth, base, "
    "basement, fido, games, location, measurement, tasks, drive stubs), "
    "Google Play Billing 7.0.0, Google UMP, "
    "Firebase encoders (stubs; без полного Analytics SDK), "
    "BuildBox (com.buildbox.* / bb_version 2.24.3, AdIntegratorManager, "
    "consent), SecretHQ (com.secrethq.store / utils), "
    "Cocos2d-x (org.cocos2dx.lib), nineoldandroids"
)

SHARED_PREFS = (
    "h8w3_k4memo — флаг stop_gate (пропустить «ворота» и сразу открыть "
    "обычное приложение); "
    "PreferenceManager default — ключи согласия рекламных сетей "
    "(admob_CONSENT_KEY, adbox-vungle_CONSENT_KEY); "
    "локальные preferences PTPlayer — GooglePlayServiceSignInError"
)

SUSPICIOUS_WORDS = (
    "stop_gate, gate, landsadvpiratesss.biz/runtime, loadUrl, WebView, "
    "pp-decline-cta, k4-n5v8cz://close, Apostala, Melbet, "
    "location.replace / redirect, native_return, h8w3_k4memo, q7m2k_p4x.html"
)

SUSPICIOUS_DOMAINS = [
    "landsadvpiratesss.biz",
    "config.ru",
    "sdks.api.8cell.com",
    "winimage.com",
]

MAIN_ROWS = [
    ("Название приложения", "Melbet"),
    ("Android Gradle Plugin", "8.5.2"),
    ("minSdk", "21"),
    ("targetSdk", "35"),
    ("Kotlin", "да (Kotlin 1.9.0 + kotlinx-coroutines 1.7.3)"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "да"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

DATA_ITEMS = [
    (
        "строка «как представился браузер»",
        "стандартная подпись встроенного окна сайта (User-Agent): модель "
        "телефона, версия Android и версия движка страниц; уходит сама при "
        "открытии внешнего адреса, без отдельного поля в коде приложения",
    ),
    (
        "язык телефона",
        "язык и регион из настроек телефона уходят в заголовке "
        "Accept-Language при загрузке страницы «ворот»; по нему удалённый "
        "сайт часто решает, что показать",
    ),
    (
        "файлы cookie",
        "приложение явно включает приём cookie, в том числе сторонних; "
        "сайт «ворот» может сохранить и потом узнать это же устройство",
    ),
    (
        "интернет-адрес устройства",
        "сервер сам видит IP телефона при запросе; по нему часто определяют "
        "страну и отсекают проверки магазина",
    ),
    (
        "адрес открытой страницы",
        "зашитый путь /runtime на домене landsadvpiratesss.biz — это вход "
        "на проверку «что показать этому человеку»",
    ),
]

HOW_COLLECTED = (
    "Сразу при открытии запускается главный экран PTPlayer. Он смотрит в "
    "памяти приложения файл настроек h8w3_k4memo: если флага stop_gate ещё "
    "нет, программа не показывает обычную игру, а сразу переключает человека "
    "на скрытый экран PlumeCanvasActivity и закрывает себя."
    "<br/><br/>"
    "На этом экране создаётся встроенное окно сайта. В него грузится "
    "локальная страница q7m2k_p4x.html (заставка «Loading»). Примерно через "
    "полсекунды страница сама, без нажатий, переводит окно на "
    "https://landsadvpiratesss.biz/runtime."
    "<br/><br/>"
    "Отдельного сбора рекламного номера, имени пакета или модели в виде "
    "списка полей приложение на телефонe не делает: сведения уходят так, "
    "как обычно уходит любой запрос страницы (подпись браузера, язык, "
    "cookie, IP). Человек этого не видит — на экране только кольцо "
    "загрузки, окон с разрешением нет."
)

WHERE_SENT = (
    "Тихий переход ведёт на точный адрес "
    "https://landsadvpiratesss.biz/runtime. Адрес зашит целиком в локальном "
    "файле q7m2k_p4x.html внутри приложения; запасных «ворот» в коде не "
    "видно."
    "<br/><br/>"
    "Это не показ рекламного блока сети на экране игры, а проверка и "
    "дальнейшая выдача страницы внутри того же встроенного окна сайта. "
    "Результат «пропустить ворота навсегда» хранится локально: ключ "
    "stop_gate в файле настроек h8w3_k4memo."
    "<br/><br/>"
    "Отдельно, уже не как клоака, BuildBox может сходить на "
    "https://sdks.api.8cell.com/zones/network_priority.json — это приоритет "
    "рекламных сетей движка, а не решение «оффер или белая версия»."
)

HOW_FILTERED = (
    "В коде телефона нет жёсткого списка стран, языков или «ботов», по "
    "которому сами решают «этому человеку оффер». Приложение лишь открывает "
    "страницу «ворот» и передаёт то, что обычно видно серверу по запросу "
    "страницы: язык, подпись браузера, cookie, IP."
    "<br/><br/>"
    "Само решение «кому показать рекламную/букмекерскую страницу, а кому "
    "кнопку отказа и обычное приложение» делает удалённый сайт "
    "landsadvpiratesss.biz. В приложении видно только развилку после ответа "
    "сайта: либо остаётся содержимое во встроенном окне, либо срабатывает "
    "служебная ссылка закрытия."
    "<br/><br/>"
    "Если человек однажды «закрыл» ворота через кнопку отказа, флаг "
    "stop_gate запоминается на телефоне — при следующих запусках проверка "
    "больше не показывается, сразу идёт обычное приложение."
)

WHAT_RETURNS = (
    "С https://landsadvpiratesss.biz/runtime приходит обычная веб-страница "
    "(не отдельный список полей вроде url=… в коде телефона). Приложение "
    "не разбирает ответ как набор служебных ключей: оно просто показывает "
    "то, что отдал сайт, во встроенном окне."
    "<br/><br/>"
    "«Боевой» вариант схемы — сайт отдаёт целевую страницу (лендинг / "
    "оффер), и человек остаётся внутри этого окна с панелью назад/вперёд. "
    "«Белый» для схемы вариант — на странице появляется элемент с id "
    "pp-decline-cta (кнопка отказа). Встроенный скрипт приложения вешает на "
    "неё переход по служебной схеме k4-n5v8cz://close."
    "<br/><br/>"
    "Когда такая ссылка срабатывает, приложение записывает stop_gate = true "
    "и перезапускает себя уже в обычном режиме. Если кнопки отказа нет и "
    "закрытие не вызвали — человек продолжает видеть страницу с сервера."
)

HOW_SHOWN = (
    "Если «ворота» решили показать оффер — страница остаётся внутри "
    "приложения во встроенном окне сайта (PlumeCanvasActivity): тёмный фон, "
    "кнопки назад/вперёд, поддержка всплывающих окон и загрузок. Внешний "
    "системный браузер для этой схемы не обязателен. По смыслу это не "
    "баннер AdMob, а целевая внешняя страница после проверки (в магазине "
    "приложение связано с Melbet / «winning adventure»)."
    "<br/><br/>"
    "Если сработала служебная ссылка закрытия (кнопка отказа на странице) "
    "— флаг stop_gate сохраняется, экран «ворот» закрывается, и человеку "
    "просто остаётся обычное приложение (игра на Cocos2d-x / BuildBox с "
    "обычной рекламой сетей). Подробности самой игры здесь не важны."
    "<br/><br/>"
    "При следующих запусках, пока stop_gate уже стоит, скрытый экран с "
    "сайтом больше не открывают: сразу идёт обычный путь приложения "
    "(согласие на рекламу при необходимости и дальше белый режим)."
)


def domain_rows_from_check(entry):
    rows = []
    for item in entry.get("table_rows") or []:
        rows.append((item.get("param", ""), item.get("value", "")))
    if rows:
        return rows
    vt = entry.get("virustotal") or {}
    rows = [
        ("Домен", entry.get("domain", "")),
        ("VirusTotal URL", vt.get("vt_url", "")),
        ("Детекции", vt.get("detections", "")),
        ("Security vendors' analysis", "ниже построчно, как на VirusTotal"),
    ]
    for name, verdict in vt.get("vendor_rows") or []:
        rows.append((name, verdict))
    rows.append(("Куда редиректит", entry.get("redirects_to", "нет")))
    rows.append(("Что выводит (кратко)", entry.get("page_output", "нет")))
    rows.append(("Где припаркован", entry.get("parked_at", "нет")))
    return rows


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
        title="Отчёт по анализу APK — Melbet",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Melbet &mdash; Ztot Games Studio &mdash; "
            "com.adventuretime.superstorm "
            "(на экране/в ресурсах: Apostala, версия 1.4.10)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: xapk и сплиты apk/, meta.json, domain_checks, "
            "AndroidManifest.xml, strings.xml, assets/q7m2k_p4x.html и "
            "decompiled/sources (PTPlayer, PlumeCanvasActivity, BuildBox "
            "AdIntegratorManager / consent, Cocos2d-x, AdMob).",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(PageBreak())
    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(
        Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
            "полный список Security vendors' analysis и три дополнительных "
            "пункта в конце.",
            SMALL,
        )
    )

    for domain in SUSPICIOUS_DOMAINS:
        entry = by_domain.get(domain)
        if not entry:
            continue
        block = [
            Paragraph("Проверка домена: %s" % esc(domain), H2),
            kv_table(
                domain_rows_from_check(entry),
                widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт"),
            ),
            Spacer(1, 4 * mm),
        ]
        story.append(KeepTogether(block))

    story.append(PageBreak())
    story.append(Paragraph("Какие данные собираются", H2))
    for title, desc in DATA_ITEMS:
        story.append(
            Paragraph("• %s → %s" % (esc(title), esc(desc)), BULLET)
        )

    story.append(Paragraph("Как собираются", H2))
    story.append(Paragraph(HOW_COLLECTED, BODY))

    story.append(Paragraph("Куда отправляются", H2))
    story.append(Paragraph(WHERE_SENT, BODY))

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(Paragraph(HOW_FILTERED, BODY))

    story.append(Paragraph("Что возвращается", H2))
    story.append(Paragraph(WHAT_RETURNS, BODY))

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(Paragraph(HOW_SHOWN, BODY))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
