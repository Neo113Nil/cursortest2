package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dti implements kzr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dti(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.kzr
    public final /* synthetic */ Object cg(Object obj, kqj kqjVar) {
        switch (this.b) {
            case 0:
                dtj.a((dtj) this.a, null, null, (jhu) obj, null, null, null, 59);
                break;
            case 1:
                List list = (List) obj;
                dtj dtjVar = (dtj) this.a;
                dtjVar.c = list;
                dtj.a(dtjVar, null, null, null, list, null, null, 55);
                break;
            case 2:
                dtj dtjVar2 = (dtj) this.a;
                dui duiVar = dtjVar2.a;
                jfy jfyVar = (jfy) obj;
                Object b = duiVar.a.e.b();
                b.getClass();
                break;
            case 3:
                dtj dtjVar3 = (dtj) this.a;
                dtjVar3.g = (List) obj;
                dtj.a(dtjVar3, null, null, null, null, null, dtjVar3.g, 31);
                break;
            case 4:
                dtj dtjVar4 = (dtj) this.a;
                dtjVar4.d = (dvt) obj;
                dtj.a(dtjVar4, null, null, null, null, dtjVar4.d, null, 47);
                break;
            case 5:
                dvu dvuVar = (dvu) this.a;
                dvuVar.c = (jhy) obj;
                dvuVar.a();
                break;
            case 6:
                dvu dvuVar2 = (dvu) this.a;
                dvuVar2.d = (dvl) obj;
                dvuVar2.a();
                break;
            case 7:
                dvu dvuVar3 = (dvu) this.a;
                dvuVar3.e = (eba) obj;
                dvuVar3.a();
                break;
            case 8:
                dvu dvuVar4 = (dvu) this.a;
                dvuVar4.f = (Map) obj;
                dvuVar4.a();
                break;
            case 9:
                dvv dvvVar = (dvv) this.a;
                dvvVar.b = (Map) obj;
                dvvVar.a();
                break;
            default:
                dvv dvvVar2 = (dvv) this.a;
                dvvVar2.c = (Map) obj;
                dvvVar2.a();
                break;
        }
        return kow.a;
    }
}
