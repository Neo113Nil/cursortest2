package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class kf implements ProviderInstaller.ProviderInstallListener {
    public final Context a;
    public final yi b;

    public kf(Context context, yi uiPoster) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.a = context;
        this.b = uiPoster;
    }

    public final boolean b() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.a) == 0;
        } catch (Exception e) {
            xb.b("GoogleApiAvailability error", e);
            return false;
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        xb.b("ProviderInstaller onProviderInstalled", (Throwable) null, 2, (Object) null);
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            try {
                ProviderInstaller.installIfNeededAsync(kf.this.a, kf.this);
            } catch (Exception e) {
                xb.b("ProviderInstaller", e);
            }
        }
    }

    public final void a() {
        if (b()) {
            this.b.a(new a());
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i, Intent intent) {
        xb.e("ProviderInstaller onProviderInstallFailed: " + i + " ProviderInstaller is unable to install an updated Provider, your device's security provider might be vulnerable to known exploits. Your app should behave as if all HTTP communication is unencrypted.", null, 2, null);
    }
}
