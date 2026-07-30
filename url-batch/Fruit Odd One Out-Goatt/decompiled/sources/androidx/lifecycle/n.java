package androidx.lifecycle;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.n;
import androidx.profileinstaller.ProfileInstallReceiver;
import e0.h0;
import f0.m;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class n implements n0.e, m0.j, n0.i, o.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40c;

    public n(g0.b bVar, int i2) {
        this.f39b = i2;
        switch (i2) {
            case 18:
                new h0(bVar, "flutter/platform_views_2", n0.m.f936a).h(new n(17, this));
                break;
            case 19:
                new h0(bVar, "flutter/platform_views", n0.m.f936a).h(new n(16, this));
                break;
            case 23:
                new h0(bVar, "flutter/scribe", n0.g.f932b).h(new n(22, this));
                break;
            case 25:
                new h0(bVar, "flutter/sensitivecontent", n0.m.f936a).h(new n(24, this));
                break;
            case 27:
                new h0(bVar, "flutter/spellcheck", n0.m.f936a).h(new n(26, this));
                break;
            default:
                new h0(bVar, "flutter/mousecursor", n0.m.f936a).h(new n(13, this));
                break;
        }
    }

    private final void A(c0.a aVar, m0.k kVar) {
        n nVar = (n) this.f40c;
        if (((io.flutter.plugin.editing.i) nVar.f40c) == null) {
            return;
        }
        String str = (String) aVar.f66c;
        Object obj = aVar.f67d;
        if (!str.equals("SpellCheck.initiateSpellCheck")) {
            kVar.b();
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((io.flutter.plugin.editing.i) nVar.f40c).a((String) arrayList.get(0), (String) arrayList.get(1), kVar);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
    }

    public static int n(n nVar, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i2 + " not known to the SensitiveContentChannel.");
    }

    public static boolean t(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    private final void v(c0.a aVar, m0.k kVar) {
        Object obj;
        n nVar = (n) this.f40c;
        m0.j jVar = (m0.j) nVar.f40c;
        if (jVar == null) {
            return;
        }
        String str = (String) aVar.f66c;
        obj = aVar.f67d;
        switch (str) {
            case "create":
                Map map = (Map) obj;
                boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                try {
                    if (((m0.j) nVar.f40c).r()) {
                        ((m0.j) nVar.f40c).c(new m0.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                        throw null;
                    }
                    if (z2) {
                        ((m0.j) nVar.f40c).s(new m0.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                        throw null;
                    }
                    ((m0.j) nVar.f40c).j(new m0.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                    throw null;
                } catch (IllegalStateException e2) {
                    kVar.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "offset":
                Map map2 = (Map) obj;
                try {
                    jVar.f(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e3) {
                    kVar.a("error", Log.getStackTraceString(e3), null);
                    return;
                }
            case "resize":
                Map map3 = (Map) obj;
                try {
                    ((m0.j) nVar.f40c).i(new m0.i(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new f0.l());
                    return;
                } catch (IllegalStateException e4) {
                    kVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "clearFocus":
                try {
                    ((m0.j) nVar.f40c).a(((Integer) obj).intValue());
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e5) {
                    kVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "synchronizeToNativeViewHierarchy":
                try {
                    ((m0.j) nVar.f40c).d(((Boolean) obj).booleanValue());
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e6) {
                    kVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            case "touch":
                List list = (List) obj;
                try {
                    ((m0.j) nVar.f40c).p(new m0.h(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e7) {
                    kVar.a("error", Log.getStackTraceString(e7), null);
                    return;
                }
            case "setDirection":
                Map map4 = (Map) obj;
                try {
                    ((m0.j) nVar.f40c).g(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e8) {
                    kVar.a("error", Log.getStackTraceString(e8), null);
                    return;
                }
            case "dispose":
                try {
                    ((m0.j) nVar.f40c).m(((Integer) ((Map) obj).get("id")).intValue());
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e9) {
                    kVar.a("error", Log.getStackTraceString(e9), null);
                    return;
                }
            default:
                kVar.b();
                return;
        }
    }

    private final void w(c0.a aVar, m0.k kVar) {
        Object obj;
        n nVar = (n) this.f40c;
        n nVar2 = (n) nVar.f40c;
        if (nVar2 == null) {
            return;
        }
        String str = (String) aVar.f66c;
        obj = aVar.f67d;
        switch (str) {
            case "create":
                Map map = (Map) obj;
                if (map.containsKey("params")) {
                    ByteBuffer.wrap((byte[]) map.get("params"));
                }
                try {
                    ((Integer) map.get("id")).intValue();
                    String str2 = (String) map.get("viewType");
                    ((Integer) map.get("direction")).intValue();
                    if (((io.flutter.plugin.platform.i) ((n) nVar.f40c).f40c).f500b.f329a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e2) {
                    kVar.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((Integer) obj).intValue();
                try {
                    if (((io.flutter.plugin.platform.i) ((n) nVar.f40c).f40c).f506h.get(intValue) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e3) {
                    kVar.a("error", Log.getStackTraceString(e3), null);
                    return;
                }
            case "touch":
                List list = (List) obj;
                int intValue2 = ((Integer) list.get(0)).intValue();
                ((Integer) list.get(3)).getClass();
                ((Integer) list.get(4)).getClass();
                list.get(5);
                list.get(6);
                ((Integer) list.get(7)).getClass();
                ((Integer) list.get(8)).getClass();
                ((Double) list.get(9)).getClass();
                ((Double) list.get(10)).getClass();
                ((Integer) list.get(11)).getClass();
                ((Integer) list.get(12)).getClass();
                ((Integer) list.get(13)).getClass();
                ((Integer) list.get(14)).getClass();
                ((Number) list.get(15)).longValue();
                try {
                    n nVar3 = (n) nVar.f40c;
                    nVar3.getClass();
                    io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) nVar3.f40c;
                    float f2 = iVar.f501c.getResources().getDisplayMetrics().density;
                    if (iVar.f506h.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e4) {
                    kVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get("id")).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.i) ((n) nVar.f40c).f40c).f506h.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e5) {
                    kVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.i) nVar2.f40c).f503e;
                kVar.d(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((n) nVar.f40c).m(((Integer) ((Map) obj).get("id")).intValue());
                    kVar.d(null);
                    return;
                } catch (IllegalStateException e6) {
                    kVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                kVar.b();
                return;
        }
    }

    private final void x(c0.a aVar, m0.k kVar) {
        m0.l lVar = (m0.l) this.f40c;
        String str = (String) aVar.f66c;
        Object obj = aVar.f67d;
        if (!str.equals("get")) {
            if (!str.equals("put")) {
                kVar.b();
                return;
            } else {
                lVar.f810b = (byte[]) obj;
                kVar.d(null);
                return;
            }
        }
        lVar.f814f = true;
        if (lVar.f813e || !lVar.f809a) {
            kVar.d(m0.l.a(lVar.f810b));
        } else {
            lVar.f812d = kVar;
        }
    }

    private final void y(c0.a aVar, m0.k kVar) {
        boolean z2;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        c0.a aVar2 = (c0.a) ((n) this.f40c).f40c;
        if (aVar2 == null) {
            return;
        }
        z2 = true;
        switch ((String) aVar.f66c) {
            case "Scribe.isFeatureAvailable":
                try {
                    if (Build.VERSION.SDK_INT >= 34) {
                        isStylusHandwritingAvailable = ((InputMethodManager) aVar2.f66c).isStylusHandwritingAvailable();
                        if (isStylusHandwritingAvailable) {
                            kVar.d(Boolean.valueOf(z2));
                            break;
                        }
                    } else {
                        aVar2.getClass();
                    }
                    z2 = false;
                    kVar.d(Boolean.valueOf(z2));
                } catch (IllegalStateException e2) {
                    kVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "Scribe.startStylusHandwriting":
                if (Build.VERSION.SDK_INT < 33) {
                    kVar.a("error", "Requires API level 33 or higher.", null);
                    break;
                } else {
                    try {
                        ((InputMethodManager) aVar2.f66c).startStylusHandwriting((View) aVar2.f67d);
                        kVar.d(null);
                        break;
                    } catch (IllegalStateException e3) {
                        kVar.a("error", e3.getMessage(), null);
                        return;
                    }
                }
            case "Scribe.isStylusHandwritingAvailable":
                if (Build.VERSION.SDK_INT < 34) {
                    kVar.a("error", "Requires API level 34 or higher.", null);
                    break;
                } else {
                    try {
                        isStylusHandwritingAvailable2 = ((InputMethodManager) aVar2.f66c).isStylusHandwritingAvailable();
                        kVar.d(Boolean.valueOf(isStylusHandwritingAvailable2));
                        break;
                    } catch (IllegalStateException e4) {
                        kVar.a("error", e4.getMessage(), null);
                        return;
                    }
                }
            default:
                kVar.b();
                break;
        }
    }

    private final void z(c0.a aVar, m0.k kVar) {
        int i2;
        n nVar = (n) this.f40c;
        r0.a aVar2 = (r0.a) nVar.f40c;
        if (aVar2 == null) {
            return;
        }
        i2 = 2;
        switch ((String) aVar.f66c) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a2 = aVar2.a();
                    if (a2 == 0) {
                        i2 = 0;
                    } else if (a2 == 1) {
                        i2 = 1;
                    } else if (a2 != 2) {
                        i2 = 3;
                    }
                    kVar.d(Integer.valueOf(i2));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    kVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                try {
                    ((r0.a) nVar.f40c).b(n(nVar, ((Integer) aVar.f67d).intValue()));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    kVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                aVar2.getClass();
                kVar.d(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                kVar.b();
                break;
        }
    }

    public void B(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f40c;
        if (eVar.f499f) {
            eVar.f499f = false;
            a.a.A(eVar.f494a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((m0.f) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f498e = i2;
        eVar.b();
    }

    public void C(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f40c;
        Activity activity = eVar.f494a;
        if (i2 != 4 && eVar.f499f) {
            eVar.f499f = false;
            a.a.A(activity.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                eVar.f499f = true;
                a.a.A(activity.getWindow(), false);
                m0.e eVar2 = eVar.f497d;
                if (eVar2 != null) {
                    eVar.a(eVar2);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f498e = i3;
        eVar.b();
    }

    public void D(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f40c).f494a.getWindow().getDecorView();
        switch (o.d.a(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // m0.j
    public void a(int i2) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        if (jVar.k(i2)) {
            ((io.flutter.plugin.platform.p) jVar.f521j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (jVar.f523l.get(i2) != null) {
            f0.l.a();
            return;
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    @Override // o.f
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // m0.j
    public void c(m0.g gVar) {
        throw new IllegalStateException("Trying to create an HC++ platform view from within PlatformViewsController1. Request: " + gVar);
    }

    @Override // m0.j
    public void d(boolean z2) {
        ((io.flutter.plugin.platform.j) this.f40c).f528r = z2;
    }

    @Override // o.f
    public void e(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f40c).setResultCode(i2);
    }

    @Override // m0.j
    public void f(int i2, double d2, double d3) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        if (jVar.k(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    @Override // m0.j
    public void g(int i2, int i3) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        if (jVar.k(i2)) {
            ((io.flutter.plugin.platform.p) jVar.f521j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (jVar.f523l.get(i2) != null) {
            f0.l.a();
            return;
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    @Override // n0.e
    public void h(String str, n0.c cVar) {
        ((g0.g) this.f40c).b(str, cVar);
    }

    @Override // m0.j
    public void i(m0.i iVar, f0.l lVar) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        int g2 = jVar.g(iVar.f804b);
        int g3 = jVar.g(iVar.f805c);
        int i2 = iVar.f803a;
        if (!jVar.k(i2)) {
            if (jVar.f523l.get(i2) != null) {
                f0.l.a();
                return;
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
            return;
        }
        float f2 = jVar.f514c.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.p pVar = (io.flutter.plugin.platform.p) jVar.f521j.get(Integer.valueOf(i2));
        io.flutter.plugin.editing.n nVar = jVar.f518g;
        if (nVar != null) {
            if (nVar.f477e.f471a == 3) {
                nVar.f487p = true;
            }
            pVar.getClass();
        }
        pVar.getClass();
        if (g2 == 0 && g3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    @Override // m0.j
    public long j(m0.g gVar) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        io.flutter.plugin.platform.j.a(jVar, gVar);
        int i2 = gVar.f785a;
        if (jVar.f525o.get(i2) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
        }
        if (jVar.f517f == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
        }
        if (jVar.f515d == null) {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
        }
        f0.k kVar = jVar.f513b;
        String str = gVar.f786b;
        if (kVar.f329a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    @Override // n0.e
    public void k(String str, ByteBuffer byteBuffer, n0.d dVar) {
        ((g0.g) this.f40c).k(str, byteBuffer, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0399 A[Catch: JSONException -> 0x034d, TryCatch #23 {JSONException -> 0x034d, blocks: (B:175:0x0314, B:178:0x0321, B:185:0x0344, B:187:0x0350, B:194:0x036d, B:196:0x0376, B:198:0x037e, B:208:0x0382, B:201:0x038f, B:203:0x0399, B:205:0x03a6, B:210:0x0387, B:211:0x03ab, B:218:0x03cc, B:220:0x03d5, B:227:0x03f2, B:229:0x03fb, B:231:0x0403, B:234:0x0427, B:236:0x041a, B:239:0x0421, B:240:0x0436, B:242:0x043e, B:244:0x044e, B:247:0x0456, B:249:0x0466, B:250:0x0473, B:254:0x0479, B:256:0x0482, B:259:0x048a, B:263:0x049d, B:265:0x04a6, B:279:0x04e9, B:281:0x04f2, B:283:0x04fa, B:285:0x0519, B:287:0x0521, B:289:0x0545, B:291:0x054d, B:293:0x055e, B:295:0x0566, B:297:0x0591, B:299:0x0599, B:301:0x05ab, B:302:0x05ae, B:304:0x05b2, B:268:0x04ae, B:270:0x04b8, B:271:0x04bb, B:273:0x04d1, B:274:0x04e3, B:277:0x04da), top: B:174:0x0314, inners: #5, #8, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a6 A[Catch: JSONException -> 0x034d, TryCatch #23 {JSONException -> 0x034d, blocks: (B:175:0x0314, B:178:0x0321, B:185:0x0344, B:187:0x0350, B:194:0x036d, B:196:0x0376, B:198:0x037e, B:208:0x0382, B:201:0x038f, B:203:0x0399, B:205:0x03a6, B:210:0x0387, B:211:0x03ab, B:218:0x03cc, B:220:0x03d5, B:227:0x03f2, B:229:0x03fb, B:231:0x0403, B:234:0x0427, B:236:0x041a, B:239:0x0421, B:240:0x0436, B:242:0x043e, B:244:0x044e, B:247:0x0456, B:249:0x0466, B:250:0x0473, B:254:0x0479, B:256:0x0482, B:259:0x048a, B:263:0x049d, B:265:0x04a6, B:279:0x04e9, B:281:0x04f2, B:283:0x04fa, B:285:0x0519, B:287:0x0521, B:289:0x0545, B:291:0x054d, B:293:0x055e, B:295:0x0566, B:297:0x0591, B:299:0x0599, B:301:0x05ab, B:302:0x05ae, B:304:0x05b2, B:268:0x04ae, B:270:0x04b8, B:271:0x04bb, B:273:0x04d1, B:274:0x04e3, B:277:0x04da), top: B:174:0x0314, inners: #5, #8, #13, #15 }] */
    @Override // n0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(c0.a aVar, m0.k kVar) {
        ClipDescription primaryClipDescription;
        m0.d a2;
        CharSequence q2;
        Object obj;
        Bundle bundle;
        boolean z2 = false;
        z2 = false;
        switch (this.f39b) {
            case 12:
                c0.a aVar2 = (c0.a) this.f40c;
                if (((o0.a) aVar2.f67d) != null) {
                    if (!((String) aVar.f66c).equals("Localization.getStringResource")) {
                        kVar.b();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) aVar.f67d;
                        try {
                            kVar.d(((o0.a) aVar2.f67d).c(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                            break;
                        } catch (JSONException e2) {
                            kVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 13:
                n nVar = (n) this.f40c;
                if (((o0.a) nVar.f40c) != null) {
                    String str = (String) aVar.f66c;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((o0.a) nVar.f40c).a((String) ((HashMap) aVar.f67d).get("kind"));
                                kVar.d(Boolean.TRUE);
                            } catch (Exception e3) {
                                kVar.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                            }
                        }
                    } catch (Exception e4) {
                        kVar.a("error", "Unhandled error: " + e4.getMessage(), null);
                        return;
                    }
                }
                break;
            case 14:
            case 18:
            case 19:
            case 23:
            case 25:
            default:
                c0.a aVar3 = (c0.a) this.f40c;
                io.flutter.plugin.editing.k kVar2 = (io.flutter.plugin.editing.k) aVar3.f67d;
                if (kVar2 != null) {
                    String str2 = (String) aVar.f66c;
                    obj = aVar.f67d;
                    switch (str2) {
                        case "TextInput.setPlatformViewClient":
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i2 = jSONObject2.getInt("platformViewId");
                                boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.n nVar2 = ((io.flutter.plugin.editing.k) aVar3.f67d).f467a;
                                View view = nVar2.f473a;
                                if (optBoolean) {
                                    view.requestFocus();
                                    nVar2.f477e = new io.flutter.plugin.editing.m(3, i2);
                                    nVar2.f474b.restartInput(view);
                                    nVar2.f481i = false;
                                } else {
                                    nVar2.f477e = new io.flutter.plugin.editing.m(4, i2);
                                    nVar2.f482j = null;
                                }
                                kVar.d(null);
                                break;
                            } catch (JSONException e5) {
                                kVar.a("error", e5.getMessage(), null);
                            }
                        case "TextInput.setEditingState":
                            try {
                                kVar2.c(m0.q.a((JSONObject) obj));
                                kVar.d(null);
                                break;
                            } catch (JSONException e6) {
                                kVar.a("error", e6.getMessage(), null);
                                return;
                            }
                        case "TextInput.setClient":
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((io.flutter.plugin.editing.k) aVar3.f67d).a(jSONArray.getInt(0), m0.o.a(jSONArray.getJSONObject(1)));
                                kVar.d(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e7) {
                                kVar.a("error", e7.getMessage(), null);
                                return;
                            }
                        case "TextInput.hide":
                            io.flutter.plugin.editing.n nVar3 = kVar2.f467a;
                            if (nVar3.f477e.f471a == 4) {
                                nVar3.c();
                            } else {
                                View view2 = nVar3.f473a;
                                nVar3.c();
                                nVar3.f474b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            kVar.d(null);
                            break;
                        case "TextInput.show":
                            io.flutter.plugin.editing.n nVar4 = kVar2.f467a;
                            InputMethodManager inputMethodManager = nVar4.f474b;
                            View view3 = nVar4.f473a;
                            m0.o oVar = nVar4.f478f;
                            if (oVar == null || oVar.f826g.f832a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                nVar4.c();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            kVar.d(null);
                            break;
                        case "TextInput.sendAppPrivateCommand":
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                String string = jSONObject3.getString("action");
                                String string2 = jSONObject3.getString("data");
                                if (string2 == null || string2.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                }
                                io.flutter.plugin.editing.n nVar5 = ((io.flutter.plugin.editing.k) aVar3.f67d).f467a;
                                nVar5.f474b.sendAppPrivateCommand(nVar5.f473a, string, bundle);
                                kVar.d(null);
                                break;
                            } catch (JSONException e8) {
                                kVar.a("error", e8.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setEditableSizeAndTransform":
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d2 = jSONObject4.getDouble("width");
                                double d3 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i3 = 0; i3 < 16; i3++) {
                                    dArr[i3] = jSONArray2.getDouble(i3);
                                }
                                ((io.flutter.plugin.editing.k) aVar3.f67d).b(d2, d3, dArr);
                                kVar.d(null);
                                break;
                            } catch (JSONException e9) {
                                kVar.a("error", e9.getMessage(), null);
                                return;
                            }
                        case "TextInput.finishAutofillContext":
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = kVar2.f467a.f475c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                kVar2.getClass();
                            }
                            kVar.d(null);
                            break;
                        case "TextInput.clearClient":
                            io.flutter.plugin.editing.n nVar6 = kVar2.f467a;
                            View view4 = nVar6.f473a;
                            if (nVar6.f477e.f471a != 3) {
                                nVar6.f480h.e(nVar6);
                                nVar6.c();
                                nVar6.f478f = null;
                                nVar6.d(null);
                                nVar6.f477e = new io.flutter.plugin.editing.m(1, 0);
                                nVar6.m = null;
                                int i4 = l.d.f736a;
                                l.r a3 = l.c.a(view4);
                                if (a3 != null && !a3.f759a.m(8)) {
                                    nVar6.f474b.restartInput(view4);
                                }
                            }
                            kVar.d(null);
                            break;
                        case "TextInput.requestAutofill":
                            io.flutter.plugin.editing.n nVar7 = kVar2.f467a;
                            View view5 = nVar7.f473a;
                            if (Build.VERSION.SDK_INT >= 26 && nVar7.f475c != null && nVar7.f479g != null) {
                                String str3 = (String) nVar7.f478f.f829j.f70a;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(nVar7.m);
                                rect.offset(iArr[0], iArr[1]);
                                nVar7.f475c.notifyViewEntered(view5, str3.hashCode(), rect);
                            }
                            kVar.d(null);
                            break;
                        default:
                            kVar.b();
                            break;
                    }
                }
                break;
            case 15:
                c0.a aVar4 = (c0.a) this.f40c;
                if (((n) aVar4.f67d) != null) {
                    String str4 = (String) aVar.f66c;
                    Object obj2 = aVar.f67d;
                    try {
                        switch (str4.hashCode()) {
                            case -1501580720:
                                if (str4.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                    boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                    e0.f fVar = ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).f496c;
                                    if (fVar != null) {
                                        fVar.h(booleanValue2);
                                    }
                                    kVar.d(null);
                                    break;
                                }
                                kVar.b();
                                break;
                            case -931781241:
                                if (str4.equals("Share.invoke")) {
                                    io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c;
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", (String) obj2);
                                    eVar.f494a.startActivity(Intent.createChooser(intent, null));
                                    kVar.d(null);
                                    break;
                                }
                                kVar.b();
                                break;
                            case -766342101:
                                if (str4.equals("SystemNavigator.pop")) {
                                    ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).f494a.finish();
                                    kVar.d(null);
                                    break;
                                }
                                kVar.b();
                                break;
                            case -720677196:
                                if (str4.equals("Clipboard.setData")) {
                                    ((ClipboardManager) ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).f494a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj2).getString("text")));
                                    kVar.d(null);
                                    break;
                                }
                                kVar.b();
                                break;
                            case -577225884:
                                if (str4.equals("SystemChrome.setSystemUIChangeListener")) {
                                    io.flutter.plugin.platform.e eVar2 = (io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c;
                                    View decorView = eVar2.f494a.getWindow().getDecorView();
                                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar2, decorView));
                                    kVar.d(null);
                                    break;
                                }
                                kVar.b();
                                break;
                            case -548468504:
                                if (str4.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                    try {
                                        JSONObject jSONObject5 = (JSONObject) obj2;
                                        int i5 = jSONObject5.getInt("primaryColor");
                                        if (i5 != 0) {
                                            i5 |= -16777216;
                                        }
                                        String string3 = jSONObject5.getString("label");
                                        Activity activity = ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).f494a;
                                        if (Build.VERSION.SDK_INT < 28) {
                                            activity.setTaskDescription(new ActivityManager.TaskDescription(string3, (Bitmap) null, i5));
                                        } else {
                                            activity.setTaskDescription(a0.c.b(string3, i5));
                                        }
                                        kVar.d(null);
                                        break;
                                    } catch (JSONException e10) {
                                        kVar.a("error", e10.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            case -247230243:
                                if (str4.equals("HapticFeedback.vibrate")) {
                                    try {
                                        ((n) aVar4.f67d).D(e0.j.b((String) obj2));
                                        kVar.d(null);
                                        break;
                                    } catch (NoSuchFieldException e11) {
                                        kVar.a("error", e11.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            case -215273374:
                                if (str4.equals("SystemSound.play")) {
                                    try {
                                        int c2 = e0.j.c((String) obj2);
                                        io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c;
                                        if (c2 == 1) {
                                            eVar3.f494a.getWindow().getDecorView().playSoundEffect(0);
                                        }
                                        kVar.d(null);
                                        break;
                                    } catch (NoSuchFieldException e12) {
                                        kVar.a("error", e12.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            case 241845679:
                                if (str4.equals("SystemChrome.restoreSystemUIOverlays")) {
                                    ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).b();
                                    kVar.d(null);
                                    break;
                                }
                                kVar.b();
                                break;
                            case 875995648:
                                if (str4.equals("Clipboard.hasStrings")) {
                                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).f494a.getSystemService("clipboard");
                                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                        z2 = primaryClipDescription.hasMimeType("text/*");
                                    }
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("value", z2);
                                    kVar.d(jSONObject6);
                                    break;
                                }
                                kVar.b();
                                break;
                            case 1128339786:
                                if (str4.equals("SystemChrome.setEnabledSystemUIMode")) {
                                    try {
                                        ((n) aVar4.f67d).C(c0.a.v(aVar4, (String) obj2));
                                        kVar.d(null);
                                        break;
                                    } catch (NoSuchFieldException | JSONException e13) {
                                        kVar.a("error", e13.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            case 1390477857:
                                if (str4.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                    try {
                                        ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).a(c0.a.w(aVar4, (JSONObject) obj2));
                                        kVar.d(null);
                                        break;
                                    } catch (NoSuchFieldException | JSONException e14) {
                                        kVar.a("error", e14.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            case 1514180520:
                                if (str4.equals("Clipboard.getData")) {
                                    String str5 = (String) obj2;
                                    if (str5 != null) {
                                        try {
                                            a2 = m0.d.a(str5);
                                        } catch (NoSuchFieldException unused) {
                                            kVar.a("error", "No such clipboard content format: ".concat(str5), null);
                                        }
                                        q2 = ((n) aVar4.f67d).q(a2);
                                        if (q2 == null) {
                                            JSONObject jSONObject7 = new JSONObject();
                                            jSONObject7.put("text", q2);
                                            kVar.d(jSONObject7);
                                            break;
                                        } else {
                                            kVar.d(null);
                                            break;
                                        }
                                    }
                                    a2 = null;
                                    q2 = ((n) aVar4.f67d).q(a2);
                                    if (q2 == null) {
                                    }
                                }
                                kVar.b();
                                break;
                            case 1674312266:
                                if (str4.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                    try {
                                        ((n) aVar4.f67d).B(c0.a.u(aVar4, (JSONArray) obj2));
                                        kVar.d(null);
                                        break;
                                    } catch (NoSuchFieldException | JSONException e15) {
                                        kVar.a("error", e15.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            case 2119655719:
                                if (str4.equals("SystemChrome.setPreferredOrientations")) {
                                    try {
                                        ((io.flutter.plugin.platform.e) ((n) aVar4.f67d).f40c).f494a.setRequestedOrientation(c0.a.t(aVar4, (JSONArray) obj2));
                                        kVar.d(null);
                                        break;
                                    } catch (NoSuchFieldException | JSONException e16) {
                                        kVar.a("error", e16.getMessage(), null);
                                        return;
                                    }
                                }
                                kVar.b();
                                break;
                            default:
                                kVar.b();
                                break;
                        }
                    } catch (JSONException e17) {
                        kVar.a("error", "JSON error: " + e17.getMessage(), null);
                        return;
                    }
                }
                break;
            case 16:
                v(aVar, kVar);
                break;
            case 17:
                w(aVar, kVar);
                break;
            case 20:
                c0.a aVar5 = (c0.a) this.f40c;
                q0.a aVar6 = (q0.a) aVar5.f67d;
                if (aVar6 != null) {
                    String str6 = (String) aVar.f66c;
                    Object obj3 = aVar.f67d;
                    if (str6.equals("ProcessText.processTextAction")) {
                        try {
                            ArrayList arrayList = (ArrayList) obj3;
                            ((q0.a) aVar5.f67d).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), kVar);
                            break;
                        } catch (IllegalStateException e18) {
                            kVar.a("error", e18.getMessage(), null);
                            return;
                        }
                    } else if (!str6.equals("ProcessText.queryTextActions")) {
                        kVar.b();
                        break;
                    } else {
                        try {
                            kVar.d(aVar6.b());
                            break;
                        } catch (IllegalStateException e19) {
                            kVar.a("error", e19.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 21:
                x(aVar, kVar);
                break;
            case 22:
                y(aVar, kVar);
                break;
            case 24:
                z(aVar, kVar);
                break;
            case 26:
                A(aVar, kVar);
                break;
        }
    }

    @Override // m0.j
    public void m(int i2) {
        switch (this.f39b) {
            case 8:
                if (((io.flutter.plugin.platform.j) this.f40c).f523l.get(i2) != null) {
                    f0.l.a();
                    break;
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                    break;
                }
            default:
                io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.f40c;
                iVar.f511n.remove(Integer.valueOf(i2));
                if (iVar.f506h.get(i2) != null) {
                    f0.l.a();
                    break;
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                    break;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [i0.a] */
    public Bitmap o(ByteBuffer byteBuffer, i0.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: i0.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    n nVar = n.this;
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    m mVar = (m) nVar.f40c;
                    if (mVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(mVar.f330a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    @Override // m0.j
    public void p(m0.h hVar) {
        int i2 = hVar.f788a;
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        float f2 = jVar.f514c.getResources().getDisplayMetrics().density;
        if (!jVar.k(i2)) {
            if (jVar.f523l.get(i2) != null) {
                f0.l.a();
                return;
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.p pVar = (io.flutter.plugin.platform.p) jVar.f521j.get(Integer.valueOf(i2));
        long j2 = hVar.f802p;
        int i3 = hVar.f792e;
        c0.a aVar = jVar.u;
        aVar.getClass();
        LongSparseArray longSparseArray = (LongSparseArray) aVar.f66c;
        PriorityQueue priorityQueue = (PriorityQueue) aVar.f67d;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j2) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) hVar.f794g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) hVar.f793f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(hVar.f789b.longValue(), hVar.f790c.longValue(), hVar.f791d, hVar.f792e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, hVar.f795h, hVar.f796i, hVar.f797j, hVar.f798k, hVar.f799l, hVar.m, hVar.f800n, hVar.f801o);
        pVar.getClass();
    }

    public CharSequence q(m0.d dVar) {
        Activity activity = ((io.flutter.plugin.platform.e) this.f40c).f494a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (dVar != null) {
                            if (dVar == m0.d.f772b) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e2) {
                                charSequence = coerceToText;
                                e = e2;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            charSequence = text;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e5) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
                return charSequence;
            }
        }
        return null;
    }

    @Override // m0.j
    public boolean r() {
        return false;
    }

    @Override // m0.j
    public void s(m0.g gVar) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f40c;
        io.flutter.plugin.platform.j.a(jVar, gVar);
        if (jVar.f516e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        f0.k kVar = jVar.f513b;
        String str = gVar.f786b;
        if (kVar.f329a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public void u(Object obj, c0.a aVar) {
        HashMap hashMap;
        HashMap hashMap2;
        h0 h0Var = (h0) this.f40c;
        if (((io.flutter.view.c) h0Var.f153c) == null) {
            aVar.o(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.i iVar = (io.flutter.view.i) ((io.flutter.view.c) h0Var.f153c).f541a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent d2 = iVar.d(0, 32);
                        d2.getText().add(str2);
                        iVar.h(d2);
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar = (io.flutter.view.c) h0Var.f153c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) cVar.f541a).f601a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) h0Var.f153c;
                    ((io.flutter.view.i) cVar2.f541a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) h0Var.f153c;
                    ((io.flutter.view.i) cVar3.f541a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) h0Var.f153c;
                    ((io.flutter.view.i) cVar4.f541a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        aVar.o(null);
    }

    public n() {
        Handler handler;
        this.f39b = 4;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            handler = new Handler(mainLooper);
        }
        this.f40c = handler;
    }

    public /* synthetic */ n(int i2, Object obj) {
        this.f39b = i2;
        this.f40c = obj;
    }

    public n(n0.e eVar) {
        this.f39b = 11;
        new h0(eVar, "flutter/keyboard", n0.m.f936a).h(new c0.a(this));
    }
}
