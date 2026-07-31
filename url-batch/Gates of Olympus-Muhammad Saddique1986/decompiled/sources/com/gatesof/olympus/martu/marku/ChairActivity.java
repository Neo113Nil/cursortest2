package com.gatesof.olympus.martu.marku;

import F1.a;
import F1.d;
import I.C0143d;
import I.C0156j0;
import I.C0174t;
import I.W;
import L1.e;
import L1.s;
import android.R;
import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.P;
import b.AbstractActivityC0319o;
import b.AbstractC0320p;
import b.C0303G;
import b.C0304H;
import b.C0321q;
import b.C0322r;
import b.C0323s;
import b.C0324t;
import b.C0325u;
import f2.j;
import h2.AbstractC0508a;
import n.T;
import q2.AbstractC0837y;
import u0.C1099f0;

/* loaded from: classes.dex */
public final class ChairActivity extends AbstractActivityC0319o {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f5624x = 0;

    @Override // b.AbstractActivityC0319o, U0.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = AbstractC0320p.f5332a;
        C0303G c0303g = C0303G.f5274f;
        C0304H c0304h = new C0304H(0, 0, c0303g);
        C0304H c0304h2 = new C0304H(AbstractC0320p.f5332a, AbstractC0320p.f5333b, c0303g);
        View decorView = getWindow().getDecorView();
        j.e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        j.e(resources, "view.resources");
        boolean booleanValue = ((Boolean) c0303g.n(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        j.e(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) c0303g.n(resources2)).booleanValue();
        int i4 = Build.VERSION.SDK_INT;
        AbstractC0508a c0325u = i4 >= 30 ? new C0325u() : i4 >= 29 ? new C0324t() : i4 >= 28 ? new C0323s() : i4 >= 26 ? new C0322r() : new C0321q();
        Window window = getWindow();
        j.e(window, "window");
        c0325u.U(c0304h, c0304h2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        j.e(window2, "window");
        c0325u.o(window2);
        Application application = getApplication();
        j.e(application, "getApplication(...)");
        e eVar = new e(application);
        s sVar = s.f3389a;
        W w2 = W.f2783i;
        C0156j0 K3 = C0143d.K(sVar, w2);
        C0156j0 K4 = C0143d.K(Boolean.FALSE, w2);
        AbstractC0837y.r(P.h(this), null, null, new a(eVar, K3, null), 3);
        Application application2 = getApplication();
        j.d(application2, "null cannot be cast to non-null type com.gatesof.olympus.martu.marku.App");
        C0174t c0174t = ((App) application2).f5623d;
        if (c0174t == null) {
            j.j("container");
            throw null;
        }
        Q.a aVar = new Q.a(-1075328552, new d(K4, this, c0174t, K3, 1), true);
        ViewGroup.LayoutParams layoutParams = c.a.f5445a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C1099f0 c1099f0 = childAt instanceof C1099f0 ? (C1099f0) childAt : null;
        if (c1099f0 != null) {
            c1099f0.setParentCompositionContext(null);
            c1099f0.setContent(aVar);
            return;
        }
        C1099f0 c1099f02 = new C1099f0(this);
        c1099f02.setParentCompositionContext(null);
        c1099f02.setContent(aVar);
        View decorView2 = getWindow().getDecorView();
        if (P.f(decorView2) == null) {
            P.k(decorView2, this);
        }
        if (P.g(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (T.l(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c1099f02, c.a.f5445a);
    }
}
