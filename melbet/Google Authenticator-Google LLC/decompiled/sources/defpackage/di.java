package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class di extends bg implements dj {
    private dk o;

    public di() {
        aE().b("androidx:appcompat", new bn(this, 2));
        s(new dh(this, 0));
    }

    @Override // defpackage.ng, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        i().d(view, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r5 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        if (r5 == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void attachBaseContext(Context context) {
        Context context2;
        Configuration configuration;
        Context context3;
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        dy dyVar = (dy) i();
        dyVar.E = true;
        int r = dyVar.r(context, dyVar.q());
        int i9 = 3;
        if (dy.n(context) && dk.n(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (dk.g) {
                    vv vvVar = dk.b;
                    if (vvVar == null) {
                        if (dk.c == null) {
                            dk.c = vv.c(ue.a(context));
                        }
                        if (!dk.c.g()) {
                            dk.b = dk.c;
                        }
                    } else if (!vvVar.equals(dk.c)) {
                        vv vvVar2 = dk.b;
                        dk.c = vvVar2;
                        String e = vvVar2.e();
                        synchronized (ue.a) {
                            if (e.equals("")) {
                                context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                            } else {
                                try {
                                    FileOutputStream openFileOutput = context.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                                    XmlSerializer newSerializer = Xml.newSerializer();
                                    try {
                                        try {
                                            newSerializer.setOutput(openFileOutput, null);
                                            newSerializer.startDocument("UTF-8", true);
                                            newSerializer.startTag(null, "locales");
                                            newSerializer.attribute(null, "application_locales", e);
                                            newSerializer.endTag(null, "locales");
                                            newSerializer.endDocument();
                                        } catch (Exception e2) {
                                            Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                                        }
                                    } finally {
                                    }
                                } catch (FileNotFoundException unused) {
                                    Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "android.support.v7.app.AppCompatDelegate.application_locales_record_file"));
                                }
                            }
                        }
                    }
                }
            } else if (!dk.d) {
                dk.h.execute(new bo(context, i9));
            }
        }
        vv w = dyVar.w(context);
        if (!(context instanceof ContextThemeWrapper)) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(dyVar.t(context2, r, w, null, false));
            } catch (IllegalStateException unused2) {
            }
            context3 = context2;
            super.attachBaseContext(context3);
        }
        context2 = context;
        if (context2 instanceof on) {
            try {
                ((on) context2).a(dyVar.t(context2, r, w, null, false));
            } catch (IllegalStateException unused3) {
            }
            context3 = context2;
            super.attachBaseContext(context3);
        }
        if (dy.i) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context2.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context2.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                Configuration configuration5 = new Configuration();
                configuration5.fontScale = 0.0f;
                if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                    if (configuration3.fontScale != configuration4.fontScale) {
                        configuration5.fontScale = configuration4.fontScale;
                    }
                    if (configuration3.mcc != configuration4.mcc) {
                        configuration5.mcc = configuration4.mcc;
                    }
                    if (configuration3.mnc != configuration4.mnc) {
                        configuration5.mnc = configuration4.mnc;
                    }
                    locales = configuration3.getLocales();
                    locales2 = configuration4.getLocales();
                    equals = locales.equals(locales2);
                    if (!equals) {
                        configuration5.setLocales(locales2);
                        configuration5.locale = configuration4.locale;
                    }
                    if (configuration3.touchscreen != configuration4.touchscreen) {
                        configuration5.touchscreen = configuration4.touchscreen;
                    }
                    if (configuration3.keyboard != configuration4.keyboard) {
                        configuration5.keyboard = configuration4.keyboard;
                    }
                    if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                        configuration5.keyboardHidden = configuration4.keyboardHidden;
                    }
                    if (configuration3.navigation != configuration4.navigation) {
                        configuration5.navigation = configuration4.navigation;
                    }
                    if (configuration3.navigationHidden != configuration4.navigationHidden) {
                        configuration5.navigationHidden = configuration4.navigationHidden;
                    }
                    if (configuration3.orientation != configuration4.orientation) {
                        configuration5.orientation = configuration4.orientation;
                    }
                    if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                        configuration5.screenLayout |= configuration4.screenLayout & 15;
                    }
                    if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                        configuration5.screenLayout |= configuration4.screenLayout & 192;
                    }
                    if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                        configuration5.screenLayout |= configuration4.screenLayout & 48;
                    }
                    if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                        configuration5.screenLayout |= configuration4.screenLayout & 768;
                    }
                    i = configuration3.colorMode;
                    int i10 = i & 3;
                    i2 = configuration4.colorMode;
                    if (i10 != (i2 & 3)) {
                        i7 = configuration5.colorMode;
                        i8 = configuration4.colorMode;
                        configuration5.colorMode = i7 | (3 & i8);
                    }
                    i3 = configuration3.colorMode;
                    int i11 = i3 & 12;
                    i4 = configuration4.colorMode;
                    if (i11 != (i4 & 12)) {
                        i5 = configuration5.colorMode;
                        i6 = configuration4.colorMode;
                        configuration5.colorMode = i5 | (i6 & 12);
                    }
                    if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                        configuration5.uiMode |= configuration4.uiMode & 15;
                    }
                    if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                        configuration5.uiMode |= configuration4.uiMode & 48;
                    }
                    if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                        configuration5.screenWidthDp = configuration4.screenWidthDp;
                    }
                    if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                        configuration5.screenHeightDp = configuration4.screenHeightDp;
                    }
                    if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                        configuration5.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                    }
                    if (configuration3.densityDpi != configuration4.densityDpi) {
                        configuration5.densityDpi = configuration4.densityDpi;
                    }
                }
                configuration = configuration5;
            }
            Configuration t = dyVar.t(context2, r, w, configuration, true);
            on onVar = new on(context2, R.style.Theme_AppCompat_Empty);
            onVar.a(t);
            try {
                if (context2.getTheme() != null) {
                    Resources.Theme theme = onVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        theme.rebase();
                    } else {
                        synchronized (ux.a) {
                            if (!ux.c) {
                                try {
                                    ux.b = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    ux.b.setAccessible(true);
                                } catch (NoSuchMethodException unused4) {
                                }
                                ux.c = true;
                            }
                            Method method = ux.b;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused5) {
                                    ux.b = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused6) {
            }
            context3 = onVar;
            super.attachBaseContext(context3);
        }
        context3 = context2;
        super.attachBaseContext(context3);
        vv w2 = dyVar.w(context);
        if (!(context instanceof ContextThemeWrapper)) {
        }
        if (context2 instanceof on) {
        }
        if (dy.i) {
        }
        context3 = context2;
        super.attachBaseContext(context3);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        cs h = h();
        if (getWindow().hasFeature(0)) {
            if (h == null || !h.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.cp, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        cs h = h();
        if (keyCode == 82 && h != null && h.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return i().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        dy dyVar = (dy) i();
        if (dyVar.p == null) {
            dyVar.E();
            cs csVar = dyVar.o;
            dyVar.p = new fm(csVar != null ? csVar.b() : dyVar.k);
        }
        return dyVar.p;
    }

    public final cs h() {
        return i().b();
    }

    public final dk i() {
        if (this.o == null) {
            int i = dk.a;
            this.o = new dy(this, null, this, this);
        }
        return this.o;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        i().f();
    }

    public final void k(Toolbar toolbar) {
        dy dyVar = (dy) i();
        if (dyVar.j instanceof Activity) {
            cs b = dyVar.b();
            if (b instanceof el) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            dyVar.p = null;
            if (b != null) {
                b.e();
            }
            dyVar.o = null;
            if (toolbar != null) {
                ef efVar = new ef(toolbar, dyVar.x(), dyVar.m);
                dyVar.o = efVar;
                dyVar.m.d = efVar.d;
                if (!toolbar.w) {
                    toolbar.w = true;
                    toolbar.v();
                }
            } else {
                dyVar.m.d = null;
            }
            dyVar.f();
        }
    }

    public boolean l() {
        Intent i = ox.i(this);
        if (i == null) {
            return false;
        }
        if (!shouldUpRecreateTask(i)) {
            navigateUpTo(i);
            return true;
        }
        uo uoVar = new uo(this);
        Intent i2 = ox.i(this);
        if (i2 == null) {
            i2 = ox.i(this);
        }
        if (i2 != null) {
            ComponentName component = i2.getComponent();
            if (component == null) {
                component = i2.resolveActivity(uoVar.b.getPackageManager());
            }
            ArrayList arrayList = uoVar.a;
            int size = arrayList.size();
            try {
                Context context = uoVar.b;
                for (Intent j = ox.j(context, component); j != null; j = ox.j(context, j.getComponent())) {
                    arrayList.add(size, j);
                }
                arrayList.add(i2);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        ArrayList arrayList2 = uoVar.a;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        uoVar.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // defpackage.ng, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        cs b;
        super.onConfigurationChanged(configuration);
        dy dyVar = (dy) i();
        if (dyVar.y && dyVar.w && (b = dyVar.b()) != null) {
            b.r();
        }
        Context context = dyVar.k;
        hx.d().e(context);
        dyVar.G = new Configuration(context.getResources().getConfiguration());
        dyVar.M(false, false);
    }

    @Override // defpackage.bg, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        i().g();
    }

    @Override // defpackage.bg, defpackage.ng, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        cs h = h();
        if (menuItem.getItemId() != 16908332 || h == null || (h.a() & 4) == 0) {
            return false;
        }
        return l();
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((dy) i()).D();
    }

    @Override // defpackage.bg, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        cs b = ((dy) i()).b();
        if (b != null) {
            b.h(true);
        }
    }

    @Override // defpackage.bg, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((dy) i()).M(true, false);
    }

    @Override // defpackage.bg, android.app.Activity
    protected void onStop() {
        super.onStop();
        i().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        i().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        cs h = h();
        if (getWindow().hasFeature(0)) {
            if (h == null || !h.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.ng, android.app.Activity
    public final void setContentView(int i) {
        u();
        i().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((dy) i()).H = i;
    }

    @Override // defpackage.ng, android.app.Activity
    public final void setContentView(View view) {
        u();
        i().k(view);
    }

    @Override // defpackage.ng, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        i().l(view, layoutParams);
    }

    protected void m() {
    }

    protected void n() {
    }

    @Override // defpackage.dj
    public void o() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.dj
    public void j(fg fgVar) {
    }
}
