package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkp extends hkq {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public hkp(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.hkq
    public final int a() {
        return this.d;
    }

    @Override // defpackage.hkq
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.hkq
    public final String c() {
        String str = this.e;
        if (str == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.hkq
    public final String d() {
        return this.c;
    }

    @Override // defpackage.hkq
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof hkp) {
            hkp hkpVar = (hkp) obj;
            if (this.c.equals(hkpVar.c) && this.d == hkpVar.d) {
                String str = this.b;
                String str2 = hkpVar.b;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (0; i < str.length(); i + 1) {
                            char charAt = str.charAt(i);
                            char charAt2 = str2.charAt(i);
                            i = (charAt == charAt2 || ((charAt & 65534) == 46 && (charAt ^ charAt2) == 1)) ? i + 1 : 0;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = hashCode;
        return hashCode;
    }
}
