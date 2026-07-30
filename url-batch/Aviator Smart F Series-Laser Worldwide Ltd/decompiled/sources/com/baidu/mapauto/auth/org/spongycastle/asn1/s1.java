package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class s1 extends s {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7835b;

    public s1(byte[] bArr) {
        this.f7835b = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        byte[] bArr = this.f7835b;
        if (bArr != null) {
            pVar.a(bArr, 48);
        } else {
            super.h().a(pVar);
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        byte[] bArr = this.f7835b;
        return bArr != null ? u1.a(bArr.length) + 1 + this.f7835b.length : super.h().e();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.s, com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        byte[] bArr = this.f7835b;
        if (bArr != null) {
            r1 r1Var = new r1(bArr);
            while (r1Var.hasMoreElements()) {
                this.f7833a.addElement(r1Var.nextElement());
            }
            this.f7835b = null;
        }
        return super.g();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.s, com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        byte[] bArr = this.f7835b;
        if (bArr != null) {
            r1 r1Var = new r1(bArr);
            while (r1Var.hasMoreElements()) {
                this.f7833a.addElement(r1Var.nextElement());
            }
            this.f7835b = null;
        }
        return super.h();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.s
    public final synchronized Enumeration i() {
        byte[] bArr = this.f7835b;
        if (bArr == null) {
            return this.f7833a.elements();
        }
        return new r1(bArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.s
    public final synchronized int size() {
        try {
            byte[] bArr = this.f7835b;
            if (bArr != null) {
                r1 r1Var = new r1(bArr);
                while (r1Var.hasMoreElements()) {
                    this.f7833a.addElement(r1Var.nextElement());
                }
                this.f7835b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7833a.size();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.s
    public final synchronized d a(int i8) {
        try {
            byte[] bArr = this.f7835b;
            if (bArr != null) {
                r1 r1Var = new r1(bArr);
                while (r1Var.hasMoreElements()) {
                    this.f7833a.addElement(r1Var.nextElement());
                }
                this.f7835b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.a(i8);
    }
}
