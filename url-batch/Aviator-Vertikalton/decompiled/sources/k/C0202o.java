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
public final class C0202o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0203p f3082A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3083B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3088d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3089e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3090f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3091g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f3092j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3094l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0200m f3096n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0187E f3097o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3098p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3099q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3100r;

    /* renamed from: y, reason: collision with root package name */
    public int f3107y;

    /* renamed from: z, reason: collision with root package name */
    public View f3108z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3093k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3095m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3101s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3102t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3103u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3104v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3105w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3106x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3084C = false;

    public C0202o(MenuC0200m menuC0200m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3096n = menuC0200m;
        this.f3085a = i2;
        this.f3086b = i;
        this.f3087c = i3;
        this.f3088d = i4;
        this.f3089e = charSequence;
        this.f3107y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0203p a() {
        return this.f3082A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p) {
        this.f3108z = null;
        this.f3082A = actionProviderVisibilityListenerC0203p;
        this.f3096n.p(true);
        ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p2 = this.f3082A;
        if (actionProviderVisibilityListenerC0203p2 != null) {
            actionProviderVisibilityListenerC0203p2.f3109a = new B0.d(28, this);
            actionProviderVisibilityListenerC0203p2.f3110b.setVisibilityListener(actionProviderVisibilityListenerC0203p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3107y & 8) == 0) {
            return false;
        }
        if (this.f3108z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3083B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3096n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3105w && (this.f3103u || this.f3104v)) {
            drawable = drawable.mutate();
            if (this.f3103u) {
                D.a.h(drawable, this.f3101s);
            }
            if (this.f3104v) {
                D.a.i(drawable, this.f3102t);
            }
            this.f3105w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p;
        if ((this.f3107y & 8) == 0) {
            return false;
        }
        if (this.f3108z == null && (actionProviderVisibilityListenerC0203p = this.f3082A) != null) {
            this.f3108z = actionProviderVisibilityListenerC0203p.f3110b.onCreateActionView(this);
        }
        return this.f3108z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3083B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3096n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3106x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f3106x |= 32;
        } else {
            this.f3106x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3108z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p = this.f3082A;
        if (actionProviderVisibilityListenerC0203p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0203p.f3110b.onCreateActionView(this);
        this.f3108z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3093k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3092j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3099q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3086b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3094l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3095m;
        if (i == 0) {
            return null;
        }
        Drawable z2 = q1.d.z(this.f3096n.f3057a, i);
        this.f3095m = 0;
        this.f3094l = z2;
        return d(z2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3101s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3102t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3091g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3085a;
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
        return this.f3087c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3097o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3089e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3090f;
        return charSequence != null ? charSequence : this.f3089e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3100r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3097o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3084C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3106x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3106x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3106x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p = this.f3082A;
        return (actionProviderVisibilityListenerC0203p == null || !actionProviderVisibilityListenerC0203p.f3110b.overridesItemVisibility()) ? (this.f3106x & 8) == 0 : (this.f3106x & 8) == 0 && this.f3082A.f3110b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3108z = view;
        this.f3082A = null;
        if (view != null && view.getId() == -1 && (i = this.f3085a) > 0) {
            view.setId(i);
        }
        MenuC0200m menuC0200m = this.f3096n;
        menuC0200m.f3065k = true;
        menuC0200m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3092j == c2) {
            return this;
        }
        this.f3092j = Character.toLowerCase(c2);
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f3106x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f3106x = i2;
        if (i != i2) {
            this.f3096n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f3106x;
        if ((i & 4) != 0) {
            MenuC0200m menuC0200m = this.f3096n;
            menuC0200m.getClass();
            ArrayList arrayList = menuC0200m.f3062f;
            int size = arrayList.size();
            menuC0200m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0202o c0202o = (C0202o) arrayList.get(i2);
                if (c0202o.f3086b == this.f3086b && (c0202o.f3106x & 4) != 0 && c0202o.isCheckable()) {
                    boolean z3 = c0202o == this;
                    int i3 = c0202o.f3106x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0202o.f3106x = i4;
                    if (i3 != i4) {
                        c0202o.f3096n.p(false);
                    }
                }
            }
            menuC0200m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f3106x = i5;
            if (i != i5) {
                this.f3096n.p(false);
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
            this.f3106x |= 16;
        } else {
            this.f3106x &= -17;
        }
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3095m = 0;
        this.f3094l = drawable;
        this.f3105w = true;
        this.f3096n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3101s = colorStateList;
        this.f3103u = true;
        this.f3105w = true;
        this.f3096n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3102t = mode;
        this.f3104v = true;
        this.f3105w = true;
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3091g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3083B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3098p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f3092j = Character.toLowerCase(c3);
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3107y = i;
        MenuC0200m menuC0200m = this.f3096n;
        menuC0200m.f3065k = true;
        menuC0200m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3089e = charSequence;
        this.f3096n.p(false);
        SubMenuC0187E subMenuC0187E = this.f3097o;
        if (subMenuC0187E != null) {
            subMenuC0187E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3090f = charSequence;
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f3106x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f3106x = i2;
        if (i != i2) {
            MenuC0200m menuC0200m = this.f3096n;
            menuC0200m.h = true;
            menuC0200m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3089e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f3099q = charSequence;
        this.f3096n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f3100r = charSequence;
        this.f3096n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f3092j == c2 && this.f3093k == i) {
            return this;
        }
        this.f3092j = Character.toLowerCase(c2);
        this.f3093k = KeyEvent.normalizeMetaState(i);
        this.f3096n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3096n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3092j = Character.toLowerCase(c3);
        this.f3093k = KeyEvent.normalizeMetaState(i2);
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3094l = null;
        this.f3095m = i;
        this.f3105w = true;
        this.f3096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3096n.f3057a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3096n.f3057a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3108z = inflate;
        this.f3082A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3085a) > 0) {
            inflate.setId(i2);
        }
        MenuC0200m menuC0200m = this.f3096n;
        menuC0200m.f3065k = true;
        menuC0200m.p(true);
        return this;
    }
}
