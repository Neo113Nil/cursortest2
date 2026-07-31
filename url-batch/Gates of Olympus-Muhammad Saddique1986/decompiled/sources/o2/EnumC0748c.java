package o2;

import java.util.concurrent.TimeUnit;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0748c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f7452d;

    EnumC0748c(TimeUnit timeUnit) {
        this.f7452d = timeUnit;
    }
}
