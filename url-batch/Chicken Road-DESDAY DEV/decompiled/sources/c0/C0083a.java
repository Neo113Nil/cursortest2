package c0;

import X.K;
import androidx.lifecycle.M;
import o.l;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0083a extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final K f1578c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f1579b = new l();

    @Override // androidx.lifecycle.M
    public final void b() {
        l lVar = this.f1579b;
        int i = lVar.f3331c;
        if (i > 0) {
            lVar.f3330b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3330b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3331c = 0;
    }
}
