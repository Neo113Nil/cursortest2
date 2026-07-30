package com.anythink.core.common.v;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16836a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.t.a f16837b = com.anythink.core.common.t.d.a();

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.t.b f16838c = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.v.b.1
        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f16836a) {
                return;
            }
            b.b(b.this);
            b.this.b();
        }
    };

    public static /* synthetic */ boolean b(b bVar) {
        bVar.f16836a = true;
        return true;
    }

    private boolean c() {
        return this.f16836a;
    }

    public abstract void b();

    public final synchronized void a(long j9) {
        this.f16837b.a(this.f16838c, j9, false);
    }

    public final synchronized void a() {
        this.f16837b.b(this.f16838c);
    }
}
