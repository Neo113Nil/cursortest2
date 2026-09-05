# Cloaking hints (Melbet / TOV FERENTA / BexonvralRun)

- Play title «Melbet» ≠ APK application-label «BexonvralRun».
- Launcher: MainActivity. Application = com.pairip.application.Application (license check).
- Сразу в onCreate: TrafitUI.configCat. SDK key `configcat-sdk-1/duneCGPBGkWEufHpl6hFWw/NvvBOGkcxUK9RPQJoaP4pw`, stringKey `eightRtyuiValue`, buttonText `Get started`, OneSignal `9c800fb2-a47b-41d6-b762-999b0e2c1e6e`, LinkOpenMode.EXTERNAL_BROWSER.
- TrafitConfigCat: ConfigCatClient autoPoll(60), SharedPreferencesCache `configcat_preferences`. GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent, опционально If-None-Match.
- Ответ: строка по ключу eightRtyuiValue. Пустая → ошибка. Равна «Get started» → белая кнопка → ArenaFoyerActivity. Иначе (openInChromeTab=true по умолчанию) URL открывают TrafitExternalBrowser (ACTION_VIEW).
- Custom Tabs есть в TrafitChromeTabs, в этом билде выбран EXTERNAL_BROWSER. Deep link martinma://wemad (TrafitDeepLinkActivity).
- WebView в first-party / Trafit нет.
