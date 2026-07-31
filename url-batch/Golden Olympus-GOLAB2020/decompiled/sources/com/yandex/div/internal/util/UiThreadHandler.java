package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.internal.util.UiThreadHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class UiThreadHandler {

    @NotNull
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();

    @NotNull
    private static final Handler INSTANCE$1 = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    @NotNull
    public static final Handler get() {
        return INSTANCE$1;
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Thread.currentThread(), mainThread());
    }

    @NotNull
    public static final Thread mainThread() {
        Thread thread = Looper.getMainLooper().getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnMainThread$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final boolean postOnMainThread(@NotNull final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return INSTANCE$1.post(new Runnable() { // from class: H1.a
            @Override // java.lang.Runnable
            public final void run() {
                UiThreadHandler.postOnMainThread$lambda$0(Function0.this);
            }
        });
    }
}
