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
public final class C0168o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0169p f2737A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2738B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2742c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2743e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2744f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2745g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2746j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2748l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0166m f2750n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0153E f2751o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2752p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2753q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2754r;

    /* renamed from: y, reason: collision with root package name */
    public int f2761y;

    /* renamed from: z, reason: collision with root package name */
    public View f2762z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2747k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2749m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2755s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2756t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2757u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2758v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2759w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2760x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2739C = false;

    public C0168o(MenuC0166m menuC0166m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2750n = menuC0166m;
        this.f2740a = i2;
        this.f2741b = i;
        this.f2742c = i3;
        this.d = i4;
        this.f2743e = charSequence;
        this.f2761y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0169p a() {
        return this.f2737A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p) {
        this.f2762z = null;
        this.f2737A = actionProviderVisibilityListenerC0169p;
        this.f2750n.p(true);
        ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p2 = this.f2737A;
        if (actionProviderVisibilityListenerC0169p2 != null) {
            actionProviderVisibilityListenerC0169p2.f2763a = new C.g(26, this);
            actionProviderVisibilityListenerC0169p2.f2764b.setVisibilityListener(actionProviderVisibilityListenerC0169p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2761y & 8) == 0) {
            return false;
        }
        if (this.f2762z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2738B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2750n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2759w && (this.f2757u || this.f2758v)) {
            drawable = drawable.mutate();
            if (this.f2757u) {
                D.a.h(drawable, this.f2755s);
            }
            if (this.f2758v) {
                D.a.i(drawable, this.f2756t);
            }
            this.f2759w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p;
        if ((this.f2761y & 8) == 0) {
            return false;
        }
        if (this.f2762z == null && (actionProviderVisibilityListenerC0169p = this.f2737A) != null) {
            this.f2762z = actionProviderVisibilityListenerC0169p.f2764b.onCreateActionView(this);
        }
        return this.f2762z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2738B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2750n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2760x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2760x |= 32;
        } else {
            this.f2760x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2762z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p = this.f2737A;
        if (actionProviderVisibilityListenerC0169p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0169p.f2764b.onCreateActionView(this);
        this.f2762z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2747k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2746j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2753q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2741b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2748l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2749m;
        if (i == 0) {
            return null;
        }
        Drawable w2 = z1.l.w(this.f2750n.f2713a, i);
        this.f2749m = 0;
        this.f2748l = w2;
        return d(w2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2755s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2756t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2745g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2740a;
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
        return this.f2742c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2751o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2743e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2744f;
        return charSequence != null ? charSequence : this.f2743e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2754r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2751o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2739C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2760x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2760x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2760x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0169p actionProviderVisibilityListenerC0169p = this.f2737A;
        return (actionProviderVisibilityListenerC0169p == null || !actionProviderVisibilityListenerC0169p.f2764b.overridesItemVisibility()) ? (this.f2760x & 8) == 0 : (this.f2760x & 8) == 0 && this.f2737A.f2764b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2762z = view;
        this.f2737A = null;
        if (view != null && view.getId() == -1 && (i = this.f2740a) > 0) {
            view.setId(i);
        }
        MenuC0166m menuC0166m = this.f2750n;
        menuC0166m.f2720k = true;
        menuC0166m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2746j == c2) {
            return this;
        }
        this.f2746j = Character.toLowerCase(c2);
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2760x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2760x = i2;
        if (i != i2) {
            this.f2750n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2760x;
        if ((i & 4) != 0) {
            MenuC0166m menuC0166m = this.f2750n;
            menuC0166m.getClass();
            ArrayList arrayList = menuC0166m.f2717f;
            int size = arrayList.size();
            menuC0166m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0168o c0168o = (C0168o) arrayList.get(i2);
                if (c0168o.f2741b == this.f2741b && (c0168o.f2760x & 4) != 0 && c0168o.isCheckable()) {
                    boolean z3 = c0168o == this;
                    int i3 = c0168o.f2760x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0168o.f2760x = i4;
                    if (i3 != i4) {
                        c0168o.f2750n.p(false);
                    }
                }
            }
            menuC0166m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2760x = i5;
            if (i != i5) {
                this.f2750n.p(false);
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
            this.f2760x |= 16;
        } else {
            this.f2760x &= -17;
        }
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2749m = 0;
        this.f2748l = drawable;
        this.f2759w = true;
        this.f2750n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2755s = colorStateList;
        this.f2757u = true;
        this.f2759w = true;
        this.f2750n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2756t = mode;
        this.f2758v = true;
        this.f2759w = true;
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2745g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2738B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2752p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2746j = Character.toLowerCase(c3);
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2761y = i;
        MenuC0166m menuC0166m = this.f2750n;
        menuC0166m.f2720k = true;
        menuC0166m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2743e = charSequence;
        this.f2750n.p(false);
        SubMenuC0153E subMenuC0153E = this.f2751o;
        if (subMenuC0153E != null) {
            subMenuC0153E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2744f = charSequence;
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2760x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2760x = i2;
        if (i != i2) {
            MenuC0166m menuC0166m = this.f2750n;
            menuC0166m.h = true;
            menuC0166m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2743e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f2753q = charSequence;
        this.f2750n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f2754r = charSequence;
        this.f2750n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2746j == c2 && this.f2747k == i) {
            return this;
        }
        this.f2746j = Character.toLowerCase(c2);
        this.f2747k = KeyEvent.normalizeMetaState(i);
        this.f2750n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2750n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2746j = Character.toLowerCase(c3);
        this.f2747k = KeyEvent.normalizeMetaState(i2);
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2748l = null;
        this.f2749m = i;
        this.f2759w = true;
        this.f2750n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2750n.f2713a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2750n.f2713a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2762z = inflate;
        this.f2737A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2740a) > 0) {
            inflate.setId(i2);
        }
        MenuC0166m menuC0166m = this.f2750n;
        menuC0166m.f2720k = true;
        menuC0166m.p(true);
        return this;
    }
}
