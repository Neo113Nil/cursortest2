package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class fk {
    public final String a;
    public final String b;
    public final String c;

    public fk(String url, String vendor, String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = url;
        this.b = vendor;
        this.c = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk)) {
            return false;
        }
        fk fkVar = (fk) obj;
        return Intrinsics.areEqual(this.a, fkVar.a) && Intrinsics.areEqual(this.b, fkVar.b) && Intrinsics.areEqual(this.c, fkVar.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "VerificationModel(url=" + this.a + ", vendor=" + this.b + ", params=" + this.c + ")";
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }
}
