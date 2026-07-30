package c0;

import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.n;
import e0.b0;
import e0.c0;
import e0.d0;
import e0.f0;
import e0.h0;
import e0.i0;
import f0.k;
import f0.l;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import m0.f;
import m0.j;
import m0.m;
import n0.g;
import n0.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements f0, h, j, i, n0.b, n0.c, w.h {

    /* renamed from: e, reason: collision with root package name */
    public static a f62e;

    /* renamed from: f, reason: collision with root package name */
    public static a f63f;

    /* renamed from: g, reason: collision with root package name */
    public static i0 f64g;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f65b;

    /* renamed from: c, reason: collision with root package name */
    public Object f66c;

    /* renamed from: d, reason: collision with root package name */
    public Object f67d;

    public a(g0.b bVar, int i2) {
        this.f65b = i2;
        switch (i2) {
            case 8:
                n nVar = new n(15, this);
                h0 h0Var = new h0(bVar, "flutter/platform", g.f932b);
                this.f66c = h0Var;
                h0Var.h(nVar);
                break;
            case 11:
                n nVar2 = new n(28, this);
                h0 h0Var2 = new h0(bVar, "flutter/textinput", g.f932b);
                this.f66c = h0Var2;
                h0Var2.h(nVar2);
                break;
            default:
                n nVar3 = new n(12, this);
                h0 h0Var3 = new h0(bVar, "flutter/localization", g.f932b);
                this.f66c = h0Var3;
                h0Var3.h(nVar3);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int t(a aVar, JSONArray jSONArray) {
        String str;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : o.d.b(4)) {
                if (i5 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i5 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i5 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i5 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int a2 = o.d.a(i5);
                    if (a2 == 0) {
                        i2 |= 1;
                    } else if (a2 == 1) {
                        i2 |= 4;
                    } else if (a2 == 2) {
                        i2 |= 2;
                    } else if (a2 == 3) {
                        i2 |= 8;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            l.h("No such DeviceOrientation: ", string);
            return 0;
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i3 == 2) {
                    return 0;
                }
                if (i3 != 4) {
                    return i3 != 8 ? 1 : 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList u(a aVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (f fVar : f.values()) {
                if (fVar.f784b.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(f.f781c);
                    } else if (ordinal == 1) {
                        arrayList.add(f.f782d);
                    }
                }
            }
            l.h("No such SystemUiOverlay: ", string);
            return null;
        }
        return arrayList;
    }

    public static int v(a aVar, String str) {
        String str2;
        for (int i2 : o.d.b(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int a2 = o.d.a(i2);
                if (a2 == 0) {
                    return 1;
                }
                if (a2 != 1) {
                    return a2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        l.h("No such SystemUiMode: ", str);
        return 0;
    }

    public static m0.e w(a aVar, JSONObject jSONObject) {
        return new m0.e(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? e0.j.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : e0.j.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap x(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public static a y() {
        if (f62e == null) {
            b bVar = new b(2);
            d0.a aVar = new d0.a();
            aVar.f75a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            j0.d dVar = new j0.d();
            dVar.f653a = false;
            dVar.f654b = false;
            dVar.f658f = flutterJNI;
            dVar.f659g = newCachedThreadPool;
            a aVar2 = new a(1, false);
            aVar2.f66c = dVar;
            aVar2.f67d = bVar;
            f62e = aVar2;
        }
        return f62e;
    }

    @Override // m0.j
    public void a(int i2) {
        ((io.flutter.plugin.platform.i) this.f67d).q(i2);
        ((io.flutter.plugin.platform.j) this.f66c).v.a(i2);
    }

    @Override // io.flutter.plugin.platform.h
    public void b() {
        ((io.flutter.plugin.platform.j) this.f66c).b();
        ((io.flutter.plugin.platform.i) this.f67d).b();
    }

    @Override // m0.j
    public void c(m0.g gVar) {
        k kVar = ((io.flutter.plugin.platform.i) ((io.flutter.plugin.platform.i) this.f67d).f512o.f40c).f500b;
        String str = gVar.f786b;
        if (kVar.f329a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    @Override // m0.j
    public void d(boolean z2) {
        ((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) this.f66c).v.f40c).f528r = z2;
    }

    @Override // io.flutter.plugin.platform.h
    public void e(io.flutter.view.i iVar) {
        ((io.flutter.plugin.platform.j) this.f66c).f520i.f488a = iVar;
        ((io.flutter.plugin.platform.i) this.f67d).f505g.f488a = iVar;
    }

    @Override // m0.j
    public void f(int i2, double d2, double d3) {
        ((io.flutter.plugin.platform.i) this.f67d).q(i2);
        ((io.flutter.plugin.platform.j) this.f66c).v.f(i2, d2, d3);
    }

    @Override // m0.j
    public void g(int i2, int i3) {
        ((io.flutter.plugin.platform.i) this.f67d).q(i2);
        ((io.flutter.plugin.platform.j) this.f66c).v.g(i2, i3);
    }

    @Override // e0.f0
    public void h(KeyEvent keyEvent, final d0 d0Var) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            d0Var.a(false);
            return;
        }
        Character a2 = ((c0) this.f67d).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        m0.b bVar = (m0.b) this.f66c;
        final n0.b bVar2 = new n0.b() { // from class: e0.x
            @Override // n0.b
            public void o(Object obj) {
                x xVar = (x) d0Var;
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((d0) d0Var).a(z3);
            }
        };
        h0 h0Var = bVar.f767a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a2.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        h0Var.g(hashMap, new n0.b() { // from class: e0.x
            @Override // n0.b
            public void o(Object obj) {
                x xVar = (x) bVar2;
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((d0) bVar2).a(z3);
            }
        });
    }

    @Override // m0.j
    public void i(m0.i iVar, l lVar) {
        ((io.flutter.plugin.platform.i) this.f67d).q(iVar.f803a);
        ((io.flutter.plugin.platform.j) this.f66c).v.i(iVar, lVar);
    }

    @Override // m0.j
    public long j(m0.g gVar) {
        ((io.flutter.plugin.platform.j) this.f66c).v.j(gVar);
        throw null;
    }

    @Override // io.flutter.plugin.platform.h
    public boolean k(int i2) {
        ((io.flutter.plugin.platform.i) this.f67d).q(i2);
        return ((io.flutter.plugin.platform.j) this.f66c).k(i2);
    }

    @Override // n0.i
    public void l(a aVar, m0.k kVar) {
        h0 h0Var = (h0) ((n) this.f67d).f40c;
        if (h0Var == null) {
            kVar.d((Map) this.f66c);
            return;
        }
        if (!((String) aVar.f66c).equals("getKeyboardState")) {
            kVar.b();
            return;
        }
        try {
            this.f66c = Collections.unmodifiableMap(((b0) ((f0[]) h0Var.f151a)[0]).f130c);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
        kVar.d((Map) this.f66c);
    }

    @Override // m0.j
    public void m(int i2) {
        ((io.flutter.plugin.platform.i) this.f67d).q(i2);
        ((io.flutter.plugin.platform.j) this.f66c).v.m(i2);
    }

    @Override // n0.c
    public void n(ByteBuffer byteBuffer, g0.f fVar) {
        switch (this.f65b) {
            case 13:
                h0 h0Var = (h0) this.f67d;
                try {
                    ((n) this.f66c).u(((n0.h) h0Var.f153c).a(byteBuffer), new a(12, this, fVar));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#".concat((String) h0Var.f152b), "Failed to handle message", e2);
                    fVar.a(null);
                    return;
                }
            default:
                h0 h0Var2 = (h0) this.f67d;
                n0.j jVar = (n0.j) h0Var2.f153c;
                try {
                    ((i) this.f66c).l(jVar.d(byteBuffer), new m0.k(1, this, fVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) h0Var2.f152b), "Failed to handle method call", e3);
                    fVar.a(jVar.f(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // n0.b
    public void o(Object obj) {
        switch (this.f65b) {
            case 10:
                h0 h0Var = (h0) this.f67d;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) h0Var.f151a;
                m mVar = (m) this.f66c;
                concurrentLinkedQueue.remove(mVar);
                if (!((ConcurrentLinkedQueue) h0Var.f151a).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + mVar.f816a);
                    break;
                }
                break;
            default:
                ((g0.f) this.f66c).a(((n0.h) ((h0) ((a) this.f67d).f67d).f153c).b(obj));
                break;
        }
    }

    @Override // m0.j
    public void p(m0.h hVar) {
        ((io.flutter.plugin.platform.i) this.f67d).q(hVar.f788a);
        ((io.flutter.plugin.platform.j) this.f66c).v.p(hVar);
    }

    @Override // io.flutter.plugin.platform.h
    public void q(int i2) {
        ((io.flutter.plugin.platform.i) this.f67d).q(i2);
        ((io.flutter.plugin.platform.j) this.f66c).q(i2);
    }

    @Override // m0.j
    public boolean r() {
        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.i) this.f67d).f503e;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    @Override // m0.j
    public void s(m0.g gVar) {
        ((io.flutter.plugin.platform.j) this.f66c).v.s(gVar);
        throw null;
    }

    public /* synthetic */ a(int i2, boolean z2) {
        this.f65b = i2;
    }

    public a(p0.a aVar, n nVar) {
        this.f65b = 16;
        this.f66c = aVar;
        this.f67d = nVar;
        nVar.f40c = new o0.a(1, this);
    }

    public a(m0.b bVar) {
        this.f65b = 2;
        this.f67d = new c0();
        this.f66c = bVar;
    }

    public a(n nVar) {
        this.f65b = 6;
        this.f67d = nVar;
        this.f66c = new HashMap();
    }

    public a(View view, InputMethodManager inputMethodManager, n nVar) {
        this.f65b = 4;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f67d = view;
        this.f66c = inputMethodManager;
        nVar.f40c = this;
    }

    public a(String str, Object obj) {
        this.f65b = 14;
        this.f66c = str;
        this.f67d = obj;
    }

    public a(w.b bVar) {
        this.f65b = 18;
        a aVar = new a(17);
        this.f66c = bVar;
        this.f67d = aVar;
    }

    public a(int i2) {
        this.f65b = i2;
        switch (i2) {
            case 17:
                this.f66c = new ReentrantLock();
                this.f67d = new LinkedHashMap();
                break;
            default:
                this.f66c = new LongSparseArray();
                this.f67d = new PriorityQueue();
                break;
        }
    }

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f65b = i2;
        this.f67d = obj;
        this.f66c = obj2;
    }

    public a(g0.b bVar, PackageManager packageManager) {
        this.f65b = 9;
        n nVar = new n(20, this);
        this.f66c = packageManager;
        new h0(bVar, "flutter/processtext", n0.m.f936a).h(nVar);
    }
}
