package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cfw implements cgv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cfw(iee ieeVar, ces cesVar, int i) {
        this.c = i;
        this.a = ieeVar;
        this.b = cesVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.Map] */
    @Override // defpackage.cgv
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            Object obj = this.b;
            cgp cgpVar = (cgp) ((iee) this.a).d;
            return (Iterable) cgpVar.e(new cgl(cgpVar, (ces) obj, 0));
        }
        if (i == 1) {
            return Boolean.valueOf(((cgp) ((iee) this.a).d).l((ces) this.b));
        }
        ?? r1 = this.a;
        if (i == 2) {
            if (r1.iterator().hasNext()) {
                ((cgp) ((iee) this.b).d).c().compileStatement("DELETE FROM events WHERE _id in ".concat(cgp.h(r1))).execute();
            }
            return null;
        }
        Iterator it = r1.entrySet().iterator();
        while (it.hasNext()) {
            ((cgp) ((iee) this.b).c).j(((Integer) r3.getValue()).intValue(), cff.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public /* synthetic */ cfw(iee ieeVar, Object obj, int i) {
        this.c = i;
        this.b = ieeVar;
        this.a = obj;
    }
}
