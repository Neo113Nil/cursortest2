package G;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class V0 implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final F0 f2772d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2773e;

    /* renamed from: i, reason: collision with root package name */
    public final C0192d f2774i;

    public V0(F0 f02, int i2, M m4, C0192d c0192d) {
        this.f2772d = f02;
        this.f2773e = i2;
        this.f2774i = c0192d;
        m4.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this.f2772d, this.f2773e, null, this.f2774i);
    }
}
