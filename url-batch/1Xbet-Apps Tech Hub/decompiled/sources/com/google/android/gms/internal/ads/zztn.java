package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zztn implements zzvb {
    private final zzacl zza;
    private zzace zzb;
    private zzacf zzc;

    public zztn(zzacl zzaclVar) {
        this.zza = zzaclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final long zzb() {
        zzacf zzacfVar = this.zzc;
        if (zzacfVar != null) {
            return zzacfVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzc() {
        zzace zzaceVar = this.zzb;
        if (zzaceVar != null && (zzaceVar instanceof zzahl)) {
            ((zzahl) zzaceVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        if (r6.zzf() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006d, code lost:
    
        if (r6.zzf() != r11) goto L38;
     */
    @Override // com.google.android.gms.internal.ads.zzvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzt zztVar, Uri uri, Map map, long j, long j2, zzach zzachVar) throws IOException {
        zzabu zzabuVar = new zzabu(zztVar, j, j2);
        this.zzc = zzabuVar;
        if (this.zzb != null) {
            return;
        }
        zzace[] zza = this.zza.zza(uri, map);
        int length = zza.length;
        int i = 0;
        boolean z = true;
        if (length == 1) {
            this.zzb = zza[0];
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                zzace zzaceVar = zza[i2];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzef.zzf(this.zzb != null || zzabuVar.zzf() == j);
                    zzabuVar.zzj();
                    throw th;
                }
                if (zzaceVar.zze(zzabuVar)) {
                    this.zzb = zzaceVar;
                    if (zzaceVar == null && zzabuVar.zzf() != j) {
                        z = false;
                    }
                    zzef.zzf(z);
                    zzabuVar.zzj();
                } else {
                    if (this.zzb == null) {
                    }
                    boolean z2 = true;
                    zzef.zzf(z2);
                    zzabuVar.zzj();
                    i2++;
                }
            }
            if (this.zzb == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length2 = zza.length;
                    if (i >= length2) {
                        throw new zzwm("None of the available extractors (" + sb.toString() + ") could read the stream.", uri);
                    }
                    sb.append(zza[i].getClass().getSimpleName());
                    if (i < length2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.zzb.zzc(zzachVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zza(zzadb zzadbVar) throws IOException {
        zzace zzaceVar = this.zzb;
        zzaceVar.getClass();
        zzacf zzacfVar = this.zzc;
        zzacfVar.getClass();
        return zzaceVar.zzb(zzacfVar, zzadbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzf(long j, long j2) {
        zzace zzaceVar = this.zzb;
        zzaceVar.getClass();
        zzaceVar.zzd(j, j2);
    }
}
