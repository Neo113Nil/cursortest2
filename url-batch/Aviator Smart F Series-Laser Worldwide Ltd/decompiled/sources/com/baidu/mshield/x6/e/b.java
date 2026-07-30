package com.baidu.mshield.x6.e;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.x6.EngineImpl;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Context f8529a;

    /* renamed from: b, reason: collision with root package name */
    public com.baidu.mshield.x6.b.b f8530b;

    public b(Context context) {
        this.f8529a = context;
        this.f8530b = new com.baidu.mshield.x6.b.b(this.f8529a);
    }

    public void a() {
        try {
            String r8 = this.f8530b.r();
            String propertyByType = EngineImpl.getInstance(this.f8529a).getPropertyByType("arid");
            TextUtils.isEmpty("");
            if (TextUtils.isEmpty(propertyByType)) {
                propertyByType = "";
            }
            if (TextUtils.isEmpty(r8)) {
                String a8 = com.baidu.mshield.b.f.e.a("" + propertyByType);
                if (!TextUtils.isEmpty(a8)) {
                    this.f8530b.c(a8);
                }
            } else {
                String a9 = com.baidu.mshield.b.f.e.a("" + propertyByType);
                if (!TextUtils.equals(r8, a9)) {
                    this.f8530b.c(a9);
                    h.a(this.f8529a).a(3, true);
                }
            }
            this.f8530b.c(true);
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }
}
