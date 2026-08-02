package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifa implements ifg {
    private final /* synthetic */ int a;
    private final Object b;

    public ifa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs a() {
        return this.a != 0 ? ifs.a : ifs.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift b() {
        return this.a != 0 ? ift.a : ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift c() {
        return this.a != 0 ? ift.a : ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs d(iwq iwqVar) {
        return this.a != 0 ? ifs.a : ifs.a;
    }

    @Override // defpackage.ifg
    public final ifs e(iwq iwqVar) {
        if (this.a != 0) {
            Object obj = iwqVar.b;
            jwv jwvVar = ico.a;
            jww jwwVar = (jww) obj;
            hoq.I(jwwVar.e(jwvVar) == null, "ChannelConfig provided twice");
            return new ifs(1, null, null, jwwVar.d(jwvVar, this.b));
        }
        Object obj2 = iwqVar.b;
        jwv jwvVar2 = icy.a;
        jww jwwVar2 = (jww) obj2;
        icy icyVar = (icy) jwwVar2.e(jwvVar2);
        if (icyVar == null) {
            Object obj3 = iwqVar.c;
            Object obj4 = this.b;
            String str = jnn.b.a;
            String str2 = ((kae) obj3).b;
            if (str2.startsWith(str)) {
                String substring = str2.substring(str.length());
                her herVar = ((jnn) obj4).p;
                if (herVar.containsKey(substring)) {
                    icyVar = (icy) herVar.get(substring);
                    icyVar.getClass();
                    obj2 = jwwVar2.d(jwvVar2, icyVar);
                }
            }
            icyVar = null;
            icyVar.getClass();
            obj2 = jwwVar2.d(jwvVar2, icyVar);
        }
        return new ifs(1, null, null, ((jww) obj2).d(dju.a, icyVar.a()));
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift f(ikm ikmVar) {
        return this.a != 0 ? ift.a : ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift g(ikm ikmVar) {
        return this.a != 0 ? ift.a : ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift h(bry bryVar) {
        return this.a != 0 ? ift.a : ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift i(bry bryVar) {
        return this.a != 0 ? ift.a : ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs j(bry bryVar) {
        return this.a != 0 ? ifs.a : ifs.a;
    }
}
