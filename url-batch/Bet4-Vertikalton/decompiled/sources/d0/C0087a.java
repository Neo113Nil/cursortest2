package d0;

import Y.K;
import androidx.lifecycle.M;
import o.l;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0087a extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final K f2011c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f2012b = new l();

    @Override // androidx.lifecycle.M
    public final void b() {
        l lVar = this.f2012b;
        int i = lVar.f3249c;
        if (i > 0) {
            lVar.f3248b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3248b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3249c = 0;
    }
}
