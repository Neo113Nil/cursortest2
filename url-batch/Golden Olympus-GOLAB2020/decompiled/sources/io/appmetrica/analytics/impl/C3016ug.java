package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3016ug implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3042vg f39942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fg f39943b;

    public C3016ug(C3042vg c3042vg, Fg fg) {
        this.f39942a = c3042vg;
        this.f39943b = fg;
    }

    public static final void a(C3042vg c3042vg, Fg fg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c3042vg.f39978b.getInstallReferrer();
                fg.a(new Ag(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC3146zg.f40385c));
                installReferrerClient = c3042vg.f39978b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                fg.a(th);
                installReferrerClient = c3042vg.f39978b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i4) {
        if (i4 == 0) {
            final C3042vg c3042vg = this.f39942a;
            ICommonExecutor iCommonExecutor = c3042vg.f39977a;
            final Fg fg = this.f39943b;
            iCommonExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Bp
                @Override // java.lang.Runnable
                public final void run() {
                    C3016ug.a(C3042vg.this, fg);
                }
            });
            return;
        }
        this.f39942a.a(this.f39943b, new IllegalStateException("Referrer check failed with error " + i4));
    }
}
