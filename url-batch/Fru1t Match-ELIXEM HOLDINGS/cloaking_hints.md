# Cloaking hints

Launcher: com.berrypeek.gogame.entrygate.EntryGateScreen
Application: com.pairip.application.Application → CoreLaunchHost (Adjust init)
FCM: InboundSignalGate, payload field `url`
Prefs file: gate_state_slab
Prefs key gate_entry_mark: offer URL or `cleared`
Gate POST: https://rapidtraceengine.online/ (application/octet-stream, AES-GCM)
Play probe: GET https://play.google.com/store/apps/details?id=<package>&hl=en — HTTP 200 → white OrbitSelectStage
Offer: WebView loadUrl + Chrome Custom Tabs
