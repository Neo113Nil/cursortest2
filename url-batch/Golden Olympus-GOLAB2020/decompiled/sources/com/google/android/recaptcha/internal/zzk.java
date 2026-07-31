package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3327f;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.Q;

/* loaded from: classes.dex */
final class zzk extends l implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, zzek zzekVar, long j4, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j4;
        this.zze = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b4;
        zzen zzenVar;
        Q b5;
        Object m243constructorimpl;
        Object f4 = AbstractC1241b.f();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            ResultKt.a(obj);
            b4 = obj;
        } else {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                b5 = AbstractC3337k.b(interfaceC3316J, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null);
                arrayList.add(b5);
            }
            Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
            Q[] qArr2 = (Q[]) Arrays.copyOf(qArr, qArr.length);
            this.zzf = zzf;
            this.zza = 1;
            b4 = AbstractC3327f.b(qArr2, this);
            if (b4 == f4) {
                return f4;
            }
            zzenVar = zzf;
        }
        List list = (List) b4;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Result.m244isFailureimpl(((Result) it2.next()).h())) {
                    zzenVar.zza();
                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        Result.Companion companion = Result.Companion;
        m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(zzbdVar));
        return Result.a(m243constructorimpl);
    }
}
