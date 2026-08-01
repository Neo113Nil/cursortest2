package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gh extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile gh b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new s30(cls, charSequence) : super.newEditable(charSequence);
    }
}
