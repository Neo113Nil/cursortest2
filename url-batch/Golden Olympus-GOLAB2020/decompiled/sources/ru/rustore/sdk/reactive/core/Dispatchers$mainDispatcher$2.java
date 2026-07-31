package ru.rustore.sdk.reactive.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Dispatchers$mainDispatcher$2 extends s implements Function0<AnonymousClass1> {
    public static final Dispatchers$mainDispatcher$2 INSTANCE = new Dispatchers$mainDispatcher$2();

    @Metadata
    /* renamed from: ru.rustore.sdk.reactive.core.Dispatchers$mainDispatcher$2$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Dispatcher {
        final /* synthetic */ Handler $handler;

        AnonymousClass1(Handler handler) {
            this.$handler = handler;
        }

        @Override // ru.rustore.sdk.reactive.core.Dispatcher
        public void execute(final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.$handler.post(new Runnable() { // from class: ru.rustore.sdk.reactive.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        }

        @Override // ru.rustore.sdk.reactive.core.Dispatcher
        public Disposable executeDelayed(long j4, TimeUnit timeUnit, final Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            Intrinsics.checkNotNullParameter(block, "block");
            this.$handler.postDelayed(new Runnable() { // from class: ru.rustore.sdk.reactive.core.e
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            }, timeUnit.toMillis(j4));
            return new SimpleDisposable();
        }
    }

    Dispatchers$mainDispatcher$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new AnonymousClass1(new Handler(Looper.getMainLooper()));
    }
}
