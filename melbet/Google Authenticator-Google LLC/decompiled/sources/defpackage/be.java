package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class be implements wo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ be(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.wo
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((bg) this.a).e.Y();
                return;
            case 1:
                ((bg) this.a).e.Y();
                return;
            case 2:
                Configuration configuration = (Configuration) obj;
                by byVar = (by) this.a;
                if (byVar.V()) {
                    byVar.p(configuration, false);
                    return;
                }
                return;
            case 3:
                Integer num = (Integer) obj;
                by byVar2 = (by) this.a;
                if (byVar2.V() && num.intValue() == 80) {
                    byVar2.s(false);
                    return;
                }
                return;
            case 4:
                ggw ggwVar = (ggw) obj;
                by byVar3 = (by) this.a;
                if (byVar3.V()) {
                    byVar3.t(ggwVar.a, false);
                    return;
                }
                return;
            case 5:
                ggw ggwVar2 = (ggw) obj;
                by byVar4 = (by) this.a;
                if (byVar4.V()) {
                    byVar4.y(ggwVar2.a, false);
                    return;
                }
                return;
            case 6:
                super/*android.widget.Button*/.setTypeface((Typeface) obj);
                return;
            case 7:
                super/*android.widget.EditText*/.setTypeface((Typeface) obj);
                return;
            case 8:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                return;
            case 9:
                gzp h = gzp.h((Integer) obj);
                dqp dqpVar = (dqp) this.a;
                dqpVar.f = h;
                dqpVar.b(dqpVar.e);
                return;
            default:
                jis jisVar = (jis) obj;
                jisVar.getClass();
                bd bdVar = (bd) this.a;
                if (bdVar.F().X()) {
                    return;
                }
                dua duaVar = new dua();
                if (duaVar.ao()) {
                    throw new IllegalArgumentException("setData should not be called after onAttach");
                }
                duaVar.aj = jisVar;
                duaVar.o(bdVar.F(), dtw.aj);
                return;
        }
    }
}
