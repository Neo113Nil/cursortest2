package com.ironsource.b;

import android.app.Activity;
import com.ironsource.b.f.s;
import com.mopub.common.AdType;
import com.youappi.sdk.net.model.ProductRequestItem;

/* compiled from: IronSource.java */
/* loaded from: classes2.dex */
public abstract class k {

    /* compiled from: IronSource.java */
    public enum a {
        REWARDED_VIDEO(ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO),
        INTERSTITIAL(AdType.INTERSTITIAL),
        OFFERWALL("offerwall"),
        BANNER("banner");

        private String e;

        a(String str) {
            this.e = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.e;
        }
    }

    public static void a(Activity activity, String str, a... aVarArr) {
        m.a().a(activity, str, false, aVarArr);
    }

    public static void b(Activity activity, String str, a... aVarArr) {
        m.a().a(activity, str, aVarArr);
    }

    public static void a(Activity activity) {
        m.a().a(activity);
    }

    public static void b(Activity activity) {
        m.a().b(activity);
    }

    public static void a(String str) {
        m.a().c(str);
    }

    public static void b(String str) {
        m.a().d(str);
    }

    public static boolean a() {
        return m.a().i();
    }

    public static void a(s sVar) {
        m.a().a(sVar);
    }

    public static void c(String str) {
        m.a().e(str);
    }

    public static void a(String str, String str2) {
        m.a().a(str, str2);
    }

    public static boolean d(String str) {
        return m.a().f(str);
    }

    public static void a(com.ironsource.b.f.g gVar) {
        m.a().a(gVar);
    }

    public static void e(String str) {
        m.a().g(str);
    }

    public static void f(String str) {
        m.a().h(str);
    }

    public static void b(String str, String str2) {
        m.a().b(str, str2);
    }

    public static boolean g(String str) {
        return m.a().i(str);
    }

    public static void a(com.ironsource.b.f.f fVar) {
        m.a().a(fVar);
    }

    public static void a(boolean z) {
        m.a().a(z);
    }
}
