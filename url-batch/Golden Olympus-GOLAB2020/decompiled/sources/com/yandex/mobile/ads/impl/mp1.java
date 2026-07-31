package com.yandex.mobile.ads.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface mp1 extends j50 {
    void a(@NotNull ip1 ip1Var);

    void reportAnr(@NotNull Map<Thread, StackTraceElement[]> map);

    void reportUnhandledException(@NotNull Throwable th);
}
