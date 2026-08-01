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
public final class C0204o implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0205p f3086A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3087B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3091c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3092d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3093e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3094f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3095g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f3096j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3098l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0202m f3100n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0189E f3101o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3102p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3103q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3104r;

    /* renamed from: y, reason: collision with root package name */
    public int f3111y;

    /* renamed from: z, reason: collision with root package name */
    public View f3112z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3097k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3099m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3105s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3106t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3107u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3108v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3109w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3110x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3088C = false;

    public C0204o(MenuC0202m menuC0202m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3100n = menuC0202m;
        this.f3089a = i2;
        this.f3090b = i;
        this.f3091c = i3;
        this.f3092d = i4;
        this.f3093e = charSequence;
        this.f3111y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // E.a
    public final ActionProviderVisibilityListenerC0205p a() {
        return this.f3086A;
    }

    @Override // E.a
    public final E.a b(ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p) {
        this.f3112z = null;
        this.f3086A = actionProviderVisibilityListenerC0205p;
        this.f3100n.p(true);
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p2 = this.f3086A;
        if (actionProviderVisibilityListenerC0205p2 != null) {
            actionProviderVisibilityListenerC0205p2.f3113a = new B0.d(26, this);
            actionProviderVisibilityListenerC0205p2.f3114b.setVisibilityListener(actionProviderVisibilityListenerC0205p2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3111y & 8) == 0) {
            return false;
        }
        if (this.f3112z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3087B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3100n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3109w && (this.f3107u || this.f3108v)) {
            drawable = drawable.mutate();
            if (this.f3107u) {
                D.a.h(drawable, this.f3105s);
            }
            if (this.f3108v) {
                D.a.i(drawable, this.f3106t);
            }
            this.f3109w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p;
        if ((this.f3111y & 8) == 0) {
            return false;
        }
        if (this.f3112z == null && (actionProviderVisibilityListenerC0205p = this.f3086A) != null) {
            this.f3112z = actionProviderVisibilityListenerC0205p.f3114b.onCreateActionView(this);
        }
        return this.f3112z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3087B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3100n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3110x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f3110x |= 32;
        } else {
            this.f3110x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3112z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = this.f3086A;
        if (actionProviderVisibilityListenerC0205p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0205p.f3114b.onCreateActionView(this);
        this.f3112z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // E.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3097k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3096j;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3103q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3090b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3098l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3099m;
        if (i == 0) {
            return null;
        }
        Drawable z2 = q1.d.z(this.f3100n.f3061a, i);
        this.f3099m = 0;
        this.f3098l = z2;
        return d(z2);
    }

    @Override // E.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3105s;
    }

    @Override // E.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3106t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3095g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3089a;
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
        return this.f3091c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3101o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3093e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3094f;
        return charSequence != null ? charSequence : this.f3093e;
    }

    @Override // E.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3104r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3101o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3088C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3110x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3110x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3110x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = this.f3086A;
        return (actionProviderVisibilityListenerC0205p == null || !actionProviderVisibilityListenerC0205p.f3114b.overridesItemVisibility()) ? (this.f3110x & 8) == 0 : (this.f3110x & 8) == 0 && this.f3086A.f3114b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3112z = view;
        this.f3086A = null;
        if (view != null && view.getId() == -1 && (i = this.f3089a) > 0) {
            view.setId(i);
        }
        MenuC0202m menuC0202m = this.f3100n;
        menuC0202m.f3069k = true;
        menuC0202m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3096j == c2) {
            return this;
        }
        this.f3096j = Character.toLowerCase(c2);
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f3110x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f3110x = i2;
        if (i != i2) {
            this.f3100n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f3110x;
        if ((i & 4) != 0) {
            MenuC0202m menuC0202m = this.f3100n;
            menuC0202m.getClass();
            ArrayList arrayList = menuC0202m.f3066f;
            int size = arrayList.size();
            menuC0202m.w();
            for (int i2 = 0; i2 < size; i2++) {
                C0204o c0204o = (C0204o) arrayList.get(i2);
                if (c0204o.f3090b == this.f3090b && (c0204o.f3110x & 4) != 0 && c0204o.isCheckable()) {
                    boolean z3 = c0204o == this;
                    int i3 = c0204o.f3110x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c0204o.f3110x = i4;
                    if (i3 != i4) {
                        c0204o.f3100n.p(false);
                    }
                }
            }
            menuC0202m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f3110x = i5;
            if (i != i5) {
                this.f3100n.p(false);
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
            this.f3110x |= 16;
        } else {
            this.f3110x &= -17;
        }
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3099m = 0;
        this.f3098l = drawable;
        this.f3109w = true;
        this.f3100n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3105s = colorStateList;
        this.f3107u = true;
        this.f3109w = true;
        this.f3100n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3106t = mode;
        this.f3108v = true;
        this.f3109w = true;
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3095g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3087B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3102p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f3096j = Character.toLowerCase(c3);
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3111y = i;
        MenuC0202m menuC0202m = this.f3100n;
        menuC0202m.f3069k = true;
        menuC0202m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3093e = charSequence;
        this.f3100n.p(false);
        SubMenuC0189E subMenuC0189E = this.f3101o;
        if (subMenuC0189E != null) {
            subMenuC0189E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3094f = charSequence;
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f3110x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f3110x = i2;
        if (i != i2) {
            MenuC0202m menuC0202m = this.f3100n;
            menuC0202m.h = true;
            menuC0202m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3093e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setContentDescription(CharSequence charSequence) {
        this.f3103q = charSequence;
        this.f3100n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final E.a setTooltipText(CharSequence charSequence) {
        this.f3104r = charSequence;
        this.f3100n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f3096j == c2 && this.f3097k == i) {
            return this;
        }
        this.f3096j = Character.toLowerCase(c2);
        this.f3097k = KeyEvent.normalizeMetaState(i);
        this.f3100n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3100n.p(false);
        return this;
    }

    @Override // E.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3096j = Character.toLowerCase(c3);
        this.f3097k = KeyEvent.normalizeMetaState(i2);
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3098l = null;
        this.f3099m = i;
        this.f3109w = true;
        this.f3100n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3100n.f3061a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3100n.f3061a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3112z = inflate;
        this.f3086A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3089a) > 0) {
            inflate.setId(i2);
        }
        MenuC0202m menuC0202m = this.f3100n;
        menuC0202m.f3069k = true;
        menuC0202m.p(true);
        return this;
    }
}
