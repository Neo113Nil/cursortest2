package s0;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final N0 f10101a = new N0();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i2) {
        return view.startActionMode(callback, i2);
    }
}
