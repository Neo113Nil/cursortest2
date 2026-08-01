package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class oh extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile oh b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new h30(cls, charSequence) : super.newEditable(charSequence);
    }
}
