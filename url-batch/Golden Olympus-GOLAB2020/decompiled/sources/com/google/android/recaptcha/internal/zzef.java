package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        zzclVar = zzcm.zza;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j4, d dVar) {
        zzed zzedVar;
        Object obj;
        Object f4;
        int i4;
        zzcj zzcjVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d4;
        zzef zzefVar;
        zzsc zzscVar;
        String str3;
        zzef zzefVar2;
        try {
            if (dVar instanceof zzed) {
                zzedVar = (zzed) dVar;
                int i5 = zzedVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzedVar.zzd = i5 - Integer.MIN_VALUE;
                    zzed zzedVar2 = zzedVar;
                    obj = zzedVar2.zzb;
                    f4 = AbstractC1241b.f();
                    i4 = zzedVar2.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        zzcm zzcmVar = this.zzb;
                        zzcjVar = zzcm.zzb;
                        if (!Intrinsics.areEqual(zzcmVar, zzcjVar)) {
                            throw new zzbd(zzbb.zzb, zzba.zzar, null);
                        }
                        double d5 = j4;
                        zzdt zzdtVar = this.zza;
                        double d6 = 0.45d * d5;
                        zzedVar2.zze = this;
                        zzedVar2.zzf = str;
                        zzedVar2.zzg = recaptchaAction;
                        double d7 = d5 * 0.55d;
                        zzedVar2.zza = d7;
                        zzedVar2.zzd = 1;
                        obj = zzdtVar.zzl(str, (long) d6, zzedVar2);
                        if (obj != f4) {
                            str2 = str;
                            recaptchaAction2 = recaptchaAction;
                            d4 = d7;
                            zzefVar = this;
                        }
                        return f4;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = zzedVar2.zzf;
                        zzefVar2 = zzedVar2.zze;
                        ResultKt.a(obj);
                        zzsr zzsrVar = (zzsr) obj;
                        zzefVar2.zza.zzq(str3, zzsrVar);
                        return zzsrVar.zzj();
                    }
                    double d8 = zzedVar2.zza;
                    recaptchaAction2 = zzedVar2.zzg;
                    String str4 = zzedVar2.zzf;
                    zzef zzefVar3 = zzedVar2.zze;
                    ResultKt.a(obj);
                    d4 = d8;
                    zzefVar = zzefVar3;
                    str2 = str4;
                    zzsi zzsiVar = (zzsi) obj;
                    zzdt zzdtVar2 = zzefVar.zza;
                    zzscVar = zzefVar.zzc;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzedVar2.zze = zzefVar;
                    zzedVar2.zzf = str2;
                    zzedVar2.zzg = null;
                    zzedVar2.zzd = 2;
                    obj = zzefVar.zza.zzm(zzi, str2, (long) d4, zzedVar2);
                    if (obj != f4) {
                        str3 = str2;
                        zzefVar2 = zzefVar;
                        zzsr zzsrVar2 = (zzsr) obj;
                        zzefVar2.zza.zzq(str3, zzsrVar2);
                        return zzsrVar2.zzj();
                    }
                    return f4;
                }
            }
            if (i4 != 0) {
            }
            zzsi zzsiVar2 = (zzsi) obj;
            zzdt zzdtVar22 = zzefVar.zza;
            zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
            }
            zzsp zzi2 = zzdtVar22.zzi(recaptchaAction2, zzsiVar2, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            obj = zzefVar.zza.zzm(zzi2, str2, (long) d4, zzedVar2);
            if (obj != f4) {
            }
            return f4;
        } catch (zzbd e4) {
            throw e4;
        } catch (Exception e5) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e5.getMessage());
        }
        zzedVar = new zzed(this, dVar);
        zzed zzedVar22 = zzedVar;
        obj = zzedVar22.zzb;
        f4 = AbstractC1241b.f();
        i4 = zzedVar22.zzd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j4, d dVar) {
        zzee zzeeVar;
        int i4;
        zzci zzciVar;
        zzcj zzcjVar;
        zzci zzciVar2;
        zzck zzckVar;
        Object obj;
        double d4;
        zzef zzefVar;
        zzcj zzcjVar2;
        try {
            if (dVar instanceof zzee) {
                zzeeVar = (zzee) dVar;
                int i5 = zzeeVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzeeVar.zzd = i5 - Integer.MIN_VALUE;
                    Object obj2 = zzeeVar.zzb;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzeeVar.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        zzcm zzcmVar = this.zzb;
                        zzcjVar = zzcm.zzb;
                        if (!Intrinsics.areEqual(zzcmVar, zzcjVar)) {
                            zzcm zzcmVar2 = this.zzb;
                            zzciVar2 = zzcm.zzd;
                            if (!Intrinsics.areEqual(zzcmVar2, zzciVar2)) {
                                zzckVar = zzcm.zzc;
                                this.zzb = zzckVar;
                                double d5 = j4;
                                try {
                                    zzdt zzdtVar = this.zza;
                                    double d6 = 0.6d * d5;
                                    zzeeVar.zze = this;
                                    double d7 = d5 * 0.4d;
                                    zzeeVar.zza = d7;
                                    zzeeVar.zzd = 1;
                                    Object zzo = zzdtVar.zzo((long) d6, zzeeVar);
                                    if (zzo != f4) {
                                        obj = zzo;
                                        d4 = d7;
                                        zzefVar = this;
                                    }
                                    return f4;
                                } catch (zzbd e4) {
                                    e = e4;
                                    j4 = this;
                                    zzciVar = zzcm.zzd;
                                    j4.zzb = zzciVar;
                                    throw e;
                                }
                            }
                        }
                        return Unit.f41027a;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzef zzefVar2 = zzeeVar.zze;
                        ResultKt.a(obj2);
                        j4 = zzefVar2;
                        zzcjVar2 = zzcm.zzb;
                        j4.zzb = zzcjVar2;
                        return Unit.f41027a;
                    }
                    double d8 = zzeeVar.zza;
                    zzef zzefVar3 = zzeeVar.zze;
                    try {
                        ResultKt.a(obj2);
                        obj = obj2;
                        d4 = d8;
                        zzefVar = zzefVar3;
                    } catch (zzbd e5) {
                        e = e5;
                        j4 = zzefVar3;
                        zzciVar = zzcm.zzd;
                        j4.zzb = zzciVar;
                        throw e;
                    }
                    zzsc zzscVar = (zzsc) obj;
                    zzefVar.zzc = zzscVar;
                    zzeeVar.zze = zzefVar;
                    zzeeVar.zzd = 2;
                    Object zzn = zzefVar.zza.zzn(zzscVar, (long) d4, zzeeVar);
                    j4 = zzefVar;
                }
            }
            if (i4 != 0) {
            }
            zzsc zzscVar2 = (zzsc) obj;
            zzefVar.zzc = zzscVar2;
            zzeeVar.zze = zzefVar;
            zzeeVar.zzd = 2;
            Object zzn2 = zzefVar.zza.zzn(zzscVar2, (long) d4, zzeeVar);
            j4 = zzefVar;
        } catch (zzbd e6) {
            e = e6;
        }
        zzeeVar = new zzee(this, dVar);
        Object obj22 = zzeeVar.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzeeVar.zzd;
    }
}
