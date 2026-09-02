package S;

import androidx.lifecycle.J;
import p.k;

/* loaded from: classes.dex */
public class c extends J {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2378e = new b(0);

    /* renamed from: d, reason: collision with root package name */
    public final k f2379d = new k();

    @Override // androidx.lifecycle.J
    public final void b() {
        k kVar = this.f2379d;
        int i4 = kVar.f14670c;
        if (i4 > 0) {
            kVar.f14669b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = kVar.f14669b;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        kVar.f14670c = 0;
    }
}
