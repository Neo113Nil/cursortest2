package P;

import B0.C0031i;
import B0.C0038p;
import I.C0079n;
import I.C0081p;
import I.C0082q;
import a0.C0134b;
import android.app.ActivityManager;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import h0.C0201i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.C0312b;
import w0.InterfaceC0316b;
import w0.InterfaceC0317c;
import w0.InterfaceC0318d;
import x.C0327f;
import y0.InterfaceC0334a;

/* loaded from: classes.dex */
public final class O implements a0.h, b1.d, w0.l, m0.z, InterfaceC0317c, InterfaceC0318d {

    /* renamed from: h, reason: collision with root package name */
    public static O f872h;

    /* renamed from: i, reason: collision with root package name */
    public static m0.B f873i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f874e;

    /* renamed from: f, reason: collision with root package name */
    public Object f875f;

    /* renamed from: g, reason: collision with root package name */
    public Object f876g;

    public /* synthetic */ O(int i2, Object obj, Object obj2) {
        this.f874e = i2;
        this.f875f = obj;
        this.f876g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x007d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008c A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(O o2, JSONArray jSONArray) {
        String str;
        o2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : K.j.c(4)) {
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
                    int b2 = K.j.b(i5);
                    if (b2 == 0) {
                        i2 |= 1;
                    } else if (b2 == 1) {
                        i2 |= 4;
                    } else if (b2 == 2) {
                        i2 |= 2;
                    } else if (b2 == 3) {
                        i2 |= 8;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            throw new NoSuchFieldException(A0.b.f("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
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
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                return 9;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList f(O o2, JSONArray jSONArray) {
        o2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (v0.e eVar : v0.e.values()) {
                if (eVar.f3485e.equals(string)) {
                    int ordinal = eVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(v0.e.f3482f);
                    } else if (ordinal == 1) {
                        arrayList.add(v0.e.f3483g);
                    }
                }
            }
            throw new NoSuchFieldException(A0.b.f("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int g(O o2, String str) {
        String str2;
        o2.getClass();
        for (int i2 : K.j.c(4)) {
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
                int b2 = K.j.b(i2);
                if (b2 == 0) {
                    return 1;
                }
                if (b2 != 1) {
                    return b2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(A0.b.f("No such SystemUiMode: ", str));
    }

    public static C0201i h(O o2, JSONObject jSONObject) {
        o2.getClass();
        return new C0201i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? A0.b.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? A0.b.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap l(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    @Override // m0.z
    public void a(KeyEvent keyEvent, m0.x xVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            xVar.a(false);
            return;
        }
        Character a2 = ((f1.i) this.f876g).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        C0.f fVar = new C0.f(7, xVar);
        C0312b c0312b = (C0312b) this.f875f;
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
        c0312b.f3475a.h(hashMap, new C0.f(8, fVar));
    }

    @Override // w0.InterfaceC0317c
    public void b(Object obj) {
        switch (this.f874e) {
            case 19:
                C0031i c0031i = (C0031i) this.f876g;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0031i.f154f;
                v0.k kVar = (v0.k) this.f875f;
                concurrentLinkedQueue.remove(kVar);
                if (!((ConcurrentLinkedQueue) c0031i.f154f).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(kVar.f3524a));
                    break;
                }
                break;
            default:
                ((o0.g) this.f875f).a(((w0.k) ((C0079n) ((O) this.f876g).f876g).f691g).b(obj));
                break;
        }
    }

    @Override // w0.InterfaceC0318d
    public void d(ByteBuffer byteBuffer, o0.g gVar) {
        switch (this.f874e) {
            case 22:
                C0079n c0079n = (C0079n) this.f876g;
                try {
                    ((InterfaceC0316b) this.f875f).g(((w0.k) c0079n.f691g).a(byteBuffer), new O(this, gVar, 21, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0079n.f690f), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                C0079n c0079n2 = (C0079n) this.f876g;
                try {
                    ((w0.l) this.f875f).e(((w0.m) c0079n2.f691g).b(byteBuffer), new v0.i(1, this, gVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ((String) c0079n2.f690f), "Failed to handle method call", e3);
                    gVar.a(((w0.m) c0079n2.f691g).d(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // w0.l
    public void e(O o2, v0.i iVar) {
        String str;
        int i2;
        String str2;
        switch (this.f874e) {
            case 10:
                Q0.h.e(o2, "call");
                if (((String) o2.f875f).equals("getDeviceInfo")) {
                    HashMap hashMap = new HashMap();
                    String str3 = Build.BOARD;
                    Q0.h.d(str3, "BOARD");
                    hashMap.put("board", str3);
                    String str4 = Build.BOOTLOADER;
                    Q0.h.d(str4, "BOOTLOADER");
                    hashMap.put("bootloader", str4);
                    String str5 = Build.BRAND;
                    Q0.h.d(str5, "BRAND");
                    hashMap.put("brand", str5);
                    String str6 = Build.DEVICE;
                    Q0.h.d(str6, "DEVICE");
                    hashMap.put("device", str6);
                    String str7 = Build.DISPLAY;
                    Q0.h.d(str7, "DISPLAY");
                    hashMap.put("display", str7);
                    String str8 = Build.FINGERPRINT;
                    Q0.h.d(str8, "FINGERPRINT");
                    hashMap.put("fingerprint", str8);
                    String str9 = Build.HARDWARE;
                    Q0.h.d(str9, "HARDWARE");
                    hashMap.put("hardware", str9);
                    String str10 = Build.HOST;
                    Q0.h.d(str10, "HOST");
                    hashMap.put("host", str10);
                    String str11 = Build.ID;
                    Q0.h.d(str11, "ID");
                    hashMap.put("id", str11);
                    String str12 = Build.MANUFACTURER;
                    Q0.h.d(str12, "MANUFACTURER");
                    hashMap.put("manufacturer", str12);
                    String str13 = Build.MODEL;
                    Q0.h.d(str13, "MODEL");
                    hashMap.put("model", str13);
                    String str14 = Build.PRODUCT;
                    Q0.h.d(str14, "PRODUCT");
                    hashMap.put("product", str14);
                    String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                    Q0.h.d(strArr, "SUPPORTED_32_BIT_ABIS");
                    hashMap.put("supported32BitAbis", G0.e.O(Arrays.copyOf(strArr, strArr.length)));
                    String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                    Q0.h.d(strArr2, "SUPPORTED_64_BIT_ABIS");
                    hashMap.put("supported64BitAbis", G0.e.O(Arrays.copyOf(strArr2, strArr2.length)));
                    String[] strArr3 = Build.SUPPORTED_ABIS;
                    Q0.h.d(strArr3, "SUPPORTED_ABIS");
                    hashMap.put("supportedAbis", G0.e.O(Arrays.copyOf(strArr3, strArr3.length)));
                    String str15 = Build.TAGS;
                    Q0.h.d(str15, "TAGS");
                    hashMap.put("tags", str15);
                    String str16 = Build.TYPE;
                    Q0.h.d(str16, "TYPE");
                    hashMap.put("type", str16);
                    String str17 = "unknown";
                    hashMap.put("isPhysicalDevice", Boolean.valueOf(!((str5.startsWith("generic") && str6.startsWith("generic")) || str8.startsWith("generic") || str8.startsWith("unknown") || X0.j.O(str9, "goldfish") || X0.j.O(str9, "ranchu") || X0.j.O(str13, "google_sdk") || X0.j.O(str13, "Emulator") || X0.j.O(str13, "Android SDK built for x86") || X0.j.O(str12, "Genymotion") || X0.j.O(str14, "sdk") || X0.j.O(str14, "vbox86p") || X0.j.O(str14, "emulator") || X0.j.O(str14, "simulator"))));
                    FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f875f).getSystemAvailableFeatures();
                    Q0.h.d(systemAvailableFeatures, "packageManager.systemAvailableFeatures");
                    ArrayList arrayList = new ArrayList();
                    for (FeatureInfo featureInfo : systemAvailableFeatures) {
                        if (featureInfo.name != null) {
                            arrayList.add(featureInfo);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((FeatureInfo) it.next()).name);
                    }
                    hashMap.put("systemFeatures", arrayList2);
                    HashMap hashMap2 = new HashMap();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 23) {
                        str = Build.VERSION.BASE_OS;
                        Q0.h.d(str, "BASE_OS");
                        hashMap2.put("baseOS", str);
                        i2 = Build.VERSION.PREVIEW_SDK_INT;
                        hashMap2.put("previewSdkInt", Integer.valueOf(i2));
                        str2 = Build.VERSION.SECURITY_PATCH;
                        Q0.h.d(str2, "SECURITY_PATCH");
                        hashMap2.put("securityPatch", str2);
                    }
                    String str18 = Build.VERSION.CODENAME;
                    Q0.h.d(str18, "CODENAME");
                    hashMap2.put("codename", str18);
                    String str19 = Build.VERSION.INCREMENTAL;
                    Q0.h.d(str19, "INCREMENTAL");
                    hashMap2.put("incremental", str19);
                    String str20 = Build.VERSION.RELEASE;
                    Q0.h.d(str20, "RELEASE");
                    hashMap2.put("release", str20);
                    hashMap2.put("sdkInt", Integer.valueOf(i3));
                    hashMap.put("version", hashMap2);
                    hashMap.put("isLowRamDevice", Boolean.valueOf(((ActivityManager) this.f876g).isLowRamDevice()));
                    if (i3 >= 26) {
                        try {
                            str17 = Build.getSerial();
                        } catch (SecurityException unused) {
                        }
                        Q0.h.d(str17, "try {\n                  …UNKNOWN\n                }");
                        hashMap.put("serialNumber", str17);
                    } else {
                        String str21 = Build.SERIAL;
                        Q0.h.d(str21, "SERIAL");
                        hashMap.put("serialNumber", str21);
                    }
                    iVar.c(hashMap);
                    break;
                } else {
                    iVar.b();
                    break;
                }
                break;
            default:
                n0.d dVar = (n0.d) this.f876g;
                if (((C0031i) dVar.f3284f) == null) {
                    iVar.c((Map) this.f875f);
                    break;
                } else {
                    String str22 = (String) o2.f875f;
                    str22.getClass();
                    if (str22.equals("getKeyboardState")) {
                        try {
                            this.f875f = Collections.unmodifiableMap(((m0.w) ((m0.z[]) ((C0031i) dVar.f3284f).f154f)[0]).f3217f);
                        } catch (IllegalStateException e2) {
                            iVar.a("error", e2.getMessage(), null);
                        }
                        iVar.c((Map) this.f875f);
                        break;
                    } else {
                        iVar.b();
                        break;
                    }
                }
        }
    }

    public Object i(String str) {
        Object obj = this.f876g;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // b1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(b1.e eVar, H0.d dVar) {
        b1.j jVar;
        int i2;
        Throwable th;
        c1.n nVar;
        O o2;
        b1.e eVar2;
        b1.l lVar;
        int i3;
        C0038p c0038p;
        switch (this.f874e) {
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                if (dVar instanceof b1.j) {
                    jVar = (b1.j) dVar;
                    int i4 = jVar.f1926i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f1926i = i4 - Integer.MIN_VALUE;
                        Object obj = jVar.f1925h;
                        I0.a aVar = I0.a.f733e;
                        i2 = jVar.f1926i;
                        if (i2 != 0) {
                            i1.a.G(obj);
                            H0.i iVar = jVar.f737f;
                            Q0.h.b(iVar);
                            c1.n nVar2 = new c1.n(eVar, iVar);
                            try {
                                C0081p c0081p = (C0081p) this.f875f;
                                jVar.f1928k = this;
                                jVar.f1929l = eVar;
                                jVar.f1930m = nVar2;
                                jVar.f1926i = 1;
                                if (c0081p.h(nVar2, jVar) == aVar) {
                                    return aVar;
                                }
                                o2 = this;
                                eVar2 = eVar;
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.m();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i1.a.G(obj);
                                return F0.h.f469a;
                            }
                            nVar = jVar.f1930m;
                            eVar2 = jVar.f1929l;
                            o2 = jVar.f1928k;
                            try {
                                i1.a.G(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.m();
                                throw th;
                            }
                        }
                        nVar.m();
                        b1.p pVar = (b1.p) o2.f876g;
                        jVar.f1928k = null;
                        jVar.f1929l = null;
                        jVar.f1930m = null;
                        jVar.f1926i = 2;
                        pVar.k(eVar2, jVar);
                        return aVar;
                    }
                }
                jVar = new b1.j(this, dVar);
                Object obj2 = jVar.f1925h;
                I0.a aVar2 = I0.a.f733e;
                i2 = jVar.f1926i;
                if (i2 != 0) {
                }
                nVar.m();
                b1.p pVar2 = (b1.p) o2.f876g;
                jVar.f1928k = null;
                jVar.f1929l = null;
                jVar.f1930m = null;
                jVar.f1926i = 2;
                pVar2.k(eVar2, jVar);
                return aVar2;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                Object k2 = ((O) this.f875f).k(new B0.t(new Q0.m(), eVar, (I.r) this.f876g), dVar);
                return k2 == I0.a.f733e ? k2 : F0.h.f469a;
            default:
                if (dVar instanceof b1.l) {
                    lVar = (b1.l) dVar;
                    int i5 = lVar.f1937i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lVar.f1937i = i5 - Integer.MIN_VALUE;
                        Object obj3 = lVar.f1936h;
                        I0.a aVar3 = I0.a.f733e;
                        i3 = lVar.f1937i;
                        if (i3 != 0) {
                            i1.a.G(obj3);
                            O o3 = (O) this.f875f;
                            C0038p c0038p2 = new C0038p((C0082q) this.f876g, eVar);
                            try {
                                lVar.f1939k = c0038p2;
                                lVar.f1937i = 1;
                                if (o3.k(c0038p2, lVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (c1.a e2) {
                                e = e2;
                                c0038p = c0038p2;
                                if (e.f1998e != c0038p) {
                                }
                                return F0.h.f469a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0038p = lVar.f1939k;
                            try {
                                i1.a.G(obj3);
                            } catch (c1.a e3) {
                                e = e3;
                                if (e.f1998e != c0038p) {
                                    throw e;
                                }
                                return F0.h.f469a;
                            }
                        }
                        return F0.h.f469a;
                    }
                }
                lVar = new b1.l(this, dVar);
                Object obj32 = lVar.f1936h;
                I0.a aVar32 = I0.a.f733e;
                i3 = lVar.f1937i;
                if (i3 != 0) {
                }
                return F0.h.f469a;
        }
    }

    public View m(int i2, int i3, int i4, int i5) {
        int s2;
        int i6;
        int t2;
        View o2;
        int left;
        int i7;
        int right;
        int i8;
        u uVar = (u) this.f875f;
        switch (uVar.f946a) {
            case 0:
                s2 = uVar.f947b.s();
                break;
            default:
                s2 = uVar.f947b.u();
                break;
        }
        switch (uVar.f946a) {
            case 0:
                v vVar = uVar.f947b;
                i6 = vVar.f953f;
                t2 = vVar.t();
                break;
            default:
                v vVar2 = uVar.f947b;
                i6 = vVar2.f954g;
                t2 = vVar2.r();
                break;
        }
        int i9 = i6 - t2;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (uVar.f946a) {
                case 0:
                    o2 = uVar.f947b.o(i2);
                    break;
                default:
                    o2 = uVar.f947b.o(i2);
                    break;
            }
            switch (uVar.f946a) {
                case 0:
                    w wVar = (w) o2.getLayoutParams();
                    uVar.f947b.getClass();
                    left = o2.getLeft() - ((w) o2.getLayoutParams()).f955a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) wVar).leftMargin;
                    break;
                default:
                    w wVar2 = (w) o2.getLayoutParams();
                    uVar.f947b.getClass();
                    left = o2.getTop() - ((w) o2.getLayoutParams()).f955a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) wVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (uVar.f946a) {
                case 0:
                    w wVar3 = (w) o2.getLayoutParams();
                    uVar.f947b.getClass();
                    right = o2.getRight() + ((w) o2.getLayoutParams()).f955a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) wVar3).rightMargin;
                    break;
                default:
                    w wVar4 = (w) o2.getLayoutParams();
                    uVar.f947b.getClass();
                    right = o2.getBottom() + ((w) o2.getLayoutParams()).f955a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) wVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            N n2 = (N) this.f876g;
            n2.f868b = s2;
            n2.f869c = i9;
            n2.f870d = i11;
            n2.f871e = i12;
            if (i4 != 0) {
                n2.f867a = i4;
                if (n2.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                n2.f867a = i5;
                if (n2.a()) {
                    view = o2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public void n(C0327f c0327f) {
        int i2 = c0327f.f3578b;
        Handler handler = (Handler) this.f876g;
        n0.d dVar = (n0.d) this.f875f;
        if (i2 == 0) {
            handler.post(new d1.i(dVar, c0327f.f3577a, 3, false));
        } else {
            handler.post(new F.b(dVar, i2));
        }
    }

    public /* synthetic */ O(int i2, boolean z2) {
        this.f874e = i2;
    }

    public /* synthetic */ O(Object obj, Object obj2, int i2, boolean z2) {
        this.f874e = i2;
        this.f876g = obj;
        this.f875f = obj2;
    }

    public O(InterfaceC0334a interfaceC0334a, n0.d dVar) {
        this.f874e = 26;
        this.f875f = interfaceC0334a;
        this.f876g = dVar;
        dVar.f3284f = new n0.d(21, this);
    }

    public O(C0312b c0312b) {
        this.f874e = 11;
        this.f876g = new f1.i();
        this.f875f = c0312b;
    }

    public O(n0.d dVar) {
        this.f874e = 14;
        this.f876g = dVar;
        this.f875f = new HashMap();
    }

    public O(int i2) {
        this.f874e = i2;
        switch (i2) {
            case 12:
                this.f875f = new LongSparseArray();
                this.f876g = new PriorityQueue();
                break;
            default:
                this.f875f = new ReentrantLock();
                this.f876g = new LinkedHashMap();
                break;
        }
    }

    public O(View view, InputMethodManager inputMethodManager, n0.d dVar) {
        this.f874e = 8;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f876g = view;
        this.f875f = inputMethodManager;
        dVar.f3284f = this;
    }

    public O(C0134b c0134b) {
        this.f874e = 3;
        O o2 = new O(2);
        this.f875f = c0134b;
        this.f876g = o2;
    }

    public O(o0.b bVar, int i2) {
        this.f874e = i2;
        switch (i2) {
            case 16:
                n0.d dVar = new n0.d(11, this);
                C0079n c0079n = new C0079n(bVar, "flutter/platform", w0.i.f3556a, null);
                this.f875f = c0079n;
                c0079n.j(dVar);
                break;
            case 17:
                n0.d dVar2 = new n0.d(12, this);
                C0079n c0079n2 = new C0079n(bVar, "flutter/platform_views", w0.p.f3564a, null);
                this.f875f = c0079n2;
                c0079n2.j(dVar2);
                break;
            case 18:
            case 19:
            default:
                n0.d dVar3 = new n0.d(8, this);
                C0079n c0079n3 = new C0079n(bVar, "flutter/localization", w0.i.f3556a, null);
                this.f875f = c0079n3;
                c0079n3.j(dVar3);
                break;
            case 20:
                n0.d dVar4 = new n0.d(19, this);
                C0079n c0079n4 = new C0079n(bVar, "flutter/textinput", w0.i.f3556a, null);
                this.f875f = c0079n4;
                c0079n4.j(dVar4);
                break;
        }
    }

    public O(o0.b bVar, PackageManager packageManager) {
        this.f874e = 18;
        n0.d dVar = new n0.d(13, this);
        this.f875f = packageManager;
        new C0079n(bVar, "flutter/processtext", w0.p.f3564a, null).j(dVar);
    }

    public O(u uVar) {
        this.f874e = 0;
        this.f875f = uVar;
        N n2 = new N();
        n2.f867a = 0;
        this.f876g = n2;
    }

    public O(ArrayList arrayList, ArrayList arrayList2) {
        this.f874e = 13;
        int size = arrayList.size();
        this.f875f = new int[size];
        this.f876g = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f875f)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f876g)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public O(int i2, int i3) {
        this.f874e = 13;
        this.f875f = new int[]{i2, i3};
        this.f876g = new float[]{0.0f, 1.0f};
    }

    public O(int i2, int i3, int i4) {
        this.f874e = 13;
        this.f875f = new int[]{i2, i3, i4};
        this.f876g = new float[]{0.0f, 0.5f, 1.0f};
    }
}
