package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class y {
    public final int a;
    public final char b;
    public short c;
    public int d;
    public final int e;

    public y(int i, int i2, int i3, int i4) {
        this.e = i;
        this.a = i2;
        this.b = (char) i3;
        this.c = (short) i4;
    }

    public final int a() {
        return this.a + this.b;
    }

    public final int b() {
        int i = this.e;
        if (i == 6 || i == 7) {
            return z.e[this.c];
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y yVar = (y) obj;
            if (this.e == yVar.e && this.a == yVar.a && this.b == yVar.b && this.c == yVar.c && this.d == yVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.e * 37) + this.a) * 37) + this.b) * 37) + this.c;
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.e;
        if (i == 6 || i == 7) {
            int b = b();
            String a = e.a(b);
            if (b == 0) {
                throw null;
            }
            str = a;
        } else {
            str = Integer.toString(this.c);
        }
        switch (i) {
            case 1:
                str2 = "MSG_START";
                break;
            case 2:
                str2 = "MSG_LIMIT";
                break;
            case 3:
                str2 = "SKIP_SYNTAX";
                break;
            case 4:
                str2 = "INSERT_CHAR";
                break;
            case 5:
                str2 = "REPLACE_NUMBER";
                break;
            case 6:
                str2 = "ARG_START";
                break;
            case 7:
                str2 = "ARG_LIMIT";
                break;
            case 8:
                str2 = "ARG_NUMBER";
                break;
            case 9:
                str2 = "ARG_NAME";
                break;
            case 10:
                str2 = "ARG_TYPE";
                break;
            case 11:
                str2 = "ARG_STYLE";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                str2 = "ARG_SELECTOR";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                str2 = "ARG_INT";
                break;
            default:
                str2 = "ARG_DOUBLE";
                break;
        }
        return str2 + "(" + str + ")@" + this.a;
    }
}
