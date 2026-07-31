package ru.rustore.sdk.metrics.internal;

import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f43690c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final x0 f43691a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f43692b;

    public a1(x0 sharedPreferenceProvider, b1 uuidFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferenceProvider, "sharedPreferenceProvider");
        Intrinsics.checkNotNullParameter(uuidFactory, "uuidFactory");
        this.f43691a = sharedPreferenceProvider;
        this.f43692b = uuidFactory;
    }

    public final String a() {
        this.f43692b.getClass();
        String value = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value, "randomUUID().toString()");
        SharedPreferences sharedPreferences = this.f43691a.f43779a;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("USER_ID_KEY", value);
        edit.apply();
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
