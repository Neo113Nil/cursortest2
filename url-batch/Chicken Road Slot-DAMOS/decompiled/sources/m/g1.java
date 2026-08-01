package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g1 extends q0 {
    public final int A;
    public final int B;
    public d1 C;
    public l.j D;

    public g1(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.A = 21;
            this.B = 22;
        } else {
            this.A = 22;
            this.B = 21;
        }
    }

    @Override // m.q0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.g gVar;
        int i3;
        int pointToPosition;
        int i10;
        if (this.C != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                gVar = (l.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (l.g) adapter;
                i3 = 0;
            }
            l.j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = pointToPosition - i3) < 0 || i10 >= gVar.getCount()) ? null : gVar.getItem(i10);
            l.j jVar = this.D;
            if (jVar != item) {
                l.i iVar = gVar.f5658a;
                if (jVar != null) {
                    this.C.g(iVar, jVar);
                }
                this.D = item;
                if (item != null) {
                    this.C.e(iVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.A) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.B) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.g) adapter).f5658a.c(false);
        return true;
    }

    public void setHoverListener(d1 d1Var) {
        this.C = d1Var;
    }

    @Override // m.q0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
