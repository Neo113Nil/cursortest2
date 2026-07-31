package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import b0.AbstractC1367a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class yn implements Y.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f45303a;

    public yn(@NotNull Url authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f45303a = authUrl;
    }

    @Override // androidx.lifecycle.Y.b
    @NotNull
    public /* bridge */ /* synthetic */ V create(@NotNull Class cls, @NotNull AbstractC1367a abstractC1367a) {
        return super.create(cls, abstractC1367a);
    }

    @Override // androidx.lifecycle.Y.b
    @NotNull
    public final <T extends V> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new xn(this.f45303a);
    }
}
