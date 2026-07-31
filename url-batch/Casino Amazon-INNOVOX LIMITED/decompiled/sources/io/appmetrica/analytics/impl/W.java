package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0663yn f1095a;

    public W(C0663yn c0663yn) {
        this.f1095a = c0663yn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(V v) {
        S5 s5 = new S5();
        C0638xn c0638xn = v.f1082a;
        if (c0638xn != null) {
            s5.f1039a = this.f1095a.fromModel(c0638xn);
        }
        s5.b = new C0064b6[v.b.size()];
        Iterator it = v.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            s5.b[i] = this.f1095a.fromModel((C0638xn) it.next());
            i++;
        }
        String str = v.c;
        if (str != null) {
            s5.c = str;
        }
        return s5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final V a(S5 s5) {
        throw new UnsupportedOperationException();
    }
}
