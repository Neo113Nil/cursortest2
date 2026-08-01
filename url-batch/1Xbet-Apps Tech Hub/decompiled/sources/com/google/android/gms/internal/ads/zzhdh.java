package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhdh {
    public static zzhdh zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhdc(cls.getSimpleName()) : new zzhde(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
