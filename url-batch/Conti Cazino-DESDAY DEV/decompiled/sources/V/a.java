package V;

import T.v;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f765a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f766b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f767c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f767c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
