package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594jd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7641a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0990yl f7642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7643c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f7644d;

    public C0594jd(IHandlerExecutor iHandlerExecutor, Fd fd, String str, SystemTimeProvider systemTimeProvider) {
        this.f7641a = iHandlerExecutor;
        this.f7642b = fd;
        this.f7643c = str;
        this.f7644d = systemTimeProvider;
    }

    public static final void a(C0594jd c0594jd, List list) {
        Vj vj = AbstractC0859tj.f8379a;
        C0646ld c0646ld = new C0646ld(c0594jd.f7642b, c0594jd.f7643c, c0594jd.f7644d, list);
        vj.getClass();
        vj.a(new Jj(c0646ld));
    }

    public final void a(ArrayList arrayList) {
        this.f7641a.execute(new A1.a(this, 16, arrayList));
    }
}
