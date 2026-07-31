package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class P extends E {

    /* renamed from: s, reason: collision with root package name */
    public final int f4956s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4957t;

    /* renamed from: u, reason: collision with root package name */
    public O f4958u;

    /* renamed from: v, reason: collision with root package name */
    public j.k f4959v;

    public P(Context context, boolean z5) {
        super(context, z5);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4956s = 21;
            this.f4957t = 22;
        } else {
            this.f4956s = 22;
            this.f4957t = 21;
        }
    }

    @Override // k.E, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.h hVar;
        int i7;
        int pointToPosition;
        int i8;
        if (this.f4958u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                hVar = (j.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (j.h) adapter;
                i7 = 0;
            }
            j.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= hVar.getCount()) ? null : hVar.getItem(i8);
            j.k kVar = this.f4959v;
            if (kVar != item) {
                j.j jVar = hVar.f4788f;
                if (kVar != null) {
                    this.f4958u.c(jVar, kVar);
                }
                this.f4959v = item;
                if (item != null) {
                    this.f4958u.g(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f4956s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.f4957t) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (j.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j.h) adapter).f4788f.c(false);
        return true;
    }

    public void setHoverListener(O o7) {
        this.f4958u = o7;
    }

    @Override // k.E, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
