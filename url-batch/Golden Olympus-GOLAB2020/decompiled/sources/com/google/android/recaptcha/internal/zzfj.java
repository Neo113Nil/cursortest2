package com.google.android.recaptcha.internal;

import W1.h;
import W1.i;
import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import o2.K;

/* loaded from: classes.dex */
public final class zzfj {
    private final h zza;

    public zzfj() {
        int i4 = zzav.zza;
        this.zza = i.b(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, d dVar) {
        zzfg zzfgVar;
        int i4;
        if (dVar instanceof zzfg) {
            zzfgVar = (zzfg) dVar;
            int i5 = zzfgVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzfgVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzfgVar.zzc;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return obj;
                }
                ResultKt.a(obj);
                zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
                zzfgVar.zzc = 1;
                Object g4 = K.g(zzfhVar, zzfgVar);
                return g4 == f4 ? f4 : g4;
            }
        }
        zzfgVar = new zzfg(zzfjVar, dVar);
        Object obj2 = zzfgVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzfgVar.zzc;
        if (i4 == 0) {
        }
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, d dVar) {
        return zzc(this, zzbrVar, zzspVar, dVar);
    }
}
