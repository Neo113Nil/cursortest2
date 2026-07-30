package defpackage;

import androidx.compose.foundation.lazy.layout.a;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ka1 {
    public final fa1 a;
    public final ob1 b;
    public final int c;
    public final /* synthetic */ ob1 d;
    public final /* synthetic */ va1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;

    public ka1(fa1 fa1Var, ob1 ob1Var, int i, va1 va1Var, int i2, int i3, long j) {
        this.d = ob1Var;
        this.e = va1Var;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.a = fa1Var;
        this.b = ob1Var;
        this.c = i;
    }

    public final oa1 a(int i, long j, int i2, int i3, int i4) {
        int i5;
        fa1 fa1Var = this.a;
        Object d = fa1Var.d(i);
        Object e = fa1Var.e(i);
        List a = this.b.a(j, i);
        if (u10.f(j)) {
            i5 = u10.j(j);
        } else {
            if (!u10.e(j)) {
                lh.e("does not have fixed height");
                return null;
            }
            i5 = u10.i(j);
        }
        u81 layoutDirection = this.d.n.getLayoutDirection();
        a aVar = this.e.k;
        return new oa1(i, d, i5, i4, layoutDirection, this.f, this.g, a, this.h, e, aVar, j, i2, i3);
    }
}
