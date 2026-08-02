package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwl implements Runnable {
    public final gvn a;
    public final UUID b;
    public final String c;
    public final boolean d;
    public final gvy e;
    public final AtomicReference f;
    public hvi g;
    private final long i;
    private final boolean k;
    private final Set j = new HashSet();
    int h = 0;

    public gwl(gvn gvnVar, UUID uuid, String str, gvy gvyVar, gwk gwkVar, long j, boolean z, boolean z2) {
        this.a = gvnVar;
        this.b = uuid;
        this.c = str;
        this.e = gvyVar;
        this.i = j;
        this.d = z;
        this.k = z2;
        this.f = new AtomicReference(gwkVar);
    }

    public final long a() {
        return (this.k ? dih.s().toMillis() * 1000000 : dih.q()) - this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[Catch: all -> 0x027e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0017, B:10:0x001c, B:13:0x0039, B:15:0x0049, B:18:0x0055, B:20:0x006c, B:22:0x0072, B:24:0x007a, B:25:0x007d, B:27:0x008c, B:28:0x0092, B:29:0x00a9, B:31:0x00b1, B:33:0x00b7, B:35:0x00bf, B:36:0x00c2, B:38:0x00d1, B:39:0x00d7, B:41:0x00ee, B:45:0x00f4, B:47:0x00fe, B:49:0x0103, B:52:0x0112, B:53:0x0118, B:54:0x011c, B:56:0x0122, B:59:0x012f, B:61:0x0138, B:63:0x0144, B:65:0x014d, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:77:0x0170, B:82:0x018c, B:84:0x01a1, B:86:0x01a3, B:93:0x01b8, B:95:0x01bc, B:96:0x01dc, B:98:0x01e5, B:100:0x01e7, B:105:0x01c9, B:106:0x01d2, B:108:0x01ea, B:110:0x01ef, B:112:0x0205, B:113:0x0208, B:115:0x0222, B:116:0x0225, B:118:0x0242, B:119:0x0245, B:120:0x0254, B:123:0x0265, B:124:0x026c, B:127:0x026e, B:128:0x0275, B:129:0x0276, B:130:0x027d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276 A[Catch: all -> 0x027e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0017, B:10:0x001c, B:13:0x0039, B:15:0x0049, B:18:0x0055, B:20:0x006c, B:22:0x0072, B:24:0x007a, B:25:0x007d, B:27:0x008c, B:28:0x0092, B:29:0x00a9, B:31:0x00b1, B:33:0x00b7, B:35:0x00bf, B:36:0x00c2, B:38:0x00d1, B:39:0x00d7, B:41:0x00ee, B:45:0x00f4, B:47:0x00fe, B:49:0x0103, B:52:0x0112, B:53:0x0118, B:54:0x011c, B:56:0x0122, B:59:0x012f, B:61:0x0138, B:63:0x0144, B:65:0x014d, B:67:0x0151, B:69:0x0157, B:73:0x0160, B:77:0x0170, B:82:0x018c, B:84:0x01a1, B:86:0x01a3, B:93:0x01b8, B:95:0x01bc, B:96:0x01dc, B:98:0x01e5, B:100:0x01e7, B:105:0x01c9, B:106:0x01d2, B:108:0x01ea, B:110:0x01ef, B:112:0x0205, B:113:0x0208, B:115:0x0222, B:116:0x0225, B:118:0x0242, B:119:0x0245, B:120:0x0254, B:123:0x0265, B:124:0x026c, B:127:0x026e, B:128:0x0275, B:129:0x0276, B:130:0x027d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final gwb b() {
        int i;
        gwk[] gwkVarArr;
        int i2;
        SparseArray sparseArray;
        boolean z;
        int i3;
        String str;
        gwb gwbVar;
        synchronized (this) {
            gwk gwkVar = (gwk) this.f.get();
            boolean z2 = true;
            int i4 = gwkVar.h + 1;
            gwk[] gwkVarArr2 = new gwk[i4];
            while (gwkVar != null) {
                int i5 = gwkVar.h;
                if (i5 < 0) {
                    break;
                }
                gwkVarArr2[i5] = gwkVar;
                gwkVar = gwkVar.i;
            }
            jkj C = this.e.C();
            SparseArray sparseArray2 = new SparseArray(i4);
            int i6 = 0;
            gwk gwkVar2 = gwkVarArr2[0];
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            gwk gwkVar3 = null;
            int i7 = 0;
            while (true) {
                i = -1;
                if (i7 >= i4) {
                    break;
                }
                gwk gwkVar4 = gwkVarArr2[i7];
                guc gucVar = gwkVar4.g;
                gtz j = guc.j(gul.c, gucVar);
                if (j.b()) {
                    ((gtc) j.a()).a();
                    if (gwkVar4 != gwkVar2) {
                        gwkVar3 = gwkVar4;
                    }
                }
                boolean z3 = z2;
                sparseArray2.append(gwkVar4.h, guc.e(gucVar, gwkVar4.c()));
                String str2 = gwkVar4.d;
                if (!str2.isEmpty() && !hashMap.containsKey(str2)) {
                    if (!C.b.M()) {
                        C.t();
                    }
                    gvy gvyVar = (gvy) C.b;
                    str2.getClass();
                    jkx jkxVar = gvyVar.k;
                    if (!jkxVar.c()) {
                        gvyVar.k = jkp.A(jkxVar);
                    }
                    gvyVar.k.add(str2);
                    hashMap.put(str2, Integer.valueOf(((gvy) C.b).k.size() - 1));
                }
                String str3 = gwkVar4.e;
                if (!str3.isEmpty() && !hashMap2.containsKey(str3)) {
                    if (!C.b.M()) {
                        C.t();
                    }
                    gvy gvyVar2 = (gvy) C.b;
                    str3.getClass();
                    jkx jkxVar2 = gvyVar2.l;
                    if (!jkxVar2.c()) {
                        gvyVar2.l = jkp.A(jkxVar2);
                    }
                    gvyVar2.l.add(str3);
                    hashMap2.put(str3, Integer.valueOf(((gvy) C.b).l.size() - 1));
                }
                i7++;
                z2 = z3;
            }
            boolean z4 = z2;
            Set set = this.j;
            if (!set.isEmpty()) {
                int[] iArr = new int[i4];
                for (int i8 = 0; i8 < i4; i8++) {
                    gwk gwkVar5 = gwkVarArr2[i8];
                    iArr[gwkVar5.h] = gwkVar5.a();
                }
                if (gwkVar3 != null) {
                    int i9 = gwkVar3.h;
                    iArr[i9] = -1;
                    iArr[0] = i9;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    iArr = ((gud) it.next()).a();
                }
                if (iArr != null) {
                    BitSet bitSet = new BitSet(i4);
                    int i10 = 0;
                    boolean z5 = false;
                    while (i10 < i4) {
                        gwk gwkVar6 = gwkVarArr2[i10];
                        int i11 = i6;
                        int i12 = gwkVar6.h;
                        gwk[] gwkVarArr3 = gwkVarArr2;
                        if (iArr[i12] == i) {
                            hoq.y(!z5, "Can't have more than one root in the trace tree");
                            z5 = z4;
                        }
                        while (true) {
                            i12 = iArr[i12];
                            if (i12 != i && !bitSet.get(i12)) {
                                hoq.C(i12 != gwkVar6.h ? z4 : i11, "Detected loop in the newly constructed graph! Span %s is in the loop", gwkVar6.c);
                                bitSet.set(i12);
                                sparseArray2 = sparseArray2;
                                i = -1;
                            }
                        }
                        bitSet.set(gwkVar6.h);
                        i10++;
                        i6 = i11;
                        gwkVarArr2 = gwkVarArr3;
                        sparseArray2 = sparseArray2;
                        i = -1;
                    }
                    gwkVarArr = gwkVarArr2;
                    i2 = i6;
                    sparseArray = sparseArray2;
                    int i13 = i2;
                    i3 = i13;
                    while (i13 < i4) {
                        gwk gwkVar7 = gwkVarArr[i13];
                        C.E(gwkVar7.b(this.d, iArr[gwkVar7.h], hashMap, hashMap2));
                        if (!gwkVar7.e()) {
                            i3++;
                        }
                        i13++;
                    }
                    z = z4;
                    if (!z) {
                        for (int i14 = i2; i14 < i4; i14++) {
                            gwk gwkVar8 = gwkVarArr[i14];
                            C.E(gwkVar8 == gwkVar3 ? gwkVar8.b(this.d, -1, hashMap, hashMap2) : (gwkVar3 == null || gwkVar8 != gwkVar2) ? gwkVar8.b(this.d, gwkVar8.a(), hashMap, hashMap2) : gwkVar8.b(this.d, gwkVar3.h, hashMap, hashMap2));
                            if (!gwkVar8.e()) {
                                i3++;
                            }
                        }
                    }
                    int i15 = i3;
                    if (this.h != 0) {
                        jkj k = gsk.a.k();
                        jkj k2 = gsj.a.k();
                        int i16 = this.h;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        gsj gsjVar = (gsj) k2.b;
                        gsjVar.b |= 1;
                        gsjVar.c = i16;
                        gsj gsjVar2 = (gsj) k2.q();
                        if (!k.b.M()) {
                            k.t();
                        }
                        gsk gskVar = (gsk) k.b;
                        gsjVar2.getClass();
                        gskVar.c = gsjVar2;
                        gskVar.b |= 1;
                        gsk gskVar2 = (gsk) k.q();
                        if (!C.b.M()) {
                            C.t();
                        }
                        gvy gvyVar3 = (gvy) C.b;
                        gskVar2.getClass();
                        gvyVar3.i = gskVar2;
                        gvyVar3.b |= 32;
                    }
                    str = gwkVarArr[i2].c;
                    UUID uuid = this.b;
                    gvy gvyVar4 = (gvy) C.q();
                    if (str != null) {
                        throw new NullPointerException("Null name");
                    }
                    if (gvyVar4 == null) {
                        throw new NullPointerException("Null record");
                    }
                    gwbVar = new gwb(str, uuid, gvyVar4, sparseArray, i15);
                }
            }
            gwkVarArr = gwkVarArr2;
            i2 = 0;
            sparseArray = sparseArray2;
            z = false;
            i3 = 0;
            if (!z) {
            }
            int i152 = i3;
            if (this.h != 0) {
            }
            str = gwkVarArr[i2].c;
            UUID uuid2 = this.b;
            gvy gvyVar42 = (gvy) C.q();
            if (str != null) {
            }
        }
        return gwbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0032, code lost:
    
        r9 = r9 - r4.g;
        r1 = r4.c.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0044, code lost:
    
        if (r1.hasNext() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0046, code lost:
    
        r11 = (defpackage.gwl) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0052, code lost:
    
        if (r11.e.g >= r9) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0065, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0069, code lost:
    
        r6 = ((defpackage.hvm) r4.b.b()).schedule(new defpackage.cov(12), 10, java.util.concurrent.TimeUnit.SECONDS);
        r11.getClass();
        r6.c(new defpackage.gfm(r11, 15), defpackage.huf.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0087, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0092, code lost:
    
        ((defpackage.hkf) ((defpackage.hkf) ((defpackage.hkf) defpackage.gvn.a.f()).h(r0.getCause())).i("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 323, "TraceManagerImpl.java")).u("Trace %s failed collection", r2.a);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0221  */
    /* JADX WARN: Type inference failed for: r20v0, types: [gwl] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        gzp gzpVar;
        boolean z2;
        hvi hviVar = this.g;
        gwb b = b();
        boolean isCancelled = hviVar.isCancelled();
        gvn gvnVar = this.a;
        try {
            if (isCancelled) {
                this = 1;
                z2 = true;
                gvy gvyVar = b.c;
                gsk gskVar = gvyVar.i;
                if (gskVar == null) {
                    gskVar = gsk.a;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - gvyVar.g;
                jkj C = gvyVar.C();
                jkj C2 = gskVar.C();
                jkj k = gsi.a.k();
                int i = b.e;
                if (!k.b.M()) {
                    k.t();
                }
                jkp jkpVar = k.b;
                gsi gsiVar = (gsi) jkpVar;
                gsiVar.b |= 2;
                gsiVar.d = i;
                if (!jkpVar.M()) {
                    k.t();
                }
                gsi gsiVar2 = (gsi) k.b;
                gsiVar2.b |= 1;
                gsiVar2.c = elapsedRealtime;
                gsi gsiVar3 = (gsi) k.q();
                if (!C2.b.M()) {
                    C2.t();
                }
                gsk gskVar2 = (gsk) C2.b;
                gsiVar3.getClass();
                gskVar2.d = gsiVar3;
                gskVar2.b |= 2;
                gsk gskVar3 = (gsk) C2.q();
                if (!C.b.M()) {
                    C.t();
                }
                gvy gvyVar2 = (gvy) C.b;
                gskVar3.getClass();
                gvyVar2.i = gskVar3;
                gvyVar2.b |= 32;
                gvy gvyVar3 = (gvy) C.q();
                int size = gvyVar3.e.size() - 1;
                ArrayList arrayList = new ArrayList();
                for (int i2 = -1; size != i2; i2 = -1) {
                    gtx gtxVar = (gtx) gvyVar3.e.get(size);
                    long j = elapsedRealtime;
                    arrayList.add(new StackTraceElement("tk_trace", String.valueOf(gtxVar.c).concat((gtxVar.b & 32) == 0 ? " (Timed Out)" : ""), "Started After", (int) (gtxVar.f / 1000)));
                    size = ((gtx) gvyVar3.e.get(size)).e;
                    elapsedRealtime = j;
                }
                long j2 = elapsedRealtime;
                z = false;
                try {
                    gwd gwdVar = new gwd(null, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    gwd.j(gvyVar3, Collections.singletonMap(0, gwdVar), 0, new HashMap());
                    hkf hkfVar = (hkf) ((hkf) ((hkf) gvn.a.f()).h(gwdVar)).i("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 372, "TraceManagerImpl.java");
                    String str = b.a;
                    hkfVar.x("Trace %s timed out after %d ms. Complete trace: %s", str, Long.valueOf(j2), gvyVar3);
                    gvnVar.b(gvyVar3, b.d, str);
                } catch (Throwable th) {
                    th = th;
                    hoq.H(((gwl) gvnVar.c.remove(b.b)) == null ? this : z);
                    gzpVar = gvnVar.d;
                    if (gzpVar.f() && isCancelled) {
                        ((gsd) gzpVar.b()).a();
                    }
                    throw th;
                }
            } else {
                try {
                    hnu.aR(hviVar);
                    gvy gvyVar4 = b.c;
                    long j3 = gvyVar4.g;
                    while (true) {
                        AtomicLong atomicLong = gvnVar.e;
                        long j4 = atomicLong.get();
                        if (j3 > j4) {
                            if (atomicLong.compareAndSet(j4, 300000 + j3)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    z2 = true;
                    z2 = true;
                    gvnVar.b(gvyVar4, b.d, b.a);
                } catch (ExecutionException e) {
                    e = e;
                    z2 = true;
                } catch (Throwable th2) {
                    th = th2;
                    this = 1;
                    z = false;
                    hoq.H(((gwl) gvnVar.c.remove(b.b)) == null ? this : z);
                    gzpVar = gvnVar.d;
                    if (gzpVar.f()) {
                        ((gsd) gzpVar.b()).a();
                    }
                    throw th;
                }
                z = false;
            }
            hoq.H(((gwl) gvnVar.c.remove(b.b)) == null ? z2 : z);
            gzp gzpVar2 = gvnVar.d;
            if (gzpVar2.f() || !isCancelled) {
                return;
            }
            ((gsd) gzpVar2.b()).a();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String toString() {
        return "UnfinishedTrace@" + Integer.toHexString(System.identityHashCode(this)) + "[" + b().a + "]";
    }
}
