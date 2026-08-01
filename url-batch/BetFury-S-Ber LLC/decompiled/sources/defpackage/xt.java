package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xt implements ir {
    public final gu f;
    public final /* synthetic */ du g;

    public xt(du duVar, gu guVar) {
        this.g = duVar;
        this.f = guVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.ir
    public final Object a() {
        Throwable th;
        du duVar = this.g;
        gu guVar = this.f;
        kn knVar = kn.INTERNAL_ERROR;
        IOException iOException = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    duVar.i(this, knVar, iOException);
                    zk0.b(guVar);
                    throw th;
                }
            } catch (IOException e) {
                iOException = e;
            }
            if (!guVar.i(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    this = knVar;
                    duVar.i(this, knVar, iOException);
                    zk0.b(guVar);
                    throw th;
                }
            } while (guVar.i(false, this));
            kn knVar2 = kn.NO_ERROR;
            try {
                knVar = kn.CANCEL;
                duVar.i(knVar2, knVar, null);
                this = knVar2;
            } catch (IOException e2) {
                iOException = e2;
                kn knVar3 = kn.PROTOCOL_ERROR;
                duVar.i(knVar3, knVar3, iOException);
                this = knVar3;
                zk0.b(guVar);
                return sk0.a;
            }
            zk0.b(guVar);
            return sk0.a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
