# Cloaking hints — Betfair Tipster (com.betfair.pelican)

- Play title = APK-label = «Betfair Tipster» (совпадает).
- Entry: `com.pairip.application.Application.attachBaseContext` → `LicenseClient.checkLicense` (лицензия Google Play, не gate) → `crc646813e9007f09f67b.MainApplication` / `MauiApplication.n_onCreate`.
- Launcher: `Pelican.UI.MainActivity` extends `MauiAppCompatActivity` (пустой Java-stub, логика в AOT `Pelican.UI.dll`).
- WebView: `crc6452ffdc5b34af3a0f.MauiWebViewClient.shouldOverrideUrlLoading` → native `Microsoft.Maui.Platform.MauiWebViewClient`. Hybrid: `MauiHybridWebViewClient.shouldInterceptRequest`. Это каркас .NET MAUI, не развилка оффер/белая.
- Custom Tabs: `AndroidX.Browser` + Facebook `CustomTabActivity` (`fbconnect://cct.com.betfair.pelican`) + MAUI `WebAuthenticationCallbackActivity` (scheme `@string/whitelabel_code` = `betfair`, OIDC Duende.IdentityModel).
- Зашитые URL продукта: `https://docs.pelicantrading.io/items/*.pdf`, `https://knowledgebase.pelicantrading.io/…`, `https://copytrade-resource.com/<lang>/`, `mailto:support@pelicantrading.io`. Не ответ gate.
- cloak / cloaker / gate / offer / whitelist / blacklist / is_bot в first-party коде нет. `whitelabel_code` = бренд Betfair для Pelican Trading.
- Remote Config нет. Рекламных сетей нет. Аналитика: Firebase Analytics, AppsFlyer, Segment, Sentry, Facebook App Events.
- Cloak = нет: обычное официальное приложение copy-trading без фильтрации «кому оффер».
