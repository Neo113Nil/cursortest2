package h;

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
import e.AbstractC0121a;
import java.util.ArrayList;
import s.AbstractC0226a;

/* renamed from: h.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC0144k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2028A;

    /* renamed from: a, reason: collision with root package name */
    public final int f2030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2031b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2032c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2033d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2034e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2035f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2036g;

    /* renamed from: h, reason: collision with root package name */
    public char f2037h;

    /* renamed from: j, reason: collision with root package name */
    public char f2039j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2041l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0143j f2043n;

    /* renamed from: o, reason: collision with root package name */
    public t f2044o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2045p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2046q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2047r;

    /* renamed from: z, reason: collision with root package name */
    public View f2054z;

    /* renamed from: i, reason: collision with root package name */
    public int f2038i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2040k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2042m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2048s = null;
    public PorterDuff.Mode t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2049u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2050v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2051w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2052x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2029B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f2053y = 0;

    public MenuItemC0144k(MenuC0143j menuC0143j, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2043n = menuC0143j;
        this.f2030a = i3;
        this.f2031b = i2;
        this.f2032c = i4;
        this.f2033d = i5;
        this.f2034e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f2051w && (this.f2049u || this.f2050v)) {
            drawable = drawable.mutate();
            if (this.f2049u) {
                AbstractC0226a.h(drawable, this.f2048s);
            }
            if (this.f2050v) {
                AbstractC0226a.i(drawable, this.t);
            }
            this.f2051w = false;
        }
        return drawable;
    }

    public final MenuItemC0144k c(CharSequence charSequence) {
        this.f2046q = charSequence;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2053y & 8) == 0) {
            return false;
        }
        if (this.f2054z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2028A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2043n.d(this);
        }
        return false;
    }

    public final void d(boolean z2) {
        if (z2) {
            this.f2052x |= 32;
        } else {
            this.f2052x &= -33;
        }
    }

    public final MenuItemC0144k e(CharSequence charSequence) {
        this.f2047r = charSequence;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f2053y & 8) == 0 || this.f2054z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2028A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2043n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2054z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2040k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2039j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2046q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2031b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2041l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f2042m;
        if (i2 == 0) {
            return null;
        }
        Drawable a2 = AbstractC0121a.a(this.f2043n.f2009a, i2);
        this.f2042m = 0;
        this.f2041l = a2;
        return b(a2);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2048s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2036g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2030a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2038i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2037h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2032c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2044o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2034e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2035f;
        return charSequence != null ? charSequence : this.f2034e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2047r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2044o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2029B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2052x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2052x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2052x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2052x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2054z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f2030a) > 0) {
            view.setId(i2);
        }
        MenuC0143j menuC0143j = this.f2043n;
        menuC0143j.f2019k = true;
        menuC0143j.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2039j == c2) {
            return this;
        }
        this.f2039j = Character.toLowerCase(c2);
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2052x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2052x = i3;
        if (i2 != i3) {
            this.f2043n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2052x;
        if ((i2 & 4) == 0) {
            int i3 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2052x = i3;
            if (i2 != i3) {
                this.f2043n.o(false);
            }
            return this;
        }
        MenuC0143j menuC0143j = this.f2043n;
        ArrayList arrayList = menuC0143j.f2014f;
        int size = arrayList.size();
        menuC0143j.s();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i4);
            if (menuItemC0144k.f2031b == this.f2031b && (menuItemC0144k.f2052x & 4) != 0 && menuItemC0144k.isCheckable()) {
                boolean z3 = menuItemC0144k == this;
                int i5 = menuItemC0144k.f2052x;
                int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                menuItemC0144k.f2052x = i6;
                if (i5 != i6) {
                    menuItemC0144k.f2043n.o(false);
                }
            }
        }
        menuC0143j.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2052x |= 16;
        } else {
            this.f2052x &= -17;
        }
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2042m = 0;
        this.f2041l = drawable;
        this.f2051w = true;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2048s = colorStateList;
        this.f2049u = true;
        this.f2051w = true;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.f2050v = true;
        this.f2051w = true;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2036g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2037h == c2) {
            return this;
        }
        this.f2037h = c2;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2028A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2045p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2037h = c2;
        this.f2039j = Character.toLowerCase(c3);
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2053y = i2;
        MenuC0143j menuC0143j = this.f2043n;
        menuC0143j.f2019k = true;
        menuC0143j.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2034e = charSequence;
        this.f2043n.o(false);
        t tVar = this.f2044o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2035f = charSequence;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2052x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2052x = i3;
        if (i2 != i3) {
            MenuC0143j menuC0143j = this.f2043n;
            menuC0143j.f2016h = true;
            menuC0143j.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2034e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2039j == c2 && this.f2040k == i2) {
            return this;
        }
        this.f2039j = Character.toLowerCase(c2);
        this.f2040k = KeyEvent.normalizeMetaState(i2);
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2037h == c2 && this.f2038i == i2) {
            return this;
        }
        this.f2037h = c2;
        this.f2038i = KeyEvent.normalizeMetaState(i2);
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2037h = c2;
        this.f2038i = KeyEvent.normalizeMetaState(i2);
        this.f2039j = Character.toLowerCase(c3);
        this.f2040k = KeyEvent.normalizeMetaState(i3);
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2041l = null;
        this.f2042m = i2;
        this.f2051w = true;
        this.f2043n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2043n.f2009a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2043n.f2009a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2054z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f2030a) > 0) {
            inflate.setId(i3);
        }
        MenuC0143j menuC0143j = this.f2043n;
        menuC0143j.f2019k = true;
        menuC0143j.o(true);
        return this;
    }
}
