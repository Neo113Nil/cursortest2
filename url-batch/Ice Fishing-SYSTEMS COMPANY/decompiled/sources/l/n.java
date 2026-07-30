package l;

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
public final class n implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public char f38972A;

    /* renamed from: C, reason: collision with root package name */
    public char f38974C;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f38976E;

    /* renamed from: G, reason: collision with root package name */
    public final l f38978G;

    /* renamed from: H, reason: collision with root package name */
    public SubMenuC4672D f38979H;

    /* renamed from: I, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f38980I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f38981K;

    /* renamed from: R, reason: collision with root package name */
    public int f38988R;

    /* renamed from: S, reason: collision with root package name */
    public View f38989S;

    /* renamed from: T, reason: collision with root package name */
    public o f38990T;

    /* renamed from: U, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f38991U;

    /* renamed from: n, reason: collision with root package name */
    public final int f38993n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38994u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38995v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38996w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f38997x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f38998y;

    /* renamed from: z, reason: collision with root package name */
    public Intent f38999z;

    /* renamed from: B, reason: collision with root package name */
    public int f38973B = 4096;

    /* renamed from: D, reason: collision with root package name */
    public int f38975D = 4096;

    /* renamed from: F, reason: collision with root package name */
    public int f38977F = 0;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f38982L = null;

    /* renamed from: M, reason: collision with root package name */
    public PorterDuff.Mode f38983M = null;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38984N = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38985O = false;

    /* renamed from: P, reason: collision with root package name */
    public boolean f38986P = false;

    /* renamed from: Q, reason: collision with root package name */
    public int f38987Q = 16;

    /* renamed from: V, reason: collision with root package name */
    public boolean f38992V = false;

    public n(l lVar, int i, int i4, int i9, int i10, CharSequence charSequence, int i11) {
        this.f38978G = lVar;
        this.f38993n = i4;
        this.f38994u = i;
        this.f38995v = i9;
        this.f38996w = i10;
        this.f38997x = charSequence;
        this.f38988R = i11;
    }

    public static void c(int i, int i4, String str, StringBuilder sb) {
        if ((i & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // I.a
    public final o a() {
        return this.f38990T;
    }

    @Override // I.a
    public final I.a b(o oVar) {
        this.f38989S = null;
        this.f38990T = oVar;
        this.f38978G.p(true);
        o oVar2 = this.f38990T;
        if (oVar2 != null) {
            oVar2.f39000a = new h8.d(2, this);
            oVar2.f39001b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f38988R & 8) == 0) {
            return false;
        }
        if (this.f38989S == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f38991U;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f38978G.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f38986P && (this.f38984N || this.f38985O)) {
            drawable = drawable.mutate();
            if (this.f38984N) {
                H.a.h(drawable, this.f38982L);
            }
            if (this.f38985O) {
                H.a.i(drawable, this.f38983M);
            }
            this.f38986P = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f38988R & 8) != 0) {
            if (this.f38989S == null && (oVar = this.f38990T) != null) {
                this.f38989S = oVar.f39001b.onCreateActionView(this);
            }
            if (this.f38989S != null) {
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
        MenuItem.OnActionExpandListener onActionExpandListener = this.f38991U;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f38978G.f(this);
        }
        return false;
    }

    public final void f(boolean z8) {
        if (z8) {
            this.f38987Q |= 32;
        } else {
            this.f38987Q &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f38989S;
        if (view != null) {
            return view;
        }
        o oVar = this.f38990T;
        if (oVar == null) {
            return null;
        }
        View onCreateActionView = oVar.f39001b.onCreateActionView(this);
        this.f38989S = onCreateActionView;
        return onCreateActionView;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f38975D;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f38974C;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.J;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f38994u;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f38976E;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f38977F;
        if (i == 0) {
            return null;
        }
        Drawable h9 = com.bumptech.glide.f.h(this.f38978G.f38962n, i);
        this.f38977F = 0;
        this.f38976E = h9;
        return d(h9);
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f38982L;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f38983M;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f38999z;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f38993n;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f38973B;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f38972A;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f38995v;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f38979H;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f38997x;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38998y;
        return charSequence != null ? charSequence : this.f38997x;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f38981K;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f38979H != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f38992V;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f38987Q & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f38987Q & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f38987Q & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f38990T;
        return (oVar == null || !oVar.f39001b.overridesItemVisibility()) ? (this.f38987Q & 8) == 0 : (this.f38987Q & 8) == 0 && this.f38990T.f39001b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f38989S = view;
        this.f38990T = null;
        if (view != null && view.getId() == -1 && (i = this.f38993n) > 0) {
            view.setId(i);
        }
        l lVar = this.f38978G;
        lVar.f38949D = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f38974C == c4) {
            return this;
        }
        this.f38974C = Character.toLowerCase(c4);
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        int i = this.f38987Q;
        int i4 = (z8 ? 1 : 0) | (i & (-2));
        this.f38987Q = i4;
        if (i != i4) {
            this.f38978G.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        int i = this.f38987Q;
        if ((i & 4) == 0) {
            int i4 = (i & (-3)) | (z8 ? 2 : 0);
            this.f38987Q = i4;
            if (i != i4) {
                this.f38978G.p(false);
            }
            return this;
        }
        l lVar = this.f38978G;
        lVar.getClass();
        ArrayList arrayList = lVar.f38967y;
        int size = arrayList.size();
        lVar.w();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) arrayList.get(i9);
            if (nVar.f38994u == this.f38994u && (nVar.f38987Q & 4) != 0 && nVar.isCheckable()) {
                boolean z9 = nVar == this;
                int i10 = nVar.f38987Q;
                int i11 = (z9 ? 2 : 0) | (i10 & (-3));
                nVar.f38987Q = i11;
                if (i10 != i11) {
                    nVar.f38978G.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.f38987Q |= 16;
        } else {
            this.f38987Q &= -17;
        }
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f38977F = 0;
        this.f38976E = drawable;
        this.f38986P = true;
        this.f38978G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38982L = colorStateList;
        this.f38984N = true;
        this.f38986P = true;
        this.f38978G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38983M = mode;
        this.f38985O = true;
        this.f38986P = true;
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f38999z = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f38972A == c4) {
            return this;
        }
        this.f38972A = c4;
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f38991U = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38980I = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c9) {
        this.f38972A = c4;
        this.f38974C = Character.toLowerCase(c9);
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i4 = i & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f38988R = i;
        l lVar = this.f38978G;
        lVar.f38949D = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f38997x = charSequence;
        this.f38978G.p(false);
        SubMenuC4672D subMenuC4672D = this.f38979H;
        if (subMenuC4672D != null) {
            subMenuC4672D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38998y = charSequence;
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        int i = this.f38987Q;
        int i4 = (z8 ? 0 : 8) | (i & (-9));
        this.f38987Q = i4;
        if (i != i4) {
            l lVar = this.f38978G;
            lVar.f38946A = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f38997x;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.J = charSequence;
        this.f38978G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f38981K = charSequence;
        this.f38978G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        if (this.f38974C == c4 && this.f38975D == i) {
            return this;
        }
        this.f38974C = Character.toLowerCase(c4);
        this.f38975D = KeyEvent.normalizeMetaState(i);
        this.f38978G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        if (this.f38972A == c4 && this.f38973B == i) {
            return this;
        }
        this.f38972A = c4;
        this.f38973B = KeyEvent.normalizeMetaState(i);
        this.f38978G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c9, int i, int i4) {
        this.f38972A = c4;
        this.f38973B = KeyEvent.normalizeMetaState(i);
        this.f38974C = Character.toLowerCase(c9);
        this.f38975D = KeyEvent.normalizeMetaState(i4);
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f38976E = null;
        this.f38977F = i;
        this.f38986P = true;
        this.f38978G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f38978G.f38962n.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i4;
        Context context = this.f38978G.f38962n;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f38989S = inflate;
        this.f38990T = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f38993n) > 0) {
            inflate.setId(i4);
        }
        l lVar = this.f38978G;
        lVar.f38949D = true;
        lVar.p(true);
        return this;
    }
}
