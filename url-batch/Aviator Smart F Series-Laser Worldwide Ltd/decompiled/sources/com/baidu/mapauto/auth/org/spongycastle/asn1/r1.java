package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class r1 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public i f7831a;

    /* renamed from: b, reason: collision with root package name */
    public r f7832b = a();

    public r1(byte[] bArr) {
        this.f7831a = new i(bArr, 0);
    }

    public final r a() {
        try {
            return this.f7831a.a();
        } catch (IOException e8) {
            throw new q("malformed DER construction: " + e8, e8);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f7832b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        r rVar = this.f7832b;
        this.f7832b = a();
        return rVar;
    }
}
