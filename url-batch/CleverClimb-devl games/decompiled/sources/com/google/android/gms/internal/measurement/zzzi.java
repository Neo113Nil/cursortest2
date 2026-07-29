package com.google.android.gms.internal.measurement;

import com.cmplay.base.util.ipc.a;
import com.google.android.gms.internal.measurement.zzyv;

/* loaded from: classes2.dex */
final class zzzi implements zzaab {
    private static final zzzp zzbvq = new zzzj();
    private final zzzp zzbvp;

    public zzzi() {
        this(new zzzk(zzyu.zzud(), zzuk()));
    }

    private zzzi(zzzp zzzpVar) {
        this.zzbvp = (zzzp) zzyw.zza(zzzpVar, "messageInfoFactory");
    }

    private static boolean zza(zzzo zzzoVar) {
        return zzzoVar.zzuo() == zzyv.zzb.zzbuw;
    }

    private static zzzp zzuk() {
        try {
            return (zzzp) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(a.FORCE_STATIC_METHOD, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzbvq;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaab
    public final <T> zzaaa<T> zzg(Class<T> cls) {
        zzaac.zzh(cls);
        zzzo zze = this.zzbvp.zze(cls);
        return zze.zzup() ? zzyv.class.isAssignableFrom(cls) ? zzzu.zza(zzaac.zzuy(), zzyq.zzty(), zze.zzuq()) : zzzu.zza(zzaac.zzuw(), zzyq.zztz(), zze.zzuq()) : zzyv.class.isAssignableFrom(cls) ? zza(zze) ? zzzt.zza(cls, zze, zzzx.zzut(), zzze.zzuj(), zzaac.zzuy(), zzyq.zzty(), zzzn.zzum()) : zzzt.zza(cls, zze, zzzx.zzut(), zzze.zzuj(), zzaac.zzuy(), null, zzzn.zzum()) : zza(zze) ? zzzt.zza(cls, zze, zzzx.zzus(), zzze.zzui(), zzaac.zzuw(), zzyq.zztz(), zzzn.zzul()) : zzzt.zza(cls, zze, zzzx.zzus(), zzze.zzui(), zzaac.zzux(), null, zzzn.zzul());
    }
}
