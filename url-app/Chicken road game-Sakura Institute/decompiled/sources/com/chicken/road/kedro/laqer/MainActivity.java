package com.chicken.road.kedro.laqer;

import O.a;
import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.M;
import b.F;
import b.G;
import b.o;
import b.p;
import b.q;
import b.r;
import b.s;
import b.t;
import c.AbstractC0521a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import s0.C1142f0;
import z1.w;

@Metadata
/* loaded from: classes.dex */
public final class MainActivity extends o {
    @Override // b.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i2 = 1;
        int i4 = p.f5580a;
        F detectDarkMode = F.f5521e;
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        G statusBarStyle = new G(0, 0, detectDarkMode);
        int i5 = p.f5580a;
        int i6 = p.f5581b;
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        G navigationBarStyle = new G(i5, i6, detectDarkMode);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean booleanValue = ((Boolean) detectDarkMode.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) detectDarkMode.invoke(resources2)).booleanValue();
        int i7 = Build.VERSION.SDK_INT;
        q tVar = i7 >= 30 ? new t() : i7 >= 29 ? new s() : i7 >= 28 ? new r() : new q();
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        tVar.b(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        tVar.a(window2);
        super.onCreate(bundle);
        a aVar = new a(1282999784, true, new w(this, i2));
        ViewGroup.LayoutParams layoutParams = AbstractC0521a.f5700a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C1142f0 c1142f0 = childAt instanceof C1142f0 ? (C1142f0) childAt : null;
        if (c1142f0 != null) {
            c1142f0.setParentCompositionContext(null);
            c1142f0.setContent(aVar);
            return;
        }
        C1142f0 c1142f02 = new C1142f0(this);
        c1142f02.setParentCompositionContext(null);
        c1142f02.setContent(aVar);
        View decorView2 = getWindow().getDecorView();
        if (M.f(decorView2) == null) {
            M.i(decorView2, this);
        }
        if (M.g(decorView2) == null) {
            M.j(decorView2, this);
        }
        if (AbstractC0864b.q(decorView2) == null) {
            AbstractC0864b.B(decorView2, this);
        }
        setContentView(c1142f02, AbstractC0521a.f5700a);
    }
}
