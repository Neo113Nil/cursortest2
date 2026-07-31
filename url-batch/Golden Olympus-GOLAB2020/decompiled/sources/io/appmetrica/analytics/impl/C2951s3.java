package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2951s3 extends Pi {
    public C2951s3(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    public final Object a(int i4) {
        return Boolean.valueOf(this.f38136a.getResources().getBoolean(i4));
    }

    public final Boolean b(int i4) {
        return Boolean.valueOf(this.f38136a.getResources().getBoolean(i4));
    }
}
