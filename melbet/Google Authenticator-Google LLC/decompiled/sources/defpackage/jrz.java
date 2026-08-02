package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrz extends jrt {
    public static final jsb b = jrx.a(Collections.EMPTY_MAP);

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        Map map = this.a;
        LinkedHashMap b2 = iwj.b(map.size());
        for (Map.Entry entry : map.entrySet()) {
            b2.put(entry.getKey(), ((jsb) entry.getValue()).b());
        }
        return DesugarCollections.unmodifiableMap(b2);
    }
}
