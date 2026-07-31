package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 implements Function1 {
    final /* synthetic */ Function1 $onFrame;

    public final Object invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
