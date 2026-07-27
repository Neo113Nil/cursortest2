package s0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f10266a = new m1();

    public final void a(C1166s c1166s) {
        ViewParent parent = c1166s.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c1166s, c1166s);
        }
    }
}
