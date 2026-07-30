package com.baidu.ar.http;

import com.baidu.ar.d6;
import com.baidu.ar.g5;
import com.baidu.ar.h5;
import com.baidu.ar.i5;
import com.baidu.ar.ihttp.IHttpRequest;

/* loaded from: classes.dex */
public class HttpRequestFactory implements d6 {

    /* renamed from: a, reason: collision with root package name */
    public volatile h5 f2423a;

    public h5 getExecutor() {
        if (this.f2423a == null) {
            synchronized (this) {
                try {
                    if (this.f2423a == null) {
                        this.f2423a = new h5(2, 5, 1000, 60L);
                    }
                } finally {
                }
            }
        }
        return this.f2423a;
    }

    @Override // com.baidu.ar.d6
    public IHttpRequest newRequest() {
        i5 i5Var = new i5(this);
        i5Var.setCharset(g5.f2325a);
        i5Var.setConnectionTimeout(2000);
        i5Var.setReadTimeout(30000);
        i5Var.setUseCache(false);
        i5Var.addHeaders(g5.f2327c);
        return i5Var;
    }

    @Override // com.baidu.ar.d6
    public void release() {
        if (this.f2423a != null) {
            this.f2423a.b();
            this.f2423a = null;
        }
    }
}
