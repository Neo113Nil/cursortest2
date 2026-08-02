package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ggp implements htr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ggp(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // defpackage.htr
    public final hvi a(Object obj) {
        if (this.d != 0) {
            Status status = (Status) obj;
            if (!status.c()) {
                throw new cmm(status);
            }
            boolean z = this.a;
            return ((bsr) hnu.bq(((bss) this.b).b, bsr.class, (frv) this.c)).m().a(new bwy(z, 1), huf.a);
        }
        List<fuf> list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(ixc.w(list));
        for (fuf fufVar : list) {
            boolean z2 = this.a;
            Object obj2 = this.c;
            Object obj3 = this.b;
            arrayList.add(((iyi) obj3).e((String) obj2, fufVar.a, fufVar.b, z2));
        }
        return hnu.bx(arrayList);
    }
}
