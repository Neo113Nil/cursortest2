package com.baidu.mshield.b.d;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public b f8315a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8316b;

    public a(Context context, Handler handler) {
        try {
            this.f8316b = context;
            this.f8315a = new b(context, handler);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
    }

    public String a() {
        return this.f8315a.a();
    }

    public String a(String str, byte[] bArr) {
        if (str != null) {
            return !com.baidu.mshield.b.e.a.d(this.f8316b) ? "" : this.f8315a.a(str, bArr);
        }
        throw new IllegalArgumentException("postToServerForm request null");
    }
}
