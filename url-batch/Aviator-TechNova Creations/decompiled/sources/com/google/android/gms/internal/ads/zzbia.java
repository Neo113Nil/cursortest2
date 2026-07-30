package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbia extends CustomTabsCallback {
    final /* synthetic */ zzbid zza;

    zzbia(zzbid zzbidVar) {
        Objects.requireNonNull(zzbidVar);
        this.zza = zzbidVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zzc(i);
    }
}
