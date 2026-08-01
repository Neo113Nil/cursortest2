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
import java.util.ArrayList;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0163p f2685A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2686B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2690c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2691e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2692f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2693g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2694j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2696l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0160m f2698n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0147E f2699o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2700p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2701q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2702r;

    /* renamed from: y, reason: collision with root package name */
    public int f2709y;

    /* renamed from: z, reason: collision with root package name */
    public View f2710z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2695k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2697m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2703s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2704t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2705u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2706v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2707w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2708x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2687C = false;

    public C0162o(MenuC0160m menuC0160m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2698n = menuC0160m;
        this.f2688a = i2;
        this.f2689b = i;
        this.f2690c = i3;
        this.d = i4;
        this.f2691e = charSequence;
        this.f2709y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0163p a() {
        return this.f2685A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p) {
        this.f2710z = null;
        this.f2685A = actionProviderVisibilityListenerC0163p;
        this.f2698n.p(true);
        ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p2 = this.f2685A;
        if (actionProviderVisibilityListenerC0163p2 != null) {
            actionProviderVisibilityListenerC0163p2.f2711a = new C.g(26, this);
            actionProviderVisibilityListenerC0163p2.f2712b.setVisibilityListener(actionProviderVisibilityListenerC0163p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2709y & 8) == 0) {
            return false;
        }
        if (this.f2710z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2686B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2698n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2707w && (this.f2705u || this.f2706v)) {
            drawable = drawable.mutate();
            if (this.f2705u) {
                D.a.h(drawable, this.f2703s);
            }
            if (this.f2706v) {
                D.a.i(drawable, this.f2704t);
            }
            this.f2707w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p;
        if ((this.f2709y & 8) == 0) {
            return false;
        }
        if (this.f2710z == null && (actionProviderVisibilityListenerC0163p = this.f2685A) != null) {
            this.f2710z = actionProviderVisibilityListenerC0163p.f2712b.onCreateActionView(this);
        }
        return this.f2710z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2686B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2698n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2708x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2708x |= 32;
        } else {
            this.f2708x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2710z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p = this.f2685A;
        if (actionProviderVisibilityListenerC0163p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0163p.f2712b.onCreateActionView(this);
        this.f2710z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2695k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2694j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2701q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2689b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2696l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2697m;
        if (i == 0) {
            return null;
        }
        Drawable z2 = x1.l.z(this.f2698n.f2661a, i);
        this.f2697m = 0;
        this.f2696l = z2;
        return d(z2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2703s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2704t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2693g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2688a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2690c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2699o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2691e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2692f;
        return charSequence != null ? charSequence : this.f2691e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2702r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2699o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2687C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2708x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2708x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2708x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p = this.f2685A;
        return (actionProviderVisibilityListenerC0163p == null || !actionProviderVisibilityListenerC0163p.f2712b.overridesItemVisibility()) ? (this.f2708x & 8) == 0 : (this.f2708x & 8) == 0 && this.f2685A.f2712b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2710z = view;
        this.f2685A = null;
        if (view != null && view.getId() == -1 && (i = this.f2688a) > 0) {
            view.setId(i);
        }
        MenuC0160m menuC0160m = this.f2698n;
        menuC0160m.f2668k = true;
        menuC0160m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2694j == c2) {
            return this;
        }
        this.f2694j = Character.toLowerCase(c2);
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2708x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2708x = i2;
        if (i != i2) {
            this.f2698n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2708x;
        if ((i & 4) != 0) {
            MenuC0160m menuC0160m = this.f2698n;
            menuC0160m.getClass();
            ArrayList arrayList = menuC0160m.f2665f;
            int size = arrayList.size();
            menuC0160m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0162o c0162o = (C0162o) arrayList.get(i2);
                if (c0162o.f2689b == this.f2689b && (c0162o.f2708x & 4) != 0 && c0162o.isCheckable()) {
                    boolean z3 = c0162o == this;
                    int i3 = c0162o.f2708x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0162o.f2708x = i4;
                    if (i3 != i4) {
                        c0162o.f2698n.p(false);
                    }
                }
            }
            menuC0160m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2708x = i5;
            if (i != i5) {
                this.f2698n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2708x |= 16;
        } else {
            this.f2708x &= -17;
        }
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2697m = 0;
        this.f2696l = drawable;
        this.f2707w = true;
        this.f2698n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2703s = colorStateList;
        this.f2705u = true;
        this.f2707w = true;
        this.f2698n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2704t = mode;
        this.f2706v = true;
        this.f2707w = true;
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2693g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2686B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2700p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2694j = Character.toLowerCase(c3);
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2709y = i;
        MenuC0160m menuC0160m = this.f2698n;
        menuC0160m.f2668k = true;
        menuC0160m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2691e = charSequence;
        this.f2698n.p(false);
        SubMenuC0147E subMenuC0147E = this.f2699o;
        if (subMenuC0147E != null) {
            subMenuC0147E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2692f = charSequence;
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2708x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2708x = i2;
        if (i != i2) {
            MenuC0160m menuC0160m = this.f2698n;
            menuC0160m.h = true;
            menuC0160m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2691e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2701q = charSequence;
        this.f2698n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2702r = charSequence;
        this.f2698n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2694j == c2 && this.f2695k == i) {
            return this;
        }
        this.f2694j = Character.toLowerCase(c2);
        this.f2695k = KeyEvent.normalizeMetaState(i);
        this.f2698n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2698n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2694j = Character.toLowerCase(c3);
        this.f2695k = KeyEvent.normalizeMetaState(i2);
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2696l = null;
        this.f2697m = i;
        this.f2707w = true;
        this.f2698n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2698n.f2661a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2698n.f2661a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2710z = inflate;
        this.f2685A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2688a) > 0) {
            inflate.setId(i2);
        }
        MenuC0160m menuC0160m = this.f2698n;
        menuC0160m.f2668k = true;
        menuC0160m.p(true);
        return this;
    }
}
