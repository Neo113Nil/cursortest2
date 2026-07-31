package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import o2.InterfaceC3360w;

/* loaded from: classes.dex */
final class zzeb extends l implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC3360w zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzec zzecVar, InterfaceC3360w interfaceC3360w, long j4, d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
        this.zzc = interfaceC3360w;
        this.zzd = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzci zzciVar;
        zzbd e4;
        Object f4 = AbstractC1241b.f();
        if (this.zza != 0) {
            try {
                ResultKt.a(obj);
                zzebVar = this;
            } catch (zzbd e5) {
                zzbdVar = e5;
                zzebVar = this;
                zzec zzecVar = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar.zzf = zzciVar;
                zzebVar.zzc.o(zzbdVar);
                return Unit.f41027a;
            }
        } else {
            ResultKt.a(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == f4) {
                        return f4;
                    }
                } catch (zzbd e6) {
                    e4 = e6;
                    zzbdVar = e4;
                    zzec zzecVar2 = zzebVar.zzb;
                    zzciVar = zzcm.zzd;
                    zzecVar2.zzf = zzciVar;
                    zzebVar.zzc.o(zzbdVar);
                    return Unit.f41027a;
                }
            } catch (zzbd e7) {
                e4 = e7;
                zzebVar = this;
                zzbdVar = e4;
                zzec zzecVar22 = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar22.zzf = zzciVar;
                zzebVar.zzc.o(zzbdVar);
                return Unit.f41027a;
            }
        }
        ((Boolean) obj).getClass();
        return Unit.f41027a;
    }
}
