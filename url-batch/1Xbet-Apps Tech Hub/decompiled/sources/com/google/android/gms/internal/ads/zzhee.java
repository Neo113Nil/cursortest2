package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhee extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhee(zzbed zzbedVar) {
        this.zza = new WeakReference(zzbedVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbed zzbedVar = (zzbed) this.zza.get();
        if (zzbedVar != null) {
            zzbedVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbed zzbedVar = (zzbed) this.zza.get();
        if (zzbedVar != null) {
            zzbedVar.zzd();
        }
    }
}
