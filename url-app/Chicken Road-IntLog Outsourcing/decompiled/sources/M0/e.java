package M0;

import H2.n;
import L3.j;
import T4.o;
import T4.q;
import T4.x;
import V0.k;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.C0252w;
import b2.AbstractC0279e;
import com.chickyneer.roadway.R;
import f4.C0430g;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import g4.C0472q;
import h.AbstractC0477a;
import h2.C0481b;
import h4.C0491i;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import j5.m;
import j5.y;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.C1206b;
import k1.C1208d;
import k1.ExecutorC1212h;
import kotlin.jvm.internal.i;
import l.AbstractC1250w;
import l.C1242n;
import l.M;
import l.f0;
import u1.AbstractC1477a;
import w2.AbstractActivityC1515c;
import x.AbstractC1526a;

/* loaded from: classes.dex */
public final class e implements d, E2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1782b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1783c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1784d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1785e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1786f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1787g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1788h;

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public e(B.d dVar) {
        this.f1782b = 1;
        q qVar = (q) dVar.f107c;
        if (qVar == null) {
            throw new IllegalStateException("url == null");
        }
        this.f1783c = qVar;
        this.f1784d = (String) dVar.f106b;
        o d6 = ((j) dVar.f108d).d();
        this.f1785e = d6;
        x xVar = (x) dVar.f109e;
        this.f1786f = xVar;
        this.f1787g = AbstractC0476u.d0(dVar.f110f);
        if ("upgrade".equalsIgnoreCase(d6.c("Connection")) && xVar != null && xVar.a() != 0) {
            throw new IllegalArgumentException("expected a null or empty request body with 'Connection: upgrade'");
        }
    }

    public static boolean b(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i2) {
        int b6 = f0.b(context, R.attr.colorControlHighlight);
        int a6 = f0.a(context, R.attr.colorButtonNormal);
        int[] iArr = f0.f10859b;
        int[] iArr2 = f0.f10861d;
        int a7 = AbstractC1526a.a(b6, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, f0.f10860c, f0.f10863f}, new int[]{a6, a7, AbstractC1526a.a(b6, i2), i2});
    }

    public static void p(Drawable drawable, int i2) {
        PorterDuffColorFilter e3;
        PorterDuff.Mode mode = C1242n.f10908b;
        if (AbstractC1250w.a(drawable)) {
            drawable = drawable.mutate();
        }
        synchronized (C1242n.class) {
            e3 = M.e(i2, mode);
        }
        drawable.setColorFilter(e3);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1788h;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public V0.h c() {
        String str = ((String) this.f1783c) == null ? " transportName" : "";
        if (((k) this.f1785e) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1786f) == null) {
            str = AbstractC0279e.e(str, " eventMillis");
        }
        if (((Long) this.f1787g) == null) {
            str = AbstractC0279e.e(str, " uptimeMillis");
        }
        if (((HashMap) this.f1788h) == null) {
            str = AbstractC0279e.e(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new V0.h((String) this.f1783c, (Integer) this.f1784d, (k) this.f1785e, ((Long) this.f1786f).longValue(), ((Long) this.f1787g).longValue(), (HashMap) this.f1788h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void d() {
        ComponentName componentName;
        ComponentName componentName2;
        ComponentName componentName3;
        ResolveInfo resolveService;
        PackageManager.ResolveInfoFlags of;
        AbstractActivityC1515c abstractActivityC1515c = (AbstractActivityC1515c) this.f1788h;
        if (abstractActivityC1515c == null) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) v.b.b(abstractActivityC1515c, ActivityManager.class);
        ComponentName componentName4 = new ComponentName(abstractActivityC1515c, abstractActivityC1515c.getClass());
        if (activityManager == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            componentName = taskInfo.baseActivity;
            if (componentName4.equals(componentName)) {
                componentName2 = taskInfo.topActivity;
                if (componentName2 == null) {
                    continue;
                } else {
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    componentName3 = taskInfo.topActivity;
                    Intent intent2 = intent.setPackage(componentName3 != null ? componentName3.getPackageName() : null);
                    i.d(intent2, "setPackage(...)");
                    PackageManager packageManager = abstractActivityC1515c.getPackageManager();
                    i.d(packageManager, "getPackageManager(...)");
                    if (Build.VERSION.SDK_INT >= 33) {
                        of = PackageManager.ResolveInfoFlags.of(0);
                        resolveService = packageManager.resolveService(intent2, of);
                    } else {
                        resolveService = packageManager.resolveService(intent2, 0);
                    }
                    if (resolveService != null) {
                        try {
                            Intent flags = new Intent(abstractActivityC1515c, abstractActivityC1515c.getClass()).setFlags(603979776);
                            i.d(flags, "setFlags(...)");
                            abstractActivityC1515c.startActivity(flags);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public I1.o f(I1.o oVar) {
        return oVar.g(new U.d(0), new D3.g(18, this));
    }

    public ColorStateList g(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0477a.f5759a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i2 == 2131165254) {
            Object obj2 = AbstractC0477a.f5759a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c2 = f0.c(context, R.attr.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = f0.f10859b;
                iArr2[0] = f0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = f0.f10862e;
                iArr2[1] = f0.b(context, R.attr.colorControlActivated);
                iArr[2] = f0.f10863f;
                iArr2[2] = f0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = f0.f10859b;
                iArr[0] = iArr3;
                iArr2[0] = c2.getColorForState(iArr3, 0);
                iArr[1] = f0.f10862e;
                iArr2[1] = f0.b(context, R.attr.colorControlActivated);
                iArr[2] = f0.f10863f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            return e(context, f0.b(context, R.attr.colorButtonNormal));
        }
        if (i2 == R.drawable.abc_btn_borderless_material) {
            return e(context, 0);
        }
        if (i2 == R.drawable.abc_btn_colored_material) {
            return e(context, f0.b(context, R.attr.colorAccent));
        }
        if (i2 == 2131165251 || i2 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0477a.f5759a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (b((int[]) this.f1784d, i2)) {
            return f0.c(context, R.attr.colorControlNormal);
        }
        if (b((int[]) this.f1787g, i2)) {
            Object obj4 = AbstractC0477a.f5759a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (b((int[]) this.f1788h, i2)) {
            Object obj5 = AbstractC0477a.f5759a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i2 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0477a.f5759a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d A[Catch: ActivityNotFoundException -> 0x0130, TryCatch #0 {ActivityNotFoundException -> 0x0130, blocks: (B:27:0x00cf, B:31:0x00e6, B:33:0x00f9, B:35:0x0106, B:41:0x011d, B:43:0x0111, B:44:0x0128, B:45:0x012f), top: B:26:0x00cf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(String str, boolean z, Map map) {
        boolean z5;
        List<ResolveInfo> queryIntentActivities;
        List<ResolveInfo> queryIntentActivities2;
        PackageManager.ResolveInfoFlags of;
        PackageManager.ResolveInfoFlags of2;
        B1.g gVar = (B1.g) this.f1783c;
        AbstractActivityC1515c abstractActivityC1515c = (AbstractActivityC1515c) this.f1788h;
        if (abstractActivityC1515c == null) {
            throw new g("Launching a Custom Tab requires a foreground activity.");
        }
        Uri uri = Uri.parse(str);
        if (z) {
            ((l1.j) this.f1785e).getClass();
            i.e(uri, "uri");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
                i.d(addFlags, "addFlags(...)");
                try {
                    abstractActivityC1515c.startActivity(addFlags);
                    return;
                } catch (ActivityNotFoundException unused) {
                }
            } else {
                PackageManager packageManager = abstractActivityC1515c.getPackageManager();
                Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts(uri.getScheme(), "", null));
                i.d(data, "setData(...)");
                i.b(packageManager);
                if (i2 >= 33) {
                    of2 = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities = packageManager.queryIntentActivities(data, of2);
                    i.b(queryIntentActivities);
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(data, 131072);
                    i.b(queryIntentActivities);
                }
                C0491i k3 = l1.j.k(queryIntentActivities);
                Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
                i.d(addCategory, "addCategory(...)");
                C0491i c0491i = new C0491i();
                if (i2 >= 33) {
                    of = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, of);
                    i.b(queryIntentActivities2);
                } else {
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, 131072);
                    i.b(queryIntentActivities2);
                }
                c0491i.addAll(l1.j.k(queryIntentActivities2));
                c0491i.removeAll(k3);
                if (!e5.g.e(c0491i).f5824a.isEmpty()) {
                    addCategory.addFlags(268435456);
                    abstractActivityC1515c.startActivity(addCategory);
                    return;
                }
            }
        }
        try {
            gVar.getClass();
            O0.a g6 = B1.g.g(map);
            ((W1.e) this.f1786f).getClass();
            if (W1.e.s(abstractActivityC1515c, uri, g6)) {
                return;
            }
            if (g6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            B0.e f3 = gVar.f(abstractActivityC1515c, g6, (P0.b) this.f1784d);
            ((W1.e) this.f1787g).getClass();
            Intent intent = (Intent) f3.f146b;
            i.d(intent, "intent");
            if (!intent.hasExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX") && !intent.hasExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX")) {
                z5 = false;
                if (z5) {
                    intent.setData(uri);
                    abstractActivityC1515c.startActivity(intent, (Bundle) f3.f147c);
                    return;
                }
                return;
            }
            intent.setData(uri);
            abstractActivityC1515c.startActivityForResult(intent, 1001);
            z5 = true;
            if (z5) {
            }
        } catch (ActivityNotFoundException e3) {
            throw new g(e3.getMessage());
        }
    }

    public m i() {
        d5.e eVar = d5.e.f5492a;
        Object obj = d5.e.f5492a;
        d5.d dVar = obj instanceof d5.d ? (d5.d) obj : null;
        Context b6 = dVar != null ? dVar.b() : null;
        AssetManager assets = b6 != null ? b6.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open((String) this.f1788h);
        i.d(open, "open(...)");
        return new m(open, new y());
    }

    public void j(String str, List list) {
        P0.b bVar = (P0.b) this.f1784d;
        bVar.getClass();
        P0.a aVar = (P0.a) bVar.f2283a.get(str);
        if (aVar == null) {
            return;
        }
        B4.i iVar = aVar.f2281c;
        if (iVar == null) {
            Log.w("CustomTabsAndroid", "Custom Tab session is null. Cannot may launch URL(s).");
            return;
        }
        if (list.isEmpty()) {
            Log.w("CustomTabsAndroid", "URLs is empty. Cannot may launch URL(s).");
            return;
        }
        if (list.size() == 1) {
            iVar.L(Uri.parse((String) list.get(0)), null);
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(B0.f.c(new C0430g("android.support.customtabs.otherurls.URL", Uri.parse((String) it.next()))));
        }
        iVar.L(null, arrayList);
    }

    public B.d k() {
        B.d dVar = new B.d(false);
        Object obj = C0472q.f5751a;
        dVar.f110f = obj;
        dVar.f107c = (q) this.f1783c;
        dVar.f106b = (String) this.f1784d;
        dVar.f109e = (x) this.f1786f;
        Map map = (Map) this.f1787g;
        if (!map.isEmpty()) {
            obj = AbstractC0476u.e0(map);
        }
        dVar.f110f = obj;
        dVar.f108d = ((o) this.f1785e).e();
        return dVar;
    }

    public boolean l(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f1784d).iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                HashMap hashMap = ((K2.a) it.next()).f1411d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((n) hashMap.remove(Integer.valueOf(i2))).success(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z) {
                }
                z = true;
            }
            return z;
        }
    }

    public void m() {
        try {
            j5.q b6 = j5.b.b(i());
            try {
                j5.i g6 = b6.g(b6.o());
                j5.i g7 = b6.g(b6.o());
                AbstractC1477a.e(b6, null);
                synchronized (this) {
                    i.b(g6);
                    this.f1785e = g6;
                    i.b(g7);
                    this.f1786f = g7;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f1784d).countDown();
        }
    }

    public void n(AbstractActivityC1515c abstractActivityC1515c) {
        for (P0.a aVar : ((P0.b) this.f1784d).f2283a.values()) {
            if (abstractActivityC1515c == null) {
                Activity activity = aVar.f2280b;
                if (activity != null) {
                    activity.unbindService(aVar);
                }
                aVar.f2281c = null;
                aVar.f2282d = false;
            } else {
                aVar.a(abstractActivityC1515c);
            }
        }
        this.f1788h = abstractActivityC1515c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(String str, String str2, Bundle bundle) {
        int i2;
        String str3;
        String str4;
        W1.g gVar;
        boolean g6;
        int i3;
        PackageInfo c2;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        K1.g gVar2 = (K1.g) this.f1783c;
        gVar2.a();
        bundle.putString("gmp_app_id", gVar2.f1389c.f1402b);
        f2.o oVar = (f2.o) this.f1784d;
        synchronized (oVar) {
            try {
                if (oVar.f5626d == 0 && (c2 = oVar.c("com.google.android.gms")) != null) {
                    oVar.f5626d = c2.versionCode;
                }
                i2 = oVar.f5626d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((f2.o) this.f1784d).a());
        f2.o oVar2 = (f2.o) this.f1784d;
        synchronized (oVar2) {
            try {
                if (oVar2.f5625c == null) {
                    oVar2.e();
                }
                str3 = oVar2.f5625c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        K1.g gVar3 = (K1.g) this.f1783c;
        gVar3.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar3.f1388b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((Z1.a) B0.f.b(((Z1.c) ((Z1.d) this.f1788h)).d())).f3748a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e3) {
            e = e3;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) B0.f.b(((Z1.c) ((Z1.d) this.f1788h)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (W1.g) ((Y1.a) this.f1787g).get();
            C0481b c0481b = (C0481b) ((Y1.a) this.f1786f).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e6) {
            e = e6;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) B0.f.b(((Z1.c) ((Z1.d) this.f1788h)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (W1.g) ((Y1.a) this.f1787g).get();
            C0481b c0481b2 = (C0481b) ((Y1.a) this.f1786f).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) B0.f.b(((Z1.c) ((Z1.d) this.f1788h)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        gVar = (W1.g) ((Y1.a) this.f1787g).get();
        C0481b c0481b22 = (C0481b) ((Y1.a) this.f1786f).get();
        if (gVar == null || c0481b22 == null) {
            return;
        }
        W1.d dVar = (W1.d) gVar;
        synchronized (dVar) {
            long currentTimeMillis = System.currentTimeMillis();
            W1.i iVar = (W1.i) dVar.f3398a.get();
            synchronized (iVar) {
                g6 = iVar.g(currentTimeMillis);
            }
            if (g6) {
                synchronized (iVar) {
                    String d6 = iVar.d(System.currentTimeMillis());
                    iVar.f3405a.edit().putString("last-used-date", d6).commit();
                    iVar.f(d6);
                }
                i3 = 3;
            } else {
                i3 = 1;
            }
        }
        if (i3 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(O.j.b(i3)));
            bundle.putString("Firebase-Client", c0481b22.a());
        }
    }

    public I1.o q(String str, String str2, Bundle bundle) {
        int i2;
        try {
            o(str, str2, bundle);
            C1206b c1206b = (C1206b) this.f1785e;
            G2.f fVar = c1206b.f10676c;
            int d6 = fVar.d();
            ExecutorC1212h executorC1212h = ExecutorC1212h.f10689c;
            if (d6 < 12000000) {
                return fVar.e() != 0 ? c1206b.a(bundle).h(executorC1212h, new x1.e(c1206b, bundle)) : B0.f.q(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            k1.n c2 = k1.n.c(c1206b.f10675b);
            synchronized (c2) {
                i2 = c2.f10711a;
                c2.f10711a = i2 + 1;
            }
            return c2.d(new k1.m(i2, 1, bundle, 1)).g(executorC1212h, C1208d.f10682b);
        } catch (InterruptedException | ExecutionException e3) {
            return B0.f.q(e3);
        }
    }

    public String r(Map map) {
        Boolean bool;
        Set X02;
        P0.a aVar;
        AbstractActivityC1515c abstractActivityC1515c = (AbstractActivityC1515c) this.f1788h;
        if (abstractActivityC1515c == null) {
            return null;
        }
        P0.b bVar = (P0.b) this.f1784d;
        bVar.getClass();
        if (map == null) {
            bool = null;
            X02 = null;
        } else {
            bool = (Boolean) map.get("prefersDefaultBrowser");
            List list = (List) map.get("fallbackCustomTabs");
            X02 = list != null ? AbstractC0465j.X0(list) : null;
        }
        String p5 = e5.g.p(abstractActivityC1515c, !i.a(bool, Boolean.TRUE), new B.d((Boolean) null, bool, X02, (Map) null, (String) null).h(abstractActivityC1515c));
        if (p5 == null) {
            aVar = null;
        } else {
            LinkedHashMap linkedHashMap = bVar.f2283a;
            aVar = (P0.a) linkedHashMap.get(p5);
            if (aVar == null) {
                aVar = new P0.a(p5);
                linkedHashMap.put(p5, aVar);
            }
        }
        if (aVar != null && aVar.a(abstractActivityC1515c)) {
            return aVar.f2279a;
        }
        return null;
    }

    public String toString() {
        switch (this.f1782b) {
            case 1:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f1784d);
                sb.append(", url=");
                sb.append((q) this.f1783c);
                o oVar = (o) this.f1785e;
                if (oVar.size() != 0) {
                    sb.append(", headers=[");
                    int i2 = 0;
                    for (Object obj : oVar) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC0466k.C0();
                            throw null;
                        }
                        C0430g c0430g = (C0430g) obj;
                        String str = (String) c0430g.f5668a;
                        String str2 = (String) c0430g.f5669b;
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (U4.c.j(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i2 = i3;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f1787g;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e(int i2) {
        this.f1782b = i2;
        switch (i2) {
            case 2:
                break;
            case 3:
            default:
                B1.g gVar = new B1.g(24);
                P0.b bVar = new P0.b(0);
                l1.j jVar = new l1.j(9);
                W1.e eVar = new W1.e();
                W1.e eVar2 = new W1.e();
                this.f1783c = gVar;
                this.f1784d = bVar;
                this.f1785e = jVar;
                this.f1786f = eVar;
                this.f1787g = eVar2;
                break;
            case 4:
                this.f1782b = 4;
                this.f1783c = new AtomicBoolean(false);
                this.f1784d = new CountDownLatch(1);
                this.f1788h = "PublicSuffixDatabase.list";
                break;
            case 5:
                this.f1783c = new int[]{2131165267, 2131165265, 2131165184};
                this.f1784d = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
                this.f1785e = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
                this.f1786f = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
                this.f1787g = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f1788h = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public e(K1.g gVar, f2.o oVar, Y1.a aVar, Y1.a aVar2, Z1.d dVar) {
        this.f1782b = 3;
        gVar.a();
        C1206b c1206b = new C1206b(gVar.f1387a);
        this.f1783c = gVar;
        this.f1784d = oVar;
        this.f1785e = c1206b;
        this.f1786f = aVar;
        this.f1787g = aVar2;
        this.f1788h = dVar;
    }

    public e(AbstractActivityC1515c abstractActivityC1515c, C0252w c0252w) {
        this.f1782b = 6;
        this.f1783c = new HashSet();
        this.f1784d = new HashSet();
        this.f1785e = new HashSet();
        this.f1786f = new HashSet();
        new HashSet();
        this.f1787g = new HashSet();
        this.f1788h = abstractActivityC1515c;
        new HiddenLifecycleReference(c0252w);
    }
}
