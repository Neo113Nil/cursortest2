package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import o2.K;

/* loaded from: classes.dex */
final class zzfq extends l implements Function2 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfq(zzgd zzgdVar, List list, zzft zzftVar, d dVar) {
        super(2, dVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zza;
        ResultKt.a(obj);
        if (i4 == 0) {
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !K.i(interfaceC3316J)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e4) {
                    zzufVar.zzk();
                    kotlin.coroutines.jvm.internal.b.b(zzufVar.zzg());
                    CollectionsKt.joinToString$default(zzufVar.zzj(), null, null, null, 0, null, new zzfp(this.zzd), 31, null);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzftVar.zzh(e4, zzgdVar2, this);
                    if (zzh == f4) {
                        return f4;
                    }
                }
            }
            return Unit.f41027a;
        }
        return Unit.f41027a;
    }
}
