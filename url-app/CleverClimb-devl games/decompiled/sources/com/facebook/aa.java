package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;

/* compiled from: RequestProgress.java */
/* loaded from: classes.dex */
class aa {

    /* renamed from: a, reason: collision with root package name */
    private final GraphRequest f4719a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f4720b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4721c = l.h();

    /* renamed from: d, reason: collision with root package name */
    private long f4722d;
    private long e;
    private long f;

    aa(Handler handler, GraphRequest graphRequest) {
        this.f4719a = graphRequest;
        this.f4720b = handler;
    }

    void a(long j) {
        this.f4722d += j;
        if (this.f4722d >= this.e + this.f4721c || this.f4722d >= this.f) {
            a();
        }
    }

    void b(long j) {
        this.f += j;
    }

    void a() {
        if (this.f4722d > this.e) {
            GraphRequest.b g = this.f4719a.g();
            if (this.f <= 0 || !(g instanceof GraphRequest.e)) {
                return;
            }
            final long j = this.f4722d;
            final long j2 = this.f;
            final GraphRequest.e eVar = (GraphRequest.e) g;
            if (this.f4720b == null) {
                eVar.a(j, j2);
            } else {
                this.f4720b.post(new Runnable() { // from class: com.facebook.aa.1
                    @Override // java.lang.Runnable
                    public void run() {
                        eVar.a(j, j2);
                    }
                });
            }
            this.e = this.f4722d;
        }
    }
}
