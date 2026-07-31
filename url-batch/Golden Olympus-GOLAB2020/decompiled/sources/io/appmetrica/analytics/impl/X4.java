package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class X4 extends Qf {

    /* renamed from: a, reason: collision with root package name */
    public final W4 f38511a;

    public X4(S4 s4) {
        this.f38511a = new W4(s4);
    }

    @Override // io.appmetrica.analytics.impl.Qf
    public final AbstractC2931r9 a(int i4) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC3063wb.a(i4).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f38511a.f38452a);
        } else if (ordinal == 14) {
            arrayList.add(this.f38511a.f38453b);
        } else if (ordinal == 34) {
            arrayList.add(this.f38511a.f38454c);
        }
        return new C2906q9(arrayList);
    }
}
