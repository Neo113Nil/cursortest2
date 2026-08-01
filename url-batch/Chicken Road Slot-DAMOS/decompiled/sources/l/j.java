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
import te.a1;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements MenuItem {
    public MenuItem.OnActionExpandListener A;

    /* renamed from: a, reason: collision with root package name */
    public final int f5683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5684b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5685c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5686d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f5687e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f5688f;
    public Intent g;

    /* renamed from: h, reason: collision with root package name */
    public char f5689h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f5692l;

    /* renamed from: n, reason: collision with root package name */
    public final i f5694n;

    /* renamed from: o, reason: collision with root package name */
    public s f5695o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f5696p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f5697q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f5698r;

    /* renamed from: z, reason: collision with root package name */
    public View f5706z;

    /* renamed from: i, reason: collision with root package name */
    public int f5690i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f5691k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f5693m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f5699s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f5700t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5701u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5702v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5703w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f5704x = 16;
    public boolean B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f5705y = 0;

    public j(i iVar, int i3, int i10, int i11, int i12, CharSequence charSequence) {
        this.f5694n = iVar;
        this.f5683a = i10;
        this.f5684b = i3;
        this.f5685c = i11;
        this.f5686d = i12;
        this.f5687e = charSequence;
    }

    public static void a(int i3, int i10, String str, StringBuilder sb2) {
        if ((i3 & i10) == i10) {
            sb2.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f5703w && (this.f5701u || this.f5702v)) {
            drawable = drawable.mutate();
            if (this.f5701u) {
                drawable.setTintList(this.f5699s);
            }
            if (this.f5702v) {
                drawable.setTintMode(this.f5700t);
            }
            this.f5703w = false;
        }
        return drawable;
    }

    public final j c(CharSequence charSequence) {
        this.f5697q = charSequence;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f5705y & 8) == 0) {
            return false;
        }
        if (this.f5706z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5694n.d(this);
        }
        return false;
    }

    public final void d(boolean z10) {
        int i3 = this.f5704x;
        if (z10) {
            this.f5704x = i3 | 32;
        } else {
            this.f5704x = i3 & (-33);
        }
    }

    public final j e(CharSequence charSequence) {
        this.f5698r = charSequence;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f5705y & 8) == 0 || this.f5706z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5694n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f5706z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5691k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5697q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f5684b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f5692l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f5693m;
        if (i3 == 0) {
            return null;
        }
        Drawable v10 = w.v(this.f5694n.f5665a, i3);
        this.f5693m = 0;
        this.f5692l = v10;
        return b(v10);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5699s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5700t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f5683a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5690i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5689h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f5685c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f5695o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5687e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5688f;
        return charSequence != null ? charSequence : this.f5687e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5698r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f5695o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f5704x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f5704x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f5704x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f5704x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i10;
        i iVar = this.f5694n;
        Context context = iVar.f5665a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f5706z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f5683a) > 0) {
            inflate.setId(i10);
        }
        iVar.f5673k = true;
        iVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i3) {
        if (this.j == c10 && this.f5691k == i3) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f5691k = KeyEvent.normalizeMetaState(i3);
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i3 = this.f5704x;
        int i10 = (z10 ? 1 : 0) | (i3 & (-2));
        this.f5704x = i10;
        if (i3 != i10) {
            this.f5694n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i3 = this.f5704x;
        int i10 = i3 & 4;
        i iVar = this.f5694n;
        if (i10 == 0) {
            int i11 = (i3 & (-3)) | (z10 ? 2 : 0);
            this.f5704x = i11;
            if (i3 != i11) {
                iVar.o(false);
            }
            return this;
        }
        ArrayList arrayList = iVar.f5670f;
        int size = arrayList.size();
        iVar.s();
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = (j) arrayList.get(i12);
            if (jVar.f5684b == this.f5684b && (jVar.f5704x & 4) != 0 && jVar.isCheckable()) {
                boolean z11 = jVar == this;
                int i13 = jVar.f5704x;
                int i14 = (z11 ? 2 : 0) | (i13 & (-3));
                jVar.f5704x = i14;
                if (i13 != i14) {
                    jVar.f5694n.o(false);
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
    public final MenuItem setEnabled(boolean z10) {
        int i3 = this.f5704x;
        if (z10) {
            this.f5704x = i3 | 16;
        } else {
            this.f5704x = i3 & (-17);
        }
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f5692l = null;
        this.f5693m = i3;
        this.f5703w = true;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5699s = colorStateList;
        this.f5701u = true;
        this.f5703w = true;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5700t = mode;
        this.f5702v = true;
        this.f5703w = true;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i3) {
        if (this.f5689h == c10 && this.f5690i == i3) {
            return this;
        }
        this.f5689h = c10;
        this.f5690i = KeyEvent.normalizeMetaState(i3);
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5696p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i3, int i10) {
        this.f5689h = c10;
        this.f5690i = KeyEvent.normalizeMetaState(i3);
        this.j = Character.toLowerCase(c11);
        this.f5691k = KeyEvent.normalizeMetaState(i10);
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i10 = i3 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            a1.e("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f5705y = i3;
        i iVar = this.f5694n;
        iVar.f5673k = true;
        iVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5687e = charSequence;
        this.f5694n.o(false);
        s sVar = this.f5695o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5688f = charSequence;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i3 = this.f5704x;
        int i10 = (z10 ? 0 : 8) | (i3 & (-9));
        this.f5704x = i10;
        if (i3 != i10) {
            i iVar = this.f5694n;
            iVar.f5671h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f5687e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5693m = 0;
        this.f5692l = drawable;
        this.f5703w = true;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f5694n.f5665a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f5689h == c10) {
            return this;
        }
        this.f5689h = c10;
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f5689h = c10;
        this.j = Character.toLowerCase(c11);
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.j == c10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f5694n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f5706z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f5683a) > 0) {
            view.setId(i3);
        }
        i iVar = this.f5694n;
        iVar.f5673k = true;
        iVar.o(true);
        return this;
    }
}
