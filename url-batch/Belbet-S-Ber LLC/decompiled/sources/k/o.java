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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o implements h0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2236c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2237e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2238f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2239g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2240j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2242l;

    /* renamed from: n, reason: collision with root package name */
    public final m f2244n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f2245o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2246p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2247q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2248r;

    /* renamed from: y, reason: collision with root package name */
    public int f2255y;

    /* renamed from: z, reason: collision with root package name */
    public View f2256z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2241k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2243m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2249s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2250t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2251u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2252v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2253w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2254x = 16;
    public boolean C = false;

    public o(m mVar, int i, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f2244n = mVar;
        this.f2234a = i4;
        this.f2235b = i;
        this.f2236c = i5;
        this.d = i6;
        this.f2237e = charSequence;
        this.f2255y = i7;
    }

    public static void c(int i, int i4, String str, StringBuilder sb) {
        if ((i & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // h0.a
    public final h0.a a(p pVar) {
        this.f2256z = null;
        this.A = pVar;
        this.f2244n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f2257a = new a0.a(19, this);
            pVar2.f2258b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // h0.a
    public final p b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2255y & 8) == 0) {
            return false;
        }
        if (this.f2256z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2244n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2253w && (this.f2251u || this.f2252v)) {
            drawable = drawable.mutate();
            if (this.f2251u) {
                drawable.setTintList(this.f2249s);
            }
            if (this.f2252v) {
                drawable.setTintMode(this.f2250t);
            }
            this.f2253w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2255y & 8) != 0) {
            if (this.f2256z == null && (pVar = this.A) != null) {
                this.f2256z = pVar.f2258b.onCreateActionView(this);
            }
            if (this.f2256z != null) {
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
            return this.f2244n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f2254x |= 32;
        } else {
            this.f2254x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2256z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f2258b.onCreateActionView(this);
        this.f2256z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // h0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2241k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2240j;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2247q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2235b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2242l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2243m;
        if (i == 0) {
            return null;
        }
        Drawable y4 = b4.d.y(this.f2244n.f2211a, i);
        this.f2243m = 0;
        this.f2242l = y4;
        return d(y4);
    }

    @Override // h0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2249s;
    }

    @Override // h0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2250t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2239g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2234a;
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
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2236c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2245o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2237e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2238f;
        return charSequence != null ? charSequence : this.f2237e;
    }

    @Override // h0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2248r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2245o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2254x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2254x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2254x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        return (pVar == null || !pVar.f2258b.overridesItemVisibility()) ? (this.f2254x & 8) == 0 : (this.f2254x & 8) == 0 && this.A.f2258b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2256z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f2234a) > 0) {
            view.setId(i);
        }
        m mVar = this.f2244n;
        mVar.f2218k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f2240j == c5) {
            return this;
        }
        this.f2240j = Character.toLowerCase(c5);
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i = this.f2254x;
        int i4 = (z4 ? 1 : 0) | (i & (-2));
        this.f2254x = i4;
        if (i != i4) {
            this.f2244n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i = this.f2254x;
        int i4 = i & 4;
        m mVar = this.f2244n;
        if (i4 == 0) {
            int i5 = (i & (-3)) | (z4 ? 2 : 0);
            this.f2254x = i5;
            if (i != i5) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f2215f;
        int size = arrayList.size();
        mVar.w();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f2235b == this.f2235b && (oVar.f2254x & 4) != 0 && oVar.isCheckable()) {
                boolean z5 = oVar == this;
                int i7 = oVar.f2254x;
                int i8 = (z5 ? 2 : 0) | (i7 & (-3));
                oVar.f2254x = i8;
                if (i7 != i8) {
                    oVar.f2244n.p(false);
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
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f2254x |= 16;
        } else {
            this.f2254x &= -17;
        }
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2243m = 0;
        this.f2242l = drawable;
        this.f2253w = true;
        this.f2244n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2249s = colorStateList;
        this.f2251u = true;
        this.f2253w = true;
        this.f2244n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2250t = mode;
        this.f2252v = true;
        this.f2253w = true;
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2239g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.h == c5) {
            return this;
        }
        this.h = c5;
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2246p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.h = c5;
        this.f2240j = Character.toLowerCase(c6);
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i4 = i & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2255y = i;
        m mVar = this.f2244n;
        mVar.f2218k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2237e = charSequence;
        this.f2244n.p(false);
        e0 e0Var = this.f2245o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2238f = charSequence;
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i = this.f2254x;
        int i4 = (z4 ? 0 : 8) | (i & (-9));
        this.f2254x = i4;
        if (i != i4) {
            m mVar = this.f2244n;
            mVar.h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2237e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setContentDescription(CharSequence charSequence) {
        this.f2247q = charSequence;
        this.f2244n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final h0.a setTooltipText(CharSequence charSequence) {
        this.f2248r = charSequence;
        this.f2244n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i) {
        if (this.f2240j == c5 && this.f2241k == i) {
            return this;
        }
        this.f2240j = Character.toLowerCase(c5);
        this.f2241k = KeyEvent.normalizeMetaState(i);
        this.f2244n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i) {
        if (this.h == c5 && this.i == i) {
            return this;
        }
        this.h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2244n.p(false);
        return this;
    }

    @Override // h0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i, int i4) {
        this.h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2240j = Character.toLowerCase(c6);
        this.f2241k = KeyEvent.normalizeMetaState(i4);
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2242l = null;
        this.f2243m = i;
        this.f2253w = true;
        this.f2244n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2244n.f2211a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i4;
        m mVar = this.f2244n;
        Context context = mVar.f2211a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2256z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f2234a) > 0) {
            inflate.setId(i4);
        }
        mVar.f2218k = true;
        mVar.p(true);
        return this;
    }
}
