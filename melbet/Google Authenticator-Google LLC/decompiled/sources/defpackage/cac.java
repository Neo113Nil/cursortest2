package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cac extends kra implements krx {
    Object a;
    int b;
    int c;
    int d;
    int e;
    final /* synthetic */ cad f;
    final /* synthetic */ cab g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cac(cad cadVar, cab cabVar, kqj kqjVar) {
        super(2, kqjVar);
        this.f = cadVar;
        this.g = cabVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cac) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d5, code lost:
    
        if (defpackage.ixl.c(r12, r19) != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0058, code lost:
    
        if (r2 != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011f A[Catch: CancellationException -> 0x0033, Exception -> 0x0246, TryCatch #2 {Exception -> 0x0246, blocks: (B:12:0x0117, B:14:0x011f, B:15:0x0122, B:17:0x013d, B:18:0x0140, B:21:0x0144), top: B:11:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013d A[Catch: CancellationException -> 0x0033, Exception -> 0x0246, TryCatch #2 {Exception -> 0x0246, blocks: (B:12:0x0117, B:14:0x011f, B:15:0x0122, B:17:0x013d, B:18:0x0140, B:21:0x0144), top: B:11:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016d A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0183 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0199 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b7 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d4 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fd A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0213 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0229 A[Catch: Exception -> 0x0242, CancellationException -> 0x0244, TryCatch #5 {CancellationException -> 0x0244, blocks: (B:21:0x0144, B:24:0x0149, B:26:0x0157, B:27:0x015a, B:29:0x016d, B:30:0x0170, B:32:0x0183, B:33:0x0186, B:35:0x0199, B:36:0x019c, B:38:0x01b7, B:39:0x01ba, B:41:0x01d4, B:42:0x01d7, B:44:0x01fd, B:45:0x0200, B:47:0x0213, B:48:0x0216, B:50:0x0229, B:51:0x022c), top: B:20:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [j$.time.temporal.Temporal] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        int i;
        boolean z;
        int i2;
        Instant now;
        Object c;
        int i3;
        int i4;
        Object obj2;
        int i5;
        hvi a;
        int i6;
        int i7;
        ?? r11;
        jkj k;
        jkj k2;
        jkp jkpVar;
        jkp jkpVar2;
        jkp jkpVar3;
        jkp jkpVar4;
        jkj k3;
        jkp jkpVar5;
        jkp jkpVar6;
        kqp kqpVar = kqp.a;
        int i8 = this.e;
        try {
            try {
                try {
                    if (i8 == 0) {
                        ixc.Y(obj);
                        cad cadVar = this.f;
                        now = Instant.now();
                        hvi g = cadVar.d.g();
                        this.a = now;
                        this.e = 1;
                        c = ixl.c(g, this);
                    } else {
                        if (i8 != 1) {
                            i5 = this.d;
                            if (i8 == 2) {
                                i4 = this.c;
                                i3 = this.b;
                                obj2 = this.a;
                                ixc.Y(obj);
                                a = this.f.e.a();
                                this.a = obj2;
                                this.b = i3;
                                this.c = i4;
                                this.d = i5;
                                this.e = 3;
                                if (ixl.c(a, this) != kqpVar) {
                                    return kqpVar;
                                }
                                i6 = i4;
                                i7 = i3;
                                r11 = obj2;
                                cad cadVar2 = this.f;
                                Duration between = Duration.between(r11, Instant.now());
                                between.getClass();
                                cab cabVar = this.g;
                                int i9 = cabVar.d;
                                int i10 = cabVar.c;
                                bov bovVar = cadVar2.b;
                                k = hqs.a.k();
                                i2 = 4;
                                if (!k.b.M()) {
                                }
                                hqs hqsVar = (hqs) k.b;
                                hqsVar.c = 36;
                                hqsVar.b |= 1;
                                k2 = hqu.a.k();
                                if (!k2.b.M()) {
                                }
                                jkpVar = k2.b;
                                i = 2;
                                hqu hquVar = (hqu) jkpVar;
                                z = true;
                                hquVar.b |= 1;
                                hquVar.c = i9;
                                if (!jkpVar.M()) {
                                }
                                jkpVar2 = k2.b;
                                hqu hquVar2 = (hqu) jkpVar2;
                                hquVar2.b |= 2;
                                hquVar2.d = i7;
                                if (!jkpVar2.M()) {
                                }
                                jkpVar3 = k2.b;
                                hqu hquVar3 = (hqu) jkpVar3;
                                hquVar3.b |= 4;
                                hquVar3.e = i6;
                                if (!jkpVar3.M()) {
                                }
                                jkpVar4 = k2.b;
                                hqu hquVar4 = (hqu) jkpVar4;
                                hquVar4.b |= 8;
                                hquVar4.f = i5;
                                if (!jkpVar4.M()) {
                                }
                                hqu hquVar5 = (hqu) k2.b;
                                hquVar5.b |= 16;
                                hquVar5.g = i10;
                                jkb a2 = imk.a(between);
                                a2.getClass();
                                if (!k2.b.M()) {
                                }
                                hqu hquVar6 = (hqu) k2.b;
                                hquVar6.h = a2;
                                hquVar6.b |= 32;
                                hqu hquVar7 = (hqu) k2.q();
                                if (!k.b.M()) {
                                }
                                hqs hqsVar2 = (hqs) k.b;
                                hquVar7.getClass();
                                hqsVar2.j = hquVar7;
                                hqsVar2.b |= 512;
                                bovVar.a((hqs) k.q());
                                k3 = cae.a.k();
                                if (!k3.b.M()) {
                                }
                                jkpVar5 = k3.b;
                                cae caeVar = (cae) jkpVar5;
                                caeVar.b |= 1;
                                caeVar.c = i6;
                                if (!jkpVar5.M()) {
                                }
                                jkpVar6 = k3.b;
                                cae caeVar2 = (cae) jkpVar6;
                                caeVar2.b |= 2;
                                caeVar2.d = i10;
                                if (!jkpVar6.M()) {
                                }
                                cae caeVar3 = (cae) k3.b;
                                caeVar3.b |= 4;
                                caeVar3.e = i5;
                                cae caeVar4 = (cae) k3.q();
                                caeVar4.getClass();
                                return caeVar4;
                            }
                            i6 = this.c;
                            i7 = this.b;
                            Object obj3 = this.a;
                            ixc.Y(obj);
                            r11 = obj3;
                            cad cadVar22 = this.f;
                            Duration between2 = Duration.between(r11, Instant.now());
                            between2.getClass();
                            cab cabVar2 = this.g;
                            int i92 = cabVar2.d;
                            int i102 = cabVar2.c;
                            bov bovVar2 = cadVar22.b;
                            k = hqs.a.k();
                            i2 = 4;
                            try {
                                if (!k.b.M()) {
                                    k.t();
                                }
                                hqs hqsVar3 = (hqs) k.b;
                                hqsVar3.c = 36;
                                hqsVar3.b |= 1;
                                k2 = hqu.a.k();
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                jkpVar = k2.b;
                                i = 2;
                            } catch (Exception e) {
                                e = e;
                                z = true;
                            }
                            try {
                                hqu hquVar8 = (hqu) jkpVar;
                                z = true;
                                try {
                                    hquVar8.b |= 1;
                                    hquVar8.c = i92;
                                    if (!jkpVar.M()) {
                                        k2.t();
                                    }
                                    jkpVar2 = k2.b;
                                    hqu hquVar22 = (hqu) jkpVar2;
                                    hquVar22.b |= 2;
                                    hquVar22.d = i7;
                                    if (!jkpVar2.M()) {
                                        k2.t();
                                    }
                                    jkpVar3 = k2.b;
                                    hqu hquVar32 = (hqu) jkpVar3;
                                    hquVar32.b |= 4;
                                    hquVar32.e = i6;
                                    if (!jkpVar3.M()) {
                                        k2.t();
                                    }
                                    jkpVar4 = k2.b;
                                    hqu hquVar42 = (hqu) jkpVar4;
                                    hquVar42.b |= 8;
                                    hquVar42.f = i5;
                                    if (!jkpVar4.M()) {
                                        k2.t();
                                    }
                                    hqu hquVar52 = (hqu) k2.b;
                                    hquVar52.b |= 16;
                                    hquVar52.g = i102;
                                    jkb a22 = imk.a(between2);
                                    a22.getClass();
                                    if (!k2.b.M()) {
                                        k2.t();
                                    }
                                    hqu hquVar62 = (hqu) k2.b;
                                    hquVar62.h = a22;
                                    hquVar62.b |= 32;
                                    hqu hquVar72 = (hqu) k2.q();
                                    if (!k.b.M()) {
                                        k.t();
                                    }
                                    hqs hqsVar22 = (hqs) k.b;
                                    hquVar72.getClass();
                                    hqsVar22.j = hquVar72;
                                    hqsVar22.b |= 512;
                                    bovVar2.a((hqs) k.q());
                                    k3 = cae.a.k();
                                    if (!k3.b.M()) {
                                        k3.t();
                                    }
                                    jkpVar5 = k3.b;
                                    cae caeVar5 = (cae) jkpVar5;
                                    caeVar5.b |= 1;
                                    caeVar5.c = i6;
                                    if (!jkpVar5.M()) {
                                        k3.t();
                                    }
                                    jkpVar6 = k3.b;
                                    cae caeVar22 = (cae) jkpVar6;
                                    caeVar22.b |= 2;
                                    caeVar22.d = i102;
                                    if (!jkpVar6.M()) {
                                        k3.t();
                                    }
                                    cae caeVar32 = (cae) k3.b;
                                    caeVar32.b |= 4;
                                    caeVar32.e = i5;
                                    cae caeVar42 = (cae) k3.q();
                                    caeVar42.getClass();
                                    return caeVar42;
                                } catch (Exception e2) {
                                    e = e2;
                                    ((hkf) ((hkf) cad.a.g()).h(e).i("com/google/android/apps/authenticator2/osmigrationtargetservice/dataservice/StagedMigrationImporterImpl", "performImport$<anonymous>", 84, "StagedMigrationImporterImpl.kt")).s("Failed to import staged data.");
                                    this.f.a(z != (e instanceof bzl) ? 5 : i2, e.getClass().getSimpleName());
                                    throw e;
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                this.f.a(i, e.getClass().getSimpleName());
                                throw e;
                            }
                        }
                        ?? r2 = this.a;
                        ixc.Y(obj);
                        now = r2;
                        c = obj;
                    }
                    hel helVar = (hel) c;
                    helVar.getClass();
                    hel helVar2 = this.g.b;
                    ArrayList arrayList = new ArrayList(ixc.w(helVar));
                    Iterator it = helVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((bpc) it.next()).e());
                    }
                    Set s = ixc.s(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    hjs listIterator = helVar2.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        if (!s.contains(((bpc) next).e())) {
                            arrayList2.add(next);
                        }
                    }
                    int i11 = ((his) helVar2).c;
                    int size = arrayList2.size();
                    int i12 = i11 - size;
                    if (!arrayList2.isEmpty()) {
                        hvi hviVar = this.f.d.c(arrayList2).a;
                        this.a = now;
                        this.b = i11;
                        this.c = size;
                        this.d = i12;
                        this.e = 2;
                    }
                    i3 = i11;
                    i4 = size;
                    obj2 = now;
                    i5 = i12;
                    a = this.f.e.a();
                    this.a = obj2;
                    this.b = i3;
                    this.c = i4;
                    this.d = i5;
                    this.e = 3;
                    if (ixl.c(a, this) != kqpVar) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    z = true;
                    i2 = 4;
                }
            } catch (CancellationException e5) {
                e = e5;
                i = 2;
            }
        } catch (CancellationException e6) {
            this.f.a(2, e6.getClass().getSimpleName());
            throw e6;
        } catch (Exception e7) {
            ((hkf) ((hkf) cad.a.g()).h(e7).i("com/google/android/apps/authenticator2/osmigrationtargetservice/dataservice/StagedMigrationImporterImpl", "performImport$<anonymous>", 45, "StagedMigrationImporterImpl.kt")).s("Failed to load existing OTPs.");
            this.f.a(5, e7.getClass().getSimpleName());
            throw e7;
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new cac(this.f, this.g, kqjVar);
    }
}
