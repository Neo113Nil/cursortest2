package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC3316J interfaceC3316J;
        zzan zzanVar = this.zza;
        interfaceC3316J = zzanVar.zzb;
        AbstractC3337k.d(interfaceC3316J, null, null, new zzaj(zzanVar, null), 3, null);
    }
}
