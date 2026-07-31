package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ot {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f30191a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f30192b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30193b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f30194c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f30195d;

        static {
            a aVar = new a(0, "TEXT");
            f30193b = aVar;
            a aVar2 = new a(1, "IMAGE");
            f30194c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f30195d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f30195d.clone();
        }
    }

    public ot(@NotNull a type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f30191a = type;
        this.f30192b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return this.f30191a == otVar.f30191a && Intrinsics.areEqual(this.f30192b, otVar.f30192b);
    }

    public final int hashCode() {
        int hashCode = this.f30191a.hashCode() * 31;
        String str = this.f30192b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f30191a + ", text=" + this.f30192b + ")";
    }
}
