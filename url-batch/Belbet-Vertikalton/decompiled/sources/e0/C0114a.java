package e0;

import Z.K;
import androidx.lifecycle.O;
import q.l;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0114a extends O {

    /* renamed from: c, reason: collision with root package name */
    public static final K f2652c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f2653b = new l();

    @Override // androidx.lifecycle.O
    public final void b() {
        l lVar = this.f2653b;
        int i = lVar.f3929c;
        if (i > 0) {
            lVar.f3928b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3928b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3929c = 0;
    }
}
