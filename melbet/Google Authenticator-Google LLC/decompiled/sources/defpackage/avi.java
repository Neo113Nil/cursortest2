package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avi {
    public final axt a;
    public final Context b;
    public final String c;
    public final arv d;
    public final WorkDatabase e;
    public final axu f;
    public final awx g;
    public final String h;
    public final List i;
    public final kww j;
    public final ldt k;
    private final awt l;
    private final List m;
    private final List n;

    /* JADX WARN: Type inference failed for: r2v4, types: [awt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public avi(iee ieeVar) {
        axt axtVar = (axt) ieeVar.d;
        this.a = axtVar;
        this.b = (Context) ieeVar.a;
        String str = axtVar.b;
        this.c = str;
        this.k = (ldt) ieeVar.e;
        this.d = (arv) ieeVar.g;
        this.l = ieeVar.c;
        WorkDatabase workDatabase = (WorkDatabase) ieeVar.f;
        this.e = workDatabase;
        this.f = workDatabase.C();
        this.g = workDatabase.w();
        ?? r3 = ieeVar.b;
        this.m = r3;
        this.h = "Work [ id=" + str + ", class=" + axtVar.d + ", tags={ " + ixc.y(r3, ",", null, null, null, 62) + " } ]";
        this.j = new kww();
        this.i = new ArrayList();
        this.n = new ArrayList();
    }

    public final axl a() {
        return abf.u(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kqj kqjVar) {
        avh avhVar;
        int i;
        asa a;
        WorkerParameters workerParameters;
        wo woVar;
        avi aviVar = this;
        try {
            if (kqjVar instanceof avh) {
                avhVar = (avh) kqjVar;
                int i2 = avhVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    avhVar.c = i2 - Integer.MIN_VALUE;
                    avh avhVar2 = avhVar;
                    Object obj = avhVar2.a;
                    kqp kqpVar = kqp.a;
                    i = avhVar2.c;
                    if (i != 0) {
                        ixc.Y(obj);
                        axt axtVar = aviVar.a;
                        boolean g = yk.g();
                        String str = axtVar.x;
                        asi asiVar = null;
                        int i3 = 0;
                        if (g && str != null) {
                            int hashCode = axtVar.hashCode();
                            if (Build.VERSION.SDK_INT >= 29) {
                                Trace.beginAsyncSection(yk.i(str), hashCode);
                            } else {
                                String i4 = yk.i(str);
                                try {
                                    if (yk.b == null) {
                                        yk.b = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    }
                                    Method method = yk.b;
                                    if (method == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    method.invoke(null, Long.valueOf(yk.a), i4, Integer.valueOf(hashCode));
                                } catch (Exception e) {
                                    yk.h(e);
                                }
                            }
                        }
                        if (!((Boolean) aviVar.e.e(new avc(aviVar, i3))).booleanValue()) {
                            if (axtVar.d()) {
                                a = axtVar.f;
                            } else {
                                String str2 = axtVar.e;
                                str2.getClass();
                                String str3 = asj.a;
                                try {
                                    Object newInstance = Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                                    newInstance.getClass();
                                    asiVar = (asi) newInstance;
                                } catch (Exception e2) {
                                    asq.a().d(asj.a, "Trouble instantiating ".concat(str2), e2);
                                }
                                axt axtVar2 = aviVar.a;
                                if (asiVar == null) {
                                    asq.a().c(avk.a, "Could not create Input Merger ".concat(String.valueOf(axtVar2.e)));
                                    return new avg(false);
                                }
                                a = asiVar.a(ixc.l(ixc.b(axtVar2.f), aviVar.f.f(aviVar.c)));
                            }
                            asa asaVar = a;
                            String str4 = aviVar.c;
                            List list = aviVar.m;
                            axt axtVar3 = aviVar.a;
                            arv arvVar = aviVar.d;
                            ldt ldtVar = aviVar.k;
                            UUID fromString = UUID.fromString(str4);
                            int i5 = ayv.a;
                            ayu ayuVar = new ayu(aviVar.e, aviVar.l, ldtVar);
                            atf atfVar = arvVar.d;
                            WorkerParameters workerParameters2 = new WorkerParameters(fromString, asaVar, list, arvVar.a, arvVar.b, ldtVar, atfVar, ayuVar);
                            try {
                                asp b = atfVar.b(aviVar.b, axtVar3.d, workerParameters2);
                                b.c = true;
                                kql kqlVar = avhVar2.bU().get(kwu.d);
                                kqlVar.getClass();
                                kwu kwuVar = (kwu) kqlVar;
                                dtb dtbVar = new dtb(b, g, str, aviVar, 1);
                                aviVar = aviVar;
                                kwuVar.w(dtbVar);
                                Object e3 = aviVar.e.e(new avc(aviVar, 2));
                                e3.getClass();
                                if (((Boolean) e3).booleanValue() && !kwuVar.ce()) {
                                    ash ashVar = workerParameters2.g;
                                    ?? r0 = aviVar.k.d;
                                    r0.getClass();
                                    kvj b2 = ixh.b(r0);
                                    try {
                                        avz avzVar = new avz(aviVar, b, ashVar, (kqj) null, 1);
                                        avhVar2.d = workerParameters2;
                                        avhVar2.c = 1;
                                        obj = ixg.f(b2, avzVar, avhVar2);
                                        if (obj == kqpVar) {
                                            return kqpVar;
                                        }
                                        workerParameters = workerParameters2;
                                    } catch (Throwable th) {
                                        th = th;
                                        workerParameters = workerParameters2;
                                        String str5 = aviVar.h;
                                        String str6 = avk.a;
                                        asq.a().d(str6, str5.concat(" failed because it threw an exception/error"), th);
                                        woVar = aviVar.d.h;
                                        if (woVar != null) {
                                            yp ypVar = new yp(aviVar.a.d, workerParameters);
                                            str6.getClass();
                                            try {
                                                woVar.a(ypVar);
                                            } catch (Throwable th2) {
                                                asq.a().d(str6, "Exception handler threw an exception", th2);
                                            }
                                        }
                                        return new avd();
                                    }
                                }
                            } catch (Throwable unused) {
                                asq.a().c(avk.a, "Could not create Worker ".concat(String.valueOf(aviVar.a.d)));
                                return new avg(false);
                            }
                        }
                        return new avg(true);
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    workerParameters = avhVar2.d;
                    try {
                        ixc.Y(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        String str52 = aviVar.h;
                        String str62 = avk.a;
                        asq.a().d(str62, str52.concat(" failed because it threw an exception/error"), th);
                        woVar = aviVar.d.h;
                        if (woVar != null) {
                        }
                        return new avd();
                    }
                    yo yoVar = (yo) obj;
                    yoVar.getClass();
                    return new ave(yoVar);
                }
            }
            if (i != 0) {
            }
            yo yoVar2 = (yo) obj;
            yoVar2.getClass();
            return new ave(yoVar2);
        } catch (CancellationException e4) {
            String str7 = avk.a;
            asq.a();
            throw e4;
        }
        avhVar = new avh(aviVar, kqjVar);
        avh avhVar22 = avhVar;
        Object obj2 = avhVar22.a;
        kqp kqpVar2 = kqp.a;
        i = avhVar22.c;
    }

    public final boolean c(int i) {
        if (ksp.b(this.a.y, true)) {
            String str = avk.a;
            asq.a();
            d(i);
            return true;
        }
        axu axuVar = this.f;
        String str2 = this.c;
        atb b = axuVar.b(str2);
        if (b == null || b.a()) {
            String str3 = avk.a;
            asq.a();
            Objects.toString(b);
            return false;
        }
        String str4 = avk.a;
        asq.a();
        Objects.toString(b);
        axuVar.B(atb.a, str2);
        axuVar.s(str2, i);
        axuVar.x(str2, -1L);
        return true;
    }

    public final void d(int i) {
        axu axuVar = this.f;
        atb atbVar = atb.a;
        String str = this.c;
        axuVar.B(atbVar, str);
        axuVar.q(str, System.currentTimeMillis());
        axuVar.p(str, this.a.v);
        axuVar.x(str, -1L);
        axuVar.s(str, i);
    }

    public final void e() {
        axu axuVar = this.f;
        String str = this.c;
        axuVar.q(str, System.currentTimeMillis());
        axuVar.B(atb.a, str);
        axuVar.z(str);
        axuVar.p(str, this.a.v);
        axuVar.n(str);
        axuVar.x(str, -1L);
    }

    public final void f(yo yoVar) {
        String str = avk.a;
        asq.a();
        if (this.a.d()) {
            e();
        } else {
            g(yoVar);
        }
    }

    public final void g(yo yoVar) {
        String str = this.c;
        List<String> c = ixc.c(str);
        c.addAll(abf.w(this.g, str));
        for (String str2 : c) {
            axu axuVar = this.f;
            if (axuVar.b(str2) != atb.f) {
                axuVar.B(atb.d, str2);
                if (!ksp.b(str2, str)) {
                    this.n.add(str2);
                }
            }
        }
        asa asaVar = ((asm) yoVar).a;
        asaVar.getClass();
        axu axuVar2 = this.f;
        axuVar2.p(str, this.a.v);
        axuVar2.r(str, asaVar);
    }
}
