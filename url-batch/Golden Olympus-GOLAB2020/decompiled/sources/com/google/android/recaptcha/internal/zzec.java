package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.AbstractC3364y;
import o2.InterfaceC3360w;

/* loaded from: classes.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private InterfaceC3360w zzc = AbstractC3364y.c(null, 1, null);
    private zzbd zzd;
    private zzsc zze;
    private zzcm zzf;
    private final zzbi zzg;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
        zzclVar = zzcm.zza;
        this.zzf = zzclVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Function1 function1, d dVar) {
        zzdv zzdvVar;
        int i4;
        zzbn zzbnVar;
        if (dVar instanceof zzdv) {
            zzdvVar = (zzdv) dVar;
            int i5 = zzdvVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzdvVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzdvVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzbn zzbnVar2 = new zzbn();
                    zzdvVar.zzd = zzbnVar2;
                    zzdvVar.zzc = 1;
                    if (function1.invoke(zzdvVar) == f4) {
                        return f4;
                    }
                    zzbnVar = zzbnVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzbnVar = zzdvVar.zzd;
                    ResultKt.a(obj);
                }
                zzbnVar.zzc();
                return kotlin.coroutines.jvm.internal.b.c(zzbnVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzdvVar = new zzdv(this, dVar);
        Object obj2 = zzdvVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzdvVar.zzc;
        if (i4 != 0) {
        }
        zzbnVar.zzc();
        return kotlin.coroutines.jvm.internal.b.c(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:13:0x0065, B:19:0x0077, B:20:0x0080), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j4, d dVar) {
        zzdw zzdwVar;
        Object obj;
        Object f4;
        int i4;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzcm zzcmVar;
        zzci zzciVar;
        zzbd zzbdVar2;
        zzck zzckVar;
        long longValue;
        try {
            if (dVar instanceof zzdw) {
                zzdwVar = (zzdw) dVar;
                int i5 = zzdwVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzdwVar.zzd = i5 - Integer.MIN_VALUE;
                    obj = zzdwVar.zzb;
                    f4 = AbstractC1241b.f();
                    i4 = zzdwVar.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        zzdwVar.zze = this;
                        zzdwVar.zza = j4;
                        zzdwVar.zzd = 1;
                        if (zzn(j4, zzdwVar) != f4) {
                            zzecVar = this;
                        }
                        return f4;
                    }
                    if (i4 == 1) {
                        j4 = zzdwVar.zza;
                        zzecVar = zzdwVar.zze;
                        ResultKt.a(obj);
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j4 = zzdwVar.zza;
                        zzecVar2 = zzdwVar.zze;
                        try {
                            ResultKt.a(obj);
                            longValue = j4 - ((Number) obj).longValue();
                            if (longValue < 500) {
                                return kotlin.coroutines.jvm.internal.b.c(longValue);
                            }
                            throw new zzbd(zzbb.zzc, zzba.zzar, null);
                        } catch (Exception e4) {
                            e = e4;
                            if (e instanceof zzbd) {
                            }
                            if (zzbdVar == null) {
                            }
                            zzcmVar = zzecVar2.zzf;
                            zzciVar = zzcm.zzd;
                            if (!Intrinsics.areEqual(zzcmVar, zzciVar)) {
                            }
                            zzbdVar2 = zzecVar2.zzd;
                            if (zzbdVar2 == null) {
                            }
                        }
                    }
                    zzdy zzdyVar = new zzdy(j4, zzecVar, null);
                    zzdwVar.zze = zzecVar;
                    zzdwVar.zza = j4;
                    zzdwVar.zzd = 2;
                    obj = zzecVar.zzl(zzdyVar, zzdwVar);
                    if (obj != f4) {
                        zzecVar2 = zzecVar;
                        longValue = j4 - ((Number) obj).longValue();
                        if (longValue < 500) {
                        }
                    }
                    return f4;
                }
            }
            zzdy zzdyVar2 = new zzdy(j4, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j4;
            zzdwVar.zzd = 2;
            obj = zzecVar.zzl(zzdyVar2, zzdwVar);
            if (obj != f4) {
            }
            return f4;
        } catch (Exception e5) {
            e = e5;
            zzecVar2 = zzecVar;
            zzbdVar = e instanceof zzbd ? (zzbd) e : null;
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            zzcmVar = zzecVar2.zzf;
            zzciVar = zzcm.zzd;
            if (!Intrinsics.areEqual(zzcmVar, zzciVar)) {
                zzcm zzcmVar2 = zzecVar2.zzf;
                zzckVar = zzcm.zzc;
                if (!Intrinsics.areEqual(zzcmVar2, zzckVar)) {
                    throw zzbdVar;
                }
            }
            zzbdVar2 = zzecVar2.zzd;
            if (zzbdVar2 == null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
        zzdwVar = new zzdw(this, dVar);
        obj = zzdwVar.zzb;
        f4 = AbstractC1241b.f();
        i4 = zzdwVar.zzd;
        if (i4 != 0) {
        }
    }

    private final Object zzn(long j4, d dVar) {
        zzcj zzcjVar;
        zzck zzckVar;
        zzci zzciVar;
        zzck zzckVar2;
        zzcm zzcmVar = this.zzf;
        zzcjVar = zzcm.zzb;
        if (!Intrinsics.areEqual(zzcmVar, zzcjVar)) {
            zzcm zzcmVar2 = this.zzf;
            zzckVar = zzcm.zzc;
            if (!Intrinsics.areEqual(zzcmVar2, zzckVar)) {
                zzcm zzcmVar3 = this.zzf;
                zzciVar = zzcm.zzd;
                if (Intrinsics.areEqual(zzcmVar3, zzciVar) && !zzo(this.zzd)) {
                    return Unit.f41027a;
                }
                zzckVar2 = zzcm.zzc;
                this.zzf = zzckVar2;
                InterfaceC3360w c4 = AbstractC3364y.c(null, 1, null);
                this.zzc = c4;
                AbstractC3337k.d(this.zzg.zza(), null, null, new zzeb(this, c4, j4, null), 3, null);
                return Unit.f41027a;
            }
        }
        return Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzd) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zze) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j4, d dVar) {
        zzdu zzduVar;
        Object f4;
        int i4;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object zzm;
        zzec zzecVar;
        Object zzl;
        String str3;
        double d4;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        zzec zzecVar3;
        try {
            if (dVar instanceof zzdu) {
                zzduVar = (zzdu) dVar;
                int i5 = zzduVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzduVar.zzd = i5 - Integer.MIN_VALUE;
                    zzdu zzduVar2 = zzduVar;
                    Object obj = zzduVar2.zzb;
                    f4 = AbstractC1241b.f();
                    i4 = zzduVar2.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        zzduVar2.zze = this;
                        str2 = str;
                        zzduVar2.zzf = str2;
                        recaptchaAction2 = recaptchaAction;
                        zzduVar2.zzg = recaptchaAction2;
                        zzduVar2.zzd = 1;
                        zzm = zzm(j4, zzduVar2);
                        if (zzm == f4) {
                            return f4;
                        }
                        zzecVar = this;
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str4 = zzduVar2.zzf;
                                zzecVar3 = zzduVar2.zze;
                                ResultKt.a(obj);
                                zzsr zzsrVar = (zzsr) obj;
                                zzecVar3.zza.zzq(str4, zzsrVar);
                                return zzsrVar.zzj();
                            }
                            d4 = zzduVar2.zza;
                            recaptchaAction2 = zzduVar2.zzg;
                            str3 = zzduVar2.zzf;
                            zzecVar2 = zzduVar2.zze;
                            ResultKt.a(obj);
                            zzsi zzsiVar = (zzsi) obj;
                            zzdt zzdtVar = zzecVar2.zza;
                            zzscVar = zzecVar2.zze;
                            if (zzscVar == null) {
                                zzscVar = null;
                            }
                            zzsp zzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                            zzdt zzdtVar2 = zzecVar2.zza;
                            long j5 = (long) d4;
                            zzduVar2.zze = zzecVar2;
                            zzduVar2.zzf = str3;
                            zzduVar2.zzg = null;
                            zzduVar2.zzd = 3;
                            String str5 = str3;
                            obj = zzdtVar2.zzm(zzi, str5, j5, zzduVar2);
                            if (obj != f4) {
                                str4 = str5;
                                zzecVar3 = zzecVar2;
                                zzsr zzsrVar2 = (zzsr) obj;
                                zzecVar3.zza.zzq(str4, zzsrVar2);
                                return zzsrVar2.zzj();
                            }
                            return f4;
                        }
                        recaptchaAction2 = zzduVar2.zzg;
                        String str6 = zzduVar2.zzf;
                        zzecVar = zzduVar2.zze;
                        ResultKt.a(obj);
                        zzm = obj;
                        str2 = str6;
                    }
                    double longValue = ((Number) zzm).longValue();
                    zzdt zzdtVar3 = zzecVar.zza;
                    double d5 = 0.45d * longValue;
                    zzduVar2.zze = zzecVar;
                    zzduVar2.zzf = str2;
                    zzduVar2.zzg = recaptchaAction2;
                    double d6 = longValue * 0.55d;
                    zzduVar2.zza = d6;
                    zzduVar2.zzd = 2;
                    zzl = zzdtVar3.zzl(str2, (long) d5, zzduVar2);
                    if (zzl != f4) {
                        zzec zzecVar4 = zzecVar;
                        str3 = str2;
                        obj = zzl;
                        d4 = d6;
                        zzecVar2 = zzecVar4;
                        zzsi zzsiVar2 = (zzsi) obj;
                        zzdt zzdtVar4 = zzecVar2.zza;
                        zzscVar = zzecVar2.zze;
                        if (zzscVar == null) {
                        }
                        zzsp zzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                        zzdt zzdtVar22 = zzecVar2.zza;
                        long j52 = (long) d4;
                        zzduVar2.zze = zzecVar2;
                        zzduVar2.zzf = str3;
                        zzduVar2.zzg = null;
                        zzduVar2.zzd = 3;
                        String str52 = str3;
                        obj = zzdtVar22.zzm(zzi2, str52, j52, zzduVar2);
                        if (obj != f4) {
                        }
                    }
                    return f4;
                }
            }
            if (i4 != 0) {
            }
            double longValue2 = ((Number) zzm).longValue();
            zzdt zzdtVar32 = zzecVar.zza;
            double d52 = 0.45d * longValue2;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d62 = longValue2 * 0.55d;
            zzduVar2.zza = d62;
            zzduVar2.zzd = 2;
            zzl = zzdtVar32.zzl(str2, (long) d52, zzduVar2);
            if (zzl != f4) {
            }
            return f4;
        } catch (zzbd e4) {
            throw e4;
        } catch (Exception e5) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e5.getMessage());
        }
        zzduVar = new zzdu(this, dVar);
        zzdu zzduVar22 = zzduVar;
        Object obj2 = zzduVar22.zzb;
        f4 = AbstractC1241b.f();
        i4 = zzduVar22.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j4, d dVar) {
        Object zzn = zzn(j4, dVar);
        return zzn == AbstractC1241b.f() ? zzn : Unit.f41027a;
    }
}
