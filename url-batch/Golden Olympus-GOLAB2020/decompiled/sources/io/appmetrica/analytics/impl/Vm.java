package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Vm extends Pi {
    public Vm(@NonNull Context context, @NonNull String str) {
        super(context, str, "string");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    public final Object a(int i4) {
        return this.f38136a.getString(i4);
    }

    public final String b(int i4) {
        return this.f38136a.getString(i4);
    }
}
