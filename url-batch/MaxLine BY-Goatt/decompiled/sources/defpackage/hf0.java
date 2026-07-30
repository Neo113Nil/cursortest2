package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hf0 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static of0 c;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r2.run();
        r10 = r10.getWindow();
        r10.getClass();
        r3.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(re reVar) {
        int i = 25;
        int i2 = 0;
        es2 es2Var = new es2(0, 0, new de2(i));
        es2 es2Var2 = new es2(a, b, new de2(i));
        View decorView = reVar.getWindow().getDecorView();
        decorView.getClass();
        of0 of0Var = c;
        if (of0Var == null) {
            int i3 = Build.VERSION.SDK_INT;
            of0Var = i3 >= 35 ? new nf0() : i3 >= 30 ? new mf0() : i3 >= 29 ? new lf0() : i3 >= 28 ? new kf0() : i3 >= 26 ? new jf0() : new if0();
            c = of0Var;
        }
        of0 of0Var2 = of0Var;
        ff0 ff0Var = new ff0(of0Var2, es2Var, es2Var2, reVar, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                gf0 gf0Var = new gf0(ff0Var, viewGroup.getContext());
                gf0Var.setTag(of0Var2);
                gf0Var.setVisibility(8);
                gf0Var.setWillNotDraw(true);
                viewGroup.addView(gf0Var);
                break;
            }
            int i4 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof of0) {
                break;
            } else {
                i2 = i4;
            }
        }
    }
}
