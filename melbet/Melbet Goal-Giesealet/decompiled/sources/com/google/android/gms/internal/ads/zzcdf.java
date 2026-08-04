package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcdf extends zzfs {
    private final Context zza;
    private final zzga zzb;
    private final zzcdd zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbat zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private ListenableFuture zzp;
    private final AtomicLong zzq;

    public zzcdf(Context context, zzga zzgaVar, String str, int i, zzgy zzgyVar, zzcdd zzcddVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgaVar;
        this.zzc = zzcddVar;
        this.zzd = str;
        this.zze = i;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
        zze(zzgyVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeQ)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeR)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (this.zzf && this.zzg == null) {
            return read;
        }
        zzh(read);
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0206  */
    @Override // com.google.android.gms.internal.ads.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzge zzgeVar) throws IOException {
        zzbaq zzbaqVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        StringBuilder sb;
        zzbbf zzbbfVar;
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzh = true;
        Uri uri = zzgeVar.zza;
        this.zzi = uri;
        boolean z4 = this.zzf;
        if (!z4) {
            zzg(zzgeVar);
        }
        this.zzj = zzbat.zza(uri);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeN)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzgeVar.zze;
                this.zzj.zzi = zzghs.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbaqVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzj);
            } else {
                zzbaqVar = null;
            }
            if (zzbaqVar != null && zzbaqVar.zza()) {
                this.zzk = zzbaqVar.zzd();
                this.zzm = zzbaqVar.zzg();
                this.zzn = zzbaqVar.zze();
                this.zzo = zzbaqVar.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbaqVar.zzb();
                    if (this.zzf) {
                        zzg(zzgeVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzgeVar.zze;
            this.zzj.zzi = zzghs.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeP);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeO);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future zza = zzbbe.zza(this.zza, this.zzj);
            try {
                try {
                    zzbbfVar = (zzbbf) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = z4;
                }
                try {
                    this.zzk = zzbbfVar.zzc();
                    this.zzm = zzbbfVar.zzd();
                    this.zzn = zzbbfVar.zzf();
                    this.zzo = zzbbfVar.zze();
                } catch (InterruptedException unused) {
                    z2 = true;
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z2, elapsedRealtime);
                    this.zzl = z2;
                    int length = String.valueOf(elapsedRealtime).length() + 24;
                    sb = new StringBuilder(length);
                    z4 = length;
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzb.zzb(zzgeVar);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    zza.cancel(true);
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z, elapsedRealtime);
                    this.zzl = z;
                    int length2 = String.valueOf(elapsedRealtime).length() + 24;
                    sb = new StringBuilder(length2);
                    z4 = length2;
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzb.zzb(zzgeVar);
                } catch (Throwable th2) {
                    th = th2;
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z3, elapsedRealtime3);
                    this.zzl = z3;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                    sb2.append("Cache connection took ");
                    sb2.append(elapsedRealtime3);
                    sb2.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z = false;
            } catch (Throwable th3) {
                th = th3;
                z3 = false;
            }
            if (!zzr()) {
                this.zzg = zzbbfVar.zzb();
                if (z4) {
                    zzg(zzgeVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(true, elapsedRealtime4);
                this.zzl = true;
                StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                sb3.append("Cache connection took ");
                sb3.append(elapsedRealtime4);
                sb3.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
            this.zzc.zza(true, elapsedRealtime5);
            this.zzl = true;
            sb = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
            sb.append("Cache connection took ");
            sb.append(elapsedRealtime5);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzgd zzb = zzgeVar.zzb();
            zzb.zza(Uri.parse(this.zzj.zza));
            zzgeVar = zzb.zze();
        }
        return this.zzb.zzb(zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                if (this.zzp == null) {
                    this.zzp = zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcde
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzcdf.this.zzq();
                        }
                    });
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long zzq() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().zzd(this.zzj));
    }
}
