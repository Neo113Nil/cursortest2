package N;

import B0.C0008i;
import B0.C0015p;
import B0.C0018t;
import F.C0032n;
import F.C0034p;
import F.C0035q;
import a.AbstractC0086a;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import d.AbstractC0119a;
import e.AbstractC0121a;
import i.AbstractC0178z;
import i.C0168o;
import i.C0172t;
import i.j0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import k0.C0183A;
import o0.C0211b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.C0231c;
import u0.C0234f;
import u0.EnumC0235g;
import v0.C0244i;
import v0.InterfaceC0237b;
import v0.InterfaceC0238c;
import v0.InterfaceC0239d;
import x0.InterfaceC0250a;

/* loaded from: classes.dex */
public final class P implements W.h, Z0.d, io.flutter.plugin.platform.h, u0.j, k0.y, v0.k, InterfaceC0238c, InterfaceC0239d {

    /* renamed from: h, reason: collision with root package name */
    public static P f695h;

    /* renamed from: i, reason: collision with root package name */
    public static C0183A f696i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f697e;

    /* renamed from: f, reason: collision with root package name */
    public Object f698f;

    /* renamed from: g, reason: collision with root package name */
    public Object f699g;

    public /* synthetic */ P(int i2, Object obj, Object obj2) {
        this.f697e = i2;
        this.f698f = obj;
        this.f699g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int o(P p2, JSONArray jSONArray) {
        String str;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : H.j.b(4)) {
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
                    int a2 = H.j.a(i5);
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
            throw new NoSuchFieldException(L.d.g("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 0;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
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
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                return 9;
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList q(P p2, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (EnumC0235g enumC0235g : EnumC0235g.values()) {
                if (enumC0235g.f3004e.equals(string)) {
                    int ordinal = enumC0235g.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(EnumC0235g.f3001f);
                    } else if (ordinal == 1) {
                        arrayList.add(EnumC0235g.f3002g);
                    }
                }
            }
            throw new NoSuchFieldException(L.d.g("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int u(P p2, String str) {
        String str2;
        for (int i2 : H.j.b(4)) {
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
                int a2 = H.j.a(i2);
                if (a2 == 0) {
                    return 1;
                }
                if (a2 != 1) {
                    return a2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(L.d.g("No such SystemUiMode: ", str));
    }

    public static C0234f v(P p2, JSONObject jSONObject) {
        return new C0234f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? L.d.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : L.d.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
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

    public void A(v.e eVar) {
        Handler handler = (Handler) this.f699g;
        C0211b c0211b = (C0211b) this.f698f;
        int i2 = eVar.f3068b;
        if (i2 == 0) {
            handler.post(new b1.i(c0211b, eVar.f3067a, 3, false));
        } else {
            handler.post(new C.b(c0211b, i2));
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void a(io.flutter.view.i iVar) {
        ((io.flutter.plugin.platform.l) this.f698f).f2487l.f2456a = iVar;
        ((io.flutter.plugin.platform.k) this.f699g).f2472j.f2456a = iVar;
    }

    @Override // u0.j
    public void b(boolean z2) {
        ((io.flutter.plugin.platform.l) ((io.flutter.plugin.platform.l) this.f698f).f2499y.f20f).f2495u = z2;
    }

    @Override // u0.j
    public void c(int i2, double d2, double d3) {
        ((io.flutter.plugin.platform.k) this.f699g).f(i2);
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.c(i2, d2, d3);
    }

    @Override // u0.j
    public void d(int i2, int i3) {
        ((io.flutter.plugin.platform.k) this.f699g).f(i2);
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.d(i2, i3);
    }

    @Override // io.flutter.plugin.platform.h
    public boolean e(int i2) {
        ((io.flutter.plugin.platform.k) this.f699g).f(i2);
        return ((io.flutter.plugin.platform.l) this.f698f).e(i2);
    }

    @Override // io.flutter.plugin.platform.h
    public void f(int i2) {
        ((io.flutter.plugin.platform.k) this.f699g).f(i2);
        ((io.flutter.plugin.platform.l) this.f698f).f(i2);
    }

    @Override // io.flutter.plugin.platform.h
    public void g() {
        ((io.flutter.plugin.platform.l) this.f698f).g();
        ((io.flutter.plugin.platform.k) this.f699g).g();
    }

    @Override // v0.k
    public void h(P p2, u0.k kVar) {
        C0211b c0211b = (C0211b) this.f699g;
        if (((C0008i) c0211b.f2915f) == null) {
            kVar.d((Map) this.f698f);
            return;
        }
        String str = (String) p2.f698f;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            kVar.b();
            return;
        }
        try {
            this.f698f = Collections.unmodifiableMap(((k0.v) ((k0.y[]) ((C0008i) c0211b.f2915f).f84f)[0]).f2755f);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
        kVar.d((Map) this.f698f);
    }

    @Override // u0.j
    public long i(C0172t c0172t) {
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.i(c0172t);
        throw null;
    }

    @Override // u0.j
    public void j(u0.i iVar, l0.i iVar2) {
        ((io.flutter.plugin.platform.k) this.f699g).f(iVar.f3021a);
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.j(iVar, iVar2);
    }

    @Override // u0.j
    public void k(int i2) {
        ((io.flutter.plugin.platform.k) this.f699g).f(i2);
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.k(i2);
    }

    @Override // k0.y
    public void l(KeyEvent keyEvent, final k0.w wVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            wVar.a(false);
            return;
        }
        Character a2 = ((d1.i) this.f699g).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        C0231c c0231c = (C0231c) this.f698f;
        final InterfaceC0238c interfaceC0238c = new InterfaceC0238c() { // from class: k0.r
            @Override // v0.InterfaceC0238c
            public void n(Object obj) {
                r rVar = (r) wVar;
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((w) wVar).a(z3);
            }
        };
        C0032n c0032n = c0231c.f2987a;
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
        c0032n.i(hashMap, new InterfaceC0238c() { // from class: k0.r
            @Override // v0.InterfaceC0238c
            public void n(Object obj) {
                r rVar = (r) interfaceC0238c;
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((w) interfaceC0238c).a(z3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    @Override // Z0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(Z0.e eVar, G0.d dVar) {
        Z0.j jVar;
        int i2;
        H0.a aVar;
        Throwable th;
        a1.n nVar;
        P p2;
        Z0.e eVar2;
        Z0.d dVar2;
        Z0.l lVar;
        int i3;
        C0015p c0015p;
        switch (this.f697e) {
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof Z0.j) {
                    jVar = (Z0.j) dVar;
                    int i4 = jVar.f1098i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f1098i = i4 - Integer.MIN_VALUE;
                        Object obj = jVar.f1097h;
                        i2 = jVar.f1098i;
                        aVar = H0.a.f511e;
                        if (i2 != 0) {
                            AbstractC0086a.I(obj);
                            G0.i iVar = jVar.f527f;
                            P0.h.b(iVar);
                            a1.n nVar2 = new a1.n(eVar, iVar);
                            try {
                                C0034p c0034p = (C0034p) this.f698f;
                                jVar.f1100k = this;
                                jVar.f1101l = eVar;
                                jVar.f1102m = nVar2;
                                jVar.f1098i = 1;
                                if (c0034p.i(nVar2, jVar) == aVar) {
                                    return aVar;
                                }
                                p2 = this;
                                eVar2 = eVar;
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.o();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC0086a.I(obj);
                                return D0.h.f206a;
                            }
                            nVar = jVar.f1102m;
                            eVar2 = jVar.f1101l;
                            p2 = jVar.f1100k;
                            try {
                                AbstractC0086a.I(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.o();
                                throw th;
                            }
                        }
                        nVar.o();
                        dVar2 = (Z0.d) p2.f699g;
                        jVar.f1100k = null;
                        jVar.f1101l = null;
                        jVar.f1102m = null;
                        jVar.f1098i = 2;
                        if (dVar2.m(eVar2, jVar) == aVar) {
                            return aVar;
                        }
                        return D0.h.f206a;
                    }
                }
                jVar = new Z0.j(this, dVar);
                Object obj2 = jVar.f1097h;
                i2 = jVar.f1098i;
                aVar = H0.a.f511e;
                if (i2 != 0) {
                }
                nVar.o();
                dVar2 = (Z0.d) p2.f699g;
                jVar.f1100k = null;
                jVar.f1101l = null;
                jVar.f1102m = null;
                jVar.f1098i = 2;
                if (dVar2.m(eVar2, jVar) == aVar) {
                }
                return D0.h.f206a;
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                Object m2 = ((P) this.f698f).m(new C0018t(new P0.m(), eVar, (F.r) this.f699g), dVar);
                return m2 == H0.a.f511e ? m2 : D0.h.f206a;
            default:
                if (dVar instanceof Z0.l) {
                    lVar = (Z0.l) dVar;
                    int i5 = lVar.f1109i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lVar.f1109i = i5 - Integer.MIN_VALUE;
                        Object obj3 = lVar.f1108h;
                        i3 = lVar.f1109i;
                        if (i3 != 0) {
                            AbstractC0086a.I(obj3);
                            P p3 = (P) this.f698f;
                            C0015p c0015p2 = new C0015p((C0035q) this.f699g, eVar);
                            try {
                                lVar.f1111k = c0015p2;
                                lVar.f1109i = 1;
                                Object m3 = p3.m(c0015p2, lVar);
                                H0.a aVar2 = H0.a.f511e;
                                if (m3 == aVar2) {
                                    return aVar2;
                                }
                            } catch (a1.a e2) {
                                e = e2;
                                c0015p = c0015p2;
                                if (e.f1140e != c0015p) {
                                }
                                return D0.h.f206a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0015p = lVar.f1111k;
                            try {
                                AbstractC0086a.I(obj3);
                            } catch (a1.a e3) {
                                e = e3;
                                if (e.f1140e != c0015p) {
                                    throw e;
                                }
                                return D0.h.f206a;
                            }
                        }
                        return D0.h.f206a;
                    }
                }
                lVar = new Z0.l(this, dVar);
                Object obj32 = lVar.f1108h;
                i3 = lVar.f1109i;
                if (i3 != 0) {
                }
                return D0.h.f206a;
        }
    }

    @Override // v0.InterfaceC0238c
    public void n(Object obj) {
        switch (this.f697e) {
            case 20:
                C0008i c0008i = (C0008i) this.f699g;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0008i.f84f;
                u0.m mVar = (u0.m) this.f698f;
                concurrentLinkedQueue.remove(mVar);
                if (!((ConcurrentLinkedQueue) c0008i.f84f).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + mVar.f3034a);
                    break;
                }
                break;
            default:
                ((m0.g) this.f698f).a(((v0.j) ((C0032n) ((P) this.f699g).f699g).f411c).a(obj));
                break;
        }
    }

    @Override // v0.InterfaceC0239d
    public void p(ByteBuffer byteBuffer, m0.g gVar) {
        switch (this.f697e) {
            case 24:
                C0032n c0032n = (C0032n) this.f699g;
                try {
                    ((InterfaceC0237b) this.f698f).a(((v0.j) c0032n.f411c).b(byteBuffer), new P(this, gVar, 23, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0032n.f410b), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                C0008i c0008i = (C0008i) this.f699g;
                v0.l lVar = (v0.l) c0008i.f86h;
                try {
                    ((v0.k) this.f698f).h(lVar.d(byteBuffer), new u0.k(1, this, gVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) c0008i.f85g), "Failed to handle method call", e3);
                    gVar.a(lVar.b(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // u0.j
    public void r(u0.h hVar) {
        ((io.flutter.plugin.platform.k) this.f699g).f(hVar.f3005a);
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.r(hVar);
    }

    @Override // u0.j
    public void s(int i2) {
        ((io.flutter.plugin.platform.k) this.f699g).f(i2);
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.s(i2);
    }

    @Override // u0.j
    public void t(C0172t c0172t) {
        ((io.flutter.plugin.platform.l) this.f698f).f2499y.t(c0172t);
        throw null;
    }

    public void w() {
        j0 j0Var;
        ImageView imageView = (ImageView) this.f698f;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC0178z.f2351a;
        }
        if (drawable == null || (j0Var = (j0) this.f699g) == null) {
            return;
        }
        C0168o.c(drawable, j0Var, imageView.getDrawableState());
    }

    public View y(int i2, int i3, int i4, int i5) {
        int s2;
        int i6;
        int t;
        View o2;
        int left;
        int i7;
        int right;
        int i8;
        O o3 = (O) this.f699g;
        v vVar = (v) this.f698f;
        switch (vVar.f772a) {
            case 0:
                s2 = vVar.f773b.s();
                break;
            default:
                s2 = vVar.f773b.u();
                break;
        }
        switch (vVar.f772a) {
            case 0:
                w wVar = vVar.f773b;
                i6 = wVar.f779f;
                t = wVar.t();
                break;
            default:
                w wVar2 = vVar.f773b;
                i6 = wVar2.f780g;
                t = wVar2.r();
                break;
        }
        int i9 = i6 - t;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (vVar.f772a) {
                case 0:
                    o2 = vVar.f773b.o(i2);
                    break;
                default:
                    o2 = vVar.f773b.o(i2);
                    break;
            }
            switch (vVar.f772a) {
                case 0:
                    x xVar = (x) o2.getLayoutParams();
                    left = o2.getLeft() - ((x) o2.getLayoutParams()).f781a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
                    break;
                default:
                    x xVar2 = (x) o2.getLayoutParams();
                    left = o2.getTop() - ((x) o2.getLayoutParams()).f781a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (vVar.f772a) {
                case 0:
                    x xVar3 = (x) o2.getLayoutParams();
                    right = o2.getRight() + ((x) o2.getLayoutParams()).f781a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) xVar3).rightMargin;
                    break;
                default:
                    x xVar4 = (x) o2.getLayoutParams();
                    right = o2.getBottom() + ((x) o2.getLayoutParams()).f781a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) xVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            o3.f691b = s2;
            o3.f692c = i9;
            o3.f693d = i11;
            o3.f694e = i12;
            if (i4 != 0) {
                o3.f690a = i4;
                if (o3.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                o3.f690a = i5;
                if (o3.a()) {
                    view = o2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public void z(int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f698f;
        C0008i D2 = C0008i.D(imageView.getContext(), null, AbstractC0119a.f1791e, i2);
        TypedArray typedArray = (TypedArray) D2.f84f;
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0121a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0178z.f2351a;
            }
            if (typedArray.hasValue(2)) {
                C.f.c(imageView, D2.u(2));
            }
            if (typedArray.hasValue(3)) {
                C.f.d(imageView, AbstractC0178z.c(typedArray.getInt(3, -1), null));
            }
            D2.G();
        } catch (Throwable th) {
            D2.G();
            throw th;
        }
    }

    public /* synthetic */ P(int i2, boolean z2) {
        this.f697e = i2;
    }

    public /* synthetic */ P(Object obj, Object obj2, int i2, boolean z2) {
        this.f697e = i2;
        this.f699g = obj;
        this.f698f = obj2;
    }

    public P(InterfaceC0250a interfaceC0250a, C0211b c0211b) {
        this.f697e = 27;
        this.f698f = interfaceC0250a;
        this.f699g = c0211b;
        c0211b.f2915f = new C0211b(22, this);
    }

    public P(C0231c c0231c) {
        this.f697e = 12;
        this.f699g = new d1.i();
        this.f698f = c0231c;
    }

    public P(C0211b c0211b) {
        this.f697e = 16;
        this.f699g = c0211b;
        this.f698f = new HashMap();
    }

    public P(int i2) {
        this.f697e = i2;
        switch (i2) {
            case 13:
                this.f698f = new LongSparseArray();
                this.f699g = new PriorityQueue();
                break;
            default:
                this.f698f = new ReentrantLock();
                this.f699g = new LinkedHashMap();
                break;
        }
    }

    public P(View view, InputMethodManager inputMethodManager, C0211b c0211b) {
        this.f697e = 10;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f699g = view;
        this.f698f = inputMethodManager;
        c0211b.f2915f = this;
    }

    public P(W.b bVar) {
        this.f697e = 2;
        P p2 = new P(1);
        this.f698f = bVar;
        this.f699g = p2;
    }

    public P(ImageView imageView) {
        this.f697e = 8;
        this.f698f = imageView;
    }

    public P(m0.b bVar, int i2) {
        this.f697e = i2;
        switch (i2) {
            case 18:
                C0211b c0211b = new C0211b(7, this);
                C0008i c0008i = new C0008i(bVar, "flutter/platform", C0244i.f3088a, 12);
                this.f698f = c0008i;
                c0008i.I(c0211b);
                break;
            case 21:
                C0211b c0211b2 = new C0211b(20, this);
                C0008i c0008i2 = new C0008i(bVar, "flutter/textinput", C0244i.f3088a, 12);
                this.f698f = c0008i2;
                c0008i2.I(c0211b2);
                break;
            default:
                C0211b c0211b3 = new C0211b(4, this);
                C0008i c0008i3 = new C0008i(bVar, "flutter/localization", C0244i.f3088a, 12);
                this.f698f = c0008i3;
                c0008i3.I(c0211b3);
                break;
        }
    }

    public P(m0.b bVar, PackageManager packageManager) {
        this.f697e = 19;
        C0211b c0211b = new C0211b(12, this);
        this.f698f = packageManager;
        new C0008i(bVar, "flutter/processtext", v0.o.f3092a, 12).I(c0211b);
    }

    public P(v vVar) {
        this.f697e = 0;
        this.f698f = vVar;
        O o2 = new O();
        o2.f690a = 0;
        this.f699g = o2;
    }
}
