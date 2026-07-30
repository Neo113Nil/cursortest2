package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;
    private zzaeu zzb;
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
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
    @Override // com.google.android.gms.internal.ads.zzxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzaex zzaexVar) throws IOException {
        zzael zzaelVar = new zzael(zzjVar, j, j2);
        this.zzc = zzaelVar;
        if (this.zzb != null) {
            return;
        }
        zzaeu[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        zzguc zzv = zzguf.zzv(length);
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzaeu zzaeuVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzgrc.zzi(this.zzb != null || zzaelVar.zzn() == j);
                    zzaelVar.zzl();
                    throw th;
                }
                if (zzaeuVar.zza(zzaelVar)) {
                    this.zzb = zzaeuVar;
                    zzgrc.zzi(zzaeuVar != null || zzaelVar.zzn() == j);
                    zzaelVar.zzl();
                } else {
                    zzv.zzh(zzaeuVar.zzb());
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzgrc.zzi(z);
                    zzaelVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                String zzd = zzgqw.zzd(zzgvf.zzc(zzguf.zzr(zzb), zzvl.zza), ", ");
                StringBuilder sb = new StringBuilder(zzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(zzd);
                sb.append(") could read the stream.");
                throw new zzyo(sb.toString(), uri, zzv.zzi());
            }
        }
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j, long j2) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) throws IOException {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
