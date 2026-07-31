package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.ironsource.X3;
import com.yandex.div.core.DivActionHandler;
import kotlin.Metadata;

/* compiled from: PrimaryTextActionModeCallback.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/PrimaryTextActionModeCallback;", "Landroid/view/ActionMode$Callback;", "Landroid/view/ActionMode;", X3.a.t, "Landroid/view/MenuItem;", "item", "", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Landroid/view/Menu;", DivActionHandler.DivActionReason.MENU, "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "callback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {
    private final TextActionModeCallback callback;

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return this.callback.onActionItemClicked(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        return this.callback.onCreateActionMode(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return this.callback.onPrepareActionMode(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
        this.callback.onDestroyActionMode();
    }
}
