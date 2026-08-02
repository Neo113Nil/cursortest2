package defpackage;

import java.lang.Thread;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ewu implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ewu(Object obj, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.c = i;
        this.b = obj;
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r8.uncaughtException(r9, r10);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        brn d;
        if (this.c == 0) {
            ((ewv) this.b).b(this.a, thread, th);
            return;
        }
        Object obj = this.b;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        try {
            try {
                if (gsv.a && (d = gsv.d(th)) != null) {
                    Object obj2 = d.a;
                    eog b = eog.b(((gvi) obj2).b);
                    if (b != null && b.a() != null && !b.d()) {
                        UUID uuid = ((gvi) obj2).c;
                        ((eok) obj).b(Long.valueOf(hoq.ai(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits())), eoh.FAILURE.d, 0, jmv.a(((gvi) obj2).d));
                    }
                }
            } catch (Exception e) {
                ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", 165, "CuiMetricServiceImpl.java")).s("Failed to end CUI.");
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
