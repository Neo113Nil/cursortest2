package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ts {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f32564a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32565b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32566b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f32567c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f32568d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f32569e;

        static {
            a aVar = new a(0, "PERCENTS");
            f32566b = aVar;
            a aVar2 = new a(1, "MILLISECONDS");
            f32567c = aVar2;
            a aVar3 = new a(2, "POSITION");
            f32568d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f32569e = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32569e.clone();
        }
    }

    public ts(@NotNull a positionType, long j4) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        this.f32564a = positionType;
        this.f32565b = j4;
    }

    @NotNull
    public final a a() {
        return this.f32564a;
    }

    public final long b() {
        return this.f32565b;
    }
}
