package com.baidu.ar;

/* loaded from: classes.dex */
public class n3<T> {

    /* renamed from: a, reason: collision with root package name */
    public volatile T f2843a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f2844b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f2845c;

    public n3(String str) {
        this.f2845c = str;
    }

    public T a() {
        return this.f2843a;
    }

    public T b() {
        if (this.f2843a != null) {
            return this.f2843a;
        }
        if (c()) {
            synchronized (this) {
                try {
                    if (this.f2843a == null) {
                        this.f2843a = (T) ab.a(this.f2845c);
                    }
                } finally {
                }
            }
        }
        return this.f2843a;
    }

    public boolean c() {
        if (this.f2844b == 1) {
            return true;
        }
        boolean z7 = false;
        if (this.f2844b == -1) {
            return false;
        }
        try {
            Class.forName(this.f2845c);
            z7 = true;
        } catch (ClassNotFoundException unused) {
        }
        synchronized (this) {
            this.f2844b = z7 ? 1 : -1;
        }
        return z7;
    }

    public void d() {
        if (this.f2843a != null) {
            this.f2843a = null;
        }
    }
}
