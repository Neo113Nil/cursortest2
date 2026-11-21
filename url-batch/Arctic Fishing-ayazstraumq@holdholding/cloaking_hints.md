# Cloaking hints — Arctic Fishing (com.HnJqVzR.mLpXkT)

- Play title = APK label = «Arctic Fishing».
- Entry: `com.pairip.application.Application.attachBaseContext` → LicenseClient.checkLicense; launcher `com.google.firebase.MessagingUnityPlayerActivity`.
- Native `libdesk.so` (`Java_com_desk_DeskReferrer_pull`): AdvertisingIdClient, Settings.Secure android_id, User-Agent, install referrer.
- HTTP: GET/POST `https://cloud-save.services.api.unity.com/v1/data/projects/…/players/…/items?keys=tut_hint&keys=tut_day`; Unity Remote Config `https://config.services.api.unity.com/settings`.
- Unity C#: ReadDeskGate / BeginDeskGate / FinishDeskGate / PullRemotePage / ResolveLesson / OpenLesson / PersistSkip / PersistPage / LessonOn / DeskHost.
- Offer UI: `bolts.HelpPane.loadUrl` overlay WebView (Chrome UA mask, cookies, camera PermissionRequest). `shouldOverrideUrlLoading` → hooks.shouldHandle.
- `bolts.WebViewAk8kmh98claminpzoppLinkResolver.loadUrl` = obfuscated Bolts App Links meta-tag JS (`javascript:boltsWebView…`), networkAvailable=false — not the offer gate.
- White path: empty cover/lesson HTML → ShowMenu, ordinary Unity puzzle remains.
