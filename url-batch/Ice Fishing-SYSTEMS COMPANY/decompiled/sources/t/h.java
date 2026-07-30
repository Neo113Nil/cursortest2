package t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f40551a;

    /* renamed from: b, reason: collision with root package name */
    public k f40552b;

    /* renamed from: c, reason: collision with root package name */
    public l f40553c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40554d;

    public final void a(Object obj) {
        this.f40554d = true;
        k kVar = this.f40552b;
        if (kVar == null || !kVar.f40557u.j(obj)) {
            return;
        }
        this.f40551a = null;
        this.f40552b = null;
        this.f40553c = null;
    }

    public final void b(Throwable th) {
        this.f40554d = true;
        k kVar = this.f40552b;
        if (kVar == null || !kVar.f40557u.k(th)) {
            return;
        }
        this.f40551a = null;
        this.f40552b = null;
        this.f40553c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f40552b;
        if (kVar != null) {
            j jVar = kVar.f40557u;
            if (!jVar.isDone()) {
                jVar.k(new U0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f40551a, 2));
            }
        }
        if (this.f40554d || (lVar = this.f40553c) == null) {
            return;
        }
        lVar.j(null);
    }
}
