package com.onevcat.uniwebview;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {
    public static final f b = new f();
    public final HashMap a = new HashMap();

    public final void a(f0 session, String name) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.a(n.DEBUG, d.a("Adding auth session to manager: ", name, oVar2, "message"));
        this.a.put(name, session);
    }
}
