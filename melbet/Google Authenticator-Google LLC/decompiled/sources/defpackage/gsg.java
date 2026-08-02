package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gsg implements gut {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gsg(gut gutVar, int i) {
        this.b = i;
        this.a = gutVar;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [gtt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [gtt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [gtt, java.lang.Object] */
    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                gsh gshVar = (gsh) this.a;
                gshVar.s();
                gshVar.q();
                gshVar.a = null;
                break;
            case 1:
                gsh gshVar2 = (gsh) this.a;
                gshVar2.s();
                gshVar2.q();
                break;
            case 2:
                ((gsh) this.a).s();
                break;
            case 3:
                this.a.close();
                gta.o();
                break;
            case 4:
                this.a.close();
                break;
            case 5:
                this.a.close();
                gta.o();
                break;
            case 6:
                fao.d(new gfm(this, 17), 10000L);
                break;
            default:
                gta.f(this.a);
                break;
        }
    }

    public /* synthetic */ gsg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
