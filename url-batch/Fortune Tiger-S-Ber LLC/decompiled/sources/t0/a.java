package t0;

import android.text.Editable;
import androidx.emoji2.text.y;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3361a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f3362b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
