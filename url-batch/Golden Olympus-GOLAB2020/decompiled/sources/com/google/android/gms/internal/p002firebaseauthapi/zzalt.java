package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzalt<T> implements zzamc<T> {
    private final zzaln zza;
    private final zzamv<?, ?> zzb;
    private final boolean zzc;
    private final zzajx<?> zzd;

    private zzalt(zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzaln zzalnVar) {
        this.zzb = zzamvVar;
        this.zzc = zzajxVar.zza(zzalnVar);
        this.zzd = zzajxVar;
        this.zza = zzalnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zza(T t4) {
        zzamv<?, ?> zzamvVar = this.zzb;
        int zzb = zzamvVar.zzb(zzamvVar.zzd(t4));
        return this.zzc ? zzb + this.zzd.zza(t4).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zzb(T t4) {
        int hashCode = this.zzb.zzd(t4).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t4).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zzd(T t4) {
        this.zzb.zzf(t4);
        this.zzd.zzc(t4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final boolean zze(T t4) {
        return this.zzd.zza(t4).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final boolean zzb(T t4, T t5) {
        if (!this.zzb.zzd(t4).equals(this.zzb.zzd(t5))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t4).equals(this.zzd.zza(t5));
        }
        return true;
    }

    static <T> zzalt<T> zza(zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzaln zzalnVar) {
        return new zzalt<>(zzamvVar, zzajxVar, zzalnVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final T zza() {
        zzaln zzalnVar = this.zza;
        if (zzalnVar instanceof zzakg) {
            return (T) ((zzakg) zzalnVar).zzo();
        }
        return (T) zzalnVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t4, T t5) {
        zzame.zza(this.zzb, t4, t5);
        if (this.zzc) {
            zzame.zza(this.zzd, t4, t5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t4, zzamd zzamdVar, zzajv zzajvVar) {
        boolean z4;
        zzamv<?, ?> zzamvVar = this.zzb;
        zzajx<?> zzajxVar = this.zzd;
        Object zzc = zzamvVar.zzc(t4);
        zzajy<?> zzb = zzajxVar.zzb(t4);
        while (zzamdVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzamdVar.zzd();
                int i4 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzajxVar.zza(zzajvVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzajxVar.zza(zzamdVar, zza, zzajvVar, zzb);
                        } else {
                            z4 = zzamvVar.zza((zzamv<?, ?>) zzc, zzamdVar, 0);
                        }
                    } else {
                        z4 = zzamdVar.zzt();
                    }
                    if (z4) {
                        zzamvVar.zzb((Object) t4, (T) zzc);
                        return;
                    }
                } else {
                    Object obj = null;
                    zzaiw zzaiwVar = null;
                    while (zzamdVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzamdVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzamdVar.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzajxVar.zza(zzamdVar, obj, zzajvVar, zzb);
                            } else {
                                zzaiwVar = zzamdVar.zzp();
                            }
                        } else {
                            i4 = zzamdVar.zzj();
                            obj = zzajxVar.zza(zzajvVar, this.zza, i4);
                        }
                    }
                    if (zzamdVar.zzd() != 12) {
                        throw zzakm.zzb();
                    }
                    if (zzaiwVar != null) {
                        if (obj != null) {
                            zzajxVar.zza(zzaiwVar, obj, zzajvVar, zzb);
                        } else {
                            zzamvVar.zza((zzamv<?, ?>) zzc, i4, zzaiwVar);
                        }
                    }
                }
                z4 = true;
                if (z4) {
                }
            } catch (Throwable th) {
                zzamvVar.zzb((Object) t4, (T) zzc);
                throw th;
            }
        }
        zzamvVar.zzb((Object) t4, (T) zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t4, byte[] bArr, int i4, int i5, zzaiv zzaivVar) {
        int i6;
        zzakg zzakgVar = (zzakg) t4;
        zzamy zzamyVar = zzakgVar.zzb;
        if (zzamyVar == zzamy.zzc()) {
            zzamyVar = zzamy.zzd();
            zzakgVar.zzb = zzamyVar;
        }
        zzamy zzamyVar2 = zzamyVar;
        ((zzakg.zzd) t4).zza();
        zzakg.zzf zzfVar = null;
        while (i4 < i5) {
            int zzc = zzais.zzc(bArr, i4, zzaivVar);
            int i7 = zzaivVar.zza;
            if (i7 == 11) {
                byte[] bArr2 = bArr;
                int i8 = i5;
                zzaiv zzaivVar2 = zzaivVar;
                int i9 = 0;
                zzaiw zzaiwVar = null;
                while (true) {
                    if (zzc >= i8) {
                        i6 = zzc;
                        break;
                    }
                    i6 = zzais.zzc(bArr2, zzc, zzaivVar2);
                    int i10 = zzaivVar2.zza;
                    int i11 = i10 >>> 3;
                    int i12 = i10 & 7;
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (zzfVar != null) {
                                zzaly.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i12 == 2) {
                                zzc = zzais.zza(bArr2, i6, zzaivVar2);
                                zzaiwVar = (zzaiw) zzaivVar2.zzc;
                            }
                        }
                        if (i10 != 12) {
                            break;
                        } else {
                            zzc = zzais.zza(i10, bArr2, i6, i8, zzaivVar2);
                        }
                    } else if (i12 == 0) {
                        zzc = zzais.zzc(bArr2, i6, zzaivVar2);
                        i9 = zzaivVar2.zza;
                        zzfVar = (zzakg.zzf) this.zzd.zza(zzaivVar2.zzd, this.zza, i9);
                    } else if (i10 != 12) {
                    }
                }
                if (zzaiwVar != null) {
                    zzamyVar2.zza((i9 << 3) | 2, zzaiwVar);
                }
                i4 = i6;
                bArr = bArr2;
                i5 = i8;
                zzaivVar = zzaivVar2;
            } else if ((i7 & 7) == 2) {
                zzfVar = (zzakg.zzf) this.zzd.zza(zzaivVar.zzd, this.zza, i7 >>> 3);
                if (zzfVar == null) {
                    i4 = zzais.zza(i7, bArr, zzc, i5, zzamyVar2, zzaivVar);
                } else {
                    zzaly.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i4 = zzais.zza(i7, bArr, zzc, i5, zzaivVar);
            }
        }
        if (i4 != i5) {
            throw zzakm.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t4, zzanm zzanmVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t4).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzaka zzakaVar = (zzaka) next.getKey();
            if (zzakaVar.zzc() == zzank.MESSAGE && !zzakaVar.zze() && !zzakaVar.zzd()) {
                if (next instanceof zzakq) {
                    zzanmVar.zza(zzakaVar.zza(), (Object) ((zzakq) next).zza().zzb());
                } else {
                    zzanmVar.zza(zzakaVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzamv<?, ?> zzamvVar = this.zzb;
        zzamvVar.zza((zzamv<?, ?>) zzamvVar.zzd(t4), zzanmVar);
    }
}
