package com.yandex.div.evaluable.types;

import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class Color {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: argb-H0kstlE, reason: not valid java name */
        public final int m219argbH0kstlE(int i4, int i5, int i6, int i7) {
            return Color.m211constructorimpl((i4 << 24) | (i5 << 16) | (i6 << 8) | i7);
        }

        /* renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m220parseC4zCDoM(@NotNull String colorString) {
            String str;
            Intrinsics.checkNotNullParameter(colorString, "colorString");
            if (colorString.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (colorString.charAt(0) != '#') {
                throw new IllegalArgumentException(("Unknown color " + colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char charAt = colorString.charAt(1);
                char charAt2 = colorString.charAt(2);
                char charAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', charAt, charAt, charAt2, charAt2, charAt3, charAt3});
            } else if (length == 5) {
                char charAt4 = colorString.charAt(1);
                char charAt5 = colorString.charAt(2);
                char charAt6 = colorString.charAt(3);
                char charAt7 = colorString.charAt(4);
                str = new String(new char[]{charAt4, charAt4, charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            } else if (length == 7) {
                StringBuilder sb = new StringBuilder();
                sb.append("ff");
                String substring = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color " + colorString);
                }
                str = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            return Color.m211constructorimpl((int) Long.parseLong(str, CharsKt.checkRadix(16)));
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(int i4) {
        this.value = i4;
    }

    /* renamed from: alpha-impl, reason: not valid java name */
    public static final int m208alphaimpl(int i4) {
        return i4 >>> 24;
    }

    /* renamed from: blue-impl, reason: not valid java name */
    public static final int m209blueimpl(int i4) {
        return i4 & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m210boximpl(int i4) {
        return new Color(i4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m211constructorimpl(int i4) {
        return i4;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m212equalsimpl(int i4, Object obj) {
        return (obj instanceof Color) && i4 == ((Color) obj).m218unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m213equalsimpl0(int i4, int i5) {
        return i4 == i5;
    }

    /* renamed from: green-impl, reason: not valid java name */
    public static final int m214greenimpl(int i4) {
        return (i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m215hashCodeimpl(int i4) {
        return Integer.hashCode(i4);
    }

    /* renamed from: red-impl, reason: not valid java name */
    public static final int m216redimpl(int i4) {
        return (i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m217toStringimpl(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        String hexString = Integer.toHexString(i4);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        String upperCase = StringsKt.p0(hexString, 8, '0').toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append(upperCase);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return m212equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m215hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m217toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m218unboximpl() {
        return this.value;
    }
}
