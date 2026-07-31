package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import android.app.Application;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzdh extends l implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(zzdt zzdtVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzdh(this.zzb, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Application zzr;
        String str;
        Application zzr2;
        zzek zzekVar;
        zzbf zzt;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zza;
        ResultKt.a(obj);
        if (i4 != 0) {
            return obj;
        }
        zzbs zzbsVar = new zzbs(GoogleApiAvailabilityLight.getInstance());
        zzr = this.zzb.zzr();
        int zza = zzbsVar.zza(zzr);
        zzdt zzdtVar = this.zzb;
        str = zzdtVar.zza;
        zzr2 = zzdtVar.zzr();
        String packageName = zzr2.getPackageName();
        zzekVar = this.zzb.zzb;
        String zzd = zzekVar.zzd();
        zzt = this.zzb.zzt();
        int i5 = Build.VERSION.SDK_INT;
        String zza2 = zzt.zza();
        zztn zzf = zzto.zzf();
        zzf.zzt(str);
        zzf.zzq(packageName);
        zzf.zzu(zza);
        zzf.zzr("18.6.1");
        zzf.zzs(zzd);
        zzf.zzf(String.valueOf(i5));
        zzf.zze(zza2);
        zzto zztoVar = (zzto) zzf.zzk();
        zzdt zzdtVar2 = this.zzb;
        zzff zzg = zzdt.zzg(zzdtVar2);
        String zzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object zzc = zzg.zzc(zzb, zztoVar, this);
        return zzc == f4 ? f4 : zzc;
    }
}
