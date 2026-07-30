package com.baidu.mshield.x6.e;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f8535a;

    public d(Context context) {
        this.f8535a = context;
    }

    public void a() {
        try {
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8535a);
            String a8 = com.baidu.mshield.x6.c.a.a(this.f8535a);
            String b8 = com.baidu.mshield.x6.c.a.b(this.f8535a);
            String O = bVar.O();
            String N = bVar.N();
            if (!TextUtils.isEmpty(O)) {
                O = com.baidu.mshield.b.f.e.a(O);
                bVar.o(O);
            }
            if (!TextUtils.isEmpty(N)) {
                N = com.baidu.mshield.b.f.e.a(N);
                bVar.n(N);
            }
            if (TextUtils.isEmpty(a8)) {
                if (TextUtils.isEmpty(b8)) {
                    if (TextUtils.isEmpty(O)) {
                        return;
                    }
                    bVar.e(true);
                    bVar.o("");
                    bVar.n("");
                    return;
                }
                if (N.equals(com.baidu.mshield.b.f.e.a(b8))) {
                    return;
                }
                bVar.e(true);
                bVar.o("");
                bVar.n(com.baidu.mshield.b.f.e.a(b8));
                return;
            }
            if (TextUtils.isEmpty(b8)) {
                if (O.equals(com.baidu.mshield.b.f.e.a(a8))) {
                    return;
                }
                bVar.e(true);
                bVar.o(com.baidu.mshield.b.f.e.a(a8));
                bVar.n("");
                return;
            }
            if (O.equals(com.baidu.mshield.b.f.e.a(a8)) && N.equals(com.baidu.mshield.b.f.e.a(b8))) {
                return;
            }
            bVar.e(true);
            bVar.o(com.baidu.mshield.b.f.e.a(a8));
            bVar.n(com.baidu.mshield.b.f.e.a(b8));
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }
}
