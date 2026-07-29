package com.facebook.internal;

import java.util.concurrent.Executor;

/* compiled from: WorkQueue.java */
/* loaded from: classes.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f6086a = !ae.class.desiredAssertionStatus();

    /* renamed from: b, reason: collision with root package name */
    private final Object f6087b;

    /* renamed from: c, reason: collision with root package name */
    private b f6088c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6089d;
    private final Executor e;
    private b f;
    private int g;

    /* compiled from: WorkQueue.java */
    public interface a {
        boolean a();

        void b();
    }

    public ae() {
        this(8);
    }

    public ae(int i) {
        this(i, com.facebook.l.d());
    }

    public ae(int i, Executor executor) {
        this.f6087b = new Object();
        this.f = null;
        this.g = 0;
        this.f6089d = i;
        this.e = executor;
    }

    public a a(Runnable runnable) {
        return a(runnable, true);
    }

    public a a(Runnable runnable, boolean z) {
        b bVar = new b(runnable);
        synchronized (this.f6087b) {
            this.f6088c = bVar.a(this.f6088c, z);
        }
        a();
        return bVar;
    }

    private void a() {
        a((b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        b bVar2;
        synchronized (this.f6087b) {
            if (bVar != null) {
                try {
                    this.f = bVar.a(this.f);
                    this.g--;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.g < this.f6089d) {
                bVar2 = this.f6088c;
                if (bVar2 != null) {
                    this.f6088c = bVar2.a(this.f6088c);
                    this.f = bVar2.a(this.f, false);
                    this.g++;
                    bVar2.a(true);
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            b(bVar2);
        }
    }

    private void b(final b bVar) {
        this.e.execute(new Runnable() { // from class: com.facebook.internal.ae.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bVar.d().run();
                } finally {
                    ae.this.a(bVar);
                }
            }
        });
    }

    /* compiled from: WorkQueue.java */
    private class b implements a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ boolean f6092a = !ae.class.desiredAssertionStatus();

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f6094c;

        /* renamed from: d, reason: collision with root package name */
        private b f6095d;
        private b e;
        private boolean f;

        b(Runnable runnable) {
            this.f6094c = runnable;
        }

        @Override // com.facebook.internal.ae.a
        public boolean a() {
            synchronized (ae.this.f6087b) {
                if (c()) {
                    return false;
                }
                ae.this.f6088c = a(ae.this.f6088c);
                return true;
            }
        }

        @Override // com.facebook.internal.ae.a
        public void b() {
            synchronized (ae.this.f6087b) {
                if (!c()) {
                    ae.this.f6088c = a(ae.this.f6088c);
                    ae.this.f6088c = a(ae.this.f6088c, true);
                }
            }
        }

        public boolean c() {
            return this.f;
        }

        Runnable d() {
            return this.f6094c;
        }

        void a(boolean z) {
            this.f = z;
        }

        b a(b bVar, boolean z) {
            if (!f6092a && this.f6095d != null) {
                throw new AssertionError();
            }
            if (!f6092a && this.e != null) {
                throw new AssertionError();
            }
            if (bVar == null) {
                this.e = this;
                this.f6095d = this;
                bVar = this;
            } else {
                this.f6095d = bVar;
                this.e = bVar.e;
                b bVar2 = this.f6095d;
                this.e.f6095d = this;
                bVar2.e = this;
            }
            return z ? this : bVar;
        }

        b a(b bVar) {
            if (!f6092a && this.f6095d == null) {
                throw new AssertionError();
            }
            if (!f6092a && this.e == null) {
                throw new AssertionError();
            }
            if (bVar == this) {
                bVar = this.f6095d == this ? null : this.f6095d;
            }
            this.f6095d.e = this.e;
            this.e.f6095d = this.f6095d;
            this.e = null;
            this.f6095d = null;
            return bVar;
        }
    }
}
