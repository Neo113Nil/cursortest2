package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class han extends hbg implements hgv {
    private static final long serialVersionUID = 6588350623831699109L;

    public han(Map map) {
        super(map);
    }

    @Override // defpackage.hbg
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.hbg
    public final Collection b(Object obj, Collection collection) {
        return h(obj, (List) collection, null);
    }

    @Override // defpackage.hgv
    public final List c(Object obj) {
        return (List) super.f(obj);
    }
}
