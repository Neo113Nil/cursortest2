package c0;

import j.AbstractC0535i;
import j.C0542p;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0362h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0542p f5502a;

    static {
        C0371q c0371q = C0358d.f5476c;
        int i3 = c0371q.f5473c;
        C0359e c0359e = new C0359e(c0371q, c0371q, 1);
        C0366l c0366l = C0358d.f5493t;
        int i4 = c0366l.f5473c << 6;
        int i5 = c0371q.f5473c;
        int i6 = i4 | i5;
        C0361g c0361g = new C0361g(c0371q, c0366l, 0);
        int i7 = (i5 << 6) | c0366l.f5473c;
        C0361g c0361g2 = new C0361g(c0366l, c0371q, 0);
        C0542p c0542p = AbstractC0535i.f6284a;
        C0542p c0542p2 = new C0542p();
        c0542p2.i(i3 | (i3 << 6), c0359e);
        c0542p2.i(i6, c0361g);
        c0542p2.i(i7, c0361g2);
        f5502a = c0542p2;
    }
}
