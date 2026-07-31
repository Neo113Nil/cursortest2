package I;

import g2.InterfaceC0439a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class V0 implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final F0 f2776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2777e;

    /* renamed from: f, reason: collision with root package name */
    public final C0143d f2778f;

    public V0(F0 f02, int i3, M m3, C0143d c0143d) {
        this.f2776d = f02;
        this.f2777e = i3;
        this.f2778f = c0143d;
        m3.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this.f2776d, this.f2777e, null, this.f2778f);
    }
}
