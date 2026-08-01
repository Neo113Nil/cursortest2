package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakw implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzaku
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzakw.zza;
            return new zzace[]{new zzakw()};
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzaks zzj;
    private zzach zzk;
    private boolean zzl;
    private final zzfq zzb = new zzfq(0);
    private final zzfj zzd = new zzfj(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzakt zze = new zzakt();

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        zzajy zzakaVar;
        zzef.zzb(this.zzk);
        long zzd = zzacfVar.zzd();
        if (zzd != -1) {
            zzakt zzaktVar = this.zze;
            if (!zzaktVar.zze()) {
                return zzaktVar.zza(zzacfVar, zzadbVar);
            }
        }
        if (!this.zzl) {
            this.zzl = true;
            zzakt zzaktVar2 = this.zze;
            if (zzaktVar2.zzb() != -9223372036854775807L) {
                zzaks zzaksVar = new zzaks(zzaktVar2.zzd(), zzaktVar2.zzb(), zzd);
                this.zzj = zzaksVar;
                this.zzk.zzO(zzaksVar.zzb());
            } else {
                this.zzk.zzO(new zzadd(zzaktVar2.zzb(), 0L));
            }
        }
        zzaks zzaksVar2 = this.zzj;
        if (zzaksVar2 != null && zzaksVar2.zze()) {
            return zzaksVar2.zza(zzacfVar, zzadbVar);
        }
        zzacfVar.zzj();
        long zze = zzd != -1 ? zzd - zzacfVar.zze() : -1L;
        if ((zze != -1 && zze < 4) || !zzacfVar.zzm(this.zzd.zzI(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzG(0);
        int zzf = this.zzd.zzf();
        if (zzf == 441) {
            return -1;
        }
        if (zzf == 442) {
            zzabu zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(9);
            zzabuVar.zzo((this.zzd.zzl() & 7) + 14, false);
            return 0;
        }
        if (zzf == 443) {
            zzabu zzabuVar2 = (zzabu) zzacfVar;
            zzabuVar2.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            zzabuVar2.zzo(this.zzd.zzp() + 6, false);
            return 0;
        }
        if ((zzf >> 8) != 1) {
            ((zzabu) zzacfVar).zzo(1, false);
            return 0;
        }
        int i = zzf & 255;
        zzakv zzakvVar = (zzakv) this.zzc.get(i);
        if (!this.zzf) {
            if (zzakvVar == null) {
                zzajy zzajyVar = null;
                if (i == 189) {
                    zzakaVar = new zzajo(null);
                    this.zzg = true;
                    this.zzi = zzacfVar.zzf();
                } else if ((i & 224) == 192) {
                    zzakaVar = new zzakm(null);
                    this.zzg = true;
                    this.zzi = zzacfVar.zzf();
                } else {
                    if ((i & 240) == 224) {
                        zzakaVar = new zzaka(null);
                        this.zzh = true;
                        this.zzi = zzacfVar.zzf();
                    }
                    if (zzajyVar != null) {
                        zzajyVar.zzb(this.zzk, new zzalk(Integer.MIN_VALUE, i, 256));
                        zzakv zzakvVar2 = new zzakv(zzajyVar, this.zzb);
                        this.zzc.put(i, zzakvVar2);
                        zzakvVar = zzakvVar2;
                    }
                }
                zzajyVar = zzakaVar;
                if (zzajyVar != null) {
                }
            }
            long j = 1048576;
            if (this.zzg && this.zzh) {
                j = this.zzi + 8192;
            }
            if (zzacfVar.zzf() > j) {
                this.zzf = true;
                this.zzk.zzD();
            }
        }
        zzabu zzabuVar3 = (zzabu) zzacfVar;
        zzabuVar3.zzm(this.zzd.zzI(), 0, 2, false);
        this.zzd.zzG(0);
        int zzp = this.zzd.zzp() + 6;
        if (zzakvVar == null) {
            zzabuVar3.zzo(zzp, false);
        } else {
            this.zzd.zzD(zzp);
            zzabuVar3.zzn(this.zzd.zzI(), 0, zzp, false);
            this.zzd.zzG(6);
            zzakvVar.zza(this.zzd);
            zzfj zzfjVar = this.zzd;
            zzfjVar.zzF(zzfjVar.zzb());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzk = zzachVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(long j, long j2) {
        zzaks zzaksVar;
        int i;
        zzfq zzfqVar = this.zzb;
        if (zzfqVar.zze() != -9223372036854775807L) {
            long zzc = zzfqVar.zzc();
            if (zzc != -9223372036854775807L) {
                if (zzc != 0) {
                }
            }
            zzaksVar = this.zzj;
            if (zzaksVar != null) {
                zzaksVar.zzd(j2);
            }
            for (i = 0; i < this.zzc.size(); i++) {
                ((zzakv) this.zzc.valueAt(i)).zzb();
            }
        }
        zzfqVar.zzf(j2);
        zzaksVar = this.zzj;
        if (zzaksVar != null) {
        }
        while (i < this.zzc.size()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        byte[] bArr = new byte[14];
        zzabu zzabuVar = (zzabu) zzacfVar;
        zzabuVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzabuVar.zzl(bArr[13] & 7, false);
        zzabuVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
