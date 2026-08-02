package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.Set;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glg implements agh {
    public final bd a;
    private final agh b;
    private final Set c;
    private final agh d;

    public glg(bd bdVar, agh aghVar, Set set, boc bocVar) {
        this.a = bdVar;
        this.b = aghVar;
        this.c = set;
        this.d = new gli(bocVar, new BiConsumer() { // from class: gle
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ago agoVar = (ago) obj2;
                frv frvVar = (frv) agoVar.a(gkq.a);
                glg glgVar = glg.this;
                if (frvVar != null) {
                    int i = glgVar.a.n.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID");
                    int i2 = frvVar.a;
                    hoq.L(i2 == i, "Cannot use AccountViewModelFactory on a different account than the fragment the factory is from. Found: %s, Factory fragment: %s", i2, i);
                    return;
                }
                agl aglVar = (agl) agoVar.a(afx.b);
                if (aglVar instanceof bd) {
                    bd bdVar2 = glgVar.a;
                    hoq.M(aglVar == bdVar2, "Cannot use AccountViewModelFactory on a different fragment than the fragment the factory is from. Found: %s, Factory fragment: %s", aglVar, bdVar2);
                } else {
                    bd bdVar3 = glgVar.a;
                    if (bdVar3.R == null || aglVar != bdVar3.M()) {
                        throw new IllegalStateException("AccountViewModels can only use account fragments and account-based Navigation back stack entries as the owner. Found the owner: ".concat(String.valueOf(String.valueOf(aglVar))));
                    }
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    @Override // defpackage.agh
    public final agd a(Class cls) {
        return this.c.contains(cls.getName()) ? yk.d() : this.b.a(cls);
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        return this.c.contains(cls.getName()) ? this.d.b(cls, agoVar) : this.b.b(cls, agoVar);
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        return yk.c(this, ktjVar, agoVar);
    }
}
