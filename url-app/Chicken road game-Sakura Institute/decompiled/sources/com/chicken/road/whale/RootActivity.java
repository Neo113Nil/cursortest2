package com.chicken.road.whale;

import android.R;
import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.q0;
import b.l0;
import b.m0;
import b.o;
import b.q;
import b.r;
import b.s;
import b.u;
import b.v;
import b.w;
import c7.a0;
import f4.g;
import g0.d;
import g0.g1;
import g0.t0;
import j1.c;
import l1.x;
import o0.a;
import r6.k;
import s1.e1;
import z2.b;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class RootActivity extends o {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1765z = 0;

    @Override // b.o, s2.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i7 = Build.VERSION.SDK_INT;
        (i7 >= 31 ? new b(this) : new x(22, this)).o();
        super.onCreate(bundle);
        int i8 = q.f1214a;
        l0 l0Var = l0.f1179h;
        m0 m0Var = new m0(0, 0, l0Var);
        m0 m0Var2 = new m0(q.f1214a, q.f1215b, l0Var);
        View decorView = getWindow().getDecorView();
        k.e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        k.e(resources, "view.resources");
        boolean booleanValue = ((Boolean) l0Var.f(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        k.e(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) l0Var.f(resources2)).booleanValue();
        c wVar = i7 >= 30 ? new w() : i7 >= 29 ? new v() : i7 >= 28 ? new u() : i7 >= 26 ? new s() : new r();
        Window window = getWindow();
        k.e(window, "window");
        wVar.m0(m0Var, m0Var2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        k.e(window2, "window");
        wVar.M(window2);
        Application application = getApplication();
        k.e(application, "getApplication(...)");
        g gVar = new g(application);
        g1 J = d.J(f4.v.f3352a, t0.f3903k);
        a0.p(q0.h(this), null, null, new a0.a0(gVar, J, (h6.d) null, 5), 3);
        a aVar = new a(-1219477791, new e4.c(this, 1, J), true);
        ViewGroup.LayoutParams layoutParams = c.a.f1419a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        e1 e1Var = childAt instanceof e1 ? (e1) childAt : null;
        if (e1Var != null) {
            e1Var.setParentCompositionContext(null);
            e1Var.setContent(aVar);
            return;
        }
        e1 e1Var2 = new e1(this);
        e1Var2.setParentCompositionContext(null);
        e1Var2.setContent(aVar);
        View decorView2 = getWindow().getDecorView();
        if (q0.f(decorView2) == null) {
            q0.k(decorView2, this);
        }
        if (q0.g(decorView2) == null) {
            decorView2.setTag(com.android.installreferrer.R.id.view_tree_view_model_store_owner, this);
        }
        if (v1.g.i(decorView2) == null) {
            decorView2.setTag(com.android.installreferrer.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(e1Var2, c.a.f1419a);
    }
}
