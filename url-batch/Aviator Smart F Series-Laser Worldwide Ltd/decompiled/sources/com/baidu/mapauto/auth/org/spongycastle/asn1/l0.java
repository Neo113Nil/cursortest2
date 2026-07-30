package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class l0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f7800a;

    public l0(char[] cArr) {
        this.f7800a = cArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(30);
        pVar.b(this.f7800a.length * 2);
        int i8 = 0;
        while (true) {
            char[] cArr = this.f7800a;
            if (i8 == cArr.length) {
                return;
            }
            char c8 = cArr[i8];
            pVar.a((byte) (c8 >> '\b'));
            pVar.a((byte) c8);
            i8++;
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return (this.f7800a.length * 2) + u1.a(this.f7800a.length * 2) + 1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        char[] cArr = this.f7800a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i8;
            }
            i8 = (i8 * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return new String(this.f7800a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof l0)) {
            return false;
        }
        char[] cArr = this.f7800a;
        char[] cArr2 = ((l0) rVar).f7800a;
        if (cArr != cArr2) {
            if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
                return false;
            }
            for (int i8 = 0; i8 != cArr.length; i8++) {
                if (cArr[i8] != cArr2[i8]) {
                    return false;
                }
            }
        }
        return true;
    }
}
