package com.yandex.div.histogram;

import W1.h;
import W1.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivParsingHistogramReporter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final h DEFAULT$delegate = i.b(DivParsingHistogramReporter$Companion$DEFAULT$2.INSTANCE);

        private Companion() {
        }

        @NotNull
        public final DivParsingHistogramReporter getDEFAULT() {
            return (DivParsingHistogramReporter) DEFAULT$delegate.getValue();
        }
    }
}
