# Cloaking hints (Melbet / CIPHERTEK GROUP LTD / CornerKick Planner)

- Play title «Melbet» ≠ APK application-label «CornerKick Planner».
- Launcher: MainActivity (Compose). Application = pairip LicenseClient.checkLicense в attachBaseContext, дальше IntegrationApp.
- Сразу при старте: SharedPreferences `cornerkick_integration`, акселерометр ~1 с, User-Agent из WebView, AppsFlyer (`BNPJAvHbBA7FoexzLmKa28`).
- Если нет `white_locked` и нет `cached_offer_url` — ждут до 8 с атрибуцию AppsFlyer.
- Тихая проверка GET `https://cornerkick-planner.cfd/bF5KrJmd` (HttpURLConnection). Query: атрибуция AppsFlyer целиком, `campaign` и куски `sub1`…, `appsflyer_id`, `sub12` (батарея), `sub13` (акселерометр), `sub14` (тестовая среда). Заголовки User-Agent, Accept. SSL: TrustManager/HostnameVerifier принимают всё. До 10 редиректов по Location.
- Ответ: HTTP 404 → White (`white_locked=true`). Иначе Black(finalUrl) → `cached_offer_url`. Ошибка сети → White только на этот запуск.
- Показ оффера: встроенный WebView (JS/DOM/mixed content), OfferWebViewClient; не-http(s) схемы → ACTION_VIEW. Custom Tabs нет.
- Белая оболочка: обычный CornerKick Planner (схемы угловых + расписание football-data.org), без деталей игры в отчёте.
