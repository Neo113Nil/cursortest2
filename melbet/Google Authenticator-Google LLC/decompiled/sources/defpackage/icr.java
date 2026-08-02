package defpackage;

import j$.util.Optional;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icr implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public icr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final idd b() {
        final int i = 0;
        if (((Boolean) ((Optional) ((jrx) this.b).a).orElse(false)).booleanValue()) {
            final bry bryVar = new bry(((iei) this.c).b(), (char[]) null);
            return new idd() { // from class: ide
                /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, koe] */
                @Override // defpackage.idd
                public final jwx a(idc idcVar) {
                    if (i != 0) {
                        fao.b();
                        ifv ifvVar = idcVar.n;
                        try {
                            CronetEngine cronetEngine = (CronetEngine) bryVar.b();
                            jwx aq = hnu.aq(idcVar, cronetEngine, gyf.a);
                            if (ikg.t(cronetEngine)) {
                                ifvVar.c(ify.a, ifx.e);
                                return aq;
                            }
                            ifvVar.c(ify.a, ifx.a);
                            return aq;
                        } catch (Throwable th) {
                            ifvVar.c(ify.a, ifx.b);
                            throw th;
                        }
                    }
                    fao.b();
                    ifv ifvVar2 = idcVar.n;
                    Object obj = bryVar;
                    try {
                        try {
                            CronetEngine cronetEngine2 = (CronetEngine) ((bry) ((bry) obj).a).i(new gxw(11));
                            try {
                                jwx aq2 = hnu.aq(idcVar, cronetEngine2, gzp.h((String) ((bry) ((bry) obj).a).i(new gxw(10))));
                                if (ikg.t(cronetEngine2)) {
                                    ifvVar2.c(ify.b, ifx.e);
                                    return aq2;
                                }
                                ifvVar2.c(ify.b, ifx.a);
                                return aq2;
                            } catch (iej e) {
                                throw new icq(e);
                            }
                        } catch (iej e2) {
                            throw new icq(e2);
                        }
                    } catch (icq e3) {
                        ifvVar2.c(ify.b, ifx.d);
                        throw new IllegalStateException("Failed to load Cronet. If loading Cronet from GMS Core, consider using an OkHttp fallback", e3);
                    } catch (Throwable th2) {
                        ifvVar2.c(ify.b, ifx.b);
                        throw th2;
                    }
                }
            };
        }
        final jsb jsbVar = this.a;
        final int i2 = 1;
        return new idd() { // from class: ide
            /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, koe] */
            @Override // defpackage.idd
            public final jwx a(idc idcVar) {
                if (i2 != 0) {
                    fao.b();
                    ifv ifvVar = idcVar.n;
                    try {
                        CronetEngine cronetEngine = (CronetEngine) jsbVar.b();
                        jwx aq = hnu.aq(idcVar, cronetEngine, gyf.a);
                        if (ikg.t(cronetEngine)) {
                            ifvVar.c(ify.a, ifx.e);
                            return aq;
                        }
                        ifvVar.c(ify.a, ifx.a);
                        return aq;
                    } catch (Throwable th) {
                        ifvVar.c(ify.a, ifx.b);
                        throw th;
                    }
                }
                fao.b();
                ifv ifvVar2 = idcVar.n;
                Object obj = jsbVar;
                try {
                    try {
                        CronetEngine cronetEngine2 = (CronetEngine) ((bry) ((bry) obj).a).i(new gxw(11));
                        try {
                            jwx aq2 = hnu.aq(idcVar, cronetEngine2, gzp.h((String) ((bry) ((bry) obj).a).i(new gxw(10))));
                            if (ikg.t(cronetEngine2)) {
                                ifvVar2.c(ify.b, ifx.e);
                                return aq2;
                            }
                            ifvVar2.c(ify.b, ifx.a);
                            return aq2;
                        } catch (iej e) {
                            throw new icq(e);
                        }
                    } catch (iej e2) {
                        throw new icq(e2);
                    }
                } catch (icq e3) {
                    ifvVar2.c(ify.b, ifx.d);
                    throw new IllegalStateException("Failed to load Cronet. If loading Cronet from GMS Core, consider using an OkHttp fallback", e3);
                } catch (Throwable th2) {
                    ifvVar2.c(ify.b, ifx.b);
                    throw th2;
                }
            }
        };
    }
}
