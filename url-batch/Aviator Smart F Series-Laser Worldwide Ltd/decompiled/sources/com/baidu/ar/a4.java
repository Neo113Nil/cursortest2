package com.baidu.ar;

import com.baidu.ar.ihttp.HttpException;

/* loaded from: classes.dex */
public class a4 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public c6 f1629a;

    /* renamed from: b, reason: collision with root package name */
    public HttpException f1630b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1631c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f1632d = false;

    public a4(HttpException httpException, c6 c6Var) {
        this.f1630b = httpException;
        this.f1629a = c6Var;
    }

    @Override // com.baidu.ar.b6
    public l5 a() {
        return null;
    }

    @Override // com.baidu.ar.b6
    public void cancel() {
        if (this.f1632d) {
            return;
        }
        synchronized (this.f1631c) {
            this.f1632d = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f1631c) {
            try {
                if (this.f1632d) {
                    return;
                }
                c6 c6Var = this.f1629a;
                if (c6Var != null) {
                    c6Var.a(this.f1630b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
