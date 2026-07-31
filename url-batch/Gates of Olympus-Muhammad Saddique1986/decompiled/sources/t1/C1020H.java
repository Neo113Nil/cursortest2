package t1;

import java.util.LinkedHashMap;
import n.t0;

/* renamed from: t1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020H {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f8853b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8854a = new LinkedHashMap();

    public final void a(AbstractC1019G abstractC1019G) {
        f2.j.f(abstractC1019G, "navigator");
        String m3 = t0.m(abstractC1019G.getClass());
        if (m3.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f8854a;
        AbstractC1019G abstractC1019G2 = (AbstractC1019G) linkedHashMap.get(m3);
        if (f2.j.a(abstractC1019G2, abstractC1019G)) {
            return;
        }
        boolean z3 = false;
        if (abstractC1019G2 != null && abstractC1019G2.f8852b) {
            z3 = true;
        }
        if (z3) {
            throw new IllegalStateException(("Navigator " + abstractC1019G + " is replacing an already attached " + abstractC1019G2).toString());
        }
        if (!abstractC1019G.f8852b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + abstractC1019G + " is already attached to another NavController").toString());
    }

    public final AbstractC1019G b(String str) {
        f2.j.f(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC1019G abstractC1019G = (AbstractC1019G) this.f8854a.get(str);
        if (abstractC1019G != null) {
            return abstractC1019G;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
