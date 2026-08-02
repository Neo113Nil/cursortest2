package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eey implements bbu {
    private final int a;
    private final eez b;
    private final cka c;

    public eey(cka ckaVar, eez eezVar, int i) {
        this.c = ckaVar;
        this.b = eezVar;
        this.a = i;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        bbtVar.b(this.c.j(this.b.b, this.a));
    }

    @Override // defpackage.bbu
    public final int g() {
        return 5;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }

    @Override // defpackage.bbu
    public final void d() {
    }
}
