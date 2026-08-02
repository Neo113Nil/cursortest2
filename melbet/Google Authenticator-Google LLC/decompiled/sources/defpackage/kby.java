package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kby {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public kby() {
        this.b = "";
    }

    public final kbz a() {
        hoq.I(this.a != null, "Missing required scheme.");
        if (this.f == null) {
            hoq.I(this.g == null, "Cannot set port without host.");
            hoq.I(this.e == null, "Cannot set userInfo without host.");
        }
        return new kbz(this);
    }

    public final void b(String str) {
        if (str != null) {
            str = kbz.b(str.toLowerCase(Locale.ROOT), kbz.e);
        }
        this.f = str;
    }

    public final void c() {
        this.g = null;
    }

    public final void d(String str) {
        String str2;
        int indexOf;
        if (str.startsWith("[") && str.endsWith("]") && (indexOf = str.indexOf(37)) > 0) {
            kbz.e(str.substring(indexOf, str.length() - 1), "scope", kbz.d, null);
        }
        int i = hsa.a;
        str.getClass();
        int i2 = 4;
        if (str.startsWith("[") && str.endsWith("]")) {
            str2 = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            str2 = str;
        }
        byte[] c = hsa.c(str2, null);
        if (((c == null || c.length != i2) ? null : hsa.a(c, null)) == null) {
            kbz.e(str, "host", kbz.e, null);
        }
        this.f = str;
    }

    public final void e(String str) {
        if (!str.isEmpty()) {
            if (kbz.b.get(str.charAt(0))) {
                for (int i = 0; i < str.length(); i++) {
                    if (!kbz.c.get(str.charAt(i))) {
                        throw new IllegalArgumentException(a.Y(i, "Invalid character in scheme at index "));
                    }
                }
                this.a = str;
                return;
            }
        }
        throw new IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final void f() {
        this.e = kbz.b(null, kbz.f);
    }

    public kby(byte[] bArr) {
    }
}
