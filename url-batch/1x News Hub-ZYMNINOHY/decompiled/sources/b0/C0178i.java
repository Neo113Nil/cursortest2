package b0;

import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import E1.K;
import E1.L;
import K.C0039c;
import K.C0054s;
import K.Z;
import K.b0;
import K.i0;
import K.j0;
import U.N;
import U.u;
import U.v;
import U1.A;
import U1.C0080a;
import U1.C0085f;
import a0.C0130a;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f0.C0322a;
import io.appmetrica.analytics.impl.C0642l9;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n0.C1147i;
import n0.C1148j;
import n0.InterfaceC1156r;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0178i implements WebMessageListenerBoundaryInterface, K, P1.f, P1.b, P1.m, S.d, N, InterfaceC1156r, w2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2531a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2532b;

    public /* synthetic */ C0178i(int i3, Object obj) {
        this.f2531a = i3;
        this.f2532b = obj;
    }

    public static int t(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    @Override // P1.b
    public void a(Object obj, V0.e eVar) {
        HashMap hashMap;
        HashMap hashMap2;
        A0.f fVar = (A0.f) this.f2532b;
        if (((io.flutter.view.c) fVar.f25d) == null) {
            eVar.n(null);
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
                    io.flutter.view.c cVar = (io.flutter.view.c) fVar.f25d;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.i iVar = (io.flutter.view.i) cVar.f9337a;
                        AccessibilityEvent e3 = iVar.e(0, 32);
                        e3.getText().add(str2);
                        iVar.i(e3);
                        break;
                    } else {
                        cVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) fVar.f25d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) cVar2.f9337a).f9422a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) fVar.f25d;
                    ((io.flutter.view.i) cVar3.f9337a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) fVar.f25d;
                    ((io.flutter.view.i) cVar4.f9337a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar5 = (io.flutter.view.c) fVar.f25d;
                    ((io.flutter.view.i) cVar5.f9337a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.n(null);
    }

    @Override // P1.f
    public void b(String str, P1.d dVar) {
        ((G1.i) this.f2532b).d(str, dVar, null);
    }

    @Override // S.d
    public void c(int i3, Serializable serializable) {
        String str;
        switch (i3) {
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
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f2532b).setResultCode(i3);
    }

    @Override // P1.f
    public void d(String str, P1.d dVar, K0.j jVar) {
        ((G1.i) this.f2532b).d(str, dVar, jVar);
    }

    @Override // P1.f
    public K0.j e(P1.j jVar) {
        return ((G1.i) this.f2532b).e(jVar);
    }

    @Override // U.N
    public int f() {
        u uVar = (u) this.f2532b;
        return uVar.f - uVar.t();
    }

    @Override // E1.K
    public void g() {
        L l3 = (L) this.f2532b;
        l3.f324a.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.j jVar = l3.f325b;
        if (jVar != null) {
            jVar.g(l3.f327d);
        }
        l3.f325b = null;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // U.N
    public int h(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f2532b).getClass();
        return (view.getLeft() - ((v) view.getLayoutParams()).f1457a.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin;
    }

    @Override // E1.K
    public void j() {
        L l3 = (L) this.f2532b;
        io.flutter.embedding.engine.renderer.j jVar = l3.f325b;
        if (jVar != null) {
            jVar.a(l3.f327d);
        }
    }

    @Override // P1.f
    public void k(String str, ByteBuffer byteBuffer) {
        ((G1.i) this.f2532b).q(str, byteBuffer, null);
    }

    @Override // S.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // U.N
    public View m(int i3) {
        return ((u) this.f2532b).o(i3);
    }

    @Override // w2.d
    public Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        Object n3 = ((w2.d) this.f2532b).n(new C0054s(eVar, 1), interfaceC0300c);
        return n3 == EnumC0317a.f4969a ? n3 : C0195i.f2555a;
    }

    @Override // U.N
    public int o() {
        return ((u) this.f2532b).s();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // P1.m
    public void onMethodCall(P1.l lVar, P1.n nVar) {
        char c3;
        char c4;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c5;
        int i3 = 2;
        boolean z = false;
        switch (this.f2531a) {
            case 11:
                ((K0.j) this.f2532b).getClass();
                return;
            case 12:
            case 14:
            default:
                C0.e eVar = (C0.e) this.f2532b;
                if (((io.flutter.plugin.editing.h) eVar.f201b) == null) {
                    return;
                }
                String str = lVar.f1266a;
                Object obj = lVar.f1267b;
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    ((O1.j) nVar).a();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ((io.flutter.plugin.editing.h) eVar.f201b).a((String) arrayList.get(0), (String) arrayList.get(1), (O1.j) nVar);
                    return;
                } catch (IllegalStateException e3) {
                    ((O1.j) nVar).b("error", e3.getMessage(), null);
                    return;
                }
            case 13:
                C0.e eVar2 = (C0.e) this.f2532b;
                if (((C0.e) eVar2.f201b) == null) {
                    return;
                }
                String str2 = lVar.f1266a;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((C0.e) eVar2.f201b).b((String) ((HashMap) lVar.f1267b).get("kind"));
                            ((O1.j) nVar).success(Boolean.TRUE);
                        } catch (Exception e4) {
                            ((O1.j) nVar).b("error", "Error when setting cursors: " + e4.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e5) {
                    ((O1.j) nVar).b("error", "Unhandled error: " + e5.getMessage(), null);
                    return;
                }
            case 15:
                V0.e eVar3 = (V0.e) this.f2532b;
                if (((O1.i) eVar3.f1600c) == null) {
                    return;
                }
                String str3 = lVar.f1266a;
                str3.getClass();
                Object obj2 = lVar.f1267b;
                switch (str3.hashCode()) {
                    case -1352294148:
                        if (str3.equals("create")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1019779949:
                        if (str3.equals("offset")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -934437708:
                        if (str3.equals("resize")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -756050293:
                        if (str3.equals("clearFocus")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -308988850:
                        if (str3.equals("synchronizeToNativeViewHierarchy")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 110550847:
                        if (str3.equals("touch")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 576796989:
                        if (str3.equals("setDirection")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1671767583:
                        if (str3.equals("dispose")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        Map map = (Map) obj2;
                        boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (((O1.i) eVar3.f1600c).q()) {
                                ((O1.i) eVar3.f1600c).h(new O1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                                ((O1.j) nVar).success(null);
                                return;
                            }
                            if (z2) {
                                ((O1.i) eVar3.f1600c).g(new O1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                ((O1.j) nVar).success(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z = true;
                            }
                            long p3 = ((O1.i) eVar3.f1600c).p(new O1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z ? 2 : 1, wrap));
                            if (p3 != -2) {
                                ((O1.j) nVar).success(Long.valueOf(p3));
                                return;
                            } else {
                                if (!z) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((O1.j) nVar).success(null);
                                return;
                            }
                        } catch (IllegalStateException e6) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            ((O1.i) eVar3.f1600c).d(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e7) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        try {
                            ((O1.i) eVar3.f1600c).a(new O1.h(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new O1.g((O1.j) nVar));
                            return;
                        } catch (IllegalStateException e8) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case 3:
                        try {
                            ((O1.i) eVar3.f1600c).l(((Integer) obj2).intValue());
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e9) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case 4:
                        try {
                            ((O1.i) eVar3.f1600c).b(((Boolean) obj2).booleanValue());
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e10) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj2;
                        try {
                            ((O1.i) eVar3.f1600c).k(new O1.f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj2;
                        try {
                            ((O1.i) eVar3.f1600c).e(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 7:
                        try {
                            ((O1.i) eVar3.f1600c).o(((Integer) ((Map) obj2).get("id")).intValue());
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((O1.j) nVar).b("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    default:
                        ((O1.j) nVar).a();
                        return;
                }
            case 16:
                V0.e eVar4 = (V0.e) this.f2532b;
                if (((S1.a) eVar4.f1600c) == null) {
                    return;
                }
                String str4 = lVar.f1266a;
                Object obj3 = lVar.f1267b;
                str4.getClass();
                if (str4.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList2 = (ArrayList) obj3;
                        ((S1.a) eVar4.f1600c).b((String) arrayList2.get(0), (String) arrayList2.get(1), ((Boolean) arrayList2.get(2)).booleanValue(), (O1.j) nVar);
                        return;
                    } catch (IllegalStateException e14) {
                        ((O1.j) nVar).b("error", e14.getMessage(), null);
                        return;
                    }
                }
                if (!str4.equals("ProcessText.queryTextActions")) {
                    ((O1.j) nVar).a();
                    return;
                }
                try {
                    ((O1.j) nVar).success(((S1.a) eVar4.f1600c).c());
                    return;
                } catch (IllegalStateException e15) {
                    ((O1.j) nVar).b("error", e15.getMessage(), null);
                    return;
                }
            case 17:
                C0.e eVar5 = (C0.e) this.f2532b;
                if (((C0322a) eVar5.f201b) == null) {
                    return;
                }
                String str5 = lVar.f1266a;
                str5.getClass();
                switch (str5.hashCode()) {
                    case -705821951:
                        if (str5.equals("Scribe.isFeatureAvailable")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1759284829:
                        if (str5.equals("Scribe.startStylusHandwriting")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2119738044:
                        if (str5.equals("Scribe.isStylusHandwritingAvailable")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        try {
                            C0322a c0322a = (C0322a) eVar5.f201b;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) c0322a.f4977b).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    ((O1.j) nVar).success(Boolean.valueOf(r11));
                                    return;
                                }
                            } else {
                                c0322a.getClass();
                            }
                            r11 = false;
                            ((O1.j) nVar).success(Boolean.valueOf(r11));
                            return;
                        } catch (IllegalStateException e16) {
                            ((O1.j) nVar).b("error", e16.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            ((O1.j) nVar).b("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            C0322a c0322a2 = (C0322a) eVar5.f201b;
                            ((InputMethodManager) c0322a2.f4977b).startStylusHandwriting((View) c0322a2.f4978c);
                            ((O1.j) nVar).success(null);
                            return;
                        } catch (IllegalStateException e17) {
                            ((O1.j) nVar).b("error", e17.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            ((O1.j) nVar).b("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((C0322a) eVar5.f201b).f4977b).isStylusHandwritingAvailable();
                            ((O1.j) nVar).success(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e18) {
                            ((O1.j) nVar).b("error", e18.getMessage(), null);
                            return;
                        }
                    default:
                        ((O1.j) nVar).a();
                        return;
                }
            case 18:
                C0.e eVar6 = (C0.e) this.f2532b;
                if (((T1.a) eVar6.f201b) == null) {
                    return;
                }
                String str6 = lVar.f1266a;
                str6.getClass();
                switch (str6.hashCode()) {
                    case -1937987631:
                        if (str6.equals("SensitiveContent.getContentSensitivity")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 598223325:
                        if (str6.equals("SensitiveContent.setContentSensitivity")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1615625817:
                        if (str6.equals("SensitiveContent.isSupported")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        try {
                            int e19 = ((T1.a) eVar6.f201b).e();
                            ((O1.j) nVar).success(Integer.valueOf(e19 != 0 ? e19 != 1 ? e19 != 2 ? 3 : 2 : 1 : 0));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e20) {
                            ((O1.j) nVar).b("error", e20.getMessage(), null);
                            return;
                        }
                    case 1:
                        int intValue = ((Integer) lVar.f1267b).intValue();
                        try {
                            T1.a aVar = (T1.a) eVar6.f201b;
                            eVar6.getClass();
                            if (intValue == 0) {
                                i3 = 0;
                            } else if (intValue == 1) {
                                i3 = 1;
                            } else if (intValue != 2) {
                                throw new IllegalArgumentException(AbstractC0033i.i(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                            }
                            aVar.f(i3);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e21) {
                            ((O1.j) nVar).b("error", e21.getMessage(), null);
                            return;
                        }
                    case 2:
                        ((T1.a) eVar6.f201b).getClass();
                        ((O1.j) nVar).success(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        ((O1.j) nVar).a();
                        return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        C0130a c0130a;
        C0130a c0130a2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) C2.b.e(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        C0.e[] eVarArr = new C0.e[ports.length];
        for (int i3 = 0; i3 < ports.length; i3++) {
            InvocationHandler invocationHandler3 = ports[i3];
            C0.e eVar = new C0.e(29);
            eVar.f201b = (WebMessagePortBoundaryInterface) C2.b.e(WebMessagePortBoundaryInterface.class, invocationHandler3);
            eVarArr[i3] = eVar;
        }
        if (AbstractC0182m.f2535a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C2.b.e(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                c0130a = new C0130a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    c0130a2 = null;
                    if (c0130a2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C2.b.e(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        r rVar = (r) this.f2532b;
                        int i4 = c0130a2.f1920b;
                        if (i4 != 0) {
                            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                            sb.append(i4 != 0 ? i4 != 1 ? "Unknown" : "ArrayBuffer" : "String");
                            sb.append(" expected, but got ");
                            sb.append("String");
                            throw new IllegalStateException(sb.toString());
                        }
                        String str = c0130a2.f1919a;
                        C0322a c0322a = (C0322a) rVar.f2543a;
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            String string = jSONObject.getString("method");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            ((C0080a) c0322a.f4978c).getClass();
                            C0080a.g(string, jSONObject2);
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                    return;
                }
                byte[] asArrayBuffer = webMessagePayloadBoundaryInterface.getAsArrayBuffer();
                c0130a = new C0130a();
                Objects.requireNonNull(asArrayBuffer);
                c0130a.f1919a = null;
                c0130a.f1920b = 1;
            }
        } else {
            c0130a = new C0130a(webMessageBoundaryInterface.getData());
        }
        c0130a2 = c0130a;
        if (c0130a2 == null) {
        }
    }

    @Override // n0.InterfaceC1156r
    public void onPurchasesUpdated(C1147i c1147i, List list) {
        U1.n j3 = S0.a.j(c1147i);
        List k3 = S0.a.k(list);
        A a3 = new A();
        a3.f1464a = j3;
        if (k3 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        a3.f1465b = k3;
        C0080a c0080a = new C0080a(3);
        C0.e eVar = (C0.e) this.f2532b;
        eVar.getClass();
        new B0.p((P1.f) eVar.f201b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated", (P1.k) C0085f.f1505a, (K0.j) null).h(new ArrayList(Collections.singletonList(a3)), new B0.k(c0080a, 5, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated"));
    }

    @Override // U.N
    public int p(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f2532b).getClass();
        return view.getRight() + ((v) view.getLayoutParams()).f1457a.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
    }

    @Override // P1.f
    public void q(String str, ByteBuffer byteBuffer, P1.e eVar) {
        ((G1.i) this.f2532b).q(str, byteBuffer, eVar);
    }

    @Override // E1.K
    public void r(io.flutter.embedding.engine.renderer.j jVar) {
        L l3 = (L) this.f2532b;
        io.flutter.embedding.engine.renderer.j jVar2 = l3.f325b;
        if (jVar2 != null) {
            jVar2.g(l3.f327d);
        }
        l3.f325b = jVar;
    }

    public i0 s() {
        w2.p pVar = (w2.p) this.f2532b;
        pVar.getClass();
        C1148j c1148j = x2.k.f10788a;
        Object obj = w2.p.f10686e.get(pVar);
        if (obj == c1148j) {
            obj = null;
        }
        return (i0) obj;
    }

    public String u(String str, String str2) {
        Q1.a aVar = (Q1.a) this.f2532b;
        Context context = aVar.f1282b;
        AbstractActivityC0029e abstractActivityC0029e = aVar.f1282b;
        if (str2 != null) {
            Locale a3 = Q1.a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0029e.getResources().getConfiguration());
            configuration.setLocale(a3);
            context = abstractActivityC0029e.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0029e.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public void v(boolean z) {
        ((WebSettingsBoundaryInterface) this.f2532b).setPaymentRequestEnabled(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f777a > r3.f777a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(i0 newState) {
        w2.p pVar;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.j.e(newState, "newState");
        do {
            pVar = (w2.p) this.f2532b;
            pVar.getClass();
            obj = x2.k.f10788a;
            Object obj3 = w2.p.f10686e.get(pVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            i0 i0Var = (i0) obj2;
            if (!(i0Var instanceof b0 ? true : kotlin.jvm.internal.j.a(i0Var, j0.f785b))) {
                if (!(i0Var instanceof C0039c)) {
                    if (!(i0Var instanceof Z)) {
                        throw new O0.b();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (i0Var != null) {
                    obj = i0Var;
                }
            }
            i0Var = newState;
            if (obj2 == null) {
            }
            if (i0Var != null) {
            }
        } while (!pVar.b(obj2, obj));
    }

    public C0178i(G1.b bVar, int i3) {
        this.f2531a = i3;
        switch (i3) {
            case C0642l9.f7778D /* 20 */:
                this.f2532b = new B0.p((P1.f) bVar, "flutter/system", (P1.k) P1.i.f1264a, (K0.j) null);
                break;
            default:
                K0.j jVar = new K0.j(14);
                P1.o oVar = new P1.o(bVar, "flutter/navigation", P1.j.f1265a, null);
                this.f2532b = oVar;
                oVar.b(jVar);
                break;
        }
    }

    public C0178i(int i3) {
        this.f2531a = i3;
        switch (i3) {
            case 8:
                this.f2532b = new w2.p(j0.f785b);
                break;
            case 24:
                this.f2532b = new SparseIntArray();
                break;
            case C0642l9.f7781G /* 26 */:
                break;
            default:
                this.f2532b = new AtomicInteger(0);
                break;
        }
    }

    public C0178i(boolean z) {
        this.f2531a = 9;
        this.f2532b = new AtomicBoolean(z);
    }

    public C0178i(P1.f fVar) {
        this.f2531a = 12;
        new P1.o(fVar, "flutter/keyboard", P1.u.f1272b, null).b(new V0.e(this));
    }
}
