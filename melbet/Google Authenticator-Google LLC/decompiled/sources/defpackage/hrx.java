package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hrx extends hdh {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ hry d;

    public hrx(hry hryVar, Map map) {
        this.c = map;
        this.d = hryVar;
    }

    @Override // defpackage.hdh
    protected final Map a() {
        return this.c;
    }

    @Override // defpackage.hdh, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((hdc) values()).c(obj);
    }

    @Override // defpackage.hdh, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        hrq hrqVar = new hrq(this.c.entrySet());
        this.a = hrqVar;
        return hrqVar;
    }

    @Override // defpackage.hdh, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.c;
    }

    @Override // defpackage.hdh, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        List c = this.d.c(obj);
        if (c.isEmpty()) {
            return null;
        }
        return c;
    }

    @Override // defpackage.hdh, java.util.Map
    public final Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        hrs hrsVar = new hrs(this.c.values(), entrySet());
        this.b = hrsVar;
        return hrsVar;
    }
}
