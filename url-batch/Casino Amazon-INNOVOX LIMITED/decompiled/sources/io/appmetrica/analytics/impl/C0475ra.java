package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0475ra extends D2 {
    public final InterfaceC0550ua b;

    public C0475ra(int i) {
        this(i, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C0475ra(int i, InterfaceC0550ua interfaceC0550ua) {
        super(i);
        this.b = interfaceC0550ua;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC0550ua
    public final Nn a(List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.f805a && this.b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.f805a) {
                    InterfaceC0550ua interfaceC0550ua = this.b;
                    if (interfaceC0550ua != null) {
                        Nn a2 = interfaceC0550ua.a(obj);
                        Object obj2 = a2.f977a;
                        i += a2.b.getBytesTruncated();
                        mo.a(obj, a2.f977a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new Nn(list, new C0395o4(i2, i));
    }

    public final InterfaceC0550ua b() {
        return this.b;
    }
}
