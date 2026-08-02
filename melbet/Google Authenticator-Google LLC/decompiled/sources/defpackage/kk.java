package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kk extends jp {
    final int c;
    final int d;
    public kj e;
    private MenuItem f;

    public kk(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.jp, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ga gaVar;
        int i;
        kj kjVar;
        kj kjVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                gaVar = (ga) headerViewListAdapter.getWrappedAdapter();
            } else {
                gaVar = (ga) adapter;
                i = 0;
            }
            gf item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= gaVar.getCount()) ? null : gaVar.getItem(i2);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                gd gdVar = gaVar.a;
                if (menuItem != null && (kjVar2 = ((kl) this.e).b) != null) {
                    ((fw) kjVar2).a.a.removeCallbacksAndMessages(gdVar);
                }
                this.f = item;
                if (item != null && (kjVar = ((kl) this.e).b) != null) {
                    fw fwVar = (fw) kjVar;
                    fx fxVar = fwVar.a;
                    Handler handler = fxVar.a;
                    handler.removeCallbacksAndMessages(null);
                    List list = fxVar.b;
                    int size = list.size();
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        if (gdVar == ((evt) list.get(i3)).c) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        handler.postAtTime(new fv(fwVar, i4 < list.size() ? (evt) list.get(i4) : null, (MenuItem) item, gdVar, 0), gdVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ga) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ga) adapter).a.i(false);
        return true;
    }
}
