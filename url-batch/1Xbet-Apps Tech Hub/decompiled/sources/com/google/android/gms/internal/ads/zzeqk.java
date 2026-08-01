package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeqk implements zzeux {

    @Nullable
    private final Integer zza;

    private zzeqk(@Nullable Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ zzeqk zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjB)).booleanValue()) {
            return new zzeqk(null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            i = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
        }
        return new zzeqk(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
