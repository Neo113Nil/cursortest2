package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcbx implements zzga {
    private final Context zza;
    private final zzga zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbat zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzge zzl;

    public zzcbx(Context context, zzga zzgaVar, String str, int i, zzgy zzgyVar, zzcbw zzcbwVar) {
        this.zza = context;
        this.zzb = zzgaVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeQ)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeR)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgeVar.zza;
        this.zzh = uri;
        this.zzl = zzgeVar;
        this.zzi = zzbat.zza(uri);
        zzbaq zzbaqVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeN)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgeVar.zze;
                this.zzi.zzi = zzghs.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbaqVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbaqVar != null && zzbaqVar.zza()) {
                this.zzj = zzbaqVar.zzg();
                this.zzk = zzbaqVar.zze();
                if (!zzf()) {
                    this.zzf = zzbaqVar.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgeVar.zze;
            this.zzi.zzi = zzghs.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeP);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeO);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future zza = zzbbe.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbf zzbbfVar = (zzbbf) zza.get(longValue, TimeUnit.MILLISECONDS);
                    zzbbfVar.zzc();
                    this.zzj = zzbbfVar.zzd();
                    this.zzk = zzbbfVar.zzf();
                    zzbbfVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbbfVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgd zzb = zzgeVar.zzb();
            zzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzga
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

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
    }
}
