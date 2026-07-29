package org.apache.a.h;

/* compiled from: ParserCursor.java */
/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f9976a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9977b;

    /* renamed from: c, reason: collision with root package name */
    private int f9978c;

    public u(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.f9976a = i;
        this.f9977b = i2;
        this.f9978c = i;
    }

    public int a() {
        return this.f9977b;
    }

    public int b() {
        return this.f9978c;
    }

    public void a(int i) {
        if (i < this.f9976a) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("pos: ");
            stringBuffer.append(i);
            stringBuffer.append(" < lowerBound: ");
            stringBuffer.append(this.f9976a);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        if (i > this.f9977b) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("pos: ");
            stringBuffer2.append(i);
            stringBuffer2.append(" > upperBound: ");
            stringBuffer2.append(this.f9977b);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
        this.f9978c = i;
    }

    public boolean c() {
        return this.f9978c >= this.f9977b;
    }

    public String toString() {
        org.apache.a.k.b bVar = new org.apache.a.k.b(16);
        bVar.a('[');
        bVar.a(Integer.toString(this.f9976a));
        bVar.a('>');
        bVar.a(Integer.toString(this.f9978c));
        bVar.a('>');
        bVar.a(Integer.toString(this.f9977b));
        bVar.a(']');
        return bVar.toString();
    }
}
