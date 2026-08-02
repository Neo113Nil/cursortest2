package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823s9 extends Kf {

    /* renamed from: a, reason: collision with root package name */
    public final C0805rh f8302a;

    /* renamed from: b, reason: collision with root package name */
    public final C0857th f8303b;

    /* renamed from: c, reason: collision with root package name */
    public final C0495fh f8304c;

    public C0823s9(C0457e5 c0457e5) {
        this.f8302a = new C0805rh(c0457e5);
        this.f8303b = new C0857th(c0457e5);
        this.f8304c = new C0495fh(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC0436d9 a(int i3) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0567ib.a(i3).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f8302a);
        } else if (ordinal == 3) {
            linkedList.add(this.f8304c);
        } else if (ordinal == 27) {
            linkedList.add(this.f8303b);
            linkedList.add(this.f8302a);
        }
        return new C0410c9(linkedList);
    }
}
