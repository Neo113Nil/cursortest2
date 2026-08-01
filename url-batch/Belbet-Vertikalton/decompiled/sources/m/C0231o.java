package m;

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

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231o implements G.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0232p f3372A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3373B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3377c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3378d;
    public CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3379f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3380g;

    /* renamed from: h, reason: collision with root package name */
    public char f3381h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3383l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0229m f3385n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0216E f3386o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3387p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3388q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3389r;

    /* renamed from: y, reason: collision with root package name */
    public int f3396y;

    /* renamed from: z, reason: collision with root package name */
    public View f3397z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3382k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3384m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3390s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3391t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3392u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3393v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3394w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3395x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3374C = false;

    public C0231o(MenuC0229m menuC0229m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3385n = menuC0229m;
        this.f3375a = i2;
        this.f3376b = i;
        this.f3377c = i3;
        this.f3378d = i4;
        this.e = charSequence;
        this.f3396y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // G.a
    public final G.a a(ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p) {
        this.f3397z = null;
        this.f3372A = actionProviderVisibilityListenerC0232p;
        this.f3385n.p(true);
        ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p2 = this.f3372A;
        if (actionProviderVisibilityListenerC0232p2 != null) {
            actionProviderVisibilityListenerC0232p2.f3398a = new C1.d(28, this);
            actionProviderVisibilityListenerC0232p2.f3399b.setVisibilityListener(actionProviderVisibilityListenerC0232p2);
        }
        return this;
    }

    @Override // G.a
    public final ActionProviderVisibilityListenerC0232p b() {
        return this.f3372A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3396y & 8) == 0) {
            return false;
        }
        if (this.f3397z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3373B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3385n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3394w && (this.f3392u || this.f3393v)) {
            drawable = drawable.mutate();
            if (this.f3392u) {
                F.a.h(drawable, this.f3390s);
            }
            if (this.f3393v) {
                F.a.i(drawable, this.f3391t);
            }
            this.f3394w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p;
        if ((this.f3396y & 8) == 0) {
            return false;
        }
        if (this.f3397z == null && (actionProviderVisibilityListenerC0232p = this.f3372A) != null) {
            this.f3397z = actionProviderVisibilityListenerC0232p.f3399b.onCreateActionView(this);
        }
        return this.f3397z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3373B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3385n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3395x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f3395x |= 32;
        } else {
            this.f3395x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3397z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p = this.f3372A;
        if (actionProviderVisibilityListenerC0232p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0232p.f3399b.onCreateActionView(this);
        this.f3397z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // G.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3382k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // G.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3388q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3376b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3383l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3384m;
        if (i == 0) {
            return null;
        }
        Drawable F2 = H1.d.F(this.f3385n.f3348a, i);
        this.f3384m = 0;
        this.f3383l = F2;
        return d(F2);
    }

    @Override // G.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3390s;
    }

    @Override // G.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3391t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3380g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3375a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // G.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3381h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3377c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3386o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3379f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // G.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3389r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3386o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3374C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3395x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3395x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3395x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p = this.f3372A;
        return (actionProviderVisibilityListenerC0232p == null || !actionProviderVisibilityListenerC0232p.f3399b.overridesItemVisibility()) ? (this.f3395x & 8) == 0 : (this.f3395x & 8) == 0 && this.f3372A.f3399b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3397z = view;
        this.f3372A = null;
        if (view != null && view.getId() == -1 && (i = this.f3375a) > 0) {
            view.setId(i);
        }
        MenuC0229m menuC0229m = this.f3385n;
        menuC0229m.f3355k = true;
        menuC0229m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f3395x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f3395x = i2;
        if (i != i2) {
            this.f3385n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f3395x;
        if ((i & 4) != 0) {
            MenuC0229m menuC0229m = this.f3385n;
            menuC0229m.getClass();
            ArrayList arrayList = menuC0229m.f3352f;
            int size = arrayList.size();
            menuC0229m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0231o c0231o = (C0231o) arrayList.get(i2);
                if (c0231o.f3376b == this.f3376b && (c0231o.f3395x & 4) != 0 && c0231o.isCheckable()) {
                    boolean z3 = c0231o == this;
                    int i3 = c0231o.f3395x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0231o.f3395x = i4;
                    if (i3 != i4) {
                        c0231o.f3385n.p(false);
                    }
                }
            }
            menuC0229m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f3395x = i5;
            if (i != i5) {
                this.f3385n.p(false);
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
            this.f3395x |= 16;
        } else {
            this.f3395x &= -17;
        }
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3384m = 0;
        this.f3383l = drawable;
        this.f3394w = true;
        this.f3385n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3390s = colorStateList;
        this.f3392u = true;
        this.f3394w = true;
        this.f3385n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3391t = mode;
        this.f3393v = true;
        this.f3394w = true;
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3380g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3381h == c2) {
            return this;
        }
        this.f3381h = c2;
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3373B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3387p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3381h = c2;
        this.j = Character.toLowerCase(c3);
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3396y = i;
        MenuC0229m menuC0229m = this.f3385n;
        menuC0229m.f3355k = true;
        menuC0229m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f3385n.p(false);
        SubMenuC0216E subMenuC0216E = this.f3386o;
        if (subMenuC0216E != null) {
            subMenuC0216E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3379f = charSequence;
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f3395x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f3395x = i2;
        if (i != i2) {
            MenuC0229m menuC0229m = this.f3385n;
            menuC0229m.f3354h = true;
            menuC0229m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // G.a, android.view.MenuItem
    public final G.a setContentDescription(CharSequence charSequence) {
        this.f3388q = charSequence;
        this.f3385n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final G.a setTooltipText(CharSequence charSequence) {
        this.f3389r = charSequence;
        this.f3385n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.j == c2 && this.f3382k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f3382k = KeyEvent.normalizeMetaState(i);
        this.f3385n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f3381h == c2 && this.i == i) {
            return this;
        }
        this.f3381h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3385n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f3381h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c3);
        this.f3382k = KeyEvent.normalizeMetaState(i2);
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3383l = null;
        this.f3384m = i;
        this.f3394w = true;
        this.f3385n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3385n.f3348a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3385n.f3348a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3397z = inflate;
        this.f3372A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3375a) > 0) {
            inflate.setId(i2);
        }
        MenuC0229m menuC0229m = this.f3385n;
        menuC0229m.f3355k = true;
        menuC0229m.p(true);
        return this;
    }
}
