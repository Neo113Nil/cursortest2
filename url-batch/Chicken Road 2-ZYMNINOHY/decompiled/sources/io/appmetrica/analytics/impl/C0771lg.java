package io.appmetrica.analytics.impl;

import android.content.Context;
import c3.C0295g;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771lg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f12298a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C0823ng f12299b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12300c;

    /* renamed from: d, reason: collision with root package name */
    public final C1064wo f12301d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12302e;

    public C0771lg(Context context, C1064wo c1064wo) {
        this.f12302e = context;
        this.f12301d = c1064wo;
        this.f12299b = c1064wo.b();
        this.f12300c = c1064wo.c();
    }

    public final void a() {
        if (this.f12300c) {
            return;
        }
        Context context = this.f12302e;
        Oa a3 = C1030vg.a(context, C0817na.f12417I.f12429d.a());
        InterfaceC0952sg interfaceC0952sg = (InterfaceC0952sg) ((C0295g) new C0590eg(this, new C1030vg(a3), new C1128za(context), new C1056wg(context)).f11799f).a();
        try {
            a3.a(interfaceC0952sg);
        } catch (Throwable th) {
            interfaceC0952sg.a(th);
        }
    }

    public final synchronized void a(C0875pg c0875pg) {
        this.f12298a.add(c0875pg);
        if (this.f12300c) {
            c0875pg.a(this.f12299b);
        }
    }

    public final synchronized void a(C0823ng c0823ng) {
        Iterator it = this.f12298a.iterator();
        while (it.hasNext()) {
            ((C0875pg) it.next()).a(c0823ng);
        }
    }
}
