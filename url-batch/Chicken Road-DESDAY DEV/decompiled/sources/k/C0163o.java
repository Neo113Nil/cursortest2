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
public final class C0163o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0164p f2636A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2637B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2639a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2640b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2641c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2642e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2643f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2644g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2645j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2647l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0161m f2649n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0148E f2650o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2651p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2652q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2653r;

    /* renamed from: y, reason: collision with root package name */
    public int f2660y;

    /* renamed from: z, reason: collision with root package name */
    public View f2661z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2646k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2648m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2654s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2655t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2656u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2657v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2658w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2659x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2638C = false;

    public C0163o(MenuC0161m menuC0161m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2649n = menuC0161m;
        this.f2639a = i2;
        this.f2640b = i;
        this.f2641c = i3;
        this.d = i4;
        this.f2642e = charSequence;
        this.f2660y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0164p a() {
        return this.f2636A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p) {
        this.f2661z = null;
        this.f2636A = actionProviderVisibilityListenerC0164p;
        this.f2649n.p(true);
        ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p2 = this.f2636A;
        if (actionProviderVisibilityListenerC0164p2 != null) {
            actionProviderVisibilityListenerC0164p2.f2662a = new C.g(27, this);
            actionProviderVisibilityListenerC0164p2.f2663b.setVisibilityListener(actionProviderVisibilityListenerC0164p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2660y & 8) == 0) {
            return false;
        }
        if (this.f2661z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2637B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2649n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2658w && (this.f2656u || this.f2657v)) {
            drawable = drawable.mutate();
            if (this.f2656u) {
                D.a.h(drawable, this.f2654s);
            }
            if (this.f2657v) {
                D.a.i(drawable, this.f2655t);
            }
            this.f2658w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p;
        if ((this.f2660y & 8) == 0) {
            return false;
        }
        if (this.f2661z == null && (actionProviderVisibilityListenerC0164p = this.f2636A) != null) {
            this.f2661z = actionProviderVisibilityListenerC0164p.f2663b.onCreateActionView(this);
        }
        return this.f2661z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2637B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2649n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2659x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2659x |= 32;
        } else {
            this.f2659x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2661z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p = this.f2636A;
        if (actionProviderVisibilityListenerC0164p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0164p.f2663b.onCreateActionView(this);
        this.f2661z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2646k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2645j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2652q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2640b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2647l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2648m;
        if (i == 0) {
            return null;
        }
        Drawable G2 = u1.d.G(this.f2649n.f2612a, i);
        this.f2648m = 0;
        this.f2647l = G2;
        return d(G2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2654s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2655t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2644g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2639a;
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
        return this.f2641c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2650o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2642e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2643f;
        return charSequence != null ? charSequence : this.f2642e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2653r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2650o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2638C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2659x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2659x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2659x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p = this.f2636A;
        return (actionProviderVisibilityListenerC0164p == null || !actionProviderVisibilityListenerC0164p.f2663b.overridesItemVisibility()) ? (this.f2659x & 8) == 0 : (this.f2659x & 8) == 0 && this.f2636A.f2663b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2661z = view;
        this.f2636A = null;
        if (view != null && view.getId() == -1 && (i = this.f2639a) > 0) {
            view.setId(i);
        }
        MenuC0161m menuC0161m = this.f2649n;
        menuC0161m.f2619k = true;
        menuC0161m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2645j == c2) {
            return this;
        }
        this.f2645j = Character.toLowerCase(c2);
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2659x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2659x = i2;
        if (i != i2) {
            this.f2649n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2659x;
        if ((i & 4) != 0) {
            MenuC0161m menuC0161m = this.f2649n;
            menuC0161m.getClass();
            ArrayList arrayList = menuC0161m.f2616f;
            int size = arrayList.size();
            menuC0161m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0163o c0163o = (C0163o) arrayList.get(i2);
                if (c0163o.f2640b == this.f2640b && (c0163o.f2659x & 4) != 0 && c0163o.isCheckable()) {
                    boolean z3 = c0163o == this;
                    int i3 = c0163o.f2659x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0163o.f2659x = i4;
                    if (i3 != i4) {
                        c0163o.f2649n.p(false);
                    }
                }
            }
            menuC0161m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2659x = i5;
            if (i != i5) {
                this.f2649n.p(false);
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
            this.f2659x |= 16;
        } else {
            this.f2659x &= -17;
        }
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2648m = 0;
        this.f2647l = drawable;
        this.f2658w = true;
        this.f2649n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2654s = colorStateList;
        this.f2656u = true;
        this.f2658w = true;
        this.f2649n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2655t = mode;
        this.f2657v = true;
        this.f2658w = true;
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2644g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2637B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2651p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2645j = Character.toLowerCase(c3);
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2660y = i;
        MenuC0161m menuC0161m = this.f2649n;
        menuC0161m.f2619k = true;
        menuC0161m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2642e = charSequence;
        this.f2649n.p(false);
        SubMenuC0148E subMenuC0148E = this.f2650o;
        if (subMenuC0148E != null) {
            subMenuC0148E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2643f = charSequence;
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2659x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2659x = i2;
        if (i != i2) {
            MenuC0161m menuC0161m = this.f2649n;
            menuC0161m.h = true;
            menuC0161m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2642e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2652q = charSequence;
        this.f2649n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2653r = charSequence;
        this.f2649n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2645j == c2 && this.f2646k == i) {
            return this;
        }
        this.f2645j = Character.toLowerCase(c2);
        this.f2646k = KeyEvent.normalizeMetaState(i);
        this.f2649n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2649n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2645j = Character.toLowerCase(c3);
        this.f2646k = KeyEvent.normalizeMetaState(i2);
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2647l = null;
        this.f2648m = i;
        this.f2658w = true;
        this.f2649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2649n.f2612a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2649n.f2612a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2661z = inflate;
        this.f2636A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2639a) > 0) {
            inflate.setId(i2);
        }
        MenuC0161m menuC0161m = this.f2649n;
        menuC0161m.f2619k = true;
        menuC0161m.p(true);
        return this;
    }
}
