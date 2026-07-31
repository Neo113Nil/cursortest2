package com.yandex.div.histogram;

import com.yandex.div.histogram.HistogramFilter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface HistogramFilter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final HistogramFilter ON = new HistogramFilter() { // from class: E1.c
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                boolean ON$lambda$0;
                ON$lambda$0 = HistogramFilter.Companion.ON$lambda$0(str);
                return ON$lambda$0;
            }
        };

        @NotNull
        private static final HistogramFilter OFF = new HistogramFilter() { // from class: E1.d
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                boolean OFF$lambda$1;
                OFF$lambda$1 = HistogramFilter.Companion.OFF$lambda$1(str);
                return OFF$lambda$1;
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean OFF$lambda$1(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ON$lambda$0(String str) {
            return true;
        }

        @NotNull
        public final HistogramFilter getOFF() {
            return OFF;
        }

        @NotNull
        public final HistogramFilter getON() {
            return ON;
        }
    }

    boolean report(@Nullable String str);
}
