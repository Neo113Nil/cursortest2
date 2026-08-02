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
import g.AbstractC0432a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f13666A;

    /* renamed from: a, reason: collision with root package name */
    public final int f13668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13671d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f13672e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f13673f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f13674g;

    /* renamed from: h, reason: collision with root package name */
    public char f13675h;

    /* renamed from: j, reason: collision with root package name */
    public char f13677j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f13679l;
    public final j n;
    public t o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f13681p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f13682q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f13683r;
    public View z;

    /* renamed from: i, reason: collision with root package name */
    public int f13676i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f13678k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f13680m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f13684s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f13685t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13686u = false;
    public boolean v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13687w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f13688x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13667B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f13689y = 0;

    public k(j jVar, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.n = jVar;
        this.f13668a = i5;
        this.f13669b = i4;
        this.f13670c = i6;
        this.f13671d = i7;
        this.f13672e = charSequence;
    }

    public static void a(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f13687w && (this.f13686u || this.v)) {
            drawable = drawable.mutate();
            if (this.f13686u) {
                drawable.setTintList(this.f13684s);
            }
            if (this.v) {
                drawable.setTintMode(this.f13685t);
            }
            this.f13687w = false;
        }
        return drawable;
    }

    public final k c(CharSequence charSequence) {
        this.f13682q = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f13689y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13666A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final void d(boolean z) {
        if (z) {
            this.f13688x |= 32;
        } else {
            this.f13688x &= -33;
        }
    }

    public final k e(CharSequence charSequence) {
        this.f13683r = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f13689y & 8) == 0 || this.z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13666A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13678k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13677j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13682q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f13669b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f13679l;
        if (drawable != null) {
            return b(drawable);
        }
        int i4 = this.f13680m;
        if (i4 == 0) {
            return null;
        }
        Drawable a3 = AbstractC0432a.a(this.n.f13647a, i4);
        this.f13680m = 0;
        this.f13679l = a3;
        return b(a3);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13684s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13685t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13674g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f13668a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13676i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13675h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f13670c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13672e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13673f;
        return charSequence != null ? charSequence : this.f13672e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13683r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f13667B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13688x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13688x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13688x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f13688x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.z = view;
        if (view != null && view.getId() == -1 && (i4 = this.f13668a) > 0) {
            view.setId(i4);
        }
        j jVar = this.n;
        jVar.f13657k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f13677j == c4) {
            return this;
        }
        this.f13677j = Character.toLowerCase(c4);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i4 = this.f13688x;
        int i5 = (z ? 1 : 0) | (i4 & (-2));
        this.f13688x = i5;
        if (i4 != i5) {
            this.n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i4 = this.f13688x;
        if ((i4 & 4) == 0) {
            int i5 = (i4 & (-3)) | (z ? 2 : 0);
            this.f13688x = i5;
            if (i4 != i5) {
                this.n.o(false);
            }
            return this;
        }
        j jVar = this.n;
        ArrayList arrayList = jVar.f13652f;
        int size = arrayList.size();
        jVar.s();
        for (int i6 = 0; i6 < size; i6++) {
            k kVar = (k) arrayList.get(i6);
            if (kVar.f13669b == this.f13669b && (kVar.f13688x & 4) != 0 && kVar.isCheckable()) {
                boolean z4 = kVar == this;
                int i7 = kVar.f13688x;
                int i8 = (z4 ? 2 : 0) | (i7 & (-3));
                kVar.f13688x = i8;
                if (i7 != i8) {
                    kVar.n.o(false);
                }
            }
        }
        jVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f13688x |= 16;
        } else {
            this.f13688x &= -17;
        }
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13680m = 0;
        this.f13679l = drawable;
        this.f13687w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13684s = colorStateList;
        this.f13686u = true;
        this.f13687w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13685t = mode;
        this.v = true;
        this.f13687w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13674g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f13675h == c4) {
            return this;
        }
        this.f13675h = c4;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13666A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13681p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f13675h = c4;
        this.f13677j = Character.toLowerCase(c5);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13689y = i4;
        j jVar = this.n;
        jVar.f13657k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13672e = charSequence;
        this.n.o(false);
        t tVar = this.o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13673f = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i4 = this.f13688x;
        int i5 = (z ? 0 : 8) | (i4 & (-9));
        this.f13688x = i5;
        if (i4 != i5) {
            j jVar = this.n;
            jVar.f13654h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f13672e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f13677j == c4 && this.f13678k == i4) {
            return this;
        }
        this.f13677j = Character.toLowerCase(c4);
        this.f13678k = KeyEvent.normalizeMetaState(i4);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f13675h == c4 && this.f13676i == i4) {
            return this;
        }
        this.f13675h = c4;
        this.f13676i = KeyEvent.normalizeMetaState(i4);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f13675h = c4;
        this.f13676i = KeyEvent.normalizeMetaState(i4);
        this.f13677j = Character.toLowerCase(c5);
        this.f13678k = KeyEvent.normalizeMetaState(i5);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f13679l = null;
        this.f13680m = i4;
        this.f13687w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.n.f13647a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        Context context = this.n.f13647a;
        View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f13668a) > 0) {
            inflate.setId(i5);
        }
        j jVar = this.n;
        jVar.f13657k = true;
        jVar.o(true);
        return this;
    }
}
