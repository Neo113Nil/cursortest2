package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC3316J interfaceC3316J;
        zzes zzesVar = this.zza;
        interfaceC3316J = zzesVar.zzd;
        AbstractC3337k.d(interfaceC3316J, null, null, new zzeq(zzesVar, null), 3, null);
    }
}
