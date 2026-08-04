package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbde extends CustomTabsCallback {
    final /* synthetic */ zzbdh zza;

    zzbde(zzbdh zzbdhVar) {
        Objects.requireNonNull(zzbdhVar);
        this.zza = zzbdhVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zzc(i);
    }
}
