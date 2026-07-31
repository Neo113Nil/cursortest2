package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j0 implements a {
    public final List a = new ArrayList();

    @Override // com.chartboost.sdk.impl.a
    public JSONObject a(JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            response = (JSONObject) ((a) it.next()).a(response);
        }
        return response;
    }
}
