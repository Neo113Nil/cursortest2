package io.flutter.plugins;

import androidx.annotation.Keep;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.googlemobileads.g0;
import io.flutter.plugins.webviewflutter.o3;
import q5.i;
import r4.c;
import t4.f;
import t5.t;
import x4.g;
import z4.b;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.p().g(new com.ryanheise.audioservice.a());
        } catch (Exception e7) {
            b.c(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e7);
        }
        try {
            aVar.p().g(new c());
        } catch (Exception e8) {
            b.c(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e8);
        }
        try {
            aVar.p().g(new y4.a());
        } catch (Exception e9) {
            b.c(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e9);
        }
        try {
            aVar.p().g(new o0.a());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin flutter_share, com.example.fluttershare.FlutterSharePlugin", e10);
        }
        try {
            aVar.p().g(new g0());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e11);
        }
        try {
            aVar.p().g(new f());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e12);
        }
        try {
            aVar.p().g(new q4.a());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin launch_review, com.iyaffle.launchreview.LaunchReviewPlugin", e13);
        }
        try {
            aVar.p().g(new i());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e14);
        }
        try {
            aVar.p().g(new r5.b());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e15);
        }
        try {
            aVar.p().g(new u4.c());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e16);
        }
        try {
            aVar.p().g(new s5.c());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e17);
        }
        try {
            aVar.p().g(new t());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e18);
        }
        try {
            aVar.p().g(new g());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin wakelock, creativemaybeno.wakelock.WakelockPlugin", e19);
        }
        try {
            aVar.p().g(new o3());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e20);
        }
    }
}
