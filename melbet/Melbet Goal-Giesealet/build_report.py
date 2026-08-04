#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Melbet Goal (Giesealet / com.goalstrikeapp)."""

import os
import re

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
CHECKS_MD = os.path.join(BASE, "domain_checks.md")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16, spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4, alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
BULLET = ParagraphStyle("BULLET", fontName="DJ", fontSize=9.3, leading=13.4, leftIndent=10, spaceAfter=3)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return str(text).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 5),
        ("RIGHTPADDING", (0, 0), (-1, -1), 5),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style += [("BACKGROUND", (0, 0), (-1, 0), HEAD_BG)]
        start = 1
    else:
        start = 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


def parse_domain_checks_md(path):
    text = open(path, encoding="utf-8").read()
    parts = re.split(r"(?m)^## Проверка домена:\s*", text)
    domains = []
    for part in parts[1:]:
        lines = part.strip().splitlines()
        domain = lines[0].strip()
        rows = []
        for line in lines:
            m = re.match(r"^\|\s*(.*?)\s*\|\s*(.*?)\s*\|$", line)
            if not m:
                continue
            k, v = m.group(1).strip(), m.group(2).strip()
            if k.startswith("---") or k in ("Параметр / движок",):
                continue
            rows.append((k, v))
        domains.append((domain, rows))
    return domains


def main():
    sdk_rows = [
        ("Название приложения", "Melbet Goal"),
        ("Android Gradle Plugin", "8.12.0"),
        ("minSdk", "24"),
        ("targetSdk", "36"),
        ("Kotlin", "да, 2.1.20"),
        ("Web View", "да"),
        ("Custom Tabs", "да"),
        ("Рекламные сети", "AdMob"),
        (
            "Аналитика",
            "Google Play Install Referrer, Firebase Encoders (транспорт), Google UMP (consent)",
        ),
        (
            "Permissions",
            "android.permission.INTERNET, com.android.vending.BILLING, "
            "android.permission.WAKE_LOCK, android.permission.ACCESS_NETWORK_STATE, "
            "com.google.android.gms.permission.AD_ID, "
            "android.permission.ACCESS_ADSERVICES_AD_ID, "
            "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
            "android.permission.ACCESS_ADSERVICES_TOPICS, "
            "android.permission.FOREGROUND_SERVICE, "
            "com.goalstrikeapp.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
            "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
            "com.android.vending.CHECK_LICENSE",
        ),
        (
            "Libraries",
            "React Native / Hermes, androidx.*, okhttp3, okio, kotlinx.coroutines, "
            "com.facebook.react/fresco/soloader, com.google.android.gms.ads (AdMob), "
            "io.invertase.googlemobileads, com.android.billingclient, "
            "com.proyecto26.inappbrowser, com.swmansion.rnscreens, "
            "com.th3rdwave.safeareacontext, com.oblador.vectoricons, org.asyncstorage, "
            "com.uerceg.play_install_referrer, com.busfor (Google Pay), "
            "com.pairip.licensecheck, co.touchlab.kermit, bolts, org.greenrobot.eventbus",
        ),
        ("Подозрительные домены", "solid-hub-suite.top"),
        (
            "SharedPreferences",
            "AsyncStorage: hasVisitedBefore (флаг первого запуска), "
            "baseLink (сохранённая ссылка после проверки на сервере)",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "IN_URL, URL_ID, useAg, baseLink, hasVisitedBefore, isFirstVisit, "
            "openLink, resolveUrl, redirect, payment, FootCoins, Melbet, license check",
        ),
    ]

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))

    domain_tables = parse_domain_checks_md(CHECKS_MD)
    for domain, rows in domain_tables:
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(rows, header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "строка «как представился браузер» (User-Agent телефона) → служебная подпись "
        "программы и системы, которой телефон обычно представляется сайтам; по ней "
        "сервер может отличить обычный телефон от подозрительного окружения",
        "идентификатор ссылки на сервере (URL_ID = ah7vWlmY) → вшитый в программу "
        "короткий код оффера/кампании; без него сервер не знает, какую проверку "
        "запускать для этого приложения",
        "флаг первого запуска → помнит ли программа, что человек уже открывал её раньше; "
        "от этого зависит, нужно ли снова идти на проверку",
        "сохранённая ссылка после проверки (baseLink) → адрес, который вернул или "
        "собрал сервер; его потом открывают человеку вместо обычного приложения",
        "источник установки из магазина (install referrer) → откуда поставили программу "
        "(рекламная метка магазина); читается при старте рядом с проверкой",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу после открытия главного экрана программа сама, без отдельного "
                "окна с вопросом, запускает служебную проверку. Она читает из системы "
                "Android строку «как представился браузер» через свой маленький модуль "
                "HttpAgent и смотрит в своей внутренней памяти, был ли уже первый запуск "
                "(ключ hasVisitedBefore). Человек этого обычно не замечает: на экране "
                "может мелькнуть обычная заставка или пустой стартовый кадр, а сбор "
                "идёт в фоне."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Параллельно программа может спросить у магазина Google Play метку "
                "установки. Отдельного разрешения у человека для этой проверки не "
                "спрашивают: нужные права уже прописаны в манифесте приложения."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Код оффера ah7vWlmY и базовый адрес сайта зашиты в программу заранее "
                "(поля IN_URL и URL_ID). Их не берут с телефона — они уже лежат внутри "
                "файла приложения."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Собранная строка «как представился браузер» тихо уходит в интернет на "
                "адрес https://solid-hub-suite.top/ вместе с кодом ah7vWlmY. В запросе "
                "параметр называется useAg — это как раз подпись браузера/системы. "
                "Итоговая ссылка собирается из кусков: базовый адрес сайта + код "
                "оффера + признак «=1» + параметр useAg."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Это не показ рекламного баннера на экране, а фоновая проверка «что "
                "показать этому человеку». Запасных адресов в коде не видно: рабочий "
                "хост один — solid-hub-suite.top. После ответа программа сохраняет "
                "результат у себя в памяти под именем baseLink, чтобы не гонять "
                "проверку каждый раз заново."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "На момент разбора сам сайт отвечает страницей «не найдено» (ошибка "
                "404). То есть сервер проверки сейчас выключен или путь сменился, но "
                "логика отправки в приложении остаётся."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "На проверку уходит прежде всего строка «как представился браузер». "
                "По ней сервер может отсеять эмуляторы, ботов магазина и «неживые» "
                "окружения. В самом приложении жёсткого списка стран или языков нет: "
                "телефон только отправляет признаки."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Дополнительно программа смотрит, первый ли это запуск. Если человек "
                "уже проходил проверку и ссылка сохранена, повторный полный круг может "
                "не понадобиться. Само решение «кому показать внешнюю страницу, а кому "
                "оставить обычное приложение» делает сервер по ответу на запрос, а не "
                "локальный список на телефоне."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "В коде видно только отправку признаков и разбор ответа. Точных правил "
                "«какие страны запрещены» или «какой User-Agent считается ботом» внутри "
                "приложения нет — их держит сторона solid-hub-suite.top."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "После запроса программа ожидает данные, из которых получается рабочая "
                "внешняя ссылка. Эту ссылку она кладёт в память как baseLink. Если "
                "ссылка появилась и выглядит пригодной, приложение считает сценарий "
                "«боевым»: человеку нужно показать внешнюю страницу."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если ответа нет, он пустой или ссылку собрать нельзя, программа идёт "
                "по «белому» пути: флаг первого визита закрывается, а человеку "
                "остаётся обычное приложение. Отдельных слов вроде «можно/нельзя» в "
                "коде не читают — развилка завязана на наличие сохранённой ссылки."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Сейчас живой сервер отдаёт 404, поэтому в реальном прогоне ссылка, "
                "скорее всего, не появится. Но цепочка в коде именно такая: ответ → "
                "baseLink → решение экрана."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если после проверки есть рабочая ссылка, программа открывает её во "
                "встроенной вкладке браузера телефона (Custom Tabs через модуль "
                "InAppBrowser) — это не отдельное окно сайта внутри игры, а почти "
                "полноценный браузер поверх приложения. По смыслу это целевая "
                "внешняя страница (букмекерский/рекламный лендинг под брендом Melbet), "
                "а не обычный рекламный баннер сети."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если ссылки нет или проверка не дала адрес, человеку просто показывают "
                "обычное приложение. Про белую игру дальше ничего расписывать не нужно: "
                "остаётся штатный экран приложения без перехода на внешний оффер."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
