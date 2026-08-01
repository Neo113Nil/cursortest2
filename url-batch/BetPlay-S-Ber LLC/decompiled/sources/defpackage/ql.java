package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ql extends z60 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ sl e;

    public ql(sl slVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = slVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.z60, defpackage.v60
    public final void a(y60 y60Var) {
        sl slVar = this.e;
        Object obj = this.a;
        if (obj != null) {
            slVar.s(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            slVar.s(obj2, this.d, null);
        }
    }

    @Override // defpackage.v60
    public final void d(y60 y60Var) {
        y60Var.y(this);
    }
}
