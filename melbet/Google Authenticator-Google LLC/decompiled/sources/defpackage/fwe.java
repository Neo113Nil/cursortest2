package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwe implements bge {
    public final Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public fwe(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bge, java.lang.Object] */
    @Override // defpackage.bge
    public final /* synthetic */ boolean a(Object obj) {
        if (this.b != 0) {
            return ((eez) obj).b.d;
        }
        return this.c.a(eez.b((fxy) obj, this.a));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bge, java.lang.Object] */
    @Override // defpackage.bge
    public final /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        if (this.b == 0) {
            return this.c.b(eez.b((fxy) obj, this.a), i, i2, bblVar);
        }
        eez eezVar = (eez) obj;
        hoq.y(i == i2, "Width and height must be the same");
        return new bvw(eezVar, new efa(this, eezVar, i == Integer.MIN_VALUE ? 120 : dih.P((Context) this.c, i)));
    }
}
