package ru.rustore.sdk.metrics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class MetricsTimeoutListener {
    public static final MetricsTimeoutListener INSTANCE = new MetricsTimeoutListener();
    private static Function2<? super Integer, ? super Integer, Unit> timeoutListener;

    private MetricsTimeoutListener() {
    }

    public final void onHandleTimeout$sdk_public_metrics_release(int i4, int i5) {
        Function2<? super Integer, ? super Integer, Unit> function2 = timeoutListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    public final void setTimeoutListener(Function2<? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (timeoutListener != null) {
            return;
        }
        timeoutListener = listener;
    }
}
