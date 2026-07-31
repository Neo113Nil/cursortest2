package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.tasks.OnCompletionListener;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.internal.dh;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* loaded from: classes3.dex */
public final class dh {

    public static final class a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task<T>.TaskResultProvider f43966a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f43966a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable error = (Throwable) obj;
            Intrinsics.checkNotNullParameter(error, "error");
            this.f43966a.setTaskErrorResult(error);
            return Unit.f41027a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends kotlin.jvm.internal.s implements Function1<T, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task<T>.TaskResultProvider f43967a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f43967a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.f43967a.setTaskSuccessResult(obj);
            return Unit.f41027a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task<T>.TaskResultProvider f43968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f43968a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable error = (Throwable) obj;
            Intrinsics.checkNotNullParameter(error, "error");
            this.f43968a.setTaskErrorResult(error);
            return Unit.f41027a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task<T>.TaskResultProvider f43969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Task<T>.TaskResultProvider taskResultProvider) {
            super(0);
            this.f43969a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.f43969a.setTaskErrorResult(new IllegalStateException("onComplete() called before value was received"));
            return Unit.f41027a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class e<T> extends kotlin.jvm.internal.s implements Function1<T, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task<T>.TaskResultProvider f43970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Task<T>.TaskResultProvider taskResultProvider) {
            super(1);
            this.f43970a = taskResultProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.f43970a.setTaskSuccessResult(obj);
            return Unit.f41027a;
        }
    }

    @NotNull
    public static final <T> Task<T> a(@NotNull Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Pair<Task<T>, Task<T>.TaskResultProvider> create = Task.Companion.create();
        Task<T> component1 = create.component1();
        Task<T>.TaskResultProvider component2 = create.component2();
        final Disposable subscribe = SingleSubscribeKt.subscribe(single, new a(component2), new b(component2));
        component1.addOnCompletionListener(new OnCompletionListener() { // from class: D3.b
            @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
            public final void onComplete(Throwable th) {
                dh.a(Disposable.this, th);
            }
        });
        return component1;
    }

    public static final void b(Disposable disposable, Throwable th) {
        disposable.dispose();
    }

    public static final void a(Disposable disposable, Throwable th) {
        disposable.dispose();
    }

    @NotNull
    public static final <T> Task<T> a(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Pair<Task<T>, Task<T>.TaskResultProvider> create = Task.Companion.create();
        Task<T> component1 = create.component1();
        Task<T>.TaskResultProvider component2 = create.component2();
        final Disposable subscribe = ObservableSubscribeKt.subscribe(observable, new c(component2), new d(component2), new e(component2));
        component1.addOnCompletionListener(new OnCompletionListener() { // from class: D3.c
            @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
            public final void onComplete(Throwable th) {
                dh.b(Disposable.this, th);
            }
        });
        return component1;
    }
}
