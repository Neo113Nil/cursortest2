package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzfb extends l implements Function2 {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfb(zzff zzffVar, String str, zzto zztoVar, d dVar) {
        super(2, dVar);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzey zzg;
        AbstractC1241b.f();
        ResultKt.a(obj);
        try {
            if (!zzff.zzb(this.zza).zzb(this.zzb)) {
                throw new zzbd(zzbb.zzc, zzba.zzQ, null);
            }
            zzg = this.zza.zzg();
            return zzg.zza(this.zzb, this.zzc);
        } catch (zzbd e4) {
            throw e4;
        } catch (Exception e5) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e5.getMessage());
        }
    }
}
