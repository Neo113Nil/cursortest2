package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2355y2 extends hi2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34774d = 0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC1890e3 f34775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2355y2(@NotNull EnumC1890e3 reason, @Nullable lc1 lc1Var) {
        super(lc1Var);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f34775c = reason;
    }

    @NotNull
    public final EnumC1890e3 a() {
        return this.f34775c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C2355y2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f34775c == ((C2355y2) obj).f34775c;
    }

    public final int hashCode() {
        return this.f34775c.hashCode();
    }

    /* renamed from: com.yandex.mobile.ads.impl.y2$a */
    public static final class a {
        @NotNull
        public static C2355y2 a(@Nullable lc1 lc1Var) {
            EnumC1890e3 enumC1890e3;
            int i4 = lc1Var != null ? lc1Var.f28505a : -1;
            ap0.b(Integer.valueOf(i4));
            if (204 == i4) {
                enumC1890e3 = EnumC1890e3.f25070d;
            } else {
                Map<String, String> responseHeaders = lc1Var != null ? lc1Var.f28507c : null;
                Integer valueOf = lc1Var != null ? Integer.valueOf(lc1Var.f28505a) : null;
                if (valueOf != null && 400 == valueOf.intValue() && responseHeaders != null) {
                    bh0 httpHeader = bh0.f23771X;
                    int i5 = cf0.f24191b;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
                    String a4 = cf0.a(responseHeaders, httpHeader);
                    if (a4 != null && Boolean.parseBoolean(a4)) {
                        enumC1890e3 = EnumC1890e3.f25074h;
                    }
                }
                enumC1890e3 = 403 == i4 ? EnumC1890e3.f25073g : 404 == i4 ? EnumC1890e3.f25068b : (500 > i4 || i4 > 599) ? -1 == i4 ? EnumC1890e3.f25077k : EnumC1890e3.f25071e : EnumC1890e3.f25072f;
            }
            return new C2355y2(enumC1890e3, lc1Var);
        }

        @NotNull
        public static C2355y2 a(@NotNull hi2 volleyError) {
            EnumC1890e3 enumC1890e3;
            Intrinsics.checkNotNullParameter(volleyError, "volleyError");
            lc1 lc1Var = volleyError.f26761b;
            Integer valueOf = lc1Var != null ? Integer.valueOf(lc1Var.f28505a) : null;
            if (valueOf == null) {
                if (volleyError instanceof bd1) {
                    enumC1890e3 = EnumC1890e3.f25077k;
                } else if (volleyError instanceof a52) {
                    enumC1890e3 = EnumC1890e3.f25078l;
                } else if (volleyError instanceof C2118nh) {
                    enumC1890e3 = EnumC1890e3.f25079m;
                } else if (volleyError instanceof so) {
                    enumC1890e3 = EnumC1890e3.f25080n;
                } else {
                    enumC1890e3 = volleyError instanceof vf1 ? EnumC1890e3.f25081o : EnumC1890e3.f25082p;
                }
            } else {
                int intValue = valueOf.intValue();
                enumC1890e3 = (500 > intValue || intValue > 599) ? EnumC1890e3.f25071e : EnumC1890e3.f25072f;
            }
            ap0.b(valueOf);
            return new C2355y2(enumC1890e3, lc1Var);
        }
    }
}
