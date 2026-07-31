package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.be, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1829be {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1901ee f23718a;

    public C1829be(@NotNull TextView textView, @NotNull C1901ee appCompatTextViewAutoSizeHelper) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(appCompatTextViewAutoSizeHelper, "appCompatTextViewAutoSizeHelper");
        this.f23718a = appCompatTextViewAutoSizeHelper;
    }

    public final void a() {
        this.f23718a.a();
    }

    public final void b() {
        this.f23718a.a();
    }

    public final void a(int i4) {
        this.f23718a.a(i4);
    }

    public final void a(int i4, float f4) {
        if (this.f23718a.b()) {
            return;
        }
        this.f23718a.a(i4, f4);
    }
}
