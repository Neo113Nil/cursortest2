package com.yandex.div.core.widget;

import kotlin.Metadata;
import kotlin.properties.c;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface AspectView {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final c aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(0.0f), AspectView$Companion$aspectRatioProperty$1.INSTANCE);
        }
    }

    void setAspectRatio(float f4);
}
