# Cloaking hints (Revolut Casino - Live Slots / IMMO AND-CO / Revolut Player)

- Play title «Revolut Casino - Live Slots» ≠ APK application-label «Revolut Player».
- Entry: PairIP `Application.attachBaseContext` (Play license check) → Flutter `com.example.revolut_player.MainActivity`.
- Dart package `image_preload_helper` (plugin `i.love.my.images.image_preload_helper`) runs `PreloadScreen` / `PreloadHost` before the white game.
- `PreloadEndpoints.forDomain` → `https://templatestore.fun`; image ` /img/ `; link ` /link.txt `.
- `_preloadImage` then `_fetchLink` (package:http GET). `parseLinkBody` reads the body of `link.txt`.
- SharedPreferences key `image_preload_helper.cached_link`. Logs: `cache hit:`, `cached value is not a parseable uri:`.
- HTTP 4xx on first link → white Flutter game (`revolut_player`, «DEEP SEA TREASURE SLOTS»).
- Else `probing first link in hidden WebView` (HeadlessInAppWebView). Follows hops (`first hop navigates on to`, `first hop loaded`, `first hop answered`).
- Success: `opening first link in browser` via url_launcher (`launchUrl` / ACTION_VIEW / Custom Tabs). `_reopenCachedTab` on later launches.
- n2/g.java and n2/h.java are url_launcher WebViewClient: `shouldOverrideUrlLoading` → `loadUrl`. URL comes from Dart (server `link.txt`), not hardcoded.
- Java plugin `u1.a` (`ImagePreloadHelperPlugin`) is an empty FlutterEngine stub; logic is in `libapp.so`.
- `config.ru` is AAB `splits0.xml` language split, not a network host. `dispatchers.io` is Kotlin `Dispatchers.IO`, not a network host.
