package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class fec {
    final Object a;
    public final String b;
    public final fdz[] c;
    HashMap d;
    public int e;
    private final koe f;
    private boolean g = true;

    public fec(String str, koe koeVar, fdz... fdzVarArr) {
        this.b = str;
        this.c = fdzVarArr;
        int length = fdzVarArr.length;
        HashMap hashMap = new HashMap(length > 0 ? 10 : 1);
        this.d = hashMap;
        if (length == 0) {
            hashMap.put(fdu.b, a());
        }
        this.e = 0;
        this.f = koeVar;
        this.a = new Object();
    }

    public abstract fdv a();

    public final void c() {
        this.g = false;
    }

    protected final void d(Object obj, fdu fduVar) {
        synchronized (this.a) {
            fdv fdvVar = (fdv) this.d.get(fduVar);
            if (fdvVar == null) {
                fdvVar = a();
                this.d.put(fduVar, fdvVar);
            }
            fdvVar.b(obj);
            this.e++;
        }
        fed fedVar = ((fee) this.f).c;
        if (fedVar != null) {
            feg fegVar = (feg) fedVar;
            AtomicLong atomicLong = fegVar.c;
            int i = 9;
            if (atomicLong.incrementAndGet() >= 100) {
                Object obj2 = fegVar.e;
                synchronized (obj2) {
                    if (atomicLong.get() >= 100) {
                        synchronized (obj2) {
                            ScheduledFuture scheduledFuture = ((feg) fedVar).d;
                            if (scheduledFuture != null && !scheduledFuture.isDone() && !((feg) fedVar).d.isCancelled()) {
                                if (((feg) fedVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                    ((feg) fedVar).a();
                                    ((feg) fedVar).d = ((feg) fedVar).a.schedule(new evp(fedVar, i), 1L, TimeUnit.MILLISECONDS);
                                }
                            }
                            ((feg) fedVar).d = ((feg) fedVar).a.schedule(new evp(fedVar, i), 1L, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (fegVar.e) {
                ScheduledFuture scheduledFuture2 = ((feg) fedVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((feg) fedVar).d.isCancelled()) {
                    ((feg) fedVar).d = ((feg) fedVar).a.schedule(new evp(fedVar, i), ((feg) fedVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    protected final void e(Object... objArr) {
        fdz[] fdzVarArr = this.c;
        hoq.x(fdzVarArr.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
                if (!fdzVarArr[i].b.isInstance(obj)) {
                    String str = this.b;
                    String obj2 = obj.toString();
                    String valueOf = String.valueOf(obj.getClass());
                    fdz fdzVar = fdzVarArr[i];
                    throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + obj2 + ", type: " + valueOf + "}, but expected: {name: " + fdzVar.a + ", type: " + fdzVar.b.toString() + "}");
                }
            }
        }
    }

    final void f(fdz... fdzVarArr) {
        fdz[] fdzVarArr2 = this.c;
        if (Arrays.equals(fdzVarArr2, fdzVarArr)) {
            return;
        }
        throw new fef("Streamz " + this.b + " with field diffs: " + Arrays.toString(fdzVarArr2) + " and " + Arrays.toString(fdzVarArr));
    }
}
