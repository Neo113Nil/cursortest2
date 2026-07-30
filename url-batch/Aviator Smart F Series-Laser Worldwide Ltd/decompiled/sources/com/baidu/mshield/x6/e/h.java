package com.baidu.mshield.x6.e;

import android.content.Context;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static h f8545a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f8546b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f8547c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f8548d;

    /* renamed from: e, reason: collision with root package name */
    public Context f8549e;

    public class a extends com.baidu.mshield.x6.f.m.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8550b;

        public a(int i8) {
            this.f8550b = i8;
        }

        @Override // com.baidu.mshield.x6.f.m.a
        public void b() {
            new com.baidu.mshield.x6.e.c(h.this.f8549e, this.f8550b).b();
        }
    }

    public class b extends com.baidu.mshield.x6.f.m.a {
        public b() {
        }

        @Override // com.baidu.mshield.x6.f.m.a
        public void b() {
            new com.baidu.mshield.x6.e.d(h.this.f8549e).a();
        }
    }

    public class c extends com.baidu.mshield.x6.f.m.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8553b;

        public c(int i8) {
            this.f8553b = i8;
        }

        @Override // com.baidu.mshield.x6.f.m.a
        public void b() {
            new com.baidu.mshield.x6.e.e(h.this.f8549e, this.f8553b).a();
        }
    }

    public class d extends com.baidu.mshield.x6.f.m.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8555b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f8556c;

        public d(int i8, int i9) {
            this.f8555b = i8;
            this.f8556c = i9;
        }

        @Override // com.baidu.mshield.x6.f.m.a
        public void b() {
            new com.baidu.mshield.x6.e.e(h.this.f8549e, this.f8555b, this.f8556c).a();
        }
    }

    public class e extends com.baidu.mshield.x6.f.m.a {
        public e() {
        }

        @Override // com.baidu.mshield.x6.f.m.a
        public void b() {
            new com.baidu.mshield.x6.e.b(h.this.f8549e).a();
        }
    }

    public h(Context context) {
        this.f8549e = context;
    }

    public void b() {
        try {
            com.baidu.mshield.x6.f.m.c.b().a(new b());
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }

    public static synchronized h a(Context context) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f8545a == null) {
                    f8545a = new h(context);
                }
                hVar = f8545a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public void a(int i8, boolean z7) {
        try {
            if (f8547c) {
                return;
            }
            f8547c = true;
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8549e);
            if (z7 || !com.baidu.mshield.x6.f.f.c().equals(bVar.c())) {
                com.baidu.mshield.x6.f.m.c.b().a(new a(i8));
            } else {
                f8547c = false;
            }
        } catch (Throwable th) {
            f8547c = false;
            com.baidu.mshield.x6.f.f.b(th);
        }
    }

    public void a(int i8) {
        try {
            com.baidu.mshield.x6.f.m.c.b().a(new c(i8));
            a(5, false);
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }

    public void a(int i8, int i9) {
        try {
            com.baidu.mshield.x6.f.m.c.b().a(new d(i8, i9));
            a(5, false);
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }

    public void a() {
        try {
            com.baidu.mshield.x6.f.m.c.b().a(new e());
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }
}
