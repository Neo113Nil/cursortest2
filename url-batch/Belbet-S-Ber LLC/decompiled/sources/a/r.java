package a;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f72a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f73b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    public static s f74c;

    public static void a(g.i iVar) {
        int i = 0;
        l0 l0Var = new l0(0, 0, new k0(0));
        l0 l0Var2 = new l0(f72a, f73b, new k0(0));
        View decorView = iVar.getWindow().getDecorView();
        i3.d.d(decorView, "getDecorView(...)");
        s sVar = f74c;
        if (sVar == null) {
            int i4 = Build.VERSION.SDK_INT;
            sVar = i4 >= 35 ? new y() : i4 >= 30 ? new x() : i4 >= 29 ? new w() : i4 >= 28 ? new u() : new s();
            f74c = sVar;
        }
        s sVar2 = sVar;
        p pVar = new p(sVar2, l0Var, l0Var2, iVar, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                q qVar = new q(pVar, viewGroup.getContext());
                qVar.setTag(sVar2);
                qVar.setVisibility(8);
                qVar.setWillNotDraw(true);
                viewGroup.addView(qVar);
                break;
            }
            int i5 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof s) {
                break;
            } else {
                i = i5;
            }
        }
        pVar.run();
        Window window = iVar.getWindow();
        i3.d.d(window, "getWindow(...)");
        sVar2.a(window);
    }
}
