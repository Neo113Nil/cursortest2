package z0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f9037a;

    /* renamed from: b, reason: collision with root package name */
    public final Y1.e f9038b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9039c;

    public t(String str, Y1.e eVar) {
        this.f9037a = str;
        this.f9038b = eVar;
    }

    public final void a(i iVar, Object obj) {
        iVar.d(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f9037a;
    }

    public /* synthetic */ t(String str) {
        this(str, p.p);
    }

    public t(String str, boolean z3, Y1.e eVar) {
        this(str, eVar);
        this.f9039c = z3;
    }
}
