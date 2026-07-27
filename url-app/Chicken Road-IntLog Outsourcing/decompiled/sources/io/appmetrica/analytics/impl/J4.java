package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J4 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final I4 f6999a;

    public J4(E4 e42) {
        this.f6999a = new I4(e42);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0587d9 a(int i2) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0718ib.a(i2).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f6999a.f6930a);
        } else if (ordinal == 14) {
            arrayList.add(this.f6999a.f6931b);
        } else if (ordinal == 34) {
            arrayList.add(this.f6999a.f6932c);
        }
        return new C0561c9(arrayList);
    }
}
