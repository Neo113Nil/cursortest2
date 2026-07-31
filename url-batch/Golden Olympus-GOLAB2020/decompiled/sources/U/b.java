package U;

import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f9331a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f9332b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f9333c;

    private b() {
        try {
            f9333c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f9332b == null) {
            synchronized (f9331a) {
                try {
                    if (f9332b == null) {
                        f9332b = new b();
                    }
                } finally {
                }
            }
        }
        return f9332b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f9333c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
