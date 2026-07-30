package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fg0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile fg0 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new xn2(cls, charSequence) : super.newEditable(charSequence);
    }
}
