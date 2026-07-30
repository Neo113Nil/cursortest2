package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jh0 {
    public final String a;
    public as2 b;
    public final StringBuilder c;
    public int d;
    public int e;
    public zr2 f;
    public int g;

    public jh0(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                lh.e("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = as2.m;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }

    public final char a() {
        return this.a.charAt(this.d);
    }

    public final boolean b() {
        return this.d < this.a.length() - this.g;
    }

    public final void c(int i) {
        zr2 zr2Var = this.f;
        if (zr2Var == null || i > zr2Var.b) {
            this.f = zr2.e(i, this.b);
        }
    }

    public final void d(char c) {
        this.c.append(c);
    }
}
