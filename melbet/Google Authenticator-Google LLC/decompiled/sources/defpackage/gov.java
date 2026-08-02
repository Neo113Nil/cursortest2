package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gov implements jrw {
    private final jsb a;

    public gov(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        Set<AbstractMap.SimpleImmutableEntry> b = ((jsd) this.a).b();
        qi qiVar = new qi();
        for (AbstractMap.SimpleImmutableEntry simpleImmutableEntry : b) {
            Set set = (Set) qiVar.get(simpleImmutableEntry.getKey());
            if (set == null) {
                set = Collections.newSetFromMap(new qi());
                qiVar.put((ifp) simpleImmutableEntry.getKey(), set);
            }
            set.add((koe) simpleImmutableEntry.getValue());
        }
        return qiVar;
    }
}
