package com.onevcat.uniwebview;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {
    public static final t b = new t();
    public final HashMap a = new HashMap();

    public final void a(f5 browsing, String name) {
        Intrinsics.checkNotNullParameter(browsing, "browsing");
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.a(n.DEBUG, d.a("Adding safe browsing to manager: ", name, oVar2, "message"));
        this.a.put(name, browsing);
    }
}
