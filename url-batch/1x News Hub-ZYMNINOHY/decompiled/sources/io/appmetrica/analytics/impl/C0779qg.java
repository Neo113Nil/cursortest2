package io.appmetrica.analytics.impl;

import android.content.Context;
import b2.C0193g;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779qg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8169a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C0830sg f8170b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8171c;

    /* renamed from: d, reason: collision with root package name */
    public final yo f8172d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8173e;

    public C0779qg(Context context, yo yoVar) {
        this.f8173e = context;
        this.f8172d = yoVar;
        this.f8170b = yoVar.b();
        this.f8171c = yoVar.c();
    }

    public final void a() {
        if (this.f8171c) {
            return;
        }
        Context context = this.f8173e;
        Va a3 = Ag.a(context, C0876ua.f8420H.f8431d.a());
        InterfaceC0960xg interfaceC0960xg = (InterfaceC0960xg) ((C0193g) new C0597jg(this, new Ag(a3), new Ga(context), new Bg(context)).f).a();
        try {
            a3.a(interfaceC0960xg);
        } catch (Throwable th) {
            interfaceC0960xg.a(th);
        }
    }

    public final synchronized void a(C0882ug c0882ug) {
        this.f8169a.add(c0882ug);
        if (this.f8171c) {
            c0882ug.a(this.f8170b);
        }
    }

    public final synchronized void a(C0830sg c0830sg) {
        Iterator it = this.f8169a.iterator();
        while (it.hasNext()) {
            ((C0882ug) it.next()).a(c0830sg);
        }
    }
}
