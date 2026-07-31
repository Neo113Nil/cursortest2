package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import b2.AbstractC1372b;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ub0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f32998f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f32999g = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f33000b;

        /* renamed from: c, reason: collision with root package name */
        private final int f33001c;

        /* renamed from: d, reason: collision with root package name */
        private final int f33002d;

        /* renamed from: e, reason: collision with root package name */
        private final int f33003e;

        static {
            a[] aVarArr = {new a(R.font.monetization_ads_internal_font_light, R.font.monetization_ads_internal_font_regular, R.font.monetization_ads_internal_font_medium, R.font.monetization_ads_internal_font_bold)};
            f32998f = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, int i5, int i6, int i7) {
            this.f33000b = i4;
            this.f33001c = i5;
            this.f33002d = i6;
            this.f33003e = i7;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32998f.clone();
        }

        public final int a() {
            return this.f33003e;
        }

        public final int b() {
            return this.f33000b;
        }

        public final int c() {
            return this.f33002d;
        }

        public final int d() {
            return this.f33001c;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33004a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f33004a = iArr;
        }
    }

    @Nullable
    public static tb0 a(@NotNull Context context) {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        String s4 = a4 != null ? a4.s() : null;
        if (s4 == null) {
            return null;
        }
        try {
            a valueOf = a.valueOf(s4);
            if (b.f33004a[valueOf.ordinal()] != 1) {
                throw new W1.m();
            }
            try {
                typeface = androidx.core.content.res.f.g(context, valueOf.b());
            } catch (Throwable unused) {
                typeface = null;
            }
            try {
                typeface2 = androidx.core.content.res.f.g(context, valueOf.d());
            } catch (Throwable unused2) {
                typeface2 = null;
            }
            try {
                typeface3 = androidx.core.content.res.f.g(context, valueOf.c());
            } catch (Throwable unused3) {
                typeface3 = null;
            }
            try {
                typeface4 = androidx.core.content.res.f.g(context, valueOf.a());
            } catch (Throwable unused4) {
                typeface4 = null;
            }
            return new tb0(typeface, typeface2, typeface3, typeface4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
