package u0;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f9235a = new M0();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i3) {
        return view.startActionMode(callback, i3);
    }
}
