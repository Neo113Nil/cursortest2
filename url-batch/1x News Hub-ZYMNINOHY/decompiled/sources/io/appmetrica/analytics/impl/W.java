package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1017zn f6808a;

    public W(C1017zn c1017zn) {
        this.f6808a = c1017zn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(V v) {
        Y5 y5 = new Y5();
        C0992yn c0992yn = v.f6775a;
        if (c0992yn != null) {
            y5.f6888a = this.f6808a.fromModel(c0992yn);
        }
        y5.f6889b = new C0536h6[v.f6776b.size()];
        Iterator it = v.f6776b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            y5.f6889b[i3] = this.f6808a.fromModel((C0992yn) it.next());
            i3++;
        }
        String str = v.f6777c;
        if (str != null) {
            y5.f6890c = str;
        }
        return y5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final V a(Y5 y5) {
        throw new UnsupportedOperationException();
    }
}
