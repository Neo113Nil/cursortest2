package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzw extends exg {
    private static final hkh c = hkh.l("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl");
    public final bzq a;
    private final bov d;
    private final ConcurrentHashMap e;
    private final bwb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzw(kqn kqnVar, bwb bwbVar, bov bovVar, bzq bzqVar) {
        super(kqnVar);
        kqnVar.getClass();
        bovVar.getClass();
        this.f = bwbVar;
        this.d = bovVar;
        this.a = bzqVar;
        this.e = new ConcurrentHashMap();
    }

    private final void d(int i, String str) {
        jkj k = hqu.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        hqu hquVar = (hqu) jkpVar;
        hquVar.j = i - 2;
        hquVar.b |= 256;
        if (str != null) {
            if (!jkpVar.M()) {
                k.t();
            }
            hqu hquVar2 = (hqu) k.b;
            hquVar2.b |= 512;
            hquVar2.k = str;
        }
        bov bovVar = this.d;
        jkj k2 = hqs.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        hqs hqsVar = (hqs) k2.b;
        hqsVar.c = 31;
        hqsVar.b |= 1;
        hqu hquVar3 = (hqu) k.q();
        if (!k2.b.M()) {
            k2.t();
        }
        hqs hqsVar2 = (hqs) k2.b;
        hquVar3.getClass();
        hqsVar2.j = hquVar3;
        hqsVar2.b |= 512;
        bovVar.a((hqs) k2.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0131 A[Catch: Exception -> 0x0030, CancellationException -> 0x0033, TryCatch #5 {CancellationException -> 0x0033, Exception -> 0x0030, blocks: (B:11:0x002b, B:12:0x0121, B:14:0x0131, B:15:0x0134, B:17:0x014f, B:18:0x0152, B:20:0x016c, B:21:0x016f, B:31:0x007b, B:35:0x0099, B:36:0x00b9, B:38:0x00bf, B:40:0x00c5, B:45:0x00e1, B:48:0x00fd, B:49:0x0102, B:51:0x0108, B:53:0x0114, B:63:0x0199, B:64:0x019c, B:33:0x0085, B:60:0x0197), top: B:7:0x0025, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014f A[Catch: Exception -> 0x0030, CancellationException -> 0x0033, TryCatch #5 {CancellationException -> 0x0033, Exception -> 0x0030, blocks: (B:11:0x002b, B:12:0x0121, B:14:0x0131, B:15:0x0134, B:17:0x014f, B:18:0x0152, B:20:0x016c, B:21:0x016f, B:31:0x007b, B:35:0x0099, B:36:0x00b9, B:38:0x00bf, B:40:0x00c5, B:45:0x00e1, B:48:0x00fd, B:49:0x0102, B:51:0x0108, B:53:0x0114, B:63:0x0199, B:64:0x019c, B:33:0x0085, B:60:0x0197), top: B:7:0x0025, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016c A[Catch: Exception -> 0x0030, CancellationException -> 0x0033, TryCatch #5 {CancellationException -> 0x0033, Exception -> 0x0030, blocks: (B:11:0x002b, B:12:0x0121, B:14:0x0131, B:15:0x0134, B:17:0x014f, B:18:0x0152, B:20:0x016c, B:21:0x016f, B:31:0x007b, B:35:0x0099, B:36:0x00b9, B:38:0x00bf, B:40:0x00c5, B:45:0x00e1, B:48:0x00fd, B:49:0x0102, B:51:0x0108, B:53:0x0114, B:63:0x0199, B:64:0x019c, B:33:0x0085, B:60:0x0197), top: B:7:0x0025, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.exg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ewz ewzVar, kqj kqjVar) {
        bzv bzvVar;
        int i;
        int i2;
        jkj k;
        jkj k2;
        try {
            if (kqjVar instanceof bzv) {
                bzvVar = (bzv) kqjVar;
                int i3 = bzvVar.d;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    bzvVar.d = i3 - Integer.MIN_VALUE;
                    Object obj = bzvVar.b;
                    kqp kqpVar = kqp.a;
                    i = bzvVar.d;
                    if (i != 0) {
                        ixc.Y(obj);
                        hkh hkhVar = c;
                        hkf hkfVar = (hkf) hkhVar.e().i("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl", "importItem", 71, "TargetServiceImpl.kt");
                        igc igcVar = ewy.a;
                        int g = exf.g(ewzVar.b);
                        if (g == 0) {
                            g = 1;
                        }
                        hkfVar.u("ImportItem called for item type: %s", ewy.a(g));
                        jxr k3 = jxr.k();
                        igc igcVar2 = ewy.a;
                        k3.getClass();
                        igcVar2.getClass();
                        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((Parcelable) igcVar2.b.a(k3));
                        if (parcelFileDescriptor == null) {
                            ((hkf) hkhVar.g().i("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl", "importItem", 75, "TargetServiceImpl.kt")).s("pfd is null");
                            d(4, "NullParcelFileDescriptor");
                            jkj k4 = exa.a.k();
                            k4.getClass();
                            eos.F(k4);
                            return eos.E(k4);
                        }
                        jjq jjqVar = ewzVar.c;
                        jjqVar.getClass();
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                        try {
                            jkp w = jkp.w(jny.a, jju.L(autoCloseInputStream, 4096), jkd.a);
                            jkp.N(w);
                            jny jnyVar = (jny) w;
                            ixf.j(autoCloseInputStream, null);
                            jkx jkxVar = jnyVar.b;
                            jkxVar.getClass();
                            dzi dziVar = (dzi) ConcurrentMap$EL.computeIfAbsent(this.e, jjqVar, new ckw(new ajt(8), 1));
                            Iterator it = jkxVar.iterator();
                            while (it.hasNext()) {
                                try {
                                    bzs a = bzq.a((String) it.next(), (brn) dziVar.c);
                                    dziVar.a += a.a.size();
                                    dziVar.b += a.b;
                                } catch (bzl e) {
                                    ((hkf) ((hkf) c.g()).h(e).i("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl", "readPayloadsAndAccumulateCounts", 139, "TargetServiceImpl.kt")).s("Failed to parse CXF payload due to systemic malformation");
                                }
                            }
                            Iterator<E> it2 = jkxVar.iterator();
                            int i4 = 0;
                            while (it2.hasNext()) {
                                i4 += ((String) it2.next()).length();
                            }
                            bwb bwbVar = this.f;
                            bzvVar.a = i4;
                            bzvVar.d = 1;
                            if (bwbVar.b(jkxVar, bzvVar) == kqpVar) {
                                return kqpVar;
                            }
                            i2 = i4;
                        } finally {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = bzvVar.a;
                        ixc.Y(obj);
                    }
                    bov bovVar = this.d;
                    k = hqs.a.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    hqs hqsVar = (hqs) k.b;
                    hqsVar.c = 30;
                    hqsVar.b |= 1;
                    k2 = hqu.a.k();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    hqu hquVar = (hqu) k2.b;
                    hquVar.b |= 128;
                    hquVar.i = i2;
                    hqu hquVar2 = (hqu) k2.q();
                    if (!k.b.M()) {
                        k.t();
                    }
                    hqs hqsVar2 = (hqs) k.b;
                    hquVar2.getClass();
                    hqsVar2.j = hquVar2;
                    hqsVar2.b |= 512;
                    bovVar.a((hqs) k.q());
                    jkj k5 = exa.a.k();
                    k5.getClass();
                    return eos.E(k5);
                }
            }
            if (i != 0) {
            }
            bov bovVar2 = this.d;
            k = hqs.a.k();
            if (!k.b.M()) {
            }
            hqs hqsVar3 = (hqs) k.b;
            hqsVar3.c = 30;
            hqsVar3.b |= 1;
            k2 = hqu.a.k();
            if (!k2.b.M()) {
            }
            hqu hquVar3 = (hqu) k2.b;
            hquVar3.b |= 128;
            hquVar3.i = i2;
            hqu hquVar22 = (hqu) k2.q();
            if (!k.b.M()) {
            }
            hqs hqsVar22 = (hqs) k.b;
            hquVar22.getClass();
            hqsVar22.j = hquVar22;
            hqsVar22.b |= 512;
            bovVar2.a((hqs) k.q());
            jkj k52 = exa.a.k();
            k52.getClass();
            return eos.E(k52);
        } catch (CancellationException e2) {
            d(2, e2.getClass().getSimpleName());
            throw e2;
        } catch (Exception e3) {
            ((hkf) ((hkf) c.g()).h(e3).i("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl", "importItem", 95, "TargetServiceImpl.kt")).s("Failed to import item");
            d(3, e3.getClass().getSimpleName());
            jkj k6 = exa.a.k();
            k6.getClass();
            eos.F(k6);
            return eos.E(k6);
        }
        bzvVar = new bzv(this, kqjVar);
        Object obj2 = bzvVar.b;
        kqp kqpVar2 = kqp.a;
        i = bzvVar.d;
    }

    @Override // defpackage.exg
    public final Object b(exd exdVar) {
        hkf hkfVar = (hkf) c.e().i("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl", "handshake", 58, "TargetServiceImpl.kt");
        igc igcVar = ewy.a;
        int g = exf.g(exdVar.b);
        if (g == 0) {
            g = 1;
        }
        hkfVar.u("Handshake called for item type: %s", ewy.a(g));
        int g2 = exf.g(exdVar.b);
        if (g2 != 0 && g2 == 23) {
            jkj k = exe.a.k();
            k.getClass();
            exf.f(true, k);
            return exf.e(k);
        }
        jkj k2 = exe.a.k();
        k2.getClass();
        exf.f(false, k2);
        return exf.e(k2);
    }

    @Override // defpackage.exg
    public final Object c(exb exbVar) {
        hkf hkfVar = (hkf) c.e().i("com/google/android/apps/authenticator2/osmigrationtargetservice/TargetServiceImpl", "importItemsDone", 108, "TargetServiceImpl.kt");
        igc igcVar = ewy.a;
        int g = exf.g(exbVar.b);
        if (g == 0) {
            g = 1;
        }
        hkfVar.u("ImportItemsDone called for item type: %s", ewy.a(g));
        jjq jjqVar = exbVar.c;
        jjqVar.getClass();
        dzi dziVar = (dzi) this.e.remove(jjqVar);
        int i = dziVar != null ? dziVar.a : 0;
        int i2 = dziVar != null ? dziVar.b : 0;
        jkj k = exc.a.k();
        k.getClass();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        exc excVar = (exc) jkpVar;
        excVar.b = 1 | excVar.b;
        excVar.c = i;
        if (!jkpVar.M()) {
            k.t();
        }
        exc excVar2 = (exc) k.b;
        excVar2.b |= 2;
        excVar2.d = i2;
        jkp q = k.q();
        q.getClass();
        return (exc) q;
    }
}
