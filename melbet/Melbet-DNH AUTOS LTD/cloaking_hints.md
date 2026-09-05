# Cloaking hints (Melbet / DNH AUTOS LTD / Soccer Idol)

- Play title «Melbet» = APK application-label «Melbet». Тема/классы: SoccerIdol, SoccerIdolApp.
- Launcher: GateActivity (не MainActivity). Application = pairip LicenseClient.checkLicense в attachBaseContext, дальше SoccerIdolApp.licensecheck.LicenseClient.checkLicense.
- Сразу в onCreate: GateStorage.clearUrls(), затем ServerGate.resolve().
- Тихая проверка GET `https://apesaj.company/9s4QIA` (HttpURLConnection). FollowRedirects=false, timeout 12 с. Тела и своих query/заголовков нет.
- Ответ: заголовок Location. Пусто / IO ошибка / в URL есть `play.google.com` → GateDestination.Native. Иначе GateDestination.Offer(url).
- Кэш: SharedPreferences `store_nr`, ключ `send_ofg` (ссылка оффера). Ключ `send_pl` только обнуляется. На каждом запуске clearUrls() до запроса.
- Показ оффера: встроенный WebView (JS/DOM/file access), OfferWebView.bind → loadUrl. Custom Tabs нет. ACTION_VIEW для оффера нет.
- Белая оболочка: MainActivity (обычное приложение), GateActivity finish().
