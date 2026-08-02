package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gsf implements gut {
    public final /* synthetic */ gut a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gsf(gut gutVar, Object obj, int i) {
        this.c = i;
        this.a = gutVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [gut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [gut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [gut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [guq, java.lang.Object] */
    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                this.a.close();
                gta.f(this.b);
                break;
            case 1:
                this.b.close();
                this.a.close();
                break;
            case 2:
                this.b.close();
                this.a.close();
                break;
            case 3:
                this.a.close();
                gsh gshVar = (gsh) this.b;
                gshVar.a = null;
                gshVar.b = false;
                gta.f(gshVar.c);
                gshVar.c = null;
                break;
            case 4:
                this.a.close();
                gta.f(this.b);
                break;
            case 5:
                this.a.close();
                this.b.close();
                break;
            case 6:
                this.a.close();
                gsu gsuVar = (gsu) this.b;
                gsuVar.a = null;
                gsuVar.b = null;
                break;
            default:
                this.b.close();
                this.a.close();
                gta.o();
                break;
        }
    }

    public /* synthetic */ gsf(Object obj, gut gutVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = gutVar;
    }
}
