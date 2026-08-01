package A;

import B.m;
import E.AbstractC0008i;
import E.C;
import E.D;
import E.E;
import E.G;
import E.H;
import E.v;
import G.g;
import M.f;
import M.l;
import N.i;
import N.j;
import N.k;
import N.n;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import m.AbstractC0068d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.C0088b;

/* loaded from: classes.dex */
public final class a implements G, j, N.c, N.d, h, u.h {

    /* renamed from: e, reason: collision with root package name */
    public static a f0e;

    /* renamed from: f, reason: collision with root package name */
    public static H f1f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4d;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f2b = i2;
        this.f3c = obj;
        this.f4d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0090, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(a aVar, JSONArray jSONArray) {
        String str;
        aVar.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : AbstractC0068d.b(4)) {
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
                    int a2 = AbstractC0068d.a(i5);
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
            throw new NoSuchFieldException("No such DeviceOrientation: " + string);
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
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList j(a aVar, JSONArray jSONArray) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (f fVar : f.values()) {
                if (fVar.f343b.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(f.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(f.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + string);
        }
        return arrayList;
    }

    public static int k(a aVar, String str) {
        String str2;
        aVar.getClass();
        for (int i2 : AbstractC0068d.b(4)) {
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
                int a2 = AbstractC0068d.a(i2);
                if (a2 == 0) {
                    return 1;
                }
                if (a2 != 1) {
                    return a2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException("No such SystemUiMode: " + str);
    }

    public static m l(a aVar, JSONObject jSONObject) {
        aVar.getClass();
        return new m(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? AbstractC0008i.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? AbstractC0008i.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap n(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    @Override // N.d
    public void a(ByteBuffer byteBuffer, g gVar) {
        switch (this.f2b) {
            case 11:
                e eVar = (e) this.f4d;
                try {
                    ((N.b) this.f3c).f(((i) eVar.f9d).b(byteBuffer), new a(this, gVar, 10, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f8c), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                e eVar2 = (e) this.f4d;
                try {
                    ((j) this.f3c).g(((k) eVar2.f9d).g(byteBuffer), new M.j(1, this, gVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ((String) eVar2.f8c), "Failed to handle method call", e3);
                    gVar.a(((k) eVar2.f9d).a(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void b() {
        ((io.flutter.plugin.platform.j) this.f3c).b();
        ((io.flutter.plugin.platform.i) this.f4d).b();
    }

    @Override // E.G
    public void c(KeyEvent keyEvent, final E e2) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            e2.a(false);
            return;
        }
        Character a2 = ((D) this.f4d).a(keyEvent.getUnicodeChar());
        boolean z = action != 0;
        final N.c cVar = new N.c() { // from class: E.y
            @Override // N.c
            public void e(Object obj) {
                boolean z2 = false;
                if (obj != null) {
                    try {
                        z2 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e3) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
                    }
                }
                ((E) e2).a(z2);
            }
        };
        M.c cVar2 = (M.c) this.f3c;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
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
        cVar2.f332a.j(hashMap, new N.c() { // from class: E.y
            @Override // N.c
            public void e(Object obj) {
                boolean z2 = false;
                if (obj != null) {
                    try {
                        z2 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e3) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
                    }
                }
                ((E) cVar).a(z2);
            }
        });
    }

    @Override // io.flutter.plugin.platform.h
    public void d(io.flutter.view.g gVar) {
        ((io.flutter.plugin.platform.j) this.f3c).f725i.f694a = gVar;
        ((io.flutter.plugin.platform.i) this.f4d).f710g.f694a = gVar;
    }

    @Override // N.c
    public void e(Object obj) {
        switch (this.f2b) {
            case 8:
                D.b bVar = (D.b) this.f4d;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f99a;
                l lVar = (l) this.f3c;
                concurrentLinkedQueue.remove(lVar);
                if (!((ConcurrentLinkedQueue) bVar.f99a).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(lVar.f376a));
                    break;
                }
                break;
            default:
                ((g) this.f3c).a(((i) ((e) ((a) this.f4d).f4d).f9d).c(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void f(int i2) {
        ((io.flutter.plugin.platform.i) this.f4d).f(i2);
        ((io.flutter.plugin.platform.j) this.f3c).f(i2);
    }

    @Override // N.j
    public void g(a aVar, M.j jVar) {
        B.k kVar = (B.k) this.f4d;
        if (((D.b) kVar.f44c) == null) {
            jVar.c((Map) this.f3c);
            return;
        }
        String str = (String) aVar.f3c;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            jVar.b();
            return;
        }
        try {
            this.f3c = Collections.unmodifiableMap(((C) ((G[]) ((D.b) kVar.f44c).f99a)[0]).f109c);
        } catch (IllegalStateException e2) {
            jVar.a("error", e2.getMessage(), null);
        }
        jVar.c((Map) this.f3c);
    }

    @Override // io.flutter.plugin.platform.h
    public boolean h(int i2) {
        ((io.flutter.plugin.platform.i) this.f4d).f(i2);
        return ((io.flutter.plugin.platform.j) this.f3c).h(i2);
    }

    public Object m(String str) {
        Object obj = this.f4d;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public /* synthetic */ a(int i2, boolean z) {
        this.f2b = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z) {
        this.f2b = i2;
        this.f4d = obj;
        this.f3c = obj2;
    }

    public a(v vVar, B.k kVar) {
        this.f2b = 14;
        this.f3c = vVar;
        this.f4d = kVar;
        kVar.f44c = new B.k(28, this);
    }

    public a(M.c cVar) {
        this.f2b = 1;
        this.f4d = new D();
        this.f3c = cVar;
    }

    public a(B.k kVar) {
        this.f2b = 4;
        this.f4d = kVar;
        this.f3c = new HashMap();
    }

    public a(v vVar, InputMethodManager inputMethodManager, B.k kVar) {
        this.f2b = 15;
        if (Build.VERSION.SDK_INT >= 33) {
            vVar.setAutoHandwritingEnabled(false);
        }
        this.f4d = vVar;
        this.f3c = inputMethodManager;
        kVar.f44c = this;
    }

    public a(C0088b c0088b) {
        this.f2b = 18;
        a aVar = new a(17);
        this.f3c = c0088b;
        this.f4d = aVar;
    }

    public a(int i2) {
        this.f2b = i2;
        switch (i2) {
            case 17:
                this.f3c = new ReentrantLock();
                this.f4d = new LinkedHashMap();
                break;
            default:
                this.f3c = new LongSparseArray();
                this.f4d = new PriorityQueue();
                break;
        }
    }

    public a(G.b bVar, int i2) {
        this.f2b = i2;
        switch (i2) {
            case 6:
                B.k kVar = new B.k(13, this);
                e eVar = new e(bVar, "flutter/platform", N.h.f407b, null);
                this.f3c = eVar;
                eVar.l(kVar);
                break;
            case 9:
                B.k kVar2 = new B.k(26, this);
                e eVar2 = new e(bVar, "flutter/textinput", N.h.f407b, null);
                this.f3c = eVar2;
                eVar2.l(kVar2);
                break;
            default:
                B.k kVar3 = new B.k(10, this);
                e eVar3 = new e(bVar, "flutter/localization", N.h.f407b, null);
                this.f3c = eVar3;
                eVar3.l(kVar3);
                break;
        }
    }

    public a(G.b bVar, PackageManager packageManager) {
        this.f2b = 7;
        B.k kVar = new B.k(18, this);
        this.f3c = packageManager;
        new e(bVar, "flutter/processtext", n.f411a, null).l(kVar);
    }
}
