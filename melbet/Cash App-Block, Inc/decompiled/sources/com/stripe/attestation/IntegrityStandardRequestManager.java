package com.stripe.attestation;

import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.integrity.be;
import com.google.android.play.core.integrity.bw;
import com.google.android.play.core.integrity.bx;
import com.google.android.play.core.integrity.i;
import com.google.android.play.core.integrity.k;
import com.google.android.play.core.integrity.o;
import com.google.android.play.core.integrity.q;
import com.squareup.cash.filament.util.MeshLoaderKt;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class IntegrityStandardRequestManager {
    public final long cloudProjectNumber;
    public final RealStandardIntegrityManagerFactory factory;
    public bx integrityTokenProvider;
    public final KotterKnifeKt$$ExternalSyntheticLambda0 logError;
    public final Mutex mutex;
    public final Lazy standardIntegrityManager$delegate;

    public IntegrityStandardRequestManager(KotterKnifeKt$$ExternalSyntheticLambda0 kotterKnifeKt$$ExternalSyntheticLambda0, RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory) {
        MutexImpl mutexImpl = new MutexImpl();
        this.cloudProjectNumber = 527113280969L;
        this.logError = kotterKnifeKt$$ExternalSyntheticLambda0;
        this.factory = realStandardIntegrityManagerFactory;
        this.mutex = mutexImpl;
        this.standardIntegrityManager$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 29));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(11:11|12|13|14|(1:16)|17|18|19|(1:21)|22|(1:32)(3:24|25|26))(2:37|38))(3:39|40|41))(4:55|56|(1:58)|51)|42|43|44|(3:46|47|48)(3:49|(9:52|14|(0)|17|18|19|(0)|22|(0)(0))|51)))|42|43|44|(0)(0))|61|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004a, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        r0 = kotlin.Result.Companion;
        r15 = new kotlin.Result.Failure(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:14:0x00d8, B:16:0x00e4, B:17:0x00e9), top: B:12:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070 A[Catch: all -> 0x008d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:43:0x0068, B:46:0x0070, B:49:0x0092), top: B:42:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092 A[Catch: all -> 0x008d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:43:0x0068, B:46:0x0070, B:49:0x0092), top: B:42:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: prepare-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4078prepareIoAF18A(ContinuationImpl continuationImpl) {
        IntegrityStandardRequestManager$prepare$1 integrityStandardRequestManager$prepare$1;
        int i;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        Mutex mutex;
        int i2;
        IntegrityStandardRequestManager integrityStandardRequestManager;
        int i3;
        Mutex mutex2;
        Throwable th;
        bx bxVar;
        IntegrityStandardRequestManager integrityStandardRequestManager2;
        Object result;
        try {
            if (continuationImpl instanceof IntegrityStandardRequestManager$prepare$1) {
                integrityStandardRequestManager$prepare$1 = (IntegrityStandardRequestManager$prepare$1) continuationImpl;
                int i4 = integrityStandardRequestManager$prepare$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    integrityStandardRequestManager$prepare$1.label = i4 - PKIFailureInfo.systemUnavail;
                    Object obj = integrityStandardRequestManager$prepare$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = integrityStandardRequestManager$prepare$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        mutex = this.mutex;
                        integrityStandardRequestManager$prepare$1.L$0 = this;
                        integrityStandardRequestManager$prepare$1.L$1 = mutex;
                        i2 = 0;
                        integrityStandardRequestManager$prepare$1.I$0 = 0;
                        integrityStandardRequestManager$prepare$1.I$1 = 0;
                        integrityStandardRequestManager$prepare$1.label = 1;
                        if (mutex.lock(integrityStandardRequestManager$prepare$1) != coroutineSingletons) {
                            integrityStandardRequestManager = this;
                            i3 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = integrityStandardRequestManager$prepare$1.L$1;
                        integrityStandardRequestManager2 = integrityStandardRequestManager$prepare$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            result = TaskExtensionsKt.toResult((Task) obj);
                            Result.Companion companion2 = Result.Companion;
                            if (!(result instanceof Result.Failure)) {
                                integrityStandardRequestManager2.integrityTokenProvider = (bx) result;
                            }
                            SafeTrace.throwOnFailure(result);
                            failure = (bx) result;
                            mutex2.unlock(null);
                            if (!(failure instanceof Result.Failure)) {
                                failure = Unit.INSTANCE;
                            }
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                return failure;
                            }
                            try {
                                this.logError.invoke("Integrity - Failed to prepare integrity token", m4120exceptionOrNullimpl);
                                Map map = AttestationError.errorCodeToErrorTypeMap;
                                throw MeshLoaderKt.fromException(m4120exceptionOrNullimpl);
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.Companion;
                                return new Result.Failure(th2);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    i2 = integrityStandardRequestManager$prepare$1.I$1;
                    i3 = integrityStandardRequestManager$prepare$1.I$0;
                    Mutex mutex3 = integrityStandardRequestManager$prepare$1.L$1;
                    integrityStandardRequestManager = integrityStandardRequestManager$prepare$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutex = mutex3;
                    bxVar = integrityStandardRequestManager.integrityTokenProvider;
                    Lazy lazy = integrityStandardRequestManager.standardIntegrityManager$delegate;
                    if (bxVar == null) {
                        Log.d("Integrity", "Integrity token already prepared - instance: " + ((be) lazy.getValue()));
                        Result.Companion companion4 = Result.Companion;
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit;
                    }
                    Log.d("Integrity", "Preparing integrity token provider - instance: " + ((be) lazy.getValue()));
                    be beVar = (be) lazy.getValue();
                    i builder = k.builder();
                    builder.a = integrityStandardRequestManager.cloudProjectNumber;
                    builder.c = (byte) (1 | builder.c);
                    Task prepareIntegrityToken = beVar.prepareIntegrityToken(builder.build());
                    integrityStandardRequestManager$prepare$1.L$0 = integrityStandardRequestManager;
                    integrityStandardRequestManager$prepare$1.L$1 = mutex;
                    integrityStandardRequestManager$prepare$1.I$0 = i3;
                    integrityStandardRequestManager$prepare$1.I$1 = i2;
                    integrityStandardRequestManager$prepare$1.label = 2;
                    Object awaitTask$default = TaskExtensionsKt.awaitTask$default(prepareIntegrityToken, integrityStandardRequestManager$prepare$1);
                    if (awaitTask$default != coroutineSingletons) {
                        mutex2 = mutex;
                        obj = awaitTask$default;
                        integrityStandardRequestManager2 = integrityStandardRequestManager;
                        result = TaskExtensionsKt.toResult((Task) obj);
                        Result.Companion companion22 = Result.Companion;
                        if (!(result instanceof Result.Failure)) {
                        }
                        SafeTrace.throwOnFailure(result);
                        failure = (bx) result;
                        mutex2.unlock(null);
                        if (!(failure instanceof Result.Failure)) {
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            bxVar = integrityStandardRequestManager.integrityTokenProvider;
            Lazy lazy2 = integrityStandardRequestManager.standardIntegrityManager$delegate;
            if (bxVar == null) {
            }
        } catch (Throwable th4) {
            mutex2 = mutex;
            th = th4;
            mutex2.unlock(null);
            throw th;
        }
        integrityStandardRequestManager$prepare$1 = new IntegrityStandardRequestManager$prepare$1(this, continuationImpl);
        Object obj2 = integrityStandardRequestManager$prepare$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = integrityStandardRequestManager$prepare$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|(1:26)(3:18|19|20))(2:27|28))(2:29|30))(3:39|40|(2:42|(2:44|36)(1:45))(3:46|32|(1:34)(2:37|38)))|31|32|(0)(0)))|49|6|7|(0)(0)|31|32|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x002b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        r0 = kotlin.Result.Companion;
        r7 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x007e, B:30:0x0037, B:31:0x0057, B:32:0x005c, B:34:0x0060, B:37:0x008c, B:38:0x0093, B:40:0x0042, B:42:0x0049), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x007e, B:30:0x0037, B:31:0x0057, B:32:0x005c, B:34:0x0060, B:37:0x008c, B:38:0x0093, B:40:0x0042, B:42:0x0049), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: request-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4079requestgIAlus(ContinuationImpl continuationImpl) {
        IntegrityStandardRequestManager$request$1 integrityStandardRequestManager$request$1;
        int i;
        int i2;
        IntegrityStandardRequestManager integrityStandardRequestManager;
        Object m4078prepareIoAF18A;
        bx bxVar;
        if (continuationImpl instanceof IntegrityStandardRequestManager$request$1) {
            integrityStandardRequestManager$request$1 = (IntegrityStandardRequestManager$request$1) continuationImpl;
            int i3 = integrityStandardRequestManager$request$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                integrityStandardRequestManager$request$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = integrityStandardRequestManager$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = integrityStandardRequestManager$request$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    i2 = 0;
                    if (this.integrityTokenProvider == null) {
                        integrityStandardRequestManager$request$1.L$1 = this;
                        integrityStandardRequestManager$request$1.I$0 = 0;
                        integrityStandardRequestManager$request$1.label = 1;
                        m4078prepareIoAF18A = m4078prepareIoAF18A(integrityStandardRequestManager$request$1);
                        if (m4078prepareIoAF18A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        integrityStandardRequestManager = this;
                    } else {
                        integrityStandardRequestManager = this;
                        bxVar = integrityStandardRequestManager.integrityTokenProvider;
                        if (bxVar == null) {
                            throw new IllegalArgumentException("Integrity token provider is not initialized after prepare()");
                        }
                        o builder = q.builder();
                        builder.a = null;
                        zzw request = bxVar.request(builder.build());
                        request.getClass();
                        integrityStandardRequestManager$request$1.L$1 = null;
                        integrityStandardRequestManager$request$1.I$0 = i2;
                        integrityStandardRequestManager$request$1.label = 2;
                        obj = TaskExtensionsKt.awaitTask$default(request, integrityStandardRequestManager$request$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        Object result = TaskExtensionsKt.toResult((Task) obj);
                        SafeTrace.throwOnFailure(result);
                        Object failure = (bw) result;
                        Result.Companion companion2 = Result.Companion;
                        if (!(failure instanceof Result.Failure)) {
                            failure = ((bw) failure).a;
                        }
                        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl == null) {
                            return failure;
                        }
                        try {
                            this.logError.invoke("Integrity - Failed to request integrity token", m4120exceptionOrNullimpl);
                            Map map = AttestationError.errorCodeToErrorTypeMap;
                            throw MeshLoaderKt.fromException(m4120exceptionOrNullimpl);
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.Companion;
                            return new Result.Failure(th);
                        }
                    }
                    i2 = integrityStandardRequestManager$request$1.I$0;
                    integrityStandardRequestManager = integrityStandardRequestManager$request$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    m4078prepareIoAF18A = ((Result) obj).value;
                }
                SafeTrace.throwOnFailure(m4078prepareIoAF18A);
                bxVar = integrityStandardRequestManager.integrityTokenProvider;
                if (bxVar == null) {
                }
            }
        }
        integrityStandardRequestManager$request$1 = new IntegrityStandardRequestManager$request$1(this, continuationImpl);
        Object obj2 = integrityStandardRequestManager$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = integrityStandardRequestManager$request$1.label;
        if (i != 0) {
        }
        SafeTrace.throwOnFailure(m4078prepareIoAF18A);
        bxVar = integrityStandardRequestManager.integrityTokenProvider;
        if (bxVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: requestToken-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4080requestTokengIAlus(ContinuationImpl continuationImpl) {
        IntegrityStandardRequestManager$requestToken$1 integrityStandardRequestManager$requestToken$1;
        int i;
        if (continuationImpl instanceof IntegrityStandardRequestManager$requestToken$1) {
            integrityStandardRequestManager$requestToken$1 = (IntegrityStandardRequestManager$requestToken$1) continuationImpl;
            int i2 = integrityStandardRequestManager$requestToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                integrityStandardRequestManager$requestToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = integrityStandardRequestManager$requestToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = integrityStandardRequestManager$requestToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    integrityStandardRequestManager$requestToken$1.label = 1;
                    Object m4079requestgIAlus = m4079requestgIAlus(integrityStandardRequestManager$requestToken$1);
                    return m4079requestgIAlus == obj2 ? obj2 : m4079requestgIAlus;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return ((Result) obj).value;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        integrityStandardRequestManager$requestToken$1 = new IntegrityStandardRequestManager$requestToken$1(this, continuationImpl);
        Object obj3 = integrityStandardRequestManager$requestToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = integrityStandardRequestManager$requestToken$1.label;
        if (i != 0) {
        }
    }
}
