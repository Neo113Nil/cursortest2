package com.umeng.commonsdk.proguard;

/* compiled from: ShortStack.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private short[] f9063a;

    /* renamed from: b, reason: collision with root package name */
    private int f9064b = -1;

    public g(int i) {
        this.f9063a = new short[i];
    }

    public short a() {
        short[] sArr = this.f9063a;
        int i = this.f9064b;
        this.f9064b = i - 1;
        return sArr[i];
    }

    public void a(short s) {
        if (this.f9063a.length == this.f9064b + 1) {
            d();
        }
        short[] sArr = this.f9063a;
        int i = this.f9064b + 1;
        this.f9064b = i;
        sArr[i] = s;
    }

    private void d() {
        short[] sArr = new short[this.f9063a.length * 2];
        System.arraycopy(this.f9063a, 0, sArr, 0, this.f9063a.length);
        this.f9063a = sArr;
    }

    public short b() {
        return this.f9063a[this.f9064b];
    }

    public void c() {
        this.f9064b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i = 0; i < this.f9063a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.f9064b) {
                sb.append(">>");
            }
            sb.append((int) this.f9063a[i]);
            if (i == this.f9064b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }
}
