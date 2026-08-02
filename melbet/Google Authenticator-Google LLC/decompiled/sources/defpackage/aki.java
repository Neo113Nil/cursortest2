package defpackage;

import android.accounts.Account;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aki extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(ajk ajkVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = ajkVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 1:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 2:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 3:
                kqj c = c((kvm) obj, (kqj) obj2);
                kow kowVar = kow.a;
                ((aki) c).b(kowVar);
                return kowVar;
            case 4:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 5:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 6:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 7:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 8:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 9:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 10:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 11:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 15:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 16:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 17:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            case 18:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
            default:
                return ((aki) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0200, code lost:
    
        if (r9 == r0) goto L109;
     */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r9v54, types: [aer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v66, types: [java.lang.Object, kzq] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        Object avgVar;
        Object avfVar;
        switch (this.c) {
            case 0:
                kqp kqpVar = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj2 = this.b;
                    this.a = 1;
                    if (((akt) obj2).e(this) == kqpVar) {
                        return kqpVar;
                    }
                }
                return kow.a;
            case 1:
                kqp kqpVar2 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj3 = this.b;
                    this.a = 1;
                    if (((ajk) obj3).a(this) == kqpVar2) {
                        return kqpVar2;
                    }
                }
                return kow.a;
            case 2:
                kqp kqpVar3 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
                Object obj4 = this.b;
                this.a = 1;
                Object cb = ((kxb) obj4).cb(this);
                return cb == kqpVar3 ? kqpVar3 : cb;
            case 3:
                if (this.a != 0) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
                this.a = 1;
                throw new IllegalStateException("Not implemented");
            case 4:
                kqp kqpVar4 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
                Object obj5 = this.b;
                this.a = 1;
                Object c = ((CoroutineWorker) obj5).c(this);
                return c == kqpVar4 ? kqpVar4 : c;
            case 5:
                kqp kqpVar5 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
                Object obj6 = this.b;
                this.a = 1;
                Object b = ((avi) obj6).b(this);
                return b == kqpVar5 ? kqpVar5 : b;
            case 6:
                kqp kqpVar6 = kqp.a;
                try {
                    if (this.a != 0) {
                        ixc.Y(obj);
                    } else {
                        ixc.Y(obj);
                        Object obj7 = this.b;
                        kww kwwVar = ((avi) obj7).j;
                        aki akiVar = new aki((avi) obj7, (kqj) null, 5);
                        this.a = 1;
                        obj = ixg.f(kwwVar, akiVar, this);
                        if (obj == kqpVar6) {
                            return kqpVar6;
                        }
                    }
                    avgVar = (zy) obj;
                } catch (ava e) {
                    avfVar = new avf(e.a);
                } catch (CancellationException unused) {
                    avgVar = new avd();
                } catch (Throwable th) {
                    asq.a().d(avk.a, "Unexpected error in WorkerWrapper", th);
                    avgVar = new avg(false);
                }
                avfVar = avgVar;
                Object obj8 = this.b;
                ksu ksuVar = new ksu();
                ((avi) obj8).e.o(new ajx(avfVar, (Object) ksuVar, obj8, 6, (char[]) null));
                return Boolean.valueOf(ksuVar.a);
            case 7:
                kqp kqpVar7 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                    return obj;
                }
                ixc.Y(obj);
                Object obj9 = this.b;
                this.a = 1;
                Object j = ((ConstraintTrackingWorker) obj9).j(this);
                return j == kqpVar7 ? kqpVar7 : j;
            case 8:
                kqp kqpVar8 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                    return null;
                }
                ixc.Y(obj);
                Object obj10 = this.b;
                this.a = 1;
                if (((caa) obj10).f.c(this) == kqpVar8) {
                    return kqpVar8;
                }
                return null;
            case 9:
                kqp kqpVar9 = kqp.a;
                int i = this.a;
                if (i == 0) {
                    ixc.Y(obj);
                    Object obj11 = this.b;
                    this.a = 1;
                    obj = ((caa) obj11).f.d(this);
                    break;
                } else {
                    if (i != 1) {
                        ixc.Y(obj);
                        return obj;
                    }
                    ixc.Y(obj);
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    int i2 = hel.d;
                    hel helVar = his.a;
                    helVar.getClass();
                    return new cab(false, helVar, 0, 0);
                }
                caa caaVar = (caa) this.b;
                bzz bzzVar = new bzz(caaVar, list, null);
                this.a = 2;
                Object f = ixg.f(caaVar.d, bzzVar, this);
                return f == kqpVar9 ? kqpVar9 : f;
            case 10:
                kqp kqpVar10 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    dtf dtfVar = new dtf((dtj) this.b, (kqj) null, 0);
                    this.a = 1;
                    if (kvp.f(dtfVar, this) == kqpVar10) {
                        return kqpVar10;
                    }
                }
                return kow.a;
            case 11:
                kqp kqpVar11 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj12 = this.b;
                    dti dtiVar = new dti(obj12, 1);
                    this.a = 1;
                    if (((dtj) obj12).f.b.a(dtiVar, this) == kqpVar11) {
                        return kqpVar11;
                    }
                }
                return kow.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                kqp kqpVar12 = kqp.a;
                if (this.a == 0) {
                    ixc.Y(obj);
                    Object obj13 = this.b;
                    dti dtiVar2 = new dti(obj13, 0);
                    this.a = 1;
                    if (((dtj) obj13).h.a(dtiVar2, this) == kqpVar12) {
                        return kqpVar12;
                    }
                } else {
                    ixc.Y(obj);
                }
                throw new koh();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kqp kqpVar13 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj14 = this.b;
                    hrz j2 = ((dtj) obj14).a.a.j();
                    dti dtiVar3 = new dti(obj14, 2);
                    this.a = 1;
                    if (((ikm) j2.a).a.a(dtiVar3, this) == kqpVar13) {
                        return kqpVar13;
                    }
                }
                return kow.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kqp kqpVar14 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj15 = this.b;
                    kzq kzqVar = ((dwb) ((dtj) obj15).a.a.p.b()).d;
                    dti dtiVar4 = new dti(obj15, 3);
                    this.a = 1;
                    if (lar.g((lar) kzqVar, dtiVar4, this) == kqpVar14) {
                        return kqpVar14;
                    }
                }
                return kow.a;
            case 15:
                kqp kqpVar15 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj16 = this.b;
                    this.a = 1;
                    dtw dtwVar = (dtw) obj16;
                    if (new lae(dtwVar.aF().a, new azc(dtwVar.aq, 5), new dvh(dtwVar, (kqj) null, 1), 0).a(dts.a, this) == kqpVar15) {
                        return kqpVar15;
                    }
                }
                return kow.a;
            case 16:
                kqp kqpVar16 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    ?? r9 = this.b;
                    aek aekVar = aek.d;
                    dtf dtfVar2 = new dtf((dtw) r9, (kqj) null, 2);
                    this.a = 1;
                    if (afg.b(r9, aekVar, dtfVar2, this) == kqpVar16) {
                        return kqpVar16;
                    }
                }
                return kow.a;
            case 17:
                kqp kqpVar17 = kqp.a;
                if (this.a == 0) {
                    ixc.Y(obj);
                    Object obj17 = this.b;
                    dvi dviVar = ((dvv) obj17).a;
                    if (dviVar != null) {
                        kzq a = dviVar.a();
                        dti dtiVar5 = new dti(obj17, 10);
                        this.a = 1;
                        obj = lar.g((lar) a, dtiVar5, this);
                        if (obj == kqpVar17) {
                            return kqpVar17;
                        }
                    }
                    return kow.a;
                }
                ixc.Y(obj);
                return kow.a;
            case 18:
                kqp kqpVar18 = kqp.a;
                if (this.a != 0) {
                    ixc.Y(obj);
                } else {
                    ixc.Y(obj);
                    Object obj18 = this.b;
                    this.a = 1;
                    obj = ((egt) obj18).f(this);
                    if (obj == kqpVar18) {
                        return kqpVar18;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj19 : (List) obj) {
                    chs chsVar = (chs) obj19;
                    if (chsVar.a != null && chsVar.b.a) {
                        arrayList.add(obj19);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cid cidVar = ((chs) it.next()).a;
                    arrayList2.add(new Account(cidVar.c, cidVar.b));
                }
                return ixc.p(arrayList2);
            default:
                kqp kqpVar19 = kqp.a;
                int i3 = this.a;
                ixc.Y(obj);
                if (i3 == 0) {
                    ?? r92 = this.b;
                    this.a = 1;
                    if (r92.a(lbc.a, this) == kqpVar19) {
                        return kqpVar19;
                    }
                }
                return kow.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kzq] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        switch (this.c) {
            case 0:
                return new aki((akt) this.b, kqjVar, 0);
            case 1:
                return new aki((ajk) this.b, kqjVar, 1);
            case 2:
                return new aki((kvc) this.b, kqjVar, 2);
            case 3:
                return new aki((CoroutineWorker) this.b, kqjVar, 3);
            case 4:
                return new aki((CoroutineWorker) this.b, kqjVar, 4, (byte[]) null);
            case 5:
                return new aki((avi) this.b, kqjVar, 5);
            case 6:
                return new aki((avi) this.b, kqjVar, 6, (byte[]) null);
            case 7:
                return new aki((ConstraintTrackingWorker) this.b, kqjVar, 7);
            case 8:
                return new aki((caa) this.b, kqjVar, 8);
            case 9:
                return new aki((caa) this.b, kqjVar, 9, (byte[]) null);
            case 10:
                return new aki((dtj) this.b, kqjVar, 10);
            case 11:
                return new aki((dtj) this.b, kqjVar, 11, (byte[]) null);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new aki((dtj) this.b, kqjVar, 12, (char[]) null);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new aki((dtj) this.b, kqjVar, 13, (short[]) null);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new aki((dtj) this.b, kqjVar, 14, (int[]) null);
            case 15:
                return new aki((dtw) this.b, kqjVar, 15);
            case 16:
                return new aki((dtw) this.b, kqjVar, 16, (byte[]) null);
            case 17:
                return new aki((dvv) this.b, kqjVar, 17);
            case 18:
                return new aki((egt) this.b, kqjVar, 18);
            default:
                return new aki((kzq) this.b, kqjVar, 19);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(akt aktVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = aktVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(CoroutineWorker coroutineWorker, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(CoroutineWorker coroutineWorker, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(ConstraintTrackingWorker constraintTrackingWorker, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = constraintTrackingWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(avi aviVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = aviVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(avi aviVar, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = aviVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(caa caaVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = caaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(caa caaVar, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = caaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtj dtjVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtj dtjVar, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtj dtjVar, kqj kqjVar, int i, char[] cArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtj dtjVar, kqj kqjVar, int i, int[] iArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtj dtjVar, kqj kqjVar, int i, short[] sArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtw dtwVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dtw dtwVar, kqj kqjVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.c = i;
        this.b = dtwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dvv dvvVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = dvvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(egt egtVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = egtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(kvc kvcVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = kvcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(kzq kzqVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.b = kzqVar;
    }
}
