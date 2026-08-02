package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqf implements agh {
    public static final agn a = new gkq();
    private final Map b;
    private final agh c;
    private final agh d;

    public jqf(Map map, agh aghVar, bod bodVar) {
        this.b = map;
        this.c = aghVar;
        this.d = new jqd(bodVar, 0);
    }

    @Override // defpackage.agh
    public final agd a(Class cls) {
        return this.b.containsKey(cls) ? yk.d() : this.c.a(cls);
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        return this.b.containsKey(cls) ? this.d.b(cls, agoVar) : this.c.b(cls, agoVar);
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        return yk.c(this, ktjVar, agoVar);
    }
}
