package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Tm extends Pi {
    public Tm(@NotNull Context context, @NotNull String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    public final Object a(int i4) {
        return this.f38136a.getResources().getStringArray(i4);
    }

    @Nullable
    public final String[] b(int i4) {
        return this.f38136a.getResources().getStringArray(i4);
    }
}
