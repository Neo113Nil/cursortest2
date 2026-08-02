package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fll extends Property {
    public fll(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = flm.a;
        return Float.valueOf(((flm) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = flm.a;
        ((flm) obj).g = floatValue;
    }
}
