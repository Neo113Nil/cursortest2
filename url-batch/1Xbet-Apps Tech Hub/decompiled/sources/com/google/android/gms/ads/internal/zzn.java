package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzasi zzasiVar;
        zzasi zzasiVar2;
        zzs zzsVar = this.zza;
        zzasiVar = zzsVar.zzh;
        if (zzasiVar == null) {
            return false;
        }
        zzasiVar2 = zzsVar.zzh;
        zzasiVar2.zzd(motionEvent);
        return false;
    }
}
