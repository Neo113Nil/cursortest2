package j;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o implements e0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2212b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2213d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2214e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2215f;
    public Intent g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2217j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2219l;

    /* renamed from: n, reason: collision with root package name */
    public final m f2221n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f2222o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2223p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2224q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2225r;

    /* renamed from: y, reason: collision with root package name */
    public int f2232y;

    /* renamed from: z, reason: collision with root package name */
    public View f2233z;

    /* renamed from: i, reason: collision with root package name */
    public int f2216i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2218k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2220m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2226s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2227t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2228u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2229v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2230w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2231x = 16;
    public boolean C = false;

    public o(m mVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f2221n = mVar;
        this.f2211a = i5;
        this.f2212b = i4;
        this.c = i6;
        this.f2213d = i7;
        this.f2214e = charSequence;
        this.f2232y = i8;
    }

    public static void c(int i4, int i5, String str, StringBuilder sb) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    @Override // e0.a
    public final p a() {
        return this.A;
    }

    @Override // e0.a
    public final e0.a b(p pVar) {
        this.f2233z = null;
        this.A = pVar;
        this.f2221n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f2234a = new a2.e(18, this);
            pVar2.f2235b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2232y & 8) == 0) {
            return false;
        }
        if (this.f2233z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2221n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2230w && (this.f2228u || this.f2229v)) {
            drawable = drawable.mutate();
            if (this.f2228u) {
                drawable.setTintList(this.f2226s);
            }
            if (this.f2229v) {
                drawable.setTintMode(this.f2227t);
            }
            this.f2230w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2232y & 8) != 0) {
            if (this.f2233z == null && (pVar = this.A) != null) {
                this.f2233z = pVar.f2235b.onCreateActionView(this);
            }
            if (this.f2233z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2221n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f2231x |= 32;
        } else {
            this.f2231x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2233z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f2235b.onCreateActionView(this);
        this.f2233z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // e0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2218k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2217j;
    }

    @Override // e0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2224q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2212b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2219l;
        if (drawable != null) {
            return d(drawable);
        }
        int i4 = this.f2220m;
        if (i4 == 0) {
            return null;
        }
        Drawable w3 = k3.m.w(this.f2221n.f2189a, i4);
        this.f2220m = 0;
        this.f2219l = w3;
        return d(w3);
    }

    @Override // e0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2226s;
    }

    @Override // e0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2227t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2211a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // e0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2216i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2222o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2214e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2215f;
        return charSequence != null ? charSequence : this.f2214e;
    }

    @Override // e0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2225r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2222o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2231x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2231x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2231x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        return (pVar == null || !pVar.f2235b.overridesItemVisibility()) ? (this.f2231x & 8) == 0 : (this.f2231x & 8) == 0 && this.A.f2235b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f2233z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i4 = this.f2211a) > 0) {
            view.setId(i4);
        }
        m mVar = this.f2221n;
        mVar.f2196k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f2217j == c) {
            return this;
        }
        this.f2217j = Character.toLowerCase(c);
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i4 = this.f2231x;
        int i5 = (z3 ? 1 : 0) | (i4 & (-2));
        this.f2231x = i5;
        if (i4 != i5) {
            this.f2221n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i4 = this.f2231x;
        int i5 = i4 & 4;
        m mVar = this.f2221n;
        if (i5 == 0) {
            int i6 = (i4 & (-3)) | (z3 ? 2 : 0);
            this.f2231x = i6;
            if (i4 != i6) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f2193f;
        int size = arrayList.size();
        mVar.w();
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) arrayList.get(i7);
            if (oVar.f2212b == this.f2212b && (oVar.f2231x & 4) != 0 && oVar.isCheckable()) {
                boolean z4 = oVar == this;
                int i8 = oVar.f2231x;
                int i9 = (z4 ? 2 : 0) | (i8 & (-3));
                oVar.f2231x = i9;
                if (i8 != i9) {
                    oVar.f2221n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f2231x |= 16;
        } else {
            this.f2231x &= -17;
        }
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2220m = 0;
        this.f2219l = drawable;
        this.f2230w = true;
        this.f2221n.p(false);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2226s = colorStateList;
        this.f2228u = true;
        this.f2230w = true;
        this.f2221n.p(false);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2227t = mode;
        this.f2229v = true;
        this.f2230w = true;
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2223p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c4) {
        this.h = c;
        this.f2217j = Character.toLowerCase(c4);
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2232y = i4;
        m mVar = this.f2221n;
        mVar.f2196k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2214e = charSequence;
        this.f2221n.p(false);
        e0 e0Var = this.f2222o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2215f = charSequence;
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i4 = this.f2231x;
        int i5 = (z3 ? 0 : 8) | (i4 & (-9));
        this.f2231x = i5;
        if (i4 != i5) {
            m mVar = this.f2221n;
            mVar.h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2214e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // e0.a, android.view.MenuItem
    public final e0.a setContentDescription(CharSequence charSequence) {
        this.f2224q = charSequence;
        this.f2221n.p(false);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final e0.a setTooltipText(CharSequence charSequence) {
        this.f2225r = charSequence;
        this.f2221n.p(false);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i4) {
        if (this.f2217j == c && this.f2218k == i4) {
            return this;
        }
        this.f2217j = Character.toLowerCase(c);
        this.f2218k = KeyEvent.normalizeMetaState(i4);
        this.f2221n.p(false);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i4) {
        if (this.h == c && this.f2216i == i4) {
            return this;
        }
        this.h = c;
        this.f2216i = KeyEvent.normalizeMetaState(i4);
        this.f2221n.p(false);
        return this;
    }

    @Override // e0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c4, int i4, int i5) {
        this.h = c;
        this.f2216i = KeyEvent.normalizeMetaState(i4);
        this.f2217j = Character.toLowerCase(c4);
        this.f2218k = KeyEvent.normalizeMetaState(i5);
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f2219l = null;
        this.f2220m = i4;
        this.f2230w = true;
        this.f2221n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f2221n.f2189a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        m mVar = this.f2221n;
        Context context = mVar.f2189a;
        View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f2233z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f2211a) > 0) {
            inflate.setId(i5);
        }
        mVar.f2196k = true;
        mVar.p(true);
        return this;
    }
}
