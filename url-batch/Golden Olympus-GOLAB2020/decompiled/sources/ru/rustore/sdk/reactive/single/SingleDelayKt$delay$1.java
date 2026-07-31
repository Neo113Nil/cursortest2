package ru.rustore.sdk.reactive.single;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
final class SingleDelayKt$delay$1<T> extends s implements Function1<T, Single<T>> {
    final /* synthetic */ long $delay;
    final /* synthetic */ Dispatcher $dispatcher;

    @Metadata
    /* renamed from: ru.rustore.sdk.reactive.single.SingleDelayKt$delay$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<SingleEmitter<T>, Unit> {
        final /* synthetic */ long $delay;
        final /* synthetic */ G $delayedTaskDisposable;
        final /* synthetic */ Dispatcher $dispatcher;
        final /* synthetic */ T $value;

        @Metadata
        /* renamed from: ru.rustore.sdk.reactive.single.SingleDelayKt$delay$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02601 extends s implements Function0<Unit> {
            final /* synthetic */ SingleEmitter<T> $emitter;
            final /* synthetic */ T $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02601(SingleEmitter<T> singleEmitter, T t4) {
                super(0);
                this.$emitter = singleEmitter;
                this.$value = t4;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m281invoke();
                return Unit.f41027a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m281invoke() {
                this.$emitter.success(this.$value);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(G g4, Dispatcher dispatcher, long j4, T t4) {
            super(1);
            this.$delayedTaskDisposable = g4;
            this.$dispatcher = dispatcher;
            this.$delay = j4;
            this.$value = t4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SingleEmitter) obj);
            return Unit.f41027a;
        }

        public final void invoke(SingleEmitter<T> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            this.$delayedTaskDisposable.f41132b = this.$dispatcher.executeDelayed(this.$delay, TimeUnit.MILLISECONDS, new C02601(emitter, this.$value));
        }
    }

    @Metadata
    /* renamed from: ru.rustore.sdk.reactive.single.SingleDelayKt$delay$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function0<Unit> {
        final /* synthetic */ G $delayedTaskDisposable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(G g4) {
            super(0);
            this.$delayedTaskDisposable = g4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m282invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m282invoke() {
            Disposable disposable = (Disposable) this.$delayedTaskDisposable.f41132b;
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleDelayKt$delay$1(Dispatcher dispatcher, long j4) {
        super(1);
        this.$dispatcher = dispatcher;
        this.$delay = j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SingleDelayKt$delay$1<T>) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<T> invoke(T t4) {
        G g4 = new G();
        return SingleDoOnDisposeKt.doOnDispose(Single.Companion.create(new AnonymousClass1(g4, this.$dispatcher, this.$delay, t4)), new AnonymousClass2(g4));
    }
}
