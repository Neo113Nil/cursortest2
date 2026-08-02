package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzo implements View.OnTouchListener {
    final /* synthetic */ zzt zza;

    zzo(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzauo zzauoVar;
        zzauo zzauoVar2;
        zzt zztVar = this.zza;
        zzauoVar = zztVar.zzh;
        if (zzauoVar == null) {
            return false;
        }
        zzauoVar2 = zztVar.zzh;
        zzauoVar2.zzd(motionEvent);
        return false;
    }
}
