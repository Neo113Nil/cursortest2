package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzahl implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzahj
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzahl.zza;
            return new zzace[]{new zzahl(0)};
        }
    };
    private static final zzafy zzb = new zzafy() { // from class: com.google.android.gms.internal.ads.zzahk
    };
    private final zzfj zzc;
    private final zzacy zzd;
    private final zzacu zze;
    private final zzacw zzf;
    private final zzadk zzg;
    private zzach zzh;
    private zzadk zzi;
    private zzadk zzj;
    private int zzk;
    private zzcb zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzahn zzq;
    private boolean zzr;

    public zzahl() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e9  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzf(zzacf zzacfVar) throws IOException {
        int i;
        int i2;
        zzahp zzb2;
        zzahn zzh;
        int i3;
        int i4;
        zzcb zzcbVar;
        zzahi zzahiVar;
        long j;
        if (this.zzk == 0) {
            try {
                zzk(zzacfVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzfj zzfjVar = new zzfj(this.zzd.zzc);
            zzabu zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(zzfjVar.zzI(), 0, this.zzd.zzc, false);
            zzacy zzacyVar = this.zzd;
            int i5 = 21;
            if ((zzacyVar.zza & 1) != 0) {
                if (zzacyVar.zze != 1) {
                    i = 36;
                    if (zzfjVar.zzd() >= i + 4) {
                        zzfjVar.zzG(i);
                        int zzf = zzfjVar.zzf();
                        if (zzf == 1483304551) {
                            i2 = zzf;
                        } else if (zzf == 1231971951) {
                            i2 = 1231971951;
                        }
                        if (i2 != 1483304551 || i2 == 1231971951) {
                            int i6 = i2;
                            zzb2 = zzahp.zzb(zzacfVar.zzd(), zzacfVar.zzf(), this.zzd, zzfjVar);
                            if (zzb2 != null && !this.zze.zza()) {
                                zzacfVar.zzj();
                                zzabuVar.zzl(i + Opcodes.F2D, false);
                                zzabuVar.zzm(this.zzc.zzI(), 0, 3, false);
                                this.zzc.zzG(0);
                                zzacu zzacuVar = this.zze;
                                int zzn = this.zzc.zzn();
                                i3 = zzn >> 12;
                                i4 = zzn & 4095;
                                if (i3 <= 0 || i4 > 0) {
                                    zzacuVar.zza = i3;
                                    zzacuVar.zzb = i4;
                                }
                            }
                            zzabuVar.zzo(this.zzd.zzc, false);
                            zzh = (zzb2 == null && !zzb2.zzh() && i6 == 1231971951) ? zzh(zzacfVar, false) : zzb2;
                        } else if (i2 == 1447187017) {
                            zzh = zzaho.zzb(zzacfVar.zzd(), zzacfVar.zzf(), this.zzd, zzfjVar);
                            zzabuVar.zzo(this.zzd.zzc, false);
                        } else {
                            zzacfVar.zzj();
                            zzh = null;
                        }
                        zzcbVar = this.zzl;
                        long zzf2 = zzacfVar.zzf();
                        if (zzcbVar != null) {
                            int zza2 = zzcbVar.zza();
                            for (int i7 = 0; i7 < zza2; i7++) {
                                zzca zzb3 = zzcbVar.zzb(i7);
                                if (zzb3 instanceof zzagf) {
                                    zzagf zzagfVar = (zzagf) zzb3;
                                    int zza3 = zzcbVar.zza();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= zza3) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzca zzb4 = zzcbVar.zzb(i8);
                                        if (zzb4 instanceof zzagj) {
                                            zzagj zzagjVar = (zzagj) zzb4;
                                            if (zzagjVar.zzf.equals("TLEN")) {
                                                j = zzfs.zzq(Long.parseLong((String) zzagjVar.zzc.get(0)));
                                                break;
                                            }
                                        }
                                        i8++;
                                    }
                                    zzahiVar = zzahi.zzb(zzf2, zzagfVar, j);
                                    if (this.zzr) {
                                        zzh = new zzahm();
                                    } else {
                                        if (zzahiVar != null) {
                                            zzh = zzahiVar;
                                        } else if (zzh == null) {
                                            zzh = null;
                                        }
                                        if (zzh != null) {
                                            zzh.zzh();
                                        } else {
                                            zzh = zzh(zzacfVar, false);
                                        }
                                    }
                                    this.zzq = zzh;
                                    this.zzh.zzO(zzh);
                                    zzadk zzadkVar = this.zzj;
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzU(this.zzd.zzb);
                                    zzakVar.zzN(4096);
                                    zzakVar.zzy(this.zzd.zze);
                                    zzakVar.zzV(this.zzd.zzd);
                                    zzakVar.zzE(this.zze.zza);
                                    zzakVar.zzF(this.zze.zzb);
                                    zzakVar.zzO(this.zzl);
                                    zzadkVar.zzl(zzakVar.zzac());
                                    this.zzo = zzacfVar.zzf();
                                }
                            }
                        }
                        zzahiVar = null;
                        if (this.zzr) {
                        }
                        this.zzq = zzh;
                        this.zzh.zzO(zzh);
                        zzadk zzadkVar2 = this.zzj;
                        zzak zzakVar2 = new zzak();
                        zzakVar2.zzU(this.zzd.zzb);
                        zzakVar2.zzN(4096);
                        zzakVar2.zzy(this.zzd.zze);
                        zzakVar2.zzV(this.zzd.zzd);
                        zzakVar2.zzE(this.zze.zza);
                        zzakVar2.zzF(this.zze.zzb);
                        zzakVar2.zzO(this.zzl);
                        zzadkVar2.zzl(zzakVar2.zzac());
                        this.zzo = zzacfVar.zzf();
                    }
                    if (zzfjVar.zzd() >= 40) {
                        zzfjVar.zzG(36);
                        if (zzfjVar.zzf() == 1447187017) {
                            i2 = 1447187017;
                            if (i2 != 1483304551) {
                            }
                            int i62 = i2;
                            zzb2 = zzahp.zzb(zzacfVar.zzd(), zzacfVar.zzf(), this.zzd, zzfjVar);
                            if (zzb2 != null) {
                                zzacfVar.zzj();
                                zzabuVar.zzl(i + Opcodes.F2D, false);
                                zzabuVar.zzm(this.zzc.zzI(), 0, 3, false);
                                this.zzc.zzG(0);
                                zzacu zzacuVar2 = this.zze;
                                int zzn2 = this.zzc.zzn();
                                i3 = zzn2 >> 12;
                                i4 = zzn2 & 4095;
                                if (i3 <= 0) {
                                }
                                zzacuVar2.zza = i3;
                                zzacuVar2.zzb = i4;
                            }
                            zzabuVar.zzo(this.zzd.zzc, false);
                            if (zzb2 == null) {
                            }
                            zzcbVar = this.zzl;
                            long zzf22 = zzacfVar.zzf();
                            if (zzcbVar != null) {
                            }
                            zzahiVar = null;
                            if (this.zzr) {
                            }
                            this.zzq = zzh;
                            this.zzh.zzO(zzh);
                            zzadk zzadkVar22 = this.zzj;
                            zzak zzakVar22 = new zzak();
                            zzakVar22.zzU(this.zzd.zzb);
                            zzakVar22.zzN(4096);
                            zzakVar22.zzy(this.zzd.zze);
                            zzakVar22.zzV(this.zzd.zzd);
                            zzakVar22.zzE(this.zze.zza);
                            zzakVar22.zzF(this.zze.zzb);
                            zzakVar22.zzO(this.zzl);
                            zzadkVar22.zzl(zzakVar22.zzac());
                            this.zzo = zzacfVar.zzf();
                        }
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i622 = i2;
                    zzb2 = zzahp.zzb(zzacfVar.zzd(), zzacfVar.zzf(), this.zzd, zzfjVar);
                    if (zzb2 != null) {
                    }
                    zzabuVar.zzo(this.zzd.zzc, false);
                    if (zzb2 == null) {
                    }
                    zzcbVar = this.zzl;
                    long zzf222 = zzacfVar.zzf();
                    if (zzcbVar != null) {
                    }
                    zzahiVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzO(zzh);
                    zzadk zzadkVar222 = this.zzj;
                    zzak zzakVar222 = new zzak();
                    zzakVar222.zzU(this.zzd.zzb);
                    zzakVar222.zzN(4096);
                    zzakVar222.zzy(this.zzd.zze);
                    zzakVar222.zzV(this.zzd.zzd);
                    zzakVar222.zzE(this.zze.zza);
                    zzakVar222.zzF(this.zze.zzb);
                    zzakVar222.zzO(this.zzl);
                    zzadkVar222.zzl(zzakVar222.zzac());
                    this.zzo = zzacfVar.zzf();
                }
            } else if (zzacyVar.zze == 1) {
                i5 = 13;
            }
            i = i5;
            if (zzfjVar.zzd() >= i + 4) {
            }
            if (zzfjVar.zzd() >= 40) {
            }
            i2 = 0;
            if (i2 != 1483304551) {
            }
            int i6222 = i2;
            zzb2 = zzahp.zzb(zzacfVar.zzd(), zzacfVar.zzf(), this.zzd, zzfjVar);
            if (zzb2 != null) {
            }
            zzabuVar.zzo(this.zzd.zzc, false);
            if (zzb2 == null) {
            }
            zzcbVar = this.zzl;
            long zzf2222 = zzacfVar.zzf();
            if (zzcbVar != null) {
            }
            zzahiVar = null;
            if (this.zzr) {
            }
            this.zzq = zzh;
            this.zzh.zzO(zzh);
            zzadk zzadkVar2222 = this.zzj;
            zzak zzakVar2222 = new zzak();
            zzakVar2222.zzU(this.zzd.zzb);
            zzakVar2222.zzN(4096);
            zzakVar2222.zzy(this.zzd.zze);
            zzakVar2222.zzV(this.zzd.zzd);
            zzakVar2222.zzE(this.zze.zza);
            zzakVar2222.zzF(this.zze.zzb);
            zzakVar2222.zzO(this.zzl);
            zzadkVar2222.zzl(zzakVar2222.zzac());
            this.zzo = zzacfVar.zzf();
        } else {
            long j2 = this.zzo;
            if (j2 != 0) {
                long zzf3 = zzacfVar.zzf();
                if (zzf3 < j2) {
                    ((zzabu) zzacfVar).zzo((int) (j2 - zzf3), false);
                }
            }
        }
        int i9 = this.zzp;
        if (i9 == 0) {
            zzacfVar.zzj();
            if (zzj(zzacfVar)) {
                return -1;
            }
            this.zzc.zzG(0);
            int zzf4 = this.zzc.zzf();
            if (!zzi(zzf4, this.zzk) || zzacz.zzb(zzf4) == -1) {
                ((zzabu) zzacfVar).zzo(1, false);
                this.zzk = 0;
                return 0;
            }
            this.zzd.zza(zzf4);
            if (this.zzm == -9223372036854775807L) {
                this.zzm = this.zzq.zzd(zzacfVar.zzf());
            }
            int i10 = this.zzd.zzc;
            this.zzp = i10;
            zzahn zzahnVar = this.zzq;
            if (zzahnVar instanceof zzahh) {
                zzg(this.zzn + r2.zzg);
                throw null;
            }
            i9 = i10;
        }
        int zzf5 = this.zzj.zzf(zzacfVar, i9, true);
        if (zzf5 == -1) {
            return -1;
        }
        int i11 = this.zzp - zzf5;
        this.zzp = i11;
        if (i11 <= 0) {
            this.zzj.zzt(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
            this.zzn += this.zzd.zzg;
            this.zzp = 0;
            return 0;
        }
        return 0;
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzahn zzh(zzacf zzacfVar, boolean z) throws IOException {
        ((zzabu) zzacfVar).zzm(this.zzc.zzI(), 0, 4, false);
        this.zzc.zzG(0);
        this.zzd.zza(this.zzc.zzf());
        return new zzahg(zzacfVar.zzd(), zzacfVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzacf zzacfVar) throws IOException {
        zzahn zzahnVar = this.zzq;
        if (zzahnVar != null) {
            long zzc = zzahnVar.zzc();
            if (zzc != -1 && zzacfVar.zze() > zzc - 4) {
                return true;
            }
        }
        try {
            return !zzacfVar.zzm(this.zzc.zzI(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzacf zzacfVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzacfVar.zzj();
        if (zzacfVar.zzf() == 0) {
            zzcb zza2 = this.zzf.zza(zzacfVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i = (int) zzacfVar.zze();
            if (!z) {
                ((zzabu) zzacfVar).zzo(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzj(zzacfVar)) {
                this.zzc.zzG(0);
                int zzf = this.zzc.zzf();
                if ((i2 == 0 || zzi(zzf, i2)) && (zzb2 = zzacz.zzb(zzf)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzf);
                        i2 = zzf;
                    }
                    ((zzabu) zzacfVar).zzl(zzb2 - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzcf.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzacfVar.zzj();
                        ((zzabu) zzacfVar).zzl(i + i5, false);
                    } else {
                        ((zzabu) zzacfVar).zzo(1, false);
                    }
                    i2 = 0;
                    i4 = i5;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzabu) zzacfVar).zzo(i + i4, false);
        } else {
            zzacfVar.zzj();
        }
        this.zzk = i2;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        zzef.zzb(this.zzi);
        int i = zzfs.zza;
        int zzf = zzf(zzacfVar);
        if (zzf == -1 && (this.zzq instanceof zzahh)) {
            if (this.zzq.zza() != zzg(this.zzn)) {
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzh = zzachVar;
        zzadk zzw = zzachVar.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzahn zzahnVar = this.zzq;
        if (zzahnVar instanceof zzahh) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        return zzk(zzacfVar, true);
    }

    public zzahl(int i) {
        this.zzc = new zzfj(10);
        this.zzd = new zzacy();
        this.zze = new zzacu();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzacw();
        zzacd zzacdVar = new zzacd();
        this.zzg = zzacdVar;
        this.zzj = zzacdVar;
    }
}
