package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdli {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdli(com.google.android.gms.ads.internal.util.zzbl zzblVar, Clock clock, Executor executor) {
        this.zza = zzblVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.zzb;
        long elapsedRealtime = clock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = clock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j).length() + 15 + String.valueOf(z).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return decodeByteArray;
    }

    public final ListenableFuture zza(String str, final double d, final boolean z) {
        return zzgot.zzk(this.zza.zza(str), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlh
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return zzdli.this.zzb(d, z, (zzapd) obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ Bitmap zzb(double d, boolean z, zzapd zzapdVar) {
        byte[] bArr = zzapdVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgC)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgD)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }
}
