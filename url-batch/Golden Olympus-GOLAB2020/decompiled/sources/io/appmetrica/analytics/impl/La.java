package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class La extends O2 {

    /* renamed from: b, reason: collision with root package name */
    public final Oa f37918b;

    public La(int i4) {
        this(i4, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public La(int i4, Oa oa) {
        super(i4);
        this.f37918b = oa;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Oa
    @NonNull
    public final Jn a(List<Object> list) {
        int i4;
        int i5 = 0;
        if (list == null || (list.size() <= this.f38045a && this.f37918b == null)) {
            i4 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i4 = 0;
            int i6 = 0;
            for (Object obj : list) {
                if (i6 < this.f38045a) {
                    Oa oa = this.f37918b;
                    if (oa != null) {
                        Jn a4 = oa.a(obj);
                        Object obj2 = a4.f37851a;
                        i4 += a4.f37852b.getBytesTruncated();
                        AbstractC2713io.a(obj, a4.f37851a);
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
        return new Jn(list, new I4(i5, i4));
    }

    public final Oa b() {
        return this.f37918b;
    }
}
