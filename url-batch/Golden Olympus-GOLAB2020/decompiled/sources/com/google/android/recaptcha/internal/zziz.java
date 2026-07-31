package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zziz extends l implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziz(zzja zzjaVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zziz(this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (o2.W0.c(20000, r6, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r6.zzx(r5) != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zzb;
        try {
        } catch (Exception e4) {
            e4.getMessage();
            zzbd zza = zzf.zza(e4, new zzbd(zzbb.zzb, zzba.zzV, e4.getMessage()));
            zzcb zzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zza;
            this.zzb = 3;
            if (zzm.zzc(zzjeVar, this) != f4) {
                zzbdVar = zza;
            }
            return f4;
        }
        if (i4 == 0) {
            ResultKt.a(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.a(obj);
                    return Unit.f41027a;
                }
                zzbdVar = (zzbd) this.zza;
                ResultKt.a(obj);
                this.zzd.zzb(zzbdVar);
                return Unit.f41027a;
            }
            ResultKt.a(obj);
        }
        zziy zziyVar = new zziy(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
