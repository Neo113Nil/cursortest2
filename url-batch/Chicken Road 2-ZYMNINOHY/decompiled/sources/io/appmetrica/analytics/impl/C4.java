package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C4 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final B4 f10151a;

    public C4(C1070x4 c1070x4) {
        this.f10151a = new B4(c1070x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i4) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0508bb.a(i4).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f10151a.f10083a);
        } else if (ordinal == 14) {
            arrayList.add(this.f10151a.f10084b);
        } else if (ordinal == 34) {
            arrayList.add(this.f10151a.f10085c);
        }
        return new V8(arrayList);
    }
}
