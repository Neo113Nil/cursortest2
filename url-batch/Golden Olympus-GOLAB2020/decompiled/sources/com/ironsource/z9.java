package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class z9 implements ca {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f20512a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f20513b;

    public z9(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f20512a = sharedPreferences;
        this.f20513b = sharedPreferences.edit();
    }

    @Override // com.ironsource.ca
    public void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f20513b.remove(key).apply();
    }

    @Override // com.ironsource.ca
    @NotNull
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f20512a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.ca
    @Nullable
    public String getString(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.f20512a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.ca
    public void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20513b.putString(key, value).apply();
    }
}
