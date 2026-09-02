package com.oriondriftchasers.arordrft;

import a.h0;
import a.i0;
import a.p;
import a.q;
import a.r;
import a.t;
import a.v;
import a.w;
import a.x;
import a.y;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import f3.d;
import g.j;
import java.util.WeakHashMap;
import n0.d0;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class MainActivity extends j {
    public static final /* synthetic */ int E = 0;

    @Override // g.j, a.m, c0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0 h0Var = new h0(0);
        i0 i0Var = new i0(0, 0, h0Var);
        int i = p.f66a;
        int i4 = p.f67b;
        h0 h0Var2 = new h0(0);
        i0 i0Var2 = new i0(i, i4, h0Var2);
        View decorView = getWindow().getDecorView();
        d.d(decorView, "getDecorView(...)");
        Resources resources = decorView.getResources();
        d.d(resources, "getResources(...)");
        boolean booleanValue = ((Boolean) h0Var.b(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        d.d(resources2, "getResources(...)");
        boolean booleanValue2 = ((Boolean) h0Var2.b(resources2)).booleanValue();
        y yVar = p.f68c;
        if (yVar == null) {
            int i5 = Build.VERSION.SDK_INT;
            yVar = i5 >= 35 ? new x() : i5 >= 30 ? new w() : i5 >= 29 ? new v() : i5 >= 28 ? new t() : i5 >= 26 ? new r() : new q();
            p.f68c = yVar;
        }
        y yVar2 = yVar;
        Window window = getWindow();
        d.d(window, "getWindow(...)");
        yVar2.U(i0Var, i0Var2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        d.d(window2, "getWindow(...)");
        yVar2.g(window2);
        setContentView(R.layout.activity_main);
        View findViewById = findViewById(R.id.main);
        h0 h0Var3 = new h0(9);
        WeakHashMap weakHashMap = l0.f2757a;
        d0.j(findViewById, h0Var3);
    }
}
