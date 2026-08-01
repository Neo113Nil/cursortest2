package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f8569f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f8570a;

    /* renamed from: b, reason: collision with root package name */
    public final v f8571b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8572c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8573d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f8574e = null;

    public /* synthetic */ d0(String str, Object obj, v vVar) {
        this.f8570a = str;
        this.f8572c = obj;
        this.f8571b = vVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f8573d) {
        }
        if (obj != null) {
            return obj;
        }
        if (d2.f8591n == null) {
            return this.f8572c;
        }
        synchronized (f8569f) {
            try {
                if (k5.c.l()) {
                    return this.f8574e == null ? this.f8572c : this.f8574e;
                }
                try {
                    for (d0 d0Var : e0.f8605a) {
                        if (k5.c.l()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            v vVar = d0Var.f8571b;
                            if (vVar != null) {
                                obj2 = vVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f8569f) {
                            d0Var.f8574e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                v vVar2 = this.f8571b;
                if (vVar2 != null) {
                    try {
                        return vVar2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f8572c;
            } finally {
            }
        }
    }
}
