package com.baidu.mapauto.auth.org.spongycastle.asn1.x509;

import com.baidu.mapauto.auth.org.spongycastle.asn1.d;
import com.baidu.mapauto.auth.org.spongycastle.asn1.e;
import com.baidu.mapauto.auth.org.spongycastle.asn1.l;
import com.baidu.mapauto.auth.org.spongycastle.asn1.m;
import com.baidu.mapauto.auth.org.spongycastle.asn1.r;
import com.baidu.mapauto.auth.org.spongycastle.asn1.s;
import com.baidu.mapauto.auth.org.spongycastle.asn1.z0;

/* loaded from: classes2.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public m f7852a;

    /* renamed from: b, reason: collision with root package name */
    public d f7853b;

    public a(s sVar) {
        if (sVar.size() < 1 || sVar.size() > 2) {
            StringBuilder a8 = com.baidu.mapauto.auth.b.a("Bad sequence size: ");
            a8.append(sVar.size());
            throw new IllegalArgumentException(a8.toString());
        }
        this.f7852a = m.a(sVar.a(0));
        this.f7853b = sVar.size() == 2 ? sVar.a(1) : null;
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(s.a(obj));
        }
        return null;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.l, com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        e eVar = new e();
        eVar.f7778a.addElement(this.f7852a);
        d dVar = this.f7853b;
        if (dVar != null) {
            eVar.f7778a.addElement(dVar);
        }
        return new z0(eVar);
    }
}
