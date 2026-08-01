package c1;

import androidx.lifecycle.l0;
import o2.f;
import q.k;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class a extends l0 {
    public static final f d = new f(10);

    /* renamed from: c, reason: collision with root package name */
    public final k f874c = new k();

    @Override // androidx.lifecycle.l0
    public final void b() {
        k kVar = this.f874c;
        int i = kVar.h;
        if (i > 0) {
            kVar.f3117g[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = kVar.f3117g;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        kVar.h = 0;
    }
}
