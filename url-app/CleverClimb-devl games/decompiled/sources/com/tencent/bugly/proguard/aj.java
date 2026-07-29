package com.tencent.bugly.proguard;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class aj extends k implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f8706d;

    /* renamed from: a, reason: collision with root package name */
    private byte f8707a;

    /* renamed from: b, reason: collision with root package name */
    private String f8708b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f8709c;

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
    }

    public aj() {
        this.f8707a = (byte) 0;
        this.f8708b = "";
        this.f8709c = null;
    }

    public aj(byte b2, String str, byte[] bArr) {
        this.f8707a = (byte) 0;
        this.f8708b = "";
        this.f8709c = null;
        this.f8707a = b2;
        this.f8708b = str;
        this.f8709c = bArr;
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8707a, 0);
        jVar.a(this.f8708b, 1);
        if (this.f8709c != null) {
            jVar.a(this.f8709c, 2);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8707a = iVar.a(this.f8707a, 0, true);
        this.f8708b = iVar.b(1, true);
        if (f8706d == null) {
            f8706d = new byte[]{0};
        }
        byte[] bArr = f8706d;
        this.f8709c = iVar.c(2, false);
    }
}
