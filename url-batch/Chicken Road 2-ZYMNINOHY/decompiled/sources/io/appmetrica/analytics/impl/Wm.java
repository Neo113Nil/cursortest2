package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Wm implements InterfaceC0598eo {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11214a;

    public Wm(String str, List<String> list, int i4, Ln ln, InterfaceC0960so interfaceC0960so, J2 j22) {
        List k02 = d3.i.k0(i4, d3.i.n0(d3.i.p0(list)));
        ArrayList arrayList = new ArrayList(d3.k.Y(k02));
        int i5 = 0;
        for (Object obj : k02) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                d3.j.X();
                throw null;
            }
            arrayList.add(new Ym(str + '_' + i5, (String) obj, ln, interfaceC0960so, j22));
            i5 = i6;
        }
        this.f11214a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598eo
    public final void a(Cdo cdo) {
        ArrayList arrayList = this.f11214a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Ym) obj).a(cdo);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598eo
    public final void a(PublicLogger publicLogger) {
        ArrayList arrayList = this.f11214a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Ym) obj).f10045e = publicLogger;
        }
    }
}
