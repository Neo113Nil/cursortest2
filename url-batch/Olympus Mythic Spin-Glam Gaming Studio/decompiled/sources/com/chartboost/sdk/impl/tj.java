package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.sd;
import com.pubmatic.sdk.video.POBVastError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class tj {
    public final sd a;

    public static final class a extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = tj.this.a(null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public tj(sd networkClient) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        this.a = networkClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|8|(1:(2:11|12)(2:49|50))(3:51|52|(1:54))|13|(4:15|(3:17|(1:19)(1:44)|(3:21|22|(1:43)(6:24|25|(1:27)|(1:38)(1:31)|32|(1:34)(2:36|37))))|45|46)(2:47|48)))|57|6|7|8|(0)(0)|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0032, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x0052, B:15:0x005a, B:17:0x0060, B:21:0x006a, B:45:0x006f, B:46:0x007c, B:47:0x007d, B:48:0x009b, B:52:0x003f), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x0052, B:15:0x005a, B:17:0x0060, B:21:0x006a, B:45:0x006f, B:46:0x007c, B:47:0x007d, B:48:0x009b, B:52:0x003f), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        a aVar;
        int i;
        Integer a2;
        wd wdVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    sd sdVar = this.a;
                    aVar2.b = str;
                    aVar2.e = 1;
                    obj = sd.a.a(sdVar, str, null, aVar2, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) aVar2.b;
                    ResultKt.throwOnFailure(obj);
                }
                wdVar = (wd) obj;
                if (wdVar.f()) {
                    throw new sj("Failed to fetch VAST. HTTP response code: " + wdVar.e(), Boxing.boxInt(301));
                }
                String a3 = wdVar.a();
                if (a3 != null) {
                    if (a3.length() <= 0) {
                        a3 = null;
                    }
                    if (a3 != null) {
                        Object m8023constructorimpl = Result.m8023constructorimpl(a3);
                        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                        if (m8026exceptionOrNullimpl == null) {
                            return m8023constructorimpl;
                        }
                        try {
                            sj sjVar = m8026exceptionOrNullimpl instanceof sj ? (sj) m8026exceptionOrNullimpl : null;
                            int intValue = (sjVar == null || (a2 = sjVar.a()) == null) ? 301 : a2.intValue();
                            xb.b("VAST fetch failed: url=" + str + ", vastErrorCode=" + intValue + ", errorType=" + m8026exceptionOrNullimpl.getClass().getSimpleName() + ", message=" + m8026exceptionOrNullimpl.getMessage(), m8026exceptionOrNullimpl);
                            if (m8026exceptionOrNullimpl instanceof sj) {
                                throw m8026exceptionOrNullimpl;
                            }
                            throw new sj("Error fetching VAST from URL: " + str + ". " + m8026exceptionOrNullimpl.getMessage(), Boxing.boxInt(301));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                }
                throw new sj("Received empty VAST response.", Boxing.boxInt(POBVastError.NO_VAST_RESPONSE));
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.e;
        if (i != 0) {
        }
        wdVar = (wd) obj2;
        if (wdVar.f()) {
        }
    }
}
