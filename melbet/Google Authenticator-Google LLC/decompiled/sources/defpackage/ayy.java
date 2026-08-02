package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayy extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayy(ConstraintTrackingWorker constraintTrackingWorker, asp aspVar, brn brnVar, axt axtVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.d = constraintTrackingWorker;
        this.b = aspVar;
        this.c = brnVar;
        this.e = axtVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((ayy) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i != 1) {
            return ((ayy) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        return ((ayy) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r6 != r0) goto L20;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        int i = this.f;
        if (i == 0) {
            kqp kqpVar = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                Object obj2 = this.b;
                Object obj3 = this.c;
                this.a = 1;
                obj = azf.a((brn) obj2, (axt) obj3, this);
                if (obj == kqpVar) {
                    return kqpVar;
                }
            }
            ((AtomicInteger) this.d).set(((Number) obj).intValue());
            this.e.cancel(true);
            return kow.a;
        }
        if (i != 1) {
            kqp kqpVar2 = kqp.a;
            int i2 = this.a;
            ixc.Y(obj);
            if (i2 != 0) {
                return obj;
            }
            Object obj4 = this.d;
            Object obj5 = this.b;
            Object obj6 = this.c;
            Object obj7 = this.e;
            this.a = 1;
            Object k = ((ConstraintTrackingWorker) obj4).k((asp) obj5, (brn) obj6, (axt) obj7, this);
            return k == kqpVar2 ? kqpVar2 : k;
        }
        kqp kqpVar3 = kqp.a;
        int i3 = this.a;
        if (i3 == 0) {
            ixc.Y(obj);
            asp aspVar = (asp) this.e;
            hvi a = aspVar.a();
            this.a = 1;
            obj = avk.a(a, aspVar, this);
        } else {
            if (i3 != 1) {
                ixc.Y(obj);
                return obj;
            }
            ixc.Y(obj);
        }
        final asg asgVar = (asg) obj;
        if (asgVar == null) {
            throw new IllegalStateException("Worker was marked important (" + ((axt) this.d).d + ") but did not provide ForegroundInfo");
        }
        int i4 = ays.a;
        asq.a();
        Object obj8 = this.c;
        Object obj9 = this.b;
        final UUID f = ((asp) this.e).f();
        final Context context = (Context) obj9;
        final ayu ayuVar = (ayu) obj8;
        hvi f2 = yn.f(ayuVar.c.e, "setForegroundAsync", new kri() { // from class: ayt
            @Override // defpackage.kri
            public final Object a() {
                asg asgVar2;
                UUID uuid = f;
                ayu ayuVar2 = ayu.this;
                axu axuVar = ayuVar2.b;
                String uuid2 = uuid.toString();
                axt c = axuVar.c(uuid2);
                if (c == null || c.c.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                awt awtVar = ayuVar2.a;
                synchronized (((atx) awtVar).k) {
                    asq.a();
                    avi aviVar = (avi) ((atx) awtVar).g.remove(uuid2);
                    asgVar2 = asgVar;
                    if (aviVar != null) {
                        if (((atx) awtVar).b == null) {
                            Context context2 = ((atx) awtVar).c;
                            int i5 = ayq.a;
                            context2.getClass();
                            Object systemService = context2.getApplicationContext().getSystemService("power");
                            systemService.getClass();
                            PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
                            synchronized (ayr.a) {
                            }
                            newWakeLock.getClass();
                            ((atx) awtVar).b = newWakeLock;
                            ((atx) awtVar).b.acquire();
                        }
                        ((atx) awtVar).f.put(uuid2, aviVar);
                        Context context3 = ((atx) awtVar).c;
                        axl a2 = aviVar.a();
                        int i6 = awv.k;
                        Intent intent = new Intent(context3, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_START_FOREGROUND");
                        intent.putExtra("KEY_WORKSPEC_ID", a2.a);
                        intent.putExtra("KEY_GENERATION", a2.b);
                        intent.putExtra("KEY_NOTIFICATION_ID", asgVar2.a);
                        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", asgVar2.b);
                        intent.putExtra("KEY_NOTIFICATION", asgVar2.c);
                        context3.startForegroundService(intent);
                    }
                }
                Context context4 = context;
                axl u = abf.u(c);
                int i7 = awv.k;
                Intent intent2 = new Intent(context4, (Class<?>) SystemForegroundService.class);
                intent2.setAction("ACTION_NOTIFY");
                intent2.putExtra("KEY_NOTIFICATION_ID", asgVar2.a);
                intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", asgVar2.b);
                intent2.putExtra("KEY_NOTIFICATION", asgVar2.c);
                intent2.putExtra("KEY_WORKSPEC_ID", u.a);
                intent2.putExtra("KEY_GENERATION", u.b);
                context4.startService(intent2);
                return null;
            }
        });
        this.a = 2;
        Object j = ow.j(f2, this);
        return j == kqpVar3 ? kqpVar3 : j;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ash, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [hvi, java.lang.Object] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.c;
            return new ayy((brn) obj2, (axt) obj3, (AtomicInteger) this.d, (hvi) this.e, kqjVar, 0);
        }
        if (i == 1) {
            Object obj4 = this.e;
            return new ayy((asp) obj4, (axt) this.d, (ash) this.c, (Context) this.b, kqjVar, 1);
        }
        Object obj5 = this.d;
        Object obj6 = this.b;
        return new ayy((ConstraintTrackingWorker) obj5, (asp) obj6, (brn) this.c, (axt) this.e, kqjVar, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayy(asp aspVar, axt axtVar, ash ashVar, Context context, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.e = aspVar;
        this.d = axtVar;
        this.c = ashVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayy(brn brnVar, axt axtVar, AtomicInteger atomicInteger, hvi hviVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.b = brnVar;
        this.c = axtVar;
        this.d = atomicInteger;
        this.e = hviVar;
    }
}
