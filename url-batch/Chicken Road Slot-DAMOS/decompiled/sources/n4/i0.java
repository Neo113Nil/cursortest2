package n4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7073b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7074a = new LinkedHashMap();

    public final void a(h0 h0Var) {
        h0Var.getClass();
        String x10 = cf.c.x(h0Var.getClass());
        if (x10.length() <= 0) {
            a1.e("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.f7074a;
        h0 h0Var2 = (h0) linkedHashMap.get(x10);
        if (Intrinsics.a(h0Var2, h0Var)) {
            return;
        }
        if (h0Var2 != null && h0Var2.f7071b) {
            kotlin.collections.i0.m("Navigator ", h0Var, " is replacing an already attached ", h0Var2);
        } else if (h0Var.f7071b) {
            kotlin.collections.i0.k(h0Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final h0 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            a1.e("navigator name cannot be an empty string");
            return null;
        }
        h0 h0Var = (h0) this.f7074a.get(str);
        if (h0Var != null) {
            return h0Var;
        }
        kotlin.collections.i0.l(n0.l.g("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
