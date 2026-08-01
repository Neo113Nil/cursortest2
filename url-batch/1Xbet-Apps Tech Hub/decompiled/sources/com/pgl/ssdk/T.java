package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: TokenReqRunnable.java */
/* loaded from: classes3.dex */
public class T implements Runnable {
    private final U a;
    private final Context b;

    public T(Context context, U u) {
        this.a = u;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        int i = F.a;
        String str = i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token" : "https://ssdk-sg.pangle.io/ssdk/sd/token";
        try {
            bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.b, null);
        } catch (Throwable unused) {
            S.a = 501;
        }
        if (bArr == null || bArr.length <= 0) {
            S.a = 501;
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new V(this.b, null).a(1, 2, bArr);
        U u = this.a;
        if (u != null) {
            u.a(S.a());
        }
    }
}
