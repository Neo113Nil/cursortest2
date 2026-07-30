package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgq {
    private final zzgp zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzgo zzf;

    public zzgq(zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    private final void zzf(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i) {
                return;
            }
            zzgo zzgoVar = (zzgo) priorityQueue.poll();
            String str = zzfj.zza;
            int i2 = 0;
            while (true) {
                list = zzgoVar.zza;
                if (i2 >= list.size()) {
                    break;
                }
                this.zza.zza(zzgoVar.zzb, (zzer) list.get(i2));
                this.zzb.push((zzer) list.get(i2));
                i2++;
            }
            list.clear();
            zzgo zzgoVar2 = this.zzf;
            if (zzgoVar2 != null && zzgoVar2.zzb == zzgoVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzgoVar);
        }
    }

    public final void zza(int i) {
        zzgrc.zzi(i >= 0);
        this.zze = i;
        zzf(i);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, zzer zzerVar) {
        if (j != -9223372036854775807L) {
            int i = this.zze;
            if (i != 0) {
                if (i != -1) {
                    PriorityQueue priorityQueue = this.zzd;
                    if (priorityQueue.size() >= this.zze) {
                        zzgo zzgoVar = (zzgo) priorityQueue.peek();
                        String str = zzfj.zza;
                    }
                }
                ArrayDeque arrayDeque = this.zzb;
                zzer zzerVar2 = arrayDeque.isEmpty() ? new zzer() : (zzer) arrayDeque.pop();
                zzerVar2.zza(zzerVar.zzd());
                System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), zzerVar2.zzi(), 0, zzerVar2.zzd());
                zzgo zzgoVar2 = this.zzf;
                if (zzgoVar2 != null && j == zzgoVar2.zzb) {
                    zzgoVar2.zza.add(zzerVar2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.zzc;
                zzgo zzgoVar3 = arrayDeque2.isEmpty() ? new zzgo() : (zzgo) arrayDeque2.pop();
                List list = zzgoVar3.zza;
                zzgrc.zzi(list.isEmpty());
                zzgoVar3.zzb = j;
                list.add(zzerVar2);
                this.zzd.add(zzgoVar3);
                this.zzf = zzgoVar3;
                int i2 = this.zze;
                if (i2 != -1) {
                    zzf(i2);
                    return;
                }
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        this.zza.zza(j, zzerVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
