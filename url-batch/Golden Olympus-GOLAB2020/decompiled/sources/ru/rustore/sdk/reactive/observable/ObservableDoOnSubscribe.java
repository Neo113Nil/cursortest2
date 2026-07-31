package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class ObservableDoOnSubscribe<T> extends Observable<T> {

    @NotNull
    private final Function1<Disposable, Unit> onSubscribe;

    @NotNull
    private final Observable<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableDoOnSubscribe(@NotNull Observable<T> upstream, @NotNull Function1<? super Disposable, Unit> onSubscribe) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        this.upstream = upstream;
        this.onSubscribe = onSubscribe;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull final ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableObserver<T>(this) { // from class: ru.rustore.sdk.reactive.observable.ObservableDoOnSubscribe$subscribe$wrappedObserver$1
            final /* synthetic */ ObservableDoOnSubscribe<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onComplete() {
                downstream.onComplete();
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onError(Throwable e4) {
                Intrinsics.checkNotNullParameter(e4, "e");
                downstream.onError(e4);
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onNext(T t4) {
                downstream.onNext(t4);
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onSubscribe(Disposable d4) {
                Object m243constructorimpl;
                Function1 function1;
                Intrinsics.checkNotNullParameter(d4, "d");
                ObservableDoOnSubscribe<T> observableDoOnSubscribe = this.this$0;
                try {
                    Result.Companion companion = Result.Companion;
                    function1 = ((ObservableDoOnSubscribe) observableDoOnSubscribe).onSubscribe;
                    function1.invoke(d4);
                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                ObservableObserver<T> observableObserver = downstream;
                Throwable d5 = Result.d(m243constructorimpl);
                if (d5 != null) {
                    d4.dispose();
                    observableObserver.onSubscribe(d4);
                    observableObserver.onError(d5);
                }
                ObservableObserver<T> observableObserver2 = downstream;
                if (Result.f(m243constructorimpl)) {
                    observableObserver2.onSubscribe(d4);
                }
            }
        });
    }
}
