package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632g6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final Ug f11908b;

    public C0632g6(Context context, InterfaceC0555d6 interfaceC0555d6, EnumC0508bb enumC0508bb, InterfaceC0492al interfaceC0492al, Executor executor, String str) {
        this.f11907a = executor;
        this.f11908b = new Ug(context, interfaceC0555d6, enumC0508bb, interfaceC0492al);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f11907a;
        Ug ug = this.f11908b;
        C0818nb c0818nb = ug.f11056c;
        Consumer consumer = ug.f11058e;
        Context context = ug.f11054a;
        if (Z9.f11362c == null) {
            synchronized (kotlin.jvm.internal.q.a(Z9.class)) {
                if (Z9.f11362c == null) {
                    Z9.f11362c = new Z9(context);
                }
            }
        }
        Z9 z9 = Z9.f11362c;
        if (z9 != null) {
            executor.execute(new Tf(file, c0818nb, c0818nb, consumer, z9, ug.f11055b));
        } else {
            kotlin.jvm.internal.i.i("INSTANCE");
            throw null;
        }
    }
}
