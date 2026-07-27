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
import h.AbstractC0477a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import y.AbstractC1550a;

/* loaded from: classes.dex */
public final class j implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f10606A;

    /* renamed from: a, reason: collision with root package name */
    public final int f10608a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10610c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10611d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f10612e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f10613f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f10614g;

    /* renamed from: h, reason: collision with root package name */
    public char f10615h;

    /* renamed from: j, reason: collision with root package name */
    public char f10617j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f10619l;

    /* renamed from: n, reason: collision with root package name */
    public final i f10621n;

    /* renamed from: o, reason: collision with root package name */
    public s f10622o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f10623p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f10624q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f10625r;
    public View z;

    /* renamed from: i, reason: collision with root package name */
    public int f10616i = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f10618k = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f10620m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f10626s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f10627t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10628u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10629v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10630w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f10631x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f10607B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f10632y = 0;

    public j(i iVar, int i2, int i3, int i6, int i7, CharSequence charSequence) {
        this.f10621n = iVar;
        this.f10608a = i3;
        this.f10609b = i2;
        this.f10610c = i6;
        this.f10611d = i7;
        this.f10612e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f10630w && (this.f10628u || this.f10629v)) {
            drawable = drawable.mutate();
            if (this.f10628u) {
                AbstractC1550a.h(drawable, this.f10626s);
            }
            if (this.f10629v) {
                AbstractC1550a.i(drawable, this.f10627t);
            }
            this.f10630w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f10632y & 8) == 0 || this.z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f10632y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f10606A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f10621n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f10631x & 32) == 32;
    }

    public final j e(CharSequence charSequence) {
        this.f10624q = charSequence;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f10606A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f10621n.f(this);
        }
        return false;
    }

    public final void f(boolean z) {
        if (z) {
            this.f10631x |= 32;
        } else {
            this.f10631x &= -33;
        }
    }

    public final j g(CharSequence charSequence) {
        this.f10625r = charSequence;
        this.f10621n.o(false);
        return this;
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
        return this.f10618k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f10617j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f10624q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f10609b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f10619l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f10620m;
        if (i2 == 0) {
            return null;
        }
        Drawable a6 = AbstractC0477a.a(this.f10621n.f10586a, i2);
        this.f10620m = 0;
        this.f10619l = a6;
        return b(a6);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f10626s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f10627t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f10614g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f10608a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f10616i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f10615h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f10610c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f10622o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f10612e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10613f;
        return charSequence != null ? charSequence : this.f10612e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f10625r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f10622o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f10607B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f10631x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f10631x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f10631x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f10631x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f10608a) > 0) {
            view.setId(i2);
        }
        i iVar = this.f10621n;
        iVar.f10596k = true;
        iVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f10617j == c2) {
            return this;
        }
        this.f10617j = Character.toLowerCase(c2);
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i2 = this.f10631x;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.f10631x = i3;
        if (i2 != i3) {
            this.f10621n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i2 = this.f10631x;
        if ((i2 & 4) != 0) {
            i iVar = this.f10621n;
            iVar.getClass();
            ArrayList arrayList = iVar.f10591f;
            int size = arrayList.size();
            iVar.s();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = (j) arrayList.get(i3);
                if (jVar.f10609b == this.f10609b && (jVar.f10631x & 4) != 0 && jVar.isCheckable()) {
                    boolean z5 = jVar == this;
                    int i6 = jVar.f10631x;
                    int i7 = (z5 ? 2 : 0) | (i6 & (-3));
                    jVar.f10631x = i7;
                    if (i6 != i7) {
                        jVar.f10621n.o(false);
                    }
                }
            }
            iVar.r();
        } else {
            int i8 = (i2 & (-3)) | (z ? 2 : 0);
            this.f10631x = i8;
            if (i2 != i8) {
                this.f10621n.o(false);
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
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f10631x |= 16;
        } else {
            this.f10631x &= -17;
        }
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f10620m = 0;
        this.f10619l = drawable;
        this.f10630w = true;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10626s = colorStateList;
        this.f10628u = true;
        this.f10630w = true;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10627t = mode;
        this.f10629v = true;
        this.f10630w = true;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f10614g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f10615h == c2) {
            return this;
        }
        this.f10615h = c2;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10606A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10623p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c6) {
        this.f10615h = c2;
        this.f10617j = Character.toLowerCase(c6);
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f10632y = i2;
        i iVar = this.f10621n;
        iVar.f10596k = true;
        iVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f10612e = charSequence;
        this.f10621n.o(false);
        s sVar = this.f10622o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10613f = charSequence;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i2 = this.f10631x;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.f10631x = i3;
        if (i2 != i3) {
            i iVar = this.f10621n;
            iVar.f10593h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f10612e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f10617j == c2 && this.f10618k == i2) {
            return this;
        }
        this.f10617j = Character.toLowerCase(c2);
        this.f10618k = KeyEvent.normalizeMetaState(i2);
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f10615h == c2 && this.f10616i == i2) {
            return this;
        }
        this.f10615h = c2;
        this.f10616i = KeyEvent.normalizeMetaState(i2);
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c6, int i2, int i3) {
        this.f10615h = c2;
        this.f10616i = KeyEvent.normalizeMetaState(i2);
        this.f10617j = Character.toLowerCase(c6);
        this.f10618k = KeyEvent.normalizeMetaState(i3);
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f10619l = null;
        this.f10620m = i2;
        this.f10630w = true;
        this.f10621n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f10621n.f10586a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f10621n.f10586a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f10608a) > 0) {
            inflate.setId(i3);
        }
        i iVar = this.f10621n;
        iVar.f10596k = true;
        iVar.o(true);
        return this;
    }
}
