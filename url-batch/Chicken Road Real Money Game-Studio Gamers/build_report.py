#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Chicken Road Real Money Game (Studio Gamers)."""

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
        ("Название приложения", "Chicken Road Real Money Game"),
        ("Android Gradle Plugin", "7.4.2"),
        ("minSdk", "22"),
        ("targetSdk", "35"),
        ("Kotlin", "нет"),
        ("Web View", "нет"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "Unity Analytics"),
        ("Permissions", "android.permission.INTERNET"),
        (
            "Libraries",
            "Unity 2022.3 (IL2CPP), UnityEngine.*, Unity.TextMeshPro, Unity.Timeline, "
            "Unity.AI.Navigation, FMOD, Google Android Game SDK, bitter.jnibridge",
        ),
        ("Подозрительные домены", "66.45.240.107, curl.se"),
        (
            "SharedPreferences",
            "Unity PlayerPrefs: настройки игры, флаги покупок/оценки/рекламы, баланс валюты (SavePrefs)",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "analytic, PushInfo, OpenURL, OpenStore, onLink2Store, androidPackageID, redirect",
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
        "адрес проверки на сервере → вшитая ссылка http://66.45.240.107/games/sudoku_analytic.txt; "
        "по ней приложение тихо спрашивает у удалённого файла, что делать дальше с этим человеком",
        "подпись программы в сети (User-Agent движка Unity) → служебная строка, которой телефон "
        "представляется сайту при обычном запросе; отдельных полей вроде языка или рекламного "
        "номера в ссылку не дописывают",
        "сетевой адрес телефона (IP) → сервер видит его сам по факту подключения; в коде телефона "
        "его отдельно не собирают и не кладут в параметры ссылки",
        "запасной адрес магазина приложений → вшитая ссылка на другую программу "
        "(пакет huhyhz-gb-2312ii в Google Play); её могут открыть как внешний переход вместо "
        "обычного приложения",
        "техническое имя пакета этой программы → используется в настройках магазина "
        "(androidPackageID) вместе с открытием страницы в магазине",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу после запуска, когда поднимается игровой контроллер GameMaster, "
                "приложение само запускает фоновую процедуру PushInfo. Человека об этом "
                "не спрашивают: отдельного окна с разрешением нет, на экране может идти "
                "обычная заставка Unity."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Процедура создаёт обычный сетевой запрос движка Unity (поле www в коде) "
                "к заранее зашитому адресу файла sudoku_analytic.txt. Из настроек телефона "
                "язык, модель и рекламный номер в этот запрос специально не подставляют — "
                "в ссылке нет дополнительных параметров."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Параллельно в ресурсах лежит готовая ссылка на страницу другой программы "
                "в Google Play и поле имени пакета для перехода в магазин (OpenStore / "
                "onLink2Store). Это тоже читается изнутри приложения, без участия человека."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Тихий запрос уходит на адрес http://66.45.240.107/games/sudoku_analytic.txt. "
                "Это не показ баннера на экране, а проверка «что показать этому человеку». "
                "Запасного хоста для той же проверки в коде не видно: рабочий адрес один, "
                "зашит целиком, из кусков его не собирают."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Отдельно в приложении хранится ссылка на магазин Google Play с чужим "
                "именем пакета huhyhz-gb-2312ii. Её открывают уже как переход наружу "
                "(через OpenURL / OpenStore), а не как повторный запрос на 66.45.240.107."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "На момент разбора сервер 66.45.240.107 не отдаёт содержимое файла "
                "(соединение обрывается по таймауту), но адрес и логика запроса в "
                "приложении остаются."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "В самом приложении нет жёсткого списка стран, языков или «белых» "
                "устройств. На проверку уходит простой запрос к удалённому текстовому "
                "файлу; сервер при этом сам видит сетевой адрес телефона и служебную "
                "подпись запроса."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Решение «кому показать внешнюю ссылку, а кому оставить обычное "
                "приложение» делает сторона сервера по ответу файла sudoku_analytic.txt. "
                "В коде телефона видно только: сходить на адрес, прочитать ответ, и если "
                "там есть пригодная ссылка — открыть её."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Точных правил вроде «какие страны запрещены» или «какой запрос считается "
                "ботом» внутри приложения нет — их держит сервер на 66.45.240.107."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "Ожидается обычный текстовый ответ с удалённого файла. Если в ответе "
                "есть ссылка (или иной пригодный адрес), приложение считает сценарий "
                "«боевым» и готовит переход наружу через OpenURL."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если ответа нет, он пустой или ссылку взять нельзя, программа идёт по "
                "«белому» пути: человеку остаётся обычное приложение. Отдельных слов "
                "«можно/нельзя» в коде не читают — развилка завязана на содержимое "
                "ответа и наличие внешней ссылки."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Сейчас живой сервер не отдаёт файл (таймаут), поэтому в реальном "
                "прогоне ссылка, скорее всего, не появится. Но цепочка в коде именно "
                "такая: запрос → текст ответа → OpenURL или обычный режим."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если после проверки есть рабочая ссылка, программа открывает её во "
                "внешнем браузере или магазине приложений телефона через OpenURL / "
                "OpenStore (в том числе может увести на страницу другого пакета "
                "huhyhz-gb-2312ii в Google Play). Встроенного окна сайта внутри "
                "приложения для этого перехода нет."
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
