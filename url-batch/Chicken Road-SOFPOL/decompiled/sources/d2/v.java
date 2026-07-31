package d2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f2216a;

    /* renamed from: b, reason: collision with root package name */
    public final p6.e f2217b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2218c;

    public v(String str, p6.e eVar) {
        this.f2216a = str;
        this.f2217b = eVar;
    }

    public final void a(j jVar, Object obj) {
        jVar.e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f2216a;
    }

    public /* synthetic */ v(String str) {
        this(str, r.f2185v);
    }

    public v(String str, int i) {
        this(str);
        this.f2218c = true;
    }

    public v(String str, boolean z3, p6.e eVar) {
        this(str, eVar);
        this.f2218c = z3;
    }
}
