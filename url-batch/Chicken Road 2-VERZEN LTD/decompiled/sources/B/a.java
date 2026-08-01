package B;

import D.AbstractC0009j;
import D.F;
import D.G;
import D.H;
import D.J;
import D.K;
import D.u;
import D.y;
import M.f;
import M.g;
import M.m;
import N.j;
import N.n;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.k;
import io.flutter.view.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import n.AbstractC0077d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.C0099b;
import v.InterfaceC0105h;

/* loaded from: classes.dex */
public final class a implements J, j, N.c, N.d, i, InterfaceC0105h {

    /* renamed from: e, reason: collision with root package name */
    public static a f0e;

    /* renamed from: f, reason: collision with root package name */
    public static K f1f;

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
            for (int i5 : AbstractC0077d.b(4)) {
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
                    int a2 = AbstractC0077d.a(i5);
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
            for (g gVar : g.values()) {
                if (gVar.f285b.equals(string)) {
                    int ordinal = gVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(g.f282c);
                    } else if (ordinal == 1) {
                        arrayList.add(g.f283d);
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
        for (int i2 : AbstractC0077d.b(4)) {
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
                int a2 = AbstractC0077d.a(i2);
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

    public static f l(a aVar, JSONObject jSONObject) {
        aVar.getClass();
        return new f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? AbstractC0009j.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? AbstractC0009j.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap m(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    @Override // D.J
    public void a(KeyEvent keyEvent, final H h2) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            h2.a(false);
            return;
        }
        Character a2 = ((G) this.f4d).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        final N.c cVar = new N.c() { // from class: D.B
            @Override // N.c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((H) h2).a(z3);
            }
        };
        M.c cVar2 = (M.c) this.f3c;
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
        cVar2.f267a.g(hashMap, new N.c() { // from class: D.B
            @Override // N.c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((H) cVar).a(z3);
            }
        });
    }

    @Override // io.flutter.plugin.platform.i
    public void b() {
        ((k) this.f3c).b();
        ((io.flutter.plugin.platform.j) this.f4d).b();
    }

    @Override // N.d
    public void c(ByteBuffer byteBuffer, F.g gVar) {
        switch (this.f2b) {
            case 11:
                e eVar = (e) this.f4d;
                try {
                    ((N.b) this.f3c).d(((N.i) eVar.f9c).b(byteBuffer), new a(this, gVar, 10, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f8b), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                C.b bVar = (C.b) this.f4d;
                try {
                    ((j) this.f3c).g(((N.k) bVar.f15c).g(byteBuffer), new M.k(1, this, gVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) bVar.f14b), "Failed to handle method call", e3);
                    gVar.a(((N.k) bVar.f15c).a(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // io.flutter.plugin.platform.i
    public void d(h hVar) {
        ((k) this.f3c).f672i.f639a = hVar;
        ((io.flutter.plugin.platform.j) this.f4d).f657g.f639a = hVar;
    }

    @Override // N.c
    public void e(Object obj) {
        switch (this.f2b) {
            case 8:
                C.b bVar = (C.b) this.f4d;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f13a;
                m mVar = (m) this.f3c;
                concurrentLinkedQueue.remove(mVar);
                if (!((ConcurrentLinkedQueue) bVar.f13a).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + mVar.f318a);
                    break;
                }
                break;
            default:
                ((F.g) this.f3c).a(((N.i) ((e) ((a) this.f4d).f4d).f9c).c(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public void f(int i2) {
        ((io.flutter.plugin.platform.j) this.f4d).f(i2);
        ((k) this.f3c).f(i2);
    }

    @Override // N.j
    public void g(a aVar, M.k kVar) {
        u uVar = (u) this.f4d;
        if (((C.b) uVar.f111c) == null) {
            kVar.c((Map) this.f3c);
            return;
        }
        String str = (String) aVar.f3c;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            kVar.b();
            return;
        }
        try {
            this.f3c = Collections.unmodifiableMap(((F) ((J[]) ((C.b) uVar.f111c).f13a)[0]).f31c);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
        kVar.c((Map) this.f3c);
    }

    @Override // io.flutter.plugin.platform.i
    public boolean h(int i2) {
        ((io.flutter.plugin.platform.j) this.f4d).f(i2);
        return ((k) this.f3c).h(i2);
    }

    public /* synthetic */ a(int i2, boolean z2) {
        this.f2b = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z2) {
        this.f2b = i2;
        this.f4d = obj;
        this.f3c = obj2;
    }

    public a(y yVar, u uVar) {
        this.f2b = 14;
        this.f3c = yVar;
        this.f4d = uVar;
        uVar.f111c = new u(27, this);
    }

    public a(M.c cVar) {
        this.f2b = 1;
        this.f4d = new G();
        this.f3c = cVar;
    }

    public a(u uVar) {
        this.f2b = 4;
        this.f4d = uVar;
        this.f3c = new HashMap();
    }

    public a(y yVar, InputMethodManager inputMethodManager, u uVar) {
        this.f2b = 15;
        if (Build.VERSION.SDK_INT >= 33) {
            yVar.setAutoHandwritingEnabled(false);
        }
        this.f4d = yVar;
        this.f3c = inputMethodManager;
        uVar.f111c = this;
    }

    public a(C0099b c0099b) {
        this.f2b = 18;
        a aVar = new a(17);
        this.f3c = c0099b;
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

    public a(F.b bVar, int i2) {
        this.f2b = i2;
        switch (i2) {
            case 6:
                u uVar = new u(12, this);
                C.b bVar2 = new C.b(bVar, "flutter/platform", N.h.f349b);
                this.f3c = bVar2;
                bVar2.i(uVar);
                break;
            case 9:
                u uVar2 = new u(25, this);
                C.b bVar3 = new C.b(bVar, "flutter/textinput", N.h.f349b);
                this.f3c = bVar3;
                bVar3.i(uVar2);
                break;
            default:
                u uVar3 = new u(9, this);
                C.b bVar4 = new C.b(bVar, "flutter/localization", N.h.f349b);
                this.f3c = bVar4;
                bVar4.i(uVar3);
                break;
        }
    }

    public a(F.b bVar, PackageManager packageManager) {
        this.f2b = 7;
        u uVar = new u(17, this);
        this.f3c = packageManager;
        new C.b(bVar, "flutter/processtext", n.f353a).i(uVar);
    }
}
