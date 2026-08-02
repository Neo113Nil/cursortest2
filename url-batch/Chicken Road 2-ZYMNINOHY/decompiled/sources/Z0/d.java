package Z0;

import E.AbstractC0005f;
import W.AbstractC0108a;
import a.AbstractC0124a;
import android.graphics.Color;
import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3825b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f3826c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3827d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3828e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3829f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3830g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3831h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3832i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3833j;

    public d(String str, int i4, Integer num, Integer num2, float f4, boolean z, boolean z4, boolean z5, boolean z6, int i5) {
        this.f3824a = str;
        this.f3825b = i4;
        this.f3826c = num;
        this.f3827d = num2;
        this.f3828e = f4;
        this.f3829f = z;
        this.f3830g = z4;
        this.f3831h = z5;
        this.f3832i = z6;
        this.f3833j = i5;
    }

    public static int a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0005f.y("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e4) {
            AbstractC0108a.t("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0124a.h(parseLong <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(O3.d.g(((parseLong >> 24) & 255) ^ 255), O3.d.g(parseLong & 255), O3.d.g((parseLong >> 8) & 255), O3.d.g((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            AbstractC0108a.t("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }
}
