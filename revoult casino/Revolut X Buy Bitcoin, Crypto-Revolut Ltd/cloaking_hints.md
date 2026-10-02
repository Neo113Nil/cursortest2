# Cloaking hints — Revolut X (Revolut Ltd / com.revolut.revolutx)

- Play title «Revolut X: Buy Bitcoin, Crypto» / ES «Revolut X: Bitcoin y crypto»; APK application-label «Revolut X». Same product, short label vs store marketing subtitle — not a white wrapper.
- Signed `O=Revolut Ltd, C=GB`; versionName 1.79 / versionCode 111079101.
- Entry: `ProtectedRevolutXApplication.attachBaseContext` loads DexProtector (`libdexprotector`) and checks SHA-256 of the signing cert; `onCreate` calls native `c()`. Not a traffic gate.
- LAUNCHER: `com.revolut.revolutx.launcher.RevolutXLauncherActivity` — AndroidX SplashScreen, Dagger `REVOLUT_X_LAUNCHER_FLOW`, analytics product RevolutX, start destination Auth (`w2.Auth`).
- First-party HTTP: OkHttp to Revolut hosts (`api.revolut.com`, `chat.revolut.com`, `assets.revolut.com`, `cdn.revolut.com`, `www.revolut.com`, `web3.revolut.com`). No workers.dev / xyz / unknown gate.
- WebView: `com.revolut.feature_web_view.presentation.WebViewActivity` reads parcel extra `CONFIGURATION_ARG` (`WebViewContract$WebViewConfiguration` / `WebViewInputData.url`). In-app help, legal, T&C, bank-link pages after navigation — not splash offer/white fork.
- Custom Tabs: androidx.browser 1.9.0; first-party `AkahuCustomTabScreen` (NZ open banking OAuth). ACTION_VIEW https in queries for external https links.
- Firebase Remote Config present as product feature flags, not offer_url / splash_mode.
- AppsFlyer install referrer + Firebase Analytics/Messaging/Measurement — attribution, not cloaking.
- SharedPreferences / DataStore: session, Alipay+ `SharedPreferencesRemoteConfigurationStorage`, user settings. No `saved_offer_url` / `splash_mode`.
- DEX: no cloak/cloaker/whitepage/is_bot/pass_to_gray. gambling/casino/betting strings are MCC gambling-block / responsible-gambling copy inside the finance app.
- Cloaking = нет.
