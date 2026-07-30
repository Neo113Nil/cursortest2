package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class w0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public o1 f7850a;

    public w0(o1 o1Var) {
        this.f7850a = o1Var;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return new v0(this.f7850a.c());
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.o
    public final InputStream b() {
        return this.f7850a;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e8) {
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("IOException converting stream to byte array: ");
            a8.append(e8.getMessage());
            throw new q(a8.toString(), e8);
        }
    }
}
