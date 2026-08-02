package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494fg implements InterfaceC0391bg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0597jg f7320a;

    public C0494fg(C0597jg c0597jg) {
        this.f7320a = c0597jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0391bg
    public final void a() {
        C0597jg c0597jg = this.f7320a;
        ArrayList arrayList = c0597jg.f7650g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0830sg c0830sg = (C0830sg) next;
            c0597jg.f7647c.getClass();
            String str = c0830sg != null ? c0830sg.f8315a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 != null) {
                arrayList3.add(next2);
            }
        }
        c0597jg.a(c0597jg.f7647c.a(arrayList3));
    }
}
