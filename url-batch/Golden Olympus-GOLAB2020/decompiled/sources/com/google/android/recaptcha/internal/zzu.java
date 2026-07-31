package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzu extends l implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(zzsc zzscVar, zzv zzvVar, d dVar) {
        super(2, dVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzu(this.zzd, this.zze, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        Object f4 = AbstractC1241b.f();
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            ResultKt.a(obj);
        } else {
            ResultKt.a(obj);
            if (!this.zzd.zzS()) {
                Result.Companion companion = Result.Companion;
                return Result.a(Result.m243constructorimpl(ResultKt.createFailure(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() == 0) {
                Result.Companion companion2 = Result.Companion;
                return Result.a(Result.m243constructorimpl(ResultKt.createFailure(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            this.zze.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzj, this) == f4) {
                return f4;
            }
        }
        Result.Companion companion3 = Result.Companion;
        return Result.a(Result.m243constructorimpl(Unit.f41027a));
    }
}
