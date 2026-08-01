package g;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC0064v;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.C0292v;
import l.N0;
import l.f1;

/* renamed from: g.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0159k extends AbstractActivityC0064v implements InterfaceC0160l, z.p {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private q mDelegate;
    private Resources mResources;

    public AbstractActivityC0159k() {
        getSavedStateRegistry().c(DELEGATE_TAG, new C0157i(this));
        addOnContextAvailableListener(new C0158j(this));
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        layoutInflaterFactory2C0142C.x();
        ((ViewGroup) layoutInflaterFactory2C0142C.f2438A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0142C.f2473m.a(layoutInflaterFactory2C0142C.f2472l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        layoutInflaterFactory2C0142C.f2451O = true;
        int i = layoutInflaterFactory2C0142C.f2455S;
        if (i == -100) {
            i = q.f2588b;
        }
        int D2 = layoutInflaterFactory2C0142C.D(context, i);
        if (q.c(context) && q.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (q.i) {
                    try {
                        G.g gVar = q.f2589c;
                        if (gVar == null) {
                            if (q.f2590d == null) {
                                q.f2590d = G.g.a(z.f.e(context));
                            }
                            if (!q.f2590d.f201a.f202a.isEmpty()) {
                                q.f2589c = q.f2590d;
                            }
                        } else if (!gVar.equals(q.f2590d)) {
                            G.g gVar2 = q.f2589c;
                            q.f2590d = gVar2;
                            z.f.d(gVar2.f201a.f202a.toLanguageTags(), context);
                        }
                    } finally {
                    }
                }
            } else if (!q.f2592f) {
                q.f2587a.execute(new c0.f(context, 2));
            }
        }
        G.g o2 = LayoutInflaterFactory2C0142C.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0142C.u(context, D2, o2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof j.d) {
            try {
                ((j.d) context).a(LayoutInflaterFactory2C0142C.u(context, D2, o2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0142C.f2437j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    v.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration u2 = LayoutInflaterFactory2C0142C.u(context, D2, o2, configuration, true);
            j.d dVar = new j.d(context, com.luckyarcade.spinthrow.R.style.Theme_AppCompat_Empty);
            dVar.a(u2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = dVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        B.q.a(theme);
                    } else {
                        synchronized (B.b.f16e) {
                            if (!B.b.f18g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    B.b.f17f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                B.b.f18g = true;
                            }
                            Method method = B.b.f17f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    B.b.f17f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0149a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // z.j, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0149a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        androidx.lifecycle.J.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        X0.f.e(decorView, "<this>");
        decorView.setTag(com.luckyarcade.spinthrow.R.id.view_tree_view_model_store_owner, this);
        q1.l.j0(getWindow().getDecorView(), this);
        q1.l.i0(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        layoutInflaterFactory2C0142C.x();
        return (T) layoutInflaterFactory2C0142C.f2472l.findViewById(i);
    }

    public q getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC0163o executorC0163o = q.f2587a;
            this.mDelegate = new LayoutInflaterFactory2C0142C(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0150b getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0142C) getDelegate()).getClass();
        return new H0.e(23);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        if (layoutInflaterFactory2C0142C.f2476p == null) {
            layoutInflaterFactory2C0142C.B();
            AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
            layoutInflaterFactory2C0142C.f2476p = new j.i(abstractC0149a != null ? abstractC0149a.e() : layoutInflaterFactory2C0142C.f2471k);
        }
        return layoutInflaterFactory2C0142C.f2476p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = f1.f3365a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0149a getSupportActionBar() {
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        layoutInflaterFactory2C0142C.B();
        return layoutInflaterFactory2C0142C.f2475o;
    }

    @Override // z.p
    public Intent getSupportParentActivityIntent() {
        return z.f.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // a.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        if (layoutInflaterFactory2C0142C.F && layoutInflaterFactory2C0142C.f2486z) {
            layoutInflaterFactory2C0142C.B();
            AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
            if (abstractC0149a != null) {
                abstractC0149a.g();
            }
        }
        C0292v a2 = C0292v.a();
        Context context = layoutInflaterFactory2C0142C.f2471k;
        synchronized (a2) {
            N0 n02 = a2.f3470a;
            synchronized (n02) {
                o.e eVar = (o.e) n02.f3277b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        layoutInflaterFactory2C0142C.f2454R = new Configuration(layoutInflaterFactory2C0142C.f2471k.getResources().getConfiguration());
        layoutInflaterFactory2C0142C.m(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(z.q qVar) {
        qVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = z.f.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC0159k abstractActivityC0159k = qVar.f4638b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC0159k.getPackageManager());
            }
            ArrayList arrayList = qVar.f4637a;
            int size = arrayList.size();
            try {
                for (Intent b2 = z.f.b(abstractActivityC0159k, component); b2 != null; b2 = z.f.b(abstractActivityC0159k, b2.getComponent())) {
                    arrayList.add(size, b2);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e2);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(G.g gVar) {
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0149a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // a.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0142C) getDelegate()).x();
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        layoutInflaterFactory2C0142C.B();
        AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
        if (abstractC0149a != null) {
            abstractC0149a.m(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(z.q qVar) {
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0142C) getDelegate()).m(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        layoutInflaterFactory2C0142C.B();
        AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
        if (abstractC0149a != null) {
            abstractC0149a.m(false);
        }
    }

    @Override // g.InterfaceC0160l
    public void onSupportActionModeFinished(AbstractC0170b abstractC0170b) {
    }

    @Override // g.InterfaceC0160l
    public void onSupportActionModeStarted(AbstractC0170b abstractC0170b) {
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
        z.q qVar = new z.q(this);
        onCreateSupportNavigateUpTaskStack(qVar);
        onPrepareSupportNavigateUpTaskStack(qVar);
        ArrayList arrayList = qVar.f4637a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        qVar.f4638b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().k(charSequence);
    }

    @Override // g.InterfaceC0160l
    public AbstractC0170b onWindowStartingSupportActionMode(InterfaceC0169a interfaceC0169a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0149a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // a.p, android.app.Activity
    public void setContentView(int i) {
        e();
        getDelegate().h(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) getDelegate();
        if (layoutInflaterFactory2C0142C.f2470j instanceof Activity) {
            layoutInflaterFactory2C0142C.B();
            AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
            if (abstractC0149a instanceof O) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0142C.f2476p = null;
            if (abstractC0149a != null) {
                abstractC0149a.h();
            }
            layoutInflaterFactory2C0142C.f2475o = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0142C.f2470j;
                J j2 = new J(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0142C.f2477q, layoutInflaterFactory2C0142C.f2473m);
                layoutInflaterFactory2C0142C.f2475o = j2;
                layoutInflaterFactory2C0142C.f2473m.f2601b = j2.f2503c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0142C.f2473m.f2601b = null;
            }
            layoutInflaterFactory2C0142C.b();
        }
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z2) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z2) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0142C) getDelegate()).f2456T = i;
    }

    public AbstractC0170b startSupportActionMode(InterfaceC0169a interfaceC0169a) {
        return getDelegate().l(interfaceC0169a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().g(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // a.p, android.app.Activity
    public void setContentView(View view) {
        e();
        getDelegate().i(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        getDelegate().j(view, layoutParams);
    }
}
