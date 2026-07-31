package ru.rustore.sdk.reactive.observable;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableObserveOnKt {
    @NotNull
    public static final <T> Observable<T> observeOn(@NotNull Observable<T> observable, @NotNull Dispatcher dispatcher, @NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return new ObservableObserveOn(observable, dispatcher, backpressureStrategy);
    }

    public static /* synthetic */ Observable observeOn$default(Observable observable, Dispatcher dispatcher, BackpressureStrategy backpressureStrategy, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        return observeOn(observable, dispatcher, backpressureStrategy);
    }
}
