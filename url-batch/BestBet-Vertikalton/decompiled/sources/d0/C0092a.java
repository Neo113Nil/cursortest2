package d0;

import Y.K;
import androidx.lifecycle.O;
import o.l;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0092a extends O {

    /* renamed from: c, reason: collision with root package name */
    public static final K f2470c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f2471b = new l();

    @Override // androidx.lifecycle.O
    public final void b() {
        l lVar = this.f2471b;
        int i = lVar.f3594c;
        if (i > 0) {
            lVar.f3593b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3593b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3594c = 0;
    }
}
