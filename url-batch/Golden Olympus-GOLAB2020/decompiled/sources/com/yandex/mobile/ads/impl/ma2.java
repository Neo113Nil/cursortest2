package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ma2 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final la2 f28967b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f28968c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f28969c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f28970d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f28971e;

        /* renamed from: b, reason: collision with root package name */
        private final int f28972b;

        static {
            a aVar = new a(0, 1, "VERIFICATION_REJECTED");
            a aVar2 = new a(1, 2, "VERIFICATION_NOT_SUPPORTED");
            f28969c = aVar2;
            a aVar3 = new a(2, 3, "ERROR_RESOURCE_LOAD");
            f28970d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f28971e = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, int i5, String str) {
            this.f28972b = i5;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28971e.clone();
        }

        public final int a() {
            return this.f28972b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ma2(@NotNull la2 verification, @NotNull a reason) {
        super("Verification not executed with reason = " + r0);
        Intrinsics.checkNotNullParameter(verification, "verification");
        Intrinsics.checkNotNullParameter(reason, "reason");
        String name = reason.name();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f28967b = verification;
        this.f28968c = reason;
    }

    @NotNull
    public final a a() {
        return this.f28968c;
    }

    @NotNull
    public final la2 b() {
        return this.f28967b;
    }
}
