package com.tapjoy.internal;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class iv implements Serializable, Comparable {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f8417a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final iv f8418b = new iv((byte[]) new byte[0].clone());

    /* renamed from: c, reason: collision with root package name */
    final byte[] f8419c;

    /* renamed from: d, reason: collision with root package name */
    transient int f8420d;
    transient String e;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        iv ivVar = (iv) obj;
        int c2 = c();
        int c3 = ivVar.c();
        int min = Math.min(c2, c3);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = ivVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (c2 == c3) {
            return 0;
        }
        return c2 < c3 ? -1 : 1;
    }

    public iv(byte[] bArr) {
        this.f8419c = bArr;
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f8419c, jf.f8441a);
        this.e = str2;
        return str2;
    }

    public String b() {
        char[] cArr = new char[this.f8419c.length * 2];
        int i = 0;
        for (byte b2 : this.f8419c) {
            int i2 = i + 1;
            cArr[i] = f8417a[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f8417a[b2 & com.umeng.commonsdk.proguard.ao.m];
        }
        return new String(cArr);
    }

    public iv a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i2 > this.f8419c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f8419c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == this.f8419c.length) {
            return this;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f8419c, i, bArr, 0, i3);
        return new iv(bArr);
    }

    public byte a(int i) {
        return this.f8419c[i];
    }

    public int c() {
        return this.f8419c.length;
    }

    public byte[] d() {
        return (byte[]) this.f8419c.clone();
    }

    void a(is isVar) {
        isVar.a(this.f8419c, 0, this.f8419c.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f8419c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && jf.a(this.f8419c, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iv) {
            iv ivVar = (iv) obj;
            if (ivVar.c() == this.f8419c.length && ivVar.a(0, this.f8419c, 0, this.f8419c.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f8420d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f8419c);
        this.f8420d = hashCode;
        return hashCode;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f8419c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int length = a2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a2.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = a2.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i == -1) {
            if (this.f8419c.length <= 64) {
                return "[hex=" + b() + "]";
            }
            return "[size=" + this.f8419c.length + " hex=" + a(0, 64).b() + "…]";
        }
        String replace = a2.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < a2.length()) {
            sb = new StringBuilder("[size=");
            sb.append(this.f8419c.length);
            sb.append(" text=");
            sb.append(replace);
            str = "…]";
        } else {
            sb = new StringBuilder("[text=");
            sb.append(replace);
            str = "]";
        }
        sb.append(str);
        return sb.toString();
    }
}
