package e4;

import android.text.Editable;
import c4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3853a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f3854b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f3855c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f3855c;
        return cls != null ? new w(cls, charSequence) : super.newEditable(charSequence);
    }
}
