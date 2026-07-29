package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzajo extends zzajx {
    private final /* synthetic */ zzajm zzcpw;

    zzajo(zzajm zzajmVar) {
        this.zzcpw = zzajmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        Context context;
        zzang zzangVar;
        Object obj;
        zznn zznnVar;
        context = this.zzcpw.mContext;
        zzangVar = this.zzcpw.zzyf;
        zznm zznmVar = new zznm(context, zzangVar.zzcw);
        obj = this.zzcpw.mLock;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzbv.zzet();
                zznnVar = this.zzcpw.zzcpn;
                zznp.zza(zznnVar, zznmVar);
            } catch (IllegalArgumentException e) {
                zzakb.zzc("Cannot config CSI reporter.", e);
            }
        }
    }
}
