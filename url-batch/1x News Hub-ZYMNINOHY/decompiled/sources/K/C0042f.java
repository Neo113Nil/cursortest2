package K;

import b2.C0195i;
import d2.InterfaceC0300c;

/* renamed from: K.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042f extends f2.i implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public int f761e;

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        int i3 = this.f761e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            this.f761e = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.a.T(obj);
        return C0195i.f2555a;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        C0042f c0042f = new C0042f(1, (InterfaceC0300c) obj);
        C0195i c0195i = C0195i.f2555a;
        c0042f.g(c0195i);
        return c0195i;
    }
}
