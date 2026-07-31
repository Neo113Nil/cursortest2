package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10992a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10993b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10994c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10995d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0080a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f10996a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f10997b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f10998c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f10999d;

        public a a() {
            return new a(this.f10996a, this.f10997b, this.f10998c, this.f10999d);
        }

        public C0080a b(int i4) {
            this.f10996a = Integer.valueOf(i4 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f10992a = num;
        this.f10993b = num2;
        this.f10994c = num3;
        this.f10995d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f10992a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f10993b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f10994c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f10995d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
