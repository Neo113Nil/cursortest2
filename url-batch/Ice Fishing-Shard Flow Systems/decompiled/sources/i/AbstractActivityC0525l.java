package i;

import a.AbstractC0169a;
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
import androidx.fragment.app.AbstractActivityC0233y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0646b;
import l.C0649e;
import l.InterfaceC0645a;
import n.C0733s;
import n.Q0;
import n.x1;
import u.C0936g;

/* renamed from: i.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0525l extends AbstractActivityC0233y implements InterfaceC0526m, y.w {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0529p mDelegate;
    private Resources mResources;

    @Override // d.o, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        layoutInflaterFactory2C0500B.x();
        ((ViewGroup) layoutInflaterFactory2C0500B.f5313I.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0500B.f5348u.a(layoutInflaterFactory2C0500B.f5347t.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i2;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        layoutInflaterFactory2C0500B.f5326W = true;
        int i13 = layoutInflaterFactory2C0500B.f5330a0;
        if (i13 == -100) {
            i13 = AbstractC0529p.f5471e;
        }
        int D7 = layoutInflaterFactory2C0500B.D(context, i13);
        int i14 = 3;
        if (AbstractC0529p.c(context) && AbstractC0529p.c(context)) {
            if (!E.c.b()) {
                synchronized (AbstractC0529p.f5478q) {
                    try {
                        E.f fVar = AbstractC0529p.f5472i;
                        if (fVar == null) {
                            if (AbstractC0529p.f5473l == null) {
                                AbstractC0529p.f5473l = E.f.a(AbstractC0169a.z(context));
                            }
                            if (!AbstractC0529p.f5473l.f654a.f655a.isEmpty()) {
                                AbstractC0529p.f5472i = AbstractC0529p.f5473l;
                            }
                        } else if (!fVar.equals(AbstractC0529p.f5473l)) {
                            E.f fVar2 = AbstractC0529p.f5472i;
                            AbstractC0529p.f5473l = fVar2;
                            AbstractC0169a.v(context, fVar2.f654a.f655a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0529p.f5475n) {
                AbstractC0529p.f5470d.execute(new e0.f(context, i14));
            }
        }
        E.f q4 = LayoutInflaterFactory2C0500B.q(context);
        if (LayoutInflaterFactory2C0500B.f5304s0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0500B.u(context, D7, q4, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0649e) {
            try {
                ((C0649e) context).a(LayoutInflaterFactory2C0500B.u(context, D7, q4, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0500B.r0) {
            int i15 = Build.VERSION.SDK_INT;
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
                    float f7 = configuration3.fontScale;
                    float f8 = configuration4.fontScale;
                    if (f7 != f8) {
                        configuration.fontScale = f8;
                    }
                    int i16 = configuration3.mcc;
                    int i17 = configuration4.mcc;
                    if (i16 != i17) {
                        configuration.mcc = i17;
                    }
                    int i18 = configuration3.mnc;
                    int i19 = configuration4.mnc;
                    if (i18 != i19) {
                        configuration.mnc = i19;
                    }
                    AbstractC0534u.a(configuration3, configuration4, configuration);
                    int i20 = configuration3.touchscreen;
                    int i21 = configuration4.touchscreen;
                    if (i20 != i21) {
                        configuration.touchscreen = i21;
                    }
                    int i22 = configuration3.keyboard;
                    int i23 = configuration4.keyboard;
                    if (i22 != i23) {
                        configuration.keyboard = i23;
                    }
                    int i24 = configuration3.keyboardHidden;
                    int i25 = configuration4.keyboardHidden;
                    if (i24 != i25) {
                        configuration.keyboardHidden = i25;
                    }
                    int i26 = configuration3.navigation;
                    int i27 = configuration4.navigation;
                    if (i26 != i27) {
                        configuration.navigation = i27;
                    }
                    int i28 = configuration3.navigationHidden;
                    int i29 = configuration4.navigationHidden;
                    if (i28 != i29) {
                        configuration.navigationHidden = i29;
                    }
                    int i30 = configuration3.orientation;
                    int i31 = configuration4.orientation;
                    if (i30 != i31) {
                        configuration.orientation = i31;
                    }
                    int i32 = configuration3.screenLayout & 15;
                    int i33 = configuration4.screenLayout & 15;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    int i34 = configuration3.screenLayout & 192;
                    int i35 = configuration4.screenLayout & 192;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    int i36 = configuration3.screenLayout & 48;
                    int i37 = configuration4.screenLayout & 48;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 768;
                    int i39 = configuration4.screenLayout & 768;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    if (i15 >= 26) {
                        i2 = configuration3.colorMode;
                        int i40 = i2 & 3;
                        i5 = configuration4.colorMode;
                        if (i40 != (i5 & 3)) {
                            i11 = configuration.colorMode;
                            i12 = configuration4.colorMode;
                            configuration.colorMode = (3 & i12) | i11;
                        }
                        i7 = configuration3.colorMode;
                        int i41 = i7 & 12;
                        i8 = configuration4.colorMode;
                        if (i41 != (i8 & 12)) {
                            i9 = configuration.colorMode;
                            i10 = configuration4.colorMode;
                            configuration.colorMode = i9 | (i10 & 12);
                        }
                    }
                    int i42 = configuration3.uiMode & 15;
                    int i43 = configuration4.uiMode & 15;
                    if (i42 != i43) {
                        configuration.uiMode |= i43;
                    }
                    int i44 = configuration3.uiMode & 48;
                    int i45 = configuration4.uiMode & 48;
                    if (i44 != i45) {
                        configuration.uiMode |= i45;
                    }
                    int i46 = configuration3.screenWidthDp;
                    int i47 = configuration4.screenWidthDp;
                    if (i46 != i47) {
                        configuration.screenWidthDp = i47;
                    }
                    int i48 = configuration3.screenHeightDp;
                    int i49 = configuration4.screenHeightDp;
                    if (i48 != i49) {
                        configuration.screenHeightDp = i49;
                    }
                    int i50 = configuration3.smallestScreenWidthDp;
                    int i51 = configuration4.smallestScreenWidthDp;
                    if (i50 != i51) {
                        configuration.smallestScreenWidthDp = i51;
                    }
                    int i52 = configuration3.densityDpi;
                    int i53 = configuration4.densityDpi;
                    if (i52 != i53) {
                        configuration.densityDpi = i53;
                    }
                }
            }
            Configuration u7 = LayoutInflaterFactory2C0500B.u(context, D7, q4, configuration, true);
            C0649e c0649e = new C0649e(context, com.icefishing.icefish.ice.fishing.s294s.R.style.Theme_AppCompat_Empty);
            c0649e.a(u7);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0649e.getTheme();
                    if (i15 >= 29) {
                        A.l.a(theme);
                    } else {
                        synchronized (A.b.f10e) {
                            if (!A.b.f12g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    A.b.f11f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e7) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                                }
                                A.b.f12g = true;
                            }
                            Method method = A.b.f11f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e8) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                                    A.b.f11f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0649e;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0514a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // y.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0514a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.l(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(com.icefishing.icefish.ice.fishing.s294s.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(com.icefishing.icefish.ice.fishing.s294s.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(com.icefishing.icefish.ice.fishing.s294s.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(com.icefishing.icefish.ice.fishing.s294s.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        layoutInflaterFactory2C0500B.x();
        return (T) layoutInflaterFactory2C0500B.f5347t.findViewById(i2);
    }

    public AbstractC0529p getDelegate() {
        if (this.mDelegate == null) {
            Q0.m mVar = AbstractC0529p.f5470d;
            this.mDelegate = new LayoutInflaterFactory2C0500B(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0515b getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0500B) getDelegate()).getClass();
        return new q1.h(20);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        if (layoutInflaterFactory2C0500B.f5351x == null) {
            layoutInflaterFactory2C0500B.B();
            AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
            layoutInflaterFactory2C0500B.f5351x = new l.j(abstractC0514a != null ? abstractC0514a.e() : layoutInflaterFactory2C0500B.f5346s);
        }
        return layoutInflaterFactory2C0500B.f5351x;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i2 = x1.f6951a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0514a getSupportActionBar() {
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        layoutInflaterFactory2C0500B.B();
        return layoutInflaterFactory2C0500B.f5350w;
    }

    @Override // y.w
    public Intent getSupportParentActivityIntent() {
        return d4.c.r(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // d.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        if (layoutInflaterFactory2C0500B.f5318N && layoutInflaterFactory2C0500B.f5312H) {
            layoutInflaterFactory2C0500B.B();
            AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
            if (abstractC0514a != null) {
                abstractC0514a.i();
            }
        }
        C0733s a7 = C0733s.a();
        Context context = layoutInflaterFactory2C0500B.f5346s;
        synchronized (a7) {
            Q0 q02 = a7.f6881a;
            synchronized (q02) {
                C0936g c0936g = (C0936g) q02.f6694b.get(context);
                if (c0936g != null) {
                    int i2 = c0936g.f8034l;
                    Object[] objArr = c0936g.f8033i;
                    for (int i5 = 0; i5 < i2; i5++) {
                        objArr[i5] = null;
                    }
                    c0936g.f8034l = 0;
                    c0936g.f8031d = false;
                }
            }
        }
        layoutInflaterFactory2C0500B.f5329Z = new Configuration(layoutInflaterFactory2C0500B.f5346s.getResources().getConfiguration());
        layoutInflaterFactory2C0500B.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(y.x xVar) {
        ArrayList arrayList = xVar.f8523d;
        AbstractActivityC0525l abstractActivityC0525l = xVar.f8524e;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = d4.c.r(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC0525l.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent s7 = d4.c.s(abstractActivityC0525l, component); s7 != null; s7 = d4.c.s(abstractActivityC0525l, s7.getComponent())) {
                    arrayList.add(size, s7);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e7);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0233y, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC0233y, d.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        AbstractC0514a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // d.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0500B) getDelegate()).x();
    }

    @Override // androidx.fragment.app.AbstractActivityC0233y, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        layoutInflaterFactory2C0500B.B();
        AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
        if (abstractC0514a != null) {
            abstractC0514a.q(true);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0233y, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0500B) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC0233y, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        layoutInflaterFactory2C0500B.B();
        AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
        if (abstractC0514a != null) {
            abstractC0514a.q(false);
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
        y.x xVar = new y.x(this);
        onCreateSupportNavigateUpTaskStack(xVar);
        onPrepareSupportNavigateUpTaskStack(xVar);
        ArrayList arrayList = xVar.f8523d;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        xVar.f8524e.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        getDelegate().m(charSequence);
    }

    @Override // i.InterfaceC0526m
    public AbstractC0646b onWindowStartingSupportActionMode(InterfaceC0645a interfaceC0645a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0514a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.m()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // d.o, android.app.Activity
    public void setContentView(int i2) {
        e();
        getDelegate().i(i2);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) getDelegate();
        if (layoutInflaterFactory2C0500B.f5345r instanceof Activity) {
            layoutInflaterFactory2C0500B.B();
            AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
            if (abstractC0514a instanceof C0513O) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0500B.f5351x = null;
            if (abstractC0514a != null) {
                abstractC0514a.j();
            }
            layoutInflaterFactory2C0500B.f5350w = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0500B.f5345r;
                C0508J c0508j = new C0508J(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0500B.f5352y, layoutInflaterFactory2C0500B.f5348u);
                layoutInflaterFactory2C0500B.f5350w = c0508j;
                layoutInflaterFactory2C0500B.f5348u.f5485e = c0508j.f5371c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0500B.f5348u.f5485e = null;
            }
            layoutInflaterFactory2C0500B.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        ((LayoutInflaterFactory2C0500B) getDelegate()).f5331b0 = i2;
    }

    public AbstractC0646b startSupportActionMode(InterfaceC0645a interfaceC0645a) {
        return getDelegate().n(interfaceC0645a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i2) {
        return getDelegate().h(i2);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // d.o, android.app.Activity
    public void setContentView(View view) {
        e();
        getDelegate().k(view);
    }

    @Override // d.o, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        getDelegate().l(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(E.f fVar) {
    }

    public void onNightModeChanged(int i2) {
    }

    public void onPrepareSupportNavigateUpTaskStack(y.x xVar) {
    }

    @Override // i.InterfaceC0526m
    public void onSupportActionModeFinished(AbstractC0646b abstractC0646b) {
    }

    @Override // i.InterfaceC0526m
    public void onSupportActionModeStarted(AbstractC0646b abstractC0646b) {
    }

    @Deprecated
    public void setSupportProgress(int i2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z7) {
    }
}
