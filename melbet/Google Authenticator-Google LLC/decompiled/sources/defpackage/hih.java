package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hih extends hin implements Serializable {
    public static final hih a = new hih();
    private static final long serialVersionUID = 0;
    private transient hin b;
    private transient hin c;

    private hih() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.hin
    public final hin a() {
        hin hinVar = this.b;
        if (hinVar != null) {
            return hinVar;
        }
        hii hiiVar = new hii(this);
        this.b = hiiVar;
        return hiiVar;
    }

    @Override // defpackage.hin
    public final hin b() {
        hin hinVar = this.c;
        if (hinVar != null) {
            return hinVar;
        }
        hij hijVar = new hij(this);
        this.c = hijVar;
        return hijVar;
    }

    @Override // defpackage.hin
    public final hin c() {
        return hjd.a;
    }

    @Override // defpackage.hin, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
