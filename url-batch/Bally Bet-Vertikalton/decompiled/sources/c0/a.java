package c0;

import X.K;
import androidx.lifecycle.M;
import o.l;

/* loaded from: classes.dex */
public class a extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final K f1518c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f1519b = new l();

    @Override // androidx.lifecycle.M
    public final void b() {
        l lVar = this.f1519b;
        int i = lVar.f3337c;
        if (i > 0) {
            lVar.f3336b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3336b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3337c = 0;
    }
}
