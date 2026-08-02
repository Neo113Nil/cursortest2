package n0;

import A.AbstractC0004e;
import A.C0010k;
import B0.C0023a;
import B0.C0031i;
import I.C0079n;
import P.O;
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
import io.flutter.plugin.platform.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m0.AbstractActivityC0264d;
import m0.B;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.o;
import w0.InterfaceC0316b;
import w0.InterfaceC0318d;
import w0.InterfaceC0319e;
import w0.InterfaceC0320f;
import w0.p;
import w0.q;
import x0.C0332a;
import y0.InterfaceC0334a;
import z0.C0335a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0318d, InterfaceC0320f, InterfaceC0316b, w0.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3283e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3284f;

    public /* synthetic */ d(int i2) {
        this.f3283e = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0177 A[Catch: JSONException -> 0x002d, TryCatch #11 {JSONException -> 0x002d, blocks: (B:7:0x0014, B:8:0x001d, B:13:0x00d1, B:15:0x00d6, B:17:0x0105, B:20:0x0129, B:22:0x011c, B:25:0x0123, B:26:0x0138, B:28:0x015c, B:38:0x0160, B:31:0x016d, B:33:0x0177, B:35:0x0184, B:40:0x0165, B:41:0x0189, B:43:0x019d, B:45:0x01af, B:46:0x01b2, B:48:0x01d9, B:50:0x01e9, B:78:0x02cc, B:53:0x02e6, B:55:0x02f6, B:56:0x0307, B:59:0x0304, B:96:0x01d0, B:122:0x023f, B:103:0x025d, B:75:0x02a1, B:89:0x02c4, B:82:0x02de, B:61:0x030c, B:124:0x0022, B:127:0x0030, B:130:0x003b, B:133:0x0047, B:136:0x0053, B:139:0x005e, B:142:0x0069, B:145:0x0073, B:148:0x007d, B:151:0x0087, B:154:0x0091, B:157:0x009b, B:160:0x00a6, B:163:0x00b1, B:166:0x00bc, B:64:0x0266, B:66:0x0270, B:67:0x0273, B:69:0x0289, B:70:0x029b, B:73:0x0292), top: B:6:0x0014, inners: #2, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0184 A[Catch: JSONException -> 0x002d, TryCatch #11 {JSONException -> 0x002d, blocks: (B:7:0x0014, B:8:0x001d, B:13:0x00d1, B:15:0x00d6, B:17:0x0105, B:20:0x0129, B:22:0x011c, B:25:0x0123, B:26:0x0138, B:28:0x015c, B:38:0x0160, B:31:0x016d, B:33:0x0177, B:35:0x0184, B:40:0x0165, B:41:0x0189, B:43:0x019d, B:45:0x01af, B:46:0x01b2, B:48:0x01d9, B:50:0x01e9, B:78:0x02cc, B:53:0x02e6, B:55:0x02f6, B:56:0x0307, B:59:0x0304, B:96:0x01d0, B:122:0x023f, B:103:0x025d, B:75:0x02a1, B:89:0x02c4, B:82:0x02de, B:61:0x030c, B:124:0x0022, B:127:0x0030, B:130:0x003b, B:133:0x0047, B:136:0x0053, B:139:0x005e, B:142:0x0069, B:145:0x0073, B:148:0x007d, B:151:0x0087, B:154:0x0091, B:157:0x009b, B:160:0x00a6, B:163:0x00b1, B:166:0x00bc, B:64:0x0266, B:66:0x0270, B:67:0x0273, B:69:0x0289, B:70:0x029b, B:73:0x0292), top: B:6:0x0014, inners: #2, #6, #7, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void j(O o2, v0.i iVar) {
        char c2;
        int i2;
        v0.d a2;
        CharSequence f2;
        ClipDescription primaryClipDescription;
        O o3 = (O) this.f3284f;
        if (((n) o3.f876g) == null) {
            return;
        }
        String str = (String) o2.f875f;
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
            Object obj = o2.f876g;
            switch (c2) {
                case 0:
                    try {
                        int c3 = A0.b.c((String) obj);
                        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a;
                        if (c3 == 1) {
                            fVar.f2629a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            fVar.getClass();
                        }
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        iVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((n) o3.f876g).l(A0.b.b((String) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        iVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a).f2629a.setRequestedOrientation(O.c(o3, (JSONArray) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        iVar.a("error", e4.getMessage(), null);
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
                        n nVar = (n) o3.f876g;
                        int i4 = Build.VERSION.SDK_INT;
                        AbstractActivityC0264d abstractActivityC0264d = ((io.flutter.plugin.platform.f) nVar.f2653a).f2629a;
                        if (i4 < 28) {
                            abstractActivityC0264d.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                        } else {
                            abstractActivityC0264d.setTaskDescription(AbstractC0004e.d(string, i3));
                        }
                        iVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        iVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    try {
                        ((n) o3.f876g).k(O.f(o3, (JSONArray) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        iVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    try {
                        int g2 = O.g(o3, (String) obj);
                        io.flutter.plugin.platform.f fVar2 = (io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a;
                        fVar2.getClass();
                        if (g2 == 1) {
                            i2 = 1798;
                        } else if (g2 == 2) {
                            i2 = 3846;
                        } else {
                            if (g2 != 3) {
                                if (g2 == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i2 = 1792;
                                }
                                iVar.c(null);
                                return;
                            }
                            i2 = 5894;
                        }
                        fVar2.f2633e = i2;
                        fVar2.b();
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        iVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    io.flutter.plugin.platform.f fVar3 = (io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a;
                    View decorView = fVar3.f2629a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.e(fVar3, decorView));
                    iVar.c(null);
                    return;
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a).b();
                    iVar.c(null);
                    return;
                case K.k.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        ((io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a).a(O.h(o3, (JSONObject) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        iVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0264d abstractActivityC0264d2 = ((io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a).f2631c;
                    if (abstractActivityC0264d2 != null) {
                        abstractActivityC0264d2.h(booleanValue);
                    }
                    iVar.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.f fVar4 = (io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a;
                    AbstractActivityC0264d abstractActivityC0264d3 = fVar4.f2631c;
                    fVar4.f2629a.finish();
                    iVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = v0.d.a(str2);
                        } catch (NoSuchFieldException unused) {
                            iVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        f2 = ((n) o3.f876g).f(a2);
                        if (f2 != null) {
                            iVar.c(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", f2);
                        iVar.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    f2 = ((n) o3.f876g).f(a2);
                    if (f2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a).f2629a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    iVar.c(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a).f2629a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z2);
                    iVar.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.f fVar5 = (io.flutter.plugin.platform.f) ((n) o3.f876g).f2653a;
                    fVar5.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    fVar5.f2629a.startActivity(Intent.createChooser(intent, null));
                    iVar.c(null);
                    return;
                default:
                    iVar.b();
                    return;
            }
        } catch (JSONException e9) {
            iVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        iVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    @Override // w0.InterfaceC0320f
    public void a(String str, InterfaceC0318d interfaceC0318d, C0023a c0023a) {
        ((o0.j) this.f3284f).a(str, interfaceC0318d, c0023a);
    }

    @Override // w0.InterfaceC0320f
    public C0023a b() {
        return ((o0.j) this.f3284f).e(new w0.i());
    }

    @Override // w0.InterfaceC0320f
    public void c(String str, ByteBuffer byteBuffer, InterfaceC0319e interfaceC0319e) {
        ((o0.j) this.f3284f).c(str, byteBuffer, interfaceC0319e);
    }

    @Override // w0.InterfaceC0318d
    public void d(ByteBuffer byteBuffer, o0.g gVar) {
        q.f3566b.getClass();
        q.c(byteBuffer);
        ((o0.b) this.f3284f).getClass();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // w0.l
    public void e(O o2, v0.i iVar) {
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
        switch (this.f3283e) {
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((t.k) this.f3284f).getClass();
                return;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 10:
            case 16:
            default:
                O o3 = (O) this.f3284f;
                if (((B.m) o3.f876g) == null) {
                    return;
                }
                String str = (String) o2.f875f;
                str.getClass();
                Object obj = o2.f876g;
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
                            io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) ((B.m) o3.f876g).f78f;
                            if (optBoolean) {
                                View view = jVar.f2596a;
                                view.requestFocus();
                                jVar.f2600e = new C0010k(3, i2);
                                jVar.f2597b.restartInput(view);
                                jVar.f2604i = false;
                            } else {
                                jVar.getClass();
                                jVar.f2600e = new C0010k(4, i2);
                                jVar.f2605j = null;
                            }
                            iVar.c(null);
                            return;
                        } catch (JSONException e2) {
                            iVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((B.m) o3.f876g).r(o.a((JSONObject) obj));
                            iVar.c(null);
                            return;
                        } catch (JSONException e3) {
                            iVar.a("error", e3.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((B.m) o3.f876g).p(jSONArray.getInt(0), v0.m.a(jSONArray.getJSONObject(1)));
                            iVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e4) {
                            iVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    case 3:
                        io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) ((B.m) o3.f876g).f78f;
                        if (jVar2.f2600e.f48b == 4) {
                            jVar2.d();
                        } else {
                            jVar2.d();
                            jVar2.f2597b.hideSoftInputFromWindow(jVar2.f2596a.getApplicationWindowToken(), 0);
                        }
                        iVar.c(null);
                        return;
                    case K.k.LONG_FIELD_NUMBER /* 4 */:
                        io.flutter.plugin.editing.j jVar3 = (io.flutter.plugin.editing.j) ((B.m) o3.f876g).f78f;
                        View view2 = jVar3.f2596a;
                        v0.m mVar = jVar3.f2601f;
                        InputMethodManager inputMethodManager = jVar3.f2597b;
                        if (mVar == null || mVar.f3534g.f3540a != 11) {
                            view2.requestFocus();
                            inputMethodManager.showSoftInput(view2, 0);
                        } else {
                            jVar3.d();
                            inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                        }
                        iVar.c(null);
                        return;
                    case K.k.STRING_FIELD_NUMBER /* 5 */:
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
                            io.flutter.plugin.editing.j jVar4 = (io.flutter.plugin.editing.j) ((B.m) o3.f876g).f78f;
                            jVar4.f2597b.sendAppPrivateCommand(jVar4.f2596a, string, bundle);
                            iVar.c(null);
                            return;
                        } catch (JSONException e5) {
                            iVar.a("error", e5.getMessage(), null);
                            return;
                        }
                    case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d2 = jSONObject3.getDouble("width");
                            double d3 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i3 = 0; i3 < 16; i3++) {
                                dArr[i3] = jSONArray2.getDouble(i3);
                            }
                            ((B.m) o3.f876g).q(d2, d3, dArr);
                            iVar.c(null);
                            return;
                        } catch (JSONException e6) {
                            iVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        B.m mVar2 = (B.m) o3.f876g;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = ((io.flutter.plugin.editing.j) mVar2.f78f).f2598c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            mVar2.getClass();
                        }
                        iVar.c(null);
                        return;
                    case K.k.BYTES_FIELD_NUMBER /* 8 */:
                        io.flutter.plugin.editing.j jVar5 = (io.flutter.plugin.editing.j) ((B.m) o3.f876g).f78f;
                        if (jVar5.f2600e.f48b != 3) {
                            jVar5.f2603h.e(jVar5);
                            jVar5.d();
                            jVar5.f2601f = null;
                            jVar5.e(null);
                            jVar5.f2600e = new C0010k(1, 0);
                            jVar5.f2607l = null;
                        }
                        iVar.c(null);
                        return;
                    case '\t':
                        B.m mVar3 = (B.m) o3.f876g;
                        int i4 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.j jVar6 = (io.flutter.plugin.editing.j) mVar3.f78f;
                        if (i4 < 26) {
                            jVar6.getClass();
                        } else if (jVar6.f2598c != null && jVar6.f2602g != null) {
                            String str2 = (String) jVar6.f2601f.f3537j.f689e;
                            int[] iArr = new int[2];
                            View view3 = jVar6.f2596a;
                            view3.getLocationOnScreen(iArr);
                            Rect rect = new Rect(jVar6.f2607l);
                            rect.offset(iArr[0], iArr[1]);
                            jVar6.f2598c.notifyViewEntered(view3, str2.hashCode(), rect);
                        }
                        iVar.c(null);
                        return;
                    default:
                        iVar.b();
                        return;
                }
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                O o4 = (O) this.f3284f;
                if (((d) o4.f876g) == null) {
                    return;
                }
                String str3 = (String) o2.f875f;
                str3.getClass();
                if (!str3.equals("Localization.getStringResource")) {
                    iVar.b();
                    return;
                }
                JSONObject jSONObject4 = (JSONObject) o2.f876g;
                try {
                    iVar.c(((d) o4.f876g).i(jSONObject4.getString("key"), jSONObject4.has("locale") ? jSONObject4.getString("locale") : null));
                    return;
                } catch (JSONException e7) {
                    iVar.a("error", e7.getMessage(), null);
                    return;
                }
            case 9:
                d dVar = (d) this.f3284f;
                if (((d) dVar.f3284f) == null) {
                    return;
                }
                String str4 = (String) o2.f875f;
                try {
                    if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                        try {
                            ((d) dVar.f3284f).h((String) ((HashMap) o2.f876g).get("kind"));
                            iVar.c(Boolean.TRUE);
                        } catch (Exception e8) {
                            iVar.a("error", "Error when setting cursors: " + e8.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e9) {
                    iVar.a("error", "Unhandled error: " + e9.getMessage(), null);
                    return;
                }
            case 11:
                j(o2, iVar);
                return;
            case 12:
                O o5 = (O) this.f3284f;
                if (((n) o5.f876g) == null) {
                    return;
                }
                String str5 = (String) o2.f875f;
                str5.getClass();
                Object obj2 = o2.f876g;
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
                        boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (z3) {
                                v0.f fVar = new v0.f(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap);
                                io.flutter.plugin.platform.o oVar = (io.flutter.plugin.platform.o) ((n) o5.f876g).f2653a;
                                oVar.getClass();
                                io.flutter.plugin.platform.o.d(19);
                                io.flutter.plugin.platform.o.a(oVar, fVar);
                                oVar.b(fVar, false);
                                io.flutter.plugin.platform.o.d(19);
                                iVar.c(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                c5 = 1;
                            }
                            long d4 = ((n) o5.f876g).d(new v0.f(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), c5 != 0 ? 2 : 1, wrap));
                            if (d4 != -2) {
                                iVar.c(Long.valueOf(d4));
                                return;
                            } else {
                                if (c5 == 0) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                iVar.c(null);
                                return;
                            }
                        } catch (IllegalStateException e10) {
                            iVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            ((n) o5.f876g).g(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            iVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        try {
                            ((n) o5.f876g).i(new v0.g(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new C0.f(9, iVar));
                            return;
                        } catch (IllegalStateException e12) {
                            iVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 3:
                        try {
                            ((n) o5.f876g).c(((Integer) obj2).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e13) {
                            iVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case K.k.LONG_FIELD_NUMBER /* 4 */:
                        try {
                            ((io.flutter.plugin.platform.o) ((n) o5.f876g).f2653a).f2671q = ((Boolean) obj2).booleanValue();
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e14) {
                            iVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case K.k.STRING_FIELD_NUMBER /* 5 */:
                        List list = (List) obj2;
                        try {
                            ((n) o5.f876g).h(new v0.h(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            iVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        Map map4 = (Map) obj2;
                        try {
                            ((n) o5.f876g).j(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            iVar.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        try {
                            ((n) o5.f876g).e(((Integer) ((Map) obj2).get("id")).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e17) {
                            iVar.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        iVar.b();
                        return;
                }
            case 13:
                O o6 = (O) this.f3284f;
                if (((C0335a) o6.f876g) == null) {
                    return;
                }
                String str6 = (String) o2.f875f;
                Object obj3 = o2.f876g;
                str6.getClass();
                if (str6.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((C0335a) o6.f876g).e((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), iVar);
                        return;
                    } catch (IllegalStateException e18) {
                        iVar.a("error", e18.getMessage(), null);
                        return;
                    }
                }
                if (!str6.equals("ProcessText.queryTextActions")) {
                    iVar.b();
                    return;
                }
                try {
                    iVar.c(((C0335a) o6.f876g).f());
                    return;
                } catch (IllegalStateException e19) {
                    iVar.a("error", e19.getMessage(), null);
                    return;
                }
            case 14:
                String str7 = (String) o2.f875f;
                str7.getClass();
                v0.j jVar7 = (v0.j) this.f3284f;
                if (!str7.equals("get")) {
                    if (!str7.equals("put")) {
                        iVar.b();
                        return;
                    } else {
                        jVar7.f3518b = (byte[]) o2.f876g;
                        iVar.c(null);
                        return;
                    }
                }
                jVar7.f3522f = true;
                if (jVar7.f3521e || !jVar7.f3517a) {
                    iVar.c(v0.j.a(jVar7.f3518b));
                    return;
                } else {
                    jVar7.f3520d = iVar;
                    return;
                }
            case 15:
                d dVar2 = (d) this.f3284f;
                if (((O) dVar2.f3284f) == null) {
                    return;
                }
                String str8 = (String) o2.f875f;
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
                            O o7 = (O) dVar2.f3284f;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) o7.f875f).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    z2 = true;
                                }
                            } else {
                                o7.getClass();
                            }
                            iVar.c(Boolean.valueOf(z2));
                            return;
                        } catch (IllegalStateException e20) {
                            iVar.a("error", e20.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            iVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            O o8 = (O) dVar2.f3284f;
                            ((InputMethodManager) o8.f875f).startStylusHandwriting((View) o8.f876g);
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e21) {
                            iVar.a("error", e21.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            iVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((O) dVar2.f3284f).f875f).isStylusHandwritingAvailable();
                            iVar.c(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e22) {
                            iVar.a("error", e22.getMessage(), null);
                            return;
                        }
                    default:
                        iVar.b();
                        return;
                }
            case 17:
                d dVar3 = (d) this.f3284f;
                if (((io.flutter.plugin.editing.g) dVar3.f3284f) == null) {
                    return;
                }
                String str9 = (String) o2.f875f;
                Object obj4 = o2.f876g;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    iVar.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((io.flutter.plugin.editing.g) dVar3.f3284f).a((String) arrayList2.get(0), (String) arrayList2.get(1), iVar);
                    return;
                } catch (IllegalStateException e23) {
                    iVar.a("error", e23.getMessage(), null);
                    return;
                }
        }
    }

    @Override // w0.InterfaceC0320f
    public void f(String str, InterfaceC0318d interfaceC0318d) {
        ((o0.j) this.f3284f).a(str, interfaceC0318d, null);
    }

    @Override // w0.InterfaceC0316b
    public void g(Object obj, O o2) {
        HashMap hashMap;
        HashMap hashMap2;
        C0031i c0031i = (C0031i) this.f3284f;
        if (((io.flutter.view.b) c0031i.f156h) == null) {
            o2.b(null);
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
                    io.flutter.view.b bVar = (io.flutter.view.b) c0031i.f156h;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.k kVar = (io.flutter.view.k) bVar.f2703a;
                        AccessibilityEvent d2 = kVar.d(0, 32);
                        d2.getText().add(str2);
                        kVar.h(d2);
                        break;
                    } else {
                        bVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    ((io.flutter.view.k) ((io.flutter.view.b) c0031i.f156h).f2703a).f2789a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) c0031i.f156h;
                    ((io.flutter.view.k) bVar2.f2703a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) c0031i.f156h;
                    ((io.flutter.view.k) bVar3.f2703a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) c0031i.f156h;
                    ((io.flutter.view.k) bVar4.f2703a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        o2.b(null);
    }

    public void h(String str) {
        Object orDefault;
        PointerIcon systemIcon;
        O o2 = (O) this.f3284f;
        InterfaceC0334a interfaceC0334a = (InterfaceC0334a) o2.f875f;
        if (O.f873i == null) {
            B b2 = new B();
            b2.put("alias", 1010);
            b2.put("allScroll", 1013);
            b2.put("basic", 1000);
            b2.put("cell", 1006);
            b2.put("click", 1002);
            b2.put("contextMenu", 1001);
            b2.put("copy", 1011);
            b2.put("forbidden", 1012);
            b2.put("grab", 1020);
            b2.put("grabbing", 1021);
            b2.put("help", 1003);
            b2.put("move", 1013);
            b2.put("none", 0);
            b2.put("noDrop", 1012);
            b2.put("precise", 1007);
            b2.put("text", 1008);
            b2.put("resizeColumn", 1014);
            b2.put("resizeDown", 1015);
            b2.put("resizeUpLeft", 1016);
            b2.put("resizeDownRight", 1017);
            b2.put("resizeLeft", 1014);
            b2.put("resizeLeftRight", 1014);
            b2.put("resizeRight", 1014);
            b2.put("resizeRow", 1015);
            b2.put("resizeUp", 1015);
            b2.put("resizeUpDown", 1015);
            b2.put("resizeUpLeft", 1017);
            b2.put("resizeUpRight", 1016);
            b2.put("resizeUpLeftDownRight", 1017);
            b2.put("resizeUpRightDownLeft", 1016);
            b2.put("verticalText", 1009);
            b2.put("wait", 1004);
            b2.put("zoomIn", 1018);
            b2.put("zoomOut", 1019);
            O.f873i = b2;
        }
        orDefault = O.f873i.getOrDefault(str, 1000);
        systemIcon = PointerIcon.getSystemIcon(((m0.q) ((InterfaceC0334a) o2.f875f)).getContext(), ((Integer) orDefault).intValue());
        interfaceC0334a.setPointerIcon(systemIcon);
    }

    public String i(String str, String str2) {
        C0332a c0332a = (C0332a) this.f3284f;
        Context context = c0332a.f3590b;
        AbstractActivityC0264d abstractActivityC0264d = c0332a.f3590b;
        if (str2 != null) {
            Locale a2 = C0332a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0264d.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = abstractActivityC0264d.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0264d.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public /* synthetic */ d(int i2, Object obj) {
        this.f3283e = i2;
        this.f3284f = obj;
    }

    public d(o0.b bVar, int i2) {
        this.f3283e = i2;
        switch (i2) {
            case 16:
                new C0079n(bVar, "flutter/scribe", w0.i.f3556a, null).j(new d(15, this));
                break;
            case 17:
            default:
                new C0079n(bVar, "flutter/mousecursor", p.f3564a, null).j(new d(9, this));
                break;
            case 18:
                new C0079n(bVar, "flutter/spellcheck", p.f3564a, null).j(new d(17, this));
                break;
        }
    }

    public d(InterfaceC0320f interfaceC0320f) {
        this.f3283e = 7;
        new C0079n(interfaceC0320f, "flutter/keyboard", p.f3564a, null).j(new O(this));
    }
}
