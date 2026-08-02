package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zztk implements zzuy {
    private final zzacp zza;
    private zzack zzb;
    private zzacl zzc;

    public zztk(zzacp zzacpVar) {
        this.zza = zzacpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final long zzb() {
        zzacl zzaclVar = this.zzc;
        if (zzaclVar != null) {
            return zzaclVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void zzc() {
        zzack zzackVar = this.zzb;
        if (zzackVar == null) {
            return;
        }
        zzack zzc = zzackVar.zzc();
        if (zzc instanceof zzahp) {
            ((zzahp) zzc).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r6.zzf() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r6.zzf() != r11) goto L38;
     */
    @Override // com.google.android.gms.internal.ads.zzuy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzp zzpVar, Uri uri, Map map, long j, long j2, zzacn zzacnVar) throws IOException {
        zzaby zzabyVar = new zzaby(zzpVar, j, j2);
        this.zzc = zzabyVar;
        if (this.zzb != null) {
            return;
        }
        zzack[] zza = this.zza.zza(uri, map);
        int length = zza.length;
        zzfxo zzi = zzfxr.zzi(length);
        if (length == 1) {
            this.zzb = zza[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzack zzackVar = zza[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzdi.zzf(this.zzb != null || zzabyVar.zzf() == j);
                    zzabyVar.zzj();
                    throw th;
                }
                if (zzackVar.zzj(zzabyVar)) {
                    this.zzb = zzackVar;
                    zzdi.zzf(zzackVar != null || zzabyVar.zzf() == j);
                    zzabyVar.zzj();
                } else {
                    zzi.zzh(zzackVar.zzd());
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzdi.zzf(z);
                    zzabyVar.zzj();
                    i++;
                }
            }
            if (this.zzb == null) {
                Iterator it = zzfyh.zzb(zzfxr.zzl(zza), new zzful() { // from class: com.google.android.gms.internal.ads.zztj
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        return ((zzack) obj).zzc().getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                zzfum.zzc(sb, it, ", ");
                throw new zzwj("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, zzi.zzi());
            }
        }
        this.zzb.zze(zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void zze() {
        zzack zzackVar = this.zzb;
        if (zzackVar != null) {
            zzackVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final int zza(zzadf zzadfVar) throws IOException {
        zzack zzackVar = this.zzb;
        zzackVar.getClass();
        zzacl zzaclVar = this.zzc;
        zzaclVar.getClass();
        return zzackVar.zzb(zzaclVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void zzf(long j, long j2) {
        zzack zzackVar = this.zzb;
        zzackVar.getClass();
        zzackVar.zzi(j, j2);
    }
}
