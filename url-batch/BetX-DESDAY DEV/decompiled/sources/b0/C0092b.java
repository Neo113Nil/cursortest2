package b0;

import androidx.fragment.app.N;
import androidx.lifecycle.P;
import o.l;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0092b extends P {

    /* renamed from: c, reason: collision with root package name */
    public static final N f1634c = new N(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f1635b = new l();

    @Override // androidx.lifecycle.P
    public final void b() {
        l lVar = this.f1635b;
        int i = lVar.f3715c;
        if (i > 0) {
            lVar.f3714b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3714b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3715c = 0;
    }
}
