package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class heg extends hdz {
    public heg(int i) {
        super(i);
    }

    @Override // defpackage.hdz, defpackage.hea
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final hel g() {
        this.c = true;
        return hel.i(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public heg() {
        throw null;
    }
}
