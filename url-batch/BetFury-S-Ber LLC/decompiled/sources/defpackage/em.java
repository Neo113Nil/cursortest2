package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class em extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile em b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new me0(cls, charSequence) : super.newEditable(charSequence);
    }
}
