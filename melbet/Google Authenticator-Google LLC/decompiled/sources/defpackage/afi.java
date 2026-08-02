package defpackage;

import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class afi implements aep {
    private final Object a;
    private final chp b;

    public afi(Object obj) {
        this.a = obj;
        this.b = aeb.a.c(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        ?? r0 = this.b.a;
        List list = (List) r0.get(aejVar);
        Object obj = this.a;
        chp.b(list, aerVar, aejVar, obj);
        chp.b((List) r0.get(aej.ON_ANY), aerVar, aejVar, obj);
    }
}
