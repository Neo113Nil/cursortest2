package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hmj implements hmf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hmf
    public final /* synthetic */ void a(hky hkyVar, Iterator it, Object obj) {
        hoq.h(hkyVar.b, "non repeating key");
        if (!hkyVar.c || hmu.a() <= 20) {
            hkyVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(hkyVar.a, it.next());
            }
        }
    }
}
