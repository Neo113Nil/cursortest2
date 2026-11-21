# Cloaking hints — Ice Drift (com.Porvexa8.Nulqim)

- Play title = APK label = «Ice Drift».
- Entry: `com.pairip.application.Application.attachBaseContext` → LicenseClient.checkLicense; Application.onCreate = `HaloCanopyDirector` (канал push).
- Launcher: `com.Porvexa8.Nulqim.LensCanvasRouter` (WebView).
- Gate URL (StringFog XOR): `https://ice3drift.site` + query `package_name`, `adv_id`, `fcm_token_push`, `install_ref`, `user_agent`, `version_app`, `android_id`.
- DataStore: `lever_motion_registry` (TRUE → белая HubRosterDeck), `link_course_store` (сохранённый URL), `sign_code_reserve` (GAID), `haul_root_scribe` (install referrer).
- WebViewClient `razazexyn.janok`: `shouldOverrideUrlLoading` → `LensCanvasRouter.tyji`; JS `onClickedView` / кнопка `ice_drift_button` → белая игра.
- Custom Tabs (Chrome) + ACTION_VIEW для pay.google.com / intent:// / t.me / diia.app / bpglobalfav.live / pay.widget.blog.
- `config.ru` в splits0.xml — языковой сплит APK (русский), не сетевой хост.
- Белый путь: нет сети, либо флаг `lever_motion_registry`, либо START на HTML-странице gate.
