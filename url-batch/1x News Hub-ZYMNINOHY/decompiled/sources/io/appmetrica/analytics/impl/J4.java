package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J4 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final I4 f6197a;

    public J4(E4 e4) {
        this.f6197a = new I4(e4);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0436d9 a(int i3) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0567ib.a(i3).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f6197a.f6131a);
        } else if (ordinal == 14) {
            arrayList.add(this.f6197a.f6132b);
        } else if (ordinal == 34) {
            arrayList.add(this.f6197a.f6133c);
        }
        return new C0410c9(arrayList);
    }
}
