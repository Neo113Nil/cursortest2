package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int zzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzna) obj).zzb.zzb() : zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int hashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        boolean zzO;
        zzpl zzplVar = this.zzb;
        Object zza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzovVar.zzd();
                int i4 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) != 2) {
                        zzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, zzd >>> 3) != null) {
                            throw null;
                        }
                        zzO = zzplVar.zzk(zza, zzovVar, 0);
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    zznc zzncVar = null;
                    zzle zzleVar = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzovVar.zzd();
                        if (zzd2 == 16) {
                            i4 = zzovVar.zzj();
                            zzncVar = zzmoVar.zza(this.zza, i4);
                        } else if (zzd2 == 26) {
                            if (zzncVar != null) {
                                throw null;
                            }
                            zzleVar = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVar == null) {
                        continue;
                    } else {
                        if (zzncVar != null) {
                            throw null;
                        }
                        zzplVar.zzg(zza, i4, zzleVar);
                    }
                }
            } finally {
                zzplVar.zzj(obj, zza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[EDGE_INSN: B:24:0x008b->B:25:0x008b BREAK  A[LOOP:1: B:10:0x004f->B:18:0x004f], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i4, int i5, zzkt zzktVar) {
        int i6;
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar == zzpm.zzc()) {
            zzpmVar = zzpm.zzf();
            zzndVar.zzc = zzpmVar;
        }
        zzpm zzpmVar2 = zzpmVar;
        ((zzna) obj).zzi();
        zznc zzncVar = null;
        while (i4 < i5) {
            int zzi = zzku.zzi(bArr, i4, zzktVar);
            int i7 = zzktVar.zza;
            if (i7 == 11) {
                byte[] bArr2 = bArr;
                int i8 = i5;
                zzkt zzktVar2 = zzktVar;
                int i9 = 0;
                zzle zzleVar = null;
                while (true) {
                    if (zzi >= i8) {
                        i6 = zzi;
                        break;
                    }
                    i6 = zzku.zzi(bArr2, zzi, zzktVar2);
                    int i10 = zzktVar2.zza;
                    int i11 = i10 >>> 3;
                    int i12 = i10 & 7;
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (zzncVar != null) {
                                int i13 = zzos.zza;
                                throw null;
                            }
                            if (i12 == 2) {
                                zzi = zzku.zza(bArr2, i6, zzktVar2);
                                zzleVar = (zzle) zzktVar2.zzc;
                            }
                        }
                        if (i10 != 12) {
                            break;
                        } else {
                            zzi = zzku.zzo(i10, bArr2, i6, i8, zzktVar2);
                        }
                    } else if (i12 == 0) {
                        zzi = zzku.zzi(bArr2, i6, zzktVar2);
                        i9 = zzktVar2.zza;
                        zzncVar = zzktVar2.zzd.zza(this.zza, i9);
                    } else if (i10 != 12) {
                    }
                }
                if (zzleVar != null) {
                    zzpmVar2.zzj((i9 << 3) | 2, zzleVar);
                }
                i4 = i6;
                bArr = bArr2;
                i5 = i8;
                zzktVar = zzktVar2;
            } else if ((i7 & 7) == 2) {
                zzncVar = zzktVar.zzd.zza(this.zza, i7 >>> 3);
                if (zzncVar != null) {
                    int i14 = zzos.zza;
                    throw null;
                }
                i4 = zzku.zzh(i7, bArr, zzi, i5, zzpmVar2, zzktVar);
            } else {
                i4 = zzku.zzo(i7, bArr, zzi, i5, zzktVar);
            }
        }
        if (i4 != i5) {
            throw new zznn("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) {
        Iterator zzf = ((zzna) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
