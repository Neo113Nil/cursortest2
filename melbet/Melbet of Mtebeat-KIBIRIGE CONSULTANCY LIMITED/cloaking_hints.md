# Cloaking hints

- Play title: Melbet of Mtebeat
- APK application-label: Mtebeat
- Local scan hits are Expo / react-native-webview / react-native-screens SDK, not a traffic fork.
- `TabsHost.java` «is_bot»: substring of `isBottomNavigationMenuInvalidated` (false positive).
- `expo-web-browser` / CustomTabsIntent: Expo plugin in app.config; JS bundle does not call openBrowserAsync.
- RNCWebView loadUrl / shouldOverrideUrlLoading: react-native-webview SDK defaults.
- JS (Hermes): balloon painter game (best score, hearts, achievements). No cloak/gate/offer URL.
- PairIP: Google Play license check on Application.attachBaseContext, not offer/white split.
- Expo Updates: https://u.expo.dev/2dd05ee6-980a-4822-9665-5e1d935be51b (OTA), not a cloaking gate.
- Verdict: нет
