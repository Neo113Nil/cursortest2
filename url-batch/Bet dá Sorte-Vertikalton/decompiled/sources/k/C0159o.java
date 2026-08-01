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
public final class C0159o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0160p f2672A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2673B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2677c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2678e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2679f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2680g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2681j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2683l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0157m f2685n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0144E f2686o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2687p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2688q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2689r;

    /* renamed from: y, reason: collision with root package name */
    public int f2696y;

    /* renamed from: z, reason: collision with root package name */
    public View f2697z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2682k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2684m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2690s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2691t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2692u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2693v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2694w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2695x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2674C = false;

    public C0159o(MenuC0157m menuC0157m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2685n = menuC0157m;
        this.f2675a = i2;
        this.f2676b = i;
        this.f2677c = i3;
        this.d = i4;
        this.f2678e = charSequence;
        this.f2696y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0160p a() {
        return this.f2672A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p) {
        this.f2697z = null;
        this.f2672A = actionProviderVisibilityListenerC0160p;
        this.f2685n.p(true);
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p2 = this.f2672A;
        if (actionProviderVisibilityListenerC0160p2 != null) {
            actionProviderVisibilityListenerC0160p2.f2698a = new C.h(26, this);
            actionProviderVisibilityListenerC0160p2.f2699b.setVisibilityListener(actionProviderVisibilityListenerC0160p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2696y & 8) == 0) {
            return false;
        }
        if (this.f2697z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2673B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2685n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2694w && (this.f2692u || this.f2693v)) {
            drawable = drawable.mutate();
            if (this.f2692u) {
                D.a.h(drawable, this.f2690s);
            }
            if (this.f2693v) {
                D.a.i(drawable, this.f2691t);
            }
            this.f2694w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p;
        if ((this.f2696y & 8) == 0) {
            return false;
        }
        if (this.f2697z == null && (actionProviderVisibilityListenerC0160p = this.f2672A) != null) {
            this.f2697z = actionProviderVisibilityListenerC0160p.f2699b.onCreateActionView(this);
        }
        return this.f2697z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2673B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2685n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2695x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2695x |= 32;
        } else {
            this.f2695x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2697z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = this.f2672A;
        if (actionProviderVisibilityListenerC0160p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0160p.f2699b.onCreateActionView(this);
        this.f2697z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2682k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2681j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2688q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2676b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2683l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2684m;
        if (i == 0) {
            return null;
        }
        Drawable D2 = u1.d.D(this.f2685n.f2648a, i);
        this.f2684m = 0;
        this.f2683l = D2;
        return d(D2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2690s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2691t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2680g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2675a;
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
        return this.f2677c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2686o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2678e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2679f;
        return charSequence != null ? charSequence : this.f2678e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2689r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2686o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2674C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2695x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2695x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2695x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = this.f2672A;
        return (actionProviderVisibilityListenerC0160p == null || !actionProviderVisibilityListenerC0160p.f2699b.overridesItemVisibility()) ? (this.f2695x & 8) == 0 : (this.f2695x & 8) == 0 && this.f2672A.f2699b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2697z = view;
        this.f2672A = null;
        if (view != null && view.getId() == -1 && (i = this.f2675a) > 0) {
            view.setId(i);
        }
        MenuC0157m menuC0157m = this.f2685n;
        menuC0157m.f2655k = true;
        menuC0157m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2681j == c2) {
            return this;
        }
        this.f2681j = Character.toLowerCase(c2);
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2695x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2695x = i2;
        if (i != i2) {
            this.f2685n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2695x;
        if ((i & 4) != 0) {
            MenuC0157m menuC0157m = this.f2685n;
            menuC0157m.getClass();
            ArrayList arrayList = menuC0157m.f2652f;
            int size = arrayList.size();
            menuC0157m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0159o c0159o = (C0159o) arrayList.get(i2);
                if (c0159o.f2676b == this.f2676b && (c0159o.f2695x & 4) != 0 && c0159o.isCheckable()) {
                    boolean z3 = c0159o == this;
                    int i3 = c0159o.f2695x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0159o.f2695x = i4;
                    if (i3 != i4) {
                        c0159o.f2685n.p(false);
                    }
                }
            }
            menuC0157m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2695x = i5;
            if (i != i5) {
                this.f2685n.p(false);
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
            this.f2695x |= 16;
        } else {
            this.f2695x &= -17;
        }
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2684m = 0;
        this.f2683l = drawable;
        this.f2694w = true;
        this.f2685n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2690s = colorStateList;
        this.f2692u = true;
        this.f2694w = true;
        this.f2685n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2691t = mode;
        this.f2693v = true;
        this.f2694w = true;
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2680g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2673B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2687p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2681j = Character.toLowerCase(c3);
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2696y = i;
        MenuC0157m menuC0157m = this.f2685n;
        menuC0157m.f2655k = true;
        menuC0157m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2678e = charSequence;
        this.f2685n.p(false);
        SubMenuC0144E subMenuC0144E = this.f2686o;
        if (subMenuC0144E != null) {
            subMenuC0144E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2679f = charSequence;
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2695x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2695x = i2;
        if (i != i2) {
            MenuC0157m menuC0157m = this.f2685n;
            menuC0157m.h = true;
            menuC0157m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2678e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2688q = charSequence;
        this.f2685n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2689r = charSequence;
        this.f2685n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2681j == c2 && this.f2682k == i) {
            return this;
        }
        this.f2681j = Character.toLowerCase(c2);
        this.f2682k = KeyEvent.normalizeMetaState(i);
        this.f2685n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2685n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2681j = Character.toLowerCase(c3);
        this.f2682k = KeyEvent.normalizeMetaState(i2);
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2683l = null;
        this.f2684m = i;
        this.f2694w = true;
        this.f2685n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2685n.f2648a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2685n.f2648a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2697z = inflate;
        this.f2672A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2675a) > 0) {
            inflate.setId(i2);
        }
        MenuC0157m menuC0157m = this.f2685n;
        menuC0157m.f2655k = true;
        menuC0157m.p(true);
        return this;
    }
}
