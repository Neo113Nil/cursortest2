package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f43779a;

    public x0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43779a = context.getSharedPreferences("metrics_sdk_sp", 0);
    }
}
