package x0;

import android.text.Editable;
import androidx.emoji2.text.y;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3837a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f3838b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f3839c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f3839c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
