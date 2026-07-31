package u0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f9398a = new l1();

    public final void a(C1123s c1123s) {
        ViewParent parent = c1123s.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c1123s, c1123s);
        }
    }
}
