package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.collection.SieveCacheKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfr extends zzfs {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfr(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws zzfq {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfq(e, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzeo.zza;
        InputStream inputStream2 = inputStream;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zzd;
        if (j2 != -1) {
            this.zzd = j2 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzfq {
        try {
            Uri uri = zzgeVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            String str = path;
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzgeVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            long j = zzgeVar.zze;
            if (open.skip(j) < j) {
                throw new zzfq(null, 2008);
            }
            long j2 = zzgeVar.zzf;
            if (j2 != -1) {
                this.zzd = j2;
            } else {
                long available = this.zzc.available();
                this.zzd = available;
                if (available == SieveCacheKt.NodeLinkMask) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzgeVar);
            return this.zzd;
        } catch (zzfq e) {
            throw e;
        } catch (IOException e2) {
            throw new zzfq(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzfq {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e) {
                throw new zzfq(e, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th;
        }
    }
}
