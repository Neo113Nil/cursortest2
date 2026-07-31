package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.iv;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xu1 implements iv.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34675a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f34676b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34677c;

    public xu1(@NotNull String userAgent, @Nullable SSLSocketFactory sSLSocketFactory, boolean z4) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f34675a = userAgent;
        this.f34676b = sSLSocketFactory;
        this.f34677c = z4;
    }

    @Override // com.yandex.mobile.ads.impl.iv.a
    @NotNull
    public final iv a() {
        if (!this.f34677c) {
            return new uu1(this.f34675a, new ah0(), this.f34676b);
        }
        int i4 = ud1.f33041c;
        return new xd1(ud1.a(JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR, this.f34676b), this.f34675a, new ah0());
    }
}
