package f4;

import android.text.Editable;
import d4.z;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2717a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f2718b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f2719c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2719c;
        return cls != null ? new z(cls, charSequence) : super.newEditable(charSequence);
    }
}
