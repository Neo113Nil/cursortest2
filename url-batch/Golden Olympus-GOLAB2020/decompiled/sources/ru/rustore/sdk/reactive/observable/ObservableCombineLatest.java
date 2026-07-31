package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;

@Metadata
/* loaded from: classes3.dex */
final class ObservableCombineLatest extends Observable<Object[]> {

    @NotNull
    private final BackpressureStrategy backpressureStrategy;

    @NotNull
    private final Observable<Object>[] sources;

    public ObservableCombineLatest(@NotNull Observable<Object>[] sources, @NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        this.sources = sources;
        this.backpressureStrategy = backpressureStrategy;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<Object[]> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        CombineCollector combineCollector = new CombineCollector(this.sources.length, downstream, this.backpressureStrategy);
        Observable<Object>[] observableArr = this.sources;
        int length = observableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            ObservableMapKt.map(observableArr[i4], new ObservableCombineLatest$subscribe$1$1(i5)).subscribe(combineCollector);
            i4++;
            i5++;
        }
    }
}
