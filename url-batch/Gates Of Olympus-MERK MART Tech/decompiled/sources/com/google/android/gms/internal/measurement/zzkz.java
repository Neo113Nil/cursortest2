package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zzkz<T> implements zzll<T> {
    private final zzkt zza;
    private final zzmf<?, ?> zzb;
    private final boolean zzc;
    private final zziz<?> zzd;

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zza(T t) {
        zzmf<?, ?> zzmfVar = this.zzb;
        int zzb = zzmfVar.zzb(zzmfVar.zzd(t));
        return this.zzc ? zzb + this.zzd.zza(t).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    static <T> zzkz<T> zza(zzmf<?, ?> zzmfVar, zziz<?> zzizVar, zzkt zzktVar) {
        return new zzkz<>(zzmfVar, zzizVar, zzktVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final T zza() {
        zzkt zzktVar = this.zza;
        if (zzktVar instanceof zzjk) {
            return (T) ((zzjk) zzktVar).zzcd();
        }
        return (T) zzktVar.zzch().zzaj();
    }

    private zzkz(zzmf<?, ?> zzmfVar, zziz<?> zzizVar, zzkt zzktVar) {
        this.zzb = zzmfVar;
        this.zzc = zzizVar.zza(zzktVar);
        this.zzd = zzizVar;
        this.zza = zzktVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(T t, T t2) {
        zzln.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzln.zza(this.zzd, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzli zzliVar, zzix zzixVar) throws IOException {
        boolean z;
        zzmf<?, ?> zzmfVar = this.zzb;
        zziz<?> zzizVar = this.zzd;
        Object zzc = zzmfVar.zzc(t);
        zzjd<?> zzb = zzizVar.zzb(t);
        while (zzliVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzliVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzizVar.zza(zzixVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzizVar.zza(zzliVar, zza, zzixVar, zzb);
                        } else {
                            z = zzmfVar.zza((zzmf<?, ?>) zzc, zzliVar);
                        }
                    } else {
                        z = zzliVar.zzt();
                    }
                    if (z) {
                        return;
                    }
                } else {
                    Object obj = null;
                    int i = 0;
                    zzia zziaVar = null;
                    while (zzliVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzliVar.zzd();
                        if (zzd2 == 16) {
                            i = zzliVar.zzj();
                            obj = zzizVar.zza(zzixVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzizVar.zza(zzliVar, obj, zzixVar, zzb);
                            } else {
                                zziaVar = zzliVar.zzp();
                            }
                        } else if (!zzliVar.zzt()) {
                            break;
                        }
                    }
                    if (zzliVar.zzd() != 12) {
                        throw zzjs.zzb();
                    }
                    if (zziaVar != null) {
                        if (obj != null) {
                            zzizVar.zza(zziaVar, obj, zzixVar, zzb);
                        } else {
                            zzmfVar.zza((zzmf<?, ?>) zzc, i, zziaVar);
                        }
                    }
                }
                z = true;
                if (z) {
                }
            } finally {
                zzmfVar.zzb((Object) t, (T) zzc);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzhv zzhvVar) throws IOException {
        int i3;
        zzjk zzjkVar = (zzjk) t;
        zzme zzmeVar = zzjkVar.zzb;
        if (zzmeVar == zzme.zzc()) {
            zzmeVar = zzme.zzd();
            zzjkVar.zzb = zzmeVar;
        }
        zzme zzmeVar2 = zzmeVar;
        ((zzjk.zzd) t).zza();
        zzjk.zzf zzfVar = null;
        while (i < i2) {
            int zzc = zzhw.zzc(bArr, i, zzhvVar);
            int i4 = zzhvVar.zza;
            if (i4 == 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzhv zzhvVar2 = zzhvVar;
                int i6 = 0;
                zzia zziaVar = null;
                while (true) {
                    if (zzc >= i5) {
                        i3 = zzc;
                        break;
                    }
                    i3 = zzhw.zzc(bArr2, zzc, zzhvVar2);
                    int i7 = zzhvVar2.zza;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (zzfVar != null) {
                                zzlh.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i9 == 2) {
                                zzc = zzhw.zza(bArr2, i3, zzhvVar2);
                                zziaVar = (zzia) zzhvVar2.zzc;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzc = zzhw.zza(i7, bArr2, i3, i5, zzhvVar2);
                        }
                    } else if (i9 == 0) {
                        zzc = zzhw.zzc(bArr2, i3, zzhvVar2);
                        i6 = zzhvVar2.zza;
                        zzfVar = (zzjk.zzf) this.zzd.zza(zzhvVar2.zzd, this.zza, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (zziaVar != null) {
                    zzmeVar2.zza((i6 << 3) | 2, zziaVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                zzhvVar = zzhvVar2;
            } else if ((i4 & 7) == 2) {
                zzfVar = (zzjk.zzf) this.zzd.zza(zzhvVar.zzd, this.zza, i4 >>> 3);
                if (zzfVar != null) {
                    zzlh.zza();
                    throw new NoSuchMethodError();
                }
                i = zzhw.zza(i4, bArr, zzc, i2, zzmeVar2, zzhvVar);
            } else {
                i = zzhw.zza(i4, bArr, zzc, i2, zzhvVar);
            }
        }
        if (i != i2) {
            throw zzjs.zzg();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(T t, zzna zznaVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzjf zzjfVar = (zzjf) next.getKey();
            if (zzjfVar.zzc() != zzmx.MESSAGE || zzjfVar.zze() || zzjfVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzjw) {
                zznaVar.zza(zzjfVar.zza(), (Object) ((zzjw) next).zza().zzb());
            } else {
                zznaVar.zza(zzjfVar.zza(), next.getValue());
            }
        }
        zzmf<?, ?> zzmfVar = this.zzb;
        zzmfVar.zza((zzmf<?, ?>) zzmfVar.zzd(t), zznaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzg();
    }
}
