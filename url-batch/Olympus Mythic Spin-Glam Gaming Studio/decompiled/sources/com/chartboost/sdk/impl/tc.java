package com.chartboost.sdk.impl;

import com.chartboost.sdk.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tc {
    public static final a c = new a(null);
    public static boolean d = true;
    public final dh a;
    public final jg b;

    public tc(dh sharedPrefsHelper, jg resourcesLoader) {
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        this.a = sharedPrefsHelper;
        this.b = resourcesLoader;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String a() {
        String a2 = a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
        return a2 == null ? "" : a2;
    }

    public final String a(String str, int i) {
        try {
            String a2 = this.b.a(i);
            if (a2 == null) {
                return null;
            }
            this.a.a(str, a2);
            return a2;
        } catch (Exception e) {
            xb.b("OmidJS resource file exception", e);
            return null;
        }
    }

    public final String a(int i, String str) {
        String a2;
        try {
            if (d) {
                d = false;
                a2 = a(str, i);
            } else {
                String a3 = this.a.a(str);
                if (a3 != null) {
                    return a3;
                }
                a2 = a(str, i);
            }
            return a2;
        } catch (Exception e) {
            xb.b("OmidJS exception", e);
            return null;
        }
    }
}
