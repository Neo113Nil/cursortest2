package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Magnifier;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x12 implements v12, l22 {
    public static final x12 n = new x12(0);
    public static final x12 o = new x12(1);
    public final /* synthetic */ int m;

    public /* synthetic */ x12(int i) {
        this.m = i;
    }

    public static Typeface e(String str, jq0 jq0Var, int i) {
        if (i == 0 && Intrinsics.b(jq0Var, jq0.q) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), jq0Var.m, i == 1);
    }

    @Override // defpackage.l22
    public Typeface a(int i, jq0 jq0Var) {
        return e(null, jq0Var, i);
    }

    @Override // defpackage.v12
    public boolean b() {
        switch (this.m) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.l22
    public Typeface c(xu0 xu0Var, jq0 jq0Var, int i) {
        xu0Var.getClass();
        return e("sans-serif", jq0Var, i);
    }

    @Override // defpackage.v12
    public u12 d(View view, ca0 ca0Var) {
        switch (this.m) {
            case 0:
                return new w12(new Magnifier(view));
            default:
                return new y12(new Magnifier(view));
        }
    }
}
