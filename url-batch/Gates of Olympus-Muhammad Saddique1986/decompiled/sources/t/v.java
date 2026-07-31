package t;

import I.C0143d;
import I.C0156j0;
import I.W;
import I.W0;
import k2.C0572d;

/* loaded from: classes.dex */
public final class v implements W0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0156j0 f8515d;

    /* renamed from: e, reason: collision with root package name */
    public int f8516e;

    public v(int i3) {
        int i4 = (i3 / 30) * 30;
        this.f8515d = C0143d.K(O2.d.g0(Math.max(i4 - 100, 0), i4 + 130), W.f2783i);
        this.f8516e = i3;
    }

    @Override // I.W0
    public final Object getValue() {
        return (C0572d) this.f8515d.getValue();
    }
}
