package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hib extends hdj implements Serializable {
    private static final long serialVersionUID = 0;
    final hhu a;
    transient Collection b;
    transient Set c;
    transient Map d;

    public hib(hhu hhuVar) {
        this.a = hhuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hdj, defpackage.hdk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hhu f() {
        return this.a;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final void k() {
        throw null;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final boolean n(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final Collection o() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        hhp hhpVar = new hhp(DesugarCollections.unmodifiableCollection(this.a.o()));
        this.b = hhpVar;
        return hhpVar;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final Map p() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new hho(this.a.p(), new kee(new gxw(2), null)));
        this.d = unmodifiableMap;
        return unmodifiableMap;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final Set q() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(this.a.q());
        this.c = unmodifiableSet;
        return unmodifiableSet;
    }

    @Override // defpackage.hdj, defpackage.hhu
    public final boolean s(Object obj, Object obj2) {
        throw null;
    }
}
