package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwe implements kxu {
    public static final ale a = new ale();
    public final hoq b;
    private final hrz c;

    public gwe(hoq hoqVar, boolean z) {
        this.b = hoqVar;
        this.c = new hrz(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [guq, java.lang.Object] */
    @Override // defpackage.kxu
    public final /* bridge */ /* synthetic */ Object a(kqn kqnVar) {
        kqnVar.getClass();
        gun a2 = gta.a();
        hrz hrzVar = a2.f;
        guq guqVar = a2.c;
        guq guqVar2 = a2.d;
        hrz hrzVar2 = this.c;
        if (guqVar2 == null) {
            a2.d = guqVar != null ? guqVar : hrzVar2.a;
        }
        a2.f = hrzVar2;
        gta.w(a2, hrzVar2.a, 1);
        return new iyi((Object) guqVar, (Object) hrzVar, (Object) guqVar2, (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [guq, java.lang.Object] */
    @Override // defpackage.kxu
    public final /* bridge */ /* synthetic */ void b(kqn kqnVar, Object obj) {
        iyi iyiVar = (iyi) obj;
        kqnVar.getClass();
        iyiVar.getClass();
        ?? r1 = iyiVar.a;
        gun a2 = gta.a();
        gta.w(a2, r1, 3);
        a2.f = (hrz) iyiVar.b;
        a2.d = iyiVar.c;
    }

    public final gwe c() {
        return new gwe(this.b, gta.a);
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return ixe.e(this, obj, krxVar);
    }

    @Override // defpackage.kql, defpackage.kqn
    public final kql get(kqm kqmVar) {
        return ixe.f(this, kqmVar);
    }

    @Override // defpackage.kql
    public final kqm getKey() {
        return a;
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        return ixe.g(this, kqmVar);
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        return ixe.h(this, kqnVar);
    }
}
