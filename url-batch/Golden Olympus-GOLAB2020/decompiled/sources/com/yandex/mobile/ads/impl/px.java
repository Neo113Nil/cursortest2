package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class px {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f30605a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<String> f30606b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30607b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f30608c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f30609d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f30610e;

        static {
            a aVar = new a(0, "SUCCESS");
            f30607b = aVar;
            a aVar2 = new a(1, "WARNING");
            f30608c = aVar2;
            a aVar3 = new a(2, "ERROR");
            f30609d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f30610e = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f30610e.clone();
        }
    }

    public px(@NotNull a status, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f30605a = status;
        this.f30606b = list;
    }

    @Nullable
    public final List<String> a() {
        return this.f30606b;
    }

    @NotNull
    public final a b() {
        return this.f30605a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        return this.f30605a == pxVar.f30605a && Intrinsics.areEqual(this.f30606b, pxVar.f30606b);
    }

    public final int hashCode() {
        int hashCode = this.f30605a.hashCode() * 31;
        List<String> list = this.f30606b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f30605a + ", messages=" + this.f30606b + ")";
    }
}
