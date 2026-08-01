package com.oriondriftchasers.arordrft;

import a.e0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k0;
import androidx.fragment.app.u;
import androidx.fragment.app.w;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import f3.d;
import g.j;
import g2.n;
import h.a;
import v2.g;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class MainMenuActivityHub extends j {
    public static final /* synthetic */ int F = 0;
    public n E;

    @Override // g.j, a.m, c0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main_menu_hub, (ViewGroup) null, false);
        int i = R.id.bottom_navigation_menu;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) a.s(inflate, R.id.bottom_navigation_menu);
        if (bottomNavigationView != null) {
            i = R.id.fragment_container_main;
            if (((FrameLayout) a.s(inflate, R.id.fragment_container_main)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.E = new n(constraintLayout, bottomNavigationView);
                setContentView(constraintLayout);
                if (bundle == null) {
                    r(new g());
                }
                n nVar = this.E;
                if (nVar != null) {
                    nVar.f1786f.setOnItemSelectedListener(new e0(5, this));
                    return;
                } else {
                    d.g("bindingMainMenu");
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void r(u uVar) {
        k0 k0Var = ((w) this.f1650y.f81g).f570q;
        k0Var.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var);
        aVar.f(R.id.fragment_container_main, uVar, null, 2);
        aVar.d(false);
    }
}
