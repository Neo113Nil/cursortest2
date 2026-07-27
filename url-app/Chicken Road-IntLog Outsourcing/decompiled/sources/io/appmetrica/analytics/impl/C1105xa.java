package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1105xa extends K2 {

    /* renamed from: b, reason: collision with root package name */
    public final Aa f9572b;

    public C1105xa(int i2) {
        this(i2, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C1105xa(int i2, Aa aa) {
        super(i2);
        this.f9572b = aa;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(List<Object> list) {
        int i2;
        int i3 = 0;
        if (list == null || (list.size() <= this.f7028a && this.f9572b == null)) {
            i2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i2 = 0;
            int i6 = 0;
            for (Object obj : list) {
                if (i6 < this.f7028a) {
                    Aa aa = this.f9572b;
                    if (aa != null) {
                        On a6 = aa.a(obj);
                        Object obj2 = a6.f7230a;
                        i2 += a6.f7231b.getBytesTruncated();
                        AbstractC0860no.a(obj, a6.f7230a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i3++;
                    i2 += b(obj);
                }
                i6++;
            }
            list = arrayList;
        }
        return new On(list, new C1021u4(i3, i2));
    }

    public final Aa b() {
        return this.f9572b;
    }
}
