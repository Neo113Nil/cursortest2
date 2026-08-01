package c0;

import X.K;
import androidx.lifecycle.O;
import o.l;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0086a extends O {

    /* renamed from: c, reason: collision with root package name */
    public static final K f1708c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f1709b = new l();

    @Override // androidx.lifecycle.O
    public final void b() {
        l lVar = this.f1709b;
        int i = lVar.f3240c;
        if (i > 0) {
            lVar.f3239b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3239b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3240c = 0;
    }
}
