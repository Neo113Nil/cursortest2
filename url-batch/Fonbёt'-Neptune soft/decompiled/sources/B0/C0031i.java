package B0;

import D0.RunnableC0061v;
import I.C0079n;
import P.AbstractC0091a;
import P.C0092b;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0165a;
import d0.C0182j;
import d0.C0183k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import j.C0240p;
import j.C0243t;
import j.l0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import l0.ThreadFactoryC0258a;
import m.AbstractC0259a;
import m0.AbstractActivityC0264d;
import m0.InterfaceC0260A;
import n.C0271d;
import org.xmlpull.v1.XmlPullParserException;
import q0.C0287d;
import s.AbstractC0291b;
import s.AbstractC0302m;
import s.InterfaceC0294e;
import v0.C0312b;
import w0.InterfaceC0320f;

/* renamed from: B0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031i implements InterfaceC0030h, b1.d {

    /* renamed from: i, reason: collision with root package name */
    public static C0031i f152i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153e;

    /* renamed from: f, reason: collision with root package name */
    public Object f154f;

    /* renamed from: g, reason: collision with root package name */
    public Object f155g;

    /* renamed from: h, reason: collision with root package name */
    public Object f156h;

    public C0031i(int i2) {
        this.f153e = i2;
        switch (i2) {
            case 9:
                break;
            case 12:
                this.f154f = new ConcurrentLinkedQueue();
                break;
            default:
                C0023a c0023a = new C0023a(24);
                C0023a c0023a2 = new C0023a(23);
                this.f154f = new HashSet();
                this.f155g = c0023a;
                this.f156h = c0023a2;
                break;
        }
    }

    public static C0031i G() {
        if (f152i == null) {
            C0023a c0023a = new C0023a(26);
            ThreadFactoryC0258a threadFactoryC0258a = new ThreadFactoryC0258a();
            threadFactoryC0258a.f3123a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC0258a);
            FlutterJNI flutterJNI = new FlutterJNI();
            C0287d c0287d = new C0287d();
            c0287d.f3379a = false;
            c0287d.f3383e = flutterJNI;
            c0287d.f3384f = newCachedThreadPool;
            C0031i c0031i = new C0031i(9);
            c0031i.f154f = c0287d;
            c0031i.f155g = c0023a;
            c0031i.f156h = newCachedThreadPool;
            f152i = c0031i;
        }
        return f152i;
    }

    public static void I(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static C0031i J(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0031i(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public static Bundle x(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public Drawable A(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f154f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : d.b.c((Context) this.f155g, resourceId);
    }

    public Typeface B(int i2, int i3, C0243t c0243t) {
        int i4 = 4;
        int resourceId = ((TypedArray) this.f154f).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f156h) == null) {
            this.f156h = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f156h;
        ThreadLocal threadLocal = AbstractC0302m.f3421a;
        Context context = (Context) this.f155g;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            c0243t.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        C0271d c0271d = t.e.f3444b;
        Typeface typeface = (Typeface) c0271d.a(t.e.b(resources, resourceId, charSequence2, i5, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0061v(i4, c0243t, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                InterfaceC0294e i6 = AbstractC0291b.i(resources.getXml(resourceId), resources);
                if (i6 != null) {
                    return t.e.a(context, i6, resources, resourceId, charSequence2, typedValue.assetCookie, i3, c0243t);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0243t.a();
                return null;
            }
            int i7 = typedValue.assetCookie;
            Typeface f2 = t.e.f3443a.f(context, resources, resourceId, charSequence2, i3);
            if (f2 != null) {
                c0271d.b(t.e.b(resources, resourceId, charSequence2, i7, i3), f2);
            }
            if (f2 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0061v(i4, c0243t, f2));
            } else {
                c0243t.a();
            }
            return f2;
        } catch (IOException e2) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
            c0243t.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
            c0243t.a();
            return null;
        }
    }

    public View C(int i2) {
        return ((RecyclerView) ((B.m) this.f154f).f78f).getChildAt(i2);
    }

    public int D() {
        return ((RecyclerView) ((B.m) this.f154f).f78f).getChildCount();
    }

    public File E(Context context) {
        ((C0023a) this.f155g).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public boolean F(KeyEvent keyEvent) {
        if (((HashSet) this.f155g).remove(keyEvent)) {
            return false;
        }
        m0.z[] zVarArr = (m0.z[]) this.f154f;
        if (zVarArr.length <= 0) {
            K(keyEvent);
            return true;
        }
        m0.y yVar = new m0.y(this, keyEvent);
        for (m0.z zVar : zVarArr) {
            zVar.a(keyEvent, new m0.x(yVar));
        }
        return true;
    }

    public void H(int i2) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f154f;
        C0031i J = J(imageView.getContext(), null, AbstractC0165a.f1967e, i2);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) J.f154f;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = d.b.c(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                j.A.b(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList z2 = J.z(2);
                int i3 = Build.VERSION.SDK_INT;
                F.f.c(imageView, z2);
                if (i3 == 21 && (drawable2 = imageView.getDrawable()) != null && F.f.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode d2 = j.A.d(typedArray.getInt(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                F.f.d(imageView, d2);
                if (i4 == 21 && (drawable = imageView.getDrawable()) != null && F.f.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            J.N();
        } catch (Throwable th) {
            J.N();
            throw th;
        }
    }

    public void K(KeyEvent keyEvent) {
        InputConnection inputConnection;
        InterfaceC0260A interfaceC0260A = (InterfaceC0260A) this.f156h;
        if (interfaceC0260A != null) {
            io.flutter.plugin.editing.j jVar = ((m0.q) interfaceC0260A).f3193o;
            boolean z2 = false;
            if (jVar.f2597b.isAcceptingText() && (inputConnection = jVar.f2605j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.b) {
                    io.flutter.plugin.editing.b bVar = (io.flutter.plugin.editing.b) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z2 = bVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z2 = bVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z2 = bVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z2 = bVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = bVar.f2558e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    bVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z2 = true;
                                }
                            }
                            io.flutter.plugin.editing.e eVar = bVar.f2557d;
                            int selectionStart = Selection.getSelectionStart(eVar);
                            int selectionEnd = Selection.getSelectionEnd(eVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                bVar.beginBatchEdit();
                                if (min != max) {
                                    eVar.delete(min, max);
                                }
                                eVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i2 = min + 1;
                                bVar.setSelection(i2, i2);
                                bVar.endBatchEdit();
                                z2 = true;
                            }
                        }
                    }
                } else {
                    z2 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z2) {
                return;
            }
            HashSet hashSet = (HashSet) this.f155g;
            hashSet.add(keyEvent);
            ((m0.q) interfaceC0260A).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void L(Activity activity, a0.k kVar) {
        Q0.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f155g;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f156h;
        try {
            if (kVar.equals((a0.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((C0183k) ((B.m) this.f154f).f78f).f2059b.iterator();
            while (it.hasNext()) {
                C0182j c0182j = (C0182j) it.next();
                if (c0182j.f2053a.equals(activity)) {
                    c0182j.f2055c = kVar;
                    c0182j.f2054b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Boolean M(String str, Boolean bool, C0.e eVar, C0.a aVar) {
        ActivityOptions activityOptions;
        if (((AbstractActivityC0264d) this.f156h) == null) {
            throw new C0.b();
        }
        Bundle x2 = x(eVar.f225c);
        if (bool.booleanValue()) {
            Iterator it = eVar.f225c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    AbstractActivityC0264d abstractActivityC0264d = (AbstractActivityC0264d) this.f156h;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f218a.booleanValue() ? 1 : 0);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 24) {
                        String a2 = m.b.a();
                        if (!TextUtils.isEmpty(a2)) {
                            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                            if (!bundleExtra.containsKey("Accept-Language")) {
                                bundleExtra.putString("Accept-Language", a2);
                                intent.putExtra("com.android.browser.headers", bundleExtra);
                            }
                        }
                    }
                    if (i2 >= 34) {
                        activityOptions = AbstractC0259a.a();
                        m.c.a(activityOptions, false);
                    } else {
                        activityOptions = null;
                    }
                    Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", x2);
                    try {
                        intent.setData(parse);
                        abstractActivityC0264d.startActivity(intent, bundle2);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        AbstractActivityC0264d abstractActivityC0264d2 = (AbstractActivityC0264d) this.f156h;
        boolean booleanValue = eVar.f223a.booleanValue();
        boolean booleanValue2 = eVar.f224b.booleanValue();
        int i3 = WebViewActivity.f2698i;
        try {
            ((AbstractActivityC0264d) this.f156h).startActivity(new Intent(abstractActivityC0264d2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", x2));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public void N() {
        ((TypedArray) this.f154f).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r4 = r3.f3126a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6[r4] = r2;
        r3.f3126a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            AbstractC0091a abstractC0091a = (AbstractC0091a) arrayList.get(i2);
            abstractC0091a.getClass();
            m0.D d2 = (m0.D) this.f154f;
            d2.getClass();
            Q0.h.e(abstractC0091a, "instance");
            int i3 = d2.f3126a;
            int i4 = 0;
            while (true) {
                Object[] objArr = d2.f3127b;
                if (i4 >= i3) {
                    break;
                } else {
                    if (objArr[i4] == abstractC0091a) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
        }
        arrayList.clear();
    }

    public Boolean P() {
        String str;
        List emptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f155g).getPackageManager();
        List arrayList = emptyList == null ? new ArrayList() : emptyList;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return Boolean.valueOf(str != null);
    }

    @Override // B0.InterfaceC0030h
    public Double a(String str, C0032j c0032j) {
        SharedPreferences u2 = u(c0032j);
        if (!u2.contains(str)) {
            return null;
        }
        Object c2 = O.c(u2.getString(str, ""), (C0023a) this.f156h);
        Q0.h.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c2;
    }

    @Override // B0.InterfaceC0030h
    public void b(String str, boolean z2, C0032j c0032j) {
        u(c0032j).edit().putBoolean(str, z2).apply();
    }

    @Override // B0.InterfaceC0030h
    public Map c(List list, C0032j c0032j) {
        Object value;
        Map<String, ?> all = u(c0032j).getAll();
        Q0.h.d(all, "preferences.all");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (O.b(entry.getKey(), entry.getValue(), list != null ? G0.d.T(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = O.c(value, (C0023a) this.f156h);
                Q0.h.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // B0.InterfaceC0030h
    public void d(String str, List list, C0032j c0032j) {
        u(c0032j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((C0023a) this.f156h).e(list))).apply();
    }

    @Override // B0.InterfaceC0030h
    public void e(String str, double d2, C0032j c0032j) {
        u(c0032j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // B0.InterfaceC0030h
    public void f(String str, String str2, C0032j c0032j) {
        u(c0032j).edit().putString(str, str2).apply();
    }

    @Override // B0.InterfaceC0030h
    public Long g(String str, C0032j c0032j) {
        long j2;
        SharedPreferences u2 = u(c0032j);
        if (!u2.contains(str)) {
            return null;
        }
        try {
            j2 = u2.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = u2.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    @Override // B0.InterfaceC0030h
    public List h(List list, C0032j c0032j) {
        Map<String, ?> all = u(c0032j).getAll();
        Q0.h.d(all, "preferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Q0.h.d(key, "it.key");
            if (O.b(key, entry.getValue(), list != null ? G0.d.T(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return G0.d.S(linkedHashMap.keySet());
    }

    @Override // B0.InterfaceC0030h
    public S i(String str, C0032j c0032j) {
        SharedPreferences u2 = u(c0032j);
        if (!u2.contains(str)) {
            return null;
        }
        String string = u2.getString(str, "");
        Q0.h.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new S(string, P.f131g) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new S(null, P.f130f) : new S(null, P.f132h);
    }

    @Override // b1.d
    public Object k(b1.e eVar, H0.d dVar) {
        Object k2 = ((b1.d) this.f154f).k(new t(eVar, (L.d) this.f155g, (N) this.f156h), dVar);
        return k2 == I0.a.f733e ? k2 : F0.h.f469a;
    }

    @Override // B0.InterfaceC0030h
    public void l(List list, C0032j c0032j) {
        SharedPreferences u2 = u(c0032j);
        SharedPreferences.Editor edit = u2.edit();
        Q0.h.d(edit, "preferences.edit()");
        Map<String, ?> all = u2.getAll();
        Q0.h.d(all, "preferences.all");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (O.b(str, all.get(str), list != null ? G0.d.T(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    @Override // B0.InterfaceC0030h
    public void m(String str, String str2, C0032j c0032j) {
        u(c0032j).edit().putString(str, str2).apply();
    }

    @Override // B0.InterfaceC0030h
    public String n(String str, C0032j c0032j) {
        SharedPreferences u2 = u(c0032j);
        if (u2.contains(str)) {
            return u2.getString(str, "");
        }
        return null;
    }

    @Override // B0.InterfaceC0030h
    public void o(String str, long j2, C0032j c0032j) {
        u(c0032j).edit().putLong(str, j2).apply();
    }

    @Override // B0.InterfaceC0030h
    public Boolean p(String str, C0032j c0032j) {
        SharedPreferences u2 = u(c0032j);
        if (u2.contains(str)) {
            return Boolean.valueOf(u2.getBoolean(str, true));
        }
        return null;
    }

    @Override // B0.InterfaceC0030h
    public ArrayList q(String str, C0032j c0032j) {
        List list;
        SharedPreferences u2 = u(c0032j);
        ArrayList arrayList = null;
        if (u2.contains(str)) {
            String string = u2.getString(str, "");
            Q0.h.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) O.c(u2.getString(str, ""), (C0023a) this.f156h)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public void r() {
        ImageView imageView = (ImageView) this.f154f;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j.A.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 && i2 == 21) {
                if (((l0) this.f156h) == null) {
                    this.f156h = new l0();
                }
                l0 l0Var = (l0) this.f156h;
                l0Var.f3000a = null;
                l0Var.f3003d = false;
                l0Var.f3001b = null;
                l0Var.f3002c = false;
                ColorStateList a2 = F.f.a(imageView);
                if (a2 != null) {
                    l0Var.f3003d = true;
                    l0Var.f3000a = a2;
                }
                PorterDuff.Mode b2 = F.f.b(imageView);
                if (b2 != null) {
                    l0Var.f3002c = true;
                    l0Var.f3001b = b2;
                }
                if (l0Var.f3003d || l0Var.f3002c) {
                    C0240p.c(drawable, l0Var, imageView.getDrawableState());
                    return;
                }
            }
            l0 l0Var2 = (l0) this.f155g;
            if (l0Var2 != null) {
                C0240p.c(drawable, l0Var2, imageView.getDrawableState());
            }
        }
    }

    public Boolean s(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((C0.f) this.f154f).f227f).getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    public void t(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f155g;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f156h).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        switch (this.f153e) {
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                return ((C0092b) this.f155g).toString() + ", hidden list:" + ((ArrayList) this.f156h).size();
            default:
                return super.toString();
        }
    }

    public SharedPreferences u(C0032j c0032j) {
        String str = c0032j.f157a;
        Context context = (Context) this.f155g;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            Q0.h.d(sharedPreferences, "{\n      context.getShare…ntext.MODE_PRIVATE)\n    }");
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        Q0.h.d(sharedPreferences2, "{\n      PreferenceManage…references(context)\n    }");
        return sharedPreferences2;
    }

    public void v(int i2, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f155g).dispatchSemanticsAction(i2, eVar);
    }

    public void w(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f155g).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int y(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f156h;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0091a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public ColorStateList z(int i2) {
        int resourceId;
        ColorStateList b2;
        TypedArray typedArray = (TypedArray) this.f154f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b2 = d.b.b((Context) this.f155g, resourceId)) == null) ? typedArray.getColorStateList(i2) : b2;
    }

    public C0031i(ImageView imageView) {
        this.f153e = 7;
        this.f154f = imageView;
    }

    public C0031i(B.m mVar) {
        this.f153e = 4;
        this.f154f = mVar;
        this.f155g = new C0092b();
        this.f156h = new ArrayList();
    }

    public C0031i(Context context) {
        this.f153e = 2;
        C0.f fVar = new C0.f(0, context);
        this.f155g = context;
        this.f154f = fVar;
    }

    public C0031i(Context context, TypedArray typedArray) {
        this.f153e = 8;
        this.f155g = context;
        this.f154f = typedArray;
    }

    public C0031i(C0023a c0023a) {
        this.f153e = 3;
        this.f154f = new m0.D(30);
        this.f155g = new ArrayList();
        this.f156h = new ArrayList();
        new C0023a(18, this);
    }

    public C0031i(o0.b bVar, FlutterJNI flutterJNI) {
        this.f153e = 11;
        n0.d dVar = new n0.d(5, this);
        C0079n c0079n = new C0079n(bVar, "flutter/accessibility", w0.o.f3561a, null);
        this.f154f = c0079n;
        c0079n.i(dVar);
        this.f155g = flutterJNI;
    }

    public C0031i(b1.d dVar, L.d dVar2, N n2) {
        this.f153e = 1;
        this.f154f = dVar;
        this.f155g = dVar2;
        this.f156h = n2;
    }

    public C0031i(InterfaceC0260A interfaceC0260A) {
        this.f153e = 10;
        this.f155g = new HashSet();
        this.f156h = interfaceC0260A;
        m0.q qVar = (m0.q) interfaceC0260A;
        this.f154f = new m0.z[]{new m0.w(qVar.getBinaryMessenger()), new P.O(new C0312b(qVar.getBinaryMessenger()))};
        new n0.d(qVar.getBinaryMessenger()).f3284f = this;
    }

    public C0031i(InterfaceC0320f interfaceC0320f, Context context, C0023a c0023a) {
        this.f153e = 0;
        Q0.h.e(interfaceC0320f, "messenger");
        Q0.h.e(context, "context");
        this.f154f = interfaceC0320f;
        this.f155g = context;
        this.f156h = c0023a;
        try {
            InterfaceC0030h.f151a.getClass();
            C0029g.b(interfaceC0320f, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public C0031i(B.m mVar, byte b2) {
        this.f153e = 5;
        this.f154f = mVar;
        this.f155g = new ReentrantLock();
        this.f156h = new WeakHashMap();
    }
}
