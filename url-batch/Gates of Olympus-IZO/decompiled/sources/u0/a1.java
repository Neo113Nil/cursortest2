package u0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f8288a = new a1();

    public final void a(C0997t c0997t) {
        ViewParent parent = c0997t.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c0997t, c0997t);
        }
    }
}
