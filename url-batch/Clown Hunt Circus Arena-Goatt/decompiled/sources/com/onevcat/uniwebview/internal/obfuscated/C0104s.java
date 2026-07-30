package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104s {
    public final EnumC0112u a;
    public final String b;
    public final EnumC0089o c;
    public final String d;
    public final Boolean e;
    public final C0108t f;
    public final C0120w g;

    public C0104s(EnumC0112u type, String identifier, EnumC0089o enumC0089o, String str, Boolean bool, C0108t c0108t, C0120w c0120w) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.a = type;
        this.b = identifier;
        this.c = enumC0089o;
        this.d = str;
        this.e = bool;
        this.f = c0108t;
        this.g = c0120w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0104s)) {
            return false;
        }
        C0104s c0104s = (C0104s) obj;
        return this.a == c0104s.a && Intrinsics.areEqual(this.b, c0104s.b) && this.c == c0104s.c && Intrinsics.areEqual(this.d, c0104s.d) && Intrinsics.areEqual(this.e, c0104s.e) && Intrinsics.areEqual(this.f, c0104s.f) && Intrinsics.areEqual(this.g, c0104s.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        EnumC0089o enumC0089o = this.c;
        int hashCode2 = (hashCode + (enumC0089o == null ? 0 : enumC0089o.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C0108t c0108t = this.f;
        int hashCode5 = (hashCode4 + (c0108t == null ? 0 : c0108t.hashCode())) * 31;
        C0120w c0120w = this.g;
        return hashCode5 + (c0120w != null ? c0120w.hashCode() : 0);
    }

    public final String toString() {
        return "Item(type=" + this.a + ", identifier=" + this.b + ", kind=" + this.c + ", title=" + this.d + ", visible=" + this.e + ", style=" + this.f + ", titleInteraction=" + this.g + ')';
    }
}
