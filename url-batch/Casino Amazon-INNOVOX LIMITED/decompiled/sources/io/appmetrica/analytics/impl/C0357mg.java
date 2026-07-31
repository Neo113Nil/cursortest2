package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0357mg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1378a = new HashSet();
    public C0407og b;
    public boolean c;
    public final xo d;
    public final Context e;

    public C0357mg(Context context, xo xoVar) {
        this.e = context;
        this.d = xoVar;
        this.b = xoVar.b();
        this.c = xoVar.c();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        Context context = this.e;
        Pa a2 = C0606wg.a(context, C0401oa.I.d.a());
        InterfaceC0531tg interfaceC0531tg = (InterfaceC0531tg) new C0177fg(this, new C0606wg(a2), new Aa(context), new C0631xg(context)).f.getValue();
        try {
            a2.a(interfaceC0531tg);
        } catch (Throwable th) {
            interfaceC0531tg.a(th);
        }
    }

    public final synchronized void a(C0457qg c0457qg) {
        this.f1378a.add(c0457qg);
        if (this.c) {
            c0457qg.a(this.b);
        }
    }

    public final synchronized void a(C0407og c0407og) {
        Iterator it = this.f1378a.iterator();
        while (it.hasNext()) {
            ((C0457qg) it.next()).a(c0407og);
        }
    }
}
