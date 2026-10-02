# Cloaking hints — Revolut Casino (Kozaapp / Kino Casino)

- Play title «Revolut Casino» ≠ APK application-label «Kino Casino»; package `com.north.window`.
- Entry: `android.app.Application` → Flutter `com.north.window.MainActivity` extends obfuscated `d1.AbstractActivityC0231b` (FlutterActivity).
- Dart package `north_window_fl`: splash `SplashGate` / `SplashRouteResolver` before the white journal.
- Gate host hardcoded: `https://kinoapi.etyrijnwbdiada.com` with paths `/api/v1/init`, `/api/v1/token/refresh`, `/api/v1/traffic/click`.
- `DeviceInfoCollector.collectInitPayload` / `_collectDevicePayload` builds JSON (device_id, device_model, package_name, app_version, os_version, is_emulator, is_rooted, install_time, signature_sha256, build_fingerprint, country via getSimCountryIso, language via getSimLanguageTag, locale, timezone, brand, manufacturer).
- Response: `_parseTokenPair` (access_token / refresh_token), `offer_url` / `_extractClickUrl`. Prefs: `saved_offer_url`, `splash_mode` (mode=OFFER / mode=MAIN), `splash_route_resolved`, `active_api_domain`. Tokens in flutter_secure_storage.
- Offer probe: `OfferUrlProbe` + `HeadlessInAppWebView`. Show: `_enterOffer` / `_launchOfferTab` / `_reopenOfferTabIfNeeded` via flutter_custom_tabs (`CustomTabsApi.launch`) and url_launcher (`WebViewActivity.loadUrl` with URL from Dart extra `url`).
- White path: `mode=MAIN` → `north_window_fl` journal (places/notes/visits). No GAID/ADID/android_id in payload.
- `config.ru` is AAB `splits0.xml` language split (`split="config.ru"`), not a network host.
- Cloaking = да.
