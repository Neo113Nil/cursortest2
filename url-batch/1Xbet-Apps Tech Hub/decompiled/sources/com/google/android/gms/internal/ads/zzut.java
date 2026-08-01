package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzut {
    public final int zza;
    public final zzuk zzb;
    private final CopyOnWriteArrayList zzc;

    public zzut() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzut(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzuk zzukVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzukVar;
    }

    public final zzut zza(int i, zzuk zzukVar) {
        return new zzut(this.zzc, 0, zzukVar);
    }

    public final void zzb(Handler handler, zzuu zzuuVar) {
        this.zzc.add(new zzus(handler, zzuuVar));
    }

    public final void zzc(final zzug zzugVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            final zzuu zzuuVar = zzusVar.zzb;
            zzfs.zzJ(zzusVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzun
                @Override // java.lang.Runnable
                public final void run() {
                    zzuuVar.zzae(0, zzut.this.zzb, zzugVar);
                }
            });
        }
    }

    public final void zzd(final zzub zzubVar, final zzug zzugVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            final zzuu zzuuVar = zzusVar.zzb;
            zzfs.zzJ(zzusVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzur
                @Override // java.lang.Runnable
                public final void run() {
                    zzuuVar.zzaf(0, zzut.this.zzb, zzubVar, zzugVar);
                }
            });
        }
    }

    public final void zze(final zzub zzubVar, final zzug zzugVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            final zzuu zzuuVar = zzusVar.zzb;
            zzfs.zzJ(zzusVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzup
                @Override // java.lang.Runnable
                public final void run() {
                    zzuuVar.zzag(0, zzut.this.zzb, zzubVar, zzugVar);
                }
            });
        }
    }

    public final void zzf(final zzub zzubVar, final zzug zzugVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            final zzuu zzuuVar = zzusVar.zzb;
            zzfs.zzJ(zzusVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuq
                @Override // java.lang.Runnable
                public final void run() {
                    zzuuVar.zzah(0, zzut.this.zzb, zzubVar, zzugVar, iOException, z);
                }
            });
        }
    }

    public final void zzg(final zzub zzubVar, final zzug zzugVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            final zzuu zzuuVar = zzusVar.zzb;
            zzfs.zzJ(zzusVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzuo
                @Override // java.lang.Runnable
                public final void run() {
                    zzuuVar.zzai(0, zzut.this.zzb, zzubVar, zzugVar);
                }
            });
        }
    }

    public final void zzh(zzuu zzuuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            if (zzusVar.zzb == zzuuVar) {
                this.zzc.remove(zzusVar);
            }
        }
    }
}
