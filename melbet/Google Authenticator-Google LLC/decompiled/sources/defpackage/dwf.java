package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwf extends kra implements krz {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dwg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwf(dwg dwgVar, kqj kqjVar) {
        super(4, kqjVar);
        this.d = dwgVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        ixc.Y(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        List list = ((jia) obj3).a;
        ?? r2 = this.c;
        List list2 = r2;
        if (!list.isEmpty()) {
            list2 = ixc.l(ixc.b(obj3), r2);
        }
        return obj2 == null ? list2 : ixc.l(ixc.b(new jia(ixc.b(new jic(((eba) obj2).a)), this.d.a)), list2);
    }
}
