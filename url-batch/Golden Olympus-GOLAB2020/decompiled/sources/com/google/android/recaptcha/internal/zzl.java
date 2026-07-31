package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o2.K;

/* loaded from: classes.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        CollectionsKt.addAll(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j4, d dVar) {
        return K.g(new zzh(this, str, j4, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j4, zzsc zzscVar, zzek zzekVar, d dVar) {
        zzi zziVar;
        int i4;
        if (dVar instanceof zzi) {
            zziVar = (zzi) dVar;
            int i5 = zziVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zziVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zziVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzk zzkVar = new zzk(this, zzekVar, j4, zzscVar, null);
                    zziVar.zzc = 1;
                    obj = K.g(zzkVar, zziVar);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return ((Result) obj).h();
            }
        }
        zziVar = new zzi(this, dVar);
        Object obj2 = zziVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zziVar.zzc;
        if (i4 != 0) {
        }
        return ((Result) obj2).h();
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        List emptyList = CollectionsKt.emptyList();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) emptyList.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
