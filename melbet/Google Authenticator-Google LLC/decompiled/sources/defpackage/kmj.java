package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmj implements kjm {
    private final /* synthetic */ int a;
    private final Object b;

    public kmj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kmh] */
    @Override // defpackage.kjm
    public final Object a() {
        int i = this.a;
        ?? r1 = this.b;
        return i != 0 ? r1 : kmi.a(r1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kmh] */
    @Override // defpackage.kjm
    public final void b(Object obj) {
        if (this.a != 0) {
            return;
        }
        kmi.c(this.b, obj);
    }
}
