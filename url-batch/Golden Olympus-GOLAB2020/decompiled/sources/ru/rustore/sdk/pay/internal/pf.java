package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import b0.AbstractC1367a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pf implements Y.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f44783a;

    public pf(hf hfVar) {
        this.f44783a = hfVar;
    }

    @Override // androidx.lifecycle.Y.b
    @NotNull
    public /* bridge */ /* synthetic */ V create(@NotNull Class cls, @NotNull AbstractC1367a abstractC1367a) {
        return super.create(cls, abstractC1367a);
    }

    @Override // androidx.lifecycle.Y.b
    public final <T extends V> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new qf(this.f44783a);
    }
}
