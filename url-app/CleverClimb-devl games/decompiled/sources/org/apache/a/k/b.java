package org.apache.a.k;

import java.io.Serializable;

/* compiled from: CharArrayBuffer.java */
/* loaded from: classes2.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private char[] f9990a;

    /* renamed from: b, reason: collision with root package name */
    private int f9991b;

    public b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.f9990a = new char[i];
    }

    private void d(int i) {
        char[] cArr = new char[Math.max(this.f9990a.length << 1, i)];
        System.arraycopy(this.f9990a, 0, cArr, 0, this.f9991b);
        this.f9990a = cArr;
    }

    public void a(char[] cArr, int i, int i2) {
        int i3;
        if (cArr == null) {
            return;
        }
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("off: ");
            stringBuffer.append(i);
            stringBuffer.append(" len: ");
            stringBuffer.append(i2);
            stringBuffer.append(" b.length: ");
            stringBuffer.append(cArr.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f9991b + i2;
        if (i4 > this.f9990a.length) {
            d(i4);
        }
        System.arraycopy(cArr, i, this.f9990a, this.f9991b, i2);
        this.f9991b = i4;
    }

    public void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f9991b + length;
        if (i > this.f9990a.length) {
            d(i);
        }
        str.getChars(0, length, this.f9990a, this.f9991b);
        this.f9991b = i;
    }

    public void a(b bVar, int i, int i2) {
        if (bVar == null) {
            return;
        }
        a(bVar.f9990a, i, i2);
    }

    public void a(char c2) {
        int i = this.f9991b + 1;
        if (i > this.f9990a.length) {
            d(i);
        }
        this.f9990a[this.f9991b] = c2;
        this.f9991b = i;
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null) {
            return;
        }
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("off: ");
            stringBuffer.append(i);
            stringBuffer.append(" len: ");
            stringBuffer.append(i2);
            stringBuffer.append(" b.length: ");
            stringBuffer.append(bArr.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f9991b;
        int i5 = i2 + i4;
        if (i5 > this.f9990a.length) {
            d(i5);
        }
        while (i4 < i5) {
            this.f9990a[i4] = (char) (bArr[i] & 255);
            i++;
            i4++;
        }
        this.f9991b = i5;
    }

    public void a(a aVar, int i, int i2) {
        if (aVar == null) {
            return;
        }
        a(aVar.e(), i, i2);
    }

    public void a(Object obj) {
        a(String.valueOf(obj));
    }

    public void a() {
        this.f9991b = 0;
    }

    public char a(int i) {
        return this.f9990a[i];
    }

    public char[] b() {
        return this.f9990a;
    }

    public int c() {
        return this.f9991b;
    }

    public void b(int i) {
        if (i > 0 && i > this.f9990a.length - this.f9991b) {
            d(this.f9991b + i);
        }
    }

    public boolean d() {
        return this.f9991b == 0;
    }

    public int a(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.f9991b) {
            i3 = this.f9991b;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.f9990a[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int c(int i) {
        return a(i, 0, this.f9991b);
    }

    public String a(int i, int i2) {
        return new String(this.f9990a, i, i2 - i);
    }

    public String b(int i, int i2) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Negative beginIndex: ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        if (i2 > this.f9991b) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("endIndex: ");
            stringBuffer2.append(i2);
            stringBuffer2.append(" > length: ");
            stringBuffer2.append(this.f9991b);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
        if (i > i2) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("beginIndex: ");
            stringBuffer3.append(i);
            stringBuffer3.append(" > endIndex: ");
            stringBuffer3.append(i2);
            throw new IndexOutOfBoundsException(stringBuffer3.toString());
        }
        while (i < i2 && org.apache.a.j.d.a(this.f9990a[i])) {
            i++;
        }
        while (i2 > i && org.apache.a.j.d.a(this.f9990a[i2 - 1])) {
            i2--;
        }
        return new String(this.f9990a, i, i2 - i);
    }

    public String toString() {
        return new String(this.f9990a, 0, this.f9991b);
    }
}
