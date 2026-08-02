package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agj {
    public static final agn a = new afw(4);
    public final cfz b;

    public agj(agl aglVar) {
        this(aglVar.O(), aglVar instanceof aeh ? ((aeh) aglVar).N() : agr.a, yl.e(aglVar));
    }

    public final agd a(Class cls) {
        return b(ixf.h(cls));
    }

    public final agd b(ktj ktjVar) {
        String b = ktjVar.b();
        if (b != null) {
            return this.b.e(ktjVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final agd c(String str, Class cls) {
        return this.b.e(ixf.h(cls), str);
    }

    public /* synthetic */ agj(agk agkVar, agh aghVar) {
        this(agkVar, aghVar, agm.a);
    }

    public agj(agk agkVar, agh aghVar, ago agoVar) {
        aghVar.getClass();
        agoVar.getClass();
        this.b = new cfz(agkVar, aghVar, agoVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agj(agl aglVar, agh aghVar) {
        this(aglVar.O(), aghVar, yl.e(aglVar));
        aglVar.getClass();
    }
}
