package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ery {
    public final boolean a;
    public final lgc b;

    public ery(boolean z, lgc lgcVar) {
        this.a = z;
        this.b = lgcVar;
    }

    public abstract eru a(String str);

    public abstract lgc b(eru eruVar);

    public abstract lgc c(eru eruVar);

    final lgc d() {
        jkj C = b(null).C();
        int i = eru.b.c;
        if (!C.b.M()) {
            C.t();
        }
        lgc lgcVar = (lgc) C.b;
        lgcVar.c = 2;
        lgcVar.d = Integer.valueOf(i);
        return (lgc) C.q();
    }
}
