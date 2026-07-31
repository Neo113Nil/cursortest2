package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yj0 implements ck0, e11, je2, wo1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f35156a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2379z3 f35157b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ak0 f35158c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f35159d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private List<tx1> f35160e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private C1795a4 f35161f;

    public interface a {
        void a(@Nullable C1795a4 c1795a4);
    }

    public yj0(@NotNull Context context, @NotNull a impressionListener, @NotNull bk0 impressionReporter, @NotNull C2379z3 adIdStorageManager, @NotNull ak0 impressionReportController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(adIdStorageManager, "adIdStorageManager");
        Intrinsics.checkNotNullParameter(impressionReportController, "impressionReportController");
        this.f35156a = impressionListener;
        this.f35157b = adIdStorageManager;
        this.f35158c = impressionReportController;
        this.f35159d = context.getApplicationContext();
    }

    private final boolean i() {
        List<tx1> list = this.f35160e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(@NotNull List<tx1> showNotices, @Nullable C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f35160e = showNotices;
        this.f35161f = c1795a4;
        this.f35158c.a();
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void b() {
        if (i()) {
            return;
        }
        this.f35158c.c();
        if (a()) {
            this.f35157b.a();
            this.f35156a.a(this.f35161f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ck0
    public final void c() {
        if (!i() || a()) {
            return;
        }
        this.f35157b.a();
        this.f35156a.a(this.f35161f);
    }

    @Override // com.yandex.mobile.ads.impl.je2
    public final void d() {
        if (i()) {
            return;
        }
        this.f35158c.b();
        if (a()) {
            return;
        }
        this.f35157b.a();
        this.f35156a.a(this.f35161f);
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void e() {
        if (i()) {
            return;
        }
        this.f35158c.b();
        if (a()) {
            return;
        }
        this.f35157b.a();
        this.f35156a.a(this.f35161f);
    }

    @Override // com.yandex.mobile.ads.impl.wo1
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.ck0
    public final void g() {
        if (i() && a()) {
            this.f35157b.a();
            this.f35156a.a(this.f35161f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.je2
    public final void h() {
        if (i()) {
            return;
        }
        this.f35158c.c();
        if (a()) {
            this.f35157b.a();
            this.f35156a.a(this.f35161f);
        }
    }

    private final boolean a() {
        int i4 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        Context context = this.f35159d;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        du1 a5 = a4.a(context);
        return a5 == null || a5.d0();
    }
}
