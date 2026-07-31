package com.yandex.mobile.ads.impl;

import android.content.Context;
import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface vy1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f33822c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f33823d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f33824e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f33825f;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f33826b;

        static {
            a aVar = new a(0, "FIXED", "fixed");
            f33822c = aVar;
            a aVar2 = new a(1, "FLEXIBLE", "flexible");
            f33823d = aVar2;
            a aVar3 = new a(2, "SCREEN", "screen");
            a aVar4 = new a(3, "STICKY", "sticky");
            f33824e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f33825f = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str, String str2) {
            this.f33826b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f33825f.clone();
        }

        @NotNull
        public final String a() {
            return this.f33826b;
        }
    }

    int a(@NotNull Context context);

    @NotNull
    a a();

    int b(@NotNull Context context);

    int c(@NotNull Context context);

    int d(@NotNull Context context);

    int getHeight();

    int getWidth();
}
