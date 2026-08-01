package l;

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
import h.AbstractC0112a;
import java.util.ArrayList;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171o implements F.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0172p f2840A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2841B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2844b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2845c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2846e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2847f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2848g;

    /* renamed from: h, reason: collision with root package name */
    public char f2849h;

    /* renamed from: j, reason: collision with root package name */
    public char f2850j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2852l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0169m f2854n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0156E f2855o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2856p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2857q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2858r;

    /* renamed from: y, reason: collision with root package name */
    public int f2865y;

    /* renamed from: z, reason: collision with root package name */
    public View f2866z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2851k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2853m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2859s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2860t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2861u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2862v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2863w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2864x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2842C = false;

    public C0171o(MenuC0169m menuC0169m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2854n = menuC0169m;
        this.f2843a = i2;
        this.f2844b = i;
        this.f2845c = i3;
        this.d = i4;
        this.f2846e = charSequence;
        this.f2865y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // F.a
    public final ActionProviderVisibilityListenerC0172p a() {
        return this.f2840A;
    }

    @Override // F.a
    public final F.a b(ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p) {
        this.f2866z = null;
        this.f2840A = actionProviderVisibilityListenerC0172p;
        this.f2854n.p(true);
        ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p2 = this.f2840A;
        if (actionProviderVisibilityListenerC0172p2 != null) {
            actionProviderVisibilityListenerC0172p2.f2867a = new D.g(27, this);
            actionProviderVisibilityListenerC0172p2.f2868b.setVisibilityListener(actionProviderVisibilityListenerC0172p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2865y & 8) == 0) {
            return false;
        }
        if (this.f2866z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2841B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2854n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2863w && (this.f2861u || this.f2862v)) {
            drawable = drawable.mutate();
            if (this.f2861u) {
                E.a.h(drawable, this.f2859s);
            }
            if (this.f2862v) {
                E.a.i(drawable, this.f2860t);
            }
            this.f2863w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p;
        if ((this.f2865y & 8) == 0) {
            return false;
        }
        if (this.f2866z == null && (actionProviderVisibilityListenerC0172p = this.f2840A) != null) {
            this.f2866z = actionProviderVisibilityListenerC0172p.f2868b.onCreateActionView(this);
        }
        return this.f2866z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2841B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2854n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2864x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2864x |= 32;
        } else {
            this.f2864x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2866z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p = this.f2840A;
        if (actionProviderVisibilityListenerC0172p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0172p.f2868b.onCreateActionView(this);
        this.f2866z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // F.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2851k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2850j;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2857q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2844b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2852l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2853m;
        if (i == 0) {
            return null;
        }
        Drawable l2 = AbstractC0112a.l(this.f2854n.f2815a, i);
        this.f2853m = 0;
        this.f2852l = l2;
        return d(l2);
    }

    @Override // F.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2859s;
    }

    @Override // F.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2860t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2848g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2843a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2849h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2845c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2855o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2846e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2847f;
        return charSequence != null ? charSequence : this.f2846e;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2858r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2855o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2842C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2864x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2864x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2864x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p = this.f2840A;
        return (actionProviderVisibilityListenerC0172p == null || !actionProviderVisibilityListenerC0172p.f2868b.overridesItemVisibility()) ? (this.f2864x & 8) == 0 : (this.f2864x & 8) == 0 && this.f2840A.f2868b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2866z = view;
        this.f2840A = null;
        if (view != null && view.getId() == -1 && (i = this.f2843a) > 0) {
            view.setId(i);
        }
        MenuC0169m menuC0169m = this.f2854n;
        menuC0169m.f2823k = true;
        menuC0169m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2850j == c2) {
            return this;
        }
        this.f2850j = Character.toLowerCase(c2);
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2864x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2864x = i2;
        if (i != i2) {
            this.f2854n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2864x;
        if ((i & 4) != 0) {
            MenuC0169m menuC0169m = this.f2854n;
            menuC0169m.getClass();
            ArrayList arrayList = menuC0169m.f2819f;
            int size = arrayList.size();
            menuC0169m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0171o c0171o = (C0171o) arrayList.get(i2);
                if (c0171o.f2844b == this.f2844b && (c0171o.f2864x & 4) != 0 && c0171o.isCheckable()) {
                    boolean z3 = c0171o == this;
                    int i3 = c0171o.f2864x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0171o.f2864x = i4;
                    if (i3 != i4) {
                        c0171o.f2854n.p(false);
                    }
                }
            }
            menuC0169m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2864x = i5;
            if (i != i5) {
                this.f2854n.p(false);
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
            this.f2864x |= 16;
        } else {
            this.f2864x &= -17;
        }
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2853m = 0;
        this.f2852l = drawable;
        this.f2863w = true;
        this.f2854n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2859s = colorStateList;
        this.f2861u = true;
        this.f2863w = true;
        this.f2854n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2860t = mode;
        this.f2862v = true;
        this.f2863w = true;
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2848g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2849h == c2) {
            return this;
        }
        this.f2849h = c2;
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2841B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2856p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2849h = c2;
        this.f2850j = Character.toLowerCase(c3);
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2865y = i;
        MenuC0169m menuC0169m = this.f2854n;
        menuC0169m.f2823k = true;
        menuC0169m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2846e = charSequence;
        this.f2854n.p(false);
        SubMenuC0156E subMenuC0156E = this.f2855o;
        if (subMenuC0156E != null) {
            subMenuC0156E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2847f = charSequence;
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2864x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2864x = i2;
        if (i != i2) {
            MenuC0169m menuC0169m = this.f2854n;
            menuC0169m.f2821h = true;
            menuC0169m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2846e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setContentDescription(CharSequence charSequence) {
        this.f2857q = charSequence;
        this.f2854n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setTooltipText(CharSequence charSequence) {
        this.f2858r = charSequence;
        this.f2854n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2850j == c2 && this.f2851k == i) {
            return this;
        }
        this.f2850j = Character.toLowerCase(c2);
        this.f2851k = KeyEvent.normalizeMetaState(i);
        this.f2854n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f2849h == c2 && this.i == i) {
            return this;
        }
        this.f2849h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2854n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f2849h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2850j = Character.toLowerCase(c3);
        this.f2851k = KeyEvent.normalizeMetaState(i2);
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2852l = null;
        this.f2853m = i;
        this.f2863w = true;
        this.f2854n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2854n.f2815a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2854n.f2815a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2866z = inflate;
        this.f2840A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2843a) > 0) {
            inflate.setId(i2);
        }
        MenuC0169m menuC0169m = this.f2854n;
        menuC0169m.f2823k = true;
        menuC0169m.p(true);
        return this;
    }
}
