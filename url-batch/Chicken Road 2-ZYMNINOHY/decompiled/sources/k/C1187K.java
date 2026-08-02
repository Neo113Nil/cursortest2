package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: k.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187K extends AbstractC1239z {
    public final int n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1186J f13942p;

    /* renamed from: q, reason: collision with root package name */
    public j.k f13943q;

    public C1187K(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.n = 21;
            this.o = 22;
        } else {
            this.n = 22;
            this.o = 21;
        }
    }

    @Override // k.AbstractC1239z, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.h hVar;
        int i4;
        int pointToPosition;
        int i5;
        if (this.f13942p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                hVar = (j.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (j.h) adapter;
                i4 = 0;
            }
            j.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= hVar.getCount()) ? null : hVar.getItem(i5);
            j.k kVar = this.f13943q;
            if (kVar != item) {
                j.j jVar = hVar.f13641a;
                if (kVar != null) {
                    this.f13942p.n(jVar, kVar);
                }
                this.f13943q = item;
                if (item != null) {
                    this.f13942p.j(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.o) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ((j.h) getAdapter()).f13641a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1186J interfaceC1186J) {
        this.f13942p = interfaceC1186J;
    }

    @Override // k.AbstractC1239z, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
