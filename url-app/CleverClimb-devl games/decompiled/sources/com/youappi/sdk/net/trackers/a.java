package com.youappi.sdk.net.trackers;

import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.gson.a.c;
import com.google.gson.e;
import com.google.gson.j;
import com.moat.analytics.mobile.you.MoatAdEventType;
import com.moat.analytics.mobile.you.MoatAnalytics;
import com.moat.analytics.mobile.you.MoatFactory;
import com.moat.analytics.mobile.you.MoatOptions;
import com.moat.analytics.mobile.you.NativeVideoTracker;
import com.moat.analytics.mobile.you.TrackerListener;
import com.moat.analytics.mobile.you.VideoTrackerListener;
import com.moat.analytics.mobile.you.WebAdTracker;
import com.mopub.mobileads.VastExtensionXmlManager;
import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.utils.g;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements com.youappi.sdk.trackers.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9470a = "a";

    /* renamed from: b, reason: collision with root package name */
    private WebAdTracker f9471b;

    /* renamed from: c, reason: collision with root package name */
    private NativeVideoTracker f9472c;

    /* renamed from: com.youappi.sdk.net.trackers.a$a, reason: collision with other inner class name */
    public class C0413a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        @c(a = TJAdUnitConstants.String.PARTNER_CODE)
        private String f9475b;

        /* renamed from: c, reason: collision with root package name */
        @c(a = "moatQueryString")
        private String f9476c;

        public C0413a(String str, String str2) {
            this.f9476c = str2;
            this.f9475b = str;
        }
    }

    static class b implements TrackerListener {
        b() {
        }

        @Override // com.moat.analytics.mobile.you.TrackerListener
        public void onTrackingFailedToStart(String str) {
            Log.i(a.f9470a, "Moat failed tracking: " + str);
        }

        @Override // com.moat.analytics.mobile.you.TrackerListener
        public void onTrackingStarted(String str) {
            Log.i(a.f9470a, "Moat started tracking: " + str);
        }

        @Override // com.moat.analytics.mobile.you.TrackerListener
        public void onTrackingStopped(String str) {
            Log.i(a.f9470a, "Moat stopped tracking");
        }
    }

    public a(Context context) {
        Application application = (Application) context.getApplicationContext();
        MoatOptions moatOptions = new MoatOptions();
        moatOptions.loggingEnabled = true;
        MoatAnalytics.getInstance().start(moatOptions, application);
    }

    public static boolean a() {
        return true;
    }

    @Override // com.youappi.sdk.trackers.a
    public void a(WebView webView) {
        this.f9471b = MoatFactory.create().createWebAdTracker(webView);
        this.f9471b.setListener(new b());
        this.f9471b.startTracking();
    }

    @Override // com.youappi.sdk.trackers.a
    public void a(j jVar, AdItem adItem) {
        jVar.m().a(VastExtensionXmlManager.MOAT, new e().a(new C0413a(adItem.getMoatDetails().getConfig().getPartnerCodeWebView(), g.a(adItem.getMoatDetails().getCardParams()))));
    }

    @Override // com.youappi.sdk.trackers.a
    public void a(AdItem adItem, MediaPlayer mediaPlayer, View view) {
        if (this.f9472c != null) {
            return;
        }
        this.f9472c = MoatFactory.create().createNativeVideoTracker(adItem.getMoatDetails().getConfig().getPartnerCodeVideo());
        this.f9472c.setListener(new b());
        this.f9472c.setVideoListener(new VideoTrackerListener() { // from class: com.youappi.sdk.net.trackers.a.1
            @Override // com.moat.analytics.mobile.you.VideoTrackerListener
            public void onVideoEventReported(MoatAdEventType moatAdEventType) {
                Log.i(a.f9470a, "Moat video event: " + moatAdEventType.toString());
            }
        });
        this.f9472c.trackVideoAd(adItem.getMoatDetails().getParams(), mediaPlayer, view);
    }

    @Override // com.youappi.sdk.trackers.a
    public void b() {
        this.f9471b.stopTracking();
    }

    @Override // com.youappi.sdk.trackers.a
    public void c() {
        if (this.f9472c == null) {
            Log.i(f9470a, "VideoTracker was null");
        } else {
            this.f9472c.stopTracking();
            this.f9472c = null;
        }
    }
}
