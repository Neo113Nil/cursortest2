package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ip {
    public static final ip e = new ip(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ip(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static ip a(ip ipVar, ip ipVar2) {
        return c(Math.max(ipVar.a, ipVar2.a), Math.max(ipVar.b, ipVar2.b), Math.max(ipVar.c, ipVar2.c), Math.max(ipVar.d, ipVar2.d));
    }

    public static ip b(ip ipVar, ip ipVar2) {
        return c(Math.min(ipVar.a, ipVar2.a), Math.min(ipVar.b, ipVar2.b), Math.min(ipVar.c, ipVar2.c), Math.min(ipVar.d, ipVar2.d));
    }

    public static ip c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new ip(i, i2, i3, i4);
    }

    public static ip d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return u6.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ip.class != obj.getClass()) {
            return false;
        }
        ip ipVar = (ip) obj;
        return this.d == ipVar.d && this.a == ipVar.a && this.c == ipVar.c && this.b == ipVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
