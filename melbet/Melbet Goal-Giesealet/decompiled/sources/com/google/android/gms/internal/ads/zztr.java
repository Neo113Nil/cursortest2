package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zztr implements zzvi {
    private final zzada zza;
    private zzacu zzb;
    private zzacv zzc;

    public zztr(zzada zzadaVar) {
        this.zza = zzadaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r1.zzn() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r1.zzn() != r11) goto L38;
     */
    @Override // com.google.android.gms.internal.ads.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzi zziVar, Uri uri, Map map, long j, long j2, zzacx zzacxVar) throws IOException {
        zzacl zzaclVar = new zzacl(zziVar, j, j2);
        this.zzc = zzaclVar;
        if (this.zzb != null) {
            return;
        }
        zzacu[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        zzgjw zzv = zzgjz.zzv(length);
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzacu zzacuVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzghc.zzh(this.zzb != null || zzaclVar.zzn() == j);
                    zzaclVar.zzl();
                    throw th;
                }
                if (zzacuVar.zzd(zzaclVar)) {
                    this.zzb = zzacuVar;
                    zzghc.zzh(zzacuVar != null || zzaclVar.zzn() == j);
                    zzaclVar.zzl();
                } else {
                    zzv.zzh(zzacuVar.zze());
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzghc.zzh(z);
                    zzaclVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                String zzd = zzggw.zzd(zzgkp.zzc(zzgjz.zzr(zzb), zztq.zza), ", ");
                StringBuilder sb = new StringBuilder(zzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(zzd);
                sb.append(") could read the stream.");
                throw new zzwr(sb.toString(), uri, zzv.zzi());
            }
        }
        this.zzb.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzc() {
        zzacu zzacuVar = this.zzb;
        if (zzacuVar != null && (zzacuVar instanceof zzahg)) {
            ((zzahg) zzacuVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final long zzd() {
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            return zzacvVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zze(long j, long j2) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzh(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final int zzf(zzads zzadsVar) throws IOException {
        zzacv zzacvVar;
        zzacu zzacuVar = this.zzb;
        if (zzacuVar == null || (zzacvVar = this.zzc) == null) {
            throw null;
        }
        return zzacuVar.zzg(zzacvVar, zzadsVar);
    }
}
