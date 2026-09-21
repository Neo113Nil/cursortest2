# Cloaking hints (Melbet / AGITAL GRZEGORZ / Win Math)

- Play title «Melbet» ≠ APK application-label «Win Math».
- Launcher: `com.intelectgame.winmath.MainActivity` (наследует AppCompat `g.AbstractActivityC0126i`).
- Строки XOR-ключом `[159, 32, 178, 175]`.
- SharedPreferences `cfg`, ключ `rurl` — сохранённый адрес после проверки.
- Если `rurl` уже есть — сразу ACTION_VIEW, без нового запроса.
- Иначе тихий GET `https://nameless-tooth-e0c2.vasilinahazipova.workers.dev/?app=<package>`.
  Заголовки: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9` (константа), `User-Agent` = WebSettings.getDefaultUserAgent.
- Ответ: сравнение исходного URL и конечного URL после редиректов OkHttp. Совпали (или ошибка сети) → белая. Различаются → сохранить конечный URL в `rurl` и открыть снаружи.
- Оффер: `android.intent.action.VIEW` (внешний браузер), WebView скрыт.
- Белая: WebView `file:///android_asset/index.html`. Custom Tabs нет.
