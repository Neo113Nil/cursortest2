package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzzf {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzze) obj).zza - ((zzze) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzze) obj).zzc, ((zzze) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzze[] zzd = new zzze[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzf(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            float f3 = 0.5f * f2;
            zzze zzzeVar = (zzze) this.zzc.get(i2);
            i += zzzeVar.zzb;
            if (i >= f3) {
                return zzzeVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzze) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzze zzzeVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzze[] zzzeVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzzeVar = zzzeVarArr[i3];
        } else {
            zzzeVar = new zzze(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzzeVar.zza = i4;
        zzzeVar.zzb = i;
        zzzeVar.zzc = f;
        this.zzc.add(zzzeVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzze zzzeVar2 = (zzze) this.zzc.get(0);
            int i7 = zzzeVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzze[] zzzeVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzzeVarArr2[i8] = zzzeVar2;
                }
            } else {
                zzzeVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
