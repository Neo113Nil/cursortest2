package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0954xa extends K2 {

    /* renamed from: b, reason: collision with root package name */
    public final Aa f8616b;

    public C0954xa(int i3) {
        this(i3, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C0954xa(int i3, Aa aa) {
        super(i3);
        this.f8616b = aa;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(List<Object> list) {
        int i3;
        int i4 = 0;
        if (list == null || (list.size() <= this.f6225a && this.f8616b == null)) {
            i3 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i3 = 0;
            int i5 = 0;
            for (Object obj : list) {
                if (i5 < this.f6225a) {
                    Aa aa = this.f8616b;
                    if (aa != null) {
                        On a3 = aa.a(obj);
                        Object obj2 = a3.f6419a;
                        i3 += a3.f6420b.getBytesTruncated();
                        AbstractC0709no.a(obj, a3.f6419a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i4++;
                    i3 += b(obj);
                }
                i5++;
            }
            list = arrayList;
        }
        return new On(list, new C0870u4(i4, i3));
    }

    public final Aa b() {
        return this.f8616b;
    }
}
