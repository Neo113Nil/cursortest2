package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idx implements ifg {
    static final jzw a;
    static final jzw b;
    private final idv c;
    private final idw d;
    private hel e;
    private int f;

    static {
        String p = ikg.p(icg.c.a());
        ixc ixcVar = kaa.f;
        int i = jzw.d;
        a = new jzs(p, ixcVar);
        b = new jzs(ikg.p(ich.d.a()), kaa.f);
    }

    public idx(idv idvVar) {
        this.c = idvVar;
        this.d = idvVar.b();
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs a() {
        return ifs.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift b() {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift c() {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs d(iwq iwqVar) {
        return ifs.a;
    }

    @Override // defpackage.ifg
    public final ifs e(iwq iwqVar) {
        this.e = this.d.a();
        this.f = 2;
        if (!((Boolean) this.c.a().bB()).booleanValue() || this.e.isEmpty() || this.f != 2) {
            return ifs.a;
        }
        Object obj = iwqVar.a;
        jzw jzwVar = a;
        hel helVar = this.e;
        jkj k = icg.a.k();
        int size = helVar.size();
        for (int i = 0; i < size; i++) {
            jjq r = jjq.r(hpx.e.h((String) helVar.get(i)));
            if (!k.b.M()) {
                k.t();
            }
            icg icgVar = (icg) k.b;
            r.getClass();
            jkx jkxVar = icgVar.b;
            if (!jkxVar.c()) {
                icgVar.b = jkp.A(jkxVar);
            }
            icgVar.b.add(r);
        }
        ((kaa) obj).h(jzwVar, ((icg) k.q()).f());
        return ifs.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift f(ikm ikmVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift g(ikm ikmVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift h(bry bryVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ift i(bry bryVar) {
        if (((Boolean) this.c.a().bB()).booleanValue() && this.f == 2) {
            byte[] bArr = (byte[]) ((kaa) bryVar.a).c(b);
            if (bArr != null) {
                try {
                    ich ichVar = (ich) ((jkj) ich.a.k().e(bArr, jkd.a())).q();
                    if ((ichVar.b & 1) != 0) {
                        idw idwVar = this.d;
                        jjq jjqVar = ichVar.c;
                        idwVar.b();
                    }
                } catch (jld e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs j(bry bryVar) {
        return ifs.a;
    }
}
