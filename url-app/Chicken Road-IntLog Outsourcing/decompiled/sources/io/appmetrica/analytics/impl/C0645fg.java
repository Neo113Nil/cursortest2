package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645fg implements InterfaceC0542bg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0748jg f8187a;

    public C0645fg(C0748jg c0748jg) {
        this.f8187a = c0748jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0542bg
    public final void a() {
        C0748jg c0748jg = this.f8187a;
        ArrayList arrayList = c0748jg.f8546g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0981sg c0981sg = (C0981sg) next;
            c0748jg.f8542c.getClass();
            String str = c0981sg != null ? c0981sg.f9256a : null;
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
        c0748jg.a(c0748jg.f8542c.a(arrayList3));
    }
}
