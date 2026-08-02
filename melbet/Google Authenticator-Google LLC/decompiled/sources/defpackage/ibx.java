package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibx implements ibk {
    private static final ibg a = new ibv(2);
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final ibg d = a;

    @Override // defpackage.ibk
    public final /* bridge */ /* synthetic */ void a(Class cls, ibg ibgVar) {
        this.b.put(cls, ibgVar);
        this.c.remove(cls);
    }

    public final iyi b() {
        return new iyi(new HashMap(this.b), new HashMap(this.c), this.d);
    }
}
