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

/* loaded from: classes.dex */
public final class o implements G.a {

    /* renamed from: A, reason: collision with root package name */
    public p f2789A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2790B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2794c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2795e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2796f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2797g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2798j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2800l;

    /* renamed from: n, reason: collision with root package name */
    public final m f2802n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0162E f2803o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2804p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2805q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2806r;

    /* renamed from: y, reason: collision with root package name */
    public int f2813y;

    /* renamed from: z, reason: collision with root package name */
    public View f2814z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2799k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2801m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2807s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2808t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2809u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2810v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2811w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2812x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2791C = false;

    public o(m mVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2802n = mVar;
        this.f2792a = i2;
        this.f2793b = i;
        this.f2794c = i3;
        this.d = i4;
        this.f2795e = charSequence;
        this.f2813y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // G.a
    public final p a() {
        return this.f2789A;
    }

    @Override // G.a
    public final G.a b(p pVar) {
        this.f2814z = null;
        this.f2789A = pVar;
        this.f2802n.p(true);
        p pVar2 = this.f2789A;
        if (pVar2 != null) {
            pVar2.f2815a = new E.g(27, this);
            pVar2.f2816b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2813y & 8) == 0) {
            return false;
        }
        if (this.f2814z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2790B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2802n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2811w && (this.f2809u || this.f2810v)) {
            drawable = drawable.mutate();
            if (this.f2809u) {
                F.a.h(drawable, this.f2807s);
            }
            if (this.f2810v) {
                F.a.i(drawable, this.f2808t);
            }
            this.f2811w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2813y & 8) == 0) {
            return false;
        }
        if (this.f2814z == null && (pVar = this.f2789A) != null) {
            this.f2814z = pVar.f2816b.onCreateActionView(this);
        }
        return this.f2814z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2790B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2802n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2812x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2812x |= 32;
        } else {
            this.f2812x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2814z;
        if (view != null) {
            return view;
        }
        p pVar = this.f2789A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f2816b.onCreateActionView(this);
        this.f2814z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // G.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2799k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2798j;
    }

    @Override // G.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2805q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2793b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2800l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2801m;
        if (i == 0) {
            return null;
        }
        Drawable F2 = z1.l.F(this.f2802n.f2765a, i);
        this.f2801m = 0;
        this.f2800l = F2;
        return d(F2);
    }

    @Override // G.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2807s;
    }

    @Override // G.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2808t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2797g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2792a;
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
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2794c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2803o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2795e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2796f;
        return charSequence != null ? charSequence : this.f2795e;
    }

    @Override // G.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2806r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2803o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2791C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2812x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2812x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2812x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f2789A;
        return (pVar == null || !pVar.f2816b.overridesItemVisibility()) ? (this.f2812x & 8) == 0 : (this.f2812x & 8) == 0 && this.f2789A.f2816b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2814z = view;
        this.f2789A = null;
        if (view != null && view.getId() == -1 && (i = this.f2792a) > 0) {
            view.setId(i);
        }
        m mVar = this.f2802n;
        mVar.f2772k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2798j == c2) {
            return this;
        }
        this.f2798j = Character.toLowerCase(c2);
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2812x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2812x = i2;
        if (i != i2) {
            this.f2802n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2812x;
        if ((i & 4) != 0) {
            m mVar = this.f2802n;
            mVar.getClass();
            ArrayList arrayList = mVar.f2769f;
            int size = arrayList.size();
            mVar.w();
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = (o) arrayList.get(i2);
                if (oVar.f2793b == this.f2793b && (oVar.f2812x & 4) != 0 && oVar.isCheckable()) {
                    boolean z3 = oVar == this;
                    int i3 = oVar.f2812x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    oVar.f2812x = i4;
                    if (i3 != i4) {
                        oVar.f2802n.p(false);
                    }
                }
            }
            mVar.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2812x = i5;
            if (i != i5) {
                this.f2802n.p(false);
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
            this.f2812x |= 16;
        } else {
            this.f2812x &= -17;
        }
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2801m = 0;
        this.f2800l = drawable;
        this.f2811w = true;
        this.f2802n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2807s = colorStateList;
        this.f2809u = true;
        this.f2811w = true;
        this.f2802n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2808t = mode;
        this.f2810v = true;
        this.f2811w = true;
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2797g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2790B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2804p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2798j = Character.toLowerCase(c3);
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2813y = i;
        m mVar = this.f2802n;
        mVar.f2772k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2795e = charSequence;
        this.f2802n.p(false);
        SubMenuC0162E subMenuC0162E = this.f2803o;
        if (subMenuC0162E != null) {
            subMenuC0162E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2796f = charSequence;
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2812x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2812x = i2;
        if (i != i2) {
            m mVar = this.f2802n;
            mVar.h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2795e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // G.a, android.view.MenuItem
    public final G.a setContentDescription(CharSequence charSequence) {
        this.f2805q = charSequence;
        this.f2802n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final G.a setTooltipText(CharSequence charSequence) {
        this.f2806r = charSequence;
        this.f2802n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2798j == c2 && this.f2799k == i) {
            return this;
        }
        this.f2798j = Character.toLowerCase(c2);
        this.f2799k = KeyEvent.normalizeMetaState(i);
        this.f2802n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2802n.p(false);
        return this;
    }

    @Override // G.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2798j = Character.toLowerCase(c3);
        this.f2799k = KeyEvent.normalizeMetaState(i2);
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2800l = null;
        this.f2801m = i;
        this.f2811w = true;
        this.f2802n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2802n.f2765a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2802n.f2765a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2814z = inflate;
        this.f2789A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2792a) > 0) {
            inflate.setId(i2);
        }
        m mVar = this.f2802n;
        mVar.f2772k = true;
        mVar.p(true);
        return this;
    }
}
