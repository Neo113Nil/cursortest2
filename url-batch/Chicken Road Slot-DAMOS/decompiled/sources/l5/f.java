package l5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f implements i5.c {

    /* renamed from: d, reason: collision with root package name */
    public final k5.d f5877d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5878e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5879i;

    public f(k5.d dVar, String str) {
        this.f5877d = dVar;
        this.f5878e = str;
    }

    public final void a() {
        if (this.f5879i) {
            g8.b.L(21, "statement is closed");
            throw null;
        }
    }

    @Override // i5.c
    public void g() {
        a();
    }

    @Override // i5.c
    public void reset() {
        a();
    }
}
