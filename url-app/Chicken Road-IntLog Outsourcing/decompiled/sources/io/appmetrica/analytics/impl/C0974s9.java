package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974s9 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final C0956rh f9242a;

    /* renamed from: b, reason: collision with root package name */
    public final C1008th f9243b;

    /* renamed from: c, reason: collision with root package name */
    public final C0646fh f9244c;

    public C0974s9(C0608e5 c0608e5) {
        this.f9242a = new C0956rh(c0608e5);
        this.f9243b = new C1008th(c0608e5);
        this.f9244c = new C0646fh(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0587d9 a(int i2) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0718ib.a(i2).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f9242a);
        } else if (ordinal == 3) {
            linkedList.add(this.f9244c);
        } else if (ordinal == 27) {
            linkedList.add(this.f9243b);
            linkedList.add(this.f9242a);
        }
        return new C0561c9(linkedList);
    }
}
