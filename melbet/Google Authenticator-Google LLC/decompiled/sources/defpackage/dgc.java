package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dgc implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dgc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r0.l.c(r5).equals(r0.l.c(r10)) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r0.k = r5;
        r6 = r0.a;
        defpackage.fao.c();
        r6.h(r2 ^ 1);
        r6.k(new defpackage.ajx(r4, r5, (java.lang.Object) r6, 12, (short[]) null));
        r0.n(r5);
        r0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r1 != r10) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dgk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v32, types: [dps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33, types: [dov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v42, types: [android.view.View$OnAttachStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [dps, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        switch (this.c) {
            case 0:
                ((huo) this.a).execute(this.b);
                return;
            case 1:
                ((huo) this.a).execute(this.b);
                return;
            case 2:
                ?? r0 = this.a;
                ?? r10 = this.b;
                gut a = r0.a();
                try {
                    r10.run();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } finally {
                }
            case 3:
                ((dha) this.a).a.removeCallbacks(this.b);
                return;
            case 4:
                dhi dhiVar = (dhi) this.a;
                dhj dhjVar = dhiVar.b;
                Object obj = this.b;
                String obj2 = dhjVar.d ? dhiVar.a.toString() : dhiVar.a.getClass().toString();
                Thread thread = (Thread) obj;
                RuntimeException b = gwd.b(thread);
                dgx a2 = dgx.a(thread, b.getStackTrace().length > 0 ? b : null);
                String message = a2.getMessage();
                dhr dhrVar = dhjVar.c;
                dhrVar.f();
                dhp dhpVar = new dhp("On " + message + " task took longer than 1 " + String.valueOf(dhrVar.g()) + " so assumed deadlocked: " + obj2, a2.getStackTrace(), a2.getCause());
                ArrayList arrayList2 = new ArrayList();
                Set set = dhjVar.a;
                synchronized (set) {
                    arrayList = new ArrayList(set);
                }
                int size = arrayList.size();
                while (r2 < size) {
                    arrayList2.addAll(((dhl) arrayList.get(r2)).a());
                    r2++;
                }
                dhpVar.addSuppressed(a2);
                arrayList2.remove(obj);
                dhm.a(dhiVar.b.b, arrayList2, dhpVar);
                return;
            case 5:
                ?? r02 = this.b;
                Object obj3 = this.a;
                try {
                    r02.run();
                    HashSet hashSet = ((dhl) obj3).a;
                    synchronized (hashSet) {
                        hashSet.remove(Thread.currentThread());
                    }
                    return;
                } catch (Throwable th) {
                    HashSet hashSet2 = ((dhl) obj3).a;
                    synchronized (hashSet2) {
                        hashSet2.remove(Thread.currentThread());
                        throw th;
                    }
                }
            case 6:
                Object obj4 = this.a;
                Object obj5 = this.b;
                synchronized (((dhy) obj5).a) {
                    ((dhy) obj5).b.remove(obj4);
                    ((dhy) obj5).c.add(obj4);
                }
                return;
            case 7:
                Object obj6 = this.a;
                Object obj7 = this.b;
                synchronized (((dhy) obj7).a) {
                    ((dhy) obj7).c.remove(obj6);
                }
                return;
            case 8:
                ((die) this.a).c(this.b);
                return;
            case 9:
                long id = Thread.currentThread().getId();
                diu diuVar = (diu) this.a;
                diuVar.a.d(id);
                try {
                    this.b.run();
                    return;
                } finally {
                    diuVar.a.c(id);
                }
            case 10:
                fao.c();
                AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.a;
                edb edbVar = accountParticleDisc.o;
                edbVar.d(edbVar.b, edbVar.c);
                ?? r102 = this.b;
                edbVar.b = r102;
                edbVar.c(r102, edbVar.c);
                accountParticleDisc.o();
                return;
            case 11:
                fao.c();
                AccountParticleDisc accountParticleDisc2 = (AccountParticleDisc) this.b;
                edb edbVar2 = accountParticleDisc2.o;
                if (edbVar2.a != null) {
                    return;
                }
                final ?? r103 = this.a;
                accountParticleDisc2.q = new bry(accountParticleDisc2.getResources(), accountParticleDisc2.n);
                final bry bryVar = accountParticleDisc2.q;
                edbVar2.e(new dps() { // from class: dqa
                    @Override // defpackage.dps
                    public final dze b(Object obj8) {
                        dox b2 = r103.b(obj8);
                        int i = 1;
                        if (b2 != null && b2.a) {
                            i = 2;
                        }
                        return new dze(((bse) bry.this.a).c(i));
                    }

                    @Override // defpackage.dps
                    public final /* synthetic */ void a() {
                    }
                });
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj8 = this.a;
                AccountParticleDisc accountParticleDisc3 = (AccountParticleDisc) obj8;
                hoq.I(accountParticleDisc3.p(), "initialize must be called first");
                Object obj9 = this.b;
                r2 = obj9 == 0 ? 1 : 0;
                Object obj10 = accountParticleDisc3.k;
                if (obj9 != 0) {
                    if (obj10 != null) {
                        break;
                    } else {
                        r1 = obj9;
                        break;
                    }
                }
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((dpk) this.b).d((Drawable) this.a, false);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((dpk) this.b).d(dih.S((Context) this.a), true);
                return;
            case 15:
                this.a.onViewAttachedToWindow((View) this.b);
                return;
            case 16:
                ((dpk) this.b).d((Drawable) this.a, true);
                return;
            case 17:
                ((dpk) this.b).d((Drawable) this.a, true);
                return;
            case 18:
                ((dpk) this.b).d((Drawable) this.a, true);
                return;
            case 19:
                ((dpk) this.b).d((Drawable) this.a, true);
                return;
            default:
                dri driVar = ((drg) this.a).a;
                driVar.g = (hel) this.b;
                driVar.t();
                return;
        }
    }

    public /* synthetic */ dgc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
