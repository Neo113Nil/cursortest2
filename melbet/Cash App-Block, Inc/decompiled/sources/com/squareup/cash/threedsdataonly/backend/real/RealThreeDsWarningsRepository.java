package com.squareup.cash.threedsdataonly.backend.real;

import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealThreeDsWarningsRepository {

    /* renamed from: io, reason: collision with root package name */
    public final CoroutineContext f1214io;
    public final StateFlowImpl warnings = FlowKt.MutableStateFlow(null);

    public RealThreeDsWarningsRepository(CoroutineContext coroutineContext) {
        this.f1214io = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: awaitWarnings-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3770awaitWarningsgIAlus(long j, ContinuationImpl continuationImpl) {
        RealThreeDsWarningsRepository$awaitWarnings$1 realThreeDsWarningsRepository$awaitWarnings$1;
        int i;
        if (continuationImpl instanceof RealThreeDsWarningsRepository$awaitWarnings$1) {
            realThreeDsWarningsRepository$awaitWarnings$1 = (RealThreeDsWarningsRepository$awaitWarnings$1) continuationImpl;
            int i2 = realThreeDsWarningsRepository$awaitWarnings$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realThreeDsWarningsRepository$awaitWarnings$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realThreeDsWarningsRepository$awaitWarnings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realThreeDsWarningsRepository$awaitWarnings$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlashControl$applyScreenFlash$3 flashControl$applyScreenFlash$3 = new FlashControl$applyScreenFlash$3(j, this, (Continuation) null, 13);
                    realThreeDsWarningsRepository$awaitWarnings$1.label = 1;
                    obj = JobKt.withContext(this.f1214io, flashControl$applyScreenFlash$3, realThreeDsWarningsRepository$awaitWarnings$1);
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
                return ((Result) obj).value;
            }
        }
        realThreeDsWarningsRepository$awaitWarnings$1 = new RealThreeDsWarningsRepository$awaitWarnings$1(this, continuationImpl);
        Object obj2 = realThreeDsWarningsRepository$awaitWarnings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realThreeDsWarningsRepository$awaitWarnings$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).value;
    }
}
