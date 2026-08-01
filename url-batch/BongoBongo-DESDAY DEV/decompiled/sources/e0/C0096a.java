package e0;

import Z.K;
import androidx.lifecycle.M;
import p.l;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0096a extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final K f2133c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f2134b = new l();

    @Override // androidx.lifecycle.M
    public final void b() {
        l lVar = this.f2134b;
        int i = lVar.f3476c;
        if (i > 0) {
            lVar.f3475b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3475b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3476c = 0;
    }
}
