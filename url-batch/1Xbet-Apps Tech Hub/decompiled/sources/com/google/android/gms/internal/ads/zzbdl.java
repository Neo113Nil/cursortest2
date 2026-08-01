package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdl {
    public static final void zza(zzbdk zzbdkVar, zzbdi zzbdiVar) {
        if (zzbdiVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbdiVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbdkVar.zzd(zzbdiVar.zza(), zzbdiVar.zzb(), zzbdiVar.zzc(), zzbdiVar.zzd());
    }
}
