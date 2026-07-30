package com.baidu.mshield.x0.h;

import android.content.Context;
import com.baidu.mshield.x0.d.d;
import com.baidu.mshield.x6.EngineImpl;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f8469a;

    /* renamed from: com.baidu.mshield.x0.h.a$a, reason: collision with other inner class name */
    public class C0089a extends com.baidu.mshield.x0.d.h.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8470b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f8471c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f8472d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f8473e;

        public C0089a(a aVar, int i8, long j8, Context context, int i9) {
            this.f8470b = i8;
            this.f8471c = j8;
            this.f8472d = context;
            this.f8473e = i9;
        }

        @Override // com.baidu.mshield.x0.d.h.b
        public void b() {
            try {
                if (this.f8470b != 1) {
                    EngineImpl.getInstance(this.f8472d).uccs(this.f8473e, this.f8470b);
                    return;
                }
                synchronized (a.class) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (a.f8469a == 0 || currentTimeMillis - a.f8469a >= this.f8471c) {
                            long unused = a.f8469a = currentTimeMillis;
                            EngineImpl.getInstance(this.f8472d).uccs(this.f8473e, this.f8470b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                d.a(th2);
            }
        }
    }

    public void a(Context context, int i8, int i9, long j8) {
        com.baidu.mshield.x0.d.h.d.b().a(new C0089a(this, i9, j8, context, i8));
    }
}
