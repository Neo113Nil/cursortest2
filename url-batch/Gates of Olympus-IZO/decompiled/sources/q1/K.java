package q1;

import f.AbstractC0382a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f6874b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6875a = new LinkedHashMap();

    public final void a(J j3) {
        Z1.i.f(j3, "navigator");
        String p = AbstractC0382a.p(j3.getClass());
        if (p.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f6875a;
        J j4 = (J) linkedHashMap.get(p);
        if (Z1.i.a(j4, j3)) {
            return;
        }
        boolean z3 = false;
        if (j4 != null && j4.f6873b) {
            z3 = true;
        }
        if (z3) {
            throw new IllegalStateException(("Navigator " + j3 + " is replacing an already attached " + j4).toString());
        }
        if (!j3.f6873b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + j3 + " is already attached to another NavController").toString());
    }

    public final J b(String str) {
        Z1.i.f(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        J j3 = (J) this.f6875a.get(str);
        if (j3 != null) {
            return j3;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
