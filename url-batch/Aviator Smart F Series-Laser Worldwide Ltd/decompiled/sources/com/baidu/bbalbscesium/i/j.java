package com.baidu.bbalbscesium.i;

/* loaded from: classes.dex */
final class j extends e {
    public j(int i8, int i9) {
        this.f3948a = com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
        this.f3949b = 4;
        this.f3950c = 32;
        this.f3951d = i8;
        this.f3952e = i9;
    }

    @Override // com.baidu.bbalbscesium.i.e
    public b a(byte[] bArr, int i8, int i9) {
        k kVar = new k();
        kVar.a(bArr, i8, i9);
        return b.a(new long[]{kVar.a()});
    }
}
