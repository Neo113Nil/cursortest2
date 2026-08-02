package defpackage;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avl implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public avl(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [ddc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [ddd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v113, types: [dde, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [dcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ddh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17, types: [ddb, ddd, dde, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [avx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v45, types: [coq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [ddb, ddd, dde, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [dcy, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        axt axtVar = null;
        switch (this.c) {
            case 0:
                asq.a();
                int i = avm.d;
                axt axtVar2 = (axt) this.a;
                String str = axtVar2.b;
                ((avm) this.b).a.c(axtVar2);
                return;
            case 1:
                Object obj = this.b;
                synchronized (((atx) obj).k) {
                    arrayList = new ArrayList(((atx) obj).j);
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((atm) arrayList.get(i2)).a((axl) this.a, false);
                }
                return;
            case 2:
                ((avp) this.a).a.G((brn) this.b, 3);
                return;
            case 3:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((awc) it.next()).a(((awp) this.b).d);
                }
                return;
            case 4:
                atx atxVar = ((awv) this.b).b.f;
                Object obj2 = atxVar.k;
                Object obj3 = this.a;
                synchronized (obj2) {
                    avi b = atxVar.b((String) obj3);
                    if (b != null) {
                        axtVar = b.a;
                    }
                }
                if (axtVar == null || !axtVar.b()) {
                    return;
                }
                ?? r10 = this.b;
                synchronized (((awv) r10).c) {
                    ((awv) r10).f.put(abf.u(axtVar), axtVar);
                    ((awv) r10).g.put(abf.u(axtVar), awa.a(((awv) r10).j, axtVar, (kvj) ((awv) r10).i.c, r10));
                }
                return;
            case 5:
                String uuid = ((UUID) this.a).toString();
                uuid.getClass();
                aei.h((auy) this.b, uuid);
                return;
            case 6:
                if (((bfb) this.b).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 7:
                ((bwo) this.a).a();
                ((btt) this.b).a();
                return;
            case 8:
                ((JobInfoSchedulerService) this.a).jobFinished((JobParameters) this.b, false);
                return;
            case 9:
                ((coc) this.a).h((Bundle) this.b);
                return;
            case 10:
                coe coeVar = (coe) this.a;
                coc cocVar = (coc) coeVar.e.k.get(coeVar.b);
                if (cocVar == null) {
                    return;
                }
                if (!((clg) this.b).c()) {
                    cocVar.j((clg) this.b, null);
                    return;
                }
                coeVar.d = true;
                cml cmlVar = coeVar.a;
                if (cmlVar.o()) {
                    coeVar.c();
                    return;
                }
                try {
                    cmlVar.r(null, cmlVar.j());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    ((coe) this.a).a.l("Failed to get service from broker.");
                    cocVar.j(new clg(1, 10, null, null, null), null);
                    return;
                }
            case 11:
                Object obj4 = ((cme) this.a).d;
                ?? r102 = this.b;
                if (obj4 != null) {
                    r102.a(((cop) obj4).a);
                    return;
                }
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                dcw dcwVar = (dcw) this.a;
                clg clgVar = dcwVar.b;
                boolean c = clgVar.c();
                Object obj5 = this.b;
                if (c) {
                    crc crcVar = dcwVar.c;
                    oy.at(crcVar);
                    clg clgVar2 = crcVar.c;
                    if (!clgVar2.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(clgVar2))), new Exception());
                        coy coyVar = (coy) obj5;
                        coyVar.f.b(clgVar2);
                        coyVar.e.y();
                        return;
                    }
                    coy coyVar2 = (coy) obj5;
                    coe coeVar2 = coyVar2.f;
                    cqp a = crcVar.a();
                    Set set = coyVar2.c;
                    if (a == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        coeVar2.b(new clg(1, 4, null, null, null));
                    } else {
                        coeVar2.f = a;
                        coeVar2.c = set;
                        coeVar2.c();
                    }
                } else {
                    ((coy) obj5).f.b(clgVar);
                }
                ((coy) obj5).e.y();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((Activity) ((fwm) this.a).a).startActivity((Intent) this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Activity) this.b).startActivityForResult((Intent) this.a, 123);
                return;
            case 15:
                Object obj6 = this.a;
                boolean z = ((ddm) obj6).c;
                Object obj7 = this.b;
                if (z) {
                    ((ddm) ((dda) obj7).a).r();
                    return;
                }
                try {
                    ((ddm) ((dda) this.b).a).p(((dda) obj7).b.a((ddi) obj6));
                    return;
                } catch (ddg e2) {
                    boolean z2 = e2.getCause() instanceof Exception;
                    Object obj8 = this.b;
                    if (z2) {
                        ((ddm) ((dda) obj8).a).o((Exception) e2.getCause());
                        return;
                    } else {
                        ((ddm) ((dda) obj8).a).o(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((ddm) ((dda) this.b).a).o(e3);
                    return;
                }
            case 16:
                try {
                    ddi ddiVar = (ddi) ((ddf) this.b).b.a((ddi) this.a);
                    ?? r103 = this.b;
                    if (ddiVar == 0) {
                        ((ddf) r103).c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = ddl.b;
                    ddiVar.j(executor, r103);
                    ddiVar.i(executor, r103);
                    ddiVar.g(executor, r103);
                    return;
                } catch (ddg e4) {
                    boolean z3 = e4.getCause() instanceof Exception;
                    Object obj9 = this.b;
                    if (z3) {
                        ((ddf) obj9).a.o((Exception) e4.getCause());
                        return;
                    } else {
                        ((ddf) obj9).a.o(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((ddf) this.b).a.o(e5);
                    return;
                }
            case 17:
                Object obj10 = this.b;
                synchronized (((dda) obj10).a) {
                    ((dda) obj10).b.a((ddi) this.a);
                }
                return;
            case 18:
                Object obj11 = this.b;
                synchronized (((dda) obj11).a) {
                    ?? r0 = ((dda) obj11).b;
                    Exception c2 = ((ddi) this.a).c();
                    oy.at(c2);
                    r0.c(c2);
                }
                return;
            case 19:
                Object obj12 = this.b;
                synchronized (((dda) obj12).a) {
                    ((dda) obj12).b.d(((ddi) this.a).d());
                }
                return;
            default:
                try {
                    ddi a2 = ((ddf) this.b).b.a(((ddi) this.a).d());
                    ?? r104 = this.b;
                    Executor executor2 = ddl.b;
                    a2.j(executor2, r104);
                    a2.i(executor2, r104);
                    a2.g(executor2, r104);
                    return;
                } catch (ddg e6) {
                    boolean z4 = e6.getCause() instanceof Exception;
                    Object obj13 = this.b;
                    if (z4) {
                        ((ddf) obj13).c((Exception) e6.getCause());
                        return;
                    } else {
                        ((ddf) obj13).c(e6);
                        return;
                    }
                } catch (CancellationException unused) {
                    ((ddf) this.b).a();
                    return;
                } catch (Exception e7) {
                    ((ddf) this.b).c(e7);
                    return;
                }
        }
    }

    public avl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ avl(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public avl(Object obj, Object obj2, int i, int[] iArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ avl(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
