package com.yandex.mobile.ads.impl;

import android.view.View;
import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mb2 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f28979d = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(mb2.class, "view", "getView()Landroid/view/View;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f28980a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f28981b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f28982c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28983b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f28984c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f28985d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f28986e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f28987f;

        static {
            a aVar = new a(0, "CONTROLS");
            f28983b = aVar;
            a aVar2 = new a(1, "CLOSE_AD");
            f28984c = aVar2;
            a aVar3 = new a(2, "NOT_VISIBLE");
            f28985d = aVar3;
            a aVar4 = new a(3, "OTHER");
            f28986e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f28987f = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28987f.clone();
        }
    }

    public mb2(@NotNull View view, @NotNull a purpose, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f28980a = purpose;
        this.f28981b = str;
        this.f28982c = bo1.a(view);
    }

    @Nullable
    public final String a() {
        return this.f28981b;
    }

    @NotNull
    public final a b() {
        return this.f28980a;
    }

    @Nullable
    public final View c() {
        return (View) this.f28982c.getValue(this, f28979d[0]);
    }
}
