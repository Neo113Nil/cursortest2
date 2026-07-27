package s1;

import A.AbstractC0017m;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f10486b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10487a = new LinkedHashMap();

    public final void a(H navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = m3.s.m(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f10487a;
        H h4 = (H) linkedHashMap.get(name);
        if (Intrinsics.a(h4, navigator)) {
            return;
        }
        boolean z4 = false;
        if (h4 != null && h4.f10485b) {
            z4 = true;
        }
        if (z4) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + h4).toString());
        }
        if (!navigator.f10485b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final H b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        H h4 = (H) this.f10487a.get(name);
        if (h4 != null) {
            return h4;
        }
        throw new IllegalStateException(AbstractC0017m.j("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
