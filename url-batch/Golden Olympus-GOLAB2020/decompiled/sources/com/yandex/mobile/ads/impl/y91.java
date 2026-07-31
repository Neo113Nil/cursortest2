package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface y91 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34936b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f34937c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f34938d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f34939e;

        static {
            a aVar = new a(0, "FIXED");
            f34936b = aVar;
            a aVar2 = new a(1, "FIXED_RATIO");
            f34937c = aVar2;
            a aVar3 = new a(2, "PREFERRED_RATIO");
            f34938d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f34939e = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34939e.clone();
        }
    }

    public interface b {
        @Nullable
        a getType();
    }

    @NotNull
    b getSizeConstraintType();

    float getValue();
}
