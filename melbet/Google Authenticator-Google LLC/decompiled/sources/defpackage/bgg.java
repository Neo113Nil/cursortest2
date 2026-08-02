package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgg implements bbu, bbt {
    private final List a;
    private final wq b;
    private int c;
    private azw d;
    private bbt e;
    private List f;
    private boolean g;

    public bgg(List list, wq wqVar) {
        this.b = wqVar;
        a.V(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            a.v(this.f, "Argument must not be null");
            this.e.e(new bdr("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.bbu
    public final Class a() {
        return ((bbu) this.a.get(0)).a();
    }

    @Override // defpackage.bbt
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.bbu
    public final void bo() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bbu) it.next()).bo();
        }
    }

    @Override // defpackage.bbu
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bbu) it.next()).d();
        }
    }

    @Override // defpackage.bbt
    public final void e(Exception exc) {
        List list = this.f;
        a.v(list, "Argument must not be null");
        list.add(exc);
        h();
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        this.d = azwVar;
        this.e = bbtVar;
        this.f = (List) this.b.a();
        ((bbu) this.a.get(this.c)).f(azwVar, this);
        if (this.g) {
            bo();
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return ((bbu) this.a.get(0)).g();
    }
}
