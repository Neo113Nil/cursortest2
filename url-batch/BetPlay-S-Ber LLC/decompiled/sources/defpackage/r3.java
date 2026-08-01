package defpackage;

import android.R;
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
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class r3 extends k implements v3 {
    public t4 E;

    public r3() {
        this.i.b.c("androidx:appcompat", new p3(this));
        n(new q3(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        t4 t4Var = (t4) q();
        t4Var.v();
        ((ViewGroup) t4Var.G.findViewById(R.id.content)).addView(view, layoutParams);
        t4Var.r.a(t4Var.q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        t4 t4Var = (t4) q();
        t4Var.U = true;
        int i = t4Var.Y;
        if (i == -100) {
            i = f4.g;
        }
        int B = t4Var.B(context, i);
        if (f4.b(context) && f4.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (f4.n) {
                    try {
                        sr srVar = f4.h;
                        if (srVar == null) {
                            if (f4.i == null) {
                                f4.i = sr.a(vw.c0(context));
                            }
                            if (!f4.i.a.a.isEmpty()) {
                                f4.h = f4.i;
                            }
                        } else if (!srVar.equals(f4.i)) {
                            sr srVar2 = f4.h;
                            f4.i = srVar2;
                            vw.b0(context, srVar2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!f4.k) {
                f4.f.execute(new z3(context, 0));
            }
        }
        sr o = t4.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(t4.s(context, B, o, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof od) {
            try {
                ((od) context).a(t4.s(context, B, o, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (t4.p0) {
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
                    k4.a(configuration3, configuration4, configuration);
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
            Configuration s = t4.s(context, B, o, configuration, true);
            od odVar = new od(context, com.awerser.monnit.betplay.R.style.Theme_AppCompat_Empty);
            odVar.a(s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = odVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        u6.c(theme);
                    } else {
                        synchronized (l70.g) {
                            if (!l70.i) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    l70.h = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                l70.i = true;
                            }
                            Method method = l70.h;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    l70.h = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = odVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((t4) q()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.zb, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((t4) q()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        t4 t4Var = (t4) q();
        t4Var.v();
        return t4Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        t4 t4Var = (t4) q();
        if (t4Var.u == null) {
            t4Var.z();
            xa0 xa0Var = t4Var.t;
            t4Var.u = new a50(xa0Var != null ? xa0Var.b() : t4Var.p);
        }
        return t4Var.u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = j80.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        t4 t4Var = (t4) q();
        if (t4Var.t != null) {
            t4Var.z();
            t4Var.t.getClass();
            t4Var.A(0);
        }
    }

    @Override // defpackage.ac, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t4 t4Var = (t4) q();
        if (t4Var.L && t4Var.F) {
            t4Var.z();
            xa0 xa0Var = t4Var.t;
            if (xa0Var != null) {
                xa0Var.e(xa0Var.a.getResources().getBoolean(com.awerser.monnit.betplay.R.bool.abc_action_bar_embed_tabs));
            }
        }
        y4 a = y4.a();
        Context context = t4Var.p;
        synchronized (a) {
            s00 s00Var = a.a;
            synchronized (s00Var) {
                vr vrVar = (vr) s00Var.b.get(context);
                if (vrVar != null) {
                    vrVar.a();
                }
            }
        }
        t4Var.X = new Configuration(t4Var.p.getResources().getConfiguration());
        t4Var.l(false, false);
    }

    @Override // androidx.fragment.app.k, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        q().d();
    }

    @Override // androidx.fragment.app.k, defpackage.ac, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent q;
        if (!super.onMenuItemSelected(i, menuItem)) {
            t4 t4Var = (t4) q();
            t4Var.z();
            xa0 xa0Var = t4Var.t;
            if (menuItem.getItemId() != 16908332 || xa0Var == null || (((q60) xa0Var.e).b & 4) == 0 || (q = l70.q(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(q)) {
                navigateUpTo(q);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent q2 = l70.q(this);
            if (q2 == null) {
                q2 = l70.q(this);
            }
            if (q2 != null) {
                ComponentName component = q2.getComponent();
                if (component == null) {
                    component = q2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent r = l70.r(this, component);
                    while (r != null) {
                        arrayList.add(size, r);
                        r = l70.r(this, r.getComponent());
                    }
                    arrayList.add(q2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                o8.t("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
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
        ((t4) q()).v();
    }

    @Override // androidx.fragment.app.k, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        t4 t4Var = (t4) q();
        t4Var.z();
        xa0 xa0Var = t4Var.t;
        if (xa0Var != null) {
            xa0Var.t = true;
        }
    }

    @Override // androidx.fragment.app.k, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((t4) q()).l(true, false);
    }

    @Override // androidx.fragment.app.k, android.app.Activity
    public final void onStop() {
        super.onStop();
        t4 t4Var = (t4) q();
        t4Var.z();
        xa0 xa0Var = t4Var.t;
        if (xa0Var != null) {
            xa0Var.t = false;
            u90 u90Var = xa0Var.s;
            if (u90Var != null) {
                u90Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        q().k(charSequence);
    }

    @Override // defpackage.v3
    public final p1 onWindowStartingSupportActionMode(o1 o1Var) {
        return null;
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((t4) q()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final f4 q() {
        if (this.E == null) {
            d4 d4Var = f4.f;
            this.E = new t4(this, null, this, this);
        }
        return this.E;
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        o();
        q().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((t4) q()).Z = i;
    }

    @Override // defpackage.ac, android.app.Activity
    public void setContentView(View view) {
        o();
        q().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        q().j(view, layoutParams);
    }

    @Override // defpackage.v3
    public final void onSupportActionModeFinished(p1 p1Var) {
    }

    @Override // defpackage.v3
    public final void onSupportActionModeStarted(p1 p1Var) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
