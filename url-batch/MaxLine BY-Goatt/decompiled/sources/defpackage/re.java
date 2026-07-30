package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class re extends kr0 implements ve {
    public qf m;

    public re() {
        getSavedStateRegistry().c("androidx:appcompat", new pe(this));
        addOnContextAvailableListener(new qe(this));
    }

    @Override // defpackage.xx, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        qf qfVar = (qf) h();
        qfVar.z();
        ((ViewGroup) qfVar.M.findViewById(R.id.content)).addView(view, layoutParams);
        qfVar.y.a(qfVar.x.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        qf qfVar = (qf) h();
        qfVar.a0 = true;
        int i = qfVar.e0;
        if (i == -100) {
            i = df.n;
        }
        int F = qfVar.F(context, i);
        if (df.f(context)) {
            df.p(context);
        }
        tf1 s = qf.s(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(qf.w(context, F, s, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof n30) {
            try {
                ((n30) context).a(qf.w(context, F, s, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (qf.v0) {
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
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
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
                    jf.a(configuration3, configuration4, configuration);
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
                    if (Build.VERSION.SDK_INT >= 26) {
                        k31.j(configuration3, configuration4, configuration);
                    }
                    int i26 = configuration3.uiMode & 15;
                    int i27 = configuration4.uiMode & 15;
                    if (i26 != i27) {
                        configuration.uiMode |= i27;
                    }
                    int i28 = configuration3.uiMode & 48;
                    int i29 = configuration4.uiMode & 48;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.screenWidthDp;
                    int i31 = configuration4.screenWidthDp;
                    if (i30 != i31) {
                        configuration.screenWidthDp = i31;
                    }
                    int i32 = configuration3.screenHeightDp;
                    int i33 = configuration4.screenHeightDp;
                    if (i32 != i33) {
                        configuration.screenHeightDp = i33;
                    }
                    int i34 = configuration3.smallestScreenWidthDp;
                    int i35 = configuration4.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration.smallestScreenWidthDp = i35;
                    }
                    int i36 = configuration3.densityDpi;
                    int i37 = configuration4.densityDpi;
                    if (i36 != i37) {
                        configuration.densityDpi = i37;
                    }
                }
            }
            Configuration w = qf.w(context, F, s, configuration, true);
            n30 n30Var = new n30(context, com.majelw.libystne.R.style.Theme_AppCompat_Empty);
            n30Var.a(w);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = n30Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        x6.p(theme);
                    } else {
                        synchronized (o70.f) {
                            if (!o70.h) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    o70.g = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                o70.h = true;
                            }
                            Method method = o70.g;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    o70.g = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = n30Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((qf) h()).D();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.wx, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((qf) h()).D();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        qf qfVar = (qf) h();
        qfVar.z();
        return qfVar.x.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        qf qfVar = (qf) h();
        if (qfVar.A == null) {
            qfVar.D();
            w63 w63Var = qfVar.z;
            qfVar.A = new xq2(w63Var != null ? w63Var.b() : qfVar.w);
        }
        return qfVar.A;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = w33.a;
        return super.getResources();
    }

    public final df h() {
        if (this.m == null) {
            cf cfVar = df.m;
            this.m = new qf(this, null, this, this);
        }
        return this.m;
    }

    public final void i() {
        ij2.l(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(com.majelw.libystne.R.id.view_tree_view_model_store_owner, this);
        uj2.d(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(com.majelw.libystne.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        h().d();
    }

    @Override // defpackage.xx, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qf qfVar = (qf) h();
        if (qfVar.R && qfVar.L) {
            qfVar.D();
            w63 w63Var = qfVar.z;
            if (w63Var != null) {
                w63Var.e(w63Var.a.getResources().getBoolean(com.majelw.libystne.R.bool.abc_action_bar_embed_tabs));
            }
        }
        tf a = tf.a();
        Context context = qfVar.w;
        synchronized (a) {
            p92 p92Var = a.a;
            synchronized (p92Var) {
                mg1 mg1Var = (mg1) p92Var.b.get(context);
                if (mg1Var != null) {
                    mg1Var.a();
                }
            }
        }
        qfVar.d0 = new Configuration(qfVar.w.getResources().getConfiguration());
        qfVar.q(false, false);
    }

    @Override // defpackage.kr0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        h().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.kr0, defpackage.xx, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent y;
        if (!super.onMenuItemSelected(i, menuItem)) {
            qf qfVar = (qf) h();
            qfVar.D();
            w63 w63Var = qfVar.z;
            if (menuItem.getItemId() != 16908332 || w63Var == null || (((ky2) w63Var.e).b & 4) == 0 || (y = z71.y(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(y)) {
                navigateUpTo(y);
                return true;
            }
            qt2 qt2Var = new qt2(this);
            Intent y2 = z71.y(this);
            if (y2 == null) {
                y2 = z71.y(this);
            }
            if (y2 != null) {
                ComponentName component = y2.getComponent();
                if (component == null) {
                    component = y2.resolveActivity(qt2Var.n.getPackageManager());
                }
                qt2Var.a(component);
                qt2Var.m.add(y2);
            }
            qt2Var.b();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((qf) h()).z();
    }

    @Override // defpackage.kr0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        qf qfVar = (qf) h();
        qfVar.D();
        w63 w63Var = qfVar.z;
        if (w63Var != null) {
            w63Var.t = true;
        }
    }

    @Override // defpackage.kr0, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((qf) h()).q(true, false);
    }

    @Override // defpackage.kr0, android.app.Activity
    public final void onStop() {
        super.onStop();
        qf qfVar = (qf) h();
        qfVar.D();
        w63 w63Var = qfVar.z;
        if (w63Var != null) {
            w63Var.t = false;
            x53 x53Var = w63Var.s;
            if (x53Var != null) {
                x53Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().o(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((qf) h()).D();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.xx, android.app.Activity
    public final void setContentView(int i) {
        i();
        h().l(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((qf) h()).f0 = i;
    }

    @Override // defpackage.kr0
    public final void supportInvalidateOptionsMenu() {
        h().d();
    }

    @Override // defpackage.xx, android.app.Activity
    public void setContentView(View view) {
        i();
        h().m(view);
    }

    @Override // defpackage.xx, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        h().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
