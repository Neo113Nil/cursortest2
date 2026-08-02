package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805mo implements Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final String a(Context context) {
        IdentifiersResult q4 = new Ve(C0501b4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(q4.id)) {
            return null;
        }
        return q4.id;
    }
}
