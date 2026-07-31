package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0655yf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f1585a;
    public final C0680zf b;

    public C0655yf() {
        this(new Y(), new C0680zf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(Af af) {
        int i;
        C0374n8 c0374n8 = new C0374n8();
        Ei fromModel = this.f1585a.fromModel(af.f762a);
        c0374n8.f1392a = (C0118d8) fromModel.f829a;
        Nn a2 = this.b.a(af.b);
        if (mo.a((Collection) a2.f977a)) {
            i = 0;
        } else {
            c0374n8.b = new C0118d8[((List) a2.f977a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a2.f977a).size(); i2++) {
                Ei fromModel2 = this.f1585a.fromModel((Z) ((List) a2.f977a).get(i2));
                c0374n8.b[i2] = (C0118d8) fromModel2.f829a;
                i += fromModel2.b.getBytesTruncated();
            }
        }
        return new Ei(c0374n8, new C0061b3(C0061b3.b(fromModel, a2, new C0061b3(i))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0655yf(Y y, C0680zf c0680zf) {
        this.f1585a = y;
        this.b = c0680zf;
    }

    public final Af a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
