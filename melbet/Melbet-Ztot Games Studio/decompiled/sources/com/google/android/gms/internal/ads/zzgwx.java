package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzgwx implements zzgzw {
    private final zzgww zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwx(zzgww zzgwwVar) {
        zzgyl.zzc(zzgwwVar, "input");
        this.zza = zzgwwVar;
        zzgwwVar.zzc = this;
    }

    private final void zzO(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhaeVar.zzh(obj, this, zzgxiVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzgyn.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzP(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) throws IOException {
        zzgww zzgwwVar = this.zza;
        int zzm = zzgwwVar.zzm();
        if (zzgwwVar.zza >= zzgwwVar.zzb) {
            throw new zzgyn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzd = this.zza.zzd(zzm);
        this.zza.zza++;
        zzhaeVar.zzh(obj, this, zzgxiVar);
        this.zza.zzy(0);
        r4.zza--;
        this.zza.zzz(zzd);
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw zzgyn.zzi();
        }
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzgyn.zza();
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzgyn.zzg();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzgyn.zzg();
        }
    }

    public static zzgwx zzq(zzgww zzgwwVar) {
        zzgwx zzgwxVar = zzgwwVar.zzc;
        return zzgwxVar != null ? zzgwxVar : new zzgwx(zzgwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzA(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgyyVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzgyyVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzB(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxp) {
            zzgxp zzgxpVar = (zzgxp) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxpVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i2 != 5) {
                throw zzgyn.zza();
            }
            do {
                zzgxpVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i3 != 5) {
                throw zzgyn.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    @Deprecated
    public final void zzC(List list, zzhae zzhaeVar, zzgxi zzgxiVar) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzgyn.zza();
        }
        do {
            Object zze = zzhaeVar.zze();
            zzO(zze, zzhaeVar, zzgxiVar);
            zzhaeVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == i);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzD(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgxzVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxzVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzE(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgyyVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgyyVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzF(List list, zzhae zzhaeVar, zzgxi zzgxiVar) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzgyn.zza();
        }
        do {
            Object zze = zzhaeVar.zze();
            zzP(zze, zzhaeVar, zzgxiVar);
            zzhaeVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == i);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzG(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxzVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i2 != 5) {
                throw zzgyn.zza();
            }
            do {
                zzgxzVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i3 != 5) {
                throw zzgyn.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzH(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgyyVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzgyyVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzI(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgxzVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxzVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzJ(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgyyVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgyyVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzl;
        int i;
        if ((this.zzb & 7) != 2) {
            throw zzgyn.zza();
        }
        if ((list instanceof zzgyv) && !z) {
            zzgyv zzgyvVar = (zzgyv) list;
            do {
                zzp();
                zzgyvVar.zzb();
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzL(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgxzVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxzVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzM(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgyyVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgyyVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzl();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final zzgwm zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzt(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) throws IOException {
        zzR(3);
        zzO(obj, zzhaeVar, zzgxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzu(Object obj, zzhae zzhaeVar, zzgxi zzgxiVar) throws IOException {
        zzR(2);
        zzP(obj, zzhaeVar, zzgxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzv(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgwc) {
            zzgwc zzgwcVar = (zzgwc) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgwcVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgwcVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) != 2) {
            throw zzgyn.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == this.zzb);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzx(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxf) {
            zzgxf zzgxfVar = (zzgxf) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxfVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzgxfVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzy(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar = this.zza;
                int zzc = zzgwwVar.zzc() + zzgwwVar.zzm();
                do {
                    zzgxzVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxzVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgyn.zza();
                }
                zzgww zzgwwVar2 = this.zza;
                int zzc2 = zzgwwVar2.zzc() + zzgwwVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzz(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxzVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i2 != 5) {
                throw zzgyn.zza();
            }
            do {
                zzgxzVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i = this.zza.zzl();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i3 != 5) {
                throw zzgyn.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }
}
