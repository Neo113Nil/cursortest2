package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826mg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0852ng f8790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1111xg f8791b;

    public C0826mg(C0852ng c0852ng, InterfaceC1111xg interfaceC1111xg) {
        this.f8790a = c0852ng;
        this.f8791b = interfaceC1111xg;
    }

    public static final void a(C0852ng c0852ng, InterfaceC1111xg interfaceC1111xg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0852ng.f8867b.getInstallReferrer();
                interfaceC1111xg.a(new C0981sg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0955rg.f9174c));
                installReferrerClient = c0852ng.f8867b;
            } catch (Throwable th) {
                try {
                    interfaceC1111xg.a(th);
                    installReferrerClient = c0852ng.f8867b;
                } catch (Throwable th2) {
                    try {
                        c0852ng.f8867b.endConnection();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i2) {
        if (i2 != 0) {
            this.f8790a.a(this.f8791b, new IllegalStateException(AbstractC0279e.d(i2, "Referrer check failed with error ")));
            return;
        }
        C0852ng c0852ng = this.f8790a;
        c0852ng.f8866a.execute(new B3.c(c0852ng, 18, this.f8791b));
    }
}
