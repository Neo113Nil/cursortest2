package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajq implements zzanm {
    private final zzajo zza;

    private zzajq(zzajo zzajoVar) {
        zzajo zzajoVar2 = (zzajo) zzaki.zza(zzajoVar, "output");
        this.zza = zzajoVar2;
        zzajoVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i4, List<Double> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzajt)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).doubleValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zza(list.get(i7).doubleValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).doubleValue());
                i5++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        if (!z4) {
            while (i5 < zzajtVar.size()) {
                this.zza.zzb(i4, zzajtVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzajtVar.size(); i9++) {
            i8 += zzajo.zza(zzajtVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzajtVar.size()) {
            this.zza.zzb(zzajtVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i4, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzakj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zza(list.get(i7).intValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzj(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z4) {
            while (i5 < zzakjVar.size()) {
                this.zza.zzh(i4, zzakjVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakjVar.size(); i9++) {
            i8 += zzajo.zza(zzakjVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakjVar.size()) {
            this.zza.zzj(zzakjVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i4, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzakj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzg(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzb(list.get(i7).intValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzi(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z4) {
            while (i5 < zzakjVar.size()) {
                this.zza.zzg(i4, zzakjVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakjVar.size(); i9++) {
            i8 += zzajo.zzb(zzakjVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakjVar.size()) {
            this.zza.zzi(zzakjVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i4, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaky)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zza(list.get(i7).longValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzf(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z4) {
            while (i5 < zzakyVar.size()) {
                this.zza.zzf(i4, zzakyVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakyVar.size(); i9++) {
            i8 += zzajo.zza(zzakyVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakyVar.size()) {
            this.zza.zzf(zzakyVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzf(int i4, List<Float> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzake)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).floatValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zza(list.get(i7).floatValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).floatValue());
                i5++;
            }
            return;
        }
        zzake zzakeVar = (zzake) list;
        if (!z4) {
            while (i5 < zzakeVar.size()) {
                this.zza.zzb(i4, zzakeVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakeVar.size(); i9++) {
            i8 += zzajo.zza(zzakeVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakeVar.size()) {
            this.zza.zzb(zzakeVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzg(int i4, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzakj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzc(list.get(i7).intValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzj(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z4) {
            while (i5 < zzakjVar.size()) {
                this.zza.zzh(i4, zzakjVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakjVar.size(); i9++) {
            i8 += zzajo.zzc(zzakjVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakjVar.size()) {
            this.zza.zzj(zzakjVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzh(int i4, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaky)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzb(list.get(i7).longValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z4) {
            while (i5 < zzakyVar.size()) {
                this.zza.zzh(i4, zzakyVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakyVar.size(); i9++) {
            i8 += zzajo.zzb(zzakyVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakyVar.size()) {
            this.zza.zzh(zzakyVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzi(int i4, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzakj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzg(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zze(list.get(i7).intValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzi(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z4) {
            while (i5 < zzakjVar.size()) {
                this.zza.zzg(i4, zzakjVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakjVar.size(); i9++) {
            i8 += zzajo.zze(zzakjVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakjVar.size()) {
            this.zza.zzi(zzakjVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzj(int i4, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaky)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzc(list.get(i7).longValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzf(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z4) {
            while (i5 < zzakyVar.size()) {
                this.zza.zzf(i4, zzakyVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakyVar.size(); i9++) {
            i8 += zzajo.zzc(zzakyVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakyVar.size()) {
            this.zza.zzf(zzakyVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzk(int i4, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzakj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzi(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzf(list.get(i7).intValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzk(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z4) {
            while (i5 < zzakjVar.size()) {
                this.zza.zzi(i4, zzakjVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakjVar.size(); i9++) {
            i8 += zzajo.zzf(zzakjVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakjVar.size()) {
            this.zza.zzk(zzakjVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzl(int i4, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaky)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzg(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzd(list.get(i7).longValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzg(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z4) {
            while (i5 < zzakyVar.size()) {
                this.zza.zzg(i4, zzakyVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakyVar.size(); i9++) {
            i8 += zzajo.zzd(zzakyVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakyVar.size()) {
            this.zza.zzg(zzakyVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzm(int i4, List<Integer> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzakj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzk(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zzh(list.get(i7).intValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzl(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z4) {
            while (i5 < zzakjVar.size()) {
                this.zza.zzk(i4, zzakjVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakjVar.size(); i9++) {
            i8 += zzajo.zzh(zzakjVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakjVar.size()) {
            this.zza.zzl(zzakjVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzn(int i4, List<Long> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaky)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzj(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzajo.zze(list.get(i7).longValue());
            }
            this.zza.zzl(i6);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z4) {
            while (i5 < zzakyVar.size()) {
                this.zza.zzh(i4, zzakyVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzj(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzakyVar.size(); i9++) {
            i8 += zzajo.zze(zzakyVar.zzb(i9));
        }
        this.zza.zzl(i8);
        while (i5 < zzakyVar.size()) {
            this.zza.zzh(zzakyVar.zzb(i5));
            i5++;
        }
    }

    public static zzajq zza(zzajo zzajoVar) {
        zzajq zzajqVar = zzajoVar.zza;
        return zzajqVar != null ? zzajqVar : new zzajq(zzajoVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, boolean z4) {
        this.zza.zzb(i4, z4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, List<Boolean> list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzaiu)) {
            if (z4) {
                this.zza.zzj(i4, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    i6 += zzajo.zza(list.get(i7).booleanValue());
                }
                this.zza.zzl(i6);
                while (i5 < list.size()) {
                    this.zza.zzb(list.get(i5).booleanValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                this.zza.zzb(i4, list.get(i5).booleanValue());
                i5++;
            }
            return;
        }
        zzaiu zzaiuVar = (zzaiu) list;
        if (z4) {
            this.zza.zzj(i4, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < zzaiuVar.size(); i9++) {
                i8 += zzajo.zza(zzaiuVar.zzb(i9));
            }
            this.zza.zzl(i8);
            while (i5 < zzaiuVar.size()) {
                this.zza.zzb(zzaiuVar.zzb(i5));
                i5++;
            }
            return;
        }
        while (i5 < zzaiuVar.size()) {
            this.zza.zzb(i4, zzaiuVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i4, int i5) {
        this.zza.zzg(i4, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i4, int i5) {
        this.zza.zzg(i4, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i4, int i5) {
        this.zza.zzi(i4, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzf(int i4, int i5) {
        this.zza.zzk(i4, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i4, long j4) {
        this.zza.zzh(i4, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i4, long j4) {
        this.zza.zzh(i4, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i4, long j4) {
        this.zza.zzg(i4, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i4, Object obj, zzamc zzamcVar) {
        this.zza.zzc(i4, (zzaln) obj, zzamcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, zzaiw zzaiwVar) {
        this.zza.zzc(i4, zzaiwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i4, List<?> list, zzamc zzamcVar) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzb(i4, list.get(i5), zzamcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i4, int i5) {
        this.zza.zzh(i4, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, List<zzaiw> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zzc(i4, list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i4, long j4) {
        this.zza.zzf(i4, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    @Deprecated
    public final void zzb(int i4) {
        this.zza.zzj(i4, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, double d4) {
        this.zza.zzb(i4, d4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i4, List<String> list) {
        int i5 = 0;
        if (list instanceof zzaku) {
            zzaku zzakuVar = (zzaku) list;
            while (i5 < list.size()) {
                Object zza = zzakuVar.zza(i5);
                if (zza instanceof String) {
                    this.zza.zzb(i4, (String) zza);
                } else {
                    this.zza.zzc(i4, (zzaiw) zza);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.zza.zzb(i4, list.get(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    @Deprecated
    public final void zza(int i4) {
        this.zza.zzj(i4, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, int i5) {
        this.zza.zzh(i4, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, long j4) {
        this.zza.zzf(i4, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, float f4) {
        this.zza.zzb(i4, f4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, Object obj, zzamc zzamcVar) {
        zzajo zzajoVar = this.zza;
        zzajoVar.zzj(i4, 3);
        zzamcVar.zza((zzamc) obj, (zzanm) zzajoVar.zza);
        zzajoVar.zzj(i4, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, List<?> list, zzamc zzamcVar) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zza(i4, list.get(i5), zzamcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final <K, V> void zza(int i4, zzale<K, V> zzaleVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i4, 2);
            this.zza.zzl(zzalf.zza(zzaleVar, entry.getKey(), entry.getValue()));
            zzalf.zza(this.zza, zzaleVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, Object obj) {
        if (obj instanceof zzaiw) {
            this.zza.zzd(i4, (zzaiw) obj);
        } else {
            this.zza.zzb(i4, (zzaln) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i4, String str) {
        this.zza.zzb(i4, str);
    }
}
