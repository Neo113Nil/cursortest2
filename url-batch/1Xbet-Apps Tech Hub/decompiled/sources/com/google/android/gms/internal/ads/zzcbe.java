package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcbe extends Thread {
    final /* synthetic */ String zza;

    zzcbe(zzcbg zzcbgVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzcbs(null).zza(this.zza);
    }
}
