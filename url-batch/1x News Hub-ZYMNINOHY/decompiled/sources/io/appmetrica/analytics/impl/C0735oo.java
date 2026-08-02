package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735oo implements Ra {
    @Override // io.appmetrica.analytics.impl.Ra
    public final String a(Context context) {
        IdentifiersResult q3 = new C0364af(C0511g7.a(context.getApplicationContext()).a()).q();
        if (TextUtils.isEmpty(q3.id)) {
            return null;
        }
        return q3.id;
    }
}
