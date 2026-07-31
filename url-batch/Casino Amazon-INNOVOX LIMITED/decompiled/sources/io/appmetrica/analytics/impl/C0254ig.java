package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0254ig implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0280jg f1306a;
    public final /* synthetic */ InterfaceC0531tg b;

    public C0254ig(C0280jg c0280jg, InterfaceC0531tg interfaceC0531tg) {
        this.f1306a = c0280jg;
        this.b = interfaceC0531tg;
    }

    public static final void a(C0280jg c0280jg, InterfaceC0531tg interfaceC0531tg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0280jg.b.getInstallReferrer();
                interfaceC0531tg.a(new C0407og(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0382ng.c));
                installReferrerClient = c0280jg.b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                interfaceC0531tg.a(th);
                installReferrerClient = c0280jg.b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i != 0) {
            this.f1306a.a(this.b, new IllegalStateException("Referrer check failed with error " + i));
            return;
        }
        final C0280jg c0280jg = this.f1306a;
        ICommonExecutor iCommonExecutor = c0280jg.f1323a;
        final InterfaceC0531tg interfaceC0531tg = this.b;
        iCommonExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.ig$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0254ig.a(C0280jg.this, interfaceC0531tg);
            }
        });
    }
}
