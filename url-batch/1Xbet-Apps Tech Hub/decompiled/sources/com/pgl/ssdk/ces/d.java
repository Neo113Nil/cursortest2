package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.E;
import com.pgl.ssdk.F;

/* compiled from: ReportNowRunnable.java */
/* loaded from: classes3.dex */
public class d implements Runnable {
    private Context a;
    private String b;

    public d(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bArr = (byte[]) a.meta(222, this.a, this.b);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i = F.a;
            if (TextUtils.isEmpty(i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r" : "https://ssdk-sg.pangle.io/ssdk/v2/r")) {
                return;
            }
            new E(this.a, null).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
