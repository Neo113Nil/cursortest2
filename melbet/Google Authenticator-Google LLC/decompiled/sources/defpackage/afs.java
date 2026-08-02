package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afs implements aep {
    private final /* synthetic */ int a;
    private final Object b;

    public afs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [aeg, java.lang.Object] */
    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        aeg[] aegVarArr;
        int i = this.a;
        if (i == 0) {
            if (aejVar != aej.ON_CREATE) {
                Objects.toString(aejVar);
                throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(aejVar.toString()));
            }
            aerVar.L().c(this);
            ((afy) this.b).b();
            return;
        }
        if (i != 1) {
            ?? r2 = this.b;
            r2.a();
            r2.a();
            return;
        }
        new HashMap();
        int i2 = 0;
        while (true) {
            aegVarArr = (aeg[]) this.b;
            if (i2 >= aegVarArr.length) {
                break;
            }
            aegVarArr[i2].a();
            i2++;
        }
        for (aeg aegVar : aegVarArr) {
            aegVar.a();
        }
    }
}
