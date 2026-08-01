package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzhj extends zzgr {
    public final zzgv zzb;
    public final int zzc;

    public zzhj(zzgv zzgvVar, int i, int i2) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzgvVar;
        this.zzc = 1;
    }

    public static zzhj zza(IOException iOException, zzgv zzgvVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? PointerIconCompat.TYPE_WAIT : (message == null || !zzftf.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzhi(iOException, zzgvVar) : new zzhj(iOException, zzgvVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i;
    }

    public zzhj(IOException iOException, zzgv zzgvVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzgvVar;
        this.zzc = i2;
    }

    public zzhj(String str, zzgv zzgvVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzgvVar;
        this.zzc = i2;
    }

    public zzhj(String str, IOException iOException, zzgv zzgvVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzgvVar;
        this.zzc = i2;
    }
}
