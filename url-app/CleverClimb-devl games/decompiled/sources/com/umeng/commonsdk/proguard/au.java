package com.umeng.commonsdk.proguard;

/* compiled from: TMemoryInputTransport.java */
/* loaded from: classes2.dex */
public final class au extends av {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f9040a;

    /* renamed from: b, reason: collision with root package name */
    private int f9041b;

    /* renamed from: c, reason: collision with root package name */
    private int f9042c;

    @Override // com.umeng.commonsdk.proguard.av
    public boolean a() {
        return true;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void b() throws aw {
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void c() {
    }

    public au() {
    }

    public au(byte[] bArr) {
        a(bArr);
    }

    public au(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i, int i2) {
        this.f9040a = bArr;
        this.f9041b = i;
        this.f9042c = i + i2;
    }

    public void e() {
        this.f9040a = null;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public int a(byte[] bArr, int i, int i2) throws aw {
        int h = h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f9040a, this.f9041b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void b(byte[] bArr, int i, int i2) throws aw {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.commonsdk.proguard.av
    public byte[] f() {
        return this.f9040a;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public int g() {
        return this.f9041b;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public int h() {
        return this.f9042c - this.f9041b;
    }

    @Override // com.umeng.commonsdk.proguard.av
    public void a(int i) {
        this.f9041b += i;
    }
}
