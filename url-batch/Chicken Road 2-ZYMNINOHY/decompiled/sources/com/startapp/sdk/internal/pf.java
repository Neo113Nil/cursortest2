package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pf {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f7448k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f7449a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7450b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7451c;

    /* renamed from: d, reason: collision with root package name */
    public final m4 f7452d;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f7456h;

    /* renamed from: i, reason: collision with root package name */
    public String f7457i;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f7454f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7455g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final Cif f7458j = new Cif(this);

    /* renamed from: e, reason: collision with root package name */
    public final kf f7453e = new kf(this);

    public pf(Context context, ib ibVar, m4 m4Var) {
        this.f7449a = context;
        this.f7450b = ibVar;
        this.f7451c = new ib(new jf(ibVar));
        this.f7452d = m4Var;
    }

    public final boolean a() {
        Boolean bool = this.f7456h;
        if (bool == null) {
            this.f7452d.getClass();
            RcdMetadata R3 = MetaData.E().R();
            if (R3 == null || !R3.c()) {
                R3 = null;
            }
            bool = Boolean.valueOf(R3 == null || ((Random) si.f7578d.a()).nextDouble() >= R3.a());
            this.f7456h = bool;
        }
        return bool.booleanValue();
    }

    public final void b(Activity activity) {
        this.f7452d.getClass();
        RcdMetadata R3 = MetaData.E().R();
        if (R3 == null || !R3.c()) {
            R3 = null;
        }
        RcdTargets b4 = R3 != null ? R3.b() : null;
        if (b4 == null) {
            return;
        }
        try {
            Collection a3 = b4.a(8);
            String name = activity.getClass().getName();
            if (a3.contains(name)) {
                a(name, 8);
                return;
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            a(b4, activity, 16, 32);
        } catch (Throwable th2) {
            d9.a(th2);
        }
        String[] strArr = f7448k;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                Object invoke = activity.getClass().getMethod(strArr[i4], null).invoke(activity, null);
                if (invoke != null) {
                    Object invoke2 = invoke.getClass().getMethod("getFragments", null).invoke(invoke, null);
                    if (invoke2 instanceof Collection) {
                        for (Object obj : (Collection) invoke2) {
                            if (obj != null) {
                                a(b4, obj, 64, 128);
                            }
                        }
                    }
                }
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th3) {
                d9.a(th3);
            }
        }
        ((Executor) this.f7451c.a()).execute(this.f7458j);
    }

    public final void c() {
        HashMap hashMap;
        this.f7452d.getClass();
        RcdMetadata R3 = MetaData.E().R();
        if (R3 == null || !R3.c()) {
            R3 = null;
        }
        RcdTargets b4 = R3 != null ? R3.b() : null;
        if (b4 == null) {
            return;
        }
        synchronized (this.f7454f) {
            hashMap = new HashMap(this.f7454f);
        }
        String a3 = b4.a(hashMap);
        if (a3.equals(this.f7457i)) {
            return;
        }
        this.f7457i = a3;
        d9 d9Var = new d9(e9.f6838d);
        d9Var.f6792d = "RCD.results";
        d9Var.f6793e = a3;
        d9Var.a();
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        if (a()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = si.f7575a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List list = (List) this.f7455g.get(name);
        if (list == null) {
            list = new ArrayList(2);
            this.f7455g.put(name, list);
            ((Executor) this.f7450b.a()).execute(new lf(this, activity));
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == activity) {
                z = true;
            }
        }
        if (z || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        list.add(new WeakReference(activity));
        ((Executor) this.f7450b.a()).execute(new mf(this, activity, decorView));
    }

    public final void b() {
        this.f7452d.getClass();
        RcdMetadata R3 = MetaData.E().R();
        if (R3 == null || !R3.c()) {
            R3 = null;
        }
        RcdTargets b4 = R3 != null ? R3.b() : null;
        if (b4 == null) {
            return;
        }
        for (String str : b4.a(1)) {
            try {
                Class.forName(str, false, pf.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        try {
            String packageName = this.f7449a.getPackageName();
            PackageInfo packageInfo = this.f7449a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(b4, packageName, packageInfo.activities);
                a(b4, packageName, packageInfo.receivers);
                a(b4, packageName, packageInfo.services);
                a(b4, packageName, packageInfo.providers);
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        ((Executor) this.f7451c.a()).execute(this.f7458j);
    }

    public final void a(RcdTargets rcdTargets, String str, ComponentInfo[] componentInfoArr) {
        if (componentInfoArr == null) {
            return;
        }
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (componentInfo != null) {
                String str2 = componentInfo.name;
                if (str2.startsWith(".")) {
                    a(rcdTargets, str + str2, 2);
                } else {
                    a(rcdTargets, str2, 2);
                }
            }
        }
    }

    public final void a(int i4) {
        try {
            if (a()) {
                return;
            }
            ((Executor) this.f7450b.a()).execute(new of(this, Thread.currentThread().getStackTrace(), i4));
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view == null) {
            return;
        }
        a(rcdTargets, view.getClass().getName(), 4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                a(rcdTargets, viewGroup.getChildAt(i4));
            }
        }
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i4, int i5) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            String name = cls.getName();
            if (name.startsWith(ConstantDeviceInfo.APP_PLATFORM) || name.startsWith("java.")) {
                return;
            }
            for (Field field : cls.getDeclaredFields()) {
                if (i4 != 0) {
                    a(rcdTargets, field.getType().getName(), i4);
                }
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null && i5 != 0) {
                        a(rcdTargets, field.getType().getName(), i5);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void a(String str, int i4) {
        synchronized (this.f7454f) {
            try {
                Integer num = (Integer) this.f7454f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f7454f.put(str, Integer.valueOf(i4 | num.intValue()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(RcdTargets rcdTargets, String str, int i4) {
        if (str.startsWith(ConstantDeviceInfo.APP_PLATFORM) || str.startsWith("java.")) {
            return;
        }
        WeakHashMap weakHashMap = si.f7575a;
        if (str.startsWith("com.startapp.")) {
            return;
        }
        for (String str2 : rcdTargets.a(i4)) {
            if (str2.length() > 0 && str.startsWith(str2)) {
                if (str2.charAt(str2.length() - 1) == '.') {
                    a(str2, i4);
                } else if (str.length() > str2.length()) {
                    if (str.charAt(str2.length()) == '$') {
                        a(str2, i4);
                    }
                } else {
                    a(str2, i4);
                    return;
                }
            }
        }
    }
}
