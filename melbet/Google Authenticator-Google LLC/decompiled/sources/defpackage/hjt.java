package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hjt {
    private static final gyv d = gyv.k(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff").d();
    private static final gyv e = new gyq(new gyt(new gyt(new gym(0, 31), new gyn(127)), gyv.k(" @,:<>"))).l();
    private static final gyv f = new gyq(new gyt(new gyt(new gym(0, 31), new gyn(127)), gyv.k(" @,:<>+%"))).l();
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ee, code lost:
    
        if (r5.f(r10) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hjt(String str) {
        int indexOf;
        int lastIndexOf = str.lastIndexOf(64);
        boolean z = true;
        if (lastIndexOf <= 0 || lastIndexOf == str.length() - 1) {
            this.a = null;
            this.b = null;
        } else {
            this.a = str.substring(0, lastIndexOf);
            this.b = str.substring(lastIndexOf + 1);
        }
        String str2 = this.a;
        String str3 = this.b;
        if (str2 != null && str3 != null && str2.length() != 0 && str3.length() != 0) {
            gyv gyvVar = d;
            if (gyvVar.h(str3) < 0 && str3.length() >= 4 && (indexOf = str3.indexOf(46)) != -1 && !str3.contains("..") && str3.charAt(0) != '.') {
                int indexOf2 = str3.indexOf(".", indexOf + 1);
                if ((str3.charAt(str3.length() - 1) != '.' || indexOf2 != -1) && f.f(str3)) {
                    gyv gyvVar2 = gyj.a;
                    if (gyvVar2.f(str3)) {
                        if (str2.startsWith("\"")) {
                            int length = str2.length() - 1;
                            if (length > 0 && str2.endsWith("\"")) {
                                int i = 1;
                                while (i < length) {
                                    char charAt = str2.charAt(i);
                                    if (charAt != '\"' && charAt != 127 && ((charAt >= ' ' || gyvVar.c(charAt)) && charAt < 128 && (charAt != '\\' || (i = i + 1) < length))) {
                                        i++;
                                    }
                                }
                            }
                        } else if (gyvVar.h(str2) < 0) {
                            if (!str2.contains("..")) {
                                if (e.f(str2)) {
                                }
                            }
                        }
                        this.c = z;
                    }
                }
            }
        }
        z = false;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hjt) {
            hjt hjtVar = (hjt) obj;
            if (Objects.equals(this.a, hjtVar.a) && Objects.equals(this.b, hjtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a + "@" + this.b;
    }
}
