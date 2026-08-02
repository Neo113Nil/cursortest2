package defpackage;

import android.content.pm.Signature;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bqg implements gzr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bqg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gzr
    public final boolean a(Object obj) {
        switch (this.b) {
            case 0:
                return !((fuf) obj).b.c.equals(this.a);
            case 1:
                return ((fuf) obj).b.c.equals(this.a);
            case 2:
                return ((fuf) obj).b.g.equals(((bqa) this.a).a().a);
            case 3:
                String str = ((fuf) obj).b.g;
                bqw bqwVar = (bqw) this.a;
                return str.equals(((bqz) bqwVar.n.get(bqwVar.r)).a);
            case 4:
                return ((fuf) obj).a.equals(((bqw) ((buz) this.a).a).b);
            case 5:
                return ((fuf) obj).a.equals(((bsz) ((bua) this.a).a).k.l());
            case 6:
                return ((bpc) obj).g.equals(((bux) this.a).a().d);
            case 7:
                return ((fuf) obj).a.equals(((car) this.a).a);
            case 8:
                return ((fuf) obj).b.c.equals(this.a);
            case 9:
                cmq cmqVar = (cmq) obj;
                Object obj2 = cmqVar.a;
                Object obj3 = cmqVar.b;
                Object obj4 = this.a;
                if (obj2 != null) {
                    bpc bpcVar = (bpc) obj2;
                    if (!bpcVar.k) {
                        return bpcVar.e.equals(obj4);
                    }
                }
                if (obj3 != null) {
                    bpc bpcVar2 = (bpc) obj3;
                    if (!bpcVar2.g()) {
                        return bpcVar2.e.equals(obj4);
                    }
                }
                return false;
            case 10:
                return hnu.Z(((dqv) this.a).l(obj), new bwt(6));
            case 11:
                hel l = ((dqv) this.a).l(obj);
                return ((cvl) gzp.g(!l.isEmpty() ? (dqw) l.get(0) : null).a(new drv(3)).e()) != null;
            default:
                int i = kcj.a;
                int i2 = hpe.a;
                byte[] d = hpd.a.a(((Signature) obj).toByteArray()).d();
                hjs listIterator = ((hel) this.a).listIterator(0);
                while (listIterator.hasNext()) {
                    if (Arrays.equals((byte[]) listIterator.next(), d)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
