package defpackage;

import android.content.res.Resources;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements tr {
    public final /* synthetic */ int f;

    public /* synthetic */ rg(int i) {
        this.f = i;
    }

    @Override // defpackage.tr
    public final Object h(Object obj) {
        sk0 insert$lambda$1;
        switch (this.f) {
            case 0:
                og ogVar = (og) obj;
                if (ogVar instanceof tg) {
                    return (tg) ogVar;
                }
                return null;
            case 1:
                insert$lambda$1 = NotesViewModel.insert$lambda$1(((Long) obj).longValue());
                return insert$lambda$1;
            case 2:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 3:
                eb0 eb0Var = (eb0) obj;
                eb0Var.getClass();
                return Boolean.valueOf(eb0Var.G());
            default:
                eb0 eb0Var2 = (eb0) obj;
                eb0Var2.getClass();
                ad0 ad0Var = new ad0();
                while (eb0Var2.G()) {
                    ad0Var.add(Integer.valueOf((int) eb0Var2.getLong(0)));
                }
                return bd0.a(ad0Var);
        }
    }
}
