package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Arrays;
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
final class zzh extends l implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzl zzlVar, String str, long j4, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        Object b4;
        zzen zzenVar2;
        Q b5;
        Object f4 = AbstractC1241b.f();
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            ResultKt.a(obj);
            b4 = obj;
        } else {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    b5 = AbstractC3337k.b(interfaceC3316J, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null);
                    arrayList.add(b5);
                }
            }
            Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
            Q[] qArr2 = (Q[]) Arrays.copyOf(qArr, qArr.length);
            this.zze = zzenVar;
            this.zza = 1;
            b4 = AbstractC3327f.b(qArr2, this);
            if (b4 == f4) {
                return f4;
            }
            zzenVar2 = zzenVar;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) b4).iterator();
        while (it.hasNext()) {
            Object h4 = ((Result) it.next()).h();
            if (Result.f(h4)) {
                zzf.zzh((zzsi) h4);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
