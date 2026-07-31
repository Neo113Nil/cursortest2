package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1698w0 {

    /* renamed from: f, reason: collision with root package name */
    static int f21547f = 3;

    /* renamed from: g, reason: collision with root package name */
    static volatile C1698w0 f21548g;

    /* renamed from: a, reason: collision with root package name */
    final C1631f0 f21549a;

    /* renamed from: b, reason: collision with root package name */
    final C1662n f21550b;

    /* renamed from: c, reason: collision with root package name */
    final Context f21551c;

    /* renamed from: d, reason: collision with root package name */
    InstallReferrerClient f21552d;

    /* renamed from: e, reason: collision with root package name */
    int f21553e;

    /* renamed from: com.my.tracker.obfuscated.w0$a */
    final class a implements InstallReferrerStateListener {
        a() {
        }

        @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            AbstractC1708y2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + C1698w0.this.f21553e);
            C1698w0.this.a(this);
        }

        @Override // com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i4) {
            if (i4 == -1) {
                C1698w0.this.a(this);
            } else {
                AbstractC1708y2.a("HuaweiReferrerHandler: install referrer setup is finished");
                C1698w0.this.a(i4);
            }
        }
    }

    C1698w0(C1631f0 c1631f0, C1662n c1662n, Context context) {
        this.f21549a = c1631f0;
        this.f21550b = c1662n;
        this.f21551c = context.getApplicationContext();
    }

    void a(ReferrerDetails referrerDetails) {
        C1676q1 a4 = C1676q1.a(this.f21551c);
        if (a4.p()) {
            AbstractC1708y2.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        AbstractC1708y2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f21549a.b(installReferrer, AbstractC1689u.b(this.f21551c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f21550b.a(installReferrer);
        a4.t();
    }

    public static void a(C1631f0 c1631f0, C1662n c1662n, Context context) {
        if (f21548g != null) {
            return;
        }
        synchronized (C1698w0.class) {
            try {
                if (f21548g == null) {
                    final C1698w0 c1698w0 = new C1698w0(c1631f0, c1662n, context);
                    AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.x3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1698w0.this.a();
                        }
                    });
                    f21548g = c1698w0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a() {
        if (C1676q1.a(this.f21551c).p()) {
            return;
        }
        try {
            AbstractC1708y2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.f21552d = InstallReferrerClient.newBuilder(this.f21551c).build();
            a(new a());
        } catch (Throwable th) {
            AbstractC1708y2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    void a(int i4) {
        if (this.f21552d == null) {
            AbstractC1708y2.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i4 == 0) {
                AbstractC1708y2.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.f21552d.getInstallReferrer());
            } else {
                AbstractC1708y2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i4);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.f21552d.endConnection();
        } catch (Throwable unused) {
        }
        this.f21552d = null;
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.f21552d == null) {
            AbstractC1708y2.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i4 = this.f21553e;
        if (i4 >= f21547f) {
            AbstractC1708y2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.f21552d.endConnection();
            } catch (Throwable unused) {
            }
            this.f21552d = null;
            return;
        }
        this.f21553e = i4 + 1;
        try {
            AbstractC1708y2.a("HuaweiReferrerHandler: connect to referrer client");
            this.f21552d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            AbstractC1708y2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
