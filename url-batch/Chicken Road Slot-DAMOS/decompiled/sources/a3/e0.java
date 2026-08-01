package a3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n0.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 extends n {
    public final View O;
    public final w1.c P;
    public a1.l Q;
    public Function1 R;
    public Function1 S;
    public Function1 T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(Context context, Function1 function1, h0 h0Var, a1.m mVar, int i3, d2.v vVar) {
        super(context, h0Var, i3, r4, r5, vVar);
        View view = (View) function1.invoke(context);
        w1.c cVar = new w1.c();
        cVar.f10011c = new a2.a0(13, cVar);
        this.O = view;
        this.P = cVar;
        setClipChildren(false);
        String valueOf = String.valueOf(i3);
        Object e2 = mVar != null ? mVar.e(valueOf) : null;
        SparseArray<Parcelable> sparseArray = e2 instanceof SparseArray ? (SparseArray) e2 : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (mVar != null) {
            setSavableRegistryEntry(mVar.f(valueOf, new m(this, 2)));
        }
        c cVar2 = c.f201s;
        this.R = cVar2;
        this.S = cVar2;
        this.T = cVar2;
    }

    public static final void n(e0 e0Var) {
        e0Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(a1.l lVar) {
        a1.l lVar2 = this.Q;
        if (lVar2 != null) {
            ((a1.n) lVar2).L();
        }
        this.Q = lVar;
    }

    public final w1.c getDispatcher() {
        return this.P;
    }

    public final Function1<View, Unit> getReleaseBlock() {
        return this.T;
    }

    public final Function1<View, Unit> getResetBlock() {
        return this.S;
    }

    public /* bridge */ /* synthetic */ d2.a getSubCompositionView() {
        return null;
    }

    public final Function1<View, Unit> getUpdateBlock() {
        return this.R;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.T = function1;
        setRelease(new m(this, 3));
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.S = function1;
        setReset(new m(this, 4));
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.R = function1;
        setUpdate(new m(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
