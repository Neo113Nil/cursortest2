package g;

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
import d.AbstractC0110a;
import java.util.ArrayList;
import q.AbstractC0218a;

/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f1995A;

    /* renamed from: a, reason: collision with root package name */
    public final int f1997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2000d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2001e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2002f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2003g;

    /* renamed from: h, reason: collision with root package name */
    public char f2004h;

    /* renamed from: j, reason: collision with root package name */
    public char f2006j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2008l;

    /* renamed from: n, reason: collision with root package name */
    public final j f2010n;

    /* renamed from: o, reason: collision with root package name */
    public t f2011o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2012p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2013q;
    public CharSequence r;

    /* renamed from: z, reason: collision with root package name */
    public View f2021z;

    /* renamed from: i, reason: collision with root package name */
    public int f2005i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2007k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2009m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2014s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2015t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2016u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2017v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2018w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2019x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1996B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f2020y = 0;

    public k(j jVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2010n = jVar;
        this.f1997a = i3;
        this.f1998b = i2;
        this.f1999c = i4;
        this.f2000d = i5;
        this.f2001e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f2018w && (this.f2016u || this.f2017v)) {
            drawable = drawable.mutate();
            if (this.f2016u) {
                AbstractC0218a.h(drawable, this.f2014s);
            }
            if (this.f2017v) {
                AbstractC0218a.i(drawable, this.f2015t);
            }
            this.f2018w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f2020y & 8) == 0 || this.f2021z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2020y & 8) == 0) {
            return false;
        }
        if (this.f2021z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1995A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2010n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f2019x & 32) == 32;
    }

    public final k e(CharSequence charSequence) {
        this.f2013q = charSequence;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1995A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2010n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f2019x |= 32;
        } else {
            this.f2019x &= -33;
        }
    }

    public final k g(CharSequence charSequence) {
        this.r = charSequence;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2021z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2007k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2006j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2013q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f1998b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2008l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f2009m;
        if (i2 == 0) {
            return null;
        }
        Drawable a2 = AbstractC0110a.a(this.f2010n.f1976a, i2);
        this.f2009m = 0;
        this.f2008l = a2;
        return b(a2);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2014s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2015t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2003g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f1997a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2005i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2004h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f1999c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2011o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2001e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2002f;
        return charSequence != null ? charSequence : this.f2001e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2011o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f1996B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2019x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2019x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2019x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2019x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2021z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f1997a) > 0) {
            view.setId(i2);
        }
        j jVar = this.f2010n;
        jVar.f1986k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2006j == c2) {
            return this;
        }
        this.f2006j = Character.toLowerCase(c2);
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2019x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2019x = i3;
        if (i2 != i3) {
            this.f2010n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2019x;
        if ((i2 & 4) != 0) {
            j jVar = this.f2010n;
            jVar.getClass();
            ArrayList arrayList = jVar.f1981f;
            int size = arrayList.size();
            jVar.s();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList.get(i3);
                if (kVar.f1998b == this.f1998b && (kVar.f2019x & 4) != 0 && kVar.isCheckable()) {
                    boolean z3 = kVar == this;
                    int i4 = kVar.f2019x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    kVar.f2019x = i5;
                    if (i4 != i5) {
                        kVar.f2010n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2019x = i6;
            if (i2 != i6) {
                this.f2010n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2019x |= 16;
        } else {
            this.f2019x &= -17;
        }
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2009m = 0;
        this.f2008l = drawable;
        this.f2018w = true;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2014s = colorStateList;
        this.f2016u = true;
        this.f2018w = true;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2015t = mode;
        this.f2017v = true;
        this.f2018w = true;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2003g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2004h == c2) {
            return this;
        }
        this.f2004h = c2;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1995A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2012p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2004h = c2;
        this.f2006j = Character.toLowerCase(c3);
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2020y = i2;
        j jVar = this.f2010n;
        jVar.f1986k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2001e = charSequence;
        this.f2010n.o(false);
        t tVar = this.f2011o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2002f = charSequence;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2019x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2019x = i3;
        if (i2 != i3) {
            j jVar = this.f2010n;
            jVar.f1983h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2001e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2006j == c2 && this.f2007k == i2) {
            return this;
        }
        this.f2006j = Character.toLowerCase(c2);
        this.f2007k = KeyEvent.normalizeMetaState(i2);
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2004h == c2 && this.f2005i == i2) {
            return this;
        }
        this.f2004h = c2;
        this.f2005i = KeyEvent.normalizeMetaState(i2);
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2004h = c2;
        this.f2005i = KeyEvent.normalizeMetaState(i2);
        this.f2006j = Character.toLowerCase(c3);
        this.f2007k = KeyEvent.normalizeMetaState(i3);
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2008l = null;
        this.f2009m = i2;
        this.f2018w = true;
        this.f2010n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2010n.f1976a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2010n.f1976a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2021z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f1997a) > 0) {
            inflate.setId(i3);
        }
        j jVar = this.f2010n;
        jVar.f1986k = true;
        jVar.o(true);
        return this;
    }
}
