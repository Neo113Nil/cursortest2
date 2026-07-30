package com.baidu.mapauto.auth.org.spongycastle.asn1.pkcs;

import com.baidu.mapauto.auth.b;
import com.baidu.mapauto.auth.org.spongycastle.asn1.e;
import com.baidu.mapauto.auth.org.spongycastle.asn1.j;
import com.baidu.mapauto.auth.org.spongycastle.asn1.l;
import com.baidu.mapauto.auth.org.spongycastle.asn1.r;
import com.baidu.mapauto.auth.org.spongycastle.asn1.s;
import com.baidu.mapauto.auth.org.spongycastle.asn1.z0;
import java.math.BigInteger;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f7822a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f7823b;

    public a(s sVar) {
        if (sVar.size() != 2) {
            StringBuilder a8 = b.a("Bad sequence size: ");
            a8.append(sVar.size());
            throw new IllegalArgumentException(a8.toString());
        }
        Enumeration i8 = sVar.i();
        this.f7822a = j.a(i8.nextElement()).i();
        this.f7823b = j.a(i8.nextElement()).i();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.l, com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        e eVar = new e();
        eVar.f7778a.addElement(new j(this.f7822a));
        eVar.f7778a.addElement(new j(this.f7823b));
        return new z0(eVar);
    }
}
