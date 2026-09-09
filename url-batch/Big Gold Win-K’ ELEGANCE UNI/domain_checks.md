# Проверка подозрительных доменов

Кастомный хост first-party кода: `quantixmatrix.digital` (гейт `https://quantixmatrix.digital/`).

В пайплайне VirusTotal для этого хоста нет. Ниже — домены из готовой проверки пайплайна; это SDK / ложные срабатывания, в таблицу «Подозрительные домены» не входят.

- app.adjust.io — Adjust SDK
- gdpr.adjust.io — Adjust SDK
- ssrv.adjust.io — Adjust SDK
- subscription.adjust.io — Adjust SDK
- config.ru — сплит языка AAB, не хост приложения

## Проверка домена: quantixmatrix.digital

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | quantixmatrix.digital |
| VirusTotal URL | https://www.virustotal.com/gui/domain/quantixmatrix.digital |
| Детекции | нет |
| Куда редиректит | нет (без редиректа); https://quantixmatrix.digital/ отвечает 403 Cloudflare, https://www.quantixmatrix.digital/ — 200 без цепочки редиректов |
| Что выводит (кратко) | title: Welcome to nginx. Стандартная заглушка nginx («If you see this page, the nginx web server is successfully installed and working. Further configuration is required.»). Тело POST/GET на apex — пустое (Cloudflare 403). |
| Где припаркован | регистратор: NameCheap, Inc.; DNS: Cloudflare (vick.ns.cloudflare.com, blair.ns.cloudflare.com) |
