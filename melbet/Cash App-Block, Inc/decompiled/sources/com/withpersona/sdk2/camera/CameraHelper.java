package com.withpersona.sdk2.camera;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CameraHelper {
    public static final CameraHelper INSTANCE = new CameraHelper();

    public static final Regex access$fieldRegex(CameraHelper cameraHelper, String str) {
        return new Regex(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n", str, "(.+?)(\n|$)"));
    }

    public static Date convertDate(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("MMddyyyy", Locale.US).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String parseField(String str, Regex regex) {
        Regex.Companion companion = Regex.INSTANCE;
        MatcherMatchResult find = regex.find(str);
        if (find != null) {
            return (String) CollectionsKt.getOrNull(1, find.getGroupValues());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r9, r1, r0) == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r8 != r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r8 == r10) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object unbind(Context context, ContinuationImpl continuationImpl) {
        CameraHelper$unbind$1 cameraHelper$unbind$1;
        int i;
        if (continuationImpl instanceof CameraHelper$unbind$1) {
            cameraHelper$unbind$1 = (CameraHelper$unbind$1) continuationImpl;
            int i2 = cameraHelper$unbind$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraHelper$unbind$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraHelper$unbind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraHelper$unbind$1.label;
                int i3 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    CameraHelper$unbind$2 cameraHelper$unbind$2 = new CameraHelper$unbind$2(context, continuation, 22);
                    cameraHelper$unbind$1.label = 1;
                    obj = JobKt.withContext(handlerContext, cameraHelper$unbind$2, cameraHelper$unbind$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
                    CameraHelper$unbind$2 cameraHelper$unbind$22 = new CameraHelper$unbind$2((ProcessCameraProvider) obj, continuation, i3);
                    cameraHelper$unbind$1.label = 3;
                }
                DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0 = new CameraHelper$$ExternalSyntheticLambda0((ListenableFuture) obj, i3);
                cameraHelper$unbind$1.label = 2;
                obj = InterruptibleKt.runInterruptible(defaultIoScheduler, cameraHelper$$ExternalSyntheticLambda0, cameraHelper$unbind$1);
            }
        }
        cameraHelper$unbind$1 = new CameraHelper$unbind$1(this, continuationImpl);
        Object obj2 = cameraHelper$unbind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraHelper$unbind$1.label;
        int i32 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        DefaultScheduler defaultScheduler32 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
        CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda02 = new CameraHelper$$ExternalSyntheticLambda0((ListenableFuture) obj2, i32);
        cameraHelper$unbind$1.label = 2;
        obj2 = InterruptibleKt.runInterruptible(defaultIoScheduler2, cameraHelper$$ExternalSyntheticLambda02, cameraHelper$unbind$1);
    }
}
