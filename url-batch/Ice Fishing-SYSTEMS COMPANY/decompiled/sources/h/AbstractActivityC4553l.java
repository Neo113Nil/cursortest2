package h;

import D.AbstractC0290j;
import D.Q;
import D.S;
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
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC0490x;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.AbstractC4614b;
import k.C4616d;
import k.C4621i;
import k.InterfaceC4613a;
import m.C4758s;
import m.I0;
import m.d1;

/* renamed from: h.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4553l extends AbstractActivityC0490x implements InterfaceC4554m, Q, InterfaceC4544c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private q mDelegate;
    private Resources mResources;

    public AbstractActivityC4553l() {
        getSavedStateRegistry().c(DELEGATE_TAG, new C4551j(this));
        addOnContextAvailableListener(new C4552k(this));
    }

    @Override // androidx.activity.p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.x();
        ((ViewGroup) layoutInflaterFactory2C4535B.f37998T.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C4535B.f37977F.a(layoutInflaterFactory2C4535B.f37975E.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.f38011u0 = true;
        int i16 = layoutInflaterFactory2C4535B.f38015y0;
        if (i16 == -100) {
            i16 = q.f38121u;
        }
        int E8 = layoutInflaterFactory2C4535B.E(context, i16);
        if (q.c(context) && q.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (q.f38119B) {
                    try {
                        K.l lVar = q.f38122v;
                        if (lVar == null) {
                            if (q.f38123w == null) {
                                q.f38123w = K.l.a(AbstractC0290j.e(context));
                            }
                            if (!q.f38123w.f1480a.f1481a.isEmpty()) {
                                q.f38122v = q.f38123w;
                            }
                        } else if (!lVar.equals(q.f38123w)) {
                            K.l lVar2 = q.f38122v;
                            q.f38123w = lVar2;
                            AbstractC0290j.d(context, lVar2.f1480a.f1481a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!q.f38125y) {
                q.f38120n.execute(new n(context, i15));
            }
        }
        K.l q6 = LayoutInflaterFactory2C4535B.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C4535B.u(context, E8, q6, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C4616d) {
            try {
                ((C4616d) context).a(LayoutInflaterFactory2C4535B.u(context, E8, q6, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C4535B.f37969P0) {
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
                    float f6 = configuration3.fontScale;
                    float f9 = configuration4.fontScale;
                    if (f6 != f9) {
                        configuration.fontScale = f9;
                    }
                    int i17 = configuration3.mcc;
                    int i18 = configuration4.mcc;
                    if (i17 != i18) {
                        configuration.mcc = i18;
                    }
                    int i19 = configuration3.mnc;
                    int i20 = configuration4.mnc;
                    if (i19 != i20) {
                        configuration.mnc = i20;
                    }
                    int i21 = Build.VERSION.SDK_INT;
                    v.a(configuration3, configuration4, configuration);
                    int i22 = configuration3.touchscreen;
                    int i23 = configuration4.touchscreen;
                    if (i22 != i23) {
                        configuration.touchscreen = i23;
                    }
                    int i24 = configuration3.keyboard;
                    int i25 = configuration4.keyboard;
                    if (i24 != i25) {
                        configuration.keyboard = i25;
                    }
                    int i26 = configuration3.keyboardHidden;
                    int i27 = configuration4.keyboardHidden;
                    if (i26 != i27) {
                        configuration.keyboardHidden = i27;
                    }
                    int i28 = configuration3.navigation;
                    int i29 = configuration4.navigation;
                    if (i28 != i29) {
                        configuration.navigation = i29;
                    }
                    int i30 = configuration3.navigationHidden;
                    int i31 = configuration4.navigationHidden;
                    if (i30 != i31) {
                        configuration.navigationHidden = i31;
                    }
                    int i32 = configuration3.orientation;
                    int i33 = configuration4.orientation;
                    if (i32 != i33) {
                        configuration.orientation = i33;
                    }
                    int i34 = configuration3.screenLayout & 15;
                    int i35 = configuration4.screenLayout & 15;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    int i36 = configuration3.screenLayout & 192;
                    int i37 = configuration4.screenLayout & 192;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 48;
                    int i39 = configuration4.screenLayout & 48;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 768;
                    int i41 = configuration4.screenLayout & 768;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    if (i21 >= 26) {
                        i = configuration3.colorMode;
                        int i42 = i & 3;
                        i4 = configuration4.colorMode;
                        if (i42 != (i4 & 3)) {
                            i13 = configuration.colorMode;
                            i14 = configuration4.colorMode;
                            configuration.colorMode = i13 | (i14 & 3);
                        }
                        i9 = configuration3.colorMode;
                        int i43 = i9 & 12;
                        i10 = configuration4.colorMode;
                        if (i43 != (i10 & 12)) {
                            i11 = configuration.colorMode;
                            i12 = configuration4.colorMode;
                            configuration.colorMode = i11 | (i12 & 12);
                        }
                    }
                    int i44 = configuration3.uiMode & 15;
                    int i45 = configuration4.uiMode & 15;
                    if (i44 != i45) {
                        configuration.uiMode |= i45;
                    }
                    int i46 = configuration3.uiMode & 48;
                    int i47 = configuration4.uiMode & 48;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.screenWidthDp;
                    int i49 = configuration4.screenWidthDp;
                    if (i48 != i49) {
                        configuration.screenWidthDp = i49;
                    }
                    int i50 = configuration3.screenHeightDp;
                    int i51 = configuration4.screenHeightDp;
                    if (i50 != i51) {
                        configuration.screenHeightDp = i51;
                    }
                    int i52 = configuration3.smallestScreenWidthDp;
                    int i53 = configuration4.smallestScreenWidthDp;
                    if (i52 != i53) {
                        configuration.smallestScreenWidthDp = i53;
                    }
                    int i54 = configuration3.densityDpi;
                    int i55 = configuration4.densityDpi;
                    if (i54 != i55) {
                        configuration.densityDpi = i55;
                    }
                }
            }
            Configuration u7 = LayoutInflaterFactory2C4535B.u(context, E8, q6, configuration, true);
            C4616d c4616d = new C4616d(context, C5284R.style.Theme_AppCompat_Empty);
            c4616d.a(u7);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c4616d.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        F.n.a(theme);
                    } else {
                        synchronized (F.b.f903e) {
                            if (!F.b.f905g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    F.b.f904f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e6) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e6);
                                }
                                F.b.f905g = true;
                            }
                            Method method = F.b.f904f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e9) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                                    F.b.f904f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c4616d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC4542a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // D.AbstractActivityC0294n, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC4542a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.x();
        return (T) layoutInflaterFactory2C4535B.f37975E.findViewById(i);
    }

    public q getDelegate() {
        if (this.mDelegate == null) {
            T0.l lVar = q.f38120n;
            this.mDelegate = new LayoutInflaterFactory2C4535B(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Override // h.InterfaceC4544c
    public InterfaceC4543b getDrawerToggleDelegate() {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.getClass();
        return new h4.c(28, layoutInflaterFactory2C4535B);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        if (layoutInflaterFactory2C4535B.f37983I == null) {
            layoutInflaterFactory2C4535B.C();
            AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
            layoutInflaterFactory2C4535B.f37983I = new C4621i(abstractC4542a != null ? abstractC4542a.e() : layoutInflaterFactory2C4535B.f37973D);
        }
        return layoutInflaterFactory2C4535B.f37983I;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = d1.f39401a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC4542a getSupportActionBar() {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.C();
        return layoutInflaterFactory2C4535B.f37981H;
    }

    @Override // D.Q
    public Intent getSupportParentActivityIntent() {
        return AbstractC0290j.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // androidx.activity.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        if (layoutInflaterFactory2C4535B.Y && layoutInflaterFactory2C4535B.f37997S) {
            layoutInflaterFactory2C4535B.C();
            AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
            if (abstractC4542a != null) {
                abstractC4542a.g();
            }
        }
        C4758s a9 = C4758s.a();
        Context context = layoutInflaterFactory2C4535B.f37973D;
        synchronized (a9) {
            I0 i02 = a9.f39494a;
            synchronized (i02) {
                s.e eVar = (s.e) i02.f39283b.get(context);
                if (eVar != null) {
                    eVar.h();
                }
            }
        }
        layoutInflaterFactory2C4535B.f38014x0 = new Configuration(layoutInflaterFactory2C4535B.f37973D.getResources().getConfiguration());
        layoutInflaterFactory2C4535B.n(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(S s3) {
        s3.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC0290j.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC4553l abstractActivityC4553l = s3.f519u;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC4553l.getPackageManager());
            }
            ArrayList arrayList = s3.f518n;
            int size = arrayList.size();
            try {
                for (Intent b9 = AbstractC0290j.b(abstractActivityC4553l, component); b9 != null; b9 = AbstractC0290j.b(abstractActivityC4553l, b9.getComponent())) {
                    arrayList.add(size, b9);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e6);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC4542a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C4535B) getDelegate()).x();
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.C();
        AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
        if (abstractC4542a != null) {
            abstractC4542a.q(true);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C4535B) getDelegate()).n(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        layoutInflaterFactory2C4535B.C();
        AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
        if (abstractC4542a != null) {
            abstractC4542a.q(false);
        }
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
        S s3 = new S(this);
        onCreateSupportNavigateUpTaskStack(s3);
        onPrepareSupportNavigateUpTaskStack(s3);
        ArrayList arrayList = s3.f518n;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        s3.f519u.startActivities(intentArr, null);
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
        getDelegate().l(charSequence);
    }

    @Override // h.InterfaceC4554m
    public AbstractC4614b onWindowStartingSupportActionMode(InterfaceC4613a interfaceC4613a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC4542a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().h(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) getDelegate();
        if (layoutInflaterFactory2C4535B.f37972C instanceof Activity) {
            layoutInflaterFactory2C4535B.C();
            AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
            if (abstractC4542a instanceof M) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C4535B.f37983I = null;
            if (abstractC4542a != null) {
                abstractC4542a.h();
            }
            layoutInflaterFactory2C4535B.f37981H = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C4535B.f37972C;
                C4541H c4541h = new C4541H(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C4535B.J, layoutInflaterFactory2C4535B.f37977F);
                layoutInflaterFactory2C4535B.f37981H = c4541h;
                layoutInflaterFactory2C4535B.f37977F.f38133u = c4541h.f38033c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C4535B.f37977F.f38133u = null;
            }
            layoutInflaterFactory2C4535B.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C4535B) getDelegate()).f38016z0 = i;
    }

    public AbstractC4614b startSupportActionMode(InterfaceC4613a interfaceC4613a) {
        return getDelegate().m(interfaceC4613a);
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

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().i(view);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().k(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(K.l lVar) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(S s3) {
    }

    @Override // h.InterfaceC4554m
    public void onSupportActionModeFinished(AbstractC4614b abstractC4614b) {
    }

    @Override // h.InterfaceC4554m
    public void onSupportActionModeStarted(AbstractC4614b abstractC4614b) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z8) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z8) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z8) {
    }
}
