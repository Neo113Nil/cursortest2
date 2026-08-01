package X;

import V.v;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f962a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f963b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f964c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f964c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
