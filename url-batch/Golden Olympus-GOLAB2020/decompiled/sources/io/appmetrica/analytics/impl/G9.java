package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class G9 extends Qf {

    /* renamed from: a, reason: collision with root package name */
    public final C3147zh f37571a;

    /* renamed from: b, reason: collision with root package name */
    public final Bh f37572b;

    /* renamed from: c, reason: collision with root package name */
    public final C2836nh f37573c;

    public G9(C2953s5 c2953s5) {
        this.f37571a = new C3147zh(c2953s5);
        this.f37572b = new Bh(c2953s5);
        this.f37573c = new C2836nh(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.Qf
    public final AbstractC2931r9 a(int i4) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC3063wb.a(i4).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f37571a);
        } else if (ordinal == 3) {
            linkedList.add(this.f37573c);
        } else if (ordinal == 27) {
            linkedList.add(this.f37572b);
            linkedList.add(this.f37571a);
        }
        return new C2906q9(linkedList);
    }
}
