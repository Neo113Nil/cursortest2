package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1089xn f11154a;

    public W(C1089xn c1089xn) {
        this.f11154a = c1089xn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R5 fromModel(V v) {
        R5 r5 = new R5();
        C1063wn c1063wn = v.f11074a;
        if (c1063wn != null) {
            r5.f10872a = this.f11154a.fromModel(c1063wn);
        }
        r5.f10873b = new C0477a6[v.f11075b.size()];
        Iterator it = v.f11075b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            r5.f10873b[i4] = this.f11154a.fromModel((C1063wn) it.next());
            i4++;
        }
        String str = v.f11076c;
        if (str != null) {
            r5.f10874c = str;
        }
        return r5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final V a(R5 r5) {
        throw new UnsupportedOperationException();
    }
}
