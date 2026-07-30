package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.af;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15228a = 307;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15229b = 308;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15230c = 100;

    /* renamed from: d, reason: collision with root package name */
    public final ab f15231d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15232e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15233f;

    public k(ab abVar, int i, String str) {
        this.f15231d = abVar;
        this.f15232e = i;
        this.f15233f = str;
    }

    private static k a(af afVar) {
        return new k(afVar.b(), afVar.c(), afVar.d());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15231d == ab.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f15232e);
        if (this.f15233f != null) {
            sb.append(' ');
            sb.append(this.f15233f);
        }
        return sb.toString();
    }

    public static k a(String str) {
        ab abVar;
        int i;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                abVar = ab.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                abVar = ab.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            abVar = ab.HTTP_1_0;
            i = 4;
        }
        int i4 = i + 3;
        if (str.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i4));
            if (str.length() <= i4) {
                str2 = "";
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new k(abVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }
}
