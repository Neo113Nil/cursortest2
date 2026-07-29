package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzxj implements Runnable {
    private final /* synthetic */ zzxh zzbuk;
    private final /* synthetic */ zzanz zzbul;

    zzxj(zzxh zzxhVar, zzanz zzanzVar) {
        this.zzbuk = zzxhVar;
        this.zzbul = zzanzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        map = this.zzbuk.zzbug;
        for (zzanz zzanzVar : map.keySet()) {
            if (zzanzVar != this.zzbul) {
                map2 = this.zzbuk.zzbug;
                ((zzxb) map2.get(zzanzVar)).cancel();
            }
        }
    }
}
