package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class fh {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Mediation e;

    public fh(String str, String location, int i, String adTypeName, Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        this.a = str;
        this.b = location;
        this.c = i;
        this.d = adTypeName;
        this.e = mediation;
    }

    public final String a() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final Mediation d() {
        return this.e;
    }
}
