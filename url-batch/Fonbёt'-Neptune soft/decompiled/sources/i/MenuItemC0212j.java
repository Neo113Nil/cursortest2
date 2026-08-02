package i;

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
import java.util.ArrayList;
import u.AbstractC0309a;

/* renamed from: i.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC0212j implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2428A;

    /* renamed from: a, reason: collision with root package name */
    public final int f2430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2432c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2433d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2434e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2435f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2436g;

    /* renamed from: h, reason: collision with root package name */
    public char f2437h;

    /* renamed from: j, reason: collision with root package name */
    public char f2439j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2441l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0211i f2443n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0221s f2444o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2445p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2446q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2447r;

    /* renamed from: z, reason: collision with root package name */
    public View f2454z;

    /* renamed from: i, reason: collision with root package name */
    public int f2438i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2440k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2442m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2448s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2449t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2450u = false;
    public boolean v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2451w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2452x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2429B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f2453y = 0;

    public MenuItemC0212j(MenuC0211i menuC0211i, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2443n = menuC0211i;
        this.f2430a = i3;
        this.f2431b = i2;
        this.f2432c = i4;
        this.f2433d = i5;
        this.f2434e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f2451w && (this.f2450u || this.v)) {
            drawable = w0.j.c(drawable).mutate();
            if (this.f2450u) {
                AbstractC0309a.h(drawable, this.f2448s);
            }
            if (this.v) {
                AbstractC0309a.i(drawable, this.f2449t);
            }
            this.f2451w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f2453y & 8) == 0 || this.f2454z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2453y & 8) == 0) {
            return false;
        }
        if (this.f2454z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2428A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2443n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f2452x & 32) == 32;
    }

    public final MenuItemC0212j e(CharSequence charSequence) {
        this.f2446q = charSequence;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2428A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2443n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f2452x |= 32;
        } else {
            this.f2452x &= -33;
        }
    }

    public final MenuItemC0212j g(CharSequence charSequence) {
        this.f2447r = charSequence;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2454z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2440k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2439j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2446q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2431b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2441l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f2442m;
        if (i2 == 0) {
            return null;
        }
        Drawable c2 = d.b.c(this.f2443n.f2408a, i2);
        this.f2442m = 0;
        this.f2441l = c2;
        return b(c2);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2448s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2449t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2436g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2430a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2438i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2437h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2432c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2444o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2434e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2435f;
        return charSequence != null ? charSequence : this.f2434e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2447r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2444o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2429B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2452x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2452x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2452x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2452x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2454z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f2430a) > 0) {
            view.setId(i2);
        }
        MenuC0211i menuC0211i = this.f2443n;
        menuC0211i.f2418k = true;
        menuC0211i.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2439j == c2) {
            return this;
        }
        this.f2439j = Character.toLowerCase(c2);
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2452x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2452x = i3;
        if (i2 != i3) {
            this.f2443n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2452x;
        if ((i2 & 4) != 0) {
            MenuC0211i menuC0211i = this.f2443n;
            menuC0211i.getClass();
            ArrayList arrayList = menuC0211i.f2413f;
            int size = arrayList.size();
            menuC0211i.s();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i3);
                if (menuItemC0212j.f2431b == this.f2431b && (menuItemC0212j.f2452x & 4) != 0 && menuItemC0212j.isCheckable()) {
                    boolean z3 = menuItemC0212j == this;
                    int i4 = menuItemC0212j.f2452x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    menuItemC0212j.f2452x = i5;
                    if (i4 != i5) {
                        menuItemC0212j.f2443n.o(false);
                    }
                }
            }
            menuC0211i.r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2452x = i6;
            if (i2 != i6) {
                this.f2443n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2452x |= 16;
        } else {
            this.f2452x &= -17;
        }
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2442m = 0;
        this.f2441l = drawable;
        this.f2451w = true;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2448s = colorStateList;
        this.f2450u = true;
        this.f2451w = true;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2449t = mode;
        this.v = true;
        this.f2451w = true;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2436g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2437h == c2) {
            return this;
        }
        this.f2437h = c2;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2428A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2445p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2437h = c2;
        this.f2439j = Character.toLowerCase(c3);
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2453y = i2;
        MenuC0211i menuC0211i = this.f2443n;
        menuC0211i.f2418k = true;
        menuC0211i.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2434e = charSequence;
        this.f2443n.o(false);
        SubMenuC0221s subMenuC0221s = this.f2444o;
        if (subMenuC0221s != null) {
            subMenuC0221s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2435f = charSequence;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2452x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2452x = i3;
        if (i2 != i3) {
            MenuC0211i menuC0211i = this.f2443n;
            menuC0211i.f2415h = true;
            menuC0211i.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2434e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2439j == c2 && this.f2440k == i2) {
            return this;
        }
        this.f2439j = Character.toLowerCase(c2);
        this.f2440k = KeyEvent.normalizeMetaState(i2);
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2437h == c2 && this.f2438i == i2) {
            return this;
        }
        this.f2437h = c2;
        this.f2438i = KeyEvent.normalizeMetaState(i2);
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2437h = c2;
        this.f2438i = KeyEvent.normalizeMetaState(i2);
        this.f2439j = Character.toLowerCase(c3);
        this.f2440k = KeyEvent.normalizeMetaState(i3);
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2441l = null;
        this.f2442m = i2;
        this.f2451w = true;
        this.f2443n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2443n.f2408a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2443n.f2408a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2454z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f2430a) > 0) {
            inflate.setId(i3);
        }
        MenuC0211i menuC0211i = this.f2443n;
        menuC0211i.f2418k = true;
        menuC0211i.o(true);
        return this;
    }
}
