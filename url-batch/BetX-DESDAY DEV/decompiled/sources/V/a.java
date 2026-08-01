package V;

import T.x;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f842a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f843b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f844c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f844c;
        return cls != null ? new x(cls, charSequence) : super.newEditable(charSequence);
    }
}
