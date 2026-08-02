package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420cj extends Wg {
    public C0420cj(C0457e5 c0457e5) {
        super(c0457e5);
        c0457e5.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Object remove;
        for (Map.Entry entry : w5.f6828p.entrySet()) {
            Ok ok = this.f6835a.f7243u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                ok.getClass();
                if (bArr.length != 0) {
                    remove = ok.f6418b.put(str, bArr);
                    Sk sk = ok.f6417a;
                    sk.f6652d.insert(sk.f6649a, sk.f6651c.toByteArray((Rk) sk.f6650b.fromModel(ok.f6418b)));
                }
            }
            remove = ok.f6418b.remove(str);
            Sk sk2 = ok.f6417a;
            sk2.f6652d.insert(sk2.f6649a, sk2.f6651c.toByteArray((Rk) sk2.f6650b.fromModel(ok.f6418b)));
        }
        return true;
    }
}
