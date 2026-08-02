package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwq extends fby {
    private static final hkh b = hkh.l("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    public final ikm a;
    private final gzp c;
    private final koe d;
    private final Executor e;

    public fwq(ikm ikmVar, gzp gzpVar, koe koeVar, Executor executor) {
        this.a = ikmVar;
        this.c = gzpVar;
        this.d = koeVar;
        this.e = executor;
    }

    @Override // defpackage.fby
    public final hvi a(IOException iOException, fbz fbzVar) {
        gzp gzpVar = this.c;
        if (!gzpVar.f() || !((Boolean) gzpVar.b()).booleanValue()) {
            return hnu.aI(iOException);
        }
        if (!(iOException instanceof FileNotFoundException) && !(iOException.getCause() instanceof FileNotFoundException) && !(iOException instanceof jld) && !(iOException.getCause() instanceof jld)) {
            return hnu.aI(iOException);
        }
        ((hkf) ((hkf) ((hkf) b.f()).h(iOException)).i("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", (char) 127, "AccountDataStoreIOExceptionHandler.java")).s("AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.");
        hel e = this.a.e(false);
        int i = ((his) e).c;
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            int parseInt = Integer.parseInt(((File) e.get(i3)).getName());
            if (parseInt > i2) {
                i2 = parseInt;
            }
        }
        Set set = (Set) ((jrx) this.d).a;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (true) {
            int i4 = 19;
            if (!it.hasNext()) {
                jxu aV = hnu.aV(arrayList);
                bws bwsVar = new bws(i4);
                Executor executor = this.e;
                return hso.g(hti.g(hti.g(hvc.v(aV.a(bwsVar, executor)), gvx.c(new fvr(this, 3)), executor), gvx.c(new doi(fbzVar, i2, 2)), executor), IOException.class, gvx.c(new fvr(iOException, 4)), huf.a);
            }
            fwp fwpVar = (fwp) it.next();
            fwpVar.getClass();
            arrayList.add(hnu.aN(gvx.b(new cbc(fwpVar, i4)), huf.a));
        }
    }
}
