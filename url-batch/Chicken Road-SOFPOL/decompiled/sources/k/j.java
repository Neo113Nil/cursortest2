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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements MenuItem {
    public MenuItem.OnActionExpandListener A;

    /* renamed from: a, reason: collision with root package name */
    public final int f4089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4091c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4092d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4093e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4094f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f4095g;

    /* renamed from: h, reason: collision with root package name */
    public char f4096h;

    /* renamed from: j, reason: collision with root package name */
    public char f4097j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4099l;

    /* renamed from: n, reason: collision with root package name */
    public final i f4101n;

    /* renamed from: o, reason: collision with root package name */
    public s f4102o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4103p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f4104q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f4105r;

    /* renamed from: z, reason: collision with root package name */
    public View f4113z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f4098k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f4100m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f4106s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f4107t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4108u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4109v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4110w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f4111x = 16;
    public boolean B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f4112y = 0;

    public j(i iVar, int i, int i8, int i9, int i10, CharSequence charSequence) {
        this.f4101n = iVar;
        this.f4089a = i8;
        this.f4090b = i;
        this.f4091c = i9;
        this.f4092d = i10;
        this.f4093e = charSequence;
    }

    public static void a(int i, int i8, String str, StringBuilder sb) {
        if ((i & i8) == i8) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f4110w && (this.f4108u || this.f4109v)) {
            drawable = drawable.mutate();
            if (this.f4108u) {
                drawable.setTintList(this.f4106s);
            }
            if (this.f4109v) {
                drawable.setTintMode(this.f4107t);
            }
            this.f4110w = false;
        }
        return drawable;
    }

    public final j c(CharSequence charSequence) {
        this.f4104q = charSequence;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4112y & 8) == 0) {
            return false;
        }
        if (this.f4113z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4101n.d(this);
        }
        return false;
    }

    public final void d(boolean z3) {
        if (z3) {
            this.f4111x |= 32;
        } else {
            this.f4111x &= -33;
        }
    }

    public final j e(CharSequence charSequence) {
        this.f4105r = charSequence;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f4112y & 8) == 0 || this.f4113z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4101n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4113z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4098k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4097j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4104q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4090b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4099l;
        if (drawable != null) {
            return b(drawable);
        }
        int i = this.f4100m;
        if (i == 0) {
            return null;
        }
        Drawable D = h0.a.D(this.f4101n.f4070a, i);
        this.f4100m = 0;
        this.f4099l = D;
        return b(D);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4106s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4107t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4095g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4089a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4096h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4091c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4102o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4093e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4094f;
        return charSequence != null ? charSequence : this.f4093e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4105r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4102o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4111x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4111x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4111x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4111x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f4113z = view;
        if (view != null && view.getId() == -1 && (i = this.f4089a) > 0) {
            view.setId(i);
        }
        i iVar = this.f4101n;
        iVar.f4079k = true;
        iVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        if (this.f4097j == c8) {
            return this;
        }
        this.f4097j = Character.toLowerCase(c8);
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i = this.f4111x;
        int i8 = (z3 ? 1 : 0) | (i & (-2));
        this.f4111x = i8;
        if (i != i8) {
            this.f4101n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i = this.f4111x;
        int i8 = i & 4;
        i iVar = this.f4101n;
        if (i8 == 0) {
            int i9 = (i & (-3)) | (z3 ? 2 : 0);
            this.f4111x = i9;
            if (i != i9) {
                iVar.o(false);
            }
            return this;
        }
        ArrayList arrayList = iVar.f4075f;
        int size = arrayList.size();
        iVar.s();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) arrayList.get(i10);
            if (jVar.f4090b == this.f4090b && (jVar.f4111x & 4) != 0 && jVar.isCheckable()) {
                boolean z7 = jVar == this;
                int i11 = jVar.f4111x;
                int i12 = (z7 ? 2 : 0) | (i11 & (-3));
                jVar.f4111x = i12;
                if (i11 != i12) {
                    jVar.f4101n.o(false);
                }
            }
        }
        iVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f4111x |= 16;
        } else {
            this.f4111x &= -17;
        }
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4100m = 0;
        this.f4099l = drawable;
        this.f4110w = true;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4106s = colorStateList;
        this.f4108u = true;
        this.f4110w = true;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4107t = mode;
        this.f4109v = true;
        this.f4110w = true;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4095g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        if (this.f4096h == c8) {
            return this;
        }
        this.f4096h = c8;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4103p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9) {
        this.f4096h = c8;
        this.f4097j = Character.toLowerCase(c9);
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i8 = i & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4112y = i;
        i iVar = this.f4101n;
        iVar.f4079k = true;
        iVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4093e = charSequence;
        this.f4101n.o(false);
        s sVar = this.f4102o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4094f = charSequence;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i = this.f4111x;
        int i8 = (z3 ? 0 : 8) | (i & (-9));
        this.f4111x = i8;
        if (i != i8) {
            i iVar = this.f4101n;
            iVar.f4077h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4093e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        if (this.f4097j == c8 && this.f4098k == i) {
            return this;
        }
        this.f4097j = Character.toLowerCase(c8);
        this.f4098k = KeyEvent.normalizeMetaState(i);
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i) {
        if (this.f4096h == c8 && this.i == i) {
            return this;
        }
        this.f4096h = c8;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9, int i, int i8) {
        this.f4096h = c8;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f4097j = Character.toLowerCase(c9);
        this.f4098k = KeyEvent.normalizeMetaState(i8);
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4099l = null;
        this.f4100m = i;
        this.f4110w = true;
        this.f4101n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f4101n.f4070a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i8;
        i iVar = this.f4101n;
        Context context = iVar.f4070a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f4113z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f4089a) > 0) {
            inflate.setId(i8);
        }
        iVar.f4079k = true;
        iVar.o(true);
        return this;
    }
}
