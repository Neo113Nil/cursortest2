package com.baidu.mshield.x6.e;

import android.content.Context;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static volatile f f8540a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8541b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f8542c = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                fVar.a(fVar.f8541b);
            } catch (Throwable th) {
                com.baidu.mshield.x6.f.f.b(th);
            }
        }
    }

    public f(Context context) {
        this.f8541b = context;
    }

    public static f b(Context context) {
        if (f8540a == null) {
            synchronized (f.class) {
                try {
                    if (f8540a == null) {
                        f8540a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f8540a;
    }

    public synchronized void a(long j8) {
        try {
            com.baidu.mshield.b.c.a.a("startCheckDelayTime=" + j8);
            com.baidu.mshield.x6.f.c.c().postDelayed(this.f8542c, j8);
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }

    public final void a(Context context) {
        try {
            if (com.baidu.mshield.b.a.d.b(context)) {
                com.baidu.mshield.b.c.a.a(" doDelayWork ");
                com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(context);
                if (!com.baidu.mshield.x6.f.f.c().equals(bVar.c())) {
                    h.a(context).a(1, true);
                }
                if (bVar.n() || h.f8546b) {
                    return;
                }
                h.a(context).a(4);
            }
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }
}
