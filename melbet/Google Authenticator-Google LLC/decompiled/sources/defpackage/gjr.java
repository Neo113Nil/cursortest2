package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjr implements krt {
    public final /* synthetic */ gjw a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ gjr(gjw gjwVar, boolean z, int i) {
        this.c = i;
        this.a = gjwVar;
        this.b = z;
    }

    @Override // defpackage.krt
    public final Object a(Object obj) {
        File a;
        if (this.c != 0) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            final gjw gjwVar = this.a;
            if (booleanValue) {
                return gjwVar.b("sqlite_completion_present");
            }
            final Map map = gjwVar.j;
            Set b = ((jsd) gjwVar.g).b();
            b.getClass();
            ArrayList arrayList = new ArrayList(ixc.w(b));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(new gjv((gka) it.next(), 0));
            }
            final boolean z = this.b;
            return gjwVar.k.m(new htq() { // from class: gju
                @Override // defpackage.htq
                public final hvi a() {
                    gjw gjwVar2 = gjw.this;
                    bst c = gjwVar2.c();
                    final int i = gjwVar2.d;
                    int i2 = 0;
                    hvi ap = hoq.ap(c.q(new fdt() { // from class: gjs
                        @Override // defpackage.fdt
                        public final void a(fwm fwmVar) {
                            iwq iwqVar = gjw.m;
                            StringBuilder sb = new StringBuilder();
                            ArrayList arrayList2 = new ArrayList();
                            sb.append("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
                            Long valueOf = Long.valueOf(i);
                            arrayList2.add(valueOf);
                            fwmVar.q(exf.q(sb, arrayList2));
                            StringBuilder sb2 = new StringBuilder();
                            ArrayList arrayList3 = new ArrayList();
                            sb2.append("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
                            arrayList3.add(valueOf);
                            fwmVar.q(exf.q(sb2, arrayList3));
                        }
                    }), Exception.class, new gjt(new koy(gjwVar2, 1), i2), huf.a);
                    fvr fvrVar = new fvr(new dwd(gjwVar2, 20), 18);
                    ExecutorService executorService = gjwVar2.b;
                    return hoq.au(hoq.au(hoq.au(ap, fvrVar, executorService), new fvr(new fvv(gjwVar2, map, 8), 20), executorService), new gjt(new gjr(gjwVar2, z, i2), 1), executorService);
                }
            }, hnu.ae(arrayList));
        }
        Boolean bool2 = (Boolean) obj;
        bool2.getClass();
        if (!bool2.booleanValue()) {
            return hve.a;
        }
        boolean z2 = this.b;
        gjw gjwVar2 = this.a;
        int i = gjwVar2.d;
        if (z2 && (a = gjwVar2.a()) != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(a, "rw");
                try {
                    randomAccessFile.writeInt(i);
                    ixf.j(randomAccessFile, null);
                } finally {
                }
            } catch (IOException e) {
                ((hkf) ((hkf) gjwVar2.h.g()).h(e).i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "writePackageVersionToFile", 532, "StartupAfterPackageReplacedWithRetryRunner.kt")).s("Failed to write package version to file");
            }
        }
        bst c = gjwVar2.c();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        sb.append("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
        arrayList2.add(Long.valueOf(i));
        hvi t = c.t(exf.q(sb, arrayList2));
        t.getClass();
        return t;
    }
}
