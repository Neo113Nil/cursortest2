package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0895qa extends C2 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0972ta f12612b;

    public C0895qa(int i4) {
        this(i4, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C0895qa(int i4, InterfaceC0972ta interfaceC0972ta) {
        super(i4);
        this.f12612b = interfaceC0972ta;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0972ta
    public final Mn a(List<Object> list) {
        int i4;
        int i5 = 0;
        if (list == null || (list.size() <= this.f10150a && this.f12612b == null)) {
            i4 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i4 = 0;
            int i6 = 0;
            for (Object obj : list) {
                if (i6 < this.f10150a) {
                    InterfaceC0972ta interfaceC0972ta = this.f12612b;
                    if (interfaceC0972ta != null) {
                        Mn a3 = interfaceC0972ta.a(obj);
                        Object obj2 = a3.f10676a;
                        i4 += a3.f10677b.getBytesTruncated();
                        AbstractC0779lo.a(obj, a3.f10676a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i5++;
                    i4 += b(obj);
                }
                i6++;
            }
            list = arrayList;
        }
        return new Mn(list, new C0811n4(i5, i4));
    }

    public final InterfaceC0972ta b() {
        return this.f12612b;
    }
}
