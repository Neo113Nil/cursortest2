package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536cd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f11608a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1009ul f11609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11610c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f11611d;

    public C0536cd(IHandlerExecutor iHandlerExecutor, AbstractC1105yd abstractC1105yd, String str, SystemTimeProvider systemTimeProvider) {
        this.f11608a = iHandlerExecutor;
        this.f11609b = abstractC1105yd;
        this.f11610c = str;
        this.f11611d = systemTimeProvider;
    }

    public static final void a(C0536cd c0536cd, List list) {
        Qj qj = AbstractC0852oj.f12527a;
        C0587ed c0587ed = new C0587ed(c0536cd.f11609b, c0536cd.f11610c, c0536cd.f11611d, list);
        qj.getClass();
        qj.a(new Ej(c0587ed));
    }

    public final void a(ArrayList arrayList) {
        this.f11608a.execute(new g0.p(this, 4, arrayList));
    }
}
