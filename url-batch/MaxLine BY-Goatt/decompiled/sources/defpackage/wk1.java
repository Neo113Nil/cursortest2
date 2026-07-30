package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wk1 extends ne0 {
    public kk1 A;
    public lk1 B;
    public final int y;
    public final int z;

    public wk1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.y = 21;
            this.z = 22;
        } else {
            this.y = 22;
            this.z = 21;
        }
    }

    @Override // defpackage.ne0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ck1 ck1Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.A != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                ck1Var = (ck1) headerViewListAdapter.getWrappedAdapter();
            } else {
                ck1Var = (ck1) adapter;
                i = 0;
            }
            lk1 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= ck1Var.getCount()) ? null : ck1Var.getItem(i2);
            lk1 lk1Var = this.B;
            if (lk1Var != item) {
                fk1 fk1Var = ck1Var.a;
                if (lk1Var != null) {
                    this.A.f(fk1Var, lk1Var);
                }
                this.B = item;
                if (item != null) {
                    this.A.i(fk1Var, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.z) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ck1) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ck1) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(kk1 kk1Var) {
        this.A = kk1Var;
    }

    @Override // defpackage.ne0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
