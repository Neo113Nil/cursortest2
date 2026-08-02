package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flg extends Property {
    public flg(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = flh.a;
        return Float.valueOf(((flh) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = flh.a;
        ((flh) obj).h = floatValue;
    }
}
