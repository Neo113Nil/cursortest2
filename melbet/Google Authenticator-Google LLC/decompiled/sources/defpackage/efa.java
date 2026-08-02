package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efa implements bbu {
    final /* synthetic */ fwe a;
    private final eez b;
    private hvi c;
    private final int d;

    public efa(fwe fweVar, eez eezVar, int i) {
        this.a = fweVar;
        this.b = eezVar;
        this.d = i;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.bbu
    public final void bo() {
        hvi hviVar = this.c;
        if (hviVar != null) {
            hviVar.cancel(false);
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [egc, java.lang.Object] */
    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        hvi d = this.a.a.d(this.b.b.a, this.d);
        this.c = d;
        hoq.av(d, new ckt(bbtVar, 5), huf.a);
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void d() {
    }
}
