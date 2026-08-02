package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khc implements jzr {
    private final /* synthetic */ int a;

    public khc(int i) {
        this.a = i;
    }

    @Override // defpackage.jzr
    public final /* synthetic */ Object a(String str) {
        if (this.a != 0) {
            return str;
        }
        hoq.y(str.length() > 0, "empty timeout");
        hoq.y(str.length() <= 9, "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
    }

    @Override // defpackage.jzr
    public final /* synthetic */ String b(Object obj) {
        if (this.a != 0) {
            return (String) obj;
        }
        long max = Math.max(1L, ((Long) obj).longValue());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (max < 100000000) {
            return max + "n";
        }
        if (max < 100000000000L) {
            return (max / 1000) + "u";
        }
        if (max < 100000000000000L) {
            return (max / 1000000) + "m";
        }
        if (max < 100000000000000000L) {
            return (max / 1000000000) + "S";
        }
        if (max < 6000000000000000000L) {
            return (max / 60000000000L) + "M";
        }
        return (max / 3600000000000L) + "H";
    }
}
