package defpackage;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iep implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iep(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Set<String> unmodifiableSet;
        switch (this.c) {
            case 0:
                ((ier) this.b).f().e(this.a);
                break;
            case 1:
                Object obj = this.a;
                Object obj2 = this.b;
                try {
                    kaa kaaVar = ((idt) obj2).f;
                    if (kaaVar.j()) {
                        unmodifiableSet = Collections.EMPTY_SET;
                    } else {
                        HashSet j = hnu.j(kaaVar.e);
                        for (int i = 0; i < kaaVar.e; i++) {
                            j.add(new String(kaaVar.k(i), 0));
                        }
                        unmodifiableSet = DesugarCollections.unmodifiableSet(j);
                    }
                    for (String str : unmodifiableSet) {
                        if (!((idt) obj2).j.contains(str)) {
                            if (str.endsWith("-bin")) {
                                kaa kaaVar2 = ((idt) obj2).f;
                                ixc ixcVar = kaa.f;
                                int i2 = jzw.d;
                                kaaVar2.b(new jzs(str, ixcVar));
                            } else {
                                kaa kaaVar3 = ((idt) obj2).f;
                                jzr jzrVar = kaa.b;
                                int i3 = jzw.d;
                                kaaVar3.b(new jzq(str, jzrVar));
                            }
                        }
                    }
                    idu iduVar = ((idt) obj2).e;
                    iduVar.c();
                    break;
                } catch (Throwable th) {
                    ((hlk) ((hlk) ((hlk) idt.a.f()).h(th)).i("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseMessageProcessing", 358, "CachingClientInterceptor.java")).s("Could not write to cache");
                    return;
                }
            case 2:
                ((iey) this.b).f().e(this.a);
                break;
            case 3:
                ifb ifbVar = (ifb) this.b;
                if (!ifbVar.b) {
                    ?? r7 = this.a;
                    if (ifbVar.c == null) {
                        ifbVar.a.add(r7);
                        break;
                    } else {
                        try {
                            r7.run();
                            break;
                        } catch (Throwable th2) {
                            ifbVar.d.a(kbq.c(th2), new kaa());
                            return;
                        }
                    }
                }
                break;
            case 4:
                ((ifb) this.b).c.e(this.a);
                break;
            case 5:
                ((ifm) this.a).b.remove(this.b);
                break;
            case 6:
                ((ifm) this.b).h((kaa) this.a);
                break;
            case 7:
                Object obj3 = this.a;
                ifm ifmVar = (ifm) this.b;
                ifmVar.c.add(new ifj(ifmVar, obj3));
                ifmVar.g();
                break;
            case 8:
                ((ifm) this.a).i((iwq) this.b);
                break;
            case 9:
                try {
                    this.a.run();
                    break;
                } catch (Throwable th3) {
                    ifm ifmVar2 = (ifm) this.b;
                    ifmVar2.h = true;
                    iwr iwrVar = ifmVar2.i;
                    if (iwrVar != null) {
                        iwrVar.a(kbq.c(th3), new kaa());
                        iws iwsVar = ifmVar2.j;
                        if (iwsVar == null || ifmVar2.e.e != 4) {
                            return;
                        }
                        iwsVar.r(null, th3);
                        return;
                    }
                    return;
                }
                break;
            case 10:
                ((ifm) this.a).i((iwq) this.b);
                break;
            case 11:
                ifi ifiVar = (ifi) this.b;
                if (!ifiVar.a) {
                    ifiVar.c.b((kaa) this.a);
                    break;
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ifi ifiVar2 = (ifi) this.b;
                if (!ifiVar2.a) {
                    ifiVar2.c.c(this.a);
                    break;
                }
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ifo ifoVar = (ifo) this.a;
                Iterator it = ifoVar.a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((hvi) entry.getValue()).isDone()) {
                        it.remove();
                        ifg ifgVar = (ifg) entry.getKey();
                        try {
                            ifoVar.k((bry) this.b, ifgVar, ifgVar.b());
                        } catch (Throwable th4) {
                            ifoVar.d = kbq.c(th4);
                            ifoVar.e = new kaa();
                            ifoVar.f();
                            return;
                        }
                    } else if (ifoVar.h()) {
                        ifoVar.g();
                        break;
                    }
                }
                if (ifoVar.h()) {
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj4 = this.a;
                ifo ifoVar2 = (ifo) obj4;
                Iterator it2 = ifoVar2.b.entrySet().iterator();
                Object obj5 = this.b;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (((hvi) entry2.getValue()).isDone()) {
                        it2.remove();
                        ifg ifgVar2 = (ifg) entry2.getKey();
                        try {
                            ifoVar2.i((ikm) obj5, ifgVar2, ifgVar2.f((ikm) obj5));
                        } catch (Throwable th5) {
                            ifoVar2.d = kbq.c(th5);
                            ifoVar2.e = new kaa();
                        }
                    } else if (!ifoVar2.b.isEmpty()) {
                        ((kav) obj4).f.a(ifoVar2.d, ifoVar2.e);
                        break;
                    }
                }
                if (!ifoVar2.b.isEmpty()) {
                }
                break;
            case 15:
                ((ifu) this.b).a.b((kaa) this.a);
                break;
            case 16:
                ((ifu) this.b).a.c(this.a);
                break;
            case 17:
                Object obj6 = this.b;
                while (!this.a.isEmpty()) {
                    try {
                        ikl iklVar = (ikl) ((ReferenceQueue) obj6).remove();
                        if (iklVar.a.remove(iklVar)) {
                            iklVar.clear();
                            Runnable runnable = iklVar.b;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                break;
            case 18:
                Object obj7 = this.b;
                try {
                    ((bst) obj7).c(this.a.call());
                    break;
                } catch (ike e) {
                    ((bst) obj7).b(e);
                    return;
                } catch (Exception e2) {
                    ((bst) obj7).b(new ike(e2));
                    return;
                }
            case 19:
                kbq kbqVar = (kbq) this.b;
                ((kgc) this.a).g.r(kbqVar.p, kbqVar.q);
                break;
            default:
                ((kgc) this.b).g.e(this.a);
                break;
        }
    }

    public /* synthetic */ iep(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public iep(kgc kgcVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = kgcVar;
    }

    public iep(kgc kgcVar, kbq kbqVar, int i) {
        this.c = i;
        this.b = kbqVar;
        this.a = kgcVar;
    }
}
