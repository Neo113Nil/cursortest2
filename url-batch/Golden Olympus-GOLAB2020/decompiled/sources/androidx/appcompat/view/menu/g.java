package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.AbstractC1282b;
import f.AbstractC2415a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import x.InterfaceMenuItemC3511b;

/* loaded from: classes.dex */
public final class g implements InterfaceMenuItemC3511b {

    /* renamed from: A, reason: collision with root package name */
    private View f10396A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC1282b f10397B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f10398C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f10400E;

    /* renamed from: a, reason: collision with root package name */
    private final int f10401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10402b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10403c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10404d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f10405e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f10406f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f10407g;

    /* renamed from: h, reason: collision with root package name */
    private char f10408h;

    /* renamed from: j, reason: collision with root package name */
    private char f10410j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f10412l;

    /* renamed from: n, reason: collision with root package name */
    e f10414n;

    /* renamed from: o, reason: collision with root package name */
    private m f10415o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f10416p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f10417q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f10418r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f10419s;

    /* renamed from: z, reason: collision with root package name */
    private int f10426z;

    /* renamed from: i, reason: collision with root package name */
    private int f10409i = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: k, reason: collision with root package name */
    private int f10411k = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: m, reason: collision with root package name */
    private int f10413m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f10420t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f10421u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10422v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10423w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f10424x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f10425y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f10399D = false;

    class a implements AbstractC1282b.InterfaceC0099b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1282b.InterfaceC0099b
        public void onActionProviderVisibilityChanged(boolean z4) {
            g gVar = g.this;
            gVar.f10414n.onItemVisibleChanged(gVar);
        }
    }

    g(e eVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f10414n = eVar;
        this.f10401a = i5;
        this.f10402b = i4;
        this.f10403c = i6;
        this.f10404d = i7;
        this.f10405e = charSequence;
        this.f10426z = i8;
    }

    private static void d(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f10424x && (this.f10422v || this.f10423w)) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (this.f10422v) {
                androidx.core.graphics.drawable.a.i(drawable, this.f10420t);
            }
            if (this.f10423w) {
                androidx.core.graphics.drawable.a.j(drawable, this.f10421u);
            }
            this.f10424x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f10414n.isShortcutsVisible() && g() != 0;
    }

    public boolean B() {
        return (this.f10426z & 4) == 4;
    }

    @Override // x.InterfaceMenuItemC3511b
    public InterfaceMenuItemC3511b a(AbstractC1282b abstractC1282b) {
        AbstractC1282b abstractC1282b2 = this.f10397B;
        if (abstractC1282b2 != null) {
            abstractC1282b2.g();
        }
        this.f10396A = null;
        this.f10397B = abstractC1282b;
        this.f10414n.onItemsChanged(true);
        AbstractC1282b abstractC1282b3 = this.f10397B;
        if (abstractC1282b3 != null) {
            abstractC1282b3.i(new a());
        }
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b
    public AbstractC1282b b() {
        return this.f10397B;
    }

    public void c() {
        this.f10414n.onItemActionRequestChanged(this);
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f10426z & 8) == 0) {
            return false;
        }
        if (this.f10396A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f10398C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f10414n.collapseItemActionView(this);
        }
        return false;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f10398C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f10414n.expandItemActionView(this);
        }
        return false;
    }

    public int f() {
        return this.f10404d;
    }

    char g() {
        return this.f10414n.isQwertyMode() ? this.f10410j : this.f10408h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public View getActionView() {
        View view = this.f10396A;
        if (view != null) {
            return view;
        }
        AbstractC1282b abstractC1282b = this.f10397B;
        if (abstractC1282b == null) {
            return null;
        }
        View c4 = abstractC1282b.c(this);
        this.f10396A = c4;
        return c4;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f10411k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f10410j;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f10418r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f10402b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f10412l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f10413m == 0) {
            return null;
        }
        Drawable b4 = AbstractC2415a.b(this.f10414n.getContext(), this.f10413m);
        this.f10413m = 0;
        this.f10412l = b4;
        return e(b4);
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f10420t;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f10421u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f10407g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f10401a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10400E;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f10409i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f10408h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f10403c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f10415o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f10405e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10406f;
        return charSequence != null ? charSequence : this.f10405e;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f10419s;
    }

    String h() {
        char g4 = g();
        if (g4 == 0) {
            return "";
        }
        Resources resources = this.f10414n.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f10414n.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(e.h.f36354m));
        }
        int i4 = this.f10414n.isQwertyMode() ? this.f10411k : this.f10409i;
        d(sb, i4, 65536, resources.getString(e.h.f36350i));
        d(sb, i4, Base64Utils.IO_BUFFER_SIZE, resources.getString(e.h.f36346e));
        d(sb, i4, 2, resources.getString(e.h.f36345d));
        d(sb, i4, 1, resources.getString(e.h.f36351j));
        d(sb, i4, 4, resources.getString(e.h.f36353l));
        d(sb, i4, 8, resources.getString(e.h.f36349h));
        if (g4 == '\b') {
            sb.append(resources.getString(e.h.f36347f));
        } else if (g4 == '\n') {
            sb.append(resources.getString(e.h.f36348g));
        } else if (g4 != ' ') {
            sb.append(g4);
        } else {
            sb.append(resources.getString(e.h.f36352k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f10415o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f10399D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f10425y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f10425y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f10425y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1282b abstractC1282b = this.f10397B;
        return (abstractC1282b == null || !abstractC1282b.f()) ? (this.f10425y & 8) == 0 : (this.f10425y & 8) == 0 && this.f10397B.b();
    }

    public boolean j() {
        AbstractC1282b abstractC1282b;
        if ((this.f10426z & 8) != 0) {
            if (this.f10396A == null && (abstractC1282b = this.f10397B) != null) {
                this.f10396A = abstractC1282b.c(this);
            }
            if (this.f10396A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f10417q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f10414n;
        if (eVar.dispatchMenuItemSelected(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f10416p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f10407g != null) {
            try {
                this.f10414n.getContext().startActivity(this.f10407g);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
            }
        }
        AbstractC1282b abstractC1282b = this.f10397B;
        return abstractC1282b != null && abstractC1282b.d();
    }

    public boolean l() {
        return (this.f10425y & 32) == 32;
    }

    public boolean m() {
        return (this.f10425y & 4) != 0;
    }

    public boolean n() {
        return (this.f10426z & 1) == 1;
    }

    public boolean o() {
        return (this.f10426z & 2) == 2;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3511b setActionView(int i4) {
        Context context = this.f10414n.getContext();
        setActionView(LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3511b setActionView(View view) {
        int i4;
        this.f10396A = view;
        this.f10397B = null;
        if (view != null && view.getId() == -1 && (i4 = this.f10401a) > 0) {
            view.setId(i4);
        }
        this.f10414n.onItemActionRequestChanged(this);
        return this;
    }

    public void r(boolean z4) {
        this.f10399D = z4;
        this.f10414n.onItemsChanged(false);
    }

    void s(boolean z4) {
        int i4 = this.f10425y;
        int i5 = (z4 ? 2 : 0) | (i4 & (-3));
        this.f10425y = i5;
        if (i4 != i5) {
            this.f10414n.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f10410j == c4) {
            return this;
        }
        this.f10410j = Character.toLowerCase(c4);
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z4) {
        int i4 = this.f10425y;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.f10425y = i5;
        if (i4 != i5) {
            this.f10414n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z4) {
        if ((this.f10425y & 4) != 0) {
            this.f10414n.setExclusiveItemChecked(this);
            return this;
        }
        s(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f10425y |= 16;
        } else {
            this.f10425y &= -17;
        }
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f10413m = 0;
        this.f10412l = drawable;
        this.f10424x = true;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10420t = colorStateList;
        this.f10422v = true;
        this.f10424x = true;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10421u = mode;
        this.f10423w = true;
        this.f10424x = true;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f10407g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        if (this.f10408h == c4) {
            return this;
        }
        this.f10408h = c4;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10398C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10417q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f10408h = c4;
        this.f10410j = Character.toLowerCase(c5);
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f10426z = i4;
        this.f10414n.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f10405e = charSequence;
        this.f10414n.onItemsChanged(false);
        m mVar = this.f10415o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10406f = charSequence;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z4) {
        if (y(z4)) {
            this.f10414n.onItemVisibleChanged(this);
        }
        return this;
    }

    public void t(boolean z4) {
        this.f10425y = (z4 ? 4 : 0) | (this.f10425y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f10405e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z4) {
        if (z4) {
            this.f10425y |= 32;
        } else {
            this.f10425y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f10400E = contextMenuInfo;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3511b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    public void x(m mVar) {
        this.f10415o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z4) {
        int i4 = this.f10425y;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.f10425y = i5;
        return i4 != i5;
    }

    public boolean z() {
        return this.f10414n.getOptionalIconsVisible();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3511b setContentDescription(CharSequence charSequence) {
        this.f10418r = charSequence;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3511b setTooltipText(CharSequence charSequence) {
        this.f10419s = charSequence;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f10410j == c4 && this.f10411k == i4) {
            return this;
        }
        this.f10410j = Character.toLowerCase(c4);
        this.f10411k = KeyEvent.normalizeMetaState(i4);
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f10408h == c4 && this.f10409i == i4) {
            return this;
        }
        this.f10408h = c4;
        this.f10409i = KeyEvent.normalizeMetaState(i4);
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f10408h = c4;
        this.f10409i = KeyEvent.normalizeMetaState(i4);
        this.f10410j = Character.toLowerCase(c5);
        this.f10411k = KeyEvent.normalizeMetaState(i5);
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f10412l = null;
        this.f10413m = i4;
        this.f10424x = true;
        this.f10414n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        return setTitle(this.f10414n.getContext().getString(i4));
    }
}
