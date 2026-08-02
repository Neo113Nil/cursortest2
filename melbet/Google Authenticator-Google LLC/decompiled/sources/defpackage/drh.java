package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class drh extends ex {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ dri c;

    public drh(dri driVar, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = driVar;
    }

    @Override // defpackage.ex
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.ex
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.ex
    public final boolean c(int i, int i2) {
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        dov dovVar = this.c.a;
        return dpa.a(obj, dovVar).equals(dpa.a(obj2, dovVar));
    }

    @Override // defpackage.ex
    public final boolean d(int i, int i2) {
        dov dovVar = this.c.a;
        return dovVar.c(this.a.get(i)).equals(dovVar.c(this.b.get(i2)));
    }
}
