package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuo extends kwx {
    public kwc a;
    public final kuk b = new kuk(null, kul.a);
    final /* synthetic */ kuq c;
    private final kuv g;

    public kuo(kuq kuqVar, kuv kuvVar) {
        this.c = kuqVar;
        this.g = kuvVar;
    }

    @Override // defpackage.kwx
    public final void a(Throwable th) {
        if (th != null) {
            kuv kuvVar = this.g;
            ldb F = ((kuw) kuvVar).F(new kve(th, false), null);
            if (F != null) {
                kuvVar.a(F);
                kup kupVar = (kup) this.b.a;
                if (kupVar != null) {
                    kupVar.a();
                    return;
                }
                return;
            }
            return;
        }
        kuq kuqVar = this.c;
        if (((kui) kuqVar.b).a() == 0) {
            kuv kuvVar2 = this.g;
            kvs[] kvsVarArr = (kvs[]) kuqVar.a;
            ArrayList arrayList = new ArrayList(kvsVarArr.length);
            for (kvs kvsVar : kvsVarArr) {
                arrayList.add(kvsVar.d());
            }
            kuvVar2.ca(arrayList);
        }
    }

    @Override // defpackage.kwx
    public final boolean b() {
        return false;
    }
}
