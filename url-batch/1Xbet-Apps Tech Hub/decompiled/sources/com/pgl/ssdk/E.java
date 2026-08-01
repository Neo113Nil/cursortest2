package com.pgl.ssdk;

import android.content.Context;
import android.os.LocaleList;

/* compiled from: ReportDeviceInfo.java */
/* loaded from: classes3.dex */
public class E extends G {
    private Context n;

    public E(Context context, String str) {
        super(context, null);
        this.n = context;
        this.b = F.a() + b();
    }

    @Override // com.pgl.ssdk.G
    public boolean a(int i, byte[] bArr) {
        if (i != 200 || bArr == null) {
            return true;
        }
        try {
            if (bArr.length <= 0) {
                return true;
            }
            ((Integer) com.pgl.ssdk.ces.a.meta(223, null, bArr)).intValue();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public String b() {
        return ((("?os=0&ver=6.1.0.0.overseas-rc.2&mode=1&app_ver=" + String.valueOf(x.c(this.n))) + "&region=" + LocaleList.getDefault().get(0).getLanguage()) + "&did=" + com.pgl.ssdk.ces.c.e()) + "&aid=" + com.pgl.ssdk.ces.c.d();
    }
}
