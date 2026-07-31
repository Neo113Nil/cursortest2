package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzd extends l implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zze zzeVar, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zza;
        ResultKt.a(obj);
        if (i4 != 0) {
            zzh = ((Result) obj).h();
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            zzh = zzeVar.zzh(zzscVar, this);
            if (zzh == f4) {
                return f4;
            }
        }
        return Result.a(zzh);
    }
}
