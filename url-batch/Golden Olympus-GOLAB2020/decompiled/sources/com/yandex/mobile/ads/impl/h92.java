package com.yandex.mobile.ads.impl;

import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h92 {
    public static final void a(@NotNull g92 g92Var, @NotNull ip1 report) {
        String str;
        C1814b a4;
        Intrinsics.checkNotNullParameter(g92Var, "<this>");
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            C1814b a5 = report.a();
            if (a5 != null) {
                str = a5.a();
                if (str == null) {
                }
                a4 = report.a();
                if (a4 != null || (r3 = a4.b()) == null) {
                    Set<Long> e4 = kotlin.collections.T.e();
                }
                g92Var.setExperiments(str);
                g92Var.setTriggeredTestIds(e4);
                Objects.toString(e4);
                ap0.a(new Object[0]);
            }
            str = "";
            a4 = report.a();
            if (a4 != null) {
            }
            Set<Long> e42 = kotlin.collections.T.e();
            g92Var.setExperiments(str);
            g92Var.setTriggeredTestIds(e42);
            Objects.toString(e42);
            ap0.a(new Object[0]);
        } catch (Throwable th) {
            th.toString();
            ap0.b(new Object[0]);
        }
    }
}
