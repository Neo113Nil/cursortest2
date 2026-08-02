package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bha implements bbn {
    private final bbn a;
    private final Resources b;

    public bha(Resources resources, bbn bbnVar) {
        a.v(resources, "Argument must not be null");
        this.b = resources;
        this.a = bbnVar;
    }

    @Override // defpackage.bbn
    public final bdv a(Object obj, int i, int i2, bbl bblVar) {
        return bil.f(this.b, this.a.a(obj, i, i2, bblVar));
    }

    @Override // defpackage.bbn
    public final boolean b(Object obj, bbl bblVar) {
        return this.a.b(obj, bblVar);
    }
}
