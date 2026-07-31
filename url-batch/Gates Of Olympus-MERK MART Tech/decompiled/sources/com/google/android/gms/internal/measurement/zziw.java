package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zziw implements zzna {
    private final zzit zza;

    public static zziw zza(zzit zzitVar) {
        return zzitVar.zza != null ? zzitVar.zza : new zziw(zzitVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final int zza() {
        return 1;
    }

    private zziw(zzit zzitVar) {
        zzit zzitVar2 = (zzit) zzjm.zza(zzitVar, "output");
        this.zza = zzitVar2;
        zzitVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, boolean z) throws IOException {
        this.zza.zza(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhy)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zza(list.get(i4).booleanValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zza(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        zzhy zzhyVar = (zzhy) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzhyVar.size(); i6++) {
                i5 += zzit.zza(zzhyVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzhyVar.size()) {
                this.zza.zzb(zzhyVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzhyVar.size()) {
            this.zza.zza(i, zzhyVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, zzia zziaVar) throws IOException {
        this.zza.zza(i, zziaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, List<zzia> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, double d) throws IOException {
        this.zza.zzb(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zziv)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zza(list.get(i4).doubleValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        zziv zzivVar = (zziv) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzivVar.size(); i6++) {
                i5 += zzit.zza(zzivVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzivVar.size()) {
                this.zza.zzb(zzivVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzivVar.size()) {
            this.zza.zzb(i, zzivVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    @Deprecated
    public final void zza(int i) throws IOException {
        this.zza.zzc(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzc(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjn)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzd(list.get(i4).intValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjnVar.size(); i6++) {
                i5 += zzit.zzd(zzjnVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjnVar.size()) {
                this.zza.zzb(zzjnVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjnVar.size()) {
            this.zza.zzb(i, zzjnVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zza(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzd(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjn)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zze(list.get(i4).intValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zza(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zza(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjnVar.size(); i6++) {
                i5 += zzit.zze(zzjnVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjnVar.size()) {
                this.zza.zza(zzjnVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjnVar.size()) {
            this.zza.zza(i, zzjnVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzke)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzc(list.get(i4).longValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zza(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzke zzkeVar = (zzke) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzkeVar.size(); i6++) {
                i5 += zzit.zzc(zzkeVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzkeVar.size()) {
                this.zza.zza(zzkeVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzkeVar.size()) {
            this.zza.zza(i, zzkeVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, float f) throws IOException {
        this.zza.zzb(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjj)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zza(list.get(i4).floatValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        zzjj zzjjVar = (zzjj) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjjVar.size(); i6++) {
                i5 += zzit.zza(zzjjVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjjVar.size()) {
                this.zza.zzb(zzjjVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjjVar.size()) {
            this.zza.zzb(i, zzjjVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, Object obj, zzll zzllVar) throws IOException {
        zzit zzitVar = this.zza;
        zzitVar.zzc(i, 3);
        zzllVar.zza((zzll) obj, (zzna) zzitVar.zza);
        zzitVar.zzc(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, List<?> list, zzll zzllVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzllVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzc(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzg(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjn)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzf(list.get(i4).intValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjnVar.size(); i6++) {
                i5 += zzit.zzf(zzjnVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjnVar.size()) {
                this.zza.zzb(zzjnVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjnVar.size()) {
            this.zza.zzb(i, zzjnVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i, long j) throws IOException {
        this.zza.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzh(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzke)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzd(list.get(i4).longValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzke zzkeVar = (zzke) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzkeVar.size(); i6++) {
                i5 += zzit.zzd(zzkeVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzkeVar.size()) {
                this.zza.zzb(zzkeVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzkeVar.size()) {
            this.zza.zzb(i, zzkeVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final <K, V> void zza(int i, zzkk<K, V> zzkkVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i, 2);
            this.zza.zzc(zzkl.zza(zzkkVar, entry.getKey(), entry.getValue()));
            zzkl.zza(this.zza, zzkkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i, Object obj, zzll zzllVar) throws IOException {
        this.zza.zza(i, (zzkt) obj, zzllVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i, List<?> list, zzll zzllVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzllVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzia) {
            this.zza.zzb(i, (zzia) obj);
        } else {
            this.zza.zza(i, (zzkt) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzd(int i, int i2) throws IOException {
        this.zza.zza(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzi(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjn)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzg(list.get(i4).intValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zza(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zza(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjnVar.size(); i6++) {
                i5 += zzit.zzg(zzjnVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjnVar.size()) {
                this.zza.zza(zzjnVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjnVar.size()) {
            this.zza.zza(i, zzjnVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzc(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzj(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzke)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zze(list.get(i4).longValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zza(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzke zzkeVar = (zzke) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzkeVar.size(); i6++) {
                i5 += zzit.zze(zzkeVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzkeVar.size()) {
                this.zza.zza(zzkeVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzkeVar.size()) {
            this.zza.zza(i, zzkeVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zze(int i, int i2) throws IOException {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjn)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzh(list.get(i4).intValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzk(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzk(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjnVar.size(); i6++) {
                i5 += zzit.zzh(zzjnVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjnVar.size()) {
                this.zza.zzk(zzjnVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjnVar.size()) {
            this.zza.zzk(i, zzjnVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzke)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzf(list.get(i4).longValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzh(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzke zzkeVar = (zzke) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzkeVar.size(); i6++) {
                i5 += zzit.zzf(zzkeVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzkeVar.size()) {
                this.zza.zzh(zzkeVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzkeVar.size()) {
            this.zza.zzh(i, zzkeVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    @Deprecated
    public final void zzb(int i) throws IOException {
        this.zza.zzc(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i, String str) throws IOException {
        this.zza.zza(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            while (i2 < list.size()) {
                Object zza = zzkaVar.zza(i2);
                if (zza instanceof String) {
                    this.zza.zza(i, (String) zza);
                } else {
                    this.zza.zza(i, (zzia) zza);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzf(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjn)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzj(list.get(i4).intValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzc(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzd(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzjnVar.size(); i6++) {
                i5 += zzit.zzj(zzjnVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzjnVar.size()) {
                this.zza.zzc(zzjnVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjnVar.size()) {
            this.zza.zzd(i, zzjnVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zze(int i, long j) throws IOException {
        this.zza.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzke)) {
            if (z) {
                this.zza.zzc(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzit.zzg(list.get(i4).longValue());
                }
                this.zza.zzc(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzke zzkeVar = (zzke) list;
        if (z) {
            this.zza.zzc(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzkeVar.size(); i6++) {
                i5 += zzit.zzg(zzkeVar.zzb(i6));
            }
            this.zza.zzc(i5);
            while (i2 < zzkeVar.size()) {
                this.zza.zzb(zzkeVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzkeVar.size()) {
            this.zza.zzb(i, zzkeVar.zzb(i2));
            i2++;
        }
    }
}
