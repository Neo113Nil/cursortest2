package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675mg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0701ng f7879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0960xg f7880b;

    public C0675mg(C0701ng c0701ng, InterfaceC0960xg interfaceC0960xg) {
        this.f7879a = c0701ng;
        this.f7880b = interfaceC0960xg;
    }

    public static final void a(C0701ng c0701ng, InterfaceC0960xg interfaceC0960xg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0701ng.f7950b.getInstallReferrer();
                interfaceC0960xg.a(new C0830sg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0804rg.f8239c));
                installReferrerClient = c0701ng.f7950b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                interfaceC0960xg.a(th);
                installReferrerClient = c0701ng.f7950b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i3) {
        if (i3 != 0) {
            this.f7879a.a(this.f7880b, new IllegalStateException(AbstractC0033i.h(i3, "Referrer check failed with error ")));
            return;
        }
        C0701ng c0701ng = this.f7879a;
        c0701ng.f7949a.execute(new A1.a(c0701ng, 17, this.f7880b));
    }
}
