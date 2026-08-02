package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hry extends hdg implements Serializable {
    final hgv a;
    transient Collection b;
    transient Map c;

    public hry(hgv hgvVar) {
        this.a = hgvVar;
    }

    @Override // defpackage.hdg
    protected final hgv a() {
        return this.a;
    }

    @Override // defpackage.hdg, defpackage.hdj
    /* renamed from: b */
    protected final /* synthetic */ hhu f() {
        return this.a;
    }

    @Override // defpackage.hdg, defpackage.hgv
    public final List c(Object obj) {
        return new hrv(this.a.c(obj));
    }

    @Override // defpackage.hdj, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final boolean n(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.n(obj, obj2);
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final Collection o() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        hru hruVar = new hru(this.a.o());
        this.b = hruVar;
        return hruVar;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final Map p() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        hrx hrxVar = new hrx(this, this.a.p());
        this.c = hrxVar;
        return hrxVar;
    }
}
