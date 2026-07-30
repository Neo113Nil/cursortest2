package m0;

import D.C0019u;
import L.C0026b;
import L.C0038n;
import L.Q;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import c0.AbstractActivityC0104f;
import c0.C;
import c0.r;
import e0.C0114b;
import h.C0165s;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o0.C0214a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.C0219a;
import r0.C0220a;
import u0.C0247g;
import w.AbstractC0271q;
import w.S;
import w.x;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193c implements n0.k, P0.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2705e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2706f;

    public /* synthetic */ C0193c() {
        this.f2705e = 19;
    }

    public static int a(C0193c c0193c, int i2) {
        c0193c.getClass();
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0175 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x019b, B:45:0x01ad, B:46:0x01b0, B:48:0x01d7, B:50:0x01e7, B:78:0x02a8, B:53:0x02c2, B:55:0x02d2, B:56:0x02e3, B:59:0x02e0, B:89:0x01ce, B:96:0x021b, B:110:0x0239, B:75:0x027d, B:103:0x02a0, B:82:0x02ba, B:61:0x02e8, B:112:0x001f, B:115:0x002d, B:118:0x0038, B:121:0x0044, B:124:0x0050, B:127:0x005b, B:130:0x0067, B:133:0x0071, B:136:0x007b, B:139:0x0085, B:142:0x008f, B:145:0x0099, B:148:0x00a4, B:151:0x00af, B:154:0x00ba, B:64:0x0242, B:66:0x024c, B:67:0x024f, B:69:0x0265, B:70:0x0277, B:73:0x026e), top: B:6:0x0014, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x019b, B:45:0x01ad, B:46:0x01b0, B:48:0x01d7, B:50:0x01e7, B:78:0x02a8, B:53:0x02c2, B:55:0x02d2, B:56:0x02e3, B:59:0x02e0, B:89:0x01ce, B:96:0x021b, B:110:0x0239, B:75:0x027d, B:103:0x02a0, B:82:0x02ba, B:61:0x02e8, B:112:0x001f, B:115:0x002d, B:118:0x0038, B:121:0x0044, B:124:0x0050, B:127:0x005b, B:130:0x0067, B:133:0x0071, B:136:0x007b, B:139:0x0085, B:142:0x008f, B:145:0x0099, B:148:0x00a4, B:151:0x00af, B:154:0x00ba, B:64:0x0242, B:66:0x024c, B:67:0x024f, B:69:0x0265, B:70:0x0277, B:73:0x026e), top: B:6:0x0014, inners: #0, #3, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void e(Q q2, C0201k c0201k) {
        char c2;
        EnumC0195e a2;
        CharSequence w2;
        ClipDescription primaryClipDescription;
        Q q3 = (Q) this.f2706f;
        if (((A.j) q3.f516g) == null) {
            return;
        }
        String str = (String) q2.f515f;
        try {
            boolean z2 = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Object obj = q2.f516g;
            switch (c2) {
                case 0:
                    try {
                        int c3 = F0.h.c((String) obj);
                        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f;
                        if (c3 == 1) {
                            eVar.f2458a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            eVar.getClass();
                        }
                        c0201k.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        c0201k.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((A.j) q3.f516g).H(F0.h.b((String) obj));
                        c0201k.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        c0201k.a("error", e3.getMessage(), null);
                        return;
                    }
                case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                    try {
                        ((io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f).f2458a.setRequestedOrientation(Q.h(q3, (JSONArray) obj));
                        c0201k.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        c0201k.a("error", e4.getMessage(), null);
                        return;
                    }
                case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i2 = jSONObject.getInt("primaryColor");
                        if (i2 != 0) {
                            i2 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        A.j jVar = (A.j) q3.f516g;
                        int i3 = Build.VERSION.SDK_INT;
                        AbstractActivityC0104f abstractActivityC0104f = ((io.flutter.plugin.platform.e) jVar.f30f).f2458a;
                        if (i3 < 28) {
                            abstractActivityC0104f.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i2));
                        } else {
                            abstractActivityC0104f.setTaskDescription(J.k.c(string, i2));
                        }
                        c0201k.c(null);
                        return;
                    } catch (JSONException e5) {
                        c0201k.a("error", e5.getMessage(), null);
                        return;
                    }
                case F.k.LONG_FIELD_NUMBER /* 4 */:
                    try {
                        ((A.j) q3.f516g).E(Q.i(q3, (JSONArray) obj));
                        c0201k.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        c0201k.a("error", e6.getMessage(), null);
                        return;
                    }
                case F.k.STRING_FIELD_NUMBER /* 5 */:
                    try {
                        ((A.j) q3.f516g).F(Q.j(q3, (String) obj));
                        c0201k.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        c0201k.a("error", e7.getMessage(), null);
                        return;
                    }
                case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    io.flutter.plugin.platform.e eVar2 = (io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f;
                    View decorView = eVar2.f2458a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar2, decorView));
                    c0201k.c(null);
                    return;
                case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f).b();
                    c0201k.c(null);
                    return;
                case F.k.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        ((io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f).a(Q.l(q3, (JSONObject) obj));
                        c0201k.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        c0201k.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0104f abstractActivityC0104f2 = ((io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f).f2460c;
                    if (abstractActivityC0104f2 != null) {
                        abstractActivityC0104f2.h(booleanValue);
                    }
                    c0201k.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f;
                    AbstractActivityC0104f abstractActivityC0104f3 = eVar3.f2460c;
                    eVar3.f2458a.finish();
                    c0201k.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = EnumC0195e.a(str2);
                        } catch (NoSuchFieldException unused) {
                            c0201k.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        w2 = ((A.j) q3.f516g).w(a2);
                        if (w2 != null) {
                            c0201k.c(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", w2);
                        c0201k.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    w2 = ((A.j) q3.f516g).w(a2);
                    if (w2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f).f2458a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    c0201k.c(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f).f2458a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z2);
                    c0201k.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.e eVar4 = (io.flutter.plugin.platform.e) ((A.j) q3.f516g).f30f;
                    eVar4.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    eVar4.f2458a.startActivity(Intent.createChooser(intent, null));
                    c0201k.c(null);
                    return;
                default:
                    c0201k.b();
                    return;
            }
        } catch (JSONException e9) {
            c0201k.a("error", "JSON error: " + e9.getMessage(), null);
        }
        c0201k.a("error", "JSON error: " + e9.getMessage(), null);
    }

    private final void f(Q q2, C0201k c0201k) {
        Object obj;
        C0193c c0193c = (C0193c) this.f2706f;
        if (((A.j) c0193c.f2706f) == null) {
            return;
        }
        String str = (String) q2.f515f;
        str.getClass();
        obj = q2.f516g;
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
                    if (((io.flutter.plugin.platform.j) ((A.j) c0193c.f2706f).f30f).f2464e.f1845a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e2) {
                    c0201k.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((Integer) obj).intValue();
                try {
                    F0.h.h(((io.flutter.plugin.platform.j) ((A.j) c0193c.f2706f).f30f).f2470k.get(intValue));
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    c0201k.c(null);
                    return;
                } catch (IllegalStateException e3) {
                    c0201k.a("error", Log.getStackTraceString(e3), null);
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
                    A.j jVar = (A.j) c0193c.f2706f;
                    jVar.getClass();
                    io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) jVar.f30f;
                    float f2 = jVar2.f2465f.getResources().getDisplayMetrics().density;
                    if (jVar2.f2470k.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    c0201k.c(null);
                    return;
                } catch (IllegalStateException e4) {
                    c0201k.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get("id")).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.j) ((A.j) c0193c.f2706f).f30f).f2470k.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    c0201k.c(null);
                    return;
                } catch (IllegalStateException e5) {
                    c0201k.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((A.j) c0193c.f2706f).f30f).f2467h;
                c0201k.c(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((A.j) c0193c.f2706f).v(((Integer) ((Map) obj).get("id")).intValue());
                    c0201k.c(null);
                    return;
                } catch (IllegalStateException e6) {
                    c0201k.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                c0201k.b();
                return;
        }
    }

    private final void g(Q q2, C0201k c0201k) {
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        boolean z2 = true;
        C0193c c0193c = (C0193c) this.f2706f;
        if (((Q) c0193c.f2706f) == null) {
        }
        String str = (String) q2.f515f;
        str.getClass();
        switch (str) {
            case "Scribe.isFeatureAvailable":
                try {
                    Q q3 = (Q) c0193c.f2706f;
                    if (Build.VERSION.SDK_INT >= 34) {
                        isStylusHandwritingAvailable = ((InputMethodManager) q3.f515f).isStylusHandwritingAvailable();
                        if (isStylusHandwritingAvailable) {
                            c0201k.c(Boolean.valueOf(z2));
                            break;
                        }
                    } else {
                        q3.getClass();
                    }
                    z2 = false;
                    c0201k.c(Boolean.valueOf(z2));
                } catch (IllegalStateException e2) {
                    c0201k.a("error", e2.getMessage(), null);
                    return;
                }
            case "Scribe.startStylusHandwriting":
                if (Build.VERSION.SDK_INT < 33) {
                    c0201k.a("error", "Requires API level 33 or higher.", null);
                    break;
                } else {
                    try {
                        Q q4 = (Q) c0193c.f2706f;
                        ((InputMethodManager) q4.f515f).startStylusHandwriting((r) q4.f516g);
                        c0201k.c(null);
                        break;
                    } catch (IllegalStateException e3) {
                        c0201k.a("error", e3.getMessage(), null);
                        return;
                    }
                }
            case "Scribe.isStylusHandwritingAvailable":
                if (Build.VERSION.SDK_INT < 34) {
                    c0201k.a("error", "Requires API level 34 or higher.", null);
                    break;
                } else {
                    try {
                        isStylusHandwritingAvailable2 = ((InputMethodManager) ((Q) c0193c.f2706f).f515f).isStylusHandwritingAvailable();
                        c0201k.c(Boolean.valueOf(isStylusHandwritingAvailable2));
                        break;
                    } catch (IllegalStateException e4) {
                        c0201k.a("error", e4.getMessage(), null);
                        return;
                    }
                }
            default:
                c0201k.b();
                break;
        }
    }

    private final void h(Q q2, C0201k c0201k) {
        int i2 = 2;
        C0193c c0193c = (C0193c) this.f2706f;
        if (((C0220a) c0193c.f2706f) == null) {
        }
        String str = (String) q2.f515f;
        str.getClass();
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a2 = ((C0220a) c0193c.f2706f).a();
                    if (a2 == 0) {
                        i2 = 0;
                    } else if (a2 == 1) {
                        i2 = 1;
                    } else if (a2 != 2) {
                        i2 = 3;
                    }
                    c0201k.c(Integer.valueOf(i2));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    c0201k.a("error", e2.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                try {
                    ((C0220a) c0193c.f2706f).b(a(c0193c, ((Integer) q2.f516g).intValue()));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    c0201k.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((C0220a) c0193c.f2706f).getClass();
                c0201k.c(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                c0201k.b();
                break;
        }
    }

    public void b(String str) {
        Q q2 = (Q) this.f2706f;
        r rVar = (r) q2.f515f;
        if (Q.f513i == null) {
            C c2 = new C();
            c2.put("alias", 1010);
            c2.put("allScroll", 1013);
            c2.put("basic", 1000);
            c2.put("cell", 1006);
            c2.put("click", 1002);
            c2.put("contextMenu", 1001);
            c2.put("copy", 1011);
            c2.put("forbidden", 1012);
            c2.put("grab", 1020);
            c2.put("grabbing", 1021);
            c2.put("help", 1003);
            c2.put("move", 1013);
            c2.put("none", 0);
            c2.put("noDrop", 1012);
            c2.put("precise", 1007);
            c2.put("text", 1008);
            c2.put("resizeColumn", 1014);
            c2.put("resizeDown", 1015);
            c2.put("resizeUpLeft", 1016);
            c2.put("resizeDownRight", 1017);
            c2.put("resizeLeft", 1014);
            c2.put("resizeLeftRight", 1014);
            c2.put("resizeRight", 1014);
            c2.put("resizeRow", 1015);
            c2.put("resizeUp", 1015);
            c2.put("resizeUpDown", 1015);
            c2.put("resizeUpLeft", 1017);
            c2.put("resizeUpRight", 1016);
            c2.put("resizeUpLeftDownRight", 1017);
            c2.put("resizeUpRightDownLeft", 1016);
            c2.put("verticalText", 1009);
            c2.put("wait", 1004);
            c2.put("zoomIn", 1018);
            c2.put("zoomOut", 1019);
            Q.f513i = c2;
        }
        rVar.setPointerIcon(PointerIcon.getSystemIcon(((r) q2.f515f).getContext(), ((Integer) Q.f513i.getOrDefault(str, 1000)).intValue()));
    }

    public String c(String str, String str2) {
        C0214a c0214a = (C0214a) this.f2706f;
        Context context = c0214a.f2805b;
        AbstractActivityC0104f abstractActivityC0104f = c0214a.f2805b;
        if (str2 != null) {
            Locale a2 = C0214a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0104f.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = abstractActivityC0104f.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0104f.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // P0.d
    public Object d(P0.e eVar, w0.d dVar) {
        Object d2 = ((P0.d) this.f2706f).d(new C0019u(eVar, 1), dVar);
        return d2 == x0.a.f3094e ? d2 : C0247g.f3005a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // n0.k
    public void n(Q q2, C0201k c0201k) {
        char c2;
        char c3;
        Bundle bundle;
        switch (this.f2705e) {
            case 1:
                Q q3 = (Q) this.f2706f;
                if (((C0193c) q3.f516g) == null) {
                    return;
                }
                String str = (String) q2.f515f;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    c0201k.b();
                    return;
                }
                JSONObject jSONObject = (JSONObject) q2.f516g;
                try {
                    c0201k.c(((C0193c) q3.f516g).c(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    return;
                } catch (JSONException e2) {
                    c0201k.a("error", e2.getMessage(), null);
                    return;
                }
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0193c c0193c = (C0193c) this.f2706f;
                if (((C0193c) c0193c.f2706f) == null) {
                    return;
                }
                String str2 = (String) q2.f515f;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((C0193c) c0193c.f2706f).b((String) ((HashMap) q2.f516g).get("kind"));
                            c0201k.c(Boolean.TRUE);
                        } catch (Exception e3) {
                            c0201k.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e4) {
                    c0201k.a("error", "Unhandled error: " + e4.getMessage(), null);
                    return;
                }
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
            case 12:
            case 14:
            default:
                Q q4 = (Q) this.f2706f;
                if (((io.flutter.plugin.editing.j) q4.f516g) == null) {
                    return;
                }
                String str3 = (String) q2.f515f;
                str3.getClass();
                Object obj = q2.f516g;
                switch (str3.hashCode()) {
                    case -1779068172:
                        if (str3.equals("TextInput.setPlatformViewClient")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1015421462:
                        if (str3.equals("TextInput.setEditingState")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -37561188:
                        if (str3.equals("TextInput.setClient")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 270476819:
                        if (str3.equals("TextInput.hide")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 270803918:
                        if (str3.equals("TextInput.show")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 649192816:
                        if (str3.equals("TextInput.sendAppPrivateCommand")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1204752139:
                        if (str3.equals("TextInput.setEditableSizeAndTransform")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1727570905:
                        if (str3.equals("TextInput.finishAutofillContext")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1904427655:
                        if (str3.equals("TextInput.clearClient")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2113369584:
                        if (str3.equals("TextInput.requestAutofill")) {
                            c3 = '\t';
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
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            int i2 = jSONObject2.getInt("platformViewId");
                            boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.l lVar = ((io.flutter.plugin.editing.j) q4.f516g).f2432a;
                            if (optBoolean) {
                                r rVar = lVar.f2436a;
                                rVar.requestFocus();
                                lVar.f2440e = new C0038n(3, i2);
                                lVar.f2437b.restartInput(rVar);
                                lVar.f2444i = false;
                            } else {
                                lVar.getClass();
                                lVar.f2440e = new C0038n(4, i2);
                                lVar.f2445j = null;
                            }
                            c0201k.c(null);
                            return;
                        } catch (JSONException e5) {
                            c0201k.a("error", e5.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.j) q4.f516g).c(C0207q.a((JSONObject) obj));
                            c0201k.c(null);
                            return;
                        } catch (JSONException e6) {
                            c0201k.a("error", e6.getMessage(), null);
                            return;
                        }
                    case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((io.flutter.plugin.editing.j) q4.f516g).a(jSONArray.getInt(0), C0205o.a(jSONArray.getJSONObject(1)));
                            c0201k.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e7) {
                            c0201k.a("error", e7.getMessage(), null);
                            return;
                        }
                    case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                        io.flutter.plugin.editing.l lVar2 = ((io.flutter.plugin.editing.j) q4.f516g).f2432a;
                        if (lVar2.f2440e.f578b == 4) {
                            lVar2.c();
                        } else {
                            lVar2.c();
                            lVar2.f2437b.hideSoftInputFromWindow(lVar2.f2436a.getApplicationWindowToken(), 0);
                        }
                        c0201k.c(null);
                        return;
                    case F.k.LONG_FIELD_NUMBER /* 4 */:
                        io.flutter.plugin.editing.l lVar3 = ((io.flutter.plugin.editing.j) q4.f516g).f2432a;
                        r rVar2 = lVar3.f2436a;
                        C0205o c0205o = lVar3.f2441f;
                        InputMethodManager inputMethodManager = lVar3.f2437b;
                        if (c0205o == null || c0205o.f2764g.f2771a != 11) {
                            rVar2.requestFocus();
                            inputMethodManager.showSoftInput(rVar2, 0);
                        } else {
                            lVar3.c();
                            inputMethodManager.hideSoftInputFromWindow(rVar2.getApplicationWindowToken(), 0);
                        }
                        c0201k.c(null);
                        return;
                    case F.k.STRING_FIELD_NUMBER /* 5 */:
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
                            io.flutter.plugin.editing.l lVar4 = ((io.flutter.plugin.editing.j) q4.f516g).f2432a;
                            lVar4.f2437b.sendAppPrivateCommand(lVar4.f2436a, string, bundle);
                            c0201k.c(null);
                            return;
                        } catch (JSONException e8) {
                            c0201k.a("error", e8.getMessage(), null);
                            return;
                        }
                    case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        try {
                            JSONObject jSONObject4 = (JSONObject) obj;
                            double d2 = jSONObject4.getDouble("width");
                            double d3 = jSONObject4.getDouble("height");
                            JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i3 = 0; i3 < 16; i3++) {
                                dArr[i3] = jSONArray2.getDouble(i3);
                            }
                            ((io.flutter.plugin.editing.j) q4.f516g).b(d2, d3, dArr);
                            c0201k.c(null);
                            return;
                        } catch (JSONException e9) {
                            c0201k.a("error", e9.getMessage(), null);
                            return;
                        }
                    case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) q4.f516g;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = jVar.f2432a.f2438c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            jVar.getClass();
                        }
                        c0201k.c(null);
                        return;
                    case F.k.BYTES_FIELD_NUMBER /* 8 */:
                        io.flutter.plugin.editing.l lVar5 = ((io.flutter.plugin.editing.j) q4.f516g).f2432a;
                        if (lVar5.f2440e.f578b != 3) {
                            lVar5.f2443h.e(lVar5);
                            lVar5.c();
                            lVar5.f2441f = null;
                            lVar5.d(null);
                            lVar5.f2440e = new C0038n(1, 0);
                            lVar5.f2448m = null;
                            Field field = x.f3075a;
                            r rVar3 = lVar5.f2436a;
                            S a2 = AbstractC0271q.a(rVar3);
                            if (a2 != null && !a2.f3045a.m(8)) {
                                lVar5.f2437b.restartInput(rVar3);
                            }
                        }
                        c0201k.c(null);
                        return;
                    case '\t':
                        io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) q4.f516g;
                        int i4 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.l lVar6 = jVar2.f2432a;
                        if (i4 < 26) {
                            lVar6.getClass();
                        } else if (lVar6.f2438c != null && lVar6.f2442g != null) {
                            String str4 = (String) lVar6.f2441f.f2767j.f244a;
                            int[] iArr = new int[2];
                            r rVar4 = lVar6.f2436a;
                            rVar4.getLocationOnScreen(iArr);
                            Rect rect = new Rect(lVar6.f2448m);
                            rect.offset(iArr[0], iArr[1]);
                            lVar6.f2438c.notifyViewEntered(rVar4, str4.hashCode(), rect);
                        }
                        c0201k.c(null);
                        return;
                    default:
                        c0201k.b();
                        return;
                }
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                e(q2, c0201k);
                return;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                C0193c c0193c2 = (C0193c) this.f2706f;
                if (((Q) c0193c2.f2706f) == null) {
                    return;
                }
                String str5 = (String) q2.f515f;
                str5.getClass();
                Object obj2 = q2.f516g;
                switch (str5.hashCode()) {
                    case -1352294148:
                        if (str5.equals("create")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1019779949:
                        if (str5.equals("offset")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -934437708:
                        if (str5.equals("resize")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -756050293:
                        if (str5.equals("clearFocus")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -308988850:
                        if (str5.equals("synchronizeToNativeViewHierarchy")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110550847:
                        if (str5.equals("touch")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 576796989:
                        if (str5.equals("setDirection")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str5.equals("dispose")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        Map map = (Map) obj2;
                        boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((Q) c0193c2.f2706f).f516g).f2467h;
                            if (!(flutterJNI == null ? false : flutterJNI.IsSurfaceControlEnabled())) {
                                if (z2) {
                                    ((io.flutter.plugin.platform.k) ((Q) c0193c2.f2706f).f515f).f2496y.s(new C0165s(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                    throw null;
                                }
                                ((io.flutter.plugin.platform.k) ((Q) c0193c2.f2706f).f515f).f2496y.t(new C0165s(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                                throw null;
                            }
                            ((Integer) map.get("id")).getClass();
                            String str6 = (String) map.get("viewType");
                            ((Integer) map.get("direction")).getClass();
                            if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) ((Q) c0193c2.f2706f).f516g).r.f30f).f2464e.f1845a.get(str6) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str6);
                        } catch (IllegalStateException e10) {
                            c0201k.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            Q q5 = (Q) c0193c2.f2706f;
                            int intValue = ((Integer) map2.get("id")).intValue();
                            double doubleValue = ((Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.j) q5.f516g).f(intValue);
                            ((io.flutter.plugin.platform.k) q5.f515f).f2496y.A(intValue, doubleValue, doubleValue2);
                            c0201k.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            c0201k.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                        Map map3 = (Map) obj2;
                        int intValue2 = ((Integer) map3.get("id")).intValue();
                        C0200j c0200j = new C0200j(intValue2, ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue());
                        try {
                            Q q6 = (Q) c0193c2.f2706f;
                            C0199i c0199i = new C0199i();
                            q6.getClass();
                            ((io.flutter.plugin.platform.j) q6.f516g).f(intValue2);
                            ((io.flutter.plugin.platform.k) q6.f515f).f2496y.C(c0200j, c0199i);
                            return;
                        } catch (IllegalStateException e12) {
                            c0201k.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                        int intValue3 = ((Integer) obj2).intValue();
                        try {
                            Q q7 = (Q) c0193c2.f2706f;
                            ((io.flutter.plugin.platform.j) q7.f516g).f(intValue3);
                            ((io.flutter.plugin.platform.k) q7.f515f).f2496y.r(intValue3);
                            c0201k.c(null);
                            return;
                        } catch (IllegalStateException e13) {
                            c0201k.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case F.k.LONG_FIELD_NUMBER /* 4 */:
                        try {
                            ((io.flutter.plugin.platform.k) ((io.flutter.plugin.platform.k) ((Q) c0193c2.f2706f).f515f).f2496y.f30f).f2492u = ((Boolean) obj2).booleanValue();
                            c0201k.c(null);
                            return;
                        } catch (IllegalStateException e14) {
                            c0201k.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case F.k.STRING_FIELD_NUMBER /* 5 */:
                        List list = (List) obj2;
                        int intValue4 = ((Integer) list.get(0)).intValue();
                        C0198h c0198h = new C0198h(intValue4, (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                        try {
                            Q q8 = (Q) c0193c2.f2706f;
                            q8.getClass();
                            ((io.flutter.plugin.platform.j) q8.f516g).f(intValue4);
                            ((io.flutter.plugin.platform.k) q8.f515f).f2496y.B(c0198h);
                            c0201k.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            c0201k.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        Map map4 = (Map) obj2;
                        int intValue5 = ((Integer) map4.get("id")).intValue();
                        int intValue6 = ((Integer) map4.get("direction")).intValue();
                        try {
                            Q q9 = (Q) c0193c2.f2706f;
                            ((io.flutter.plugin.platform.j) q9.f516g).f(intValue5);
                            ((io.flutter.plugin.platform.k) q9.f515f).f2496y.D(intValue5, intValue6);
                            c0201k.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            c0201k.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        int intValue7 = ((Integer) ((Map) obj2).get("id")).intValue();
                        try {
                            Q q10 = (Q) c0193c2.f2706f;
                            ((io.flutter.plugin.platform.j) q10.f516g).f(intValue7);
                            ((io.flutter.plugin.platform.k) q10.f515f).f2496y.v(intValue7);
                            c0201k.c(null);
                            return;
                        } catch (IllegalStateException e17) {
                            c0201k.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        c0201k.b();
                        return;
                }
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                f(q2, c0201k);
                return;
            case 9:
                Q q11 = (Q) this.f2706f;
                if (((C0219a) q11.f516g) == null) {
                    return;
                }
                String str7 = (String) q2.f515f;
                Object obj3 = q2.f516g;
                str7.getClass();
                if (str7.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((C0219a) q11.f516g).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), c0201k);
                        return;
                    } catch (IllegalStateException e18) {
                        c0201k.a("error", e18.getMessage(), null);
                        return;
                    }
                }
                if (!str7.equals("ProcessText.queryTextActions")) {
                    c0201k.b();
                    return;
                }
                try {
                    c0201k.c(((C0219a) q11.f516g).b());
                    return;
                } catch (IllegalStateException e19) {
                    c0201k.a("error", e19.getMessage(), null);
                    return;
                }
            case 10:
                String str8 = (String) q2.f515f;
                str8.getClass();
                C0202l c0202l = (C0202l) this.f2706f;
                if (!str8.equals("get")) {
                    if (!str8.equals("put")) {
                        c0201k.b();
                        return;
                    } else {
                        c0202l.f2748b = (byte[]) q2.f516g;
                        c0201k.c(null);
                        return;
                    }
                }
                c0202l.f2752f = true;
                if (c0202l.f2751e || !c0202l.f2747a) {
                    c0201k.c(C0202l.a(c0202l.f2748b));
                    return;
                } else {
                    c0202l.f2750d = c0201k;
                    return;
                }
            case 11:
                g(q2, c0201k);
                return;
            case 13:
                h(q2, c0201k);
                return;
            case 15:
                C0193c c0193c3 = (C0193c) this.f2706f;
                if (((io.flutter.plugin.editing.h) c0193c3.f2706f) == null) {
                    return;
                }
                String str9 = (String) q2.f515f;
                Object obj4 = q2.f516g;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    c0201k.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((io.flutter.plugin.editing.h) c0193c3.f2706f).a((String) arrayList2.get(0), (String) arrayList2.get(1), c0201k);
                    return;
                } catch (IllegalStateException e20) {
                    c0201k.a("error", e20.getMessage(), null);
                    return;
                }
        }
    }

    public /* synthetic */ C0193c(int i2, Object obj) {
        this.f2705e = i2;
        this.f2706f = obj;
    }

    public C0193c(C0114b c0114b, int i2) {
        this.f2705e = i2;
        switch (i2) {
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                new C0026b(c0114b, "flutter/platform_views_2", n0.o.f2789a, 8).J(new C0193c(6, this));
                break;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                new C0026b(c0114b, "flutter/platform_views", n0.o.f2789a, 8).J(new C0193c(5, this));
                break;
            case 12:
                new C0026b(c0114b, "flutter/scribe", n0.i.f2785a, 8).J(new C0193c(11, this));
                break;
            case 14:
                new C0026b(c0114b, "flutter/sensitivecontent", n0.o.f2789a, 8).J(new C0193c(13, this));
                break;
            case 16:
                new C0026b(c0114b, "flutter/spellcheck", n0.o.f2789a, 8).J(new C0193c(15, this));
                break;
            default:
                new C0026b(c0114b, "flutter/mousecursor", n0.o.f2789a, 8).J(new C0193c(2, this));
                break;
        }
    }

    public C0193c(n0.f fVar) {
        this.f2705e = 0;
        new C0026b(fVar, "flutter/keyboard", n0.o.f2789a, 8).J(new Q(this));
    }
}
