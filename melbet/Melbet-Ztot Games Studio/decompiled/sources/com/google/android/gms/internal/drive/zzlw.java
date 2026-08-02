package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzlw<T> implements zzmf<T> {
    private final zzlq zzuh;
    private final boolean zzui;
    private final zzmx<?, ?> zzur;
    private final zzjy<?> zzus;

    private zzlw(zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzlq zzlqVar) {
        this.zzur = zzmxVar;
        this.zzui = zzjyVar.zze(zzlqVar);
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
    }

    static <T> zzlw<T> zza(zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzlq zzlqVar) {
        return new zzlw<>(zzmxVar, zzjyVar, zzlqVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzuh.zzcz().zzde();
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T t, T t2) {
        if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
            return false;
        }
        if (this.zzui) {
            return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int hashCode = this.zzur.zzr(t).hashCode();
        return this.zzui ? (hashCode * 53) + this.zzus.zzb(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            zzmh.zza(this.zzus, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, zzns zznsVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzus.zzb(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzkd zzkdVar = (zzkd) next.getKey();
            if (zzkdVar.zzcr() != zznr.MESSAGE || zzkdVar.zzcs() || zzkdVar.zzct()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzkv) {
                zznsVar.zza(zzkdVar.zzcp(), (Object) ((zzkv) next).zzdq().zzbl());
            } else {
                zznsVar.zza(zzkdVar.zzcp(), next.getValue());
            }
        }
        zzmx<?, ?> zzmxVar = this.zzur;
        zzmxVar.zzc(zzmxVar.zzr(t), zznsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zziz zzizVar) throws IOException {
        zzkk zzkkVar = (zzkk) t;
        zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar == zzmy.zzfa()) {
            zzmyVar = zzmy.zzfb();
            zzkkVar.zzrq = zzmyVar;
        }
        ((zzkk.zzc) t).zzdg();
        zzkk.zzd zzdVar = null;
        while (i < i2) {
            int zza = zziy.zza(bArr, i, zzizVar);
            int i3 = zzizVar.zznk;
            if (i3 == 11) {
                int i4 = 0;
                zzjc zzjcVar = null;
                while (zza < i2) {
                    zza = zziy.zza(bArr, zza, zzizVar);
                    int i5 = zzizVar.zznk;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zzdVar != null) {
                                zzmd.zzej();
                                throw new NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                zza = zziy.zze(bArr, zza, zzizVar);
                                zzjcVar = (zzjc) zzizVar.zznm;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            zza = zziy.zza(i5, bArr, zza, i2, zzizVar);
                        }
                    } else if (i7 == 0) {
                        zza = zziy.zza(bArr, zza, zzizVar);
                        i4 = zzizVar.zznk;
                        zzdVar = (zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzjcVar != null) {
                    zzmyVar.zzb((i4 << 3) | 2, zzjcVar);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                zzdVar = (zzkk.zzd) this.zzus.zza(zzizVar.zznn, this.zzuh, i3 >>> 3);
                if (zzdVar != null) {
                    zzmd.zzej();
                    throw new NoSuchMethodError();
                }
                i = zziy.zza(i3, bArr, zza, i2, zzmyVar, zzizVar);
            } else {
                i = zziy.zza(i3, bArr, zza, i2, zzizVar);
            }
        }
        if (i != i2) {
            throw zzkq.zzdm();
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        this.zzur.zzd(t);
        this.zzus.zzd(t);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        return this.zzus.zzb(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        zzmx<?, ?> zzmxVar = this.zzur;
        int zzs = zzmxVar.zzs(zzmxVar.zzr(t));
        return this.zzui ? zzs + this.zzus.zzb(t).zzco() : zzs;
    }
}
