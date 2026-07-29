package b.a.c;

import b.y;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: StatusLine.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final y f1875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1877c;

    public k(y yVar, int i, String str) {
        this.f1875a = yVar;
        this.f1876b = i;
        this.f1877c = str;
    }

    public static k a(String str) throws IOException {
        y yVar;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                yVar = y.HTTP_1_0;
            } else if (charAt == 1) {
                yVar = y.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            yVar = y.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            String str2 = "";
            if (str.length() > i2) {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i + 4);
            }
            return new k(yVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1875a == y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f1876b);
        if (this.f1877c != null) {
            sb.append(' ');
            sb.append(this.f1877c);
        }
        return sb.toString();
    }
}
