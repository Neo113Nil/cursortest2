package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhe extends Property {
    public static final Property a = new fhe();

    private fhe() {
        super(Integer.class, "circularRevealScrimColor");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((fhg) obj).a());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((Integer) obj2).intValue();
        ((fhg) obj).e();
    }
}
