package defpackage;

import j$.util.stream.Collector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hht {
    public static final Object a;
    public static final Collector b;

    static {
        int i = 4;
        int i2 = 3;
        Collector.CC.of(new hbv(i), new hbx(i2), new hbw(i2), new ejs(16), Collector.Characteristics.UNORDERED);
        a = new Object();
        b = Collector.CC.of(new hbv(5), new hbx(i), new hbw(i2), new ejs(15), Collector.Characteristics.UNORDERED);
    }
}
