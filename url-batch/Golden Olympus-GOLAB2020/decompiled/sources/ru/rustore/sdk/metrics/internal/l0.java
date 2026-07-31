package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class l0 {
    public l0(t metricsEventSerializer) {
        Intrinsics.checkNotNullParameter(metricsEventSerializer, "metricsEventSerializer");
    }

    public final j0 a(d0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f43698a;
        byte[] bytes = t.a(model.f43699b).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new j0(str, bytes);
    }
}
