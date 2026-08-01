package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzads implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzadr
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzads.zza;
            return new zzace[]{new zzads(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzach zzp;
    private zzadk zzq;
    private zzade zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i = zzfs.zza;
        zzd = "#!AMR\n".getBytes(zzftl.zzc);
        zze = "#!AMR-WB\n".getBytes(zzftl.zzc);
        zzf = iArr[8];
    }

    public zzads() {
        this(0);
    }

    public zzads(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private static boolean zzf(zzacf zzacfVar, byte[] bArr) throws IOException {
        zzacfVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzabu) zzacfVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzacf zzacfVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzacfVar, bArr)) {
            this.zzh = false;
            ((zzabu) zzacfVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzacfVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzabu) zzacfVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        zzef.zzb(this.zzq);
        int i = zzfs.zza;
        if (zzacfVar.zzf() == 0 && !zzg(zzacfVar)) {
            throw zzcf.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzadk zzadkVar = this.zzq;
            zzak zzakVar = new zzak();
            zzakVar.zzU(str);
            zzakVar.zzN(zzf);
            zzakVar.zzy(1);
            zzakVar.zzV(i2);
            zzadkVar.zzl(zzakVar.zzac());
        }
        int zza2 = zza(zzacfVar);
        if (this.zzl) {
            return zza2;
        }
        zzadd zzaddVar = new zzadd(-9223372036854775807L, 0L);
        this.zzr = zzaddVar;
        this.zzp.zzO(zzaddVar);
        this.zzl = true;
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzp = zzachVar;
        this.zzq = zzachVar.zzw(0, 1);
        zzachVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        return zzg(zzacfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    @RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(zzacf zzacfVar) throws IOException {
        int i;
        int i2 = this.zzk;
        if (i2 == 0) {
            try {
                zzacfVar.zzj();
                ((zzabu) zzacfVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    throw zzcf.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i3 = b >> 3;
                boolean z = this.zzh;
                int i4 = i3 & 15;
                if (z) {
                    if (i4 >= 10) {
                        if (i4 > 13) {
                        }
                    }
                    i2 = !z ? zzc[i4] : zzb[i4];
                    this.zzj = i2;
                    this.zzk = i2;
                    i = this.zzm;
                    if (i == -1) {
                        this.zzm = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzn++;
                    }
                }
                if (!z) {
                    if (i4 >= 12 && i4 <= 14) {
                    }
                    i2 = !z ? zzc[i4] : zzb[i4];
                    this.zzj = i2;
                    this.zzk = i2;
                    i = this.zzm;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                throw zzcf.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i4, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = zzadi.zza(this.zzq, zzacfVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i5 = this.zzk - zza2;
        this.zzk = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzq.zzt(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }
}
