package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Arrays;
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
import o2.InterfaceC3359v0;

/* loaded from: classes.dex */
final class zzs extends l implements Function2 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzv zzvVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, dVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        InterfaceC3359v0 d4;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zza;
        ResultKt.a(obj);
        if (i4 == 0) {
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.zzd;
            ArrayList arrayList = new ArrayList();
            this.zzb.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                d4 = AbstractC3337k.d(interfaceC3316J, null, null, new zzr((zzy) arrayList3.get(i5), this.zzc, arrayList, null), 3, null);
                arrayList2.add(d4);
                i5 = i6;
            }
            InterfaceC3359v0[] interfaceC3359v0Arr = (InterfaceC3359v0[]) arrayList2.toArray(new InterfaceC3359v0[0]);
            InterfaceC3359v0[] interfaceC3359v0Arr2 = (InterfaceC3359v0[]) Arrays.copyOf(interfaceC3359v0Arr, interfaceC3359v0Arr.length);
            this.zza = 1;
            if (AbstractC3327f.d(interfaceC3359v0Arr2, this) == f4) {
                return f4;
            }
        }
        Result.Companion companion = Result.Companion;
        zzq = this.zzb.zzq(this.zzc);
        return Result.a(Result.m243constructorimpl(zzq));
    }
}
