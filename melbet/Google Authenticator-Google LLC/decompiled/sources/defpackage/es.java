package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class es {
    private static final Executor h = new pl(1, (byte[]) null);
    public final fe a;
    public List d;
    public int f;
    final brr g;
    public final List c = new CopyOnWriteArrayList();
    public List e = Collections.EMPTY_LIST;
    public final Executor b = h;

    public es(fe feVar, brr brrVar) {
        this.a = feVar;
        this.g = brrVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(List list) {
        int i = this.f + 1;
        this.f = i;
        List list2 = this.d;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            this.d = null;
            this.e = Collections.EMPTY_LIST;
            this.a.c(0, size);
            b();
            return;
        }
        if (list2 != null) {
            brr brrVar = this.g;
            brrVar.b.execute(new dpi(this, list2, list, i, 1));
        } else {
            this.d = list;
            this.e = DesugarCollections.unmodifiableList(list);
            this.a.a(0, list.size());
            b();
        }
    }

    public final void b() {
        for (e eVar : this.c) {
        }
    }
}
