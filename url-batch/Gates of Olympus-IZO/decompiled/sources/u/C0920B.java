package u;

import I.C0089d;
import I.C0102j0;
import I.X;
import I.X0;
import e2.AbstractC0381e;
import e2.C0380d;

/* renamed from: u.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920B implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f7995d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7996e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f7997f;

    /* renamed from: g, reason: collision with root package name */
    public int f7998g;

    public C0920B(int i3, int i4, int i5) {
        this.f7995d = i4;
        this.f7996e = i5;
        int i6 = (i3 / i4) * i4;
        this.f7997f = C0089d.J(AbstractC0381e.Q(Math.max(i6 - i5, 0), i6 + i4 + i5), X.f2228i);
        this.f7998g = i3;
    }

    public final void b(int i3) {
        if (i3 != this.f7998g) {
            this.f7998g = i3;
            int i4 = this.f7995d;
            int i5 = (i3 / i4) * i4;
            int i6 = this.f7996e;
            this.f7997f.setValue(AbstractC0381e.Q(Math.max(i5 - i6, 0), i5 + i4 + i6));
        }
    }

    @Override // I.X0
    public final Object getValue() {
        return (C0380d) this.f7997f.getValue();
    }
}
