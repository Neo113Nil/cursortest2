package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764l9 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final C0798mh f12285a;

    /* renamed from: b, reason: collision with root package name */
    public final C0850oh f12286b;

    /* renamed from: c, reason: collision with root package name */
    public final C0488ah f12287c;

    public C0764l9(X4 x4) {
        this.f12285a = new C0798mh(x4);
        this.f12286b = new C0850oh(x4);
        this.f12287c = new C0488ah(x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i4) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0508bb.a(i4).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f12285a);
        } else if (ordinal == 3) {
            linkedList.add(this.f12287c);
        } else if (ordinal == 27) {
            linkedList.add(this.f12286b);
            linkedList.add(this.f12285a);
        }
        return new V8(linkedList);
    }
}
