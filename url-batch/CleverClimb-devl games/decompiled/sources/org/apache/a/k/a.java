package org.apache.a.k;

import java.io.Serializable;

/* compiled from: ByteArrayBuffer.java */
/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f9988a;

    /* renamed from: b, reason: collision with root package name */
    private int f9989b;

    public a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.f9988a = new byte[i];
    }

    private void d(int i) {
        byte[] bArr = new byte[Math.max(this.f9988a.length << 1, i)];
        System.arraycopy(this.f9988a, 0, bArr, 0, this.f9989b);
        this.f9988a = bArr;
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
        int i4 = this.f9989b + i2;
        if (i4 > this.f9988a.length) {
            d(i4);
        }
        System.arraycopy(bArr, i, this.f9988a, this.f9989b, i2);
        this.f9989b = i4;
    }

    public void a(int i) {
        int i2 = this.f9989b + 1;
        if (i2 > this.f9988a.length) {
            d(i2);
        }
        this.f9988a[this.f9989b] = (byte) i;
        this.f9989b = i2;
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
        int i4 = this.f9989b;
        int i5 = i2 + i4;
        if (i5 > this.f9988a.length) {
            d(i5);
        }
        while (i4 < i5) {
            this.f9988a[i4] = (byte) cArr[i];
            i++;
            i4++;
        }
        this.f9989b = i5;
    }

    public void a(b bVar, int i, int i2) {
        if (bVar == null) {
            return;
        }
        a(bVar.b(), i, i2);
    }

    public void a() {
        this.f9989b = 0;
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f9989b];
        if (this.f9989b > 0) {
            System.arraycopy(this.f9988a, 0, bArr, 0, this.f9989b);
        }
        return bArr;
    }

    public int b(int i) {
        return this.f9988a[i];
    }

    public int c() {
        return this.f9988a.length;
    }

    public int d() {
        return this.f9989b;
    }

    public byte[] e() {
        return this.f9988a;
    }

    public void c(int i) {
        if (i < 0 || i > this.f9988a.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("len: ");
            stringBuffer.append(i);
            stringBuffer.append(" < 0 or > buffer len: ");
            stringBuffer.append(this.f9988a.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        this.f9989b = i;
    }

    public boolean f() {
        return this.f9989b == 0;
    }

    public boolean g() {
        return this.f9989b == this.f9988a.length;
    }
}
