package ru.rustore.sdk.reactive.observable;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;

@Metadata
/* loaded from: classes3.dex */
public abstract class Observable<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Observable create$default(Companion companion, BackpressureStrategy backpressureStrategy, Function1 function1, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            return companion.create(backpressureStrategy, function1);
        }

        @NotNull
        public final <T> Observable<T> create(@NotNull BackpressureStrategy backpressureStrategy, @NotNull Function1<? super ObservableEmitter<T>, Unit> source) {
            Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
            Intrinsics.checkNotNullParameter(source, "source");
            return new ObservableCreate(backpressureStrategy, source);
        }

        private Companion() {
        }
    }

    public abstract void subscribe(@NotNull ObservableObserver<T> observableObserver);
}
