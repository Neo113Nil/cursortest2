package V;

import T.w;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f852a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f853b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f854c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f854c;
        return cls != null ? new w(cls, charSequence) : super.newEditable(charSequence);
    }
}
