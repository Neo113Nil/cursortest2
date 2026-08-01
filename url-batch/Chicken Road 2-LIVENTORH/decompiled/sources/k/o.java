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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o implements h0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2087c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2088e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2089f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2090g;

    /* renamed from: h, reason: collision with root package name */
    public char f2091h;

    /* renamed from: j, reason: collision with root package name */
    public char f2092j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2094l;

    /* renamed from: n, reason: collision with root package name */
    public final m f2096n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f2097o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2098p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2099q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2100r;

    /* renamed from: y, reason: collision with root package name */
    public int f2107y;

    /* renamed from: z, reason: collision with root package name */
    public View f2108z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2093k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2095m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2101s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2102t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2103u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2104v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2105w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2106x = 16;
    public boolean C = false;

    public o(m mVar, int i, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f2096n = mVar;
        this.f2085a = i4;
        this.f2086b = i;
        this.f2087c = i5;
        this.d = i6;
        this.f2088e = charSequence;
        this.f2107y = i7;
    }

    public static void c(int i, int i4, String str, StringBuilder sb) {
        if ((i & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // h0.a
    public final h0.a a(p pVar) {
        this.f2108z = null;
        this.A = pVar;
        this.f2096n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f2109a = new a0.a(15, this);
            pVar2.f2110b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // h0.a
    public final p b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2107y & 8) == 0) {
            return false;
        }
        if (this.f2108z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2096n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2105w && (this.f2103u || this.f2104v)) {
            drawable = drawable.mutate();
            if (this.f2103u) {
                drawable.setTintList(this.f2101s);
            }
            if (this.f2104v) {
                drawable.setTintMode(this.f2102t);
            }
            this.f2105w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2107y & 8) != 0) {
            if (this.f2108z == null && (pVar = this.A) != null) {
                this.f2108z = pVar.f2110b.onCreateActionView(this);
            }
            if (this.f2108z != null) {
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
            return this.f2096n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f2106x |= 32;
        } else {
            this.f2106x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2108z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f2110b.onCreateActionView(this);
        this.f2108z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2093k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2092j;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2099q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2086b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2094l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2095m;
        if (i == 0) {
            return null;
        }
        Drawable x3 = h.a.x(this.f2096n.f2060a, i);
        this.f2095m = 0;
        this.f2094l = x3;
        return d(x3);
    }

    @Override // h0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2101s;
    }

    @Override // h0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2102t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2090g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2085a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2091h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2087c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2097o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2088e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2089f;
        return charSequence != null ? charSequence : this.f2088e;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2100r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2097o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2106x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2106x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2106x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        return (pVar == null || !pVar.f2110b.overridesItemVisibility()) ? (this.f2106x & 8) == 0 : (this.f2106x & 8) == 0 && this.A.f2110b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2108z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f2085a) > 0) {
            view.setId(i);
        }
        m mVar = this.f2096n;
        mVar.f2068k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f2092j == c4) {
            return this;
        }
        this.f2092j = Character.toLowerCase(c4);
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i = this.f2106x;
        int i4 = (z3 ? 1 : 0) | (i & (-2));
        this.f2106x = i4;
        if (i != i4) {
            this.f2096n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i = this.f2106x;
        int i4 = i & 4;
        m mVar = this.f2096n;
        if (i4 == 0) {
            int i5 = (i & (-3)) | (z3 ? 2 : 0);
            this.f2106x = i5;
            if (i != i5) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f2064f;
        int size = arrayList.size();
        mVar.w();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f2086b == this.f2086b && (oVar.f2106x & 4) != 0 && oVar.isCheckable()) {
                boolean z4 = oVar == this;
                int i7 = oVar.f2106x;
                int i8 = (z4 ? 2 : 0) | (i7 & (-3));
                oVar.f2106x = i8;
                if (i7 != i8) {
                    oVar.f2096n.p(false);
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
            this.f2106x |= 16;
        } else {
            this.f2106x &= -17;
        }
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2095m = 0;
        this.f2094l = drawable;
        this.f2105w = true;
        this.f2096n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2101s = colorStateList;
        this.f2103u = true;
        this.f2105w = true;
        this.f2096n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2102t = mode;
        this.f2104v = true;
        this.f2105w = true;
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2090g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f2091h == c4) {
            return this;
        }
        this.f2091h = c4;
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2098p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f2091h = c4;
        this.f2092j = Character.toLowerCase(c5);
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i4 = i & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2107y = i;
        m mVar = this.f2096n;
        mVar.f2068k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2088e = charSequence;
        this.f2096n.p(false);
        e0 e0Var = this.f2097o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2089f = charSequence;
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i = this.f2106x;
        int i4 = (z3 ? 0 : 8) | (i & (-9));
        this.f2106x = i4;
        if (i != i4) {
            m mVar = this.f2096n;
            mVar.f2066h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2088e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setContentDescription(CharSequence charSequence) {
        this.f2099q = charSequence;
        this.f2096n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setTooltipText(CharSequence charSequence) {
        this.f2100r = charSequence;
        this.f2096n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        if (this.f2092j == c4 && this.f2093k == i) {
            return this;
        }
        this.f2092j = Character.toLowerCase(c4);
        this.f2093k = KeyEvent.normalizeMetaState(i);
        this.f2096n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        if (this.f2091h == c4 && this.i == i) {
            return this;
        }
        this.f2091h = c4;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2096n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i, int i4) {
        this.f2091h = c4;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2092j = Character.toLowerCase(c5);
        this.f2093k = KeyEvent.normalizeMetaState(i4);
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2094l = null;
        this.f2095m = i;
        this.f2105w = true;
        this.f2096n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2096n.f2060a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i4;
        m mVar = this.f2096n;
        Context context = mVar.f2060a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2108z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f2085a) > 0) {
            inflate.setId(i4);
        }
        mVar.f2068k = true;
        mVar.p(true);
        return this;
    }
}
