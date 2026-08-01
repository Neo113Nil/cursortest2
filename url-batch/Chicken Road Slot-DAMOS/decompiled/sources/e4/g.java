package e4;

import android.text.InputFilter;
import c4.k;
import m.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f3866a;

    public g(c0 c0Var) {
        this.f3866a = new f(c0Var);
    }

    @Override // a.a
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        return !k.c() ? inputFilterArr : this.f3866a.A(inputFilterArr);
    }

    @Override // a.a
    public final void W(boolean z10) {
        if (k.c()) {
            this.f3866a.W(z10);
        }
    }

    @Override // a.a
    public final void X(boolean z10) {
        boolean c10 = k.c();
        f fVar = this.f3866a;
        if (c10) {
            fVar.X(z10);
        } else {
            fVar.f3865c = z10;
        }
    }
}
