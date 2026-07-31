package com.yandex.div.core.dagger;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$2 extends p implements Function0<Executor> {
    DivKitHistogramsModule$provideDivParsingHistogramReporter$2(Object obj) {
        super(0, obj, V1.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Executor invoke() {
        return (Executor) ((V1.a) this.receiver).get();
    }
}
