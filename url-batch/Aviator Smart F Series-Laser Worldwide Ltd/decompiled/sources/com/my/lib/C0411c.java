package com.my.lib;

/* renamed from: com.my.lib.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0411c {
    public final C0412d a() {
        C0412d c0412d;
        C0412d c0412d2 = C0412d.f15370c;
        if (c0412d2 != null) {
            return c0412d2;
        }
        synchronized (this) {
            c0412d = C0412d.f15370c;
            if (c0412d == null) {
                c0412d = new C0412d();
                C0412d.f15370c = c0412d;
            }
        }
        return c0412d;
    }
}
