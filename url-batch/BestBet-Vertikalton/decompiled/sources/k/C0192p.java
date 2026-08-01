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
import c1.AbstractC0091d;
import java.util.ArrayList;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192p implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0193q f3188A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3189B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3193c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3194e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3195f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3196g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f3197j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3199l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0189m f3201n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0176F f3202o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3203p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3204q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3205r;

    /* renamed from: y, reason: collision with root package name */
    public int f3212y;

    /* renamed from: z, reason: collision with root package name */
    public View f3213z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3198k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3200m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3206s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3207t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3208u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3209v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3210w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3211x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3190C = false;

    public C0192p(MenuC0189m menuC0189m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3201n = menuC0189m;
        this.f3191a = i2;
        this.f3192b = i;
        this.f3193c = i3;
        this.d = i4;
        this.f3194e = charSequence;
        this.f3212y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0193q a() {
        return this.f3188A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q) {
        this.f3213z = null;
        this.f3188A = actionProviderVisibilityListenerC0193q;
        this.f3201n.p(true);
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q2 = this.f3188A;
        if (actionProviderVisibilityListenerC0193q2 != null) {
            actionProviderVisibilityListenerC0193q2.f3214a = new C0191o(this);
            actionProviderVisibilityListenerC0193q2.f3215b.setVisibilityListener(actionProviderVisibilityListenerC0193q2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3212y & 8) == 0) {
            return false;
        }
        if (this.f3213z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3189B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3201n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3210w && (this.f3208u || this.f3209v)) {
            drawable = drawable.mutate();
            if (this.f3208u) {
                D.a.h(drawable, this.f3206s);
            }
            if (this.f3209v) {
                D.a.i(drawable, this.f3207t);
            }
            this.f3210w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q;
        if ((this.f3212y & 8) == 0) {
            return false;
        }
        if (this.f3213z == null && (actionProviderVisibilityListenerC0193q = this.f3188A) != null) {
            this.f3213z = actionProviderVisibilityListenerC0193q.f3215b.onCreateActionView(this);
        }
        return this.f3213z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3189B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3201n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3211x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f3211x |= 32;
        } else {
            this.f3211x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3213z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = this.f3188A;
        if (actionProviderVisibilityListenerC0193q == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0193q.f3215b.onCreateActionView(this);
        this.f3213z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3198k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3197j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3204q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3192b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3199l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3200m;
        if (i == 0) {
            return null;
        }
        Drawable j2 = AbstractC0091d.j(this.f3201n.f3163a, i);
        this.f3200m = 0;
        this.f3199l = j2;
        return d(j2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3206s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3207t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3196g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3191a;
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
        return this.f3193c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3202o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3194e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3195f;
        return charSequence != null ? charSequence : this.f3194e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3205r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3202o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3190C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3211x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3211x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3211x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = this.f3188A;
        return (actionProviderVisibilityListenerC0193q == null || !actionProviderVisibilityListenerC0193q.f3215b.overridesItemVisibility()) ? (this.f3211x & 8) == 0 : (this.f3211x & 8) == 0 && this.f3188A.f3215b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3213z = view;
        this.f3188A = null;
        if (view != null && view.getId() == -1 && (i = this.f3191a) > 0) {
            view.setId(i);
        }
        MenuC0189m menuC0189m = this.f3201n;
        menuC0189m.f3170k = true;
        menuC0189m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3197j == c2) {
            return this;
        }
        this.f3197j = Character.toLowerCase(c2);
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f3211x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f3211x = i2;
        if (i != i2) {
            this.f3201n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f3211x;
        if ((i & 4) != 0) {
            MenuC0189m menuC0189m = this.f3201n;
            menuC0189m.getClass();
            ArrayList arrayList = menuC0189m.f3167f;
            int size = arrayList.size();
            menuC0189m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0192p c0192p = (C0192p) arrayList.get(i2);
                if (c0192p.f3192b == this.f3192b && (c0192p.f3211x & 4) != 0 && c0192p.isCheckable()) {
                    boolean z3 = c0192p == this;
                    int i3 = c0192p.f3211x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0192p.f3211x = i4;
                    if (i3 != i4) {
                        c0192p.f3201n.p(false);
                    }
                }
            }
            menuC0189m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f3211x = i5;
            if (i != i5) {
                this.f3201n.p(false);
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
            this.f3211x |= 16;
        } else {
            this.f3211x &= -17;
        }
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3200m = 0;
        this.f3199l = drawable;
        this.f3210w = true;
        this.f3201n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3206s = colorStateList;
        this.f3208u = true;
        this.f3210w = true;
        this.f3201n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3207t = mode;
        this.f3209v = true;
        this.f3210w = true;
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3196g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3189B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3203p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f3197j = Character.toLowerCase(c3);
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3212y = i;
        MenuC0189m menuC0189m = this.f3201n;
        menuC0189m.f3170k = true;
        menuC0189m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3194e = charSequence;
        this.f3201n.p(false);
        SubMenuC0176F subMenuC0176F = this.f3202o;
        if (subMenuC0176F != null) {
            subMenuC0176F.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3195f = charSequence;
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f3211x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f3211x = i2;
        if (i != i2) {
            MenuC0189m menuC0189m = this.f3201n;
            menuC0189m.h = true;
            menuC0189m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3194e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f3204q = charSequence;
        this.f3201n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f3205r = charSequence;
        this.f3201n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f3197j == c2 && this.f3198k == i) {
            return this;
        }
        this.f3197j = Character.toLowerCase(c2);
        this.f3198k = KeyEvent.normalizeMetaState(i);
        this.f3201n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3201n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3197j = Character.toLowerCase(c3);
        this.f3198k = KeyEvent.normalizeMetaState(i2);
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3199l = null;
        this.f3200m = i;
        this.f3210w = true;
        this.f3201n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3201n.f3163a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3201n.f3163a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3213z = inflate;
        this.f3188A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3191a) > 0) {
            inflate.setId(i2);
        }
        MenuC0189m menuC0189m = this.f3201n;
        menuC0189m.f3170k = true;
        menuC0189m.p(true);
        return this;
    }
}
