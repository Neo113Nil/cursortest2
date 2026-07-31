package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vc1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f33574a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile cq1 f33575b;

    @NotNull
    public static final cq1 a(@NotNull Context context) {
        cq1 cq1Var;
        int i4;
        Integer F4;
        Intrinsics.checkNotNullParameter(context, "context");
        cq1 cq1Var2 = f33575b;
        if (cq1Var2 != null) {
            return cq1Var2;
        }
        synchronized (f33574a) {
            try {
                cq1Var = f33575b;
                if (cq1Var == null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    int i5 = ew1.f25476l;
                    du1 a4 = ew1.a.a().a(context);
                    if (a4 != null && (F4 = a4.F()) != null) {
                        if (F4.intValue() == 0) {
                            F4 = null;
                        }
                        if (F4 != null) {
                            i4 = F4.intValue();
                            cq1Var = dq1.a(context, i4);
                            f33575b = cq1Var;
                            cq1Var.a();
                        }
                    }
                    i4 = 1;
                    cq1Var = dq1.a(context, i4);
                    f33575b = cq1Var;
                    cq1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cq1Var;
    }
}
