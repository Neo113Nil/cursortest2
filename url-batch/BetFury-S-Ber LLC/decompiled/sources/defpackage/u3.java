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
import androidx.fragment.app.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class u3 extends b implements x3 {
    public v4 E;

    public u3() {
        ((i5) this.i.h).N("androidx:appcompat", new s3(this));
        g(new t3(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        v4 v4Var = (v4) k();
        v4Var.w();
        ((ViewGroup) v4Var.F.findViewById(R.id.content)).addView(view, layoutParams);
        v4Var.r.a(v4Var.q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        v4 v4Var = (v4) k();
        v4Var.T = true;
        int i = v4Var.X;
        if (i == -100) {
            i = h4.g;
        }
        int C = v4Var.C(context, i);
        if (h4.c(context) && h4.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (h4.n) {
                    try {
                        vy vyVar = h4.h;
                        if (vyVar == null) {
                            if (h4.i == null) {
                                h4.i = vy.a(d50.J(context));
                            }
                            if (!h4.i.a.a.isEmpty()) {
                                h4.h = h4.i;
                            }
                        } else if (!vyVar.equals(h4.i)) {
                            vy vyVar2 = h4.h;
                            h4.i = vyVar2;
                            d50.H(context, vyVar2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!h4.k) {
                h4.f.execute(new b4(context, 0));
            }
        }
        vy p = v4.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v4.t(context, C, p, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof cg) {
            try {
                ((cg) context).a(v4.t(context, C, p, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (v4.o0) {
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
                    m4.a(configuration3, configuration4, configuration);
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
            Configuration t = v4.t(context, C, p, configuration, true);
            cg cgVar = new cg(context, com.trembin.nirefon.betfury.R.style.Theme_AppCompat_Empty);
            cgVar.a(t);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cgVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        v6.c(theme);
                    } else {
                        synchronized (n9.o) {
                            if (!n9.q) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    n9.p = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                n9.q = true;
                            }
                            Method method = n9.p;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    n9.p = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = cgVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        v4 v4Var = (v4) k();
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (getWindow().hasFeature(0)) {
            if (n9Var == null || !n9Var.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.xd, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        v4 v4Var = (v4) k();
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (keyCode == 82 && n9Var != null && n9Var.H(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        v4 v4Var = (v4) k();
        v4Var.w();
        return v4Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v4 v4Var = (v4) k();
        if (v4Var.t == null) {
            v4Var.A();
            n9 n9Var = v4Var.s;
            v4Var.t = new eg0(n9Var != null ? n9Var.t() : v4Var.p);
        }
        return v4Var.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = kl0.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k().b();
    }

    public final h4 k() {
        if (this.E == null) {
            f4 f4Var = h4.f;
            this.E = new v4(this, null, this, this);
        }
        return this.E;
    }

    @Override // defpackage.yd, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v4 v4Var = (v4) k();
        if (v4Var.K && v4Var.E) {
            v4Var.A();
            n9 n9Var = v4Var.s;
            if (n9Var != null) {
                n9Var.E();
            }
        }
        a5 a = a5.a();
        Context context = v4Var.p;
        synchronized (a) {
            p90 p90Var = a.a;
            synchronized (p90Var) {
                ez ezVar = (ez) p90Var.b.get(context);
                if (ezVar != null) {
                    ezVar.a();
                }
            }
        }
        v4Var.W = new Configuration(v4Var.p.getResources().getConfiguration());
        v4Var.m(false, false);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        k().e();
    }

    @Override // androidx.fragment.app.b, defpackage.yd, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent q;
        if (!super.onMenuItemSelected(i, menuItem)) {
            v4 v4Var = (v4) k();
            v4Var.A();
            n9 n9Var = v4Var.s;
            if (menuItem.getItemId() != 16908332 || n9Var == null || (n9Var.n() & 4) == 0 || (q = gk0.q(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(q)) {
                navigateUpTo(q);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent q2 = gk0.q(this);
            if (q2 == null) {
                q2 = gk0.q(this);
            }
            if (q2 != null) {
                ComponentName component = q2.getComponent();
                if (component == null) {
                    component = q2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent r = gk0.r(this, component);
                    while (r != null) {
                        arrayList.add(size, r);
                        r = gk0.r(this, r.getComponent());
                    }
                    arrayList.add(q2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                s9.u("No intents added to TaskStackBuilder; cannot startActivities");
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
        ((v4) k()).w();
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        v4 v4Var = (v4) k();
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (n9Var != null) {
            n9Var.O(true);
        }
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onStart() {
        super.onStart();
        ((v4) k()).m(true, false);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onStop() {
        super.onStop();
        v4 v4Var = (v4) k();
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (n9Var != null) {
            n9Var.O(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        v4 v4Var = (v4) k();
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (getWindow().hasFeature(0)) {
            if (n9Var == null || !n9Var.I()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        k().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((v4) k()).Y = i;
    }

    @Override // defpackage.yd, android.app.Activity
    public void setContentView(View view) {
        i();
        k().j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        k().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
