package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dli implements dki {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dli(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dki
    public final List a() {
        int i = this.b;
        if (i == 0) {
            dln dlnVar = ((dlk) this.a).c;
            dlnVar.b();
            return dlnVar.a();
        }
        Object obj = this.a;
        if (i != 1) {
            return ((dln) obj).a();
        }
        dlk dlkVar = (dlk) obj;
        dln dlnVar2 = dlkVar.c;
        dlnVar2.b();
        if (dlnVar2.h) {
            Iterator it = dlnVar2.c.iterator();
            while (it.hasNext()) {
                if (((dlm) it.next()).g) {
                    break;
                }
            }
        }
        if (dlkVar.h > dlkVar.f) {
            if (dlkVar.i != null) {
                return null;
            }
            dlkVar.i = dlkVar.b.a(new ath(obj, 20));
            fao.d(dlkVar.i, dlkVar.h - dlkVar.f);
            return null;
        }
        return dlnVar2.a();
    }
}
