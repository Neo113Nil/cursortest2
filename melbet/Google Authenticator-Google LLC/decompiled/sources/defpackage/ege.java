package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ege implements gzf {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ ege(String str, int i, int i2) {
        this.c = i2;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        if (this.c != 0) {
            return ((egc) obj).c(this.a, this.b);
        }
        return ((egc) obj).d(this.a, this.b);
    }
}
