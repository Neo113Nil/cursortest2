package com.google.android.gms.internal.play_billing;

import a.AbstractC0124a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x.AbstractC1514c;

/* renamed from: com.google.android.gms.internal.play_billing.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337o {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0124a f5984a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5985b;

    /* renamed from: c, reason: collision with root package name */
    public long f5986c;

    /* renamed from: d, reason: collision with root package name */
    public long f5987d;

    public C0337o(AbstractC0124a abstractC0124a) {
        if (abstractC0124a == null) {
            throw new NullPointerException("ticker");
        }
        this.f5984a = abstractC0124a;
    }

    public final void a() {
        if (this.f5985b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f5985b = true;
        this.f5987d = this.f5984a.U();
    }

    public final String toString() {
        String str;
        long U4 = this.f5985b ? (this.f5984a.U() - this.f5987d) + this.f5986c : this.f5986c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(U4, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(U4, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(U4, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(U4, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(U4, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(U4, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(U4 / timeUnit2.convert(1L, timeUnit)));
        switch (AbstractC0335n.f5980a[timeUnit.ordinal()]) {
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
        return AbstractC1514c.b(format, " ", str);
    }
}
