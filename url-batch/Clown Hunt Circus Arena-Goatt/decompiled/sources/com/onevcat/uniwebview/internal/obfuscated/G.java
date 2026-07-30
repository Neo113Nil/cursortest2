package com.onevcat.uniwebview.internal.obfuscated;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G {
    public static final G b = new G();
    public final HashMap a = new HashMap();

    public final B3 a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (B3) this.a.get(name);
    }
}
