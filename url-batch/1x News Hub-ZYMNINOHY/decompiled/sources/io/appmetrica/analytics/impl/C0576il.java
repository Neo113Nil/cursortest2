package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576il implements InterfaceC0538h8 {

    /* renamed from: a, reason: collision with root package name */
    public final Lf f7570a;

    /* renamed from: b, reason: collision with root package name */
    public final C0649lg f7571b;

    public C0576il() {
        this(new Lf(), new C0649lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0551hl c0551hl) {
        Ii ii;
        A8 a8 = new A8();
        a8.f5741a = 3;
        a8.f5744d = new C0977y8();
        Ii fromModel = this.f7570a.fromModel(c0551hl.f7460a);
        a8.f5744d.f8638a = (C0848t8) fromModel.f6160a;
        Cg cg = c0551hl.f7461b;
        if (cg != null) {
            ii = this.f7571b.fromModel(cg);
            a8.f5744d.f8639b = (C0900v8) ii.f6160a;
        } else {
            ii = null;
        }
        return Collections.singletonList(new Ii(a8, new C0559i3(C0559i3.b(fromModel, ii))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0576il(Lf lf, C0649lg c0649lg) {
        this.f7570a = lf;
        this.f7571b = c0649lg;
    }

    public final C0551hl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
