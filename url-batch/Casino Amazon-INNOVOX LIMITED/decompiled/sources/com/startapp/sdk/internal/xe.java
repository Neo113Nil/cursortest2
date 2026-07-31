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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xe {
    public static final String[] k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f498a;
    public final pa b;
    public final pa c;
    public final f4 d;
    public Boolean h;
    public String i;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final qe j = new qe(this);
    public final se e = new se(this);

    public xe(Context context, pa paVar, f4 f4Var) {
        this.f498a = context;
        this.b = paVar;
        this.c = new pa(new re(paVar));
        this.d = f4Var;
    }

    public final boolean a() {
        Boolean bool = this.h;
        if (bool == null) {
            this.d.getClass();
            RcdMetadata M = MetaData.A().M();
            if (M == null || !M.c()) {
                M = null;
            }
            bool = Boolean.valueOf(M == null || ((Random) zh.d.a()).nextDouble() >= M.a());
            this.h = bool;
        }
        return bool.booleanValue();
    }

    public final void b(Activity activity) {
        this.d.getClass();
        RcdMetadata M = MetaData.A().M();
        if (M == null || !M.c()) {
            M = null;
        }
        RcdTargets b = M != null ? M.b() : null;
        if (b == null) {
            return;
        }
        try {
            Collection a2 = b.a(8);
            String name = activity.getClass().getName();
            if (a2.contains(name)) {
                a(name, 8);
                return;
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        try {
            a(b, activity, 16, 32);
        } catch (Throwable th2) {
            n8.a(th2);
        }
        String[] strArr = k;
        for (int i = 0; i < 2; i++) {
            try {
                Object invoke = activity.getClass().getMethod(strArr[i], null).invoke(activity, null);
                if (invoke != null) {
                    Object invoke2 = invoke.getClass().getMethod("getFragments", null).invoke(invoke, null);
                    if (invoke2 instanceof Collection) {
                        for (Object obj : (Collection) invoke2) {
                            if (obj != null) {
                                a(b, obj, 64, 128);
                            }
                        }
                    }
                }
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th3) {
                n8.a(th3);
            }
        }
        ((Executor) this.c.a()).execute(this.j);
    }

    public final void c() {
        HashMap hashMap;
        this.d.getClass();
        RcdMetadata M = MetaData.A().M();
        if (M == null || !M.c()) {
            M = null;
        }
        RcdTargets b = M != null ? M.b() : null;
        if (b == null) {
            return;
        }
        synchronized (this.f) {
            hashMap = new HashMap(this.f);
        }
        String a2 = b.a(hashMap);
        if (a2.equals(this.i)) {
            return;
        }
        this.i = a2;
        n8 n8Var = new n8(o8.d);
        n8Var.d = "RCD.results";
        n8Var.e = a2;
        n8Var.a();
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        if (a()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = zh.f528a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List list = (List) this.g.get(name);
        if (list == null) {
            list = new ArrayList(2);
            this.g.put(name, list);
            ((Executor) this.b.a()).execute(new te(this, activity));
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
        ((Executor) this.b.a()).execute(new ue(this, activity, decorView));
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

    public final void b() {
        this.d.getClass();
        RcdMetadata M = MetaData.A().M();
        if (M == null || !M.c()) {
            M = null;
        }
        RcdTargets b = M != null ? M.b() : null;
        if (b == null) {
            return;
        }
        for (String str : b.a(1)) {
            try {
                Class.forName(str, false, xe.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        try {
            String packageName = this.f498a.getPackageName();
            PackageInfo packageInfo = this.f498a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(b, packageName, packageInfo.activities);
                a(b, packageName, packageInfo.receivers);
                a(b, packageName, packageInfo.services);
                a(b, packageName, packageInfo.providers);
            }
        } catch (Throwable th2) {
            n8.a(th2);
        }
        ((Executor) this.c.a()).execute(this.j);
    }

    public final void a(int i) {
        try {
            if (a()) {
                return;
            }
            ((Executor) this.b.a()).execute(new we(this, Thread.currentThread().getStackTrace(), i));
        } catch (Throwable th) {
            n8.a(th);
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
            for (int i = 0; i < childCount; i++) {
                a(rcdTargets, viewGroup.getChildAt(i));
            }
        }
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i, int i2) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            String name = cls.getName();
            if (name.startsWith("android") || name.startsWith("java.")) {
                return;
            }
            for (Field field : cls.getDeclaredFields()) {
                if (i != 0) {
                    a(rcdTargets, field.getType().getName(), i);
                }
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null && i2 != 0) {
                        a(rcdTargets, field.getType().getName(), i2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void a(String str, int i) {
        synchronized (this.f) {
            Integer num = (Integer) this.f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f.put(str, Integer.valueOf(i | num.intValue()));
        }
    }

    public final void a(RcdTargets rcdTargets, String str, int i) {
        if (str.startsWith("android") || str.startsWith("java.")) {
            return;
        }
        WeakHashMap weakHashMap = zh.f528a;
        if (str.startsWith("com.startapp.")) {
            return;
        }
        for (String str2 : rcdTargets.a(i)) {
            if (str2.length() > 0 && str.startsWith(str2)) {
                if (str2.charAt(str2.length() - 1) == '.') {
                    a(str2, i);
                } else if (str.length() > str2.length()) {
                    if (str.charAt(str2.length()) == '$') {
                        a(str2, i);
                    }
                } else {
                    a(str2, i);
                    return;
                }
            }
        }
    }
}
