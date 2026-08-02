package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzr extends dza {
    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((dzs) obj).getClass();
        ((jia) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        dzs dzsVar = (dzs) obj;
        jia jiaVar = (jia) obj2;
        dzsVar.getClass();
        jiaVar.getClass();
        List list = jiaVar.a;
        dzsVar.t.setVisibility(true != list.isEmpty() ? 0 : 8);
        ((ehm) dzsVar.u).t(list);
    }
}
