package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyz implements dov {
    private final gzp a;

    public fyz(gzp gzpVar) {
        this.a = gzpVar;
    }

    public static final String k(fuf fufVar) {
        return String.valueOf(fufVar.a.a);
    }

    @Override // defpackage.dov
    public final /* synthetic */ dke a(Object obj) {
        fuf fufVar = (fuf) obj;
        if (fufVar == null) {
            return new dke(3, null);
        }
        String str = fufVar.b.k;
        return "pseudonymous".equals(str) ? new dke(2, null) : "incognito".equals(str) ? new dke(3, null) : i(fufVar) ? dke.a(k(fufVar)) : new dke(2, null);
    }

    @Override // defpackage.dov
    public final /* synthetic */ dox b(Object obj) {
        fuf fufVar = (fuf) obj;
        if (!i(fufVar)) {
            return null;
        }
        ful fulVar = fufVar.b;
        iwq iwqVar = fwc.a;
        fulVar.g(iwqVar);
        Object j = fulVar.l.j((jko) iwqVar.c);
        if (j == null) {
            j = iwqVar.b;
        } else {
            iwqVar.c(j);
        }
        fvy fvyVar = (fvy) j;
        boolean z = fvyVar.c;
        int x = a.x(fvyVar.e);
        if (x == 0) {
            x = 1;
        }
        int i = x - 1;
        int i2 = i != 0 ? i != 1 ? 3 : 2 : 1;
        dow dowVar = new dow();
        dowVar.a(false);
        dowVar.c = 1;
        dowVar.a(z);
        dowVar.c = i2;
        if (dowVar.b == 1) {
            return new dox(dowVar.a, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (dowVar.b == 0) {
            sb.append(" isG1User");
        }
        if (dowVar.c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dov
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return k((fuf) obj);
    }

    @Override // defpackage.dov
    public final /* synthetic */ String d(Object obj) {
        return ((fuf) obj).b.g;
    }

    @Override // defpackage.dov
    public final /* synthetic */ String e(Object obj) {
        return ((fuf) obj).b.h;
    }

    @Override // defpackage.dov
    public final /* synthetic */ String f(Object obj) {
        return ((fuf) obj).b.d;
    }

    @Override // defpackage.dov
    public final /* synthetic */ String g(Object obj) {
        ful fulVar = ((fuf) obj).b;
        if ((fulVar.b & 8) != 0) {
            return fulVar.f;
        }
        return null;
    }

    @Override // defpackage.dov
    public final /* synthetic */ String h(Object obj) {
        ful fulVar = ((fuf) obj).b;
        if ((fulVar.b & 4) != 0) {
            return fulVar.e;
        }
        return null;
    }

    @Override // defpackage.dov
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean i(fuf fufVar) {
        return ((String) ((gzs) this.a).a).equals(fufVar.b.k);
    }
}
