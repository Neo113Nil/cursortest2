package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1282b;
import java.lang.reflect.Method;
import x.InterfaceMenuItemC3511b;

/* loaded from: classes.dex */
public class c extends j.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuItemC3511b f40834d;

    /* renamed from: e, reason: collision with root package name */
    private Method f40835e;

    private class a extends AbstractC1282b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC1282b.InterfaceC0099b f40836d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f40837e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f40837e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1282b
        public boolean a() {
            return this.f40837e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1282b
        public boolean b() {
            return this.f40837e.isVisible();
        }

        @Override // androidx.core.view.AbstractC1282b
        public View c(MenuItem menuItem) {
            return this.f40837e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1282b
        public boolean d() {
            return this.f40837e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1282b
        public void e(SubMenu subMenu) {
            this.f40837e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC1282b
        public boolean f() {
            return this.f40837e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1282b
        public void i(AbstractC1282b.InterfaceC0099b interfaceC0099b) {
            this.f40836d = interfaceC0099b;
            this.f40837e.setVisibilityListener(interfaceC0099b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z4) {
            AbstractC1282b.InterfaceC0099b interfaceC0099b = this.f40836d;
            if (interfaceC0099b != null) {
                interfaceC0099b.onActionProviderVisibilityChanged(z4);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f40839a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f40839a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f40839a;
        }

        @Override // androidx.appcompat.view.c
        public void b() {
            this.f40839a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f40839a.onActionViewCollapsed();
        }
    }

    /* renamed from: j.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0219c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f40840a;

        MenuItemOnActionExpandListenerC0219c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f40840a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f40840a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f40840a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f40842a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f40842a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f40842a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, InterfaceMenuItemC3511b interfaceMenuItemC3511b) {
        super(context);
        if (interfaceMenuItemC3511b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f40834d = interfaceMenuItemC3511b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f40834d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f40834d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1282b b4 = this.f40834d.b();
        if (b4 instanceof a) {
            return ((a) b4).f40837e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f40834d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f40834d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f40834d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f40834d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f40834d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f40834d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f40834d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f40834d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f40834d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f40834d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f40834d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f40834d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f40834d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f40834d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f40834d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f40834d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f40834d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f40834d.getTooltipText();
    }

    public void h(boolean z4) {
        try {
            if (this.f40835e == null) {
                this.f40835e = this.f40834d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f40835e.invoke(this.f40834d, Boolean.valueOf(z4));
        } catch (Exception e4) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f40834d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f40834d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f40834d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f40834d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f40834d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f40834d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f40831a, actionProvider);
        InterfaceMenuItemC3511b interfaceMenuItemC3511b = this.f40834d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC3511b.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f40834d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f40834d.setAlphabeticShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z4) {
        this.f40834d.setCheckable(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z4) {
        this.f40834d.setChecked(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f40834d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z4) {
        this.f40834d.setEnabled(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f40834d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f40834d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f40834d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f40834d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f40834d.setNumericShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f40834d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0219c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f40834d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f40834d.setShortcut(c4, c5);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
        this.f40834d.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i4) {
        this.f40834d.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f40834d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f40834d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f40834d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z4) {
        return this.f40834d.setVisible(z4);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f40834d.setAlphabeticShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f40834d.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f40834d.setNumericShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f40834d.setShortcut(c4, c5, i4, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f40834d.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i4) {
        this.f40834d.setActionView(i4);
        View actionView = this.f40834d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f40834d.setActionView(new b(actionView));
        }
        return this;
    }
}
