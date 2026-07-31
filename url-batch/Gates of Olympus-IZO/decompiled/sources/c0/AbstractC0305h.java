package c0;

import j.AbstractC0491i;
import j.C0498p;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0305h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0498p f4376a;

    static {
        C0314q c0314q = C0301d.f4351c;
        int i3 = c0314q.f4348c;
        C0302e c0302e = new C0302e(c0314q, c0314q, 1);
        C0309l c0309l = C0301d.f4367t;
        int i4 = c0309l.f4348c << 6;
        int i5 = c0314q.f4348c;
        int i6 = i4 | i5;
        C0304g c0304g = new C0304g(c0314q, c0309l, 0);
        int i7 = (i5 << 6) | c0309l.f4348c;
        C0304g c0304g2 = new C0304g(c0309l, c0314q, 0);
        C0498p c0498p = AbstractC0491i.f5166a;
        C0498p c0498p2 = new C0498p();
        c0498p2.i(i3 | (i3 << 6), c0302e);
        c0498p2.i(i6, c0304g);
        c0498p2.i(i7, c0304g2);
        f4376a = c0498p2;
    }
}
