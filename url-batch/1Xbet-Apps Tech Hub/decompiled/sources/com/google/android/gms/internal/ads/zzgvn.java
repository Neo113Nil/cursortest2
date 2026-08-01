package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgvn implements zzgyh {
    private final zzgvm zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgvn(zzgvm zzgvmVar) {
        byte[] bArr = zzgww.zzd;
        this.zza = zzgvmVar;
        zzgvmVar.zzc = this;
    }

    private final void zzP(Object obj, zzgyp zzgypVar, zzgvy zzgvyVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgypVar.zzh(obj, this, zzgvyVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzgwy.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzgyp zzgypVar, zzgvy zzgvyVar) throws IOException {
        zzgvm zzgvmVar = this.zza;
        int zzn = zzgvmVar.zzn();
        if (zzgvmVar.zza >= zzgvmVar.zzb) {
            throw new zzgwy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = this.zza.zze(zzn);
        this.zza.zza++;
        zzgypVar.zzh(obj, this, zzgvyVar);
        this.zza.zzz(0);
        r4.zza--;
        this.zza.zzA(zze);
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzgwy.zzj();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzgwy.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzgwy.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzgwy.zzg();
        }
    }

    public static zzgvn zzq(zzgvm zzgvmVar) {
        zzgvn zzgvnVar = zzgvmVar.zzc;
        return zzgvnVar != null ? zzgvnVar : new zzgvn(zzgvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzA(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgxl) {
            zzgxl zzgxlVar = (zzgxl) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgxlVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzgxlVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzB(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwf) {
            zzgwf zzgwfVar = (zzgwf) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgwfVar.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i2 != 5) {
                throw zzgwy.zza();
            }
            do {
                zzgwfVar.zze(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i3 != 5) {
                throw zzgwy.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    @Deprecated
    public final void zzC(List list, zzgyp zzgypVar, zzgvy zzgvyVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzgwy.zza();
        }
        do {
            Object zze = zzgypVar.zze();
            zzP(zze, zzgypVar, zzgvyVar);
            zzgypVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzD(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgwnVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgwnVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzE(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgxl) {
            zzgxl zzgxlVar = (zzgxl) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgxlVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgxlVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzF(List list, zzgyp zzgypVar, zzgvy zzgvyVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzgwy.zza();
        }
        do {
            Object zze = zzgypVar.zze();
            zzQ(zze, zzgypVar, zzgvyVar);
            zzgypVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzG(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgwnVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i2 != 5) {
                throw zzgwy.zza();
            }
            do {
                zzgwnVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i3 != 5) {
                throw zzgwy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzH(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgxl) {
            zzgxl zzgxlVar = (zzgxl) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgxlVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzgxlVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzI(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgwnVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgwnVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzJ(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgxl) {
            zzgxl zzgxlVar = (zzgxl) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgxlVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgxlVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzm;
        int i;
        if ((this.zzb & 7) != 2) {
            throw zzgwy.zza();
        }
        if ((list instanceof zzgxe) && !z) {
            zzgxe zzgxeVar = (zzgxe) list;
            do {
                zzgxeVar.zzi(zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzL(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgwnVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgwnVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzM(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgxl) {
            zzgxl zzgxlVar = (zzgxl) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgxlVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgxlVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final boolean zzO() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzm();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final zzgve zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzt(Object obj, zzgyp zzgypVar, zzgvy zzgvyVar) throws IOException {
        zzS(3);
        zzP(obj, zzgypVar, zzgvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzu(Object obj, zzgyp zzgypVar, zzgvy zzgvyVar) throws IOException {
        zzS(2);
        zzQ(obj, zzgypVar, zzgvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzv(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgus) {
            zzgus zzgusVar = (zzgus) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgusVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgusVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgwy.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzx(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgvv) {
            zzgvv zzgvvVar = (zzgvv) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgvvVar.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzgvvVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzy(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar = this.zza;
                int zzd = zzgvmVar.zzd() + zzgvmVar.zzn();
                do {
                    zzgwnVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzgwnVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzgwy.zza();
                }
                zzgvm zzgvmVar2 = this.zza;
                int zzd2 = zzgvmVar2.zzd() + zzgvmVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzz(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzgwnVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i2 != 5) {
                throw zzgwy.zza();
            }
            do {
                zzgwnVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i3 != 5) {
                throw zzgwy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }
}
