package ru.rustore.sdk.reactive.observable;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h2.n;
import h2.o;
import h2.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableCombineLatestKt {
    @NotNull
    public static final <T1, T2, R> Observable<R> combineLatest(@NotNull Observable<T1> observable, @NotNull Observable<T2> source2, @NotNull BackpressureStrategy backpressureStrategy, @NotNull Function2<? super T1, ? super T2, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return ObservableMapKt.map(new ObservableCombineLatest(new Observable[]{observable, source2}, backpressureStrategy), new ObservableCombineLatestKt$combineLatest$1(mapper));
    }

    public static /* synthetic */ Observable combineLatest$default(Observable observable, Observable observable2, BackpressureStrategy backpressureStrategy, Function2 function2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        return combineLatest(observable, observable2, backpressureStrategy, function2);
    }

    public static /* synthetic */ Observable combineLatest$default(Observable observable, Observable observable2, Observable observable3, BackpressureStrategy backpressureStrategy, n nVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        return combineLatest(observable, observable2, observable3, backpressureStrategy, nVar);
    }

    @NotNull
    public static final <T1, T2, T3, R> Observable<R> combineLatest(@NotNull Observable<T1> observable, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull BackpressureStrategy backpressureStrategy, @NotNull n mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return ObservableMapKt.map(new ObservableCombineLatest(new Observable[]{observable, source2, source3}, backpressureStrategy), new ObservableCombineLatestKt$combineLatest$2(mapper));
    }

    public static /* synthetic */ Observable combineLatest$default(Observable observable, Observable observable2, Observable observable3, Observable observable4, BackpressureStrategy backpressureStrategy, o oVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        return combineLatest(observable, observable2, observable3, observable4, backpressureStrategy, oVar);
    }

    public static /* synthetic */ Observable combineLatest$default(Observable observable, Observable observable2, Observable observable3, Observable observable4, Observable observable5, BackpressureStrategy backpressureStrategy, p pVar, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        return combineLatest(observable, observable2, observable3, observable4, observable5, backpressureStrategy, pVar);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> Observable<R> combineLatest(@NotNull Observable<T1> observable, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull BackpressureStrategy backpressureStrategy, @NotNull o mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return ObservableMapKt.map(new ObservableCombineLatest(new Observable[]{observable, source2, source3, source4}, backpressureStrategy), new ObservableCombineLatestKt$combineLatest$3(mapper));
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(@NotNull Observable<T1> observable, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull BackpressureStrategy backpressureStrategy, @NotNull p mapper) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return ObservableMapKt.map(new ObservableCombineLatest(new Observable[]{observable, source2, source3, source4, source5}, backpressureStrategy), new ObservableCombineLatestKt$combineLatest$4(mapper));
    }
}
