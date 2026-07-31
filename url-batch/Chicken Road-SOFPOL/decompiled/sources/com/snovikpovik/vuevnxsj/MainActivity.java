package com.snovikpovik.vuevnxsj;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.l0;
import b.l;
import b6.b1;
import b6.w;
import c.a;
import r2.r;
import u0.c;
import x1.a1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class MainActivity extends l {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f2043w = 0;

    @Override // b.l, f3.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        byte b8 = 0;
        c cVar = new c(865430251, true, new b1(new w(this), b8, b8));
        ViewGroup.LayoutParams layoutParams = a.f1537a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        a1 a1Var = childAt instanceof a1 ? (a1) childAt : null;
        if (a1Var != null) {
            a1Var.setParentCompositionContext(null);
            a1Var.setContent(cVar);
            return;
        }
        a1 a1Var2 = new a1(this);
        a1Var2.setParentCompositionContext(null);
        a1Var2.setContent(cVar);
        View decorView = getWindow().getDecorView();
        if (l0.d(decorView) == null) {
            l0.g(decorView, this);
        }
        if (l0.e(decorView) == null) {
            l0.h(decorView, this);
        }
        if (r.v(decorView) == null) {
            r.U(decorView, this);
        }
        setContentView(a1Var2, a.f1537a);
    }
}
