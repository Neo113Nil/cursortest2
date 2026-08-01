package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzit extends zzch {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzis
    };
    private static final String zzl = Integer.toString(1001, 36);
    private static final String zzm = Integer.toString(1002, 36);
    private static final String zzn = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
    private static final String zzo = Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
    private static final String zzp = Integer.toString(1005, 36);
    private static final String zzq = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzam zzh;
    public final int zzi;
    public final zzuk zzj;
    final boolean zzk;

    private zzit(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzit zzb(Throwable th, String str, int i, zzam zzamVar, int i2, boolean z, int i3) {
        return new zzit(1, th, null, i3, str, i, zzamVar, zzamVar == null ? 4 : i2, z);
    }

    public static zzit zzc(IOException iOException, int i) {
        return new zzit(0, iOException, i);
    }

    public static zzit zzd(RuntimeException runtimeException, int i) {
        return new zzit(2, runtimeException, i);
    }

    final zzit zza(zzuk zzukVar) {
        String message = getMessage();
        int i = zzfs.zza;
        return new zzit(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzukVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzit(int i, Throwable th, String str, int i2, String str2, int i3, zzam zzamVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzamVar, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(zzamVar);
            int i5 = zzfs.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i3 + ", format=" + valueOf + ", format_supported=" + str4;
        }
    }

    private zzit(String str, Throwable th, int i, int i2, String str2, int i3, zzam zzamVar, int i4, zzuk zzukVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzef.zzd(z2);
        zzef.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzamVar;
        this.zzi = i4;
        this.zzj = zzukVar;
        this.zzk = z;
    }
}
