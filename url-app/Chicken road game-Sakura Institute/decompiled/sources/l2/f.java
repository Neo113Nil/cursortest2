package l2;

import j2.AbstractC0720j;
import java.util.Comparator;
import o2.l;
import o2.q;
import y.t;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f7974a;

    public f(t tVar) {
        this.f7974a = tVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0823c c0823c = (C0823c) obj;
        C0823c c0823c2 = (C0823c) obj2;
        AbstractC0720j.c((c0823c.f7971d == null || c0823c2.f7971d == null) ? false : true);
        return ((l) this.f7974a.f11495i).compare(new q(c0823c.f7971d, c0823c.f7969b.f8941d), new q(c0823c2.f7971d, c0823c2.f7969b.f8941d));
    }
}
