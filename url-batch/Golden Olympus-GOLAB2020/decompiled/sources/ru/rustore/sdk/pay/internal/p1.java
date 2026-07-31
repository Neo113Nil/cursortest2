package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p1 extends kotlin.jvm.internal.s implements Function1<h1, CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f44766a = new p1();

    public p1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h1 app = (h1) obj;
        Intrinsics.checkNotNullParameter(app, "app");
        return app.f44193c.getValue();
    }
}
