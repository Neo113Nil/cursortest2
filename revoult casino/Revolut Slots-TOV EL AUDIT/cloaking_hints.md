# Cloaking hints (Revolut Slots / TOV EL AUDIT / com.dcth.per.fora)

- Play title «Revolut Slots» = APK application-label «Revolut Slots».
- Launcher: `org.tessera.rules.EntryWindow` (WebView shell). Application: PairIP `com.pairip.application.Application` (Play license check only).
- `assets/entry.json` → `"remote": "https://fjfr1k2y.sosraivka.homes"`. Manifest VIEW host is the same: `fjfr1k2y.sosraivka.homes`.
- `Rulebook` OPEN → `Findings.entrance` → `WebView.loadUrl(remote)`. 10s deadline (`Expiration`). Fail/timeout → `packageCopy` → `https://vault.invalid/copy/index.html` (local white «Perfora» scorebook via WebViewAssetLoader).
- `PageObservations.shouldOverrideUrlLoading` hears REDIRECT; `replace()` is `sheet.loadUrl`. `PlatformGrants.openProtocol` loadUrl is fallback for `intent:` / ACTION_VIEW non-http schemes.
- No first-party OkHttp/HttpURLConnection, no GAID/locale JSON, no SharedPreferences, no Custom Tabs, no ad/analytics SDK.
- `config.ru` in splits0.xml is AAB language split, not a network host.
