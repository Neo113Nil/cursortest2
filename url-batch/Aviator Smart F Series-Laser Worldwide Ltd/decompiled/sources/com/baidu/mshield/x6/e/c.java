package com.baidu.mshield.x6.e;

import android.content.Context;
import com.baidu.mshield.x6.f.l;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f8531a;

    /* renamed from: b, reason: collision with root package name */
    public g f8532b;

    /* renamed from: c, reason: collision with root package name */
    public com.baidu.mshield.x6.b.b f8533c;

    /* renamed from: d, reason: collision with root package name */
    public int f8534d;

    public c(Context context, int i8) {
        this.f8531a = context;
        this.f8534d = i8;
        this.f8532b = new g(context, i8);
        this.f8533c = new com.baidu.mshield.x6.b.b(this.f8531a);
    }

    public final long a() {
        int i8;
        long j8 = 300000;
        try {
            i8 = h.f8548d;
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            if ((i8 < 3 || i8 >= 10) && i8 >= 10) {
                j8 = -1;
            }
            h.f8548d = i8 + 1;
            return j8;
        }
        j8 = 5000;
        h.f8548d = i8 + 1;
        return j8;
    }

    public void b() {
        JSONObject a8;
        try {
            com.baidu.mshield.b.c.a.a("report static alive for start");
            JSONObject a9 = this.f8532b.a();
            if (a9 != null) {
                a8 = com.baidu.mshield.x6.f.f.a(this.f8531a, a9, com.baidu.mshield.x6.f.g.f8563c, true);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("11111", "-1");
                a8 = com.baidu.mshield.x6.f.f.a(this.f8531a, jSONObject, com.baidu.mshield.x6.f.g.f8563c, true);
            }
            com.baidu.mshield.b.c.a.a("sendJson:" + a8);
        } finally {
            try {
            } finally {
            }
        }
        if (!com.baidu.mshield.b.a.d.b(this.f8531a)) {
            h.f8547c = false;
            return;
        }
        int a10 = l.a(this.f8531a, a8.toString());
        com.baidu.mshield.b.c.a.c("result: " + a10);
        if (a10 == 0) {
            this.f8533c.s(com.baidu.mshield.x6.f.f.c());
            this.f8533c.b(true);
            this.f8533c.e(false);
        } else {
            long a11 = a();
            if (com.baidu.mshield.b.a.d.b(this.f8531a) && a11 > 0) {
                f.b(this.f8531a).a(a11);
            }
        }
    }
}
