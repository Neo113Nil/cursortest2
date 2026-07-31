package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

/* loaded from: classes12.dex */
public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private final MenuBuilder mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final MenuPopupHelper mPopup;

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(Context context, View view, int i) {
        this(context, view, i, R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.mMenu = menuBuilder;
        menuBuilder.setCallback(new MenuBuilder.Callback() { // from class: androidx.appcompat.widget.PopupMenu.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder2) {
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder2, MenuItem menuItem) {
                OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.mMenuItemClickListener;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        });
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, menuBuilder, view, false, i2, i3);
        this.mPopup = menuPopupHelper;
        menuPopupHelper.setGravity(i);
        menuPopupHelper.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                PopupMenu popupMenu = PopupMenu.this;
                OnDismissListener onDismissListener = popupMenu.mOnDismissListener;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(popupMenu);
                }
            }
        });
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$3, reason: invalid class name */
    /* loaded from: classes5.dex */
    class AnonymousClass3 extends ForwardingListener {
        final /* synthetic */ PopupMenu this$0;

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            this.this$0.show();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStopped() {
            this.this$0.dismiss();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu getPopup() {
            return this.this$0.mPopup.getPopup();
        }
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public void show() {
        this.mPopup.show();
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }
}
