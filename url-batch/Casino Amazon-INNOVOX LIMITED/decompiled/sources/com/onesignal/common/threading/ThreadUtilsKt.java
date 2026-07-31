package com.onesignal.common.threading;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ThreadUtils.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\t\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u001a)\u0010\u000b\u001a\u00020\u00052\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u00020\u00052\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00052\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00052\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\f\u001a)\u0010\u0011\u001a\u00020\u00052\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\f\u001aE\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\u0010\u0015\u001aa\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\b\u0012\u00060\u0018j\u0002`\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"launchOnDefault", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "launchOnIO", "runOnSerialIO", "Lkotlin/Function0;", "suspendifyOnDefault", "(Lkotlin/jvm/functions/Function1;)V", "suspendifyOnIO", "onComplete", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "suspendifyOnMain", "suspendifyOnSerialIO", "suspendifyWithCompletion", "useIO", "", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "suspendifyWithErrorHandling", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThreadUtilsKt {
    public static final void suspendifyOnMain(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        OneSignalDispatchers.INSTANCE.launchOnIO(new ThreadUtilsKt$suspendifyOnMain$1(block, null));
    }

    public static /* synthetic */ void suspendifyOnIO$default(Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        suspendifyOnIO(function1, function0);
    }

    public static final void suspendifyOnIO(Function1<? super Continuation<? super Unit>, ? extends Object> block, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyWithCompletion(true, block, function0);
    }

    public static final void suspendifyOnIO(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyWithCompletion(true, block, null);
    }

    public static final void suspendifyOnDefault(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyWithCompletion(false, block, null);
    }

    public static final void suspendifyOnSerialIO(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        OneSignalDispatchers.INSTANCE.launchOnSerialIO(new ThreadUtilsKt$suspendifyOnSerialIO$1(block, null));
    }

    public static final void runOnSerialIO(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        suspendifyOnSerialIO(new ThreadUtilsKt$runOnSerialIO$1(block, null));
    }

    public static /* synthetic */ void suspendifyWithCompletion$default(boolean z, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        suspendifyWithCompletion(z, function1, function0);
    }

    public static final void suspendifyWithCompletion(boolean z, Function1<? super Continuation<? super Unit>, ? extends Object> block, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(block, "block");
        (z ? new ThreadUtilsKt$suspendifyWithCompletion$launch$1(OneSignalDispatchers.INSTANCE) : new ThreadUtilsKt$suspendifyWithCompletion$launch$2(OneSignalDispatchers.INSTANCE)).invoke(new ThreadUtilsKt$suspendifyWithCompletion$1(block, function0, null));
    }

    public static /* synthetic */ void suspendifyWithErrorHandling$default(boolean z, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        suspendifyWithErrorHandling(z, function1, function12, function0);
    }

    public static final void suspendifyWithErrorHandling(boolean z, Function1<? super Continuation<? super Unit>, ? extends Object> block, Function1<? super Exception, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(block, "block");
        (z ? new ThreadUtilsKt$suspendifyWithErrorHandling$launch$1(OneSignalDispatchers.INSTANCE) : new ThreadUtilsKt$suspendifyWithErrorHandling$launch$2(OneSignalDispatchers.INSTANCE)).invoke(new ThreadUtilsKt$suspendifyWithErrorHandling$1(block, function0, function1, null));
    }

    public static final Job launchOnIO(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return OneSignalDispatchers.INSTANCE.launchOnIO(new ThreadUtilsKt$launchOnIO$1(block, null));
    }

    public static final Job launchOnDefault(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return OneSignalDispatchers.INSTANCE.launchOnDefault(new ThreadUtilsKt$launchOnDefault$1(block, null));
    }
}
