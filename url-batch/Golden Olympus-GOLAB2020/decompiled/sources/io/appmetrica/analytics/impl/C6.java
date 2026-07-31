package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class C6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f37277a;

    /* renamed from: b, reason: collision with root package name */
    public final C2681hh f37278b;

    public C6(@NotNull Context context, @NotNull InterfaceC3136z6 interfaceC3136z6, @NotNull EnumC3063wb enumC3063wb, @NotNull InterfaceC2498al interfaceC2498al, @NotNull Executor executor, @NotNull String str) {
        this.f37277a = executor;
        this.f37278b = new C2681hh(context, interfaceC3136z6, enumC3063wb, interfaceC2498al);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f37277a;
        C2681hh c2681hh = this.f37278b;
        Ib ib = c2681hh.f39150c;
        Consumer consumer = c2681hh.f39152e;
        Context context = c2681hh.f39148a;
        if (C3010ua.f39931c == null) {
            synchronized (kotlin.jvm.internal.H.b(C3010ua.class)) {
                try {
                    if (C3010ua.f39931c == null) {
                        C3010ua.f39931c = new C3010ua(context);
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3010ua c3010ua = C3010ua.f39931c;
        if (c3010ua == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c3010ua = null;
        }
        executor.execute(new RunnableC2654gg(file, ib, ib, consumer, c3010ua, c2681hh.f39149b));
    }
}
