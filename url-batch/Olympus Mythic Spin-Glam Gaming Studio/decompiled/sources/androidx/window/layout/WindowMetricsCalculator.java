package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowMetricsCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface WindowMetricsCalculator {

    /* compiled from: WindowMetricsCalculator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/window/layout/WindowMetricsCalculator;", "decorator", "Lkotlin/jvm/functions/Function1;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1 decorator = new Function1() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final WindowMetricsCalculator invoke(@NotNull WindowMetricsCalculator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        };

        private Companion() {
        }
    }
}
