package D3;

import T0.C0174i;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.onesignal.inAppMessages.internal.display.impl.a;
import j5.InterfaceC0438a;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;
import u.AbstractC0666a;
import u0.C0673c;
import u0.C0675e;
import u0.C0682l;
import u0.C0689s;

/* loaded from: classes.dex */
public final class M implements L, F0.b, O3.e, O3.i, P.d, T0.v, T0.G {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400f;

    /* renamed from: g, reason: collision with root package name */
    public Object f401g;

    public /* synthetic */ M(int i7, Object obj) {
        this.f400f = i7;
        this.f401g = obj;
    }

    @Override // T0.G
    public void a(Bundle bundle) {
        C0174i c0174i = (C0174i) this.f401g;
        c0174i.f2303l.lock();
        try {
            Bundle bundle2 = c0174i.f2299h;
            if (bundle2 == null) {
                c0174i.f2299h = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c0174i.f2300i = R0.a.f2051j;
            C0174i.h(c0174i);
        } finally {
            c0174i.f2303l.unlock();
        }
    }

    @Override // T0.G
    public void b(R0.a aVar) {
        C0174i c0174i = (C0174i) this.f401g;
        c0174i.f2303l.lock();
        try {
            c0174i.f2300i = aVar;
            C0174i.h(c0174i);
        } finally {
            c0174i.f2303l.unlock();
        }
    }

    @Override // O3.e
    public void d(String str, O3.c cVar) {
        ((F3.g) this.f401g).r(str, cVar);
    }

    @Override // D3.L
    public void e() {
        ((N) this.f401g).f403b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // O3.i
    public void g(C0675e c0675e, N3.j jVar) {
        char c7;
        char c8;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c9;
        int i7 = 3;
        int i8 = 2;
        switch (this.f400f) {
            case 11:
                J1.c cVar = (J1.c) this.f401g;
                if (((M) cVar.f1289g) == null) {
                    return;
                }
                String str = (String) c0675e.f5975b;
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        try {
                            ((M) cVar.f1289g).r((String) ((HashMap) c0675e.f5976c).get("kind"));
                            jVar.d(Boolean.TRUE);
                        } catch (Exception e4) {
                            jVar.a("error", "Error when setting cursors: " + e4.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e7) {
                    jVar.a("error", "Unhandled error: " + e7.getMessage(), null);
                    return;
                }
            case 12:
                J1.c cVar2 = (J1.c) this.f401g;
                if (((N3.i) cVar2.f1289g) == null) {
                    return;
                }
                String str2 = (String) c0675e.f5975b;
                Object obj = c0675e.f5976c;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1352294148:
                        if (str2.equals("create")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1019779949:
                        if (str2.equals("offset")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -934437708:
                        if (str2.equals(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_RESIZE)) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -756050293:
                        if (str2.equals("clearFocus")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -308988850:
                        if (str2.equals("synchronizeToNativeViewHierarchy")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 110550847:
                        if (str2.equals("touch")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 576796989:
                        if (str2.equals("setDirection")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        Map map = (Map) obj;
                        boolean z5 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (((N3.i) cVar2.f1289g).p()) {
                                ((N3.i) cVar2.f1289g).q(new D4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                                throw null;
                            }
                            if (z5) {
                                ((N3.i) cVar2.f1289g).a(new D4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                throw null;
                            }
                            ((N3.i) cVar2.f1289g).m(new D4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                            throw null;
                        } catch (IllegalStateException e8) {
                            jVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        Map map2 = (Map) obj;
                        try {
                            ((N3.i) cVar2.f1289g).d(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e9) {
                            jVar.a("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        Map map3 = (Map) obj;
                        try {
                            ((N3.i) cVar2.f1289g).f(new N3.h(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new B1.g(13, jVar));
                            return;
                        } catch (IllegalStateException e10) {
                            jVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 3:
                        try {
                            ((N3.i) cVar2.f1289g).j(((Integer) obj).intValue());
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e11) {
                            jVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 4:
                        try {
                            ((N3.i) cVar2.f1289g).b(((Boolean) obj).booleanValue());
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e12) {
                            jVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj;
                        try {
                            ((N3.i) cVar2.f1289g).l(new N3.g(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e13) {
                            jVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj;
                        try {
                            ((N3.i) cVar2.f1289g).e(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e14) {
                            jVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case 7:
                        try {
                            ((N3.i) cVar2.f1289g).n(((Integer) ((Map) obj).get("id")).intValue());
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e15) {
                            jVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 13:
            default:
                J1.c cVar3 = (J1.c) this.f401g;
                if (((io.flutter.plugin.editing.g) cVar3.f1289g) == null) {
                    return;
                }
                String str3 = (String) c0675e.f5975b;
                Object obj2 = c0675e.f5976c;
                str3.getClass();
                if (!str3.equals("SpellCheck.initiateSpellCheck")) {
                    jVar.b();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj2;
                    ((io.flutter.plugin.editing.g) cVar3.f1289g).a((String) arrayList.get(0), (String) arrayList.get(1), jVar);
                    return;
                } catch (IllegalStateException e16) {
                    jVar.a("error", e16.getMessage(), null);
                    return;
                }
            case 14:
                C0689s c0689s = (C0689s) this.f401g;
                if (((R3.a) c0689s.f6035g) == null) {
                    return;
                }
                String str4 = (String) c0675e.f5975b;
                Object obj3 = c0675e.f5976c;
                str4.getClass();
                if (str4.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList2 = (ArrayList) obj3;
                        ((R3.a) c0689s.f6035g).a((String) arrayList2.get(0), (String) arrayList2.get(1), ((Boolean) arrayList2.get(2)).booleanValue(), jVar);
                        return;
                    } catch (IllegalStateException e17) {
                        jVar.a("error", e17.getMessage(), null);
                        return;
                    }
                }
                if (!str4.equals("ProcessText.queryTextActions")) {
                    jVar.b();
                    return;
                }
                try {
                    jVar.d(((R3.a) c0689s.f6035g).b());
                    return;
                } catch (IllegalStateException e18) {
                    jVar.a("error", e18.getMessage(), null);
                    return;
                }
            case 15:
                J1.c cVar4 = (J1.c) this.f401g;
                if (((C0682l) cVar4.f1289g) == null) {
                    return;
                }
                String str5 = (String) c0675e.f5975b;
                str5.getClass();
                switch (str5.hashCode()) {
                    case -705821951:
                        if (str5.equals("Scribe.isFeatureAvailable")) {
                            c8 = 0;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1759284829:
                        if (str5.equals("Scribe.startStylusHandwriting")) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 2119738044:
                        if (str5.equals("Scribe.isStylusHandwritingAvailable")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        try {
                            C0682l c0682l = (C0682l) cVar4.f1289g;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) c0682l.f5989f).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    jVar.d(Boolean.valueOf(r9));
                                    return;
                                }
                            } else {
                                c0682l.getClass();
                            }
                            r9 = false;
                            jVar.d(Boolean.valueOf(r9));
                            return;
                        } catch (IllegalStateException e19) {
                            jVar.a("error", e19.getMessage(), null);
                            return;
                        }
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        if (Build.VERSION.SDK_INT < 33) {
                            jVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            C0682l c0682l2 = (C0682l) cVar4.f1289g;
                            ((InputMethodManager) c0682l2.f5989f).startStylusHandwriting((View) c0682l2.f5990g);
                            jVar.d(null);
                            return;
                        } catch (IllegalStateException e20) {
                            jVar.a("error", e20.getMessage(), null);
                            return;
                        }
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        if (Build.VERSION.SDK_INT < 34) {
                            jVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((C0682l) cVar4.f1289g).f5989f).isStylusHandwritingAvailable();
                            jVar.d(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e21) {
                            jVar.a("error", e21.getMessage(), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 16:
                J1.c cVar5 = (J1.c) this.f401g;
                if (((D1.b) cVar5.f1289g) == null) {
                    return;
                }
                String str6 = (String) c0675e.f5975b;
                str6.getClass();
                switch (str6.hashCode()) {
                    case -1937987631:
                        if (str6.equals("SensitiveContent.getContentSensitivity")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 598223325:
                        if (str6.equals("SensitiveContent.setContentSensitivity")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1615625817:
                        if (str6.equals("SensitiveContent.isSupported")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
                    case 0:
                        try {
                            int c10 = ((D1.b) cVar5.f1289g).c();
                            if (c10 == 0) {
                                i7 = 0;
                            } else if (c10 == 1) {
                                i7 = 1;
                            } else if (c10 == 2) {
                                i7 = 2;
                            }
                            jVar.d(Integer.valueOf(i7));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e22) {
                            jVar.a("error", e22.getMessage(), null);
                            return;
                        }
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        int intValue = ((Integer) c0675e.f5976c).intValue();
                        try {
                            D1.b bVar = (D1.b) cVar5.f1289g;
                            if (intValue == 0) {
                                i8 = 0;
                            } else if (intValue == 1) {
                                i8 = 1;
                            } else if (intValue != 2) {
                                throw new IllegalArgumentException(C1.c.g("contentSensitivityIndex ", intValue, " not known to the SensitiveContentChannel."));
                            }
                            bVar.i(i8);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e23) {
                            jVar.a("error", e23.getMessage(), null);
                            return;
                        }
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        ((D1.b) cVar5.f1289g).getClass();
                        jVar.d(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        jVar.b();
                        return;
                }
        }
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        switch (this.f400f) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new E0.d((Context) ((J1.c) this.f401g).f1289g, new U0.h(4), new R0.g());
            default:
                return new K0.j(Integer.valueOf(K0.j.f1364i).intValue(), (Context) ((InterfaceC0438a) this.f401g).get(), "com.google.android.datatransport.events");
        }
    }

    @Override // T0.v
    public void h() {
        T0.x xVar = (T0.x) this.f401g;
        Iterator it = xVar.f2370i.values().iterator();
        while (it.hasNext()) {
            ((S0.a) it.next()).l();
        }
        xVar.f2377p.f2359u = Collections.EMPTY_SET;
    }

    @Override // T0.v
    public void j() {
        T0.x xVar = (T0.x) this.f401g;
        xVar.f2365d.lock();
        try {
            xVar.f2375n = new T0.r(xVar, xVar.f2372k, xVar.f2373l, xVar.f2368g, xVar.f2374m, xVar.f2365d, xVar.f2367f);
            xVar.f2375n.h();
            xVar.f2366e.signalAll();
        } finally {
            xVar.f2365d.unlock();
        }
    }

    @Override // O3.e
    public void k(String str, ByteBuffer byteBuffer, O3.d dVar) {
        ((F3.g) this.f401g).k(str, byteBuffer, dVar);
    }

    @Override // P.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // P.d
    public void m(int i7, Object obj) {
        String str;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f401g).setResultCode(i7);
    }

    @Override // T0.v
    public boolean o() {
        return true;
    }

    @Override // D3.L
    public void p(io.flutter.embedding.engine.renderer.h hVar) {
        ((N) this.f401g).f403b = hVar;
    }

    @Override // T0.G
    public void q(int i7) {
        R0.a aVar;
        C0174i c0174i = (C0174i) this.f401g;
        Lock lock = c0174i.f2303l;
        lock.lock();
        try {
            if (!c0174i.f2302k && (aVar = c0174i.f2301j) != null && aVar.b()) {
                c0174i.f2302k = true;
                c0174i.f2297f.onConnectionSuspended(i7);
                return;
            }
            c0174i.f2302k = false;
            C0174i.g(c0174i, i7);
        } finally {
            lock.unlock();
        }
    }

    public void r(String str) {
        Q3.a aVar = (Q3.a) ((C0675e) this.f401g).f5975b;
        if (C0675e.f5973e == null) {
            F f7 = new F();
            f7.put("alias", 1010);
            f7.put("allScroll", 1013);
            f7.put("basic", 1000);
            f7.put("cell", 1006);
            f7.put("click", 1002);
            f7.put("contextMenu", 1001);
            f7.put("copy", 1011);
            f7.put("forbidden", 1012);
            f7.put("grab", 1020);
            f7.put("grabbing", 1021);
            f7.put("help", 1003);
            f7.put("move", 1013);
            f7.put("none", 0);
            f7.put("noDrop", 1012);
            f7.put("precise", 1007);
            f7.put("text", 1008);
            f7.put("resizeColumn", 1014);
            f7.put("resizeDown", 1015);
            f7.put("resizeUpLeft", 1016);
            f7.put("resizeDownRight", 1017);
            f7.put("resizeLeft", 1014);
            f7.put("resizeLeftRight", 1014);
            f7.put("resizeRight", 1014);
            f7.put("resizeRow", 1015);
            f7.put("resizeUp", 1015);
            f7.put("resizeUpDown", 1015);
            f7.put("resizeUpLeft", 1017);
            f7.put("resizeUpRight", 1016);
            f7.put("resizeUpLeftDownRight", 1017);
            f7.put("resizeUpRightDownLeft", 1016);
            f7.put("verticalText", 1009);
            f7.put("wait", 1004);
            f7.put("zoomIn", 1018);
            f7.put("zoomOut", 1019);
            C0675e.f5973e = f7;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((t) aVar).getContext(), ((Integer) C0675e.f5973e.getOrDefault(str, 1000)).intValue()));
    }

    public void s(R.a... migrations) {
        kotlin.jvm.internal.i.e(migrations, "migrations");
        for (R.a aVar : migrations) {
            int i7 = aVar.f2049a;
            int i8 = aVar.f2050b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f401g;
            Integer valueOf = Integer.valueOf(i7);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i8))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i8)) + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i8), aVar);
        }
    }

    public V3.a t() {
        ArrayList arrayList = (ArrayList) this.f401g;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new V3.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = V3.a.f2705h;
        for (int i7 = 0; i7 < array.length; i7 += 2) {
            a4.e eVar = (a4.e) array[i7];
            if (eVar != null && eVar.f3140b.isEmpty()) {
                array[i7] = null;
            }
        }
        return new V3.a(array, V3.a.f2705h);
    }

    public void u(a4.e eVar, Object obj) {
        ArrayList arrayList = (ArrayList) this.f401g;
        if (eVar == null || eVar.f3140b.isEmpty() || obj == null) {
            return;
        }
        arrayList.add(eVar);
        arrayList.add(obj);
    }

    public void v(String str, String str2) {
        u(a4.e.a(V3.b.f2707f, str), str2);
    }

    public void w(V3.c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.forEach(new I4.a(1, this));
    }

    public M(int i7, Supplier supplier, Q4.m mVar, String str) {
        V3.a aVar;
        this.f400f = 3;
        Q4.l lVar = mVar.f2041e;
        int i8 = lVar.f2037g;
        int c7 = N.p.c(i7);
        Object obj = E4.f.f674a;
        if (c7 == 0) {
            a4.e eVar = E4.d.f664i;
            switch (lVar.ordinal()) {
                case 0:
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                    obj = new E4.d(supplier, lVar);
                    break;
            }
            this.f401g = obj;
            return;
        }
        if (c7 != 1) {
            throw new IllegalStateException("Unhandled case: ".concat(C1.c.m(i7)));
        }
        if (i8 != 4) {
            try {
                URI uri = new URI(str);
                M m4 = new M(27);
                String host = uri.getHost();
                if (host != null) {
                    m4.u(Q4.k.f2031d, host);
                }
                int port = uri.getPort();
                if (port == -1) {
                    String scheme = uri.getScheme();
                    if ("https".equals(scheme)) {
                        port = 443;
                    } else if ("http".equals(scheme)) {
                        port = 80;
                    }
                }
                if (port != -1) {
                    m4.u(Q4.k.f2032e, Long.valueOf(port));
                }
                aVar = m4.t();
            } catch (URISyntaxException unused) {
                aVar = V3.a.f2706i;
            }
            obj = new E4.h(supplier, i8, mVar, aVar);
        }
        this.f401g = obj;
    }

    public M(F3.b bVar, int i7) {
        this.f400f = i7;
        switch (i7) {
            case 18:
                this.f401g = new B0.c((Object) bVar, "flutter/system", (Object) O3.g.f1769a, 11);
                break;
            default:
                new B0.c((Object) bVar, "flutter/platform_views_2", (Object) O3.m.f1774a, 12).C(new J1.c(16, this));
                break;
        }
    }

    public M(Context context) {
        boolean isEmpty;
        this.f400f = 6;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f401g = sharedPreferences;
        File file = new File(AbstractC0666a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e4) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e4.getMessage());
            }
        }
    }

    public M(O3.e eVar) {
        this.f400f = 10;
        C0673c c0673c = new C0673c();
        c0673c.f5969g = this;
        c0673c.f5968f = new HashMap();
        new B0.c((Object) eVar, "flutter/keyboard", (Object) O3.m.f1774a, 12).C(c0673c);
    }

    public M(int i7) {
        this.f400f = i7;
        switch (i7) {
            case 22:
                this.f401g = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 27:
                this.f401g = new ArrayList();
                break;
            default:
                this.f401g = new LinkedHashMap();
                break;
        }
    }

    @Override // D3.L
    public void i() {
    }

    @Override // T0.v
    public void c(Bundle bundle) {
    }

    @Override // T0.v
    public void f(int i7) {
    }

    @Override // T0.v
    public void n(R0.a aVar, S0.c cVar, boolean z5) {
    }
}
