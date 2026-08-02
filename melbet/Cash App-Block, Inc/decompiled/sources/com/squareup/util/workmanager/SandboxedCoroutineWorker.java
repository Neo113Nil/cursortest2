package com.squareup.util.workmanager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.util.cache.Cache;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/util/workmanager/SandboxedCoroutineWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lkotlinx/coroutines/CoroutineScope;", "sandboxedScope", "Lcom/squareup/util/workmanager/SandboxedWork;", "workCallback", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlinx/coroutines/CoroutineScope;Lcom/squareup/util/workmanager/SandboxedWork;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SandboxedCoroutineWorker extends CoroutineWorker {
    public final CoroutineScope sandboxedScope;
    public final SandboxedWork workCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxedCoroutineWorker(Context context, WorkerParameters workerParameters, CoroutineScope coroutineScope, SandboxedWork sandboxedWork) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        coroutineScope.getClass();
        sandboxedWork.getClass();
        this.sandboxedScope = coroutineScope;
        this.workCallback = sandboxedWork;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(Continuation continuation) {
        SandboxedCoroutineWorker$doWork$1 sandboxedCoroutineWorker$doWork$1;
        int i;
        try {
            if (continuation instanceof SandboxedCoroutineWorker$doWork$1) {
                sandboxedCoroutineWorker$doWork$1 = (SandboxedCoroutineWorker$doWork$1) continuation;
                int i2 = sandboxedCoroutineWorker$doWork$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    sandboxedCoroutineWorker$doWork$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = sandboxedCoroutineWorker$doWork$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sandboxedCoroutineWorker$doWork$1.label;
                    Continuation continuation2 = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        DeferredCoroutine async$default = JobKt.async$default(this.sandboxedScope, null, null, new Cache.AnonymousClass1(this, continuation2, 12), 3);
                        sandboxedCoroutineWorker$doWork$1.label = 1;
                        obj = async$default.awaitInternal(sandboxedCoroutineWorker$doWork$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (ListenableWorker.Result) obj;
                }
            }
            if (i != 0) {
            }
            return (ListenableWorker.Result) obj;
        } catch (CancellationException unused) {
            return new ListenableWorker.Result.Failure();
        }
        sandboxedCoroutineWorker$doWork$1 = new SandboxedCoroutineWorker$doWork$1(this, (ContinuationImpl) continuation);
        Object obj2 = sandboxedCoroutineWorker$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sandboxedCoroutineWorker$doWork$1.label;
        Continuation continuation22 = null;
    }
}
