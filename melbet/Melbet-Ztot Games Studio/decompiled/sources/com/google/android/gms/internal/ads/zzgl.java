package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public class zzgl extends zzft {
    public final int zzb;

    public zzgl(zzfy zzfyVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgl zza(IOException iOException, zzfy zzfyVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? GamesStatusCodes.STATUS_REQUEST_TOO_MANY_RECIPIENTS : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzfuf.zza(message).matches("cleartext.*not permitted.*")) ? GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE : 2007;
        return i2 == 2007 ? new zzgk(iOException, zzfyVar) : new zzgl(iOException, zzfyVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? GamesStatusCodes.STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS : GamesStatusCodes.STATUS_REQUEST_UPDATE_TOTAL_FAILURE : i;
    }

    public zzgl(IOException iOException, zzfy zzfyVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgl(String str, zzfy zzfyVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgl(String str, IOException iOException, zzfy zzfyVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
