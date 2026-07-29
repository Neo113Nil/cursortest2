package com.moat.analytics.mobile.you;

import android.app.Activity;
import android.app.Application;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.you.NativeDisplayTracker;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class v {

    public static class a extends MoatAnalytics {
        @Override // com.moat.analytics.mobile.you.MoatAnalytics
        public void prepareNativeDisplayTracking(String str) {
        }

        @Override // com.moat.analytics.mobile.you.MoatAnalytics
        public void start(Application application) {
        }

        @Override // com.moat.analytics.mobile.you.MoatAnalytics
        public void start(MoatOptions moatOptions, Application application) {
        }
    }

    public static class b extends MoatFactory {
        @Override // com.moat.analytics.mobile.you.MoatFactory
        public <T> T createCustomTracker(MoatPlugin<T> moatPlugin) {
            return moatPlugin.b();
        }

        @Override // com.moat.analytics.mobile.you.MoatFactory
        public NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map) {
            return new c();
        }

        @Override // com.moat.analytics.mobile.you.MoatFactory
        public NativeVideoTracker createNativeVideoTracker(String str) {
            return new d();
        }

        @Override // com.moat.analytics.mobile.you.MoatFactory
        public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
            return new e();
        }

        @Override // com.moat.analytics.mobile.you.MoatFactory
        public WebAdTracker createWebAdTracker(WebView webView) {
            return new e();
        }
    }

    static class c implements NativeDisplayTracker {
        c() {
        }

        @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
        public void removeListener() {
        }

        @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
        public void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        }

        @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
        public void setListener(TrackerListener trackerListener) {
        }

        @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
        public void startTracking() {
        }

        @Override // com.moat.analytics.mobile.you.NativeDisplayTracker
        public void stopTracking() {
        }
    }

    static class d implements NativeVideoTracker {
        d() {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void changeTargetView(View view) {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void dispatchEvent(MoatAdEvent moatAdEvent) {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void removeListener() {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void removeVideoListener() {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void setListener(TrackerListener trackerListener) {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void setPlayerVolume(Double d2) {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void setVideoListener(VideoTrackerListener videoTrackerListener) {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public void stopTracking() {
        }

        @Override // com.moat.analytics.mobile.you.NativeVideoTracker
        public boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
            return false;
        }
    }

    static class e implements WebAdTracker {
        e() {
        }

        @Override // com.moat.analytics.mobile.you.WebAdTracker
        public void removeListener() {
        }

        @Override // com.moat.analytics.mobile.you.WebAdTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.you.WebAdTracker
        public void setListener(TrackerListener trackerListener) {
        }

        @Override // com.moat.analytics.mobile.you.WebAdTracker
        public void startTracking() {
        }

        @Override // com.moat.analytics.mobile.you.WebAdTracker
        public void stopTracking() {
        }
    }

    v() {
    }
}
