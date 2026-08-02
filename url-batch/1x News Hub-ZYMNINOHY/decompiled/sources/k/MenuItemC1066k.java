package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import h.AbstractC0337a;
import java.util.ArrayList;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC1066k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f9616A;

    /* renamed from: a, reason: collision with root package name */
    public final int f9618a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9620c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9621d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9622e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f9623g;

    /* renamed from: h, reason: collision with root package name */
    public char f9624h;

    /* renamed from: j, reason: collision with root package name */
    public char f9626j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9628l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC1065j f9630n;
    public SubMenuC1075t o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9631p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f9632q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f9633r;
    public View z;

    /* renamed from: i, reason: collision with root package name */
    public int f9625i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f9627k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f9629m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f9634s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9635t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9636u = false;
    public boolean v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9637w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f9638x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9617B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f9639y = 0;

    public MenuItemC1066k(MenuC1065j menuC1065j, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f9630n = menuC1065j;
        this.f9618a = i4;
        this.f9619b = i3;
        this.f9620c = i5;
        this.f9621d = i6;
        this.f9622e = charSequence;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f9637w && (this.f9636u || this.v)) {
            drawable = drawable.mutate();
            if (this.f9636u) {
                drawable.setTintList(this.f9634s);
            }
            if (this.v) {
                drawable.setTintMode(this.f9635t);
            }
            this.f9637w = false;
        }
        return drawable;
    }

    public final MenuItemC1066k c(CharSequence charSequence) {
        this.f9632q = charSequence;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9639y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9616A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9630n.d(this);
        }
        return false;
    }

    public final void d(boolean z) {
        if (z) {
            this.f9638x |= 32;
        } else {
            this.f9638x &= -33;
        }
    }

    public final MenuItemC1066k e(CharSequence charSequence) {
        this.f9633r = charSequence;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if ((((this.f9639y & 8) == 0 || this.z == null) ? false : true) && ((onActionExpandListener = this.f9616A) == null || onActionExpandListener.onMenuItemActionExpand(this))) {
            return this.f9630n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9627k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9626j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9632q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9619b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9628l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f9629m;
        if (i3 == 0) {
            return null;
        }
        Drawable a3 = AbstractC0337a.a(this.f9630n.f9597a, i3);
        this.f9629m = 0;
        this.f9628l = a3;
        return b(a3);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9634s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9635t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9623g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9618a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9625i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9624h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9620c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9622e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f9622e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9633r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f9617B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9638x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9638x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9638x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9638x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f9618a) > 0) {
            view.setId(i3);
        }
        MenuC1065j menuC1065j = this.f9630n;
        menuC1065j.f9606k = true;
        menuC1065j.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f9626j == c3) {
            return this;
        }
        this.f9626j = Character.toLowerCase(c3);
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i3 = this.f9638x;
        int i4 = (z ? 1 : 0) | (i3 & (-2));
        this.f9638x = i4;
        if (i3 != i4) {
            this.f9630n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i3 = this.f9638x;
        if ((i3 & 4) == 0) {
            int i4 = (i3 & (-3)) | (z ? 2 : 0);
            this.f9638x = i4;
            if (i3 != i4) {
                this.f9630n.o(false);
            }
            return this;
        }
        MenuC1065j menuC1065j = this.f9630n;
        menuC1065j.getClass();
        ArrayList arrayList = menuC1065j.f;
        int size = arrayList.size();
        menuC1065j.s();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i5);
            if (menuItemC1066k.f9619b == this.f9619b && (menuItemC1066k.f9638x & 4) != 0 && menuItemC1066k.isCheckable()) {
                boolean z2 = menuItemC1066k == this;
                int i6 = menuItemC1066k.f9638x;
                int i7 = (z2 ? 2 : 0) | (i6 & (-3));
                menuItemC1066k.f9638x = i7;
                if (i6 != i7) {
                    menuItemC1066k.f9630n.o(false);
                }
            }
        }
        menuC1065j.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f9638x |= 16;
        } else {
            this.f9638x &= -17;
        }
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9629m = 0;
        this.f9628l = drawable;
        this.f9637w = true;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9634s = colorStateList;
        this.f9636u = true;
        this.f9637w = true;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9635t = mode;
        this.v = true;
        this.f9637w = true;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9623g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f9624h == c3) {
            return this;
        }
        this.f9624h = c3;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9616A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9631p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f9624h = c3;
        this.f9626j = Character.toLowerCase(c4);
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9639y = i3;
        MenuC1065j menuC1065j = this.f9630n;
        menuC1065j.f9606k = true;
        menuC1065j.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9622e = charSequence;
        this.f9630n.o(false);
        SubMenuC1075t subMenuC1075t = this.o;
        if (subMenuC1075t != null) {
            subMenuC1075t.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i3 = this.f9638x;
        int i4 = (z ? 0 : 8) | (i3 & (-9));
        this.f9638x = i4;
        if (i3 != i4) {
            MenuC1065j menuC1065j = this.f9630n;
            menuC1065j.f9603h = true;
            menuC1065j.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9622e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f9626j == c3 && this.f9627k == i3) {
            return this;
        }
        this.f9626j = Character.toLowerCase(c3);
        this.f9627k = KeyEvent.normalizeMetaState(i3);
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f9624h == c3 && this.f9625i == i3) {
            return this;
        }
        this.f9624h = c3;
        this.f9625i = KeyEvent.normalizeMetaState(i3);
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f9624h = c3;
        this.f9625i = KeyEvent.normalizeMetaState(i3);
        this.f9626j = Character.toLowerCase(c4);
        this.f9627k = KeyEvent.normalizeMetaState(i4);
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f9628l = null;
        this.f9629m = i3;
        this.f9637w = true;
        this.f9630n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f9630n.f9597a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f9630n.f9597a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f9618a) > 0) {
            inflate.setId(i4);
        }
        MenuC1065j menuC1065j = this.f9630n;
        menuC1065j.f9606k = true;
        menuC1065j.o(true);
        return this;
    }
}
