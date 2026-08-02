package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hin implements Comparator {
    protected hin() {
    }

    public static hin d(Comparator comparator) {
        return comparator instanceof hin ? (hin) comparator : new hcm(comparator);
    }

    public hin a() {
        return new hii(this);
    }

    public hin b() {
        return new hij(this);
    }

    public hin c() {
        return new hje(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
