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
public final class C0160o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0161p f2626A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2627B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2631c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2632e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2633f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2634g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2635j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2637l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0158m f2639n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0145E f2640o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2641p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2642q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2643r;

    /* renamed from: y, reason: collision with root package name */
    public int f2650y;

    /* renamed from: z, reason: collision with root package name */
    public View f2651z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2636k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2638m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2644s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2645t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2646u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2647v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2648w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2649x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2628C = false;

    public C0160o(MenuC0158m menuC0158m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2639n = menuC0158m;
        this.f2629a = i2;
        this.f2630b = i;
        this.f2631c = i3;
        this.d = i4;
        this.f2632e = charSequence;
        this.f2650y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0161p a() {
        return this.f2626A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p) {
        this.f2651z = null;
        this.f2626A = actionProviderVisibilityListenerC0161p;
        this.f2639n.p(true);
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p2 = this.f2626A;
        if (actionProviderVisibilityListenerC0161p2 != null) {
            actionProviderVisibilityListenerC0161p2.f2652a = new C.g(26, this);
            actionProviderVisibilityListenerC0161p2.f2653b.setVisibilityListener(actionProviderVisibilityListenerC0161p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2650y & 8) == 0) {
            return false;
        }
        if (this.f2651z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2627B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2639n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2648w && (this.f2646u || this.f2647v)) {
            drawable = drawable.mutate();
            if (this.f2646u) {
                D.a.h(drawable, this.f2644s);
            }
            if (this.f2647v) {
                D.a.i(drawable, this.f2645t);
            }
            this.f2648w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p;
        if ((this.f2650y & 8) == 0) {
            return false;
        }
        if (this.f2651z == null && (actionProviderVisibilityListenerC0161p = this.f2626A) != null) {
            this.f2651z = actionProviderVisibilityListenerC0161p.f2653b.onCreateActionView(this);
        }
        return this.f2651z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2627B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2639n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2649x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2649x |= 32;
        } else {
            this.f2649x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2651z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = this.f2626A;
        if (actionProviderVisibilityListenerC0161p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0161p.f2653b.onCreateActionView(this);
        this.f2651z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2636k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2635j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2642q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2630b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2637l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2638m;
        if (i == 0) {
            return null;
        }
        Drawable z2 = s1.l.z(this.f2639n.f2602a, i);
        this.f2638m = 0;
        this.f2637l = z2;
        return d(z2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2644s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2645t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2634g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2629a;
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
        return this.f2631c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2640o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2632e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2633f;
        return charSequence != null ? charSequence : this.f2632e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2643r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2640o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2628C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2649x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2649x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2649x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = this.f2626A;
        return (actionProviderVisibilityListenerC0161p == null || !actionProviderVisibilityListenerC0161p.f2653b.overridesItemVisibility()) ? (this.f2649x & 8) == 0 : (this.f2649x & 8) == 0 && this.f2626A.f2653b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2651z = view;
        this.f2626A = null;
        if (view != null && view.getId() == -1 && (i = this.f2629a) > 0) {
            view.setId(i);
        }
        MenuC0158m menuC0158m = this.f2639n;
        menuC0158m.f2609k = true;
        menuC0158m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2635j == c2) {
            return this;
        }
        this.f2635j = Character.toLowerCase(c2);
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2649x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2649x = i2;
        if (i != i2) {
            this.f2639n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2649x;
        if ((i & 4) != 0) {
            MenuC0158m menuC0158m = this.f2639n;
            menuC0158m.getClass();
            ArrayList arrayList = menuC0158m.f2606f;
            int size = arrayList.size();
            menuC0158m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0160o c0160o = (C0160o) arrayList.get(i2);
                if (c0160o.f2630b == this.f2630b && (c0160o.f2649x & 4) != 0 && c0160o.isCheckable()) {
                    boolean z3 = c0160o == this;
                    int i3 = c0160o.f2649x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0160o.f2649x = i4;
                    if (i3 != i4) {
                        c0160o.f2639n.p(false);
                    }
                }
            }
            menuC0158m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2649x = i5;
            if (i != i5) {
                this.f2639n.p(false);
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
            this.f2649x |= 16;
        } else {
            this.f2649x &= -17;
        }
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2638m = 0;
        this.f2637l = drawable;
        this.f2648w = true;
        this.f2639n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2644s = colorStateList;
        this.f2646u = true;
        this.f2648w = true;
        this.f2639n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2645t = mode;
        this.f2647v = true;
        this.f2648w = true;
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2634g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2627B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2641p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2635j = Character.toLowerCase(c3);
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2650y = i;
        MenuC0158m menuC0158m = this.f2639n;
        menuC0158m.f2609k = true;
        menuC0158m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2632e = charSequence;
        this.f2639n.p(false);
        SubMenuC0145E subMenuC0145E = this.f2640o;
        if (subMenuC0145E != null) {
            subMenuC0145E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2633f = charSequence;
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2649x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2649x = i2;
        if (i != i2) {
            MenuC0158m menuC0158m = this.f2639n;
            menuC0158m.h = true;
            menuC0158m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2632e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2642q = charSequence;
        this.f2639n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2643r = charSequence;
        this.f2639n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2635j == c2 && this.f2636k == i) {
            return this;
        }
        this.f2635j = Character.toLowerCase(c2);
        this.f2636k = KeyEvent.normalizeMetaState(i);
        this.f2639n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2639n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2635j = Character.toLowerCase(c3);
        this.f2636k = KeyEvent.normalizeMetaState(i2);
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2637l = null;
        this.f2638m = i;
        this.f2648w = true;
        this.f2639n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2639n.f2602a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2639n.f2602a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2651z = inflate;
        this.f2626A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2629a) > 0) {
            inflate.setId(i2);
        }
        MenuC0158m menuC0158m = this.f2639n;
        menuC0158m.f2609k = true;
        menuC0158m.p(true);
        return this;
    }
}
