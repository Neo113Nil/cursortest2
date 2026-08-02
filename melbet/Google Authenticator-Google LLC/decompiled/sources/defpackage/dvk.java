package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvk {
    public final jiw a;
    public final cwy b;
    public final iyh c;
    public final iyh d;
    private final int e = View.generateViewId();
    private final dvx f = new dvx();

    public dvk(cwy cwyVar, jiw jiwVar, iyh iyhVar, iyh iyhVar2) {
        this.b = cwyVar;
        this.a = jiwVar;
        this.d = iyhVar;
        this.c = iyhVar2;
    }

    public final kzq a() {
        return new kzl(new akn(this, (kqj) null, 5));
    }

    public final jhy b(ehr ehrVar, boolean z, Map map, gjl gjlVar) {
        dqw dqwVar;
        map.getClass();
        dvs dvsVar = (dvs) map.get(ehrVar.c);
        if (dvsVar != null) {
            cvg cvgVar = dvsVar.a;
            jkx jkxVar = cvgVar.c;
            jkxVar.getClass();
            Iterator<E> it = jkxVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dqwVar = null;
                    break;
                }
                dqw a = dqw.a(cvgVar.b, (cvl) it.next());
                if (a != null) {
                    dqwVar = a;
                    break;
                }
            }
            if (dqwVar != null) {
                jiu jiuVar = dvsVar.b;
                this.a.c(jiuVar, new dtb(this, dqwVar, z, gjlVar, 2));
                int i = this.e;
                int i2 = true != z ? 109736 : 109340;
                dvx dvxVar = this.f;
                dvxVar.a = new awb(dvsVar, this, 7);
                jhb jhbVar = jhb.q;
                jig jigVar = new jig(new jha(1, null));
                cvl cvlVar = dqwVar.b;
                String str = cvlVar.c;
                str.getClass();
                jhh jhhVar = new jhh(str);
                jhb jhbVar2 = jhb.h;
                jhq jhqVar = new jhq(jhhVar, jhbVar2, 1, (Integer) null, 16);
                String str2 = cvlVar.d;
                str2.getClass();
                jii jiiVar = new jii(new jhq(new jhh(str2), jhbVar2, 4, (Integer) null, 16));
                String str3 = cvlVar.e;
                str3.getClass();
                String str4 = cvlVar.f;
                str4.getClass();
                return new jhy(new jim(jigVar, jhqVar, null, jiiVar, null, new jgn(ixc.D(new jhh[]{new jhh(str3), new jhh(str4)}), jiuVar, 109339, jhb.k, new jgk(jhb.f), null, 1), null, 1, 1, 692), i, jhbVar, jiuVar, dvxVar, i2, 64);
            }
        }
        return null;
    }
}
