package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f21 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f25590c;

    /* renamed from: d, reason: collision with root package name */
    public static final f21 f25591d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ f21[] f25592e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25593b;

    public static final class a {
        private a() {
        }

        @NotNull
        public static f21 a(@Nullable String str) {
            for (f21 f21Var : f21.values()) {
                if (Intrinsics.areEqual(f21Var.a(), str)) {
                    return f21Var;
                }
            }
            return f21.f25591d;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        f21 f21Var = new f21(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        f21 f21Var2 = new f21(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        f21 f21Var3 = new f21(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        f21 f21Var4 = new f21(3, "CLOSE", "close");
        f21 f21Var5 = new f21(4, "OPEN", "open");
        f21 f21Var6 = new f21(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        f21 f21Var7 = new f21(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        f21 f21Var8 = new f21(7, "UNSPECIFIED", "");
        f25591d = f21Var8;
        f21[] f21VarArr = {f21Var, f21Var2, f21Var3, f21Var4, f21Var5, f21Var6, f21Var7, f21Var8, new f21(8, "AD_RENDERED", "adRendered")};
        f25592e = f21VarArr;
        AbstractC1372b.a(f21VarArr);
        f25590c = new a(0);
    }

    private f21(int i4, String str, String str2) {
        this.f25593b = str2;
    }

    public static f21 valueOf(String str) {
        return (f21) Enum.valueOf(f21.class, str);
    }

    public static f21[] values() {
        return (f21[]) f25592e.clone();
    }

    @NotNull
    public final String a() {
        return this.f25593b;
    }
}
