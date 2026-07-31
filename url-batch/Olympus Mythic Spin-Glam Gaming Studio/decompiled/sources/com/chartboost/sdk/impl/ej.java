package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ej {
    public final String a;
    public final m4 b;
    public final boolean c;

    public ej(String url, m4 clickPreference, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        this.a = url;
        this.b = clickPreference;
        this.c = z;
    }

    public final ej a(String url, m4 clickPreference, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        return new ej(url, clickPreference, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        return Intrinsics.areEqual(this.a, ejVar.a) && this.b == ejVar.b && this.c == ejVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "UrlArgs(url=" + this.a + ", clickPreference=" + this.b + ", userGesture=" + this.c + ")";
    }

    public static /* synthetic */ ej a(ej ejVar, String str, m4 m4Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ejVar.a;
        }
        if ((i & 2) != 0) {
            m4Var = ejVar.b;
        }
        if ((i & 4) != 0) {
            z = ejVar.c;
        }
        return ejVar.a(str, m4Var, z);
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final m4 a() {
        return this.b;
    }
}
