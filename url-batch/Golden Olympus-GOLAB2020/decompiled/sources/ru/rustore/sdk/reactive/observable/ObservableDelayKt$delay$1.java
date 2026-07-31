package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDelayKt;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.reactive.single.SingleToObservableKt;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
final class ObservableDelayKt$delay$1<T> extends s implements Function1<T, Observable<T>> {
    final /* synthetic */ long $delay;
    final /* synthetic */ Dispatcher $dispatcher;

    @Metadata
    /* renamed from: ru.rustore.sdk.reactive.observable.ObservableDelayKt$delay$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<SingleEmitter<T>, Unit> {
        final /* synthetic */ T $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(T t4) {
            super(1);
            this.$value = t4;
        }

        public final void invoke(SingleEmitter<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SingleEmitter) obj);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableDelayKt$delay$1(long j4, Dispatcher dispatcher) {
        super(1);
        this.$delay = j4;
        this.$dispatcher = dispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ObservableDelayKt$delay$1<T>) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<T> invoke(T t4) {
        return SingleToObservableKt.toObservable(SingleDelayKt.delay(Single.Companion.create(new AnonymousClass1(t4)), this.$delay, this.$dispatcher));
    }
}
