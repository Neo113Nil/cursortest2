package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791r3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Lf f8196a;

    /* renamed from: b, reason: collision with root package name */
    public final D7 f8197b;

    /* renamed from: c, reason: collision with root package name */
    public final Cf f8198c;

    /* renamed from: d, reason: collision with root package name */
    public final C0649lg f8199d;

    public C0791r3() {
        this(new Lf(), new D7(), new Cf(), new C0649lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(C0817s3 c0817s3) {
        Ii ii;
        C0615k8 c0615k8 = new C0615k8();
        Ii fromModel = this.f8196a.fromModel(c0817s3.f8285a);
        c0615k8.f7707a = (C0848t8) fromModel.f6160a;
        c0615k8.f7709c = this.f8197b.fromModel(c0817s3.f8286b);
        Ii fromModel2 = this.f8198c.fromModel(c0817s3.f8287c);
        c0615k8.f7710d = (C0822s8) fromModel2.f6160a;
        Cg cg = c0817s3.f8288d;
        if (cg != null) {
            ii = this.f8199d.fromModel(cg);
            c0615k8.f7708b = (C0900v8) ii.f6160a;
        } else {
            ii = null;
        }
        return new Ii(c0615k8, new C0559i3(C0559i3.b(fromModel, fromModel2, ii)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0791r3(Lf lf, D7 d7, Cf cf, C0649lg c0649lg) {
        this.f8196a = lf;
        this.f8197b = d7;
        this.f8198c = cf;
        this.f8199d = c0649lg;
    }

    public final C0817s3 a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
