package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668hg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0693ig f11998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0952sg f11999b;

    public C0668hg(C0693ig c0693ig, InterfaceC0952sg interfaceC0952sg) {
        this.f11998a = c0693ig;
        this.f11999b = interfaceC0952sg;
    }

    public static final void a(C0693ig c0693ig, InterfaceC0952sg interfaceC0952sg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0693ig.f12044b.getInstallReferrer();
                interfaceC0952sg.a(new C0823ng(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0797mg.f12362c));
                installReferrerClient = c0693ig.f12044b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                interfaceC0952sg.a(th);
                installReferrerClient = c0693ig.f12044b;
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
        if (i4 != 0) {
            this.f11998a.a(this.f11999b, new IllegalStateException(AbstractC0005f.j(i4, "Referrer check failed with error ")));
            return;
        }
        C0693ig c0693ig = this.f11998a;
        c0693ig.f12043a.execute(new g0.p(c0693ig, 5, this.f11999b));
    }
}
