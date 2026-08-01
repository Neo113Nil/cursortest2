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
    public ActionProviderVisibilityListenerC0160p f2705A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2706B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2709b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2710c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2711e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2712f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2713g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2714j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2716l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0157m f2718n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0144E f2719o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2720p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2721q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2722r;

    /* renamed from: y, reason: collision with root package name */
    public int f2729y;

    /* renamed from: z, reason: collision with root package name */
    public View f2730z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2715k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2717m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2723s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2724t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2725u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2726v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2727w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2728x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2707C = false;

    public C0159o(MenuC0157m menuC0157m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2718n = menuC0157m;
        this.f2708a = i2;
        this.f2709b = i;
        this.f2710c = i3;
        this.d = i4;
        this.f2711e = charSequence;
        this.f2729y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0160p a() {
        return this.f2705A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p) {
        this.f2730z = null;
        this.f2705A = actionProviderVisibilityListenerC0160p;
        this.f2718n.p(true);
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p2 = this.f2705A;
        if (actionProviderVisibilityListenerC0160p2 != null) {
            actionProviderVisibilityListenerC0160p2.f2731a = new B0.d(29, this);
            actionProviderVisibilityListenerC0160p2.f2732b.setVisibilityListener(actionProviderVisibilityListenerC0160p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2729y & 8) == 0) {
            return false;
        }
        if (this.f2730z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2706B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2718n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2727w && (this.f2725u || this.f2726v)) {
            drawable = drawable.mutate();
            if (this.f2725u) {
                D.a.h(drawable, this.f2723s);
            }
            if (this.f2726v) {
                D.a.i(drawable, this.f2724t);
            }
            this.f2727w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p;
        if ((this.f2729y & 8) == 0) {
            return false;
        }
        if (this.f2730z == null && (actionProviderVisibilityListenerC0160p = this.f2705A) != null) {
            this.f2730z = actionProviderVisibilityListenerC0160p.f2732b.onCreateActionView(this);
        }
        return this.f2730z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2706B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2718n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2728x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2728x |= 32;
        } else {
            this.f2728x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2730z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = this.f2705A;
        if (actionProviderVisibilityListenerC0160p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0160p.f2732b.onCreateActionView(this);
        this.f2730z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2715k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2714j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2721q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2709b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2716l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2717m;
        if (i == 0) {
            return null;
        }
        Drawable v2 = q1.l.v(this.f2718n.f2681a, i);
        this.f2717m = 0;
        this.f2716l = v2;
        return d(v2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2723s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2724t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2713g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2708a;
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
        return this.f2710c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2719o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2711e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2712f;
        return charSequence != null ? charSequence : this.f2711e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2722r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2719o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2707C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2728x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2728x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2728x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = this.f2705A;
        return (actionProviderVisibilityListenerC0160p == null || !actionProviderVisibilityListenerC0160p.f2732b.overridesItemVisibility()) ? (this.f2728x & 8) == 0 : (this.f2728x & 8) == 0 && this.f2705A.f2732b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2730z = view;
        this.f2705A = null;
        if (view != null && view.getId() == -1 && (i = this.f2708a) > 0) {
            view.setId(i);
        }
        MenuC0157m menuC0157m = this.f2718n;
        menuC0157m.f2688k = true;
        menuC0157m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2714j == c2) {
            return this;
        }
        this.f2714j = Character.toLowerCase(c2);
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2728x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2728x = i2;
        if (i != i2) {
            this.f2718n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2728x;
        if ((i & 4) != 0) {
            MenuC0157m menuC0157m = this.f2718n;
            menuC0157m.getClass();
            ArrayList arrayList = menuC0157m.f2685f;
            int size = arrayList.size();
            menuC0157m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0159o c0159o = (C0159o) arrayList.get(i2);
                if (c0159o.f2709b == this.f2709b && (c0159o.f2728x & 4) != 0 && c0159o.isCheckable()) {
                    boolean z3 = c0159o == this;
                    int i3 = c0159o.f2728x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0159o.f2728x = i4;
                    if (i3 != i4) {
                        c0159o.f2718n.p(false);
                    }
                }
            }
            menuC0157m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2728x = i5;
            if (i != i5) {
                this.f2718n.p(false);
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
            this.f2728x |= 16;
        } else {
            this.f2728x &= -17;
        }
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2717m = 0;
        this.f2716l = drawable;
        this.f2727w = true;
        this.f2718n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2723s = colorStateList;
        this.f2725u = true;
        this.f2727w = true;
        this.f2718n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2724t = mode;
        this.f2726v = true;
        this.f2727w = true;
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2713g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2706B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2720p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2714j = Character.toLowerCase(c3);
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2729y = i;
        MenuC0157m menuC0157m = this.f2718n;
        menuC0157m.f2688k = true;
        menuC0157m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2711e = charSequence;
        this.f2718n.p(false);
        SubMenuC0144E subMenuC0144E = this.f2719o;
        if (subMenuC0144E != null) {
            subMenuC0144E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2712f = charSequence;
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2728x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2728x = i2;
        if (i != i2) {
            MenuC0157m menuC0157m = this.f2718n;
            menuC0157m.h = true;
            menuC0157m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2711e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2721q = charSequence;
        this.f2718n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2722r = charSequence;
        this.f2718n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2714j == c2 && this.f2715k == i) {
            return this;
        }
        this.f2714j = Character.toLowerCase(c2);
        this.f2715k = KeyEvent.normalizeMetaState(i);
        this.f2718n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2718n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2714j = Character.toLowerCase(c3);
        this.f2715k = KeyEvent.normalizeMetaState(i2);
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2716l = null;
        this.f2717m = i;
        this.f2727w = true;
        this.f2718n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2718n.f2681a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2718n.f2681a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2730z = inflate;
        this.f2705A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2708a) > 0) {
            inflate.setId(i2);
        }
        MenuC0157m menuC0157m = this.f2718n;
        menuC0157m.f2688k = true;
        menuC0157m.p(true);
        return this;
    }
}
