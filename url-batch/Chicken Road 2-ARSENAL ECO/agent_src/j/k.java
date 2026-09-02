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
import h.AbstractC0401a;
import java.util.ArrayList;
import x.AbstractC0723a;

/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4815A;

    /* renamed from: a, reason: collision with root package name */
    public final int f4817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4819c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4820d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4821e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4822f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f4823g;

    /* renamed from: h, reason: collision with root package name */
    public char f4824h;

    /* renamed from: j, reason: collision with root package name */
    public char f4826j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4828l;

    /* renamed from: n, reason: collision with root package name */
    public final j f4830n;

    /* renamed from: o, reason: collision with root package name */
    public t f4831o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4832p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f4833q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f4834r;

    /* renamed from: z, reason: collision with root package name */
    public View f4841z;

    /* renamed from: i, reason: collision with root package name */
    public int f4825i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f4827k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f4829m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f4835s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f4836t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4837u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4838v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4839w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f4840x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4816B = false;
    public int y = 0;

    public k(j jVar, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f4830n = jVar;
        this.f4817a = i8;
        this.f4818b = i7;
        this.f4819c = i9;
        this.f4820d = i10;
        this.f4821e = charSequence;
    }

    public static void a(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f4839w && (this.f4837u || this.f4838v)) {
            drawable = drawable.mutate();
            if (this.f4837u) {
                AbstractC0723a.h(drawable, this.f4835s);
            }
            if (this.f4838v) {
                AbstractC0723a.i(drawable, this.f4836t);
            }
            this.f4839w = false;
        }
        return drawable;
    }

    public final k c(CharSequence charSequence) {
        this.f4833q = charSequence;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f4841z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4815A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4830n.d(this);
        }
        return false;
    }

    public final void d(boolean z5) {
        if (z5) {
            this.f4840x |= 32;
        } else {
            this.f4840x &= -33;
        }
    }

    public final k e(CharSequence charSequence) {
        this.f4834r = charSequence;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.y & 8) == 0 || this.f4841z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4815A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4830n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4841z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4827k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4826j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4833q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4818b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4828l;
        if (drawable != null) {
            return b(drawable);
        }
        int i7 = this.f4829m;
        if (i7 == 0) {
            return null;
        }
        Drawable a7 = AbstractC0401a.a(this.f4830n.f4795a, i7);
        this.f4829m = 0;
        this.f4828l = a7;
        return b(a7);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4835s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4836t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4823g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4817a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4825i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4824h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4819c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4831o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4821e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4822f;
        return charSequence != null ? charSequence : this.f4821e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4834r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4831o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4816B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4840x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4840x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4840x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4840x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f4841z = view;
        if (view != null && view.getId() == -1 && (i7 = this.f4817a) > 0) {
            view.setId(i7);
        }
        j jVar = this.f4830n;
        jVar.f4805k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        if (this.f4826j == c7) {
            return this;
        }
        this.f4826j = Character.toLowerCase(c7);
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i7 = this.f4840x;
        int i8 = (z5 ? 1 : 0) | (i7 & (-2));
        this.f4840x = i8;
        if (i7 != i8) {
            this.f4830n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i7 = this.f4840x;
        if ((i7 & 4) == 0) {
            int i8 = (i7 & (-3)) | (z5 ? 2 : 0);
            this.f4840x = i8;
            if (i7 != i8) {
                this.f4830n.o(false);
            }
            return this;
        }
        j jVar = this.f4830n;
        ArrayList arrayList = jVar.f4800f;
        int size = arrayList.size();
        jVar.s();
        for (int i9 = 0; i9 < size; i9++) {
            k kVar = (k) arrayList.get(i9);
            if (kVar.f4818b == this.f4818b && (kVar.f4840x & 4) != 0 && kVar.isCheckable()) {
                boolean z6 = kVar == this;
                int i10 = kVar.f4840x;
                int i11 = (z6 ? 2 : 0) | (i10 & (-3));
                kVar.f4840x = i11;
                if (i10 != i11) {
                    kVar.f4830n.o(false);
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
    public final MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f4840x |= 16;
        } else {
            this.f4840x &= -17;
        }
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4829m = 0;
        this.f4828l = drawable;
        this.f4839w = true;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4835s = colorStateList;
        this.f4837u = true;
        this.f4839w = true;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4836t = mode;
        this.f4838v = true;
        this.f4839w = true;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4823g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        if (this.f4824h == c7) {
            return this;
        }
        this.f4824h = c7;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4815A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4832p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f4824h = c7;
        this.f4826j = Character.toLowerCase(c8);
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i7;
        j jVar = this.f4830n;
        jVar.f4805k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4821e = charSequence;
        this.f4830n.o(false);
        t tVar = this.f4831o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4822f = charSequence;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i7 = this.f4840x;
        int i8 = (z5 ? 0 : 8) | (i7 & (-9));
        this.f4840x = i8;
        if (i7 != i8) {
            j jVar = this.f4830n;
            jVar.f4802h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4821e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f4826j == c7 && this.f4827k == i7) {
            return this;
        }
        this.f4826j = Character.toLowerCase(c7);
        this.f4827k = KeyEvent.normalizeMetaState(i7);
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f4824h == c7 && this.f4825i == i7) {
            return this;
        }
        this.f4824h = c7;
        this.f4825i = KeyEvent.normalizeMetaState(i7);
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f4824h = c7;
        this.f4825i = KeyEvent.normalizeMetaState(i7);
        this.f4826j = Character.toLowerCase(c8);
        this.f4827k = KeyEvent.normalizeMetaState(i8);
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f4828l = null;
        this.f4829m = i7;
        this.f4839w = true;
        this.f4830n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f4830n.f4795a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        Context context = this.f4830n.f4795a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f4841z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f4817a) > 0) {
            inflate.setId(i8);
        }
        j jVar = this.f4830n;
        jVar.f4805k = true;
        jVar.o(true);
        return this;
    }
}
