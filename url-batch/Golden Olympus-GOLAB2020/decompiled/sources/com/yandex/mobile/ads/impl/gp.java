package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f26262a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f26263b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26264b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26265c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f26266d;

        static {
            a aVar = new a(0, "TEXT");
            f26264b = aVar;
            a aVar2 = new a(1, "IMAGE");
            f26265c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f26266d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f26266d.clone();
        }
    }

    public gp(@NotNull a type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f26262a = type;
        this.f26263b = str;
    }

    @Nullable
    public final String a() {
        return this.f26263b;
    }

    @NotNull
    public final a b() {
        return this.f26262a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return this.f26262a == gpVar.f26262a && Intrinsics.areEqual(this.f26263b, gpVar.f26263b);
    }

    public final int hashCode() {
        int hashCode = this.f26262a.hashCode() * 31;
        String str = this.f26263b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CloseButtonValue(type=" + this.f26262a + ", text=" + this.f26263b + ")";
    }
}
