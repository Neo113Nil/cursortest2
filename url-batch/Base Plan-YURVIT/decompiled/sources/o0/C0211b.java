package o0;

import B0.C0008i;
import B0.E;
import N.C0056m;
import N.P;
import android.app.Activity;
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
import i.C0172t;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.h;
import io.flutter.plugin.editing.l;
import io.flutter.view.i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k0.AbstractActivityC0187d;
import k0.C0183A;
import k0.InterfaceC0189f;
import k0.o;
import l0.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.EnumC0233e;
import u0.q;
import v0.C0244i;
import v0.InterfaceC0237b;
import v0.InterfaceC0241f;
import v0.k;
import w0.C0248b;
import x0.InterfaceC0250a;
import y.AbstractC0273q;
import y.Q;
import y.x;
import y0.C0278a;
import z0.C0291a;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0211b implements InterfaceC0237b, k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2914e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2915f;

    public /* synthetic */ C0211b() {
        this.f2914e = 1;
    }

    public static int b(C0211b c0211b, int i2) {
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x0176 A[Catch: JSONException -> 0x0030, TryCatch #12 {JSONException -> 0x0030, blocks: (B:5:0x0017, B:6:0x0020, B:11:0x00d3, B:14:0x00d8, B:16:0x0104, B:19:0x0128, B:21:0x011b, B:24:0x0122, B:25:0x0137, B:27:0x015b, B:37:0x015f, B:30:0x016c, B:32:0x0176, B:34:0x0183, B:39:0x0164, B:40:0x0188, B:42:0x019a, B:44:0x01ac, B:45:0x01b1, B:47:0x01d8, B:49:0x01e8, B:76:0x02c8, B:66:0x02e2, B:68:0x02f2, B:69:0x02ff, B:87:0x01cf, B:106:0x023b, B:120:0x0259, B:63:0x029d, B:113:0x02c0, B:80:0x02da, B:73:0x0304, B:122:0x0025, B:125:0x0033, B:128:0x003e, B:131:0x004a, B:134:0x0056, B:137:0x0061, B:140:0x006d, B:143:0x0077, B:146:0x0081, B:149:0x008b, B:152:0x0095, B:155:0x009f, B:158:0x00aa, B:161:0x00b5, B:164:0x00c0, B:52:0x0262, B:54:0x026c, B:55:0x026f, B:57:0x0285, B:58:0x0297, B:61:0x028e), top: B:4:0x0017, inners: #2, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0183 A[Catch: JSONException -> 0x0030, TryCatch #12 {JSONException -> 0x0030, blocks: (B:5:0x0017, B:6:0x0020, B:11:0x00d3, B:14:0x00d8, B:16:0x0104, B:19:0x0128, B:21:0x011b, B:24:0x0122, B:25:0x0137, B:27:0x015b, B:37:0x015f, B:30:0x016c, B:32:0x0176, B:34:0x0183, B:39:0x0164, B:40:0x0188, B:42:0x019a, B:44:0x01ac, B:45:0x01b1, B:47:0x01d8, B:49:0x01e8, B:76:0x02c8, B:66:0x02e2, B:68:0x02f2, B:69:0x02ff, B:87:0x01cf, B:106:0x023b, B:120:0x0259, B:63:0x029d, B:113:0x02c0, B:80:0x02da, B:73:0x0304, B:122:0x0025, B:125:0x0033, B:128:0x003e, B:131:0x004a, B:134:0x0056, B:137:0x0061, B:140:0x006d, B:143:0x0077, B:146:0x0081, B:149:0x008b, B:152:0x0095, B:155:0x009f, B:158:0x00aa, B:161:0x00b5, B:164:0x00c0, B:52:0x0262, B:54:0x026c, B:55:0x026f, B:57:0x0285, B:58:0x0297, B:61:0x028e), top: B:4:0x0017, inners: #2, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f(P p2, u0.k kVar) {
        char c2;
        int i2;
        EnumC0233e a2;
        CharSequence y2;
        ClipDescription primaryClipDescription;
        P p3 = (P) this.f2915f;
        if (((E) p3.f699g) == null) {
            return;
        }
        String str = (String) p2.f698f;
        Object obj = p2.f699g;
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
            switch (c2) {
                case 0:
                    try {
                        int c3 = L.d.c((String) obj);
                        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) ((E) p3.f699g).f20f;
                        if (c3 == 1) {
                            eVar.f2462a.getWindow().getDecorView().playSoundEffect(0);
                        }
                        kVar.d(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        kVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((E) p3.f699g).E(L.d.b((String) obj));
                        kVar.d(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        kVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                    try {
                        ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).f2462a.setRequestedOrientation(P.o(p3, (JSONArray) obj));
                        kVar.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        kVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i3 = jSONObject.getInt("primaryColor");
                        if (i3 != 0) {
                            i3 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        Activity activity = ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).f2462a;
                        if (Build.VERSION.SDK_INT < 28) {
                            activity.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                        } else {
                            activity.setTaskDescription(L.k.c(string, i3));
                        }
                        kVar.d(null);
                        return;
                    } catch (JSONException e5) {
                        kVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                    try {
                        ((E) p3.f699g).C(P.q(p3, (JSONArray) obj));
                        kVar.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        kVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                    try {
                        int u2 = P.u(p3, (String) obj);
                        io.flutter.plugin.platform.e eVar2 = (io.flutter.plugin.platform.e) ((E) p3.f699g).f20f;
                        if (u2 == 1) {
                            i2 = 1798;
                        } else if (u2 == 2) {
                            i2 = 3846;
                        } else {
                            if (u2 != 3) {
                                if (u2 == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i2 = 1792;
                                }
                                kVar.d(null);
                                return;
                            }
                            i2 = 5894;
                        }
                        eVar2.f2466e = i2;
                        eVar2.b();
                        kVar.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        kVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((E) p3.f699g).f20f;
                    View decorView = eVar3.f2462a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar3, decorView));
                    kVar.d(null);
                    return;
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).b();
                    kVar.d(null);
                    return;
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).a(P.v(p3, (JSONObject) obj));
                        kVar.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        kVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    InterfaceC0189f interfaceC0189f = ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).f2464c;
                    if (interfaceC0189f != null) {
                        ((AbstractActivityC0187d) interfaceC0189f).h(booleanValue);
                    }
                    kVar.d(null);
                    return;
                case '\n':
                    ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).f2462a.finish();
                    kVar.d(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = EnumC0233e.a(str2);
                        } catch (NoSuchFieldException unused) {
                            kVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        y2 = ((E) p3.f699g).y(a2);
                        if (y2 != null) {
                            kVar.d(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", y2);
                        kVar.d(jSONObject2);
                        return;
                    }
                    a2 = null;
                    y2 = ((E) p3.f699g).y(a2);
                    if (y2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).f2462a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    kVar.d(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((E) p3.f699g).f20f).f2462a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z2);
                    kVar.d(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.e eVar4 = (io.flutter.plugin.platform.e) ((E) p3.f699g).f20f;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    eVar4.f2462a.startActivity(Intent.createChooser(intent, null));
                    kVar.d(null);
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

    private final void g(P p2, u0.k kVar) {
        P p3 = (P) this.f2915f;
        if (((C0278a) p3.f699g) == null) {
            return;
        }
        String str = (String) p2.f698f;
        Object obj = p2.f699g;
        str.getClass();
        if (!str.equals("ProcessText.processTextAction")) {
            if (!str.equals("ProcessText.queryTextActions")) {
                kVar.b();
                return;
            }
            try {
                kVar.d(((C0278a) p3.f699g).g());
                return;
            } catch (IllegalStateException e2) {
                kVar.a("error", e2.getMessage(), null);
                return;
            }
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((C0278a) p3.f699g).f((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), kVar);
        } catch (IllegalStateException e3) {
            kVar.a("error", e3.getMessage(), null);
        }
    }

    private final void i(P p2, u0.k kVar) {
        boolean z2;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        C0211b c0211b = (C0211b) this.f2915f;
        if (((P) c0211b.f2915f) == null) {
            return;
        }
        String str = (String) p2.f698f;
        str.getClass();
        z2 = true;
        switch (str) {
            case "Scribe.isFeatureAvailable":
                try {
                    P p3 = (P) c0211b.f2915f;
                    if (Build.VERSION.SDK_INT >= 34) {
                        isStylusHandwritingAvailable = ((InputMethodManager) p3.f698f).isStylusHandwritingAvailable();
                        if (isStylusHandwritingAvailable) {
                            kVar.d(Boolean.valueOf(z2));
                            break;
                        }
                    } else {
                        p3.getClass();
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
                        P p4 = (P) c0211b.f2915f;
                        ((InputMethodManager) p4.f698f).startStylusHandwriting((View) p4.f699g);
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
                        isStylusHandwritingAvailable2 = ((InputMethodManager) ((P) c0211b.f2915f).f698f).isStylusHandwritingAvailable();
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

    private final void j(P p2, u0.k kVar) {
        int i2;
        C0211b c0211b = (C0211b) this.f2915f;
        if (((C0291a) c0211b.f2915f) == null) {
            return;
        }
        String str = (String) p2.f698f;
        str.getClass();
        i2 = 2;
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a2 = ((C0291a) c0211b.f2915f).a();
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
                    ((C0291a) c0211b.f2915f).b(b(c0211b, ((Integer) p2.f699g).intValue()));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    kVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((C0291a) c0211b.f2915f).getClass();
                kVar.d(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                kVar.b();
                break;
        }
    }

    private final void k(P p2, u0.k kVar) {
        C0211b c0211b = (C0211b) this.f2915f;
        if (((h) c0211b.f2915f) == null) {
            return;
        }
        String str = (String) p2.f698f;
        Object obj = p2.f699g;
        str.getClass();
        if (!str.equals("SpellCheck.initiateSpellCheck")) {
            kVar.b();
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((h) c0211b.f2915f).a((String) arrayList.get(0), (String) arrayList.get(1), kVar);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
    }

    @Override // v0.InterfaceC0237b
    public void a(Object obj, P p2) {
        HashMap hashMap;
        HashMap hashMap2;
        C0008i c0008i = (C0008i) this.f2915f;
        if (((io.flutter.view.c) c0008i.f86h) == null) {
            p2.n(null);
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
                    i iVar = (i) ((io.flutter.view.c) c0008i.f86h).f2510a;
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
                    io.flutter.view.c cVar = (io.flutter.view.c) c0008i.f86h;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((i) cVar.f2510a).f2596a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) c0008i.f86h;
                    ((i) cVar2.f2510a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) c0008i.f86h;
                    ((i) cVar3.f2510a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) c0008i.f86h;
                    ((i) cVar4.f2510a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        p2.n(null);
    }

    public void c(String str) {
        InterfaceC0250a interfaceC0250a = (InterfaceC0250a) ((P) this.f2915f).f698f;
        if (P.f696i == null) {
            C0183A c0183a = new C0183A();
            c0183a.put("alias", 1010);
            c0183a.put("allScroll", 1013);
            c0183a.put("basic", 1000);
            c0183a.put("cell", 1006);
            c0183a.put("click", 1002);
            c0183a.put("contextMenu", 1001);
            c0183a.put("copy", 1011);
            c0183a.put("forbidden", 1012);
            c0183a.put("grab", 1020);
            c0183a.put("grabbing", 1021);
            c0183a.put("help", 1003);
            c0183a.put("move", 1013);
            c0183a.put("none", 0);
            c0183a.put("noDrop", 1012);
            c0183a.put("precise", 1007);
            c0183a.put("text", 1008);
            c0183a.put("resizeColumn", 1014);
            c0183a.put("resizeDown", 1015);
            c0183a.put("resizeUpLeft", 1016);
            c0183a.put("resizeDownRight", 1017);
            c0183a.put("resizeLeft", 1014);
            c0183a.put("resizeLeftRight", 1014);
            c0183a.put("resizeRight", 1014);
            c0183a.put("resizeRow", 1015);
            c0183a.put("resizeUp", 1015);
            c0183a.put("resizeUpDown", 1015);
            c0183a.put("resizeUpLeft", 1017);
            c0183a.put("resizeUpRight", 1016);
            c0183a.put("resizeUpLeftDownRight", 1017);
            c0183a.put("resizeUpRightDownLeft", 1016);
            c0183a.put("verticalText", 1009);
            c0183a.put("wait", 1004);
            c0183a.put("zoomIn", 1018);
            c0183a.put("zoomOut", 1019);
            P.f696i = c0183a;
        }
        interfaceC0250a.setPointerIcon(PointerIcon.getSystemIcon(((o) interfaceC0250a).getContext(), ((Integer) P.f696i.getOrDefault(str, 1000)).intValue()));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [o0.a] */
    public Bitmap d(ByteBuffer byteBuffer, C0214e c0214e) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: o0.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    C0211b c0211b = C0211b.this;
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    j jVar = (j) c0211b.f2915f;
                    if (jVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(jVar.f2817a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public String e(String str, String str2) {
        C0248b c0248b = (C0248b) this.f2915f;
        Context context = c0248b.f3100b;
        if (str2 != null) {
            Locale a2 = C0248b.a(str2);
            Configuration configuration = new Configuration(c0248b.f3100b.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = c0248b.f3100b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", c0248b.f3100b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // v0.k
    public void h(P p2, u0.k kVar) {
        char c2;
        char c3;
        char c4;
        Bundle bundle;
        switch (this.f2914e) {
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                P p3 = (P) this.f2915f;
                if (((C0211b) p3.f699g) == null) {
                    return;
                }
                String str = (String) p2.f698f;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    kVar.b();
                    return;
                }
                JSONObject jSONObject = (JSONObject) p2.f699g;
                try {
                    kVar.d(((C0211b) p3.f699g).e(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    return;
                } catch (JSONException e2) {
                    kVar.a("error", e2.getMessage(), null);
                    return;
                }
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                C0211b c0211b = (C0211b) this.f2915f;
                if (((C0211b) c0211b.f2915f) == null) {
                    return;
                }
                String str2 = (String) p2.f698f;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((C0211b) c0211b.f2915f).c((String) ((HashMap) p2.f699g).get("kind"));
                            kVar.d(Boolean.TRUE);
                        } catch (Exception e3) {
                            kVar.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e4) {
                    kVar.a("error", "Unhandled error: " + e4.getMessage(), null);
                    return;
                }
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
            case 11:
            case 15:
            case 17:
            default:
                P p4 = (P) this.f2915f;
                if (((io.flutter.plugin.editing.j) p4.f699g) == null) {
                    return;
                }
                String str3 = (String) p2.f698f;
                Object obj = p2.f699g;
                str3.getClass();
                switch (str3.hashCode()) {
                    case -1779068172:
                        if (str3.equals("TextInput.setPlatformViewClient")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1015421462:
                        if (str3.equals("TextInput.setEditingState")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -37561188:
                        if (str3.equals("TextInput.setClient")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 270476819:
                        if (str3.equals("TextInput.hide")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 270803918:
                        if (str3.equals("TextInput.show")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 649192816:
                        if (str3.equals("TextInput.sendAppPrivateCommand")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1204752139:
                        if (str3.equals("TextInput.setEditableSizeAndTransform")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1727570905:
                        if (str3.equals("TextInput.finishAutofillContext")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1904427655:
                        if (str3.equals("TextInput.clearClient")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2113369584:
                        if (str3.equals("TextInput.requestAutofill")) {
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
                            JSONObject jSONObject2 = (JSONObject) obj;
                            int i2 = jSONObject2.getInt("platformViewId");
                            boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                            l lVar = ((io.flutter.plugin.editing.j) p4.f699g).f2436a;
                            View view = lVar.f2440a;
                            if (optBoolean) {
                                view.requestFocus();
                                lVar.f2444e = new C0056m(3, i2);
                                lVar.f2441b.restartInput(view);
                                lVar.f2448i = false;
                            } else {
                                lVar.f2444e = new C0056m(4, i2);
                                lVar.f2449j = null;
                            }
                            kVar.d(null);
                            return;
                        } catch (JSONException e5) {
                            kVar.a("error", e5.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.j) p4.f699g).c(q.a((JSONObject) obj));
                            kVar.d(null);
                            return;
                        } catch (JSONException e6) {
                            kVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((io.flutter.plugin.editing.j) p4.f699g).a(jSONArray.getInt(0), u0.o.a(jSONArray.getJSONObject(1)));
                            kVar.d(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e7) {
                            kVar.a("error", e7.getMessage(), null);
                            return;
                        }
                    case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                        l lVar2 = ((io.flutter.plugin.editing.j) p4.f699g).f2436a;
                        if (lVar2.f2444e.f756b == 4) {
                            lVar2.c();
                        } else {
                            View view2 = lVar2.f2440a;
                            lVar2.c();
                            lVar2.f2441b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                        }
                        kVar.d(null);
                        return;
                    case H.k.LONG_FIELD_NUMBER /* 4 */:
                        l lVar3 = ((io.flutter.plugin.editing.j) p4.f699g).f2436a;
                        InputMethodManager inputMethodManager = lVar3.f2441b;
                        View view3 = lVar3.f2440a;
                        u0.o oVar = lVar3.f2445f;
                        if (oVar == null || oVar.f3044g.f3051a != 11) {
                            view3.requestFocus();
                            inputMethodManager.showSoftInput(view3, 0);
                        } else {
                            lVar3.c();
                            inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                        }
                        kVar.d(null);
                        return;
                    case H.k.STRING_FIELD_NUMBER /* 5 */:
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
                            l lVar4 = ((io.flutter.plugin.editing.j) p4.f699g).f2436a;
                            lVar4.f2441b.sendAppPrivateCommand(lVar4.f2440a, string, bundle);
                            kVar.d(null);
                            return;
                        } catch (JSONException e8) {
                            kVar.a("error", e8.getMessage(), null);
                            return;
                        }
                    case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        try {
                            JSONObject jSONObject4 = (JSONObject) obj;
                            double d2 = jSONObject4.getDouble("width");
                            double d3 = jSONObject4.getDouble("height");
                            JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i3 = 0; i3 < 16; i3++) {
                                dArr[i3] = jSONArray2.getDouble(i3);
                            }
                            ((io.flutter.plugin.editing.j) p4.f699g).b(d2, d3, dArr);
                            kVar.d(null);
                            return;
                        } catch (JSONException e9) {
                            kVar.a("error", e9.getMessage(), null);
                            return;
                        }
                    case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) p4.f699g;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = jVar.f2436a.f2442c;
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
                        kVar.d(null);
                        return;
                    case H.k.BYTES_FIELD_NUMBER /* 8 */:
                        l lVar5 = ((io.flutter.plugin.editing.j) p4.f699g).f2436a;
                        View view4 = lVar5.f2440a;
                        if (lVar5.f2444e.f756b != 3) {
                            lVar5.f2447h.e(lVar5);
                            lVar5.c();
                            lVar5.f2445f = null;
                            lVar5.d(null);
                            lVar5.f2444e = new C0056m(1, 0);
                            lVar5.f2452m = null;
                            Field field = x.f3160a;
                            Q a2 = AbstractC0273q.a(view4);
                            if (a2 != null && !a2.f3130a.m(8)) {
                                lVar5.f2441b.restartInput(view4);
                            }
                        }
                        kVar.d(null);
                        return;
                    case '\t':
                        l lVar6 = ((io.flutter.plugin.editing.j) p4.f699g).f2436a;
                        View view5 = lVar6.f2440a;
                        if (Build.VERSION.SDK_INT >= 26 && lVar6.f2442c != null && lVar6.f2446g != null) {
                            String str4 = (String) lVar6.f2445f.f3047j.f409a;
                            int[] iArr = new int[2];
                            view5.getLocationOnScreen(iArr);
                            Rect rect = new Rect(lVar6.f2452m);
                            rect.offset(iArr[0], iArr[1]);
                            lVar6.f2442c.notifyViewEntered(view5, str4.hashCode(), rect);
                        }
                        kVar.d(null);
                        return;
                    default:
                        kVar.b();
                        return;
                }
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                f(p2, kVar);
                return;
            case H.k.BYTES_FIELD_NUMBER /* 8 */:
                C0211b c0211b2 = (C0211b) this.f2915f;
                if (((u0.j) c0211b2.f2915f) == null) {
                    return;
                }
                String str5 = (String) p2.f698f;
                Object obj2 = p2.f699g;
                str5.getClass();
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
                            if (z2) {
                                ((u0.j) c0211b2.f2915f).t(new C0172t(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                throw null;
                            }
                            ((u0.j) c0211b2.f2915f).i(new C0172t(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                            throw null;
                        } catch (IllegalStateException e10) {
                            kVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            ((u0.j) c0211b2.f2915f).c(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e11) {
                            kVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                        Map map3 = (Map) obj2;
                        try {
                            ((u0.j) c0211b2.f2915f).j(new u0.i(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new l0.i());
                            return;
                        } catch (IllegalStateException e12) {
                            kVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                        try {
                            ((u0.j) c0211b2.f2915f).k(((Integer) obj2).intValue());
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e13) {
                            kVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case H.k.LONG_FIELD_NUMBER /* 4 */:
                        try {
                            ((u0.j) c0211b2.f2915f).b(((Boolean) obj2).booleanValue());
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e14) {
                            kVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case H.k.STRING_FIELD_NUMBER /* 5 */:
                        List list = (List) obj2;
                        try {
                            ((u0.j) c0211b2.f2915f).r(new u0.h(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e15) {
                            kVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        Map map4 = (Map) obj2;
                        try {
                            ((u0.j) c0211b2.f2915f).d(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e16) {
                            kVar.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        try {
                            ((u0.j) c0211b2.f2915f).s(((Integer) ((Map) obj2).get("id")).intValue());
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e17) {
                            kVar.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        kVar.b();
                        return;
                }
            case 9:
                C0211b c0211b3 = (C0211b) this.f2915f;
                if (((E) c0211b3.f2915f) == null) {
                    return;
                }
                String str6 = (String) p2.f698f;
                Object obj3 = p2.f699g;
                str6.getClass();
                switch (str6.hashCode()) {
                    case -1352294148:
                        if (str6.equals("create")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -756050293:
                        if (str6.equals("clearFocus")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 110550847:
                        if (str6.equals("touch")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 576796989:
                        if (str6.equals("setDirection")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 751366695:
                        if (str6.equals("isSurfaceControlEnabled")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1671767583:
                        if (str6.equals("dispose")) {
                            c3 = 5;
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
                        Map map5 = (Map) obj3;
                        if (map5.containsKey("params")) {
                            ByteBuffer.wrap((byte[]) map5.get("params"));
                        }
                        try {
                            ((Integer) map5.get("id")).getClass();
                            String str7 = (String) map5.get("viewType");
                            ((Integer) map5.get("direction")).getClass();
                            if (((io.flutter.plugin.platform.k) ((E) c0211b3.f2915f).f20f).f2467e.f2816a.get(str7) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str7);
                        } catch (IllegalStateException e18) {
                            kVar.a("error", Log.getStackTraceString(e18), null);
                            return;
                        }
                    case 1:
                        int intValue = ((Integer) obj3).intValue();
                        try {
                            if (((io.flutter.plugin.platform.k) ((E) c0211b3.f2915f).f20f).f2473k.get(intValue) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e19) {
                            kVar.a("error", Log.getStackTraceString(e19), null);
                            return;
                        }
                    case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                        List list2 = (List) obj3;
                        int intValue2 = ((Integer) list2.get(0)).intValue();
                        ((Integer) list2.get(3)).getClass();
                        ((Integer) list2.get(4)).getClass();
                        list2.get(5);
                        list2.get(6);
                        ((Integer) list2.get(7)).getClass();
                        ((Integer) list2.get(8)).getClass();
                        ((Double) list2.get(9)).getClass();
                        ((Double) list2.get(10)).getClass();
                        ((Integer) list2.get(11)).getClass();
                        ((Integer) list2.get(12)).getClass();
                        ((Integer) list2.get(13)).getClass();
                        ((Integer) list2.get(14)).getClass();
                        ((Number) list2.get(15)).longValue();
                        try {
                            E e20 = (E) c0211b3.f2915f;
                            e20.getClass();
                            io.flutter.plugin.platform.k kVar2 = (io.flutter.plugin.platform.k) e20.f20f;
                            float f2 = kVar2.f2468f.getResources().getDisplayMetrics().density;
                            if (kVar2.f2473k.get(intValue2) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e21) {
                            kVar.a("error", Log.getStackTraceString(e21), null);
                            return;
                        }
                    case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                        Map map6 = (Map) obj3;
                        int intValue3 = ((Integer) map6.get("id")).intValue();
                        ((Integer) map6.get("direction")).getClass();
                        try {
                            if (((io.flutter.plugin.platform.k) ((E) c0211b3.f2915f).f20f).f2473k.get(intValue3) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e22) {
                            kVar.a("error", Log.getStackTraceString(e22), null);
                            return;
                        }
                    case H.k.LONG_FIELD_NUMBER /* 4 */:
                        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.k) ((E) c0211b3.f2915f).f20f).f2470h;
                        kVar.d(Boolean.valueOf(flutterJNI == null ? false : flutterJNI.IsSurfaceControlEnabled()));
                        return;
                    case H.k.STRING_FIELD_NUMBER /* 5 */:
                        try {
                            ((E) c0211b3.f2915f).s(((Integer) ((Map) obj3).get("id")).intValue());
                            kVar.d(null);
                            return;
                        } catch (IllegalStateException e23) {
                            kVar.a("error", Log.getStackTraceString(e23), null);
                            return;
                        }
                    default:
                        kVar.b();
                        return;
                }
            case 12:
                g(p2, kVar);
                return;
            case 13:
                u0.l lVar7 = (u0.l) this.f2915f;
                String str8 = (String) p2.f698f;
                Object obj4 = p2.f699g;
                str8.getClass();
                if (!str8.equals("get")) {
                    if (!str8.equals("put")) {
                        kVar.b();
                        return;
                    } else {
                        lVar7.f3028b = (byte[]) obj4;
                        kVar.d(null);
                        return;
                    }
                }
                lVar7.f3032f = true;
                if (lVar7.f3031e || !lVar7.f3027a) {
                    kVar.d(u0.l.a(lVar7.f3028b));
                    return;
                } else {
                    lVar7.f3030d = kVar;
                    return;
                }
            case 14:
                i(p2, kVar);
                return;
            case 16:
                j(p2, kVar);
                return;
            case 18:
                k(p2, kVar);
                return;
        }
    }

    public /* synthetic */ C0211b(int i2, Object obj) {
        this.f2914e = i2;
        this.f2915f = obj;
    }

    public C0211b(m0.b bVar, int i2) {
        this.f2914e = i2;
        switch (i2) {
            case 10:
                new C0008i(bVar, "flutter/platform_views_2", v0.o.f3092a, 12).I(new C0211b(9, this));
                break;
            case 11:
                new C0008i(bVar, "flutter/platform_views", v0.o.f3092a, 12).I(new C0211b(8, this));
                break;
            case 15:
                new C0008i(bVar, "flutter/scribe", C0244i.f3088a, 12).I(new C0211b(14, this));
                break;
            case 17:
                new C0008i(bVar, "flutter/sensitivecontent", v0.o.f3092a, 12).I(new C0211b(16, this));
                break;
            case 19:
                new C0008i(bVar, "flutter/spellcheck", v0.o.f3092a, 12).I(new C0211b(18, this));
                break;
            default:
                new C0008i(bVar, "flutter/mousecursor", v0.o.f3092a, 12).I(new C0211b(5, this));
                break;
        }
    }

    public C0211b(InterfaceC0241f interfaceC0241f) {
        this.f2914e = 3;
        new C0008i(interfaceC0241f, "flutter/keyboard", v0.o.f3092a, 12).I(new P(this));
    }
}
