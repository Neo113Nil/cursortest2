package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffm extends ffs {
    @Override // defpackage.ffs
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // defpackage.ffs
    public final int b() {
        return 2;
    }

    @Override // defpackage.ffs
    public final ViewPropertyAnimator c(View view, int i) {
        return view.animate().translationX(-i);
    }

    @Override // defpackage.ffs
    public final void d() {
    }
}
