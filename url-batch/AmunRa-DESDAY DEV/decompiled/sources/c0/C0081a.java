package c0;

import X.K;
import androidx.lifecycle.M;
import o.l;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0081a extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final K f1548c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f1549b = new l();

    @Override // androidx.lifecycle.M
    public final void b() {
        l lVar = this.f1549b;
        int i = lVar.f3336c;
        if (i > 0) {
            lVar.f3335b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3335b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3336c = 0;
    }
}
