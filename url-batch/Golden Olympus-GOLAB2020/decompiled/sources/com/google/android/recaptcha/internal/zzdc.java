package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import o2.AbstractC3337k;
import o2.Q;

/* loaded from: classes.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j4, RecaptchaAction recaptchaAction) {
        zzbd zzbdVar = !zza.d(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j4 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j4, d dVar) {
        zzcy zzcyVar;
        int i4;
        String uuid;
        zzbd zzbdVar;
        if (dVar instanceof zzcy) {
            zzcyVar = (zzcy) dVar;
            int i5 = zzcyVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzcyVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzcyVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    try {
                        uuid = UUID.randomUUID().toString();
                    } catch (zzbd e4) {
                        e = e4;
                        zzbdVar = e;
                        Result.Companion companion = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                    try {
                        Function2 zzczVar = new zzcz(this, j4, recaptchaAction, uuid, null);
                        zzcyVar.zzc = 1;
                        obj = zzg(uuid, zzczVar, zzcyVar);
                        if (obj == f4) {
                            return f4;
                        }
                    } catch (zzbd e5) {
                        e = e5;
                        zzbdVar = e;
                        Result.Companion companion2 = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.a(obj);
                    } catch (zzbd e6) {
                        zzbdVar = e6;
                        Result.Companion companion22 = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(zzbdVar.zzc()));
                    }
                }
                return ((Result) obj).h();
            }
        }
        zzcyVar = new zzcy(this, dVar);
        Object obj2 = zzcyVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzcyVar.zzc;
        if (i4 != 0) {
        }
        return ((Result) obj2).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, Function2 function2, d dVar) {
        zzdb zzdbVar;
        int i4;
        try {
            if (dVar instanceof zzdb) {
                zzdbVar = (zzdb) dVar;
                int i5 = zzdbVar.zzc;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzdbVar.zzc = i5 - Integer.MIN_VALUE;
                    Object obj = zzdbVar.zza;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzdbVar.zzc;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        zzek zza2 = this.zzd.zza();
                        zza2.zzc(str);
                        zzen zzf = zza2.zzf(9);
                        zzdbVar.zzd = zzf;
                        zzdbVar.zzc = 1;
                        obj = function2.invoke(zza2, zzdbVar);
                        str = zzf;
                        if (obj == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzen zzenVar = zzdbVar.zzd;
                        ResultKt.a(obj);
                        str = zzenVar;
                    }
                    str.zza();
                    return obj;
                }
            }
            if (i4 != 0) {
            }
            str.zza();
            return obj;
        } catch (zzbd e4) {
            str.zzb(e4);
            throw e4;
        } catch (Exception e5) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e5.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
        zzdbVar = new zzdb(this, dVar);
        Object obj2 = zzdbVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzdbVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12execute0E7RQCE(RecaptchaAction recaptchaAction, long j4, d dVar) {
        zzcw zzcwVar;
        int i4;
        if (dVar instanceof zzcw) {
            zzcwVar = (zzcw) dVar;
            int i5 = zzcwVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzcwVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzcwVar.zzc;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return ((Result) obj).h();
                }
                ResultKt.a(obj);
                zzcwVar.zzc = 1;
                Object zzf = zzf(recaptchaAction, j4, zzcwVar);
                return zzf == f4 ? f4 : zzf;
            }
        }
        zzcwVar = new zzcw(this, dVar);
        Object obj2 = zzcwVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzcwVar.zzc;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo13executegIAlus(RecaptchaAction recaptchaAction, d dVar) {
        zzcx zzcxVar;
        int i4;
        if (dVar instanceof zzcx) {
            zzcxVar = (zzcx) dVar;
            int i5 = zzcxVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzcxVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzcxVar.zzc;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return ((Result) obj).h();
                }
                ResultKt.a(obj);
                zzcxVar.zzc = 1;
                Object mo12execute0E7RQCE = mo12execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
                return mo12execute0E7RQCE == f4 ? f4 : mo12execute0E7RQCE;
            }
        }
        zzcxVar = new zzcx(this, dVar);
        Object obj2 = zzcxVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzcxVar.zzc;
        if (i4 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        Q b4;
        b4 = AbstractC3337k.b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3, null);
        return zzas.zza(b4);
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j4) {
        Q b4;
        b4 = AbstractC3337k.b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j4, null), 3, null);
        return zzas.zza(b4);
    }
}
