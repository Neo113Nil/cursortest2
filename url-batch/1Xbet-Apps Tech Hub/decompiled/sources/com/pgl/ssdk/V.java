package com.pgl.ssdk;

import android.content.Context;

/* compiled from: GetSecTokenReq.java */
/* loaded from: classes3.dex */
public class V extends G {
    private Context n;

    public V(Context context, String str) {
        super(context, null);
        this.n = context;
        this.b = F.b() + b();
    }

    @Override // com.pgl.ssdk.G
    public boolean a(int i, byte[] bArr) {
        Object a;
        try {
            a = S.a(bArr);
        } catch (Throwable unused) {
        }
        if ((a instanceof Integer) && ((Integer) a).intValue() == 0) {
            S.a = 200;
            return true;
        }
        if (a instanceof String) {
            S.c = (String) a;
            S.a = 200;
            return true;
        }
        return false;
    }

    public String b() {
        return "?os=android&app_id=" + S.b + "&did=" + com.pgl.ssdk.ces.c.e() + "&app_ver=" + x.c(this.n) + "&platform=android&ver=6.1.0.0.overseas-rc.2&mode=1";
    }
}
