package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2215s0 f25836a = new C2215s0();

    @Nullable
    public final String a() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        this.f25836a.getClass();
        return C2215s0.b();
    }
}
