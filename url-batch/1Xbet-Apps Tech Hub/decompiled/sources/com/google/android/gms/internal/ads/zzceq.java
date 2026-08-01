package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzceq implements zzgq {
    private final Context zza;
    private final zzgq zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzayb zzi;
    private zzgv zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue();

    public zzceq(Context context, zzgq zzgqVar, String str, int i, zzhs zzhsVar, zzcep zzcepVar) {
        this.zza = context;
        this.zzb = zzgqVar;
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzej)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzek)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final long zzb(zzgv zzgvVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzgvVar.zza;
        this.zzm = zzgvVar;
        this.zzi = zzayb.zza(zzgvVar.zza);
        zzaxy zzaxyVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeg)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgvVar.zzf;
                this.zzi.zzi = zzfun.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzaxyVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            }
            if (zzaxyVar != null && zzaxyVar.zze()) {
                this.zzj = zzaxyVar.zzg();
                this.zzk = zzaxyVar.zzf();
                if (!zzg()) {
                    this.zzf = zzaxyVar.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgvVar.zzf;
            this.zzi.zzi = zzfun.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzei);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeh);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzaym.zza(this.zza, this.zzi);
            try {
                try {
                    zzayn zzaynVar = (zzayn) zza.get(longValue, TimeUnit.MILLISECONDS);
                    zzaynVar.zzd();
                    this.zzj = zzaynVar.zzf();
                    this.zzk = zzaynVar.zze();
                    zzaynVar.zza();
                    if (!zzg()) {
                        this.zzf = zzaynVar.zzc();
                    }
                } catch (InterruptedException unused) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            Uri parse = Uri.parse(this.zzi.zza);
            byte[] bArr = zzgvVar.zzc;
            long j = zzgvVar.zze;
            long j2 = zzgvVar.zzf;
            long j3 = zzgvVar.zzg;
            String str = zzgvVar.zzh;
            this.zzm = new zzgv(parse, null, j, j2, j3, null, zzgvVar.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzf(zzhs zzhsVar) {
    }
}
