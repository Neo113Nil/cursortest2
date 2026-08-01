package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f142a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f143b = Color.argb(128, 27, 27, 27);

    public static void a(f.i iVar) {
        i0 i0Var = i0.f112f;
        j0 j0Var = new j0(0, 0, i0Var);
        j0 j0Var2 = new j0(f142a, f143b, i0Var);
        View decorView = iVar.getWindow().getDecorView();
        u2.c.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        u2.c.d(resources, "view.resources");
        boolean booleanValue = ((Boolean) i0Var.b(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        u2.c.d(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) i0Var.b(resources2)).booleanValue();
        int i4 = Build.VERSION.SDK_INT;
        s xVar = i4 >= 30 ? new x() : i4 >= 29 ? new w() : i4 >= 28 ? new u() : new s();
        Window window = iVar.getWindow();
        u2.c.d(window, "window");
        xVar.b(j0Var, j0Var2, window, decorView, booleanValue, booleanValue2);
        Window window2 = iVar.getWindow();
        u2.c.d(window2, "window");
        xVar.a(window2);
    }
}
