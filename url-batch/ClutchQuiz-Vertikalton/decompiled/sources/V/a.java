package V;

import T.y;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f865a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f866b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f867c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f867c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
