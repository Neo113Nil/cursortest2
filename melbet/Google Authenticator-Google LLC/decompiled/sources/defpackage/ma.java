package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ma extends Property {
    public ma(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).f(((Float) obj2).floatValue());
    }
}
