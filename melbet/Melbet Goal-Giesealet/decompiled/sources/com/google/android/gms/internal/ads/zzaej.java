package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaej implements zzacu {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaeb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacx zzn;
    private zzaeb zzo;
    private zzaeb zzp;
    private zzadv zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = zzaei.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzeo.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzaej() {
        throw null;
    }

    public zzaej(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacr zzacrVar = new zzacr();
        this.zzf = zzacrVar;
        this.zzp = zzacrVar;
    }

    private final boolean zza(zzacv zzacvVar) throws IOException {
        byte[] bArr = zzc;
        if (zzb(zzacvVar, bArr)) {
            this.zzg = false;
            zzacvVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzb(zzacvVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacvVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzb(zzacv zzacvVar, byte[] bArr) throws IOException {
        zzacvVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacvVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0085, B:42:0x0086, B:43:0x00a3), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0085, B:42:0x0086, B:43:0x00a3), top: B:12:0x0007 }] */
    @RequiresNonNull({"realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzc(zzacv zzacvVar) throws IOException {
        int i;
        int i2 = this.zzj;
        if (i2 == 0) {
            try {
                zzacvVar.zzl();
                byte[] bArr = this.zze;
                zzacvVar.zzi(bArr, 0, 1);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw zzas.zzb(sb.toString(), null);
                }
                boolean z = this.zzg;
                int i3 = (b >> 3) & 15;
                if (z) {
                    if (i3 >= 10) {
                        if (i3 > 13) {
                        }
                    }
                    i2 = !z ? zzb[i3] : zza[i3];
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                        this.zzk = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzl++;
                    }
                }
                if (!z) {
                    if (i3 >= 12 && i3 <= 14) {
                    }
                    if (!z) {
                    }
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                String str = true != z ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(str.length() + 24 + String.valueOf(i3).length());
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i3);
                throw zzas.zzb(sb2.toString(), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zzy = this.zzp.zzy(zzacvVar, i2, true);
        if (zzy == -1) {
            return -1;
        }
        int i4 = this.zzj - zzy;
        this.zzj = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzp.zzx(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzn = zzacxVar;
        zzaeb zzu = zzacxVar.zzu(0, 1);
        this.zzo = zzu;
        this.zzp = zzu;
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zzo.getClass();
        String str = zzeo.zza;
        if (zzacvVar.zzn() == 0 && !zza(zzacvVar)) {
            throw zzas.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z ? 8000 : 16000;
            int i2 = z ? zzb[8] : zza[7];
            zzaeb zzaebVar = this.zzo;
            zzs zzsVar = new zzs();
            zzsVar.zzl(str2);
            zzsVar.zzm(str3);
            zzsVar.zzn(i2);
            zzsVar.zzE(1);
            zzsVar.zzF(i);
            zzaebVar.zzu(zzsVar.zzM());
        }
        int zzc2 = zzc(zzacvVar);
        if (this.zzq == null) {
            zzadu zzaduVar = new zzadu(-9223372036854775807L, 0L);
            this.zzq = zzaduVar;
            this.zzn.zzw(zzaduVar);
        }
        return zzc2 == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }
}
