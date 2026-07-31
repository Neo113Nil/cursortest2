package ru.rustore.sdk.core.util;

import a2.AbstractC1241b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import o2.U0;
import o2.W0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class WithTimeoutOrThrowKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withTimeoutOrThrow(long j4, @NotNull Function1<? super U0, ? extends Exception> function1, @NotNull Function2<? super InterfaceC3316J, ? super d, ? extends Object> function2, @NotNull d dVar) {
        WithTimeoutOrThrowKt$withTimeoutOrThrow$1 withTimeoutOrThrowKt$withTimeoutOrThrow$1;
        int i4;
        try {
            if (dVar instanceof WithTimeoutOrThrowKt$withTimeoutOrThrow$1) {
                withTimeoutOrThrowKt$withTimeoutOrThrow$1 = (WithTimeoutOrThrowKt$withTimeoutOrThrow$1) dVar;
                int i5 = withTimeoutOrThrowKt$withTimeoutOrThrow$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    withTimeoutOrThrowKt$withTimeoutOrThrow$1.label = i5 - Integer.MIN_VALUE;
                    Object obj = withTimeoutOrThrowKt$withTimeoutOrThrow$1.result;
                    Object f4 = AbstractC1241b.f();
                    i4 = withTimeoutOrThrowKt$withTimeoutOrThrow$1.label;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        return obj;
                    }
                    ResultKt.a(obj);
                    withTimeoutOrThrowKt$withTimeoutOrThrow$1.L$0 = function1;
                    withTimeoutOrThrowKt$withTimeoutOrThrow$1.label = 1;
                    Object c4 = W0.c(j4, function2, withTimeoutOrThrowKt$withTimeoutOrThrow$1);
                    return c4 == f4 ? f4 : c4;
                }
            }
            if (i4 == 0) {
            }
        } catch (U0 e4) {
            throw ((Throwable) function1.invoke(e4));
        }
        withTimeoutOrThrowKt$withTimeoutOrThrow$1 = new WithTimeoutOrThrowKt$withTimeoutOrThrow$1(dVar);
        Object obj2 = withTimeoutOrThrowKt$withTimeoutOrThrow$1.result;
        Object f42 = AbstractC1241b.f();
        i4 = withTimeoutOrThrowKt$withTimeoutOrThrow$1.label;
    }

    public static /* synthetic */ Object withTimeoutOrThrow$default(long j4, Function1 function1, Function2 function2, d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            function1 = WithTimeoutOrThrowKt$withTimeoutOrThrow$2.INSTANCE;
        }
        return withTimeoutOrThrow(j4, function1, function2, dVar);
    }
}
