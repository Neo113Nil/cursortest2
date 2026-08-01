package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhg extends zzgk {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzhg() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzhf {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzfs.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, i2));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzhf(e, AdError.SERVER_ERROR_CODE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r1 != false) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.zzgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzgv zzgvVar) throws zzhf {
        boolean zzb;
        Uri uri = zzgvVar.zza;
        this.zzb = uri;
        zzi(zzgvVar);
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgvVar.zzf);
                long j = zzgvVar.zzg;
                if (j == -1) {
                    j = this.zza.length() - zzgvVar.zzf;
                }
                this.zzc = j;
                if (j < 0) {
                    throw new zzhf(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.zzd = true;
                zzj(zzgvVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzhf(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhf(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, PointerIconCompat.TYPE_WAIT);
            }
            if (zzfs.zza >= 21) {
                zzb = zzhe.zzb(e2.getCause());
            }
            i = 2005;
            throw new zzhf(e2, i);
        } catch (SecurityException e3) {
            throw new zzhf(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new zzhf(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws zzhf {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzhf(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
