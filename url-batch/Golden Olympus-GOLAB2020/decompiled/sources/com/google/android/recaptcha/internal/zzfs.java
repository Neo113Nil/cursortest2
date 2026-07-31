package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzfs extends l implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfs(zzgd zzgdVar, zzft zzftVar, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzhx zzhxVar;
        Object zzg;
        zzub zzubVar;
        zzjh zzjhVar;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zzc;
        try {
        } catch (Exception e4) {
            zzft zzftVar = this.zze;
            zzgd zzgdVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzftVar.zzh(e4, zzgdVar, this);
        }
        if (i4 == 0) {
            ResultKt.a(obj);
            this.zzd.zza = new zzbn();
            zzub zzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzi.zzf();
            zzhxVar = this.zze.zzc;
            zztz zza = zzhxVar.zza(zzi);
            zzjh zzb = zzjh.zzb();
            zzft zzftVar2 = this.zze;
            List zzi2 = zza.zzi();
            zzgd zzgdVar2 = this.zzd;
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzftVar2.zzg(zzi2, zzgdVar2, this);
            if (zzg != f4) {
                zzubVar = zzi;
                zzjhVar = zzb;
            }
            return f4;
        }
        if (i4 != 1) {
            ResultKt.a(obj);
            return Unit.f41027a;
        }
        zzjhVar = (zzjh) this.zzb;
        zzubVar = (zzub) this.zza;
        ResultKt.a(obj);
        zzjhVar.zzf();
        kotlin.coroutines.jvm.internal.b.c(zzjhVar.zza(TimeUnit.MICROSECONDS));
        zzubVar.zzf();
        return Unit.f41027a;
    }
}
