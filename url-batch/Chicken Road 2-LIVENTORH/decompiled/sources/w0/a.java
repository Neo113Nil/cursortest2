package w0;

import android.text.Editable;
import androidx.emoji2.text.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3557a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f3558b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f3559c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f3559c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
