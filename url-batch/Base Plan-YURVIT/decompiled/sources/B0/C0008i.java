package B0;

import F.C0032n;
import N.AbstractC0044a;
import N.C0045b;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.datastore.preferences.protobuf.k0;
import androidx.recyclerview.widget.RecyclerView;
import e.AbstractC0121a;
import i.C0172t;
import io.flutter.embedding.engine.FlutterJNI;
import j0.ThreadFactoryC0181a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import l.BinderC0193a;
import o0.C0211b;
import org.xmlpull.v1.XmlPullParserException;
import p0.C0220e;
import u0.C0231c;
import v0.C0236a;
import v0.InterfaceC0241f;

/* renamed from: B0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008i implements InterfaceC0007h, Z0.d {

    /* renamed from: i, reason: collision with root package name */
    public static C0008i f82i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83e;

    /* renamed from: f, reason: collision with root package name */
    public Object f84f;

    /* renamed from: g, reason: collision with root package name */
    public Object f85g;

    /* renamed from: h, reason: collision with root package name */
    public Object f86h;

    public /* synthetic */ C0008i(Object obj, Object obj2, Object obj3, int i2) {
        this.f83e = i2;
        this.f84f = obj;
        this.f85g = obj2;
        this.f86h = obj3;
    }

    public static C0008i A() {
        if (f82i == null) {
            C0000a c0000a = new C0000a(24);
            ThreadFactoryC0181a threadFactoryC0181a = new ThreadFactoryC0181a();
            threadFactoryC0181a.f2643a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC0181a);
            FlutterJNI flutterJNI = new FlutterJNI();
            C0220e c0220e = new C0220e();
            c0220e.f2938a = false;
            c0220e.f2942e = flutterJNI;
            c0220e.f2943f = newCachedThreadPool;
            C0008i c0008i = new C0008i(6);
            c0008i.f84f = c0220e;
            c0008i.f85g = c0000a;
            c0008i.f86h = newCachedThreadPool;
            f82i = c0008i;
        }
        return f82i;
    }

    public static C0008i D(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0008i(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public void B(String str, Object obj, u0.k kVar) {
        ((InterfaceC0241f) this.f84f).e((String) this.f85g, ((v0.l) this.f86h).f(new N.P(25, str, obj)), kVar == null ? null : new C0236a(1, this, kVar));
    }

    public void C(Uri uri, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        try {
            ((b.b) ((b.d) this.f84f)).a((BinderC0193a) this.f85g, uri, bundle, arrayList);
        } catch (RemoteException unused) {
        }
    }

    public void E(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        HashSet hashSet = (HashSet) this.f85g;
        k0.z zVar = (k0.z) this.f86h;
        if (zVar != null) {
            k0.o oVar = (k0.o) zVar;
            io.flutter.plugin.editing.l lVar = oVar.f2731q;
            boolean z2 = false;
            if (lVar.f2441b.isAcceptingText() && (cVar = lVar.f2449j) != null) {
                io.flutter.plugin.editing.f fVar = cVar.f2400d;
                if (keyEvent.getAction() == 0) {
                    if (keyEvent.getKeyCode() == 21) {
                        z2 = cVar.d(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 22) {
                        z2 = cVar.d(false, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 19) {
                        z2 = cVar.e(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 20) {
                        z2 = cVar.e(false, keyEvent.isShiftPressed());
                    } else {
                        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = cVar.f2401e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                cVar.performEditorAction(editorInfo.imeOptions & 255);
                                z2 = true;
                            }
                        }
                        int selectionStart = Selection.getSelectionStart(fVar);
                        int selectionEnd = Selection.getSelectionEnd(fVar);
                        int unicodeChar = keyEvent.getUnicodeChar();
                        if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                            int min = Math.min(selectionStart, selectionEnd);
                            int max = Math.max(selectionStart, selectionEnd);
                            cVar.beginBatchEdit();
                            if (min != max) {
                                fVar.delete(min, max);
                            }
                            fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                            int i2 = min + 1;
                            cVar.setSelection(i2, i2);
                            cVar.endBatchEdit();
                            z2 = true;
                        }
                    }
                }
            }
            if (z2) {
                return;
            }
            hashSet.add(keyEvent);
            oVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void F(Activity activity, W.k kVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f86h;
        P0.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f85g;
        reentrantLock.lock();
        try {
            if (kVar.equals((W.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((Z.l) ((E) this.f84f).f20f).f1070b.iterator();
            while (it.hasNext()) {
                Z.k kVar2 = (Z.k) it.next();
                if (kVar2.f1064a.equals(activity)) {
                    kVar2.f1066c = kVar;
                    kVar2.f1065b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void G() {
        ((TypedArray) this.f84f).recycle();
    }

    public void H(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0044a abstractC0044a = (AbstractC0044a) arrayList.get(i2);
            abstractC0044a.getClass();
            k0.C c2 = (k0.C) this.f84f;
            Object[] objArr = c2.f2648b;
            P0.h.e(abstractC0044a, "instance");
            int i3 = c2.f2647a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4] == abstractC0044a) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i5 = c2.f2647a;
            if (i5 < objArr.length) {
                objArr[i5] = abstractC0044a;
                c2.f2647a = i5 + 1;
            }
        }
        arrayList.clear();
    }

    public void I(v0.k kVar) {
        ((InterfaceC0241f) this.f84f).h((String) this.f85g, new N.P(this, kVar, 26, false));
    }

    public Bundle J() {
        Bundle bundle = new Bundle();
        Integer num = (Integer) this.f84f;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) this.f85g;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) this.f86h;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    @Override // B0.InterfaceC0007h
    public Double a(String str, C0009j c0009j) {
        SharedPreferences c2 = c(c0009j);
        if (!c2.contains(str)) {
            return null;
        }
        Object c3 = P.c(c2.getString(str, ""), (C0000a) this.f86h);
        P0.h.c(c3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c3;
    }

    @Override // B0.InterfaceC0007h
    public void b(String str, boolean z2, C0009j c0009j) {
        c(c0009j).edit().putBoolean(str, z2).apply();
    }

    public SharedPreferences c(C0009j c0009j) {
        Context context = (Context) this.f85g;
        String str = c0009j.f87a;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            P0.h.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        P0.h.b(sharedPreferences2);
        return sharedPreferences2;
    }

    @Override // B0.InterfaceC0007h
    public List d(List list, C0009j c0009j) {
        Map<String, ?> all = c(c0009j).getAll();
        P0.h.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            P0.h.d(key, "<get-key>(...)");
            if (P.b(key, entry.getValue(), list != null ? E0.f.T(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return E0.f.S(linkedHashMap.keySet());
    }

    @Override // B0.InterfaceC0007h
    public T e(String str, C0009j c0009j) {
        SharedPreferences c2 = c(c0009j);
        if (!c2.contains(str)) {
            return null;
        }
        String string = c2.getString(str, "");
        P0.h.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new T(string, Q.JSON_ENCODED) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new T(null, Q.PLATFORM_ENCODED) : new T(null, Q.UNEXPECTED_STRING);
    }

    @Override // B0.InterfaceC0007h
    public void f(List list, C0009j c0009j) {
        SharedPreferences c2 = c(c0009j);
        SharedPreferences.Editor edit = c2.edit();
        P0.h.d(edit, "edit(...)");
        Map<String, ?> all = c2.getAll();
        P0.h.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (P.b(str, all.get(str), list != null ? E0.f.T(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        P0.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            P0.h.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // B0.InterfaceC0007h
    public void g(String str, String str2, C0009j c0009j) {
        c(c0009j).edit().putString(str, str2).apply();
    }

    @Override // B0.InterfaceC0007h
    public void h(String str, long j2, C0009j c0009j) {
        c(c0009j).edit().putLong(str, j2).apply();
    }

    public void i(int i2, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f85g).dispatchSemanticsAction(i2, fVar);
    }

    @Override // B0.InterfaceC0007h
    public Map j(List list, C0009j c0009j) {
        Object value;
        Map<String, ?> all = c(c0009j).getAll();
        P0.h.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (P.b(entry.getKey(), entry.getValue(), list != null ? E0.f.T(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = P.c(value, (C0000a) this.f86h);
                P0.h.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // B0.InterfaceC0007h
    public void k(String str, List list, C0009j c0009j) {
        c(c0009j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((C0000a) this.f86h).d(list))).apply();
    }

    @Override // B0.InterfaceC0007h
    public void l(String str, double d2, C0009j c0009j) {
        c(c0009j).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // Z0.d
    public Object m(Z0.e eVar, G0.d dVar) {
        Object m2 = ((Z0.d) this.f84f).m(new C0018t(eVar, (I.d) this.f85g, (O) this.f86h), dVar);
        return m2 == H0.a.f511e ? m2 : D0.h.f206a;
    }

    @Override // B0.InterfaceC0007h
    public void n(String str, String str2, C0009j c0009j) {
        c(c0009j).edit().putString(str, str2).apply();
    }

    @Override // B0.InterfaceC0007h
    public Long o(String str, C0009j c0009j) {
        long j2;
        SharedPreferences c2 = c(c0009j);
        if (!c2.contains(str)) {
            return null;
        }
        try {
            j2 = c2.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = c2.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    @Override // B0.InterfaceC0007h
    public String p(String str, C0009j c0009j) {
        SharedPreferences c2 = c(c0009j);
        if (c2.contains(str)) {
            return c2.getString(str, "");
        }
        return null;
    }

    @Override // B0.InterfaceC0007h
    public Boolean q(String str, C0009j c0009j) {
        SharedPreferences c2 = c(c0009j);
        if (c2.contains(str)) {
            return Boolean.valueOf(c2.getBoolean(str, true));
        }
        return null;
    }

    @Override // B0.InterfaceC0007h
    public ArrayList r(String str, C0009j c0009j) {
        List list;
        SharedPreferences c2 = c(c0009j);
        if (!c2.contains(str)) {
            return null;
        }
        String string = c2.getString(str, "");
        P0.h.b(string);
        if (!string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || (list = (List) P.c(c2.getString(str, ""), (C0000a) this.f86h)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public void s(int i2, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f85g).dispatchSemanticsAction(i2, fVar, serializable);
    }

    public int t(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f86h;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0044a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public String toString() {
        switch (this.f83e) {
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C0045b) this.f85g).toString() + ", hidden list:" + ((ArrayList) this.f86h).size();
            default:
                return super.toString();
        }
    }

    public ColorStateList u(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f84f;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            Context context = (Context) this.f85g;
            Object obj = AbstractC0121a.f1852a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public Drawable v(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f84f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0121a.a((Context) this.f85g, resourceId);
    }

    public Typeface w(int i2, int i3, C0172t c0172t) {
        C0172t c0172t2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f84f).getResourceId(i2, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f86h) == null) {
                this.f86h = new TypedValue();
            }
            Context context = (Context) this.f85g;
            TypedValue typedValue = (TypedValue) this.f86h;
            Object obj = q.g.f2958a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    c0172t.a();
                    return null;
                }
                int i4 = typedValue.assetCookie;
                m.d dVar = r.d.f2966b;
                Typeface typeface = (Typeface) dVar.a(r.d.b(resources, resourceId, charSequence2, i4, i3));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new q.f(c0172t, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e2) {
                    e = e2;
                    c0172t2 = c0172t;
                } catch (XmlPullParserException e3) {
                    e = e3;
                    c0172t2 = c0172t;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        int i5 = typedValue.assetCookie;
                        Typeface n2 = r.d.f2965a.n(context, resources, resourceId, charSequence2, i3);
                        if (n2 != null) {
                            dVar.b(r.d.b(resources, resourceId, charSequence2, i5, i3), n2);
                        }
                        if (n2 != null) {
                            new Handler(Looper.getMainLooper()).post(new q.f(c0172t, n2));
                        } else {
                            c0172t.a();
                        }
                        return n2;
                    }
                    q.b x2 = k0.x(resources.getXml(resourceId), resources);
                    if (x2 != null) {
                        return r.d.a(context, x2, resources, resourceId, charSequence2, typedValue.assetCookie, i3, c0172t);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c0172t.a();
                        return null;
                    } catch (IOException e4) {
                        iOException = e4;
                        c0172t2 = c0172t;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        c0172t2.a();
                        return null;
                    } catch (XmlPullParserException e5) {
                        xmlPullParserException = e5;
                        c0172t2 = c0172t;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        c0172t2.a();
                        return null;
                    }
                } catch (IOException e6) {
                    e = e6;
                    iOException = e;
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                    c0172t2.a();
                    return null;
                } catch (XmlPullParserException e7) {
                    e = e7;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                    c0172t2.a();
                    return null;
                }
            }
        }
        return null;
    }

    public View x(int i2) {
        return ((RecyclerView) ((E) this.f84f).f20f).getChildAt(i2);
    }

    public int y() {
        return ((RecyclerView) ((E) this.f84f).f20f).getChildCount();
    }

    public boolean z(KeyEvent keyEvent) {
        k0.y[] yVarArr = (k0.y[]) this.f84f;
        if (((HashSet) this.f85g).remove(keyEvent)) {
            return false;
        }
        if (yVarArr.length <= 0) {
            E(keyEvent);
            return true;
        }
        k0.x xVar = new k0.x(this, keyEvent);
        for (k0.y yVar : yVarArr) {
            yVar.l(keyEvent, new k0.w(xVar));
        }
        return true;
    }

    public C0008i(E e2) {
        this.f83e = 3;
        this.f84f = e2;
        this.f85g = new C0045b();
        this.f86h = new ArrayList();
    }

    public C0008i(Context context, TypedArray typedArray) {
        this.f83e = 5;
        this.f85g = context;
        this.f84f = typedArray;
    }

    public C0008i(C0000a c0000a) {
        this.f83e = 2;
        this.f84f = new k0.C(30);
        this.f85g = new ArrayList();
        this.f86h = new ArrayList();
        new C0000a(12, this);
    }

    public C0008i(m0.b bVar, FlutterJNI flutterJNI) {
        this.f83e = 10;
        C0211b c0211b = new C0211b(2, this);
        C0032n c0032n = new C0032n(bVar, "flutter/accessibility", v0.n.f3089a, null);
        this.f84f = c0032n;
        c0032n.j(c0211b);
        this.f85g = flutterJNI;
    }

    public C0008i(k0.z zVar) {
        this.f83e = 7;
        this.f85g = new HashSet();
        this.f86h = zVar;
        k0.o oVar = (k0.o) zVar;
        this.f84f = new k0.y[]{new k0.v(oVar.getBinaryMessenger()), new N.P(new C0231c(oVar.getBinaryMessenger()))};
        new C0211b(oVar.getBinaryMessenger()).f2915f = this;
    }

    public C0008i(int i2) {
        this.f83e = i2;
        switch (i2) {
            case 11:
                this.f84f = new ConcurrentLinkedQueue();
                break;
        }
    }

    public C0008i(InterfaceC0241f interfaceC0241f, Context context, C0000a c0000a) {
        this.f83e = 0;
        P0.h.e(interfaceC0241f, "messenger");
        P0.h.e(context, "context");
        this.f84f = interfaceC0241f;
        this.f85g = context;
        this.f86h = c0000a;
        try {
            InterfaceC0007h.f81a.getClass();
            C0006g.b(interfaceC0241f, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public C0008i(E e2, byte b2) {
        this.f83e = 4;
        this.f84f = e2;
        this.f85g = new ReentrantLock();
        this.f86h = new WeakHashMap();
    }
}
