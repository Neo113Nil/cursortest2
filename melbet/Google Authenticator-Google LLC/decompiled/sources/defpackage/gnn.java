package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnn implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public gnn(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.Context, gje] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.Context, gjd] */
    public final Long a() {
        int i = this.b;
        jsb jsbVar = this.a;
        return i != 0 ? Long.valueOf(((jrk) jsbVar).b().c()) : Long.valueOf(((jrk) jsbVar).b().x());
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }
}
