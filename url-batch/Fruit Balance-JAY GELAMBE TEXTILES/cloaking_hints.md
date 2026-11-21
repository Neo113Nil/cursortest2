# Cloaking hints — Fruit Balance (com.ropreww.kkopfewrv)

- Play title = APK application-label = «Fruit Balance».
- Application: `com.pairip.application.Application` (PairIP LicenseClient.checkLicense в attachBaseContext), лаунчер `com.unity3d.player.UnityPlayerActivity`.
- Unity IL2CPP, Assembly-CSharp обфусцирован (`_0x…`). Белая оболочка: score/timer/levels/tutorial. Рядом cloaking-хелперы: `OpenUrlExternally`, `TryOpenExternalLikeChrome`, `IsGoogleAuthUrl`, `IsGoogleAuthFlowUrl`, `IsAboutBlank`, `IsHttpUrl`, `GetFailingUrl`, `lastSafe`, `firstLoadShown`, `OnDeferredDeeplinkReceived`, `OnAttributionChanged`, `launchDeferredDeeplink`.
- Java UniWebView: `UniWebViewInterface.load(name, url)` → `C0119v1` → `WebView.loadUrl`. URL не зашит в Java, приходит из игрового движка. `c.shouldOverrideUrlLoading` перехватывает схему и при своих заголовках снова зовёт `loadUrl`. Custom Tabs: `E3.launchUrl` (Safe Browsing) и `U` (AuthenticationSession) — URL тоже с движка.
- Gate: Adjust SDK (`https://app.adjust.com`, запасной `https://app.adjust.io`) с `attribution_deeplink=true` / `launchDeferredDeeplink`. Сессия несёт gps_adid, language, country, package, device, referrer. Ответ: deferred deeplink / attribution. Google-auth / about:blank / failing URL → белая игра; http(s) оффер → UniWebView или Chrome Custom Tabs.
- Cloud Save / Unity Analytics / Firebase Messaging есть, но ключей tut_hint/tut_day в metadata нет — показ оффера завязан на Adjust deeplink + UniWebView, не на Cloud Save HTML.
