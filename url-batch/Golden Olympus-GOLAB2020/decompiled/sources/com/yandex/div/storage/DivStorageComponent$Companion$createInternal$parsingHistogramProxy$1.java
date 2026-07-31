package com.yandex.div.storage;

import V1.a;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1 extends s implements Function0<DivParsingHistogramProxy> {
    final /* synthetic */ a $parsingHistogramReporter;

    @Metadata
    /* renamed from: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<DivParsingHistogramReporter> {
        final /* synthetic */ a $parsingHistogramReporter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a aVar) {
            super(0);
            this.$parsingHistogramReporter = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DivParsingHistogramReporter invoke() {
            Object obj = this.$parsingHistogramReporter.get();
            Intrinsics.checkNotNullExpressionValue(obj, "parsingHistogramReporter.get()");
            return (DivParsingHistogramReporter) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1(a aVar) {
        super(0);
        this.$parsingHistogramReporter = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DivParsingHistogramProxy invoke() {
        return new DivParsingHistogramProxy(new AnonymousClass1(this.$parsingHistogramReporter));
    }
}
