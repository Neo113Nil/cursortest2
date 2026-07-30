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
import i.C0511M;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements D.a {

    /* renamed from: A, reason: collision with root package name */
    public p f6437A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f6438B;

    /* renamed from: a, reason: collision with root package name */
    public final int f6440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6443d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f6444e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f6445f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f6446g;

    /* renamed from: h, reason: collision with root package name */
    public char f6447h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f6450l;

    /* renamed from: n, reason: collision with root package name */
    public final m f6452n;

    /* renamed from: o, reason: collision with root package name */
    public F f6453o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f6454p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f6455q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f6456r;

    /* renamed from: y, reason: collision with root package name */
    public int f6463y;

    /* renamed from: z, reason: collision with root package name */
    public View f6464z;

    /* renamed from: i, reason: collision with root package name */
    public int f6448i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f6449k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f6451m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f6457s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f6458t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6459u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6460v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6461w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f6462x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6439C = false;

    public o(m mVar, int i2, int i5, int i7, int i8, CharSequence charSequence, int i9) {
        this.f6452n = mVar;
        this.f6440a = i5;
        this.f6441b = i2;
        this.f6442c = i7;
        this.f6443d = i8;
        this.f6444e = charSequence;
        this.f6463y = i9;
    }

    public static void c(StringBuilder sb, int i2, int i5, String str) {
        if ((i2 & i5) == i5) {
            sb.append(str);
        }
    }

    @Override // D.a
    public final D.a a(p pVar) {
        this.f6464z = null;
        this.f6437A = pVar;
        this.f6452n.p(true);
        p pVar2 = this.f6437A;
        if (pVar2 != null) {
            pVar2.f6466b = new C0511M(5, this);
            pVar2.f6465a.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // D.a
    public final p b() {
        return this.f6437A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6463y & 8) == 0) {
            return false;
        }
        if (this.f6464z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6438B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6452n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f6461w && (this.f6459u || this.f6460v)) {
            drawable = drawable.mutate();
            if (this.f6459u) {
                drawable.setTintList(this.f6457s);
            }
            if (this.f6460v) {
                drawable.setTintMode(this.f6458t);
            }
            this.f6461w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f6463y & 8) == 0) {
            return false;
        }
        if (this.f6464z == null && (pVar = this.f6437A) != null) {
            this.f6464z = pVar.a(this);
        }
        return this.f6464z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6438B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6452n.f(this);
        }
        return false;
    }

    public final void f(boolean z7) {
        if (z7) {
            this.f6462x |= 32;
        } else {
            this.f6462x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6464z;
        if (view != null) {
            return view;
        }
        p pVar = this.f6437A;
        if (pVar == null) {
            return null;
        }
        View a7 = pVar.a(this);
        this.f6464z = a7;
        return a7;
    }

    @Override // D.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6449k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // D.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6455q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6441b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6450l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f6451m;
        if (i2 == 0) {
            return null;
        }
        Drawable M7 = O6.g.M(this.f6452n.f6410a, i2);
        this.f6451m = 0;
        this.f6450l = M7;
        return d(M7);
    }

    @Override // D.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6457s;
    }

    @Override // D.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6458t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6446g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6440a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // D.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6448i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6447h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6442c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6453o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6444e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6445f;
        return charSequence != null ? charSequence : this.f6444e;
    }

    @Override // D.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6456r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6453o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6439C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6462x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6462x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6462x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f6437A;
        return (pVar == null || !pVar.f6465a.overridesItemVisibility()) ? (this.f6462x & 8) == 0 : (this.f6462x & 8) == 0 && this.f6437A.f6465a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f6464z = view;
        this.f6437A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f6440a) > 0) {
            view.setId(i2);
        }
        m mVar = this.f6452n;
        mVar.f6419k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        if (this.j == c7) {
            return this;
        }
        this.j = Character.toLowerCase(c7);
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        int i2 = this.f6462x;
        int i5 = (z7 ? 1 : 0) | (i2 & (-2));
        this.f6462x = i5;
        if (i2 != i5) {
            this.f6452n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        int i2 = this.f6462x;
        if ((i2 & 4) == 0) {
            int i5 = (i2 & (-3)) | (z7 ? 2 : 0);
            this.f6462x = i5;
            if (i2 != i5) {
                this.f6452n.p(false);
            }
            return this;
        }
        m mVar = this.f6452n;
        ArrayList arrayList = mVar.f6415f;
        int size = arrayList.size();
        mVar.w();
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) arrayList.get(i7);
            if (oVar.f6441b == this.f6441b && (oVar.f6462x & 4) != 0 && oVar.isCheckable()) {
                boolean z8 = oVar == this;
                int i8 = oVar.f6462x;
                int i9 = (z8 ? 2 : 0) | (i8 & (-3));
                oVar.f6462x = i9;
                if (i8 != i9) {
                    oVar.f6452n.p(false);
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
    public final MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f6462x |= 16;
        } else {
            this.f6462x &= -17;
        }
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6451m = 0;
        this.f6450l = drawable;
        this.f6461w = true;
        this.f6452n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6457s = colorStateList;
        this.f6459u = true;
        this.f6461w = true;
        this.f6452n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6458t = mode;
        this.f6460v = true;
        this.f6461w = true;
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6446g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        if (this.f6447h == c7) {
            return this;
        }
        this.f6447h = c7;
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6438B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6454p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f6447h = c7;
        this.j = Character.toLowerCase(c8);
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i5 = i2 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6463y = i2;
        m mVar = this.f6452n;
        mVar.f6419k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6444e = charSequence;
        this.f6452n.p(false);
        F f7 = this.f6453o;
        if (f7 != null) {
            f7.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6445f = charSequence;
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        int i2 = this.f6462x;
        int i5 = (z7 ? 0 : 8) | (i2 & (-9));
        this.f6462x = i5;
        if (i2 != i5) {
            m mVar = this.f6452n;
            mVar.f6417h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6444e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // D.a, android.view.MenuItem
    public final D.a setContentDescription(CharSequence charSequence) {
        this.f6455q = charSequence;
        this.f6452n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final D.a setTooltipText(CharSequence charSequence) {
        this.f6456r = charSequence;
        this.f6452n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i2) {
        if (this.j == c7 && this.f6449k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c7);
        this.f6449k = KeyEvent.normalizeMetaState(i2);
        this.f6452n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i2) {
        if (this.f6447h == c7 && this.f6448i == i2) {
            return this;
        }
        this.f6447h = c7;
        this.f6448i = KeyEvent.normalizeMetaState(i2);
        this.f6452n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i2, int i5) {
        this.f6447h = c7;
        this.f6448i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c8);
        this.f6449k = KeyEvent.normalizeMetaState(i5);
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f6450l = null;
        this.f6451m = i2;
        this.f6461w = true;
        this.f6452n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f6452n.f6410a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i5;
        Context context = this.f6452n.f6410a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f6464z = inflate;
        this.f6437A = null;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f6440a) > 0) {
            inflate.setId(i5);
        }
        m mVar = this.f6452n;
        mVar.f6419k = true;
        mVar.p(true);
        return this;
    }
}
