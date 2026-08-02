package defpackage;

import j$.time.Instant;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpm implements htr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bpm(bpr bprVar, Object obj, long j, int i) {
        this.d = i;
        this.b = bprVar;
        this.c = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        int i;
        switch (this.d) {
            case 0:
                final long j = this.a;
                final ?? r2 = this.c;
                return ((bpr) this.b).e.q(new fdt() { // from class: bpk
                    @Override // defpackage.fdt
                    public final void a(fwm fwmVar) {
                        Iterator it = r2.iterator();
                        while (it.hasNext()) {
                            bpr.i(fwmVar, ((bpc) it.next()).g, j);
                        }
                    }
                });
            case 1:
                final long j2 = this.a;
                final String str = (String) this.c;
                return ((bpr) this.b).e.p(new fds() { // from class: bph
                    @Override // defpackage.fds
                    public final Object a(fwm fwmVar) {
                        String str2 = str;
                        if (bpr.i(fwmVar, str2, j2) > 0) {
                            return str2;
                        }
                        throw new bpd("Could not soft delete an otp in the local database.");
                    }
                });
            case 2:
                Exception exc = (Exception) obj;
                jkj k = hqs.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                long j3 = this.a;
                hqs hqsVar = (hqs) k.b;
                hqsVar.c = 4;
                hqsVar.b |= 1;
                long epochMilli = Instant.now().toEpochMilli() - j3;
                if (!k.b.M()) {
                    k.t();
                }
                Object obj2 = this.b;
                jkp jkpVar = k.b;
                hqs hqsVar2 = (hqs) jkpVar;
                hqsVar2.b = 8 | hqsVar2.b;
                hqsVar2.f = epochMilli;
                if (!jkpVar.M()) {
                    k.t();
                }
                caz cazVar = (caz) obj2;
                String str2 = cazVar.e;
                jkp jkpVar2 = k.b;
                hqs hqsVar3 = (hqs) jkpVar2;
                str2.getClass();
                hqsVar3.b |= 64;
                hqsVar3.g = str2;
                i = exc instanceof kbt ? ((kbt) exc).a.o.r : -1;
                if (!jkpVar2.M()) {
                    k.t();
                }
                bov bovVar = cazVar.b;
                ?? r10 = this.c;
                hqs hqsVar4 = (hqs) k.b;
                hqsVar4.b |= 4;
                hqsVar4.e = i;
                bovVar.a((hqs) k.q());
                return r10;
            case 3:
                Exception exc2 = (Exception) obj;
                jkj k2 = hqs.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                long j4 = this.a;
                hqs hqsVar5 = (hqs) k2.b;
                hqsVar5.c = 8;
                hqsVar5.b |= 1;
                long epochMilli2 = Instant.now().toEpochMilli() - j4;
                if (!k2.b.M()) {
                    k2.t();
                }
                Object obj3 = this.b;
                jkp jkpVar3 = k2.b;
                hqs hqsVar6 = (hqs) jkpVar3;
                hqsVar6.b = 8 | hqsVar6.b;
                hqsVar6.f = epochMilli2;
                if (!jkpVar3.M()) {
                    k2.t();
                }
                caz cazVar2 = (caz) obj3;
                String str3 = cazVar2.e;
                jkp jkpVar4 = k2.b;
                hqs hqsVar7 = (hqs) jkpVar4;
                str3.getClass();
                hqsVar7.b |= 64;
                hqsVar7.g = str3;
                i = exc2 instanceof kbt ? ((kbt) exc2).a.o.r : -1;
                if (!jkpVar4.M()) {
                    k2.t();
                }
                bov bovVar2 = cazVar2.b;
                ?? r102 = this.c;
                hqs hqsVar8 = (hqs) k2.b;
                hqsVar8.b |= 4;
                hqsVar8.e = i;
                bovVar2.a((hqs) k2.q());
                return r102;
            case 4:
                Exception exc3 = (Exception) obj;
                jkj k3 = hqs.a.k();
                if (!k3.b.M()) {
                    k3.t();
                }
                long j5 = this.a;
                hqs hqsVar9 = (hqs) k3.b;
                hqsVar9.c = 2;
                hqsVar9.b |= 1;
                long epochMilli3 = Instant.now().toEpochMilli() - j5;
                if (!k3.b.M()) {
                    k3.t();
                }
                Object obj4 = this.b;
                jkp jkpVar5 = k3.b;
                hqs hqsVar10 = (hqs) jkpVar5;
                hqsVar10.b = 8 | hqsVar10.b;
                hqsVar10.f = epochMilli3;
                if (!jkpVar5.M()) {
                    k3.t();
                }
                caz cazVar3 = (caz) obj4;
                String str4 = cazVar3.e;
                jkp jkpVar6 = k3.b;
                hqs hqsVar11 = (hqs) jkpVar6;
                str4.getClass();
                hqsVar11.b |= 64;
                hqsVar11.g = str4;
                i = exc3 instanceof kbt ? ((kbt) exc3).a.o.r : -1;
                if (!jkpVar6.M()) {
                    k3.t();
                }
                bov bovVar3 = cazVar3.b;
                ?? r103 = this.c;
                hqs hqsVar12 = (hqs) k3.b;
                hqsVar12.b |= 4;
                hqsVar12.e = i;
                bovVar3.a((hqs) k3.q());
                return r103;
            case 5:
                Exception exc4 = (Exception) obj;
                jkj k4 = hqs.a.k();
                if (!k4.b.M()) {
                    k4.t();
                }
                long j6 = this.a;
                hqs hqsVar13 = (hqs) k4.b;
                hqsVar13.c = 6;
                hqsVar13.b |= 1;
                long epochMilli4 = Instant.now().toEpochMilli() - j6;
                if (!k4.b.M()) {
                    k4.t();
                }
                Object obj5 = this.b;
                jkp jkpVar7 = k4.b;
                hqs hqsVar14 = (hqs) jkpVar7;
                hqsVar14.b = 8 | hqsVar14.b;
                hqsVar14.f = epochMilli4;
                if (!jkpVar7.M()) {
                    k4.t();
                }
                caz cazVar4 = (caz) obj5;
                String str5 = cazVar4.e;
                jkp jkpVar8 = k4.b;
                hqs hqsVar15 = (hqs) jkpVar8;
                str5.getClass();
                hqsVar15.b |= 64;
                hqsVar15.g = str5;
                i = exc4 instanceof kbt ? ((kbt) exc4).a.o.r : -1;
                if (!jkpVar8.M()) {
                    k4.t();
                }
                bov bovVar4 = cazVar4.b;
                ?? r104 = this.c;
                hqs hqsVar16 = (hqs) k4.b;
                hqsVar16.b |= 4;
                hqsVar16.e = i;
                bovVar4.a((hqs) k4.q());
                return r104;
            case 6:
                Exception exc5 = (Exception) obj;
                jkj k5 = hqs.a.k();
                if (!k5.b.M()) {
                    k5.t();
                }
                long j7 = this.a;
                hqs hqsVar17 = (hqs) k5.b;
                hqsVar17.c = 18;
                hqsVar17.b |= 1;
                long epochMilli5 = Instant.now().toEpochMilli() - j7;
                if (!k5.b.M()) {
                    k5.t();
                }
                Object obj6 = this.b;
                jkp jkpVar9 = k5.b;
                hqs hqsVar18 = (hqs) jkpVar9;
                hqsVar18.b = 8 | hqsVar18.b;
                hqsVar18.f = epochMilli5;
                if (!jkpVar9.M()) {
                    k5.t();
                }
                caz cazVar5 = (caz) obj6;
                String str6 = cazVar5.e;
                jkp jkpVar10 = k5.b;
                hqs hqsVar19 = (hqs) jkpVar10;
                str6.getClass();
                hqsVar19.b |= 64;
                hqsVar19.g = str6;
                i = exc5 instanceof kbt ? ((kbt) exc5).a.o.r : -1;
                if (!jkpVar10.M()) {
                    k5.t();
                }
                bov bovVar5 = cazVar5.b;
                ?? r105 = this.c;
                hqs hqsVar20 = (hqs) k5.b;
                hqsVar20.b |= 4;
                hqsVar20.e = i;
                bovVar5.a((hqs) k5.q());
                return r105;
            case 7:
                ((hkf) ((hkf) ((hkf) cbe.a.g()).h((Exception) obj)).i("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl", "moveOtpsToTiktokAsyncDatabase", 298, "PreTikTokDatabaseMigrationImpl.java")).s("Could not migrate the local database from a pre-tiktok release");
                jkj k6 = hqs.a.k();
                if (!k6.b.M()) {
                    k6.t();
                }
                hqs hqsVar21 = (hqs) k6.b;
                hqsVar21.c = 101;
                hqsVar21.b |= 1;
                jkj k7 = hqy.a.k();
                if (!k7.b.M()) {
                    k7.t();
                }
                long j8 = this.a;
                hqy hqyVar = (hqy) k7.b;
                hqyVar.b |= 1;
                hqyVar.c = false;
                long epochMilli6 = Instant.now().toEpochMilli() - j8;
                if (!k7.b.M()) {
                    k7.t();
                }
                hqy hqyVar2 = (hqy) k7.b;
                hqyVar2.b = 2 | hqyVar2.b;
                hqyVar2.d = epochMilli6;
                hqy hqyVar3 = (hqy) k7.q();
                if (!k6.b.M()) {
                    k6.t();
                }
                Object obj7 = this.b;
                hqs hqsVar22 = (hqs) k6.b;
                hqyVar3.getClass();
                hqsVar22.h = hqyVar3;
                hqsVar22.b |= 128;
                cbe cbeVar = (cbe) obj7;
                String a = cch.a(cbeVar.b);
                if (!k6.b.M()) {
                    k6.t();
                }
                bov bovVar6 = cbeVar.d;
                ?? r106 = this.c;
                hqs hqsVar23 = (hqs) k6.b;
                a.getClass();
                hqsVar23.b |= 64;
                hqsVar23.g = a;
                bovVar6.a((hqs) k6.q());
                return r106;
            default:
                return ((fuy) this.b).b(this.a, (fuz) hnu.aR(this.c));
        }
    }

    public /* synthetic */ bpm(Object obj, long j, hvi hviVar, int i) {
        this.d = i;
        this.b = obj;
        this.a = j;
        this.c = hviVar;
    }
}
