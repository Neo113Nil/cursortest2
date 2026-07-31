package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: com.my.tracker.obfuscated.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1675q0 {

    /* renamed from: f, reason: collision with root package name */
    static int f21495f = 3;

    /* renamed from: g, reason: collision with root package name */
    static volatile C1675q0 f21496g;

    /* renamed from: a, reason: collision with root package name */
    final C1631f0 f21497a;

    /* renamed from: b, reason: collision with root package name */
    final C1662n f21498b;

    /* renamed from: c, reason: collision with root package name */
    final Context f21499c;

    /* renamed from: d, reason: collision with root package name */
    InstallReferrerClient f21500d;

    /* renamed from: e, reason: collision with root package name */
    int f21501e;

    /* renamed from: com.my.tracker.obfuscated.q0$a */
    final class a implements InstallReferrerStateListener {
        a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            AbstractC1708y2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + C1675q0.this.f21501e);
            C1675q0.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i4) {
            AbstractC1708y2.a("ReferrerHandler: install referrer setup is finished");
            if (i4 == -1) {
                C1675q0.this.a(this);
            } else {
                C1675q0.this.a(i4);
            }
        }
    }

    C1675q0(C1631f0 c1631f0, C1662n c1662n, Context context) {
        this.f21497a = c1631f0;
        this.f21498b = c1662n;
        this.f21499c = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(ReferrerDetails referrerDetails) {
        C1676q1 a4 = C1676q1.a(this.f21499c);
        if (a4.o()) {
            AbstractC1708y2.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        AbstractC1708y2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f21497a.a(installReferrer, AbstractC1689u.b(this.f21499c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f21498b.a(installReferrer);
        a4.s();
    }

    public static void a(String str, Context context, Runnable runnable) {
        C1675q0 c1675q0 = f21496g;
        if (c1675q0 != null) {
            c1675q0.a(str, runnable);
            return;
        }
        C1676q1 a4 = C1676q1.a(context);
        if (!a4.r()) {
            a4.l(str);
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            AbstractC1708y2.a("ReferrerHandler: initialize InstallReferrerClient");
            this.f21500d = InstallReferrerClient.newBuilder(this.f21499c).build();
            a(new a());
        } catch (Throwable th) {
            AbstractC1708y2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    void b() {
        C1676q1 a4 = C1676q1.a(this.f21499c);
        if (a4.r()) {
            return;
        }
        String m4 = a4.m();
        if (TextUtils.isEmpty(m4)) {
            return;
        }
        a(m4, null);
    }

    void a(String str, Runnable runnable) {
        C1676q1 a4 = C1676q1.a(this.f21499c);
        if (a4.r()) {
            AbstractC1708y2.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f21497a.a(str, AbstractC1689u.b(this.f21499c), runnable);
        this.f21498b.a(str);
        a4.v();
    }

    public static void a(C1631f0 c1631f0, C1662n c1662n, Context context) {
        if (f21496g != null) {
            return;
        }
        synchronized (C1675q0.class) {
            try {
                if (f21496g == null) {
                    final C1675q0 c1675q0 = new C1675q0(c1631f0, c1662n, context);
                    AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.s3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1675q0.a(C1675q0.this);
                        }
                    });
                    f21496g = c1675q0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a() {
        if (C1676q1.a(this.f21499c).o()) {
            return;
        }
        AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.t3
            @Override // java.lang.Runnable
            public final void run() {
                C1675q0.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1675q0 c1675q0) {
        c1675q0.b();
        c1675q0.a();
    }

    void a(int i4) {
        if (this.f21500d == null) {
            AbstractC1708y2.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i4 == 0) {
                AbstractC1708y2.a("ReferrerHandler: retrieving install referrer");
                final ReferrerDetails installReferrer = this.f21500d.getInstallReferrer();
                AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.u3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1675q0.this.b(installReferrer);
                    }
                });
            } else {
                AbstractC1708y2.a("ReferrerHandler: InstallReferrerResponse code: " + i4);
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.f21500d.endConnection();
        } catch (Throwable unused) {
        }
        this.f21500d = null;
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f21500d;
        if (installReferrerClient == null) {
            AbstractC1708y2.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i4 = this.f21501e;
        if (i4 >= f21495f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f21500d = null;
            return;
        }
        this.f21501e = i4 + 1;
        try {
            AbstractC1708y2.a("ReferrerHandler: connect to referrer client");
            this.f21500d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            AbstractC1708y2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
