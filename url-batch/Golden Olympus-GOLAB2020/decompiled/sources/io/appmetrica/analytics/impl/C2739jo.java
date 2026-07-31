package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2739jo implements InterfaceC2622fb {
    @Override // io.appmetrica.analytics.impl.InterfaceC2622fb
    public final String a(@NonNull Context context) {
        IdentifiersResult q4 = new C2730jf(C3007u7.a(context.getApplicationContext()).a()).q();
        if (TextUtils.isEmpty(q4.id)) {
            return null;
        }
        return q4.id;
    }
}
