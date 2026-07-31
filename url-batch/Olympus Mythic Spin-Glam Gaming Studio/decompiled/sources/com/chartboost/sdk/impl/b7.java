package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface b7 {

    public static final class a {

        /* renamed from: com.chartboost.sdk.impl.b7$a$a, reason: collision with other inner class name */
        public static final class C0216a extends ContinuationImpl {
            public /* synthetic */ Object b;
            public int c;

            public C0216a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.c |= Integer.MIN_VALUE;
                Object a = a.a(null, null, this);
                return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(b7 b7Var, URL url, Continuation continuation) {
            C0216a c0216a;
            int i;
            if (continuation instanceof C0216a) {
                c0216a = (C0216a) continuation;
                int i2 = c0216a.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0216a.c = i2 - Integer.MIN_VALUE;
                    Object obj = c0216a.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0216a.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    ResultKt.throwOnFailure(obj);
                    c0216a.c = 1;
                    Object a = b7Var.a(url, -1L, c0216a);
                    return a == coroutine_suspended ? coroutine_suspended : a;
                }
            }
            c0216a = new C0216a(continuation);
            Object obj2 = c0216a.b;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0216a.c;
            if (i == 0) {
            }
        }
    }

    Object a(URL url, long j, Continuation continuation);

    Object a(URL url, Continuation continuation);

    Flow a(URL url);
}
