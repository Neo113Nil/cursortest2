# Cloaking hints (Melbet / ASSEMBLE SOLUTIONS PTY LTD / Sprint Reaction Gate)

- Play title «Melbet» ≠ APK application-label «Sprint Reaction Gate».
- Launcher: MainActivity. Application = pairip LicenseClient.checkLicense в attachBaseContext (com.pairip.application.Application).
- Адрес проверки зашифрован AES-GCM (MemoryEndpointVault / MemoryCryptoEngine, PBKDF2 533000): после расшифровки `http://farm711.online:8081/api/v1/resolve?package=com.sprintreaction.gatequiz`, затем дописывается `gaid=`.
- t2.c: AdvertisingIdClient; если пусто / limit-ad-tracking — android_id (не 9774d56d682e549c) или UUID в SharedPreferences device_guid / guid.
- GET farm711 `/api/v1/resolve` (HttpURLConnection): заголовки User-Agent, Accept-Language, Accept, X-Device-Model, X-Device-Gaid, X-Device-Guid, X-App-Package.
- Ответ JSON: offer_enabled, offer_url, campaign_url, stored. Иначе / http≠200 / offline → SafeLocal / Offline.
- Кэш: SharedPreferences offer_link_store, ключ gaid|pkg (y2.d.O / M0); campaign_url отдельно.
- Если stored и URL не трекер — пропуск keitaro. Иначе followOfferRedirects (до 12 редиректов / meta refresh / JS location) пока хост ≠ campaign/tracker.
- POST `/api/v1/devices/register` JSON gaid, pkg, offerUrl.
- Показ оффера: ACTION_VIEW (внешний браузер). WebView description всегда грузит file:///android_asset/index.html (LOCAL_PLAYBOOK). JavaScript в WebView выключен. Custom Tabs нет.
- Белая оболочка: локальный index.html + кнопка Open Quiz Hub → KineticGateHomeActivity (не часть запроса проверки).
