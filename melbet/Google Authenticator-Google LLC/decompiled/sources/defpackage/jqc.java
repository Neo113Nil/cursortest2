package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jqc implements AutoCloseable {
    public final /* synthetic */ jqg a;
    private final /* synthetic */ int b;

    public /* synthetic */ jqc(jqg jqgVar, int i) {
        this.b = i;
        this.a = jqgVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        jqg jqgVar = this.a;
        if (i != 0) {
            jqgVar.a();
        } else {
            jqgVar.a();
        }
    }
}
