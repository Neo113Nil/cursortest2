package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kws extends kwx {
    private final krt a;
    private final kuh b = new kuh(false, kul.a);

    public kws(krt krtVar) {
        this.a = krtVar;
    }

    @Override // defpackage.kwx
    public final void a(Throwable th) {
        if (this.b.b()) {
            this.a.a(th);
        }
    }

    @Override // defpackage.kwx
    public final boolean b() {
        return true;
    }
}
