package l4;

import java.util.LinkedHashMap;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends b {
    public e(b bVar) {
        i.e(bVar, "initialExtras");
        LinkedHashMap linkedHashMap = bVar.f4829a;
        i.e(linkedHashMap, "initialExtras");
        this.f4829a.putAll(linkedHashMap);
    }

    @Override // l4.b
    public final Object a(w5.f fVar) {
        return this.f4829a.get(fVar);
    }

    public /* synthetic */ e(int i) {
        this(a.f4828b);
    }
}
