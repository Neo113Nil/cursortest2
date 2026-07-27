package n1;

import java.lang.ref.WeakReference;

/* renamed from: n1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336w extends e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11439a;

    public C1336w(C1337x c1337x) {
        this.f11439a = new WeakReference(c1337x);
    }

    @Override // e5.g
    public final void D() {
        C1337x c1337x = (C1337x) this.f11439a.get();
        if (c1337x == null) {
            return;
        }
        C1337x.h(c1337x);
    }
}
