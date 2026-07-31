package com.onevcat.uniwebview;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0 {
    public final String a;
    public final JSONObject b;

    public j0(String resultStr) {
        Intrinsics.checkNotNullParameter(resultStr, "resultStr");
        this.a = resultStr;
        this.b = new JSONObject(resultStr);
    }
}
