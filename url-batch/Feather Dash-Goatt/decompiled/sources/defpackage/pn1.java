package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pn1 extends c7 {
    public final View E;
    public final wo0 F;
    public s51 G;
    public Function1 H;
    public Function1 I;
    public Function1 J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pn1(Context context, Function1 function1, fl flVar, t51 t51Var, int i, eu0 eu0Var) {
        super(context, flVar, i, r4, r5, eu0Var);
        View view = (View) function1.invoke(context);
        wo0 wo0Var = new wo0();
        this.E = view;
        this.F = wo0Var;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object d = t51Var != null ? t51Var.d(valueOf) : null;
        SparseArray<Parcelable> sparseArray = d instanceof SparseArray ? (SparseArray) d : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (t51Var != null) {
            setSavableRegistryEntry(t51Var.e(valueOf, new b7(this, 2)));
        }
        y3 y3Var = y3.m;
        this.H = y3Var;
        this.I = y3Var;
        this.J = y3Var;
    }

    public static final void h(pn1 pn1Var) {
        pn1Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(s51 s51Var) {
        s51 s51Var2 = this.G;
        if (s51Var2 != null) {
            ((i8) s51Var2).w();
        }
        this.G = s51Var;
    }

    public final wo0 getDispatcher() {
        return this.F;
    }

    public final Function1<View, Unit> getReleaseBlock() {
        return this.J;
    }

    public final Function1<View, Unit> getResetBlock() {
        return this.I;
    }

    public /* bridge */ /* synthetic */ o getSubCompositionView() {
        return null;
    }

    public final Function1<View, Unit> getUpdateBlock() {
        return this.H;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.J = function1;
        setRelease(new b7(this, 3));
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.I = function1;
        setReset(new b7(this, 4));
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.H = function1;
        setUpdate(new b7(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
