package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2097mj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.a8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1799a8<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC2097mj.a<T> f23183a;

    public C1799a8(@NotNull AbstractC2097mj.a<T> responseReportDataProvider) {
        Intrinsics.checkNotNullParameter(responseReportDataProvider, "responseReportDataProvider");
        this.f23183a = responseReportDataProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jp1 a(int i4, @NotNull C2286v2 adConfiguration, @Nullable qq1 qq1Var) {
        String str;
        C2360y7 c2360y7;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = this.f23183a.a(qq1Var, adConfiguration);
        vy1 q4 = adConfiguration.q();
        if (q4 != null) {
            a4.b(q4.a().a(), "size_type");
            a4.b(Integer.valueOf(q4.getWidth()), "width");
            a4.b(Integer.valueOf(q4.getHeight()), "height");
        }
        a4.b(Integer.valueOf(i4), i4 == -1 ? "error_code" : "code");
        if (qq1Var != null && (c2360y7 = (C2360y7) qq1Var.f30869a) != null) {
            if (c2360y7.D() != null) {
                str = "mediation";
            } else if (c2360y7.I() != null) {
                str = "ad";
            }
            a4.b(str, "response_type");
            if (qq1Var != null) {
                C2360y7 c2360y72 = (C2360y7) qq1Var.f30869a;
                a4.a(c2360y72 != null ? c2360y72.a() : null);
            }
            return a4;
        }
        str = "empty";
        a4.b(str, "response_type");
        if (qq1Var != null) {
        }
        return a4;
    }
}
