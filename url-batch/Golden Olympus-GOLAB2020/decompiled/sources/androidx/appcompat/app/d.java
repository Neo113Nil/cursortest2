package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.core.app.AbstractC1278b;
import androidx.core.app.C;
import androidx.fragment.app.AbstractActivityC1333h;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import b.InterfaceC1366b;
import h0.AbstractC2438g;
import h0.C2435d;

/* loaded from: classes.dex */
public abstract class d extends AbstractActivityC1333h implements e, C.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements C2435d.c {
        a() {
        }

        @Override // h0.C2435d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.getDelegate().B(bundle);
            return bundle;
        }
    }

    class b implements InterfaceC1366b {
        b() {
        }

        @Override // b.InterfaceC1366b
        public void a(Context context) {
            g delegate = d.this.getDelegate();
            delegate.t();
            delegate.x(d.this.getSavedStateRegistry().b(d.DELEGATE_TAG));
        }
    }

    public d() {
        w();
    }

    private void w() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void x() {
        d0.b(getWindow().getDecorView(), this);
        e0.a(getWindow().getDecorView(), this);
        AbstractC2438g.a(getWindow().getDecorView(), this);
        androidx.activity.B.b(getWindow().getDecorView(), this);
    }

    private boolean y(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1250a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1250a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i4) {
        return (T) getDelegate().j(i4);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.h(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC1251b getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && j0.c()) {
            this.mResources = new j0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC1250a getSupportActionBar() {
        return getDelegate().s();
    }

    @Override // androidx.core.app.C.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.q.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    @Override // androidx.activity.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().w(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C c4) {
        c4.d(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().y();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (y(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    protected void onLocalesChanged(androidx.core.os.i iVar) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        AbstractC1250a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    protected void onNightModeChanged(int i4) {
    }

    @Override // androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().z(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().A();
    }

    public void onPrepareSupportNavigateUpTaskStack(C c4) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().C();
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().D();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C f4 = C.f(this);
        onCreateSupportNavigateUpTaskStack(f4);
        onPrepareSupportNavigateUpTaskStack(f4);
        f4.g();
        try {
            AbstractC1278b.s(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        getDelegate().N(charSequence);
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1250a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.j, android.app.Activity
    public void setContentView(int i4) {
        x();
        getDelegate().H(i4);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().L(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z4) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        super.setTheme(i4);
        getDelegate().M(i4);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().O(aVar);
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h
    public void supportInvalidateOptionsMenu() {
        getDelegate().u();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.q.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().G(i4);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.q.f(this, intent);
    }

    @Override // androidx.activity.j, android.app.Activity
    public void setContentView(View view) {
        x();
        getDelegate().I(view);
    }

    @Override // androidx.activity.j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        getDelegate().J(view, layoutParams);
    }
}
