package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.menu.h;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MenuItemWrapperJB.java */
/* loaded from: classes.dex */
class i extends h {
    i(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }

    @Override // android.support.v7.view.menu.h
    h.a a(ActionProvider actionProvider) {
        return new a(this.f1753a, actionProvider);
    }

    /* compiled from: MenuItemWrapperJB.java */
    class a extends h.a implements ActionProvider.VisibilityListener {

        /* renamed from: c, reason: collision with root package name */
        ActionProvider.VisibilityListener f1791c;

        public a(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.v4.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            return this.f1786a.onCreateActionView(menuItem);
        }

        @Override // android.support.v4.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.f1786a.overridesItemVisibility();
        }

        @Override // android.support.v4.view.ActionProvider
        public boolean isVisible() {
            return this.f1786a.isVisible();
        }

        @Override // android.support.v4.view.ActionProvider
        public void refreshVisibility() {
            this.f1786a.refreshVisibility();
        }

        @Override // android.support.v4.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            this.f1791c = visibilityListener;
            this.f1786a.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f1791c != null) {
                this.f1791c.onActionProviderVisibilityChanged(z);
            }
        }
    }
}
