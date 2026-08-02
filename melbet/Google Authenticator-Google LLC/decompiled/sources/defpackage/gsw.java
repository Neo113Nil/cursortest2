package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gsw implements gut {
    private final /* synthetic */ int a;

    public /* synthetic */ gsw(int i) {
        this.a = i;
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i == 0) {
            boolean z = gta.a;
            return;
        }
        if (i == 1) {
            gta.o();
            return;
        }
        if (i == 2) {
            gta.d.add(gta.f);
            fao.e(gta.g);
        } else if (i == 4) {
            gta.o();
        } else {
            if (i != 5) {
                return;
            }
            fao.c();
            gta.f(null);
        }
    }
}
