package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class Cf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f5848a;

    /* renamed from: b, reason: collision with root package name */
    public final Df f5849b;

    public Cf() {
        this(new Y(), new Df(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Ef ef) {
        int i3;
        C0822s8 c0822s8 = new C0822s8();
        Ii fromModel = this.f5848a.fromModel(ef.f5960a);
        c0822s8.f8300a = (C0564i8) fromModel.f6160a;
        On a3 = this.f5849b.a(ef.f5961b);
        if (AbstractC0709no.a((Collection) a3.f6419a)) {
            i3 = 0;
        } else {
            c0822s8.f8301b = new C0564i8[((List) a3.f6419a).size()];
            i3 = 0;
            for (int i4 = 0; i4 < ((List) a3.f6419a).size(); i4++) {
                Ii fromModel2 = this.f5848a.fromModel((Z) ((List) a3.f6419a).get(i4));
                c0822s8.f8301b[i4] = (C0564i8) fromModel2.f6160a;
                i3 += fromModel2.f6161b.getBytesTruncated();
            }
        }
        return new Ii(c0822s8, new C0559i3(C0559i3.b(fromModel, a3, new C0559i3(i3))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Cf(Y y3, Df df) {
        this.f5848a = y3;
        this.f5849b = df;
    }

    public final Ef a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
