package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffl extends ffs {
    @Override // defpackage.ffs
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // defpackage.ffs
    public final int b() {
        return 1;
    }

    @Override // defpackage.ffs
    public final ViewPropertyAnimator c(View view, int i) {
        return view.animate().translationY(i);
    }

    @Override // defpackage.ffs
    public final void d() {
    }
}
