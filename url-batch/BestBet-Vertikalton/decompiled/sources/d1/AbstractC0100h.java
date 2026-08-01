package d1;

import k1.i;
import k1.j;

/* renamed from: d1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0100h extends AbstractC0095c implements k1.d {
    public final int d;

    public AbstractC0100h(b1.d dVar) {
        super(dVar);
        this.d = 2;
    }

    @Override // k1.d
    public final int f() {
        return this.d;
    }

    @Override // d1.AbstractC0093a
    public final String toString() {
        if (this.f2472a != null) {
            return super.toString();
        }
        i.f3246a.getClass();
        String a2 = j.a(this);
        k1.e.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
