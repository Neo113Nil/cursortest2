package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hab {
    public boolean a;
    private final hai b;
    private long c;

    public hab(hai haiVar) {
        haiVar.getClass();
        this.b = haiVar;
    }

    public static hab c(hai haiVar) {
        hab habVar = new hab(haiVar);
        habVar.e();
        return habVar;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(b(), TimeUnit.NANOSECONDS);
    }

    public final long b() {
        if (this.a) {
            return this.b.a() - this.c;
        }
        return 0L;
    }

    public final void d() {
        this.a = false;
    }

    public final void e() {
        hoq.I(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.c = this.b.a();
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long b = b();
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
        if (b / 86400000000000L > 0) {
            timeUnit = TimeUnit.DAYS;
        } else {
            TimeUnit timeUnit4 = TimeUnit.HOURS;
            TimeUnit timeUnit5 = TimeUnit.NANOSECONDS;
            if (b / 3600000000000L > 0) {
                timeUnit = TimeUnit.HOURS;
            } else {
                TimeUnit timeUnit6 = TimeUnit.MINUTES;
                TimeUnit timeUnit7 = TimeUnit.NANOSECONDS;
                if (b / 60000000000L > 0) {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    TimeUnit timeUnit8 = TimeUnit.SECONDS;
                    TimeUnit timeUnit9 = TimeUnit.NANOSECONDS;
                    if (b / 1000000000 > 0) {
                        timeUnit = TimeUnit.SECONDS;
                    } else {
                        TimeUnit timeUnit10 = TimeUnit.MILLISECONDS;
                        TimeUnit timeUnit11 = TimeUnit.NANOSECONDS;
                        if (b / 1000000 > 0) {
                            timeUnit = TimeUnit.MILLISECONDS;
                        } else {
                            TimeUnit timeUnit12 = TimeUnit.MICROSECONDS;
                            TimeUnit timeUnit13 = TimeUnit.NANOSECONDS;
                            timeUnit = b / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(b / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (haa.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.ag(str, format, " ");
    }

    public hab() {
        this.b = hai.a;
    }
}
