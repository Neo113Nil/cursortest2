package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2193r1 implements InterfaceC1912f1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f30982a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C1871d8 f30983b;

    public C2193r1(@NotNull Activity activity, @Nullable C1871d8 c1871d8) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30982a = activity;
        this.f30983b = c1871d8;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1912f1
    public final void a() {
        this.f30982a.finish();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1912f1
    public final void a(int i4, @Nullable Bundle bundle) {
        C1871d8 c1871d8 = this.f30983b;
        if (c1871d8 != null) {
            c1871d8.a(i4, bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1912f1
    public final void a(int i4) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f30982a.setRequestedOrientation(i4);
            }
        } catch (Exception unused) {
            ap0.a(new Object[0]);
        }
    }
}
