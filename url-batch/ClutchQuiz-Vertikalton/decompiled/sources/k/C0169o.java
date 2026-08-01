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
public final class C0169o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0170p f2770A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2771B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2775c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2776e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2777f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2778g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2779j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2781l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0167m f2783n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0154E f2784o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2785p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2786q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2787r;

    /* renamed from: y, reason: collision with root package name */
    public int f2794y;

    /* renamed from: z, reason: collision with root package name */
    public View f2795z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2780k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2782m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2788s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2789t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2790u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2791v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2792w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2793x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2772C = false;

    public C0169o(MenuC0167m menuC0167m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2783n = menuC0167m;
        this.f2773a = i2;
        this.f2774b = i;
        this.f2775c = i3;
        this.d = i4;
        this.f2776e = charSequence;
        this.f2794y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0170p a() {
        return this.f2770A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p) {
        this.f2795z = null;
        this.f2770A = actionProviderVisibilityListenerC0170p;
        this.f2783n.p(true);
        ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p2 = this.f2770A;
        if (actionProviderVisibilityListenerC0170p2 != null) {
            actionProviderVisibilityListenerC0170p2.f2796a = new A0.h(25, this);
            actionProviderVisibilityListenerC0170p2.f2797b.setVisibilityListener(actionProviderVisibilityListenerC0170p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2794y & 8) == 0) {
            return false;
        }
        if (this.f2795z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2771B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2783n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2792w && (this.f2790u || this.f2791v)) {
            drawable = drawable.mutate();
            if (this.f2790u) {
                D.a.h(drawable, this.f2788s);
            }
            if (this.f2791v) {
                D.a.i(drawable, this.f2789t);
            }
            this.f2792w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p;
        if ((this.f2794y & 8) == 0) {
            return false;
        }
        if (this.f2795z == null && (actionProviderVisibilityListenerC0170p = this.f2770A) != null) {
            this.f2795z = actionProviderVisibilityListenerC0170p.f2797b.onCreateActionView(this);
        }
        return this.f2795z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2771B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2783n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2793x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2793x |= 32;
        } else {
            this.f2793x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2795z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p = this.f2770A;
        if (actionProviderVisibilityListenerC0170p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0170p.f2797b.onCreateActionView(this);
        this.f2795z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2780k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2779j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2786q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2774b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2781l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2782m;
        if (i == 0) {
            return null;
        }
        Drawable t2 = T.d.t(this.f2783n.f2746a, i);
        this.f2782m = 0;
        this.f2781l = t2;
        return d(t2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2788s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2789t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2778g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2773a;
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
        return this.f2775c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2784o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2776e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2777f;
        return charSequence != null ? charSequence : this.f2776e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2787r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2784o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2772C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2793x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2793x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2793x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p = this.f2770A;
        return (actionProviderVisibilityListenerC0170p == null || !actionProviderVisibilityListenerC0170p.f2797b.overridesItemVisibility()) ? (this.f2793x & 8) == 0 : (this.f2793x & 8) == 0 && this.f2770A.f2797b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2795z = view;
        this.f2770A = null;
        if (view != null && view.getId() == -1 && (i = this.f2773a) > 0) {
            view.setId(i);
        }
        MenuC0167m menuC0167m = this.f2783n;
        menuC0167m.f2753k = true;
        menuC0167m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2779j == c2) {
            return this;
        }
        this.f2779j = Character.toLowerCase(c2);
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2793x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2793x = i2;
        if (i != i2) {
            this.f2783n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2793x;
        if ((i & 4) != 0) {
            MenuC0167m menuC0167m = this.f2783n;
            menuC0167m.getClass();
            ArrayList arrayList = menuC0167m.f2750f;
            int size = arrayList.size();
            menuC0167m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0169o c0169o = (C0169o) arrayList.get(i2);
                if (c0169o.f2774b == this.f2774b && (c0169o.f2793x & 4) != 0 && c0169o.isCheckable()) {
                    boolean z3 = c0169o == this;
                    int i3 = c0169o.f2793x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0169o.f2793x = i4;
                    if (i3 != i4) {
                        c0169o.f2783n.p(false);
                    }
                }
            }
            menuC0167m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2793x = i5;
            if (i != i5) {
                this.f2783n.p(false);
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
            this.f2793x |= 16;
        } else {
            this.f2793x &= -17;
        }
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2782m = 0;
        this.f2781l = drawable;
        this.f2792w = true;
        this.f2783n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2788s = colorStateList;
        this.f2790u = true;
        this.f2792w = true;
        this.f2783n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2789t = mode;
        this.f2791v = true;
        this.f2792w = true;
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2778g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2771B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2785p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2779j = Character.toLowerCase(c3);
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2794y = i;
        MenuC0167m menuC0167m = this.f2783n;
        menuC0167m.f2753k = true;
        menuC0167m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2776e = charSequence;
        this.f2783n.p(false);
        SubMenuC0154E subMenuC0154E = this.f2784o;
        if (subMenuC0154E != null) {
            subMenuC0154E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2777f = charSequence;
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2793x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2793x = i2;
        if (i != i2) {
            MenuC0167m menuC0167m = this.f2783n;
            menuC0167m.h = true;
            menuC0167m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2776e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2786q = charSequence;
        this.f2783n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2787r = charSequence;
        this.f2783n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2779j == c2 && this.f2780k == i) {
            return this;
        }
        this.f2779j = Character.toLowerCase(c2);
        this.f2780k = KeyEvent.normalizeMetaState(i);
        this.f2783n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2783n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2779j = Character.toLowerCase(c3);
        this.f2780k = KeyEvent.normalizeMetaState(i2);
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2781l = null;
        this.f2782m = i;
        this.f2792w = true;
        this.f2783n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2783n.f2746a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2783n.f2746a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2795z = inflate;
        this.f2770A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2773a) > 0) {
            inflate.setId(i2);
        }
        MenuC0167m menuC0167m = this.f2783n;
        menuC0167m.f2753k = true;
        menuC0167m.p(true);
        return this;
    }
}
