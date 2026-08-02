package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ajt;
import defpackage.aki;
import defpackage.asm;
import defpackage.asn;
import defpackage.asp;
import defpackage.asq;
import defpackage.atf;
import defpackage.auy;
import defpackage.awa;
import defpackage.awg;
import defpackage.axt;
import defpackage.axu;
import defpackage.ayw;
import defpackage.ayx;
import defpackage.ayy;
import defpackage.ayz;
import defpackage.aza;
import defpackage.azf;
import defpackage.brn;
import defpackage.ixc;
import defpackage.ixg;
import defpackage.ixh;
import defpackage.kqj;
import defpackage.kqp;
import defpackage.kvj;
import defpackage.kvp;
import defpackage.yo;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.d = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(kqj kqjVar) {
        return ixg.f(ixh.b(g()), new aki(this, (kqj) null, 7), kqjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(kqj kqjVar) {
        aza azaVar;
        ?? r2;
        int i;
        try {
            if (kqjVar instanceof aza) {
                azaVar = (aza) kqjVar;
                int i2 = azaVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    azaVar.d = i2 - Integer.MIN_VALUE;
                    aza azaVar2 = azaVar;
                    Object obj = azaVar2.b;
                    kqp kqpVar = kqp.a;
                    r2 = azaVar2.d;
                    if (r2 != 0) {
                        ixc.Y(obj);
                        Object obj2 = e().b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str == null || str.length() == 0) {
                            asq.a().c(azf.a, "No worker to delegate to.");
                            return new asm();
                        }
                        auy i3 = auy.i(this.a);
                        axu C = i3.d.C();
                        String uuid = f().toString();
                        uuid.getClass();
                        axt c = C.c(uuid);
                        if (c == null) {
                            return new asm();
                        }
                        brn brnVar = new brn(i3.j);
                        ?? r22 = brnVar.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : r22) {
                            if (((awg) obj3).c(c)) {
                                arrayList.add(obj3);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            asq.a();
                            String str2 = awa.a;
                            ixc.y(arrayList, null, null, null, new ajt(7), 31);
                        }
                        if (!arrayList.isEmpty()) {
                            String str3 = azf.a;
                            asq.a();
                            return new asn();
                        }
                        String str4 = azf.a;
                        asq.a();
                        try {
                            atf atfVar = this.b.f;
                            Context context = this.a;
                            context.getClass();
                            asp b = atfVar.b(context, str, this.d);
                            ?? r0 = this.d.h.d;
                            r0.getClass();
                            kvj b2 = ixh.b(r0);
                            ayy ayyVar = new ayy(this, b, brnVar, c, (kqj) null, 2);
                            azaVar2.a = b;
                            azaVar2.d = 1;
                            obj = ixg.f(b2, ayyVar, azaVar2);
                            r2 = b;
                            if (obj == kqpVar) {
                                return kqpVar;
                            }
                        } catch (Throwable unused) {
                            asq.a();
                            return new asm();
                        }
                    } else {
                        if (r2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj4 = azaVar2.a;
                        ixc.Y(obj);
                        r2 = obj4;
                    }
                    return (yo) obj;
                }
            }
            if (r2 != 0) {
            }
            return (yo) obj;
        } catch (CancellationException e) {
            if (i() || (e instanceof ayw)) {
                if (Build.VERSION.SDK_INT < 31) {
                    i = -512;
                } else if (i()) {
                    i = d();
                } else {
                    if (!(e instanceof ayw)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    i = ((ayw) e).a;
                }
                ((asp) r2).h(i);
            }
            if (e instanceof ayw) {
                return new asn();
            }
            throw e;
        }
        azaVar = new aza(this, kqjVar);
        aza azaVar22 = azaVar;
        Object obj5 = azaVar22.b;
        kqp kqpVar2 = kqp.a;
        r2 = azaVar22.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(asp aspVar, brn brnVar, axt axtVar, kqj kqjVar) {
        ayx ayxVar;
        int i;
        if (kqjVar instanceof ayx) {
            ayxVar = (ayx) kqjVar;
            int i2 = ayxVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ayxVar.c = i2 - Integer.MIN_VALUE;
                Object obj = ayxVar.a;
                kqp kqpVar = kqp.a;
                i = ayxVar.c;
                if (i != 0) {
                    ixc.Y(obj);
                    ayz ayzVar = new ayz(aspVar, brnVar, axtVar, null);
                    ayxVar.c = 1;
                    obj = kvp.f(ayzVar, ayxVar);
                    if (obj == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        ayxVar = new ayx(this, kqjVar);
        Object obj2 = ayxVar.a;
        kqp kqpVar2 = kqp.a;
        i = ayxVar.c;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
