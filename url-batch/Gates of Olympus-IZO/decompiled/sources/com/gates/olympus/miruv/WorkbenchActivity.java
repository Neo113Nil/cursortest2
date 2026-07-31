package com.gates.olympus.miruv;

import A2.g;
import B1.a;
import B1.d;
import D1.C0018f;
import I.C0089d;
import I.C0102j0;
import I.X;
import I2.l;
import Z1.i;
import android.R;
import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.P;
import b.H;
import b.I;
import b.o;
import b.p;
import b.q;
import b.r;
import b.s;
import b.t;
import b.u;
import com.gates.olympus.miruv.data.e;
import f.AbstractC0382a;
import k2.AbstractC0552y;
import u0.C0961a0;

/* loaded from: classes.dex */
public final class WorkbenchActivity extends o {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f4422x = 0;

    @Override // b.o, S0.b, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i3 = 1;
        int i4 = p.f4195a;
        H h3 = H.f4139f;
        I i5 = new I(0, 0, h3);
        I i6 = new I(p.f4195a, p.f4196b, h3);
        View decorView = getWindow().getDecorView();
        i.e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        i.e(resources, "view.resources");
        boolean booleanValue = ((Boolean) h3.j(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        i.e(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) h3.j(resources2)).booleanValue();
        int i7 = Build.VERSION.SDK_INT;
        l uVar = i7 >= 30 ? new u() : i7 >= 29 ? new t() : i7 >= 28 ? new s() : i7 >= 26 ? new r() : new q();
        Window window = getWindow();
        i.e(window, "window");
        uVar.P(i5, i6, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        i.e(window2, "window");
        uVar.i(window2);
        super.onCreate(bundle);
        Application application = getApplication();
        i.d(application, "null cannot be cast to non-null type com.gates.olympus.miruv.MiruvApp");
        g gVar = ((MiruvApp) application).f4421d;
        if (gVar == null) {
            i.j("container");
            throw null;
        }
        Application application2 = getApplication();
        i.e(application2, "getApplication(...)");
        C0018f c0018f = new C0018f(application2);
        C0102j0 J3 = C0089d.J(D1.u.f573a, X.f2228i);
        AbstractC0552y.q(P.h(this), null, null, new a(c0018f, J3, null), 3);
        Q.a aVar = new Q.a(626530879, new d(this, (e) gVar.f83b, J3, i3), true);
        ViewGroup.LayoutParams layoutParams = c.a.f4321a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0961a0 c0961a0 = childAt instanceof C0961a0 ? (C0961a0) childAt : null;
        if (c0961a0 != null) {
            c0961a0.setParentCompositionContext(null);
            c0961a0.setContent(aVar);
            return;
        }
        C0961a0 c0961a02 = new C0961a0(this);
        c0961a02.setParentCompositionContext(null);
        c0961a02.setContent(aVar);
        View decorView2 = getWindow().getDecorView();
        if (P.f(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (P.g(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (AbstractC0382a.k(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c0961a02, c.a.f4321a);
    }
}
