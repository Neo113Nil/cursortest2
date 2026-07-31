package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b30 implements DivTypefaceProvider {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23583a;

    public b30(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23583a = context;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getBold() {
        Typeface a4;
        tb0 a5 = ub0.a(this.f23583a);
        return (a5 == null || (a4 = a5.a()) == null) ? Typeface.DEFAULT_BOLD : a4;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getLight() {
        tb0 a4 = ub0.a(this.f23583a);
        if (a4 != null) {
            return a4.b();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getMedium() {
        tb0 a4 = ub0.a(this.f23583a);
        if (a4 != null) {
            return a4.c();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getRegular() {
        tb0 a4 = ub0.a(this.f23583a);
        if (a4 != null) {
            return a4.d();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* bridge */ /* synthetic */ Typeface getTypefaceFor(int i4) {
        return super.getTypefaceFor(i4);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public /* bridge */ /* synthetic */ boolean isVariable() {
        return super.isVariable();
    }
}
