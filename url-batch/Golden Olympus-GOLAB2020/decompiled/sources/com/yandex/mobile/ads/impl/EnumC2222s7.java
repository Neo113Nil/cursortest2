package com.yandex.mobile.ads.impl;

import android.content.Context;
import b2.AbstractC1372b;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.s7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class EnumC2222s7 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31608b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<String, Integer> f31609c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2222s7 f31610d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2222s7 f31611e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2222s7 f31612f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC2222s7[] f31613g;

    /* renamed from: com.yandex.mobile.ads.impl.s7$a */
    public static final class a {
        private a() {
        }

        @NotNull
        public static String a(@NotNull String template, @NotNull String resource) {
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(resource, "resource");
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            String format = String.format(Locale.US, template, Arrays.copyOf(new Object[]{resource}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        EnumC2222s7 enumC2222s7 = new EnumC2222s7(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        f31610d = enumC2222s7;
        EnumC2222s7 enumC2222s72 = new EnumC2222s7(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f31611e = enumC2222s72;
        EnumC2222s7 enumC2222s73 = new EnumC2222s7(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        f31612f = enumC2222s73;
        EnumC2222s7[] enumC2222s7Arr = {enumC2222s7, enumC2222s72, enumC2222s73};
        f31613g = enumC2222s7Arr;
        AbstractC1372b.a(enumC2222s7Arr);
        f31608b = new a(0);
        Intrinsics.checkNotNullParameter("values_dimen_%s", "template");
        Pair pair = TuplesKt.to(a.a("values_dimen_%s", enumC2222s7.name()), 48);
        Intrinsics.checkNotNullParameter("values_dimen_%s_sw600dp", "template");
        Pair pair2 = TuplesKt.to(a.a("values_dimen_%s_sw600dp", enumC2222s7.name()), 56);
        Intrinsics.checkNotNullParameter("values_dimen_%s", "template");
        Pair pair3 = TuplesKt.to(a.a("values_dimen_%s", enumC2222s72.name()), 15);
        Intrinsics.checkNotNullParameter("values_dimen_%s_sw600dp", "template");
        Pair pair4 = TuplesKt.to(a.a("values_dimen_%s_sw600dp", enumC2222s72.name()), 17);
        Intrinsics.checkNotNullParameter("values_dimen_%s", "template");
        Pair pair5 = TuplesKt.to(a.a("values_dimen_%s", enumC2222s73.name()), 19);
        Intrinsics.checkNotNullParameter("values_dimen_%s_sw600dp", "template");
        f31609c = MapsKt.mutableMapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(a.a("values_dimen_%s_sw600dp", enumC2222s73.name()), 23));
    }

    private EnumC2222s7(int i4, String str) {
    }

    public static EnumC2222s7 valueOf(String str) {
        return (EnumC2222s7) Enum.valueOf(EnumC2222s7.class, str);
    }

    public static EnumC2222s7[] values() {
        return (EnumC2222s7[]) f31613g.clone();
    }

    public final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a aVar = f31608b;
            String resourceId = b(context);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(resourceId, "resourceId");
            Integer num = f31609c.get(a.a("values_dimen_%s", resourceId));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            a aVar2 = f31608b;
            String resourceId2 = name();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(resourceId2, "resourceId");
            Integer num2 = f31609c.get(a.a("values_dimen_%s", resourceId2));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder(name());
        int i4 = lh2.f28593b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (kotlin.ranges.g.g(lh2.d(context), lh2.b(context)) >= 600) {
            sb.append("_sw600dp");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return name();
    }
}
