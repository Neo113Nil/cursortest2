package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hbr extends hbg implements hhu {
    private static final long serialVersionUID = 7431625294878419160L;

    public hbr(Map map) {
        super(map);
    }

    @Override // defpackage.hbg
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.hbg
    public final Collection b(Object obj, Collection collection) {
        return new hbf(this, obj, (Set) collection);
    }

    public final Set c(Object obj) {
        return (Set) super.f(obj);
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final /* bridge */ /* synthetic */ Collection o() {
        throw null;
    }
}
