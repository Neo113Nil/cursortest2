package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evo {
    public static final /* synthetic */ int a = 0;
    private static final fcx b = new fcx(euk.a);
    private static final Object c = new Object();
    private static volatile fym d = null;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r4 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                z = z && a(file2);
            }
        }
        return file.delete();
    }

    public static fcu b(etd etdVar) {
        fcj a2 = fck.a();
        Pattern pattern = fav.a;
        fau fauVar = new fau(etdVar.c);
        fauVar.b("phenotype");
        fauVar.c("all_accounts.pb");
        a2.d(fauVar.a());
        a2.c(euk.a);
        a2.a = gzp.h(b);
        a2.b();
        fck a3 = a2.a();
        fym fymVar = d;
        if (fymVar == null) {
            synchronized (c) {
                fymVar = d;
                if (fymVar == null) {
                    fcy fcyVar = fcy.a;
                    HashMap hashMap = new HashMap();
                    hvm d2 = etdVar.d();
                    iyi iyiVar = (iyi) etdVar.e.bB();
                    exf.n(fcp.a, hashMap);
                    fym fymVar2 = new fym(d2, iyiVar, fcyVar, hashMap);
                    d = fymVar2;
                    fymVar = fymVar2;
                }
            }
        }
        return fymVar.a(a3);
    }
}
