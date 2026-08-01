package b0;

import androidx.fragment.app.N;
import androidx.lifecycle.P;
import o.l;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0092b extends P {

    /* renamed from: c, reason: collision with root package name */
    public static final N f1633c = new N(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f1634b = new l();

    @Override // androidx.lifecycle.P
    public final void b() {
        l lVar = this.f1634b;
        int i = lVar.f3711c;
        if (i > 0) {
            lVar.f3710b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3710b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3711c = 0;
    }
}
