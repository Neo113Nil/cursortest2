package com.baidu.mapauto.auth.org.spongycastle.asn1.x509;

import com.baidu.mapauto.auth.org.spongycastle.asn1.e;
import com.baidu.mapauto.auth.org.spongycastle.asn1.l;
import com.baidu.mapauto.auth.org.spongycastle.asn1.m0;
import com.baidu.mapauto.auth.org.spongycastle.asn1.r;
import com.baidu.mapauto.auth.org.spongycastle.asn1.s;
import com.baidu.mapauto.auth.org.spongycastle.asn1.z0;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public a f7854a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f7855b;

    @Deprecated
    public b(s sVar) {
        if (sVar.size() != 2) {
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("Bad sequence size: ");
            a8.append(sVar.size());
            throw new IllegalArgumentException(a8.toString());
        }
        Enumeration i8 = sVar.i();
        this.f7854a = a.a(i8.nextElement());
        this.f7855b = m0.a(i8.nextElement());
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.l, com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        e eVar = new e();
        eVar.f7778a.addElement(this.f7854a);
        eVar.f7778a.addElement(this.f7855b);
        return new z0(eVar);
    }
}
