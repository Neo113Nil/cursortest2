package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableTakeFirstKt {
    @NotNull
    public static final <T> Observable<T> takeFirst(@NotNull Observable<T> observable, int i4) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return new ObservableTakeFirst(observable, i4);
    }

    public static /* synthetic */ Observable takeFirst$default(Observable observable, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 1;
        }
        return takeFirst(observable, i4);
    }
}
