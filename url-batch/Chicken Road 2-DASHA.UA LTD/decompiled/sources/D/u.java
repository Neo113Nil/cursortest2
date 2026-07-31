package D;

import D.u;
import E.k;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
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
public class u implements N.d, N.f, N.b, N.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110b;

    /* renamed from: c, reason: collision with root package name */
    public Object f111c;

    public /* synthetic */ u() {
        this.f110b = 4;
    }

    public static int h(u uVar, int i2) {
        uVar.getClass();
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

    public static boolean l(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0178 A[Catch: JSONException -> 0x002d, TryCatch #11 {JSONException -> 0x002d, blocks: (B:7:0x0014, B:8:0x001d, B:13:0x00d2, B:15:0x00d7, B:17:0x0106, B:20:0x012a, B:22:0x011d, B:25:0x0124, B:26:0x0139, B:28:0x015d, B:38:0x0161, B:31:0x016e, B:33:0x0178, B:35:0x0185, B:40:0x0166, B:41:0x018a, B:43:0x019e, B:45:0x01b0, B:46:0x01b3, B:48:0x01da, B:50:0x01ea, B:78:0x02cd, B:67:0x02e7, B:69:0x02f7, B:70:0x0308, B:73:0x0305, B:96:0x01d1, B:122:0x0240, B:103:0x025e, B:64:0x02a2, B:89:0x02c5, B:82:0x02df, B:75:0x030d, B:124:0x0022, B:127:0x0030, B:130:0x003b, B:133:0x0047, B:136:0x0053, B:139:0x005e, B:142:0x006a, B:145:0x0074, B:148:0x007e, B:151:0x0088, B:154:0x0092, B:157:0x009c, B:160:0x00a7, B:163:0x00b2, B:166:0x00bd, B:53:0x0267, B:55:0x0271, B:56:0x0274, B:58:0x028a, B:59:0x029c, B:62:0x0293), top: B:6:0x0014, inners: #0, #3, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0185 A[Catch: JSONException -> 0x002d, TryCatch #11 {JSONException -> 0x002d, blocks: (B:7:0x0014, B:8:0x001d, B:13:0x00d2, B:15:0x00d7, B:17:0x0106, B:20:0x012a, B:22:0x011d, B:25:0x0124, B:26:0x0139, B:28:0x015d, B:38:0x0161, B:31:0x016e, B:33:0x0178, B:35:0x0185, B:40:0x0166, B:41:0x018a, B:43:0x019e, B:45:0x01b0, B:46:0x01b3, B:48:0x01da, B:50:0x01ea, B:78:0x02cd, B:67:0x02e7, B:69:0x02f7, B:70:0x0308, B:73:0x0305, B:96:0x01d1, B:122:0x0240, B:103:0x025e, B:64:0x02a2, B:89:0x02c5, B:82:0x02df, B:75:0x030d, B:124:0x0022, B:127:0x0030, B:130:0x003b, B:133:0x0047, B:136:0x0053, B:139:0x005e, B:142:0x006a, B:145:0x0074, B:148:0x007e, B:151:0x0088, B:154:0x0092, B:157:0x009c, B:160:0x00a7, B:163:0x00b2, B:166:0x00bd, B:53:0x0267, B:55:0x0271, B:56:0x0274, B:58:0x028a, B:59:0x029c, B:62:0x0293), top: B:6:0x0014, inners: #0, #3, #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m(B.a aVar, M.k kVar) {
        char c2;
        int i2;
        M.e a2;
        CharSequence h2;
        ClipDescription primaryClipDescription;
        B.a aVar2 = (B.a) this.f111c;
        if (((io.flutter.plugin.platform.c) aVar2.f4d) == null) {
            return;
        }
        String str = (String) aVar.f3c;
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
            Object obj = aVar.f4d;
            switch (c2) {
                case 0:
                    try {
                        int c3 = AbstractC0009j.c((String) obj);
                        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c;
                        if (c3 == 1) {
                            fVar.f647a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            fVar.getClass();
                        }
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        kVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((io.flutter.plugin.platform.c) aVar2.f4d).n(AbstractC0009j.b((String) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        kVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c).f647a.setRequestedOrientation(B.a.i(aVar2, (JSONArray) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        kVar.a("error", e4.getMessage(), null);
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
                        io.flutter.plugin.platform.c cVar = (io.flutter.plugin.platform.c) aVar2.f4d;
                        int i4 = Build.VERSION.SDK_INT;
                        AbstractActivityC0005f abstractActivityC0005f = ((io.flutter.plugin.platform.f) cVar.f642c).f647a;
                        if (i4 < 28) {
                            abstractActivityC0005f.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                        } else {
                            abstractActivityC0005f.setTaskDescription(AbstractC0011l.b(string, i3));
                        }
                        kVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        kVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((io.flutter.plugin.platform.c) aVar2.f4d).m(B.a.j(aVar2, (JSONArray) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        kVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        int k2 = B.a.k(aVar2, (String) obj);
                        io.flutter.plugin.platform.f fVar2 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c;
                        fVar2.getClass();
                        if (k2 == 1) {
                            i2 = 1798;
                        } else if (k2 == 2) {
                            i2 = 3846;
                        } else {
                            if (k2 != 3) {
                                if (k2 == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i2 = 1792;
                                }
                                kVar.c(null);
                                return;
                            }
                            i2 = 5894;
                        }
                        fVar2.f651e = i2;
                        fVar2.b();
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        kVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.f fVar3 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c;
                    View decorView = fVar3.f647a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.e(fVar3, decorView));
                    kVar.c(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c).b();
                    kVar.c(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c).a(B.a.l(aVar2, (JSONObject) obj));
                        kVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        kVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0005f abstractActivityC0005f2 = ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c).f649c;
                    if (abstractActivityC0005f2 != null) {
                        abstractActivityC0005f2.h(booleanValue);
                    }
                    kVar.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.f fVar4 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c;
                    AbstractActivityC0005f abstractActivityC0005f3 = fVar4.f649c;
                    fVar4.f647a.finish();
                    kVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = M.e.a(str2);
                        } catch (NoSuchFieldException unused) {
                            kVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        h2 = ((io.flutter.plugin.platform.c) aVar2.f4d).h(a2);
                        if (h2 != null) {
                            kVar.c(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", h2);
                        kVar.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    h2 = ((io.flutter.plugin.platform.c) aVar2.f4d).h(a2);
                    if (h2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c).f647a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    kVar.c(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c).f647a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z2);
                    kVar.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.f fVar5 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.c) aVar2.f4d).f642c;
                    fVar5.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    fVar5.f647a.startActivity(Intent.createChooser(intent, null));
                    kVar.c(null);
                    return;
                default:
                    kVar.b();
                    return;
            }
        } catch (JSONException e9) {
            kVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        kVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    private final void n(B.a aVar, M.k kVar) {
        Object obj;
        u uVar = (u) this.f111c;
        if (((io.flutter.plugin.platform.c) uVar.f111c) == null) {
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
                    if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.c) uVar.f111c).f642c).f652b.f195a.get(str2) != null) {
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
                    AbstractC0009j.f(((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.c) uVar.f111c).f642c).f658h.get(intValue));
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    kVar.c(null);
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
                    io.flutter.plugin.platform.c cVar = (io.flutter.plugin.platform.c) uVar.f111c;
                    cVar.getClass();
                    io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) cVar.f642c;
                    float f2 = jVar.f653c.getResources().getDisplayMetrics().density;
                    if (jVar.f658h.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    kVar.c(null);
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
                    if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.c) uVar.f111c).f642c).f658h.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    kVar.c(null);
                    return;
                } catch (IllegalStateException e5) {
                    kVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.c) uVar.f111c).f642c).f655e;
                kVar.c(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((io.flutter.plugin.platform.c) uVar.f111c).g(((Integer) ((Map) obj).get("id")).intValue());
                    kVar.c(null);
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

    private final void o(B.a aVar, M.k kVar) {
        int i2 = 2;
        u uVar = (u) this.f111c;
        if (((R.a) uVar.f111c) == null) {
        }
        String str = (String) aVar.f3c;
        str.getClass();
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a2 = ((R.a) uVar.f111c).a();
                    if (a2 == 0) {
                        i2 = 0;
                    } else if (a2 == 1) {
                        i2 = 1;
                    } else if (a2 != 2) {
                        i2 = 3;
                    }
                    kVar.c(Integer.valueOf(i2));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    kVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                try {
                    ((R.a) uVar.f111c).b(h(uVar, ((Integer) aVar.f4d).intValue()));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    kVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((R.a) uVar.f111c).getClass();
                kVar.c(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                kVar.b();
                break;
        }
    }

    @Override // N.f
    public void a(String str, N.d dVar, B.b bVar) {
        ((F.j) this.f111c).a(str, dVar, bVar);
    }

    @Override // N.f
    public void b(String str, N.d dVar) {
        ((F.j) this.f111c).a(str, dVar, null);
    }

    @Override // N.d
    public void c(ByteBuffer byteBuffer, F.g gVar) {
        N.o.f355b.getClass();
        N.o.a(byteBuffer);
        ((F.b) this.f111c).getClass();
    }

    @Override // N.b
    public void d(Object obj, B.a aVar) {
        HashMap hashMap;
        HashMap hashMap2;
        C.b bVar = (C.b) this.f111c;
        if (((io.flutter.view.b) bVar.f15c) == null) {
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
                    io.flutter.view.b bVar2 = (io.flutter.view.b) bVar.f15c;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.h hVar = (io.flutter.view.h) bVar2.f695a;
                        AccessibilityEvent d2 = hVar.d(0, 32);
                        d2.getText().add(str2);
                        hVar.h(d2);
                        break;
                    } else {
                        bVar2.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) bVar.f15c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar3.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar3.f695a).f778a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) bVar.f15c;
                    ((io.flutter.view.h) bVar4.f695a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) bVar.f15c;
                    ((io.flutter.view.h) bVar5.f695a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar6 = (io.flutter.view.b) bVar.f15c;
                    ((io.flutter.view.h) bVar6.f695a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        aVar.e(null);
    }

    @Override // N.f
    public B.b e(N.h hVar) {
        return ((F.j) this.f111c).e(hVar);
    }

    @Override // N.f
    public void f(String str, ByteBuffer byteBuffer, N.e eVar) {
        ((F.j) this.f111c).f(str, byteBuffer, eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // N.j
    public void g(B.a aVar, M.k kVar) {
        char c2;
        char c3;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c4;
        Bundle bundle;
        char c5 = 0;
        r11 = false;
        boolean z2 = false;
        c5 = 0;
        switch (this.f110b) {
            case 7:
                ((B.b) this.f111c).getClass();
                return;
            case 8:
            case 11:
            case 15:
            case 16:
            case 20:
            case 22:
            default:
                B.a aVar2 = (B.a) this.f111c;
                if (((io.flutter.plugin.editing.i) aVar2.f4d) == null) {
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
                            io.flutter.plugin.editing.l lVar = ((io.flutter.plugin.editing.i) aVar2.f4d).f617a;
                            if (optBoolean) {
                                y yVar = lVar.f623a;
                                yVar.requestFocus();
                                lVar.f627e = new io.flutter.plugin.editing.k(3, i2);
                                lVar.f624b.restartInput(yVar);
                                lVar.f631i = false;
                            } else {
                                lVar.getClass();
                                lVar.f627e = new io.flutter.plugin.editing.k(4, i2);
                                lVar.f632j = null;
                            }
                            kVar.c(null);
                            return;
                        } catch (JSONException e2) {
                            kVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.i) aVar2.f4d).c(M.q.a((JSONObject) obj));
                            kVar.c(null);
                            return;
                        } catch (JSONException e3) {
                            kVar.a("error", e3.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((io.flutter.plugin.editing.i) aVar2.f4d).a(jSONArray.getInt(0), M.o.a(jSONArray.getJSONObject(1)));
                            kVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e4) {
                            kVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    case 3:
                        io.flutter.plugin.editing.l lVar2 = ((io.flutter.plugin.editing.i) aVar2.f4d).f617a;
                        if (lVar2.f627e.f621a == 4) {
                            lVar2.c();
                        } else {
                            lVar2.c();
                            lVar2.f624b.hideSoftInputFromWindow(lVar2.f623a.getApplicationWindowToken(), 0);
                        }
                        kVar.c(null);
                        return;
                    case 4:
                        io.flutter.plugin.editing.l lVar3 = ((io.flutter.plugin.editing.i) aVar2.f4d).f617a;
                        y yVar2 = lVar3.f623a;
                        M.o oVar = lVar3.f628f;
                        InputMethodManager inputMethodManager = lVar3.f624b;
                        if (oVar == null || oVar.f328g.f335a != 11) {
                            yVar2.requestFocus();
                            inputMethodManager.showSoftInput(yVar2, 0);
                        } else {
                            lVar3.c();
                            inputMethodManager.hideSoftInputFromWindow(yVar2.getApplicationWindowToken(), 0);
                        }
                        kVar.c(null);
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
                            io.flutter.plugin.editing.l lVar4 = ((io.flutter.plugin.editing.i) aVar2.f4d).f617a;
                            lVar4.f624b.sendAppPrivateCommand(lVar4.f623a, string, bundle);
                            kVar.c(null);
                            return;
                        } catch (JSONException e5) {
                            kVar.a("error", e5.getMessage(), null);
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
                            ((io.flutter.plugin.editing.i) aVar2.f4d).b(d2, d3, dArr);
                            kVar.c(null);
                            return;
                        } catch (JSONException e6) {
                            kVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case 7:
                        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) aVar2.f4d;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = iVar.f617a.f625c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            iVar.getClass();
                        }
                        kVar.c(null);
                        return;
                    case '\b':
                        io.flutter.plugin.editing.l lVar5 = ((io.flutter.plugin.editing.i) aVar2.f4d).f617a;
                        if (lVar5.f627e.f621a != 3) {
                            lVar5.f630h.e(lVar5);
                            lVar5.c();
                            lVar5.f628f = null;
                            lVar5.d(null);
                            lVar5.f627e = new io.flutter.plugin.editing.k(1, 0);
                            lVar5.f635m = null;
                            int i4 = l.d.f900a;
                            y yVar3 = lVar5.f623a;
                            l.q a2 = l.c.a(yVar3);
                            if (a2 != null && !a2.f924a.m(8)) {
                                lVar5.f624b.restartInput(yVar3);
                            }
                        }
                        kVar.c(null);
                        return;
                    case '\t':
                        io.flutter.plugin.editing.i iVar2 = (io.flutter.plugin.editing.i) aVar2.f4d;
                        int i5 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.l lVar6 = iVar2.f617a;
                        if (i5 < 26) {
                            lVar6.getClass();
                        } else if (lVar6.f625c != null && lVar6.f629g != null) {
                            String str2 = (String) lVar6.f628f.f331j.f7a;
                            int[] iArr = new int[2];
                            y yVar4 = lVar6.f623a;
                            yVar4.getLocationOnScreen(iArr);
                            Rect rect = new Rect(lVar6.f635m);
                            rect.offset(iArr[0], iArr[1]);
                            lVar6.f625c.notifyViewEntered(yVar4, str2.hashCode(), rect);
                        }
                        kVar.c(null);
                        return;
                    default:
                        kVar.b();
                        return;
                }
            case 9:
                B.a aVar3 = (B.a) this.f111c;
                if (((u) aVar3.f4d) == null) {
                    return;
                }
                String str3 = (String) aVar.f3c;
                str3.getClass();
                if (!str3.equals("Localization.getStringResource")) {
                    kVar.b();
                    return;
                }
                JSONObject jSONObject4 = (JSONObject) aVar.f4d;
                try {
                    kVar.c(((u) aVar3.f4d).k(jSONObject4.getString("key"), jSONObject4.has("locale") ? jSONObject4.getString("locale") : null));
                    return;
                } catch (JSONException e7) {
                    kVar.a("error", e7.getMessage(), null);
                    return;
                }
            case 10:
                u uVar = (u) this.f111c;
                if (((u) uVar.f111c) == null) {
                    return;
                }
                String str4 = (String) aVar.f3c;
                try {
                    if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                        try {
                            ((u) uVar.f111c).i((String) ((HashMap) aVar.f4d).get("kind"));
                            kVar.c(Boolean.TRUE);
                        } catch (Exception e8) {
                            kVar.a("error", "Error when setting cursors: " + e8.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e9) {
                    kVar.a("error", "Unhandled error: " + e9.getMessage(), null);
                    return;
                }
            case 12:
                m(aVar, kVar);
                return;
            case 13:
                u uVar2 = (u) this.f111c;
                if (((B.a) uVar2.f111c) == null) {
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
                                ((io.flutter.plugin.platform.k) ((B.a) uVar2.f111c).f3c).f684v.e(new M.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                throw null;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                c5 = 1;
                            }
                            ((io.flutter.plugin.platform.k) ((B.a) uVar2.f111c).f3c).f684v.f(new M.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), c5 != 0 ? 2 : 1, wrap));
                            throw null;
                        } catch (IllegalStateException e10) {
                            kVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            B.a aVar4 = (B.a) uVar2.f111c;
                            int intValue = ((Integer) map2.get("id")).intValue();
                            double doubleValue = ((Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.j) aVar4.f4d).f(intValue);
                            ((io.flutter.plugin.platform.k) aVar4.f3c).f684v.i(intValue, doubleValue, doubleValue2);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            kVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        int intValue2 = ((Integer) map3.get("id")).intValue();
                        M.j jVar = new M.j(intValue2, ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue());
                        try {
                            B.a aVar5 = (B.a) uVar2.f111c;
                            E.j jVar2 = new E.j();
                            aVar5.getClass();
                            ((io.flutter.plugin.platform.j) aVar5.f4d).f(intValue2);
                            ((io.flutter.plugin.platform.k) aVar5.f3c).f684v.k(jVar, jVar2);
                            return;
                        } catch (IllegalStateException e12) {
                            kVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 3:
                        int intValue3 = ((Integer) obj2).intValue();
                        try {
                            B.a aVar6 = (B.a) uVar2.f111c;
                            ((io.flutter.plugin.platform.j) aVar6.f4d).f(intValue3);
                            ((io.flutter.plugin.platform.k) aVar6.f3c).f684v.d(intValue3);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e13) {
                            kVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 4:
                        try {
                            ((io.flutter.plugin.platform.k) ((io.flutter.plugin.platform.k) ((B.a) uVar2.f111c).f3c).f684v.f642c).f681r = ((Boolean) obj2).booleanValue();
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e14) {
                            kVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj2;
                        int intValue4 = ((Integer) list.get(0)).intValue();
                        M.i iVar3 = new M.i(intValue4, (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                        try {
                            B.a aVar7 = (B.a) uVar2.f111c;
                            aVar7.getClass();
                            ((io.flutter.plugin.platform.j) aVar7.f4d).f(intValue4);
                            ((io.flutter.plugin.platform.k) aVar7.f3c).f684v.j(iVar3);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            kVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj2;
                        int intValue5 = ((Integer) map4.get("id")).intValue();
                        int intValue6 = ((Integer) map4.get("direction")).intValue();
                        try {
                            B.a aVar8 = (B.a) uVar2.f111c;
                            ((io.flutter.plugin.platform.j) aVar8.f4d).f(intValue5);
                            ((io.flutter.plugin.platform.k) aVar8.f3c).f684v.l(intValue5, intValue6);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            kVar.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case 7:
                        int intValue7 = ((Integer) ((Map) obj2).get("id")).intValue();
                        try {
                            B.a aVar9 = (B.a) uVar2.f111c;
                            ((io.flutter.plugin.platform.j) aVar9.f4d).f(intValue7);
                            ((io.flutter.plugin.platform.k) aVar9.f3c).f684v.g(intValue7);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e17) {
                            kVar.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        kVar.b();
                        return;
                }
            case 14:
                n(aVar, kVar);
                return;
            case 17:
                B.a aVar10 = (B.a) this.f111c;
                if (((Q.a) aVar10.f4d) == null) {
                    return;
                }
                String str6 = (String) aVar.f3c;
                Object obj3 = aVar.f4d;
                str6.getClass();
                if (str6.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((Q.a) aVar10.f4d).c((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), kVar);
                        return;
                    } catch (IllegalStateException e18) {
                        kVar.a("error", e18.getMessage(), null);
                        return;
                    }
                }
                if (!str6.equals("ProcessText.queryTextActions")) {
                    kVar.b();
                    return;
                }
                try {
                    kVar.c(((Q.a) aVar10.f4d).d());
                    return;
                } catch (IllegalStateException e19) {
                    kVar.a("error", e19.getMessage(), null);
                    return;
                }
            case 18:
                String str7 = (String) aVar.f3c;
                str7.getClass();
                M.l lVar7 = (M.l) this.f111c;
                if (!str7.equals("get")) {
                    if (!str7.equals("put")) {
                        kVar.b();
                        return;
                    } else {
                        lVar7.f312b = (byte[]) aVar.f4d;
                        kVar.c(null);
                        return;
                    }
                }
                lVar7.f316f = true;
                if (lVar7.f315e || !lVar7.f311a) {
                    kVar.c(M.l.a(lVar7.f312b));
                    return;
                } else {
                    lVar7.f314d = kVar;
                    return;
                }
            case 19:
                u uVar3 = (u) this.f111c;
                if (((B.a) uVar3.f111c) == null) {
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
                            B.a aVar11 = (B.a) uVar3.f111c;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) aVar11.f3c).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    z2 = true;
                                }
                            } else {
                                aVar11.getClass();
                            }
                            kVar.c(Boolean.valueOf(z2));
                            return;
                        } catch (IllegalStateException e20) {
                            kVar.a("error", e20.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            kVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            B.a aVar12 = (B.a) uVar3.f111c;
                            ((InputMethodManager) aVar12.f3c).startStylusHandwriting((y) aVar12.f4d);
                            kVar.c(null);
                            return;
                        } catch (IllegalStateException e21) {
                            kVar.a("error", e21.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            kVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((B.a) uVar3.f111c).f3c).isStylusHandwritingAvailable();
                            kVar.c(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e22) {
                            kVar.a("error", e22.getMessage(), null);
                            return;
                        }
                    default:
                        kVar.b();
                        return;
                }
            case 21:
                o(aVar, kVar);
                return;
            case 23:
                u uVar4 = (u) this.f111c;
                if (((io.flutter.plugin.editing.g) uVar4.f111c) == null) {
                    return;
                }
                String str9 = (String) aVar.f3c;
                Object obj4 = aVar.f4d;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    kVar.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((io.flutter.plugin.editing.g) uVar4.f111c).a((String) arrayList2.get(0), (String) arrayList2.get(1), kVar);
                    return;
                } catch (IllegalStateException e23) {
                    kVar.a("error", e23.getMessage(), null);
                    return;
                }
        }
    }

    public void i(String str) {
        B.a aVar = (B.a) this.f111c;
        y yVar = (y) aVar.f3c;
        if (B.a.f1f == null) {
            K k2 = new K();
            k2.put("alias", 1010);
            k2.put("allScroll", 1013);
            k2.put("basic", 1000);
            k2.put("cell", 1006);
            k2.put("click", 1002);
            k2.put("contextMenu", 1001);
            k2.put("copy", 1011);
            k2.put("forbidden", 1012);
            k2.put("grab", 1020);
            k2.put("grabbing", 1021);
            k2.put("help", 1003);
            k2.put("move", 1013);
            k2.put("none", 0);
            k2.put("noDrop", 1012);
            k2.put("precise", 1007);
            k2.put("text", 1008);
            k2.put("resizeColumn", 1014);
            k2.put("resizeDown", 1015);
            k2.put("resizeUpLeft", 1016);
            k2.put("resizeDownRight", 1017);
            k2.put("resizeLeft", 1014);
            k2.put("resizeLeftRight", 1014);
            k2.put("resizeRight", 1014);
            k2.put("resizeRow", 1015);
            k2.put("resizeUp", 1015);
            k2.put("resizeUpDown", 1015);
            k2.put("resizeUpLeft", 1017);
            k2.put("resizeUpRight", 1016);
            k2.put("resizeUpLeftDownRight", 1017);
            k2.put("resizeUpRightDownLeft", 1016);
            k2.put("verticalText", 1009);
            k2.put("wait", 1004);
            k2.put("zoomIn", 1018);
            k2.put("zoomOut", 1019);
            B.a.f1f = k2;
        }
        yVar.setPointerIcon(PointerIcon.getSystemIcon(((y) aVar.f3c).getContext(), ((Integer) B.a.f1f.getOrDefault(str, 1000)).intValue()));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [H.a] */
    public Bitmap j(ByteBuffer byteBuffer, H.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: H.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace.Named named;
                    ColorSpace colorSpace;
                    Size size;
                    u uVar = u.this;
                    uVar.getClass();
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    k kVar = (k) uVar.f111c;
                    if (kVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(kVar.f196a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public String k(String str, String str2) {
        O.a aVar = (O.a) this.f111c;
        Context context = aVar.f357b;
        AbstractActivityC0005f abstractActivityC0005f = aVar.f357b;
        if (str2 != null) {
            Locale a2 = O.a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0005f.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = abstractActivityC0005f.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0005f.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public /* synthetic */ u(int i2, Object obj) {
        this.f110b = i2;
        this.f111c = obj;
    }

    public u(F.b bVar, int i2) {
        this.f110b = i2;
        switch (i2) {
            case 15:
                new C.b(bVar, "flutter/platform_views_2", N.n.f353a).i(new u(14, this));
                break;
            case 16:
                new C.b(bVar, "flutter/platform_views", N.n.f353a).i(new u(13, this));
                break;
            case 20:
                new C.b(bVar, "flutter/scribe", N.h.f349b).i(new u(19, this));
                break;
            case 22:
                new C.b(bVar, "flutter/sensitivecontent", N.n.f353a).i(new u(21, this));
                break;
            case 24:
                new C.b(bVar, "flutter/spellcheck", N.n.f353a).i(new u(23, this));
                break;
            default:
                new C.b(bVar, "flutter/mousecursor", N.n.f353a).i(new u(10, this));
                break;
        }
    }

    public u(N.f fVar) {
        this.f110b = 8;
        new C.b(fVar, "flutter/keyboard", N.n.f353a).i(new B.a(this));
    }
}
