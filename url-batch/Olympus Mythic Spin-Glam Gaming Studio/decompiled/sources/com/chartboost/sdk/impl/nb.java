package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class nb {
    public final String a;
    public final Boolean b;
    public final String c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb)) {
            return false;
        }
        nb nbVar = (nb) obj;
        return Intrinsics.areEqual(this.a, nbVar.a) && Intrinsics.areEqual(this.b, nbVar.b) && Intrinsics.areEqual(this.c, nbVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "JavaScriptResource(apiFramework=" + this.a + ", browserOptional=" + this.b + ", uri=" + this.c + ")";
    }

    public nb(String str, Boolean bool, String str2) {
        this.a = str;
        this.b = bool;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
