package com.google.android.recaptcha;

import a2.AbstractC1241b;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.d;

@Metadata
/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m10getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j4, d dVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = 10000;
        }
        return recaptcha.m11getClientBWLJW6A(application, str, j4, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, d dVar) {
        return zzcq.zzd(application, str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11getClientBWLJW6A(Application application, String str, long j4, d dVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i4;
        try {
            if (dVar instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) dVar;
                int i5 = recaptcha$getClient$1.zzc;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    recaptcha$getClient$1.zzc = i5 - Integer.MIN_VALUE;
                    Object obj = recaptcha$getClient$1.zza;
                    Object f4 = AbstractC1241b.f();
                    i4 = recaptcha$getClient$1.zzc;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        Result.Companion companion = Result.Companion;
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzcq.zzb(application, str, j4, recaptcha$getClient$1);
                        if (obj == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                    }
                    return Result.m243constructorimpl((zzdc) obj);
                }
            }
            if (i4 != 0) {
            }
            return Result.m243constructorimpl((zzdc) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
        Object obj2 = recaptcha$getClient$1.zza;
        Object f42 = AbstractC1241b.f();
        i4 = recaptcha$getClient$1.zzc;
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j4) {
        return zzcq.zzc(application, str, j4);
    }
}
