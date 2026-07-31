package I;

import a2.InterfaceC0184a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W0 implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final G0 f2221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2222e;

    /* renamed from: f, reason: collision with root package name */
    public final C0089d f2223f;

    public W0(G0 g02, int i3, N n3, C0089d c0089d) {
        this.f2221d = g02;
        this.f2222e = i3;
        this.f2223f = c0089d;
        n3.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new M(this.f2221d, this.f2222e, null, this.f2223f);
    }
}
