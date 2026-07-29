package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzci;

/* loaded from: classes.dex */
final class zzbr implements View.OnTouchListener {
    private final /* synthetic */ zzbp zzaba;

    zzbr(zzbp zzbpVar) {
        this.zzaba = zzbpVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzci zzciVar;
        zzci zzciVar2;
        zzciVar = this.zzaba.zzaay;
        if (zzciVar == null) {
            return false;
        }
        zzciVar2 = this.zzaba.zzaay;
        zzciVar2.zza(motionEvent);
        return false;
    }
}
