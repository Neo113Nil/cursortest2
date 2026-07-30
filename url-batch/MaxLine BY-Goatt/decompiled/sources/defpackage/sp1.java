package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sp1 extends pp1 {
    public final dr1 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp1(dr1 dr1Var) {
        super(dr1Var.b(bd3.w(tp1.class)), null);
        dr1Var.getClass();
        this.h = new ArrayList();
        this.f = dr1Var;
        this.g = "home";
    }

    public final rp1 c() {
        rp1 rp1Var = (rp1) super.a();
        ArrayList arrayList = this.h;
        arrayList.getClass();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            op1 op1Var = (op1) obj;
            if (op1Var != null) {
                yn2 yn2Var = rp1Var.v;
                int i3 = op1Var.r;
                String str = op1Var.s;
                if (i3 == 0 && str == null) {
                    lh.e("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = rp1Var.s;
                if (str2 != null && Intrinsics.b(str, str2)) {
                    b71.r("Destination ", op1Var, " cannot have the same route as graph ", rp1Var);
                    return null;
                }
                if (i3 == rp1Var.r) {
                    b71.r("Destination ", op1Var, " cannot have the same id as graph ", rp1Var);
                    return null;
                }
                op1 op1Var2 = (op1) yn2Var.c(i3);
                if (op1Var2 == op1Var) {
                    continue;
                } else {
                    if (op1Var.n != null) {
                        lh.g("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (op1Var2 != null) {
                        op1Var2.n = null;
                    }
                    op1Var.n = rp1Var;
                    yn2Var.e(op1Var.r, op1Var);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.b != null) {
                lh.g("You must set a start destination route");
                return null;
            }
            lh.g("You must set a start destination id");
            return null;
        }
        if (str3 != null) {
            if (str3.equals(rp1Var.s)) {
                b71.r("Start destination ", str3, " cannot use the same route as the graph ", rp1Var);
            } else if (up2.y(str3)) {
                lh.e("Cannot have an empty start destination route");
            } else {
                i = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return rp1Var;
        }
        rp1Var.w = i;
        rp1Var.y = str3;
        return rp1Var;
    }
}
