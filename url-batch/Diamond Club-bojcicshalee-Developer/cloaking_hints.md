# Cloaking hints — Diamond Club (com.diamondclub.socialcasino)

- Play title = APK application-label = «Diamond Club».
- Application: `com.pairip.application.Application` (PairIP LicenseClient.checkLicense в attachBaseContext), лаунчер `com.unity3d.player.UnityPlayerActivity`.
- Unity 6000.3.24f1 IL2CPP, Assembly-CSharp обфусцирован (`_0x…`). Рядом cloaking-хелперы: `OpenUrlExternally`, `TryOpenExternalLikeChrome`, `IsGoogleAuthFlowUrl`, `IsAboutBlank`, `IsHttpUrl`, `GetFailingUrl`, `lastSafe`, `firstLoadShown`, `BuildRandomPayload`, `ShouldUniWebViewHandleRequest`, `WindowsDesktopUserAgent`, `IsPrivacyItemTrue`, `StopCurrentFailedLoad`.
- Java UniWebView: `UniWebViewInterface.load(name, url)` → `Q2` → `a.loadUrl`. URL не зашит в Java, приходит из игрового движка. `c.shouldOverrideUrlLoading` перехватывает схему и при своих заголовках снова зовёт `loadUrl`. Custom Tabs: `m5.launchUrl` (Safe Browsing) и `C0154w0` (AuthenticationSession) — URL тоже с движка.
- Gate: нет Adjust/AppsFlyer. First-party `com.unitymedved.installreferrer` читает Play Install Referrer. Unity Cloud Save / Analytics / Auth есть, ключей tut_hint/tut_day в metadata нет. Google-auth / about:blank / failing URL → lastSafe/firstLoadShown (обычное приложение); http(s) → UniWebView или Chrome Custom Tabs.
- Домены пайплайна: api.uca.cloud (Unity Cloud Diagnostics), james.newtonking.com (Newtonsoft.Json), nuget.org (Newtonsoft.Json).
