package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ax extends mi {
    public final int r;
    public final int s;
    public ow t;
    public qw u;

    public ax(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.mi, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        jw jwVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                jwVar = (jw) headerViewListAdapter.getWrappedAdapter();
            } else {
                jwVar = (jw) adapter;
                i = 0;
            }
            qw item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= jwVar.getCount()) ? null : jwVar.getItem(i2);
            qw qwVar = this.u;
            if (qwVar != item) {
                mw mwVar = jwVar.a;
                if (qwVar != null) {
                    this.t.h(mwVar, qwVar);
                }
                this.u = item;
                if (item != null) {
                    this.t.j(mwVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (jw) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (jw) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(ow owVar) {
        this.t = owVar;
    }

    @Override // defpackage.mi, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
