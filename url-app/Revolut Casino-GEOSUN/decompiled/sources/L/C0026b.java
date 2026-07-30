package L;

import D.C0013n;
import a.AbstractC0069a;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import b0.ThreadFactoryC0097a;
import d.AbstractC0110a;
import e0.C0114b;
import h.C0165s;
import io.flutter.embedding.engine.FlutterJNI;
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
import m0.C0192b;
import m0.C0193c;
import m0.C0201k;
import n0.C0209a;
import org.xmlpull.v1.XmlPullParserException;
import s0.C0227f;
import s0.C0229h;
import s0.InterfaceC0228g;
import u0.C0247g;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026b implements InterfaceC0228g, P0.d {

    /* renamed from: i, reason: collision with root package name */
    public static C0026b f518i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f519e;

    /* renamed from: f, reason: collision with root package name */
    public Object f520f;

    /* renamed from: g, reason: collision with root package name */
    public Object f521g;

    /* renamed from: h, reason: collision with root package name */
    public Object f522h;

    public /* synthetic */ C0026b(Object obj, Object obj2, Object obj3, int i2) {
        this.f519e = i2;
        this.f521g = obj;
        this.f520f = obj2;
        this.f522h = obj3;
    }

    public static C0026b C() {
        if (f518i == null) {
            E.a aVar = new E.a(15);
            ThreadFactoryC0097a threadFactoryC0097a = new ThreadFactoryC0097a();
            threadFactoryC0097a.f1639a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC0097a);
            FlutterJNI flutterJNI = new FlutterJNI();
            h0.d dVar = new h0.d();
            dVar.f2336a = false;
            dVar.f2337b = false;
            dVar.f2341f = flutterJNI;
            dVar.f2342g = newCachedThreadPool;
            C0026b c0026b = new C0026b(3);
            c0026b.f521g = dVar;
            c0026b.f520f = aVar;
            c0026b.f522h = newCachedThreadPool;
            f518i = c0026b;
        }
        return f518i;
    }

    public static C0026b E(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0026b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public int A() {
        return ((RecyclerView) ((A.j) this.f521g).f30f).getChildCount();
    }

    public boolean B(KeyEvent keyEvent) {
        if (((HashSet) this.f520f).remove(keyEvent)) {
            return false;
        }
        c0.B[] bArr = (c0.B[]) this.f521g;
        if (bArr.length <= 0) {
            F(keyEvent);
            return true;
        }
        c0.A a2 = new c0.A(this, keyEvent);
        for (c0.B b2 : bArr) {
            b2.b(keyEvent, new c0.z(a2));
        }
        return true;
    }

    public void D(String str, Object obj, C0201k c0201k) {
        ((n0.f) this.f521g).l((String) this.f520f, ((n0.l) this.f522h).b(new Q(21, str, obj)), c0201k == null ? null : new C0209a(1, this, c0201k));
    }

    public void F(KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        c0.r rVar = (c0.r) this.f522h;
        if (rVar != null) {
            io.flutter.plugin.editing.l lVar = rVar.f1753p;
            boolean z2 = false;
            if (lVar.f2437b.isAcceptingText() && (cVar = lVar.f2445j) != null && keyEvent.getAction() == 0) {
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
                        EditorInfo editorInfo = cVar.f2397e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & 255);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f2396d;
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
            if (z2) {
                return;
            }
            HashSet hashSet = (HashSet) this.f520f;
            hashSet.add(keyEvent);
            rVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void G(Activity activity, U.k kVar) {
        F0.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f520f;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f522h;
        try {
            if (kVar.equals((U.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((X.k) ((A.j) this.f521g).f30f).f1080b.iterator();
            while (it.hasNext()) {
                X.j jVar = (X.j) it.next();
                if (jVar.f1074a.equals(activity)) {
                    jVar.f1076c = kVar;
                    jVar.f1075b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void H() {
        ((TypedArray) this.f520f).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r4 = r3.f1667a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6[r4] = r2;
        r3.f1667a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            AbstractC0025a abstractC0025a = (AbstractC0025a) arrayList.get(i2);
            abstractC0025a.getClass();
            c0.E e2 = (c0.E) this.f521g;
            e2.getClass();
            F0.i.e(abstractC0025a, "instance");
            int i3 = e2.f1667a;
            int i4 = 0;
            while (true) {
                Object[] objArr = e2.f1668b;
                if (i4 >= i3) {
                    break;
                } else {
                    if (objArr[i4] == abstractC0025a) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
        }
        arrayList.clear();
    }

    public void J(n0.k kVar) {
        ((n0.f) this.f521g).c((String) this.f520f, new Q(this, kVar, 22, false));
    }

    @Override // s0.InterfaceC0228g
    public List a(List list, C0229h c0229h) {
        Map<String, ?> all = s(c0229h).getAll();
        F0.i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            F0.i.d(key, "<get-key>(...)");
            if (s0.K.b(key, entry.getValue(), list != null ? v0.d.G(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return v0.d.F(linkedHashMap.keySet());
    }

    @Override // s0.InterfaceC0228g
    public void b(String str, String str2, C0229h c0229h) {
        s(c0229h).edit().putString(str, str2).apply();
    }

    @Override // s0.InterfaceC0228g
    public String c(String str, C0229h c0229h) {
        SharedPreferences s2 = s(c0229h);
        if (s2.contains(str)) {
            return s2.getString(str, "");
        }
        return null;
    }

    @Override // P0.d
    public Object d(P0.e eVar, w0.d dVar) {
        Object d2 = ((P0.d) this.f521g).d(new P0.l(eVar, (G.d) this.f520f, (s0.J) this.f522h), dVar);
        return d2 == x0.a.f3094e ? d2 : C0247g.f3005a;
    }

    @Override // s0.InterfaceC0228g
    public Double e(String str, C0229h c0229h) {
        SharedPreferences s2 = s(c0229h);
        if (!s2.contains(str)) {
            return null;
        }
        Object c2 = s0.K.c(s2.getString(str, ""), (E.a) this.f522h);
        F0.i.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c2;
    }

    @Override // s0.InterfaceC0228g
    public s0.N f(String str, C0229h c0229h) {
        SharedPreferences s2 = s(c0229h);
        if (!s2.contains(str)) {
            return null;
        }
        String string = s2.getString(str, "");
        F0.i.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new s0.N(string, s0.L.JSON_ENCODED) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new s0.N(null, s0.L.PLATFORM_ENCODED) : new s0.N(null, s0.L.UNEXPECTED_STRING);
    }

    @Override // s0.InterfaceC0228g
    public Boolean g(String str, C0229h c0229h) {
        SharedPreferences s2 = s(c0229h);
        if (s2.contains(str)) {
            return Boolean.valueOf(s2.getBoolean(str, true));
        }
        return null;
    }

    @Override // s0.InterfaceC0228g
    public ArrayList h(String str, C0229h c0229h) {
        List list;
        SharedPreferences s2 = s(c0229h);
        ArrayList arrayList = null;
        if (s2.contains(str)) {
            String string = s2.getString(str, "");
            F0.i.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) s0.K.c(s2.getString(str, ""), (E.a) this.f522h)) != null) {
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

    @Override // s0.InterfaceC0228g
    public void i(String str, boolean z2, C0229h c0229h) {
        s(c0229h).edit().putBoolean(str, z2).apply();
    }

    @Override // s0.InterfaceC0228g
    public void j(List list, C0229h c0229h) {
        SharedPreferences s2 = s(c0229h);
        SharedPreferences.Editor edit = s2.edit();
        F0.i.d(edit, "edit(...)");
        Map<String, ?> all = s2.getAll();
        F0.i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (s0.K.b(str, all.get(str), list != null ? v0.d.G(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        F0.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            F0.i.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // s0.InterfaceC0228g
    public void l(String str, long j2, C0229h c0229h) {
        s(c0229h).edit().putLong(str, j2).apply();
    }

    @Override // s0.InterfaceC0228g
    public void m(String str, List list, C0229h c0229h) {
        s(c0229h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((E.a) this.f522h).d(list))).apply();
    }

    @Override // s0.InterfaceC0228g
    public void n(String str, double d2, C0229h c0229h) {
        s(c0229h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // s0.InterfaceC0228g
    public Map o(List list, C0229h c0229h) {
        Object value;
        Map<String, ?> all = s(c0229h).getAll();
        F0.i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (s0.K.b(entry.getKey(), entry.getValue(), list != null ? v0.d.G(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c2 = s0.K.c(value, (E.a) this.f522h);
                F0.i.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // s0.InterfaceC0228g
    public void p(String str, String str2, C0229h c0229h) {
        s(c0229h).edit().putString(str, str2).apply();
    }

    @Override // s0.InterfaceC0228g
    public Long q(String str, C0229h c0229h) {
        long j2;
        SharedPreferences s2 = s(c0229h);
        if (!s2.contains(str)) {
            return null;
        }
        try {
            j2 = s2.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j2 = s2.getInt(str, 0);
        }
        return Long.valueOf(j2);
    }

    public void r(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f520f;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f522h).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences s(C0229h c0229h) {
        String str = c0229h.f2896a;
        Context context = (Context) this.f520f;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            F0.i.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        F0.i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void t(int i2, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f520f).dispatchSemanticsAction(i2, eVar);
    }

    public String toString() {
        switch (this.f519e) {
            case 1:
                return ((C0027c) this.f522h).toString() + ", hidden list:" + ((ArrayList) this.f520f).size();
            default:
                return super.toString();
        }
    }

    public void u(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f520f).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int v(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f522h;
        int size = arrayList.size();
        while (i3 < size) {
            ((AbstractC0025a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public ColorStateList w(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f520f;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            Object obj = AbstractC0110a.f1784a;
            ColorStateList colorStateList = ((Context) this.f521g).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public Drawable x(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f520f;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0110a.a((Context) this.f521g, resourceId);
    }

    public Typeface y(int i2, int i3, C0165s c0165s) {
        int i4 = 1;
        int resourceId = ((TypedArray) this.f520f).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f522h) == null) {
            this.f522h = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f522h;
        Object obj = o.f.f2803a;
        Context context = (Context) this.f521g;
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
            c0165s.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        k.d dVar = p.d.f2813b;
        Typeface typeface = (Typeface) dVar.a(p.d.b(resources, resourceId, charSequence2, i5, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new J.g(i4, c0165s, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                o.b w2 = AbstractC0069a.w(resources.getXml(resourceId), resources);
                if (w2 != null) {
                    return p.d.a(context, w2, resources, resourceId, charSequence2, typedValue.assetCookie, i3, c0165s);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0165s.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            Typeface j2 = p.d.f2812a.j(context, resources, resourceId, charSequence2, i3);
            if (j2 != null) {
                dVar.b(p.d.b(resources, resourceId, charSequence2, i6, i3), j2);
            }
            if (j2 != null) {
                new Handler(Looper.getMainLooper()).post(new J.g(i4, c0165s, j2));
            } else {
                c0165s.a();
            }
            return j2;
        } catch (IOException e2) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
            c0165s.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
            c0165s.a();
            return null;
        }
    }

    public View z(int i2) {
        return ((RecyclerView) ((A.j) this.f521g).f30f).getChildAt(i2);
    }

    public C0026b(A.j jVar) {
        this.f519e = 1;
        this.f521g = jVar;
        this.f522h = new C0027c();
        this.f520f = new ArrayList();
    }

    public C0026b(Context context, TypedArray typedArray) {
        this.f519e = 5;
        this.f521g = context;
        this.f520f = typedArray;
    }

    public C0026b(E.a aVar) {
        this.f519e = 0;
        this.f521g = new c0.E(30);
        this.f520f = new ArrayList();
        this.f522h = new ArrayList();
        new E.a(8, this);
    }

    public C0026b(C0114b c0114b, FlutterJNI flutterJNI) {
        this.f519e = 6;
        A.j jVar = new A.j(28, this);
        C0013n c0013n = new C0013n(c0114b, "flutter/accessibility", n0.n.f2786a, null);
        this.f521g = c0013n;
        c0013n.j(jVar);
        this.f520f = flutterJNI;
    }

    public C0026b(c0.r rVar) {
        this.f519e = 4;
        this.f520f = new HashSet();
        this.f522h = rVar;
        this.f521g = new c0.B[]{new c0.y(rVar.getBinaryMessenger()), new Q(new C0192b(rVar.getBinaryMessenger()))};
        new C0193c(rVar.getBinaryMessenger()).f2706f = this;
    }

    public C0026b(int i2) {
        this.f519e = i2;
        switch (i2) {
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f521g = new ConcurrentLinkedQueue();
                break;
        }
    }

    public C0026b(n0.f fVar, Context context, E.a aVar) {
        this.f519e = 9;
        F0.i.e(fVar, "messenger");
        F0.i.e(context, "context");
        this.f521g = fVar;
        this.f520f = context;
        this.f522h = aVar;
        try {
            InterfaceC0228g.f2895d.getClass();
            C0227f.b(fVar, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public C0026b(A.j jVar, byte b2) {
        this.f519e = 2;
        this.f521g = jVar;
        this.f520f = new ReentrantLock();
        this.f522h = new WeakHashMap();
    }
}
