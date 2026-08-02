package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691n6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7923a;

    /* renamed from: b, reason: collision with root package name */
    public final Zg f7924b;

    public C0691n6(Context context, InterfaceC0613k6 interfaceC0613k6, EnumC0567ib enumC0567ib, InterfaceC0473el interfaceC0473el, Executor executor, String str) {
        this.f7923a = executor;
        this.f7924b = new Zg(context, interfaceC0613k6, enumC0567ib, interfaceC0473el);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f7923a;
        Zg zg = this.f7924b;
        C0877ub c0877ub = zg.f6951c;
        Consumer consumer = zg.f6953e;
        Context context = zg.f6949a;
        if (C0514ga.f7390c == null) {
            synchronized (kotlin.jvm.internal.r.a(C0514ga.class)) {
                if (C0514ga.f7390c == null) {
                    C0514ga.f7390c = new C0514ga(context);
                }
            }
        }
        C0514ga c0514ga = C0514ga.f7390c;
        if (c0514ga != null) {
            executor.execute(new Yf(file, c0877ub, c0877ub, consumer, c0514ga, zg.f6950b));
        } else {
            kotlin.jvm.internal.j.g("INSTANCE");
            throw null;
        }
    }
}
