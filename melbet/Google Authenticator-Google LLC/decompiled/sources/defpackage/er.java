package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class er extends ex {
    final /* synthetic */ dpi a;

    public er(dpi dpiVar) {
        this.a = dpiVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ex
    public final int a() {
        return this.a.c.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ex
    public final int b() {
        return this.a.d.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ex
    public final boolean c(int i, int i2) {
        dpi dpiVar = this.a;
        ?? r0 = dpiVar.c;
        Object obj = dpiVar.d.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null && obj2 != null) {
            return ((ez) ((es) dpiVar.b).g.a).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ex
    public final boolean d(int i, int i2) {
        dpi dpiVar = this.a;
        ?? r0 = dpiVar.c;
        Object obj = dpiVar.d.get(i);
        Object obj2 = r0.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((ez) ((es) dpiVar.b).g.a).b(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ex
    public final void e(int i, int i2) {
        dpi dpiVar = this.a;
        ?? r0 = dpiVar.c;
        Object obj = dpiVar.d.get(i);
        Object obj2 = r0.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
    }
}
