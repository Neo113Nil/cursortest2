package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0350m9 extends Gf {

    /* renamed from: a, reason: collision with root package name */
    public final C0383nh f1374a;
    public final C0433ph b;
    public final C0075bh c;

    public C0350m9(Y4 y4) {
        this.f1374a = new C0383nh(y4);
        this.b = new C0433ph(y4);
        this.c = new C0075bh(y4);
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0095cb.a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f1374a);
        } else if (ordinal == 3) {
            linkedList.add(this.c);
        } else if (ordinal == 27) {
            linkedList.add(this.b);
            linkedList.add(this.f1374a);
        }
        return new W8(linkedList);
    }
}
