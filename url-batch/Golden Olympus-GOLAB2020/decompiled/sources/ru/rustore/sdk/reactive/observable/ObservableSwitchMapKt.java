package ru.rustore.sdk.reactive.observable;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableSwitchMapKt {
    @NotNull
    public static final <T, R> Observable<R> switchMap(@NotNull Observable<T> observable, @NotNull BackpressureStrategy backpressureStrategy, @NotNull Function1<? super T, ? extends Observable<R>> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new ObservableSwitchMap(observable, mapper, backpressureStrategy);
    }

    public static /* synthetic */ Observable switchMap$default(Observable observable, BackpressureStrategy backpressureStrategy, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        return switchMap(observable, backpressureStrategy, function1);
    }
}
