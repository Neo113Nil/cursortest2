package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dr1 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(cr1 cr1Var) {
        cr1Var.getClass();
        String w = bd3.w(cr1Var.getClass());
        if (w.length() <= 0) {
            lh.e("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        cr1 cr1Var2 = (cr1) linkedHashMap.get(w);
        if (Intrinsics.b(cr1Var2, cr1Var)) {
            return;
        }
        if (cr1Var2 != null && cr1Var2.b) {
            b71.k("Navigator ", cr1Var, " is replacing an already attached ", cr1Var2);
        } else if (cr1Var.b) {
            ey.f(cr1Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final cr1 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            lh.e("navigator name cannot be an empty string");
            return null;
        }
        cr1 cr1Var = (cr1) this.a.get(str);
        if (cr1Var != null) {
            return cr1Var;
        }
        lh.g(q40.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
