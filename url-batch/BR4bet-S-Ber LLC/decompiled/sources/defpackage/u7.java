package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class u7 {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c = new ArrayList();
    public final rc0 d;
    public nx e;
    public nx f;

    public u7(ExtendedFloatingActionButton extendedFloatingActionButton, rc0 rc0Var) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = rc0Var;
    }

    public AnimatorSet a() {
        nx nxVar = this.f;
        if (nxVar == null) {
            if (this.e == null) {
                this.e = nx.b(this.a, c());
            }
            nxVar = this.e;
            nxVar.getClass();
        }
        return b(nxVar);
    }

    public final AnimatorSet b(nx nxVar) {
        ArrayList arrayList = new ArrayList();
        boolean f = nxVar.f("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (f) {
            arrayList.add(nxVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (nxVar.f("scale")) {
            arrayList.add(nxVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(nxVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (nxVar.f("width")) {
            arrayList.add(nxVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.o0));
        }
        if (nxVar.f("height")) {
            arrayList.add(nxVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.p0));
        }
        if (nxVar.f("paddingStart")) {
            arrayList.add(nxVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.q0));
        }
        if (nxVar.f("paddingEnd")) {
            arrayList.add(nxVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.r0));
        }
        if (nxVar.f("labelOpacity")) {
            arrayList.add(nxVar.d("labelOpacity", extendedFloatingActionButton, new t7(Float.class, "LABEL_OPACITY_PROPERTY", 0)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        xf.D(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.d.g = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
