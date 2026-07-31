package com.chartboost.sdk.impl;

import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public abstract class ae {

    public static final class b implements Callback {
        public final /* synthetic */ CancellableContinuation a;

        public b(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.a.isActive()) {
                CancellableContinuation cancellableContinuation = this.a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(e)));
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (this.a.isActive()) {
                this.a.resumeWith(Result.m8023constructorimpl(response));
            } else {
                response.close();
            }
        }
    }

    public static final Object a(OkHttpClient okHttpClient, Request request, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Call newCall = okHttpClient.newCall(request);
        cancellableContinuationImpl.invokeOnCancellation(new a(newCall));
        ChartboostNetworkBridge.okhttp3CallEnqueue(newCall, new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ Call b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Call call) {
            super(1);
            this.b = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void a(Throwable th) {
            this.b.cancel();
        }
    }
}
