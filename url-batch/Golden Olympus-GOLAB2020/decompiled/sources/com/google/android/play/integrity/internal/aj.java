package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
public final class aj implements an {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f13631a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile an f13632b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f13633c = f13631a;

    private aj(an anVar) {
        this.f13632b = anVar;
    }

    public static an b(an anVar) {
        return anVar instanceof aj ? anVar : new aj(anVar);
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        Object obj;
        Object obj2 = this.f13633c;
        Object obj3 = f13631a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f13633c;
                if (obj == obj3) {
                    obj = this.f13632b.a();
                    Object obj4 = this.f13633c;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f13633c = obj;
                    this.f13632b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
