#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Chicken road game (Sakura Institute)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle(
    "H1", fontName="DJ-B", fontSize=16, leading=20,
    spaceAfter=8, textColor=colors.HexColor("#12263f"),
)
H2 = ParagraphStyle(
    "H2", fontName="DJ-B", fontSize=12.5, leading=16,
    spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"),
)
BODY = ParagraphStyle(
    "BODY", fontName="DJ", fontSize=9.3, leading=13.4,
    alignment=TA_LEFT, spaceAfter=5,
)
BULLET = ParagraphStyle(
    "BULLET", fontName="DJ", fontSize=9.3, leading=13.4,
    alignment=TA_LEFT, spaceAfter=3, leftIndent=9, firstLineIndent=-9,
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


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
        ])
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
    "android.permission.ACCESS_NETWORK_STATE, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.CAMERA, "
    "android.permission.POST_NOTIFICATIONS, "
    "com.chicken.road.cerman.fixs.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.android.vending.CHECK_LICENSE"
)

LIBRARIES = (
    "androidx.compose (Material3 1.3.0 / Compose UI 1.7.2), "
    "androidx.room 2.6.1, androidx.datastore 1.1.1, androidx.navigation 2.8.0, "
    "androidx.lifecycle 2.8.7, androidx.core 1.13.1, androidx.activity 1.9.2, "
    "androidx.core.splashscreen 1.0.1, androidx.fragment 1.8.5, androidx.startup, "
    "androidx.emoji2, okhttp3, okio, kotlinx.coroutines 1.9.0, kotlinx.serialization, "
    "Firebase Database, Firebase Common, AppsFlyer 6.14.0, "
    "play-services-ads-identifier 18.1.0, play-services-base/basement/tasks, "
    "installreferrer, pairip licensecheck, native roostio"
)

SUSPICIOUS_WORDS = (
    "checkUrl, active, consent, gaid, deviceUuid, install_referrer, appsId, "
    "referrer, uniwebview, bridge, User-Agent, tidyAgent, cleanUserAgent, "
    "RoostGate, RoostReply, RoostConfig, roostio, extra_url, extra_consent, "
    "Privacy Policy, loadUrl, offer url, time"
)

SDK_ROWS = [
    ("Название приложения", "Chicken road game"),
    ("Android Gradle Plugin", "8.5.2"),
    ("minSdk", "26"),
    ("targetSdk", "35"),
    ("Kotlin", "да 2.0.21"),
    ("Web View", "да"),
    ("Custom Tabs", "нет"),
    ("Рекламные сети", "нет"),
    (
        "Аналитика",
        "AppsFlyer, Firebase Realtime Database, Google Play Install Referrer",
    ),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", "config.ru"),
    (
        "SharedPreferences",
        "DataStore Preferences app_state: сохраняет url страницы оффера, "
        "метку времени ответа и флаг согласия (consent/agreed)",
    ),
    ("Есть ли клоака", "да"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

COLLECTED = [
    "• рекламный номер устройства → служебный номер телефона для рекламы; "
    "по нему сервер отличает одно устройство от другого",
    "• свой номер устройства → постоянный код, который приложение собирает "
    "из системного идентификатора телефона и технического имени программы",
    "• источник установки → откуда поставили приложение (метка из магазина "
    "Google Play / рекламной ссылки)",
    "• номер учёта установок AppsFlyer → служебный номер учёта установок; "
    "уходит в проверку, если его удалось получить",
    "• строка «как представился браузер» → текст, которым телефон обычно "
    "представляется сайтам; перед отправкой приложение подчищает пометку "
    "встроенного окна сайта",
    "• техническое имя приложения → имя этой программы в системе; участвует "
    "в расчёте своего номера устройства",
    "• системный идентификатор телефона → внутренний код устройства Android; "
    "сам по себе в запрос не кладётся, но из него делают свой номер устройства",
    "• адрес проверки с сервера настроек → ссылка проверки (checkUrl), "
    "которую приложение заранее читает из облачной базы Firebase",
    "• флаг включения схемы → признак active из облачных настроек: включена "
    "ли сейчас проверка «кому что показать»",
    "• ключ учёта установок → строка title из облачных настроек; ею тихо "
    "запускают AppsFlyer, если она не пустая",
]


def load_domain_rows():
    with open(CHECKS, "r", encoding="utf-8") as f:
        data = json.load(f)
    out = []
    for item in data.get("checked") or []:
        domain = item.get("domain") or ""
        rows = []
        for r in item.get("table_rows") or []:
            rows.append((r.get("param") or "", r.get("value") or ""))
        if not rows:
            vt = item.get("virustotal") or {}
            rows.append(("Домен", domain))
            rows.append(("VirusTotal URL", vt.get("vt_url") or ""))
            rows.append(("Детекции", vt.get("detections") or ""))
            rows.append(
                ("Security vendors' analysis", "ниже построчно, как на VirusTotal")
            )
            for eng, verd in vt.get("vendor_rows") or []:
                rows.append((eng, verd))
            rows.append(("Куда редиректит", item.get("redirects_to") or "нет"))
            rows.append(("Что выводит (кратко)", item.get("page_output") or ""))
            rows.append(("Где припаркован", item.get("parked_at") or "нет"))
        out.append((domain, rows))
    return out


def build():
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(
        kv_table(SDK_ROWS, header=("Параметр", "Значение"))
    )

    for domain, rows in load_domain_rows():
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(
            kv_table(
                rows,
                header=("Параметр / движок", "Значение / вердикт"),
            )
        )

    story.append(Paragraph("Какие данные собираются", H2))
    for line in COLLECTED:
        story.append(Paragraph(esc(line), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(Paragraph(esc(
        "Сразу после открытия, ещё на экране заставки, приложение само "
        "запускает скрытую проверку. Человек ничего специально не нажимает "
        "и отдельного окна с разрешением на эти сведения обычно не видит."
    ), BODY))
    story.append(Paragraph(esc(
        "Сначала приложение читает удалённые настройки из облачной базы "
        "Firebase: включена ли схема, какой адрес проверки использовать и "
        "есть ли ключ учёта установок. Рекламный номер и системный "
        "идентификатор оно берёт из служб Android на телефоне. Из "
        "системного идентификатора и технического имени программы оно "
        "собирает свой постоянный номер устройства."
    ), BODY))
    story.append(Paragraph(esc(
        "Источник установки приложение спрашивает у магазина Google Play. "
        "Строку «как представился браузер» берёт из настроек встроенного "
        "окна сайта и перед отправкой немного подчищает. Если в облачной "
        "настройке есть ключ учёта установок, приложение тихо запускает "
        "AppsFlyer и забирает его номер. Всё это происходит в фоне, пока "
        "на экране крутится заставка."
    ), BODY))

    story.append(Paragraph("Куда отправляются", H2))
    story.append(Paragraph(esc(
        "Сначала настройки схемы приходят из Firebase Realtime Database "
        "проекта chicken-3453 "
        "(адрес базы: https://chicken-3453-default-rtdb.europe-west1."
        "firebasedatabase.app). Имена полей и путь к записи в коде "
        "спрятаны во встроенной библиотеке roostio и читаются по номерам."
    ), BODY))
    story.append(Paragraph(esc(
        "Если схема включена и в настройках есть адрес проверки, сведения "
        "о телефоне незаметно уходят GET-запросом на этот адрес (checkUrl "
        "из облака). Точный адрес проверки в коде не зашит жёстко: его "
        "каждый раз подставляют из удалённой настройки. Запрос идёт тихо "
        "в фоне через обычный сетевой клиент, с заголовком, что ждут ответ "
        "в формате данных, и с подчищенной строкой браузера."
    ), BODY))
    story.append(Paragraph(esc(
        "Если сервер вернул ссылку, приложение сохраняет её и метку времени "
        "в своей памяти (хранилище app_state), чтобы потом снова открыть "
        "ту же страницу без повторной полной проверки."
    ), BODY))

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(Paragraph(esc(
        "На проверку уходят рекламный номер устройства, свой номер "
        "устройства, источник установки, при наличии — номер AppsFlyer, "
        "а также строка браузера в заголовке. Жёсткого списка стран или "
        "языков прямо в приложении нет: оно само не решает «пускать / "
        "не пускать» по таблице на телефоне."
    ), BODY))
    story.append(Paragraph(esc(
        "Решение «кому показать внешнюю страницу, а кому оставить обычное "
        "приложение» делает сервер по ответу на адрес проверки. Если в "
        "облачных настройках схема выключена или адрес проверки пустой, "
        "приложение даже не шлёт запрос и оставляет обычный режим. Если "
        "человек уже подтвердил экран политики конфиденциальности, в памяти "
        "сохраняется флаг согласия — при следующих запусках проверка "
        "может завершиться обычным приложением."
    ), BODY))
    story.append(Paragraph(esc(
        "В приложении видно только отправку признаков и чтение ответа; "
        "само решение «кого пустить» делает сервер."
    ), BODY))

    story.append(Paragraph("Что возвращается", H2))
    story.append(Paragraph(esc(
        "Сервер проверки отвечает данными с двумя полями: ссылка на "
        "страницу и метка времени. Приложение читает именно ссылку: если "
        "она есть и не пустая, считается, что можно показать внешнюю "
        "страницу. Если ответа нет, ссылка пустая или запрос не удался — "
        "приложение считает это «белым» исходом и оставляет обычный режим."
    ), BODY))
    story.append(Paragraph(esc(
        "Перед самой проверкой облачная настройка может вернуть три "
        "вещи: включена ли схема, адрес проверки и ключ учёта установок. "
        "Без включённой схемы и без адреса проверки дальше по «боевому» "
        "пути приложение не идёт. Удачную ссылку и время оно сохраняет "
        "у себя в памяти."
    ), BODY))

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(Paragraph(esc(
        "Если пришла ссылка, главный экран закрывается и открывается "
        "отдельный экран со встроенным окном сайта внутри приложения. "
        "Туда загружают полученный адрес. Если в ссылке есть особая "
        "метка согласия, сверху показывают панель «Privacy Policy» с "
        "кнопкой Accept: после нажатия флаг согласия сохраняется, и "
        "человека возвращают к обычному приложению."
    ), BODY))
    story.append(Paragraph(esc(
        "Если ссылки нет или схема выключена — человеку просто остаётся "
        "обычное приложение, без перехода на внешнюю страницу."
    ), BODY))

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Chicken road game — APK analysis",
        author="APK analyst",
    )
    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
