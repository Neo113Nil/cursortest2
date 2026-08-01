package a3;

import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends d1.k implements i1.p {
    @Override // i1.p
    public final void l(i1.m mVar) {
        View c10 = o.c(this);
        mVar.d(this.f3305d.B && o.c(this).hasFocusable());
        View findFocus = c10.findFocus();
        if (findFocus != null) {
            mVar.e(i1.d.a(findFocus, c10));
        }
    }
}
