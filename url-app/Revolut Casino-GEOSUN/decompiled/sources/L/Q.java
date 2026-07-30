package L;

import D.C0013n;
import D.C0015p;
import D.C0016q;
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
import c.AbstractC0098a;
import d.AbstractC0110a;
import e0.C0114b;
import e0.C0119g;
import h.AbstractC0171y;
import h.C0162o;
import h.j0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import m0.C0192b;
import m0.C0193c;
import m0.C0196f;
import m0.C0201k;
import m0.C0203m;
import m0.EnumC0197g;
import n0.InterfaceC0210b;
import n0.InterfaceC0211c;
import n0.InterfaceC0212d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.C0235n;
import u0.C0247g;

/* loaded from: classes.dex */
public final class Q implements P0.d, U.h, c0.B, io.flutter.plugin.platform.h, n0.k, InterfaceC0211c, InterfaceC0212d {

    /* renamed from: h, reason: collision with root package name */
    public static Q f512h;

    /* renamed from: i, reason: collision with root package name */
    public static c0.C f513i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f514e;

    /* renamed from: f, reason: collision with root package name */
    public Object f515f;

    /* renamed from: g, reason: collision with root package name */
    public Object f516g;

    public /* synthetic */ Q(int i2, Object obj, Object obj2) {
        this.f514e = i2;
        this.f515f = obj;
        this.f516g = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(Q q2, JSONArray jSONArray) {
        String str;
        q2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : F.j.c(4)) {
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
                    int b2 = F.j.b(i5);
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
            throw new NoSuchFieldException(F0.h.f("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 0;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
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
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                return 9;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
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

    public static ArrayList i(Q q2, JSONArray jSONArray) {
        q2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (EnumC0197g enumC0197g : EnumC0197g.values()) {
                if (enumC0197g.f2724e.equals(string)) {
                    int ordinal = enumC0197g.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(EnumC0197g.f2721f);
                    } else if (ordinal == 1) {
                        arrayList.add(EnumC0197g.f2722g);
                    }
                }
            }
            throw new NoSuchFieldException(F0.h.f("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int j(Q q2, String str) {
        String str2;
        q2.getClass();
        for (int i2 : F.j.c(4)) {
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
                int b2 = F.j.b(i2);
                if (b2 == 0) {
                    return 1;
                }
                if (b2 != 1) {
                    return b2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(F0.h.f("No such SystemUiMode: ", str));
    }

    public static C0196f l(Q q2, JSONObject jSONObject) {
        q2.getClass();
        return new C0196f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? F0.h.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? F0.h.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap o(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    @Override // io.flutter.plugin.platform.h
    public void a() {
        ((io.flutter.plugin.platform.k) this.f515f).a();
        ((io.flutter.plugin.platform.j) this.f516g).a();
    }

    @Override // c0.B
    public void b(KeyEvent keyEvent, final c0.z zVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            zVar.a(false);
            return;
        }
        Character a2 = ((T0.i) this.f516g).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        final InterfaceC0211c interfaceC0211c = new InterfaceC0211c() { // from class: c0.u
            @Override // n0.InterfaceC0211c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((z) zVar).a(z3);
            }
        };
        C0192b c0192b = (C0192b) this.f515f;
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
        c0192b.f2704a.i(hashMap, new InterfaceC0211c() { // from class: c0.u
            @Override // n0.InterfaceC0211c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((z) interfaceC0211c).a(z3);
            }
        });
    }

    @Override // io.flutter.plugin.platform.h
    public void c(io.flutter.view.h hVar) {
        ((io.flutter.plugin.platform.k) this.f515f).f2484l.f2452a = hVar;
        ((io.flutter.plugin.platform.j) this.f516g).f2469j.f2452a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // P0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(P0.e eVar, w0.d dVar) {
        P0.j jVar;
        int i2;
        Throwable th;
        Q0.n nVar;
        Q q2;
        P0.e eVar2;
        P0.m mVar;
        int i3;
        C0235n c0235n;
        switch (this.f514e) {
            case 1:
                if (dVar instanceof P0.j) {
                    jVar = (P0.j) dVar;
                    int i4 = jVar.f789i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f789i = i4 - Integer.MIN_VALUE;
                        Object obj = jVar.f788h;
                        x0.a aVar = x0.a.f3094e;
                        i2 = jVar.f789i;
                        if (i2 != 0) {
                            o.g.z(obj);
                            w0.i iVar = jVar.f3098f;
                            F0.i.b(iVar);
                            Q0.n nVar2 = new Q0.n(eVar, iVar);
                            try {
                                C0015p c0015p = (C0015p) this.f515f;
                                jVar.f791k = this;
                                jVar.f792l = eVar;
                                jVar.f793m = nVar2;
                                jVar.f789i = 1;
                                if (c0015p.f(nVar2, jVar) == aVar) {
                                    return aVar;
                                }
                                q2 = this;
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
                                o.g.z(obj);
                                return C0247g.f3005a;
                            }
                            nVar = jVar.f793m;
                            eVar2 = jVar.f792l;
                            q2 = jVar.f791k;
                            try {
                                o.g.z(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.m();
                                throw th;
                            }
                        }
                        nVar.m();
                        P0.q qVar = (P0.q) q2.f516g;
                        jVar.f791k = null;
                        jVar.f792l = null;
                        jVar.f793m = null;
                        jVar.f789i = 2;
                        qVar.d(eVar2, jVar);
                        return aVar;
                    }
                }
                jVar = new P0.j(this, dVar);
                Object obj2 = jVar.f788h;
                x0.a aVar2 = x0.a.f3094e;
                i2 = jVar.f789i;
                if (i2 != 0) {
                }
                nVar.m();
                P0.q qVar2 = (P0.q) q2.f516g;
                jVar.f791k = null;
                jVar.f792l = null;
                jVar.f793m = null;
                jVar.f789i = 2;
                qVar2.d(eVar2, jVar);
                return aVar2;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object d2 = ((Q) this.f515f).d(new P0.l(new F0.n(), eVar, (D.r) this.f516g), dVar);
                return d2 == x0.a.f3094e ? d2 : C0247g.f3005a;
            default:
                if (dVar instanceof P0.m) {
                    mVar = (P0.m) dVar;
                    int i5 = mVar.f804i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f804i = i5 - Integer.MIN_VALUE;
                        Object obj3 = mVar.f803h;
                        x0.a aVar3 = x0.a.f3094e;
                        i3 = mVar.f804i;
                        if (i3 != 0) {
                            o.g.z(obj3);
                            Q q3 = (Q) this.f515f;
                            C0235n c0235n2 = new C0235n((C0016q) this.f516g, eVar);
                            try {
                                mVar.f806k = c0235n2;
                                mVar.f804i = 1;
                                if (q3.d(c0235n2, mVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (Q0.a e2) {
                                e = e2;
                                c0235n = c0235n2;
                                if (e.f831e != c0235n) {
                                }
                                return C0247g.f3005a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0235n = mVar.f806k;
                            try {
                                o.g.z(obj3);
                            } catch (Q0.a e3) {
                                e = e3;
                                if (e.f831e != c0235n) {
                                    throw e;
                                }
                                return C0247g.f3005a;
                            }
                        }
                        return C0247g.f3005a;
                    }
                }
                mVar = new P0.m(this, dVar);
                Object obj32 = mVar.f803h;
                x0.a aVar32 = x0.a.f3094e;
                i3 = mVar.f804i;
                if (i3 != 0) {
                }
                return C0247g.f3005a;
        }
    }

    @Override // n0.InterfaceC0211c
    public void e(Object obj) {
        switch (this.f514e) {
            case 17:
                C0026b c0026b = (C0026b) this.f516g;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0026b.f521g;
                C0203m c0203m = (C0203m) this.f515f;
                concurrentLinkedQueue.remove(c0203m);
                if (!((ConcurrentLinkedQueue) c0026b.f521g).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + c0203m.f2754a);
                    break;
                }
                break;
            default:
                ((C0119g) this.f515f).a(((n0.j) ((C0013n) ((Q) this.f516g).f516g).f246c).b(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void f(int i2) {
        ((io.flutter.plugin.platform.j) this.f516g).f(i2);
        ((io.flutter.plugin.platform.k) this.f515f).f(i2);
    }

    @Override // io.flutter.plugin.platform.h
    public boolean g(int i2) {
        ((io.flutter.plugin.platform.j) this.f516g).f(i2);
        return ((io.flutter.plugin.platform.k) this.f515f).g(i2);
    }

    public void m() {
        j0 j0Var;
        ImageView imageView = (ImageView) this.f515f;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC0171y.f2323a;
        }
        if (drawable == null || (j0Var = (j0) this.f516g) == null) {
            return;
        }
        C0162o.c(drawable, j0Var, imageView.getDrawableState());
    }

    @Override // n0.k
    public void n(Q q2, C0201k c0201k) {
        C0193c c0193c = (C0193c) this.f516g;
        if (((C0026b) c0193c.f2706f) == null) {
            c0201k.c((Map) this.f515f);
            return;
        }
        String str = (String) q2.f515f;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            c0201k.b();
            return;
        }
        try {
            this.f515f = Collections.unmodifiableMap(((c0.y) ((c0.B[]) ((C0026b) c0193c.f2706f).f521g)[0]).f1778f);
        } catch (IllegalStateException e2) {
            c0201k.a("error", e2.getMessage(), null);
        }
        c0201k.c((Map) this.f515f);
    }

    @Override // n0.InterfaceC0212d
    public void p(ByteBuffer byteBuffer, C0119g c0119g) {
        switch (this.f514e) {
            case 20:
                C0013n c0013n = (C0013n) this.f516g;
                try {
                    ((InterfaceC0210b) this.f515f).i(((n0.j) c0013n.f246c).a(byteBuffer), new Q(this, c0119g, 19, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f245b), "Failed to handle message", e2);
                    c0119g.a(null);
                    return;
                }
            default:
                C0026b c0026b = (C0026b) this.f516g;
                try {
                    ((n0.k) this.f515f).n(((n0.l) c0026b.f522h).e(byteBuffer), new C0201k(1, this, c0119g));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) c0026b.f520f), "Failed to handle method call", e3);
                    c0119g.a(((n0.l) c0026b.f522h).a(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    public View q(int i2, int i3, int i4, int i5) {
        int s2;
        int i6;
        int t2;
        View o2;
        int left;
        int i7;
        int right;
        int i8;
        w wVar = (w) this.f515f;
        switch (wVar.f594a) {
            case 0:
                s2 = wVar.f595b.s();
                break;
            default:
                s2 = wVar.f595b.u();
                break;
        }
        switch (wVar.f594a) {
            case 0:
                x xVar = wVar.f595b;
                i6 = xVar.f601f;
                t2 = xVar.t();
                break;
            default:
                x xVar2 = wVar.f595b;
                i6 = xVar2.f602g;
                t2 = xVar2.r();
                break;
        }
        int i9 = i6 - t2;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (wVar.f594a) {
                case 0:
                    o2 = wVar.f595b.o(i2);
                    break;
                default:
                    o2 = wVar.f595b.o(i2);
                    break;
            }
            switch (wVar.f594a) {
                case 0:
                    y yVar = (y) o2.getLayoutParams();
                    wVar.f595b.getClass();
                    left = o2.getLeft() - ((y) o2.getLayoutParams()).f603a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
                    break;
                default:
                    y yVar2 = (y) o2.getLayoutParams();
                    wVar.f595b.getClass();
                    left = o2.getTop() - ((y) o2.getLayoutParams()).f603a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (wVar.f594a) {
                case 0:
                    y yVar3 = (y) o2.getLayoutParams();
                    wVar.f595b.getClass();
                    right = o2.getRight() + ((y) o2.getLayoutParams()).f603a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar3).rightMargin;
                    break;
                default:
                    y yVar4 = (y) o2.getLayoutParams();
                    wVar.f595b.getClass();
                    right = o2.getBottom() + ((y) o2.getLayoutParams()).f603a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            P p2 = (P) this.f516g;
            p2.f508b = s2;
            p2.f509c = i9;
            p2.f510d = i11;
            p2.f511e = i12;
            if (i4 != 0) {
                p2.f507a = i4;
                if (p2.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                p2.f507a = i5;
                if (p2.a()) {
                    view = o2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public void r(int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f515f;
        C0026b E2 = C0026b.E(imageView.getContext(), null, AbstractC0098a.f1644e, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) E2.f520f;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0110a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0171y.f2323a;
            }
            if (typedArray.hasValue(2)) {
                A.f.c(imageView, E2.w(2));
            }
            if (typedArray.hasValue(3)) {
                A.f.d(imageView, AbstractC0171y.c(typedArray.getInt(3, -1), null));
            }
            E2.H();
        } catch (Throwable th) {
            E2.H();
            throw th;
        }
    }

    public void s(t.f fVar) {
        int i2 = fVar.f2978b;
        Handler handler = (Handler) this.f516g;
        C0193c c0193c = (C0193c) this.f515f;
        if (i2 == 0) {
            handler.post(new R0.i(c0193c, fVar.f2977a, 3, false));
        } else {
            handler.post(new A.b(c0193c, i2));
        }
    }

    public /* synthetic */ Q(int i2, boolean z2) {
        this.f514e = i2;
    }

    public /* synthetic */ Q(Object obj, Object obj2, int i2, boolean z2) {
        this.f514e = i2;
        this.f516g = obj;
        this.f515f = obj2;
    }

    public Q(c0.r rVar, C0193c c0193c) {
        this.f514e = 23;
        this.f515f = rVar;
        this.f516g = c0193c;
        c0193c.f2706f = new C0193c(20, this);
    }

    public Q(C0192b c0192b) {
        this.f514e = 7;
        this.f516g = new T0.i();
        this.f515f = c0192b;
    }

    public Q(C0193c c0193c) {
        this.f514e = 13;
        this.f516g = c0193c;
        this.f515f = new HashMap();
    }

    public Q(int i2) {
        this.f514e = i2;
        switch (i2) {
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                this.f515f = new LongSparseArray();
                this.f516g = new PriorityQueue();
                break;
            default:
                this.f515f = new ReentrantLock();
                this.f516g = new LinkedHashMap();
                break;
        }
    }

    public Q(c0.r rVar, InputMethodManager inputMethodManager, C0193c c0193c) {
        this.f514e = 11;
        if (Build.VERSION.SDK_INT >= 33) {
            rVar.setAutoHandwritingEnabled(false);
        }
        this.f516g = rVar;
        this.f515f = inputMethodManager;
        c0193c.f2706f = this;
    }

    public Q(U.b bVar) {
        this.f514e = 5;
        Q q2 = new Q(4);
        this.f515f = bVar;
        this.f516g = q2;
    }

    public Q(ImageView imageView) {
        this.f514e = 9;
        this.f515f = imageView;
    }

    public Q(C0114b c0114b, int i2) {
        this.f514e = i2;
        switch (i2) {
            case 15:
                C0193c c0193c = new C0193c(4, this);
                C0026b c0026b = new C0026b(c0114b, "flutter/platform", n0.i.f2785a, 8);
                this.f515f = c0026b;
                c0026b.J(c0193c);
                break;
            case 18:
                C0193c c0193c2 = new C0193c(17, this);
                C0026b c0026b2 = new C0026b(c0114b, "flutter/textinput", n0.i.f2785a, 8);
                this.f515f = c0026b2;
                c0026b2.J(c0193c2);
                break;
            default:
                C0193c c0193c3 = new C0193c(1, this);
                C0026b c0026b3 = new C0026b(c0114b, "flutter/localization", n0.i.f2785a, 8);
                this.f515f = c0026b3;
                c0026b3.J(c0193c3);
                break;
        }
    }

    public Q(C0114b c0114b, PackageManager packageManager) {
        this.f514e = 16;
        C0193c c0193c = new C0193c(9, this);
        this.f515f = packageManager;
        new C0026b(c0114b, "flutter/processtext", n0.o.f2789a, 8).J(c0193c);
    }

    public Q(w wVar) {
        this.f514e = 0;
        this.f515f = wVar;
        P p2 = new P();
        p2.f507a = 0;
        this.f516g = p2;
    }
}
