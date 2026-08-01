package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qj extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile qj b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new j60(cls, charSequence) : super.newEditable(charSequence);
    }
}
