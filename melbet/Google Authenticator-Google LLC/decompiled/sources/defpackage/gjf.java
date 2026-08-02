package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjf implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public gjf(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, koe] */
    public final Boolean a() {
        int i = this.b;
        if (i == 0) {
            Boolean a = ((gjf) this.a).a();
            a.booleanValue();
            return a;
        }
        if (i != 1) {
            jsb jsbVar = this.a;
            return i != 2 ? Boolean.valueOf(((kee) ((jwh) jsbVar).b().a.b()).c("tiktok.directboot", "45709004").c()) : Boolean.valueOf(((kee) ((jvu) jsbVar).b().a.b()).c("tiktok.device", "45686668").c());
        }
        Boolean bool = (Boolean) ((gzp) ((jrx) this.a).a).d(false);
        bool.booleanValue();
        return bool;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? a() : a() : a() : a();
    }
}
