package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.b;
import android.support.customtabs.d;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzbfx extends d {
    private WeakReference<zzbfy> zzedz;

    public zzbfx(zzbfy zzbfyVar) {
        this.zzedz = new WeakReference<>(zzbfyVar);
    }

    @Override // android.support.customtabs.d
    public final void onCustomTabsServiceConnected(ComponentName componentName, b bVar) {
        zzbfy zzbfyVar = this.zzedz.get();
        if (zzbfyVar != null) {
            zzbfyVar.zza(bVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbfy zzbfyVar = this.zzedz.get();
        if (zzbfyVar != null) {
            zzbfyVar.zzjo();
        }
    }
}
