package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081xf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f13026a;

    /* renamed from: b, reason: collision with root package name */
    public final C1107yf f13027b;

    public C1081xf() {
        this(new Y(), new C1107yf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C1133zf c1133zf) {
        int i4;
        C0789m8 c0789m8 = new C0789m8();
        Di fromModel = this.f13026a.fromModel(c1133zf.f13102a);
        c0789m8.f12346a = (C0531c8) fromModel.f10202a;
        Mn a3 = this.f13027b.a(c1133zf.f13103b);
        if (AbstractC0779lo.a((Collection) a3.f10676a)) {
            i4 = 0;
        } else {
            c0789m8.f12347b = new C0531c8[((List) a3.f10676a).size()];
            i4 = 0;
            for (int i5 = 0; i5 < ((List) a3.f10676a).size(); i5++) {
                Di fromModel2 = this.f13026a.fromModel((Z) ((List) a3.f10676a).get(i5));
                c0789m8.f12347b[i5] = (C0531c8) fromModel2.f10202a;
                i4 += fromModel2.f10203b.getBytesTruncated();
            }
        }
        return new Di(c0789m8, new C0474a3(C0474a3.b(fromModel, a3, new C0474a3(i4))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1081xf(Y y4, C1107yf c1107yf) {
        this.f13026a = y4;
        this.f13027b = c1107yf;
    }

    public final C1133zf a(Di di) {
        throw new UnsupportedOperationException();
    }
}
