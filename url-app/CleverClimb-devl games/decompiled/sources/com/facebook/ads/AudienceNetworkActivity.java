package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cmplay.policy.gdpr.DimenUtils;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.adapters.n;
import com.facebook.ads.internal.settings.a;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.e.b.z;
import com.facebook.ads.internal.view.f;
import com.facebook.ads.internal.view.j;
import com.facebook.ads.internal.view.k;
import com.facebook.ads.internal.view.l;
import com.facebook.ads.internal.view.q;
import com.facebook.ads.internal.view.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AudienceNetworkActivity extends Activity {

    @Deprecated
    public static final String AD_ICON_URL = "adIconUrl";

    @Deprecated
    public static final String AD_SUBTITLE = "adSubtitle";

    @Deprecated
    public static final String AD_TITLE = "adTitle";
    public static final String AUDIENCE_NETWORK_UNIQUE_ID_EXTRA = "uniqueId";
    public static final String AUTOPLAY = "autoplay";
    public static final String BROWSER_URL = "browserURL";
    public static final String CLIENT_TOKEN = "clientToken";

    @Deprecated
    public static final String CONTEXT_SWITCH_BEHAVIOR = "contextSwitchBehavior";

    @Deprecated
    public static final String END_CARD_ACTIVATION_COMMAND = "facebookRewardedVideoEndCardActivationCommand";

    @Deprecated
    public static final String END_CARD_MARKUP = "facebookRewardedVideoEndCardMarkup";
    public static final String HANDLER_TIME = "handlerTime";
    public static final String PLACEMENT_ID = "placementId";
    public static final String PREDEFINED_ORIENTATION_KEY = "predefinedOrientationKey";
    public static final String REQUEST_TIME = "requestTime";
    public static final String REWARD_SERVER_URL = "rewardServerURL";
    public static final String SKIP_DELAY_SECONDS_KEY = "skipAfterSeconds";
    public static final String USE_CACHE = "useCache";
    public static final String VIDEO_LOGGER = "videoLogger";
    public static final String VIDEO_MPD = "videoMPD";

    @Deprecated
    public static final String VIDEO_REPORT_URL = "videoReportURL";
    public static final String VIDEO_SEEK_TIME = "videoSeekTime";
    public static final String VIDEO_URL = "videoURL";
    public static final String VIEW_TYPE = "viewType";

    @Deprecated
    public static final String WEBVIEW_ENCODING = "utf-8";

    @Deprecated
    public static final String WEBVIEW_MIME_TYPE = "text/html";

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f4762b;

    /* renamed from: d, reason: collision with root package name */
    private String f4764d;
    private a.EnumC0351a e;
    private long f;
    private long g;
    private int h;
    private com.facebook.ads.internal.view.a i;
    private com.facebook.ads.internal.view.b.c j;

    /* renamed from: a, reason: collision with root package name */
    private final List<BackButtonInterceptor> f4761a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f4763c = -1;

    public interface BackButtonInterceptor {
        boolean interceptBackButton();
    }

    public enum Type {
        INTERSTITIAL_WEB_VIEW(a.EnumC0351a.INTERSTITIAL_WEB_VIEW),
        INTERSTITIAL_OLD_NATIVE_VIDEO(a.EnumC0351a.INTERSTITIAL_OLD_NATIVE_VIDEO),
        INTERSTITIAL_NATIVE_VIDEO(a.EnumC0351a.INTERSTITIAL_NATIVE_VIDEO),
        INTERSTITIAL_NATIVE_IMAGE(a.EnumC0351a.INTERSTITIAL_NATIVE_IMAGE),
        INTERSTITIAL_NATIVE_CAROUSEL(a.EnumC0351a.INTERSTITIAL_NATIVE_CAROUSEL),
        FULL_SCREEN_VIDEO(a.EnumC0351a.FULL_SCREEN_VIDEO),
        REWARDED_VIDEO(a.EnumC0351a.REWARDED_VIDEO),
        BROWSER(a.EnumC0351a.BROWSER);


        /* renamed from: a, reason: collision with root package name */
        a.EnumC0351a f4767a;

        Type(a.EnumC0351a enumC0351a) {
            this.f4767a = enumC0351a;
        }
    }

    private static class a implements a.InterfaceC0352a {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference<AudienceNetworkActivity> f4768a;

        private a(AudienceNetworkActivity audienceNetworkActivity) {
            this.f4768a = new WeakReference<>(audienceNetworkActivity);
        }

        @Override // com.facebook.ads.internal.view.a.InterfaceC0352a
        public void a(View view) {
            if (this.f4768a.get() != null) {
                this.f4768a.get().f4762b.addView(view);
            }
        }

        @Override // com.facebook.ads.internal.view.a.InterfaceC0352a
        public void a(String str) {
            if (this.f4768a.get() != null) {
                this.f4768a.get().a(str);
            }
        }

        @Override // com.facebook.ads.internal.view.a.InterfaceC0352a
        public void a(String str, com.facebook.ads.internal.j.d dVar) {
            if (this.f4768a.get() != null) {
                this.f4768a.get().a(str, dVar);
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final AudienceNetworkActivity f4769a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f4770b;

        /* renamed from: c, reason: collision with root package name */
        private final com.facebook.ads.internal.m.c f4771c;

        private b(AudienceNetworkActivity audienceNetworkActivity, Intent intent, com.facebook.ads.internal.m.c cVar) {
            this.f4769a = audienceNetworkActivity;
            this.f4770b = intent;
            this.f4771c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a a() {
            l lVar = new l(this.f4769a, this.f4771c, i(), h() ? new com.facebook.ads.internal.d.b(this.f4769a) : null);
            a((com.facebook.ads.internal.view.a) lVar);
            return lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a a(RelativeLayout relativeLayout) {
            v vVar = new v(this.f4769a, this.f4771c, new a());
            vVar.a(relativeLayout);
            return vVar;
        }

        private void a(com.facebook.ads.internal.view.a aVar) {
            aVar.setListener(new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a b() {
            com.facebook.ads.internal.view.a a2 = m.a(this.f4770b.getStringExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA));
            if (a2 == null) {
                return null;
            }
            a(a2);
            return a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a c() {
            return new com.facebook.ads.internal.view.b(this.f4769a, this.f4771c, new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a d() {
            return new q(this.f4769a, this.f4771c, new com.facebook.ads.internal.view.e.b(this.f4769a), new d(), (ad) this.f4770b.getSerializableExtra("rewardedVideoAdDataBundle"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a e() {
            return new f(this.f4769a, this.f4771c, new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a f() {
            j jVar = new j(this.f4769a, this.f4771c);
            a((com.facebook.ads.internal.view.a) jVar);
            return jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.facebook.ads.internal.view.a g() {
            k kVar = new k(this.f4769a, i(), this.f4771c);
            a((com.facebook.ads.internal.view.a) kVar);
            return kVar;
        }

        private boolean h() {
            return this.f4770b.getBooleanExtra(AudienceNetworkActivity.USE_CACHE, false);
        }

        private com.facebook.ads.internal.adapters.v i() {
            return (com.facebook.ads.internal.adapters.v) this.f4770b.getSerializableExtra("ad_data_bundle");
        }
    }

    private class c implements View.OnLongClickListener {
        private c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (AudienceNetworkActivity.this.j != null && AudienceNetworkActivity.this.f4762b != null) {
                AudienceNetworkActivity.this.j.setBounds(0, 0, AudienceNetworkActivity.this.f4762b.getWidth(), AudienceNetworkActivity.this.f4762b.getHeight());
                AudienceNetworkActivity.this.j.a(!AudienceNetworkActivity.this.j.a());
            }
            return true;
        }
    }

    private static class d extends a {
        private d(AudienceNetworkActivity audienceNetworkActivity) {
            super();
        }

        @Override // com.facebook.ads.AudienceNetworkActivity.a, com.facebook.ads.internal.view.a.InterfaceC0352a
        public void a(String str) {
            if (this.f4768a.get() == null) {
                return;
            }
            this.f4768a.get().a(str);
            String a2 = z.REWARDED_VIDEO_END_ACTIVITY.a();
            String a3 = z.REWARDED_VIDEO_ERROR.a();
            if (str.equals(a2) || str.equals(a3)) {
                this.f4768a.get().finish();
            }
        }
    }

    private com.facebook.ads.internal.view.a a() {
        b bVar = new b(getIntent(), com.facebook.ads.internal.m.d.a(this));
        if (this.e == null) {
            return null;
        }
        switch (this.e) {
        }
        return null;
    }

    private void a(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.f4763c = bundle.getInt(PREDEFINED_ORIENTATION_KEY, -1);
            this.f4764d = bundle.getString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
            this.e = (a.EnumC0351a) bundle.getSerializable(VIEW_TYPE);
        } else {
            this.f4763c = intent.getIntExtra(PREDEFINED_ORIENTATION_KEY, -1);
            this.f4764d = intent.getStringExtra(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
            this.e = (a.EnumC0351a) intent.getSerializableExtra(VIEW_TYPE);
            this.h = intent.getIntExtra(SKIP_DELAY_SECONDS_KEY, 0) * 1000;
        }
    }

    private void a(Intent intent, boolean z) {
        if (!com.facebook.ads.internal.l.a.b(this) || this.e == a.EnumC0351a.BROWSER) {
            return;
        }
        this.j = new com.facebook.ads.internal.view.b.c();
        this.j.a(intent.getStringExtra(PLACEMENT_ID));
        this.j.b(getPackageName());
        long longExtra = intent.getLongExtra(REQUEST_TIME, 0L);
        if (longExtra != 0) {
            this.j.a(longExtra);
        }
        TextView textView = new TextView(this);
        textView.setText("Debug");
        textView.setTextColor(-1);
        textView.setBackgroundColor(Color.argb(DimenUtils.DENSITY_MEDIUM, 0, 0, 0));
        textView.setPadding(5, 5, 5, 5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(11, -1);
        textView.setLayoutParams(layoutParams);
        c cVar = new c();
        textView.setOnLongClickListener(cVar);
        if (z) {
            this.f4762b.addView(textView);
        } else {
            this.f4762b.setOnLongClickListener(cVar);
        }
        this.f4762b.getOverlay().add(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(str + ":" + this.f4764d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.facebook.ads.internal.j.d dVar) {
        Intent intent = new Intent(str + ":" + this.f4764d);
        intent.putExtra("event", dVar);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void addBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.f4761a.add(backButtonInterceptor);
    }

    @Override // android.app.Activity
    public void finish() {
        if (isFinishing()) {
            return;
        }
        a(this.e == a.EnumC0351a.REWARDED_VIDEO ? z.REWARDED_VIDEO_CLOSED.a() : "com.facebook.ads.interstitial.dismissed");
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.g += currentTimeMillis - this.f;
        this.f = currentTimeMillis;
        if (this.g > this.h) {
            boolean z = false;
            Iterator<BackButtonInterceptor> it = this.f4761a.iterator();
            while (it.hasNext()) {
                if (it.next().interceptBackButton()) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.i instanceof n) {
            ((n) this.i).a(configuration);
        } else if (this.i instanceof q) {
            ((q) this.i).a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.facebook.ads.internal.q.a.d.a();
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        this.f4762b = new RelativeLayout(this);
        com.facebook.ads.internal.q.a.v.a(this.f4762b, -16777216);
        setContentView(this.f4762b, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent = getIntent();
        a(intent, bundle);
        this.i = a();
        if (this.i == null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(null, "Unable to infer viewType from intent or savedInstanceState"));
            a("com.facebook.ads.interstitial.error");
            finish();
        } else {
            this.i.a(intent, bundle, this);
            a("com.facebook.ads.interstitial.displayed");
            this.f = System.currentTimeMillis();
            a(intent, this.e == a.EnumC0351a.INTERSTITIAL_WEB_VIEW);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f4762b != null) {
            this.f4762b.removeAllViews();
        }
        if (this.i != null) {
            m.a(this.i);
            this.i.onDestroy();
            this.i = null;
        }
        if (this.j != null && com.facebook.ads.internal.l.a.b(this)) {
            this.j.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.g += System.currentTimeMillis() - this.f;
        if (this.i != null) {
            this.i.i();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f = System.currentTimeMillis();
        if (this.i != null) {
            this.i.j();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.i != null) {
            this.i.a(bundle);
        }
        bundle.putInt(PREDEFINED_ORIENTATION_KEY, this.f4763c);
        bundle.putString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f4764d);
        bundle.putSerializable(VIEW_TYPE, this.e);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f4763c != -1) {
            setRequestedOrientation(this.f4763c);
        }
    }

    public void removeBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.f4761a.remove(backButtonInterceptor);
    }
}
