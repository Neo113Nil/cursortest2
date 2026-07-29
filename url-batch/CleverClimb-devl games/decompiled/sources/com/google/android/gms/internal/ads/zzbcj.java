package com.google.android.gms.internal.ads;

import com.cmplay.base.util.ipc.a;
import com.google.android.gms.internal.ads.zzbbo;

/* loaded from: classes2.dex */
final class zzbcj implements zzbdn {
    private static final zzbct zzdvw = new zzbck();
    private final zzbct zzdvv;

    public zzbcj() {
        this(new zzbcl(zzbbn.zzadc(), zzaea()));
    }

    private zzbcj(zzbct zzbctVar) {
        this.zzdvv = (zzbct) zzbbq.zza(zzbctVar, "messageInfoFactory");
    }

    private static boolean zza(zzbcs zzbcsVar) {
        return zzbcsVar.zzaeh() == zzbbo.zze.zzdui;
    }

    private static zzbct zzaea() {
        try {
            return (zzbct) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(a.FORCE_STATIC_METHOD, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzdvw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final <T> zzbdm<T> zzd(Class<T> cls) {
        zzbdo.zzf(cls);
        zzbcs zzb = this.zzdvv.zzb(cls);
        return zzb.zzaei() ? zzbbo.class.isAssignableFrom(cls) ? zzbda.zza(zzbdo.zzafp(), zzbbf.zzact(), zzb.zzaej()) : zzbda.zza(zzbdo.zzafn(), zzbbf.zzacu(), zzb.zzaej()) : zzbbo.class.isAssignableFrom(cls) ? zza(zzb) ? zzbcy.zza(cls, zzb, zzbde.zzaem(), zzbce.zzadz(), zzbdo.zzafp(), zzbbf.zzact(), zzbcr.zzaef()) : zzbcy.zza(cls, zzb, zzbde.zzaem(), zzbce.zzadz(), zzbdo.zzafp(), (zzbbd<?>) null, zzbcr.zzaef()) : zza(zzb) ? zzbcy.zza(cls, zzb, zzbde.zzael(), zzbce.zzady(), zzbdo.zzafn(), zzbbf.zzacu(), zzbcr.zzaee()) : zzbcy.zza(cls, zzb, zzbde.zzael(), zzbce.zzady(), zzbdo.zzafo(), (zzbbd<?>) null, zzbcr.zzaee());
    }
}
