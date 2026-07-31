package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3120yg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f40279a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public Ag f40280b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40281c;

    /* renamed from: d, reason: collision with root package name */
    public final C2998to f40282d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f40283e;

    public C3120yg(Context context, C2998to c2998to) {
        this.f40283e = context;
        this.f40282d = c2998to;
        this.f40280b = c2998to.b();
        this.f40281c = c2998to.c();
    }

    public final void a() {
        if (this.f40281c) {
            return;
        }
        Context context = this.f40283e;
        InterfaceC2726jb a4 = Ig.a(context, Ia.f37730F.f37739d.a());
        Fg fg = (Fg) new C2938rg(this, new Ig(a4), new Ua(context), new Jg(context)).f39735f.getValue();
        try {
            a4.a(fg);
        } catch (Throwable th) {
            fg.a(th);
        }
    }

    public final synchronized void a(Cg cg) {
        this.f40279a.add(cg);
        if (this.f40281c) {
            cg.a(this.f40280b);
        }
    }

    public final synchronized void a(Ag ag) {
        Iterator it = this.f40279a.iterator();
        while (it.hasNext()) {
            ((Cg) it.next()).a(ag);
        }
    }
}
