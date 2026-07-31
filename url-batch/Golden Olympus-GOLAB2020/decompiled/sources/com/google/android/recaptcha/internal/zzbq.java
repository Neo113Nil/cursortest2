package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;

/* loaded from: classes.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (o2.U.a(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ae -> B:11:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Function1 function1, long j4, long j5, double d4, Function1 function12, d dVar) {
        zzbp zzbpVar;
        int i4;
        long j6;
        long j7;
        double d5;
        Function1 function13;
        zzbp zzbpVar2;
        Function1 function14;
        Function1 function15;
        long j8;
        double d6;
        Exception e4;
        if (dVar instanceof zzbp) {
            zzbpVar = (zzbp) dVar;
            int i5 = zzbpVar.zzh;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzbpVar.zzh = i5 - Integer.MIN_VALUE;
                Object obj = zzbpVar.zzf;
                Object f4 = AbstractC1241b.f();
                i4 = zzbpVar.zzh;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    j6 = j4;
                    j7 = j5;
                    d5 = d4;
                    function13 = function12;
                    zzbpVar2 = zzbpVar;
                    function14 = function1;
                    zzbpVar2.zza = function14;
                    zzbpVar2.zzb = function13;
                    zzbpVar2.zzc = j7;
                    zzbpVar2.zze = d5;
                    zzbpVar2.zzd = j6;
                    zzbpVar2.zzh = 1;
                    Object invoke = function13.invoke(zzbpVar2);
                    if (invoke != f4) {
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = zzbpVar.zzd;
                        d6 = zzbpVar.zze;
                        j8 = zzbpVar.zzc;
                        function13 = (Function1) zzbpVar.zzb;
                        function15 = (Function1) zzbpVar.zza;
                        ResultKt.a(obj);
                        Function1 function16 = function15;
                        zzbpVar2 = zzbpVar;
                        function14 = function16;
                        long j9 = j8;
                        d5 = d6;
                        j7 = j9;
                        try {
                        } catch (Exception e5) {
                            e4 = e5;
                            zzbp zzbpVar3 = zzbpVar2;
                            function15 = function14;
                            zzbpVar = zzbpVar3;
                            double d7 = d5;
                            j8 = j7;
                            d6 = d7;
                            if (((Boolean) function15.invoke(e4)).booleanValue()) {
                            }
                        }
                        zzbpVar2.zza = function14;
                        zzbpVar2.zzb = function13;
                        zzbpVar2.zzc = j7;
                        zzbpVar2.zze = d5;
                        zzbpVar2.zzd = j6;
                        zzbpVar2.zzh = 1;
                        Object invoke2 = function13.invoke(zzbpVar2);
                        return invoke2 != f4 ? f4 : invoke2;
                    }
                    j6 = zzbpVar.zzd;
                    d6 = zzbpVar.zze;
                    j8 = zzbpVar.zzc;
                    function13 = (Function1) zzbpVar.zzb;
                    function15 = (Function1) zzbpVar.zza;
                    try {
                        ResultKt.a(obj);
                        return obj;
                    } catch (Exception e6) {
                        e4 = e6;
                        if (((Boolean) function15.invoke(e4)).booleanValue()) {
                            throw e4;
                        }
                        j6 = g.h((long) (j6 * d6), j8);
                        zzbpVar.zza = function15;
                        zzbpVar.zzb = function13;
                        zzbpVar.zzc = j8;
                        zzbpVar.zze = d6;
                        zzbpVar.zzd = j6;
                        zzbpVar.zzh = 2;
                    }
                }
            }
        }
        zzbpVar = new zzbp(this, dVar);
        Object obj2 = zzbpVar.zzf;
        Object f42 = AbstractC1241b.f();
        i4 = zzbpVar.zzh;
        if (i4 != 0) {
        }
    }
}
