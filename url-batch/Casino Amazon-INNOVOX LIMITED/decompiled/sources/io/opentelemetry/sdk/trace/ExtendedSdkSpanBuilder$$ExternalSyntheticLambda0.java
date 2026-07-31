package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.trace.Span;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ExtendedSdkSpanBuilder$$ExternalSyntheticLambda0 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ExtendedSdkSpanBuilder.setSpanError((Span) obj, (Throwable) obj2);
    }
}
