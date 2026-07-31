package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class D4 extends Gf {

    /* renamed from: a, reason: collision with root package name */
    public final C4 f806a;

    public D4(C0644y4 c0644y4) {
        this.f806a = new C4(c0644y4);
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0095cb.a(i).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f806a.f788a);
        } else if (ordinal == 14) {
            arrayList.add(this.f806a.b);
        } else if (ordinal == 34) {
            arrayList.add(this.f806a.c);
        }
        return new W8(arrayList);
    }
}
