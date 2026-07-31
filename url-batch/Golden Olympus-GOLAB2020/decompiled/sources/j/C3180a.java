package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1282b;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import x.InterfaceMenuItemC3511b;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3180a implements InterfaceMenuItemC3511b {

    /* renamed from: a, reason: collision with root package name */
    private final int f40811a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40812b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40813c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f40814d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f40815e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f40816f;

    /* renamed from: g, reason: collision with root package name */
    private char f40817g;

    /* renamed from: i, reason: collision with root package name */
    private char f40819i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f40821k;

    /* renamed from: l, reason: collision with root package name */
    private Context f40822l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f40823m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f40824n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f40825o;

    /* renamed from: h, reason: collision with root package name */
    private int f40818h = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: j, reason: collision with root package name */
    private int f40820j = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f40826p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f40827q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f40828r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f40829s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f40830t = 16;

    public C3180a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f40822l = context;
        this.f40811a = i5;
        this.f40812b = i4;
        this.f40813c = i7;
        this.f40814d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f40821k;
        if (drawable != null) {
            if (this.f40828r || this.f40829s) {
                Drawable l4 = androidx.core.graphics.drawable.a.l(drawable);
                this.f40821k = l4;
                Drawable mutate = l4.mutate();
                this.f40821k = mutate;
                if (this.f40828r) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f40826p);
                }
                if (this.f40829s) {
                    androidx.core.graphics.drawable.a.j(this.f40821k, this.f40827q);
                }
            }
        }
    }

    @Override // x.InterfaceMenuItemC3511b
    public InterfaceMenuItemC3511b a(AbstractC1282b abstractC1282b) {
        throw new UnsupportedOperationException();
    }

    @Override // x.InterfaceMenuItemC3511b
    public AbstractC1282b b() {
        return null;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3511b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3511b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3511b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f40820j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f40819i;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f40824n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f40812b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f40821k;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f40826p;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f40827q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f40816f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f40811a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f40818h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f40817g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f40813c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f40814d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f40815e;
        return charSequence != null ? charSequence : this.f40814d;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f40825o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f40830t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f40830t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f40830t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f40830t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f40819i = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z4) {
        this.f40830t = (z4 ? 1 : 0) | (this.f40830t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z4) {
        this.f40830t = (z4 ? 2 : 0) | (this.f40830t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z4) {
        this.f40830t = (z4 ? 16 : 0) | (this.f40830t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f40821k = drawable;
        c();
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f40826p = colorStateList;
        this.f40828r = true;
        c();
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f40827q = mode;
        this.f40829s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f40816f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f40817g = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f40823m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f40817g = c4;
        this.f40819i = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f40814d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f40815e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z4) {
        this.f40830t = (this.f40830t & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f40819i = Character.toLowerCase(c4);
        this.f40820j = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3511b setContentDescription(CharSequence charSequence) {
        this.f40824n = charSequence;
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f40817g = c4;
        this.f40818h = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f40814d = this.f40822l.getResources().getString(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3511b setTooltipText(CharSequence charSequence) {
        this.f40825o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f40821k = androidx.core.content.a.g(this.f40822l, i4);
        c();
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f40817g = c4;
        this.f40818h = KeyEvent.normalizeMetaState(i4);
        this.f40819i = Character.toLowerCase(c5);
        this.f40820j = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // x.InterfaceMenuItemC3511b, android.view.MenuItem
    public void setShowAsAction(int i4) {
    }
}
