package com.manholeroboramprush.cardestroy;

import a1.f;
import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.o0;
import b5.d0;
import d.f0;
import d.k;
import d.m;
import d.n;
import d.o;
import d.p;
import d.q;
import d.r;
import d.s;
import d.t;
import d.u;
import d.v;
import d2.z0;
import f9.a;
import f9.c;
import f9.d;
import g8.b;
import ge.a0;
import hd.h;
import hd.i;
import java.util.Iterator;
import k7.e;
import kotlin.jvm.internal.Intrinsics;
import o3.g0;
import o3.l1;
import o3.m1;
import o3.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class KitchenDoor extends k {
    public static final /* synthetic */ int J = 0;
    public final Object I = h.a(i.f4508e, new d(0, this));

    /* JADX WARN: Type inference failed for: r15v12, types: [hd.g, java.lang.Object] */
    @Override // d.k, e3.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        l.d dVar = new l.d(getWindow().getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        int i10 = 0;
        e n1Var = i3 >= 35 ? new n1(window, dVar, 1) : i3 >= 30 ? new l1(window, dVar, 1) : i3 >= 26 ? new m1(window, dVar, 0) : new l1(window, dVar, 0);
        n1Var.Q();
        n1Var.w();
        f0 f0Var = new f0(0, 0, new f(13));
        f0 f0Var2 = new f0(o.f3263a, o.f3264b, new f(13));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        v vVar = o.f3265c;
        if (vVar == null) {
            int i11 = Build.VERSION.SDK_INT;
            vVar = i11 >= 35 ? new u() : i11 >= 30 ? new t() : i11 >= 29 ? new s() : i11 >= 28 ? new r() : i11 >= 26 ? new q() : new p();
            o.f3265c = vVar;
        }
        v vVar2 = vVar;
        m mVar = new m(vVar2, f0Var, f0Var2, this, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator it = new o3.f0(viewGroup).iterator();
        while (true) {
            g0 g0Var = (g0) it;
            if (!g0Var.hasNext()) {
                n nVar = new n(mVar, viewGroup.getContext());
                nVar.setTag(vVar2);
                nVar.setVisibility(8);
                nVar.setWillNotDraw(true);
                viewGroup.addView(nVar);
                break;
            }
            if (((View) g0Var.next()).getTag() instanceof v) {
                break;
            }
        }
        mVar.run();
        Window window2 = getWindow();
        window2.getClass();
        vVar2.a(window2);
        a aVar = (a) this.I.getValue();
        Intent intent = getIntent();
        String scheme = intent != null ? intent.getScheme() : null;
        aVar.getClass();
        if (Intrinsics.a(scheme, "roboramprush")) {
            a0.s(o0.g(aVar), null, new d0(aVar, null, 1), 3);
        }
        x0.d dVar2 = new x0.d(-1286952139, true, new c(this, i10));
        ViewGroup.LayoutParams layoutParams = e.e.f3744a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        z0 z0Var = childAt instanceof z0 ? (z0) childAt : null;
        if (z0Var != null) {
            z0Var.setParentCompositionContext(null);
            z0Var.setContent(dVar2);
            return;
        }
        z0 z0Var2 = new z0(this);
        z0Var2.setParentCompositionContext(null);
        z0Var2.setContent(dVar2);
        View decorView2 = getWindow().getDecorView();
        if (o0.d(decorView2) == null) {
            decorView2.setTag(com.appsflyer.R.id.view_tree_lifecycle_owner, this);
        }
        if (o0.e(decorView2) == null) {
            decorView2.setTag(com.appsflyer.R.id.view_tree_view_model_store_owner, this);
        }
        if (b.B(decorView2) == null) {
            decorView2.setTag(com.appsflyer.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(z0Var2, e.e.f3744a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    @Override // d.k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        a aVar = (a) this.I.getValue();
        String scheme = intent.getScheme();
        aVar.getClass();
        if (Intrinsics.a(scheme, "roboramprush")) {
            a0.s(o0.g(aVar), null, new d0(aVar, null, 1), 3);
        }
    }
}
