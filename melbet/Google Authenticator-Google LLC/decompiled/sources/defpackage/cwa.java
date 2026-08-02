package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cwa implements coq {
    final /* synthetic */ byte[] a;
    private final /* synthetic */ int b;

    public cwa(byte[] bArr, int i) {
        this.b = i;
        this.a = bArr;
    }

    @Override // defpackage.coq
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            try {
                ((cvo) obj).a(her.i(DesugarCollections.unmodifiableMap(((cvh) jkp.v(cvh.a, this.a, jkd.a())).b)));
                return;
            } catch (jld e) {
                throw new IllegalStateException("Failed parsing account alerts proto", e);
            }
        }
        if (i == 1) {
            cvn cvnVar = (cvn) obj;
            cvnVar.getClass();
            try {
                cvf cvfVar = (cvf) jkp.v(cvf.a, this.a, jkd.a());
                cvfVar.getClass();
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(cvfVar.b);
                unmodifiableMap.getClass();
                cvnVar.a(hnu.ad(unmodifiableMap));
                return;
            } catch (jld e2) {
                throw new IllegalStateException("Failed parsing account data response proto", e2);
            }
        }
        if (i == 2) {
            try {
                ((cvp) obj).a(her.i(DesugarCollections.unmodifiableMap(((cvj) jkp.v(cvj.a, this.a, jkd.a())).b)));
                return;
            } catch (jld e3) {
                throw new IllegalStateException("Failed parsing account alerts proto", e3);
            }
        }
        if (i != 3) {
            evr evrVar = (evr) obj;
            try {
                evk evkVar = (evk) jkp.v(evk.a, this.a, jkd.a);
                Iterator it = evrVar.a.b.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (((evq) it.next()).a(evkVar.b) && !z) {
                        evrVar.b.a();
                        z = true;
                    }
                }
                return;
            } catch (jld unused) {
                return;
            }
        }
        cvm cvmVar = (cvm) obj;
        cvmVar.getClass();
        try {
            cvf cvfVar2 = (cvf) jkp.v(cvf.a, this.a, jkd.a());
            cvfVar2.getClass();
            Map unmodifiableMap2 = DesugarCollections.unmodifiableMap(cvfVar2.b);
            unmodifiableMap2.getClass();
            cvmVar.a(hnu.ad(unmodifiableMap2));
        } catch (jld e4) {
            cvmVar.b(new IllegalStateException("Failed parsing account data response proto", e4));
        }
    }
}
