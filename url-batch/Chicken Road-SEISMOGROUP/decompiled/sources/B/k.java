package B;

import E.AbstractActivityC0004e;
import E.AbstractC0008i;
import E.AbstractC0010k;
import E.H;
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
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements C.c, N.d, N.f, N.b, N.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43b;

    /* renamed from: c, reason: collision with root package name */
    public Object f44c;

    public /* synthetic */ k() {
        this.f43b = 6;
    }

    public static int j(k kVar, int i2) {
        kVar.getClass();
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0178 A[Catch: JSONException -> 0x002d, TryCatch #11 {JSONException -> 0x002d, blocks: (B:7:0x0014, B:8:0x001d, B:13:0x00d2, B:15:0x00d7, B:17:0x0106, B:20:0x012a, B:22:0x011d, B:25:0x0124, B:26:0x0139, B:28:0x015d, B:38:0x0161, B:31:0x016e, B:33:0x0178, B:35:0x0185, B:40:0x0166, B:41:0x018a, B:43:0x019e, B:45:0x01b0, B:46:0x01b3, B:48:0x01da, B:50:0x01ea, B:78:0x02cd, B:67:0x02e7, B:69:0x02f7, B:70:0x0308, B:73:0x0305, B:96:0x01d1, B:122:0x0240, B:103:0x025e, B:64:0x02a2, B:89:0x02c5, B:82:0x02df, B:75:0x030d, B:124:0x0022, B:127:0x0030, B:130:0x003b, B:133:0x0047, B:136:0x0053, B:139:0x005e, B:142:0x006a, B:145:0x0074, B:148:0x007e, B:151:0x0088, B:154:0x0092, B:157:0x009c, B:160:0x00a7, B:163:0x00b2, B:166:0x00bd, B:53:0x0267, B:55:0x0271, B:56:0x0274, B:58:0x028a, B:59:0x029c, B:62:0x0293), top: B:6:0x0014, inners: #0, #3, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0185 A[Catch: JSONException -> 0x002d, TryCatch #11 {JSONException -> 0x002d, blocks: (B:7:0x0014, B:8:0x001d, B:13:0x00d2, B:15:0x00d7, B:17:0x0106, B:20:0x012a, B:22:0x011d, B:25:0x0124, B:26:0x0139, B:28:0x015d, B:38:0x0161, B:31:0x016e, B:33:0x0178, B:35:0x0185, B:40:0x0166, B:41:0x018a, B:43:0x019e, B:45:0x01b0, B:46:0x01b3, B:48:0x01da, B:50:0x01ea, B:78:0x02cd, B:67:0x02e7, B:69:0x02f7, B:70:0x0308, B:73:0x0305, B:96:0x01d1, B:122:0x0240, B:103:0x025e, B:64:0x02a2, B:89:0x02c5, B:82:0x02df, B:75:0x030d, B:124:0x0022, B:127:0x0030, B:130:0x003b, B:133:0x0047, B:136:0x0053, B:139:0x005e, B:142:0x006a, B:145:0x0074, B:148:0x007e, B:151:0x0088, B:154:0x0092, B:157:0x009c, B:160:0x00a7, B:163:0x00b2, B:166:0x00bd, B:53:0x0267, B:55:0x0271, B:56:0x0274, B:58:0x028a, B:59:0x029c, B:62:0x0293), top: B:6:0x0014, inners: #0, #3, #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m(A.a aVar, M.j jVar) {
        char c2;
        int i2;
        M.e a2;
        CharSequence h2;
        ClipDescription primaryClipDescription;
        A.a aVar2 = (A.a) this.f44c;
        if (((io.flutter.plugin.editing.a) aVar2.f4d) == null) {
            return;
        }
        String str = (String) aVar.f3c;
        try {
            boolean z = false;
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
            Object obj = aVar.f4d;
            switch (c2) {
                case 0:
                    try {
                        int c3 = AbstractC0008i.c((String) obj);
                        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c;
                        if (c3 == 1) {
                            eVar.f700a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            eVar.getClass();
                        }
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        jVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((io.flutter.plugin.editing.a) aVar2.f4d).o(AbstractC0008i.b((String) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        jVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c).f700a.setRequestedOrientation(A.a.i(aVar2, (JSONArray) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        jVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i3 = jSONObject.getInt("primaryColor");
                        if (i3 != 0) {
                            i3 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        io.flutter.plugin.editing.a aVar3 = (io.flutter.plugin.editing.a) aVar2.f4d;
                        int i4 = Build.VERSION.SDK_INT;
                        AbstractActivityC0004e abstractActivityC0004e = ((io.flutter.plugin.platform.e) aVar3.f631c).f700a;
                        if (i4 < 28) {
                            abstractActivityC0004e.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                        } else {
                            abstractActivityC0004e.setTaskDescription(AbstractC0010k.b(string, i3));
                        }
                        jVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        jVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((io.flutter.plugin.editing.a) aVar2.f4d).n(A.a.j(aVar2, (JSONArray) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        jVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        int k2 = A.a.k(aVar2, (String) obj);
                        io.flutter.plugin.platform.e eVar2 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c;
                        eVar2.getClass();
                        if (k2 == 1) {
                            i2 = 1798;
                        } else if (k2 == 2) {
                            i2 = 3846;
                        } else {
                            if (k2 != 3) {
                                if (k2 == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i2 = 1792;
                                }
                                jVar.c(null);
                                return;
                            }
                            i2 = 5894;
                        }
                        eVar2.f704e = i2;
                        eVar2.b();
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        jVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c;
                    View decorView = eVar3.f700a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar3, decorView));
                    jVar.c(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c).b();
                    jVar.c(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c).a(A.a.l(aVar2, (JSONObject) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        jVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0004e abstractActivityC0004e2 = ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c).f702c;
                    if (abstractActivityC0004e2 != null) {
                        abstractActivityC0004e2.h(booleanValue);
                    }
                    jVar.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.e eVar4 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c;
                    AbstractActivityC0004e abstractActivityC0004e3 = eVar4.f702c;
                    eVar4.f700a.finish();
                    jVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = M.e.a(str2);
                        } catch (NoSuchFieldException unused) {
                            jVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        h2 = ((io.flutter.plugin.editing.a) aVar2.f4d).h(a2);
                        if (h2 != null) {
                            jVar.c(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", h2);
                        jVar.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    h2 = ((io.flutter.plugin.editing.a) aVar2.f4d).h(a2);
                    if (h2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c).f700a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    jVar.c(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c).f700a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z);
                    jVar.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.e eVar5 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) aVar2.f4d).f631c;
                    eVar5.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    eVar5.f700a.startActivity(Intent.createChooser(intent, null));
                    jVar.c(null);
                    return;
                default:
                    jVar.b();
                    return;
            }
        } catch (JSONException e9) {
            jVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        jVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    private final void n(A.a aVar, M.j jVar) {
        Object obj;
        k kVar = (k) this.f44c;
        if (((io.flutter.plugin.editing.a) kVar.f44c) == null) {
            return;
        }
        String str = (String) aVar.f3c;
        str.getClass();
        obj = aVar.f4d;
        switch (str) {
            case "create":
                Map map = (Map) obj;
                if (map.containsKey("params")) {
                    ByteBuffer.wrap((byte[]) map.get("params"));
                }
                try {
                    ((Integer) map.get("id")).getClass();
                    String str2 = (String) map.get("viewType");
                    ((Integer) map.get("direction")).getClass();
                    if (((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) kVar.f44c).f631c).f705b.f270a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e2) {
                    jVar.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((Integer) obj).intValue();
                try {
                    AbstractC0008i.e(((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) kVar.f44c).f631c).f711h.get(intValue));
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    jVar.c(null);
                    return;
                } catch (IllegalStateException e3) {
                    jVar.a("error", Log.getStackTraceString(e3), null);
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
                    io.flutter.plugin.editing.a aVar2 = (io.flutter.plugin.editing.a) kVar.f44c;
                    aVar2.getClass();
                    io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) aVar2.f631c;
                    float f2 = iVar.f706c.getResources().getDisplayMetrics().density;
                    if (iVar.f711h.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    jVar.c(null);
                    return;
                } catch (IllegalStateException e4) {
                    jVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get("id")).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) kVar.f44c).f631c).f711h.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    jVar.c(null);
                    return;
                } catch (IllegalStateException e5) {
                    jVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) kVar.f44c).f631c).f708e;
                jVar.c(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((io.flutter.plugin.editing.a) kVar.f44c).g(((Integer) ((Map) obj).get("id")).intValue());
                    jVar.c(null);
                    return;
                } catch (IllegalStateException e6) {
                    jVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                jVar.b();
                return;
        }
    }

    private final void o(A.a aVar, M.j jVar) {
        int i2 = 2;
        k kVar = (k) this.f44c;
        if (((n) kVar.f44c) == null) {
        }
        String str = (String) aVar.f3c;
        str.getClass();
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int e2 = ((n) kVar.f44c).e();
                    if (e2 == 0) {
                        i2 = 0;
                    } else if (e2 == 1) {
                        i2 = 1;
                    } else if (e2 != 2) {
                        i2 = 3;
                    }
                    jVar.c(Integer.valueOf(i2));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    jVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                try {
                    ((n) kVar.f44c).f(j(kVar, ((Integer) aVar.f4d).intValue()));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    jVar.a("error", e4.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((n) kVar.f44c).getClass();
                jVar.c(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                jVar.b();
                break;
        }
    }

    @Override // N.d
    public void a(ByteBuffer byteBuffer, G.g gVar) {
        N.o.f413b.getClass();
        N.o.a(byteBuffer);
        ((G.b) this.f44c).getClass();
    }

    @Override // C.c
    public void b(String str, HashMap hashMap) {
        ((M.j) this.f44c).a("sqlite_error", str, hashMap);
    }

    @Override // C.c
    public void c(Serializable serializable) {
        ((M.j) this.f44c).c(serializable);
    }

    @Override // N.f
    public void d(String str, N.d dVar) {
        ((G.j) this.f44c).h(str, dVar, null);
    }

    @Override // N.f
    public A.b e(N.h hVar) {
        return ((G.j) this.f44c).e(hVar);
    }

    @Override // N.b
    public void f(Object obj, A.a aVar) {
        HashMap hashMap;
        HashMap hashMap2;
        D.b bVar = (D.b) this.f44c;
        if (((io.flutter.view.a) bVar.f101c) == null) {
            aVar.e(null);
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
                    io.flutter.view.a aVar2 = (io.flutter.view.a) bVar.f101c;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.g gVar = (io.flutter.view.g) aVar2.f748a;
                        AccessibilityEvent d2 = gVar.d(0, 32);
                        d2.getText().add(str2);
                        gVar.h(d2);
                        break;
                    } else {
                        aVar2.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) bVar.f101c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar3.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.g) aVar3.f748a).f830a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) bVar.f101c;
                    ((io.flutter.view.g) aVar4.f748a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar5 = (io.flutter.view.a) bVar.f101c;
                    ((io.flutter.view.g) aVar5.f748a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar6 = (io.flutter.view.a) bVar.f101c;
                    ((io.flutter.view.g) aVar6.f748a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        aVar.e(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // N.j
    public void g(A.a aVar, M.j jVar) {
        char c2;
        char c3;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c4;
        Bundle bundle;
        char c5 = 0;
        r11 = false;
        boolean z = false;
        c5 = 0;
        switch (this.f43b) {
            case 8:
                ((A.b) this.f44c).getClass();
                return;
            case 9:
            case 12:
            case 16:
            case 17:
            case 21:
            case 23:
            default:
                A.a aVar2 = (A.a) this.f44c;
                if (((io.flutter.plugin.editing.j) aVar2.f4d) == null) {
                    return;
                }
                String str = (String) aVar.f3c;
                str.getClass();
                Object obj = aVar.f4d;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c4 = '\t';
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
                            JSONObject jSONObject = (JSONObject) obj;
                            int i2 = jSONObject.getInt("platformViewId");
                            boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.m mVar = ((io.flutter.plugin.editing.j) aVar2.f4d).f672a;
                            if (optBoolean) {
                                E.v vVar = mVar.f678a;
                                vVar.requestFocus();
                                mVar.f682e = new io.flutter.plugin.editing.l(3, i2);
                                mVar.f679b.restartInput(vVar);
                                mVar.f686i = false;
                            } else {
                                mVar.getClass();
                                mVar.f682e = new io.flutter.plugin.editing.l(4, i2);
                                mVar.f687j = null;
                            }
                            jVar.c(null);
                            return;
                        } catch (JSONException e2) {
                            jVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.j) aVar2.f4d).c(M.p.a((JSONObject) obj));
                            jVar.c(null);
                            return;
                        } catch (JSONException e3) {
                            jVar.a("error", e3.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((io.flutter.plugin.editing.j) aVar2.f4d).a(jSONArray.getInt(0), M.n.a(jSONArray.getJSONObject(1)));
                            jVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e4) {
                            jVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    case 3:
                        io.flutter.plugin.editing.m mVar2 = ((io.flutter.plugin.editing.j) aVar2.f4d).f672a;
                        if (mVar2.f682e.f676a == 4) {
                            mVar2.c();
                        } else {
                            mVar2.c();
                            mVar2.f679b.hideSoftInputFromWindow(mVar2.f678a.getApplicationWindowToken(), 0);
                        }
                        jVar.c(null);
                        return;
                    case 4:
                        io.flutter.plugin.editing.m mVar3 = ((io.flutter.plugin.editing.j) aVar2.f4d).f672a;
                        E.v vVar2 = mVar3.f678a;
                        M.n nVar = mVar3.f683f;
                        InputMethodManager inputMethodManager = mVar3.f679b;
                        if (nVar == null || nVar.f386g.f393a != 11) {
                            vVar2.requestFocus();
                            inputMethodManager.showSoftInput(vVar2, 0);
                        } else {
                            mVar3.c();
                            inputMethodManager.hideSoftInputFromWindow(vVar2.getApplicationWindowToken(), 0);
                        }
                        jVar.c(null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            io.flutter.plugin.editing.m mVar4 = ((io.flutter.plugin.editing.j) aVar2.f4d).f672a;
                            mVar4.f679b.sendAppPrivateCommand(mVar4.f678a, string, bundle);
                            jVar.c(null);
                            return;
                        } catch (JSONException e5) {
                            jVar.a("error", e5.getMessage(), null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d2 = jSONObject3.getDouble("width");
                            double d3 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i3 = 0; i3 < 16; i3++) {
                                dArr[i3] = jSONArray2.getDouble(i3);
                            }
                            ((io.flutter.plugin.editing.j) aVar2.f4d).b(d2, d3, dArr);
                            jVar.c(null);
                            return;
                        } catch (JSONException e6) {
                            jVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case 7:
                        io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) aVar2.f4d;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = jVar2.f672a.f680c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            jVar2.getClass();
                        }
                        jVar.c(null);
                        return;
                    case '\b':
                        io.flutter.plugin.editing.m mVar5 = ((io.flutter.plugin.editing.j) aVar2.f4d).f672a;
                        if (mVar5.f682e.f676a != 3) {
                            mVar5.f685h.e(mVar5);
                            mVar5.c();
                            mVar5.f683f = null;
                            mVar5.d(null);
                            mVar5.f682e = new io.flutter.plugin.editing.l(1, 0);
                            mVar5.f690m = null;
                            int i4 = l.d.f953a;
                            E.v vVar3 = mVar5.f678a;
                            l.q a2 = l.c.a(vVar3);
                            if (a2 != null && !a2.f977a.m(8)) {
                                mVar5.f679b.restartInput(vVar3);
                            }
                        }
                        jVar.c(null);
                        return;
                    case '\t':
                        io.flutter.plugin.editing.j jVar3 = (io.flutter.plugin.editing.j) aVar2.f4d;
                        int i5 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.m mVar6 = jVar3.f672a;
                        if (i5 < 26) {
                            mVar6.getClass();
                        } else if (mVar6.f680c != null && mVar6.f684g != null) {
                            String str2 = (String) mVar6.f683f.f389j.f7b;
                            int[] iArr = new int[2];
                            E.v vVar4 = mVar6.f678a;
                            vVar4.getLocationOnScreen(iArr);
                            Rect rect = new Rect(mVar6.f690m);
                            rect.offset(iArr[0], iArr[1]);
                            mVar6.f680c.notifyViewEntered(vVar4, str2.hashCode(), rect);
                        }
                        jVar.c(null);
                        return;
                    default:
                        jVar.b();
                        return;
                }
            case 10:
                A.a aVar3 = (A.a) this.f44c;
                if (((k) aVar3.f4d) == null) {
                    return;
                }
                String str3 = (String) aVar.f3c;
                str3.getClass();
                if (!str3.equals("Localization.getStringResource")) {
                    jVar.b();
                    return;
                }
                JSONObject jSONObject4 = (JSONObject) aVar.f4d;
                try {
                    jVar.c(((k) aVar3.f4d).l(jSONObject4.getString("key"), jSONObject4.has("locale") ? jSONObject4.getString("locale") : null));
                    return;
                } catch (JSONException e7) {
                    jVar.a("error", e7.getMessage(), null);
                    return;
                }
            case 11:
                k kVar = (k) this.f44c;
                if (((k) kVar.f44c) == null) {
                    return;
                }
                String str4 = (String) aVar.f3c;
                try {
                    if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                        try {
                            ((k) kVar.f44c).k((String) ((HashMap) aVar.f4d).get("kind"));
                            jVar.c(Boolean.TRUE);
                        } catch (Exception e8) {
                            jVar.a("error", "Error when setting cursors: " + e8.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e9) {
                    jVar.a("error", "Unhandled error: " + e9.getMessage(), null);
                    return;
                }
            case 13:
                m(aVar, jVar);
                return;
            case 14:
                k kVar2 = (k) this.f44c;
                if (((A.a) kVar2.f44c) == null) {
                    return;
                }
                String str5 = (String) aVar.f3c;
                str5.getClass();
                Object obj2 = aVar.f4d;
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
                        Object[] objArr = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (objArr == true) {
                                ((io.flutter.plugin.platform.j) ((A.a) kVar2.f44c).f3c).f737v.e(new M.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                throw null;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                c5 = 1;
                            }
                            ((io.flutter.plugin.platform.j) ((A.a) kVar2.f44c).f3c).f737v.f(new M.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), c5 != 0 ? 2 : 1, wrap));
                            throw null;
                        } catch (IllegalStateException e10) {
                            jVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            A.a aVar4 = (A.a) kVar2.f44c;
                            int intValue = ((Integer) map2.get("id")).intValue();
                            double doubleValue = ((Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.i) aVar4.f4d).f(intValue);
                            ((io.flutter.plugin.platform.j) aVar4.f3c).f737v.j(intValue, doubleValue, doubleValue2);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            jVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        int intValue2 = ((Integer) map3.get("id")).intValue();
                        M.i iVar = new M.i(intValue2, ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue());
                        try {
                            A.a aVar5 = (A.a) kVar2.f44c;
                            F.j jVar4 = new F.j();
                            aVar5.getClass();
                            ((io.flutter.plugin.platform.i) aVar5.f4d).f(intValue2);
                            ((io.flutter.plugin.platform.j) aVar5.f3c).f737v.l(iVar, jVar4);
                            return;
                        } catch (IllegalStateException e12) {
                            jVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 3:
                        int intValue3 = ((Integer) obj2).intValue();
                        try {
                            A.a aVar6 = (A.a) kVar2.f44c;
                            ((io.flutter.plugin.platform.i) aVar6.f4d).f(intValue3);
                            ((io.flutter.plugin.platform.j) aVar6.f3c).f737v.d(intValue3);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e13) {
                            jVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 4:
                        try {
                            ((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) ((A.a) kVar2.f44c).f3c).f737v.f631c).f734r = ((Boolean) obj2).booleanValue();
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e14) {
                            jVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj2;
                        int intValue4 = ((Integer) list.get(0)).intValue();
                        M.h hVar = new M.h(intValue4, (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                        try {
                            A.a aVar7 = (A.a) kVar2.f44c;
                            aVar7.getClass();
                            ((io.flutter.plugin.platform.i) aVar7.f4d).f(intValue4);
                            ((io.flutter.plugin.platform.j) aVar7.f3c).f737v.k(hVar);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            jVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj2;
                        int intValue5 = ((Integer) map4.get("id")).intValue();
                        int intValue6 = ((Integer) map4.get("direction")).intValue();
                        try {
                            A.a aVar8 = (A.a) kVar2.f44c;
                            ((io.flutter.plugin.platform.i) aVar8.f4d).f(intValue5);
                            ((io.flutter.plugin.platform.j) aVar8.f3c).f737v.m(intValue5, intValue6);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            jVar.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case 7:
                        int intValue7 = ((Integer) ((Map) obj2).get("id")).intValue();
                        try {
                            A.a aVar9 = (A.a) kVar2.f44c;
                            ((io.flutter.plugin.platform.i) aVar9.f4d).f(intValue7);
                            ((io.flutter.plugin.platform.j) aVar9.f3c).f737v.g(intValue7);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e17) {
                            jVar.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 15:
                n(aVar, jVar);
                return;
            case 18:
                A.a aVar10 = (A.a) this.f44c;
                if (((Q.a) aVar10.f4d) == null) {
                    return;
                }
                String str6 = (String) aVar.f3c;
                Object obj3 = aVar.f4d;
                str6.getClass();
                if (str6.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((Q.a) aVar10.f4d).c((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), jVar);
                        return;
                    } catch (IllegalStateException e18) {
                        jVar.a("error", e18.getMessage(), null);
                        return;
                    }
                }
                if (!str6.equals("ProcessText.queryTextActions")) {
                    jVar.b();
                    return;
                }
                try {
                    jVar.c(((Q.a) aVar10.f4d).d());
                    return;
                } catch (IllegalStateException e19) {
                    jVar.a("error", e19.getMessage(), null);
                    return;
                }
            case 19:
                String str7 = (String) aVar.f3c;
                str7.getClass();
                M.k kVar3 = (M.k) this.f44c;
                if (!str7.equals("get")) {
                    if (!str7.equals("put")) {
                        jVar.b();
                        return;
                    } else {
                        kVar3.f370b = (byte[]) aVar.f4d;
                        jVar.c(null);
                        return;
                    }
                }
                kVar3.f374f = true;
                if (kVar3.f373e || !kVar3.f369a) {
                    jVar.c(M.k.a(kVar3.f370b));
                    return;
                } else {
                    kVar3.f372d = jVar;
                    return;
                }
            case 20:
                k kVar4 = (k) this.f44c;
                if (((A.a) kVar4.f44c) == null) {
                    return;
                }
                String str8 = (String) aVar.f3c;
                str8.getClass();
                switch (str8.hashCode()) {
                    case -705821951:
                        if (str8.equals("Scribe.isFeatureAvailable")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1759284829:
                        if (str8.equals("Scribe.startStylusHandwriting")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2119738044:
                        if (str8.equals("Scribe.isStylusHandwritingAvailable")) {
                            c3 = 2;
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
                            A.a aVar11 = (A.a) kVar4.f44c;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) aVar11.f3c).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    z = true;
                                }
                            } else {
                                aVar11.getClass();
                            }
                            jVar.c(Boolean.valueOf(z));
                            return;
                        } catch (IllegalStateException e20) {
                            jVar.a("error", e20.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            jVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            A.a aVar12 = (A.a) kVar4.f44c;
                            ((InputMethodManager) aVar12.f3c).startStylusHandwriting((E.v) aVar12.f4d);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e21) {
                            jVar.a("error", e21.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            jVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((A.a) kVar4.f44c).f3c).isStylusHandwritingAvailable();
                            jVar.c(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e22) {
                            jVar.a("error", e22.getMessage(), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 22:
                o(aVar, jVar);
                return;
            case 24:
                k kVar5 = (k) this.f44c;
                if (((io.flutter.plugin.editing.h) kVar5.f44c) == null) {
                    return;
                }
                String str9 = (String) aVar.f3c;
                Object obj4 = aVar.f4d;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    jVar.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((io.flutter.plugin.editing.h) kVar5.f44c).a((String) arrayList2.get(0), (String) arrayList2.get(1), jVar);
                    return;
                } catch (IllegalStateException e23) {
                    jVar.a("error", e23.getMessage(), null);
                    return;
                }
        }
    }

    @Override // N.f
    public void h(String str, N.d dVar, A.b bVar) {
        ((G.j) this.f44c).h(str, dVar, bVar);
    }

    @Override // N.f
    public void i(String str, ByteBuffer byteBuffer, N.e eVar) {
        ((G.j) this.f44c).i(str, byteBuffer, eVar);
    }

    public void k(String str) {
        A.a aVar = (A.a) this.f44c;
        E.v vVar = (E.v) aVar.f3c;
        if (A.a.f1f == null) {
            H h2 = new H();
            h2.put("alias", 1010);
            h2.put("allScroll", 1013);
            h2.put("basic", 1000);
            h2.put("cell", 1006);
            h2.put("click", 1002);
            h2.put("contextMenu", 1001);
            h2.put("copy", 1011);
            h2.put("forbidden", 1012);
            h2.put("grab", 1020);
            h2.put("grabbing", 1021);
            h2.put("help", 1003);
            h2.put("move", 1013);
            h2.put("none", 0);
            h2.put("noDrop", 1012);
            h2.put("precise", 1007);
            h2.put("text", 1008);
            h2.put("resizeColumn", 1014);
            h2.put("resizeDown", 1015);
            h2.put("resizeUpLeft", 1016);
            h2.put("resizeDownRight", 1017);
            h2.put("resizeLeft", 1014);
            h2.put("resizeLeftRight", 1014);
            h2.put("resizeRight", 1014);
            h2.put("resizeRow", 1015);
            h2.put("resizeUp", 1015);
            h2.put("resizeUpDown", 1015);
            h2.put("resizeUpLeft", 1017);
            h2.put("resizeUpRight", 1016);
            h2.put("resizeUpLeftDownRight", 1017);
            h2.put("resizeUpRightDownLeft", 1016);
            h2.put("verticalText", 1009);
            h2.put("wait", 1004);
            h2.put("zoomIn", 1018);
            h2.put("zoomOut", 1019);
            A.a.f1f = h2;
        }
        vVar.setPointerIcon(PointerIcon.getSystemIcon(((E.v) aVar.f3c).getContext(), ((Integer) A.a.f1f.getOrDefault(str, 1000)).intValue()));
    }

    public String l(String str, String str2) {
        O.a aVar = (O.a) this.f44c;
        Context context = aVar.f415b;
        AbstractActivityC0004e abstractActivityC0004e = aVar.f415b;
        if (str2 != null) {
            Locale a2 = O.a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0004e.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = abstractActivityC0004e.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0004e.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public /* synthetic */ k(int i2, Object obj) {
        this.f43b = i2;
        this.f44c = obj;
    }

    public k(G.b bVar, int i2) {
        this.f43b = i2;
        switch (i2) {
            case 16:
                new A.e(bVar, "flutter/platform_views_2", N.n.f411a, null).l(new k(15, this));
                break;
            case 17:
                new A.e(bVar, "flutter/platform_views", N.n.f411a, null).l(new k(14, this));
                break;
            case 21:
                new A.e(bVar, "flutter/scribe", N.h.f407b, null).l(new k(20, this));
                break;
            case 23:
                new A.e(bVar, "flutter/sensitivecontent", N.n.f411a, null).l(new k(22, this));
                break;
            case 25:
                new A.e(bVar, "flutter/spellcheck", N.n.f411a, null).l(new k(24, this));
                break;
            default:
                new A.e(bVar, "flutter/mousecursor", N.n.f411a, null).l(new k(11, this));
                break;
        }
    }

    public k(N.f fVar) {
        this.f43b = 9;
        new A.e(fVar, "flutter/keyboard", N.n.f411a, null).l(new A.a(this));
    }
}
