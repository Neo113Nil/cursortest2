package J1;

import D.AbstractC0109w;
import D.C0102o;
import D.D;
import D.Y;
import D3.AbstractActivityC0117e;
import D3.InterfaceC0120h;
import D3.L;
import D3.M;
import D3.N;
import K5.i;
import N3.j;
import N3.n;
import N3.p;
import O3.m;
import T0.C0174i;
import T0.G;
import V5.g;
import a6.d;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.t;
import com.onesignal.debug.internal.crash.r;
import com.onesignal.inAppMessages.internal.display.impl.a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.k;
import j5.InterfaceC0438a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import u0.C0675e;
import u0.C0682l;
import u0.C0689s;

/* loaded from: classes.dex */
public class c implements L, F0.b, i, K5.c, O3.i, G {

    /* renamed from: h, reason: collision with root package name */
    public static volatile c f1286h;

    /* renamed from: i, reason: collision with root package name */
    public static c f1287i;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1288f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1289g;

    public /* synthetic */ c(int i7, Object obj) {
        this.f1288f = i7;
        this.f1289g = obj;
    }

    public static boolean n(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    private final void r(C0675e c0675e, j jVar) {
        Object obj;
        M m4 = (M) this.f1289g;
        if (((d) m4.f401g) == null) {
            return;
        }
        String str = (String) c0675e.f5975b;
        obj = c0675e.f5976c;
        str.getClass();
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
                    if (((k) ((d) m4.f401g).f3172f).f4561f.f659a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e4) {
                    jVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((Integer) obj).intValue();
                try {
                    if (((k) ((d) m4.f401g).f3172f).f4567l.get(intValue) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    jVar.d(null);
                    return;
                } catch (IllegalStateException e7) {
                    jVar.a("error", Log.getStackTraceString(e7), null);
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
                    d dVar = (d) m4.f401g;
                    dVar.getClass();
                    k kVar = (k) dVar.f3172f;
                    float f7 = kVar.f4562g.getResources().getDisplayMetrics().density;
                    if (kVar.f4567l.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    jVar.d(null);
                    return;
                } catch (IllegalStateException e8) {
                    jVar.a("error", Log.getStackTraceString(e8), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get("id")).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((k) ((d) m4.f401g).f3172f).f4567l.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    jVar.d(null);
                    return;
                } catch (IllegalStateException e9) {
                    jVar.a("error", Log.getStackTraceString(e9), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((k) ((d) m4.f401g).f3172f).f4564i;
                jVar.d(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((d) m4.f401g).d(((Integer) ((Map) obj).get("id")).intValue());
                    jVar.d(null);
                    return;
                } catch (IllegalStateException e10) {
                    jVar.a("error", Log.getStackTraceString(e10), null);
                    return;
                }
            default:
                jVar.b();
                return;
        }
    }

    public static String t(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // T0.G
    public void a(Bundle bundle) {
        C0174i c0174i = (C0174i) this.f1289g;
        c0174i.f2303l.lock();
        try {
            c0174i.f2301j = R0.a.f2051j;
            C0174i.h(c0174i);
        } finally {
            c0174i.f2303l.unlock();
        }
    }

    @Override // T0.G
    public void b(R0.a aVar) {
        C0174i c0174i = (C0174i) this.f1289g;
        c0174i.f2303l.lock();
        try {
            c0174i.f2301j = aVar;
            C0174i.h(c0174i);
        } finally {
            c0174i.f2303l.unlock();
        }
    }

    @Override // K5.c
    public Object c(K5.d dVar, InterfaceC0564d interfaceC0564d) {
        ((K5.k) this.f1289g).c(dVar, interfaceC0564d);
        return EnumC0580a.f5697f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [H3.a] */
    public Bitmap d(ByteBuffer byteBuffer, H3.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: H3.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    J1.c cVar = J1.c.this;
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    E3.k kVar = (E3.k) cVar.f1289g;
                    if (kVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(kVar.f660a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e4) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e4);
            return null;
        }
    }

    @Override // D3.L
    public void e() {
        N n7 = (N) this.f1289g;
        n7.f402a.setAlpha(0.0f);
        h hVar = n7.f403b;
        if (hVar != null) {
            hVar.c(n7.f405d);
        }
        n7.f403b = null;
    }

    public boolean f(String str) {
        String l7 = l(str);
        return "1".equals(l7) || Boolean.parseBoolean(l7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0463 A[Catch: JSONException -> 0x0320, TryCatch #8 {JSONException -> 0x0320, blocks: (B:159:0x030c, B:160:0x0310, B:165:0x03c0, B:167:0x03c5, B:169:0x03f1, B:172:0x0415, B:174:0x0408, B:177:0x040f, B:178:0x0424, B:180:0x0448, B:190:0x044c, B:183:0x0459, B:185:0x0463, B:187:0x0470, B:192:0x0451, B:193:0x0475, B:195:0x0483, B:196:0x0490, B:198:0x048d, B:199:0x0495, B:201:0x04a7, B:202:0x04ac, B:204:0x04d3, B:206:0x04e3, B:233:0x05a4, B:209:0x05be, B:211:0x05ce, B:212:0x05db, B:244:0x04ca, B:265:0x0517, B:258:0x0535, B:230:0x0579, B:251:0x059c, B:237:0x05b6, B:216:0x05e0, B:267:0x0315, B:270:0x0323, B:273:0x032e, B:276:0x0338, B:279:0x0343, B:282:0x034e, B:285:0x035a, B:288:0x0364, B:291:0x036e, B:294:0x0378, B:297:0x0382, B:300:0x038c, B:303:0x0397, B:306:0x03a2, B:309:0x03ad, B:219:0x053e, B:221:0x0548, B:222:0x054b, B:224:0x0561, B:225:0x0573, B:228:0x056a), top: B:158:0x030c, inners: #6, #13, #16, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0470 A[Catch: JSONException -> 0x0320, TryCatch #8 {JSONException -> 0x0320, blocks: (B:159:0x030c, B:160:0x0310, B:165:0x03c0, B:167:0x03c5, B:169:0x03f1, B:172:0x0415, B:174:0x0408, B:177:0x040f, B:178:0x0424, B:180:0x0448, B:190:0x044c, B:183:0x0459, B:185:0x0463, B:187:0x0470, B:192:0x0451, B:193:0x0475, B:195:0x0483, B:196:0x0490, B:198:0x048d, B:199:0x0495, B:201:0x04a7, B:202:0x04ac, B:204:0x04d3, B:206:0x04e3, B:233:0x05a4, B:209:0x05be, B:211:0x05ce, B:212:0x05db, B:244:0x04ca, B:265:0x0517, B:258:0x0535, B:230:0x0579, B:251:0x059c, B:237:0x05b6, B:216:0x05e0, B:267:0x0315, B:270:0x0323, B:273:0x032e, B:276:0x0338, B:279:0x0343, B:282:0x034e, B:285:0x035a, B:288:0x0364, B:291:0x036e, B:294:0x0378, B:297:0x0382, B:300:0x038c, B:303:0x0397, B:306:0x03a2, B:309:0x03ad, B:219:0x053e, B:221:0x0548, B:222:0x054b, B:224:0x0561, B:225:0x0573, B:228:0x056a), top: B:158:0x030c, inners: #6, #13, #16, #18 }] */
    /* JADX WARN: Type inference failed for: r0v89, types: [byte[], java.io.Serializable] */
    @Override // O3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(C0675e c0675e, j jVar) {
        N3.d a7;
        CharSequence k4;
        ClipDescription primaryClipDescription;
        char c7;
        Bundle bundle;
        char c8 = 11;
        boolean z5 = false;
        z5 = false;
        switch (this.f1288f) {
            case 13:
                C0675e c0675e2 = (C0675e) this.f1289g;
                if (((c) c0675e2.f5976c) != null) {
                    String str = (String) c0675e.f5975b;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        jVar.b();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) c0675e.f5976c;
                        try {
                            jVar.d(((c) c0675e2.f5976c).m(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                            break;
                        } catch (JSONException e4) {
                            jVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 14:
            case 17:
            default:
                C0675e c0675e3 = (C0675e) this.f1289g;
                if (((d) c0675e3.f5976c) != null) {
                    String str2 = (String) c0675e.f5975b;
                    Object obj = c0675e.f5976c;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1779068172:
                            if (str2.equals("TextInput.setPlatformViewClient")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1015421462:
                            if (str2.equals("TextInput.setEditingState")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -37561188:
                            if (str2.equals("TextInput.setClient")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 270476819:
                            if (str2.equals("TextInput.hide")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 270803918:
                            if (str2.equals("TextInput.show")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 649192816:
                            if (str2.equals("TextInput.sendAppPrivateCommand")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1204752139:
                            if (str2.equals("TextInput.setEditableSizeAndTransform")) {
                                c7 = 6;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1727570905:
                            if (str2.equals("TextInput.finishAutofillContext")) {
                                c7 = 7;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1904427655:
                            if (str2.equals("TextInput.clearClient")) {
                                c7 = '\b';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 2113369584:
                            if (str2.equals("TextInput.requestAutofill")) {
                                c7 = '\t';
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
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i7 = jSONObject2.getInt("platformViewId");
                                boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) ((d) c0675e3.f5976c).f3172f;
                                View view = iVar.f4533a;
                                if (optBoolean) {
                                    view.requestFocus();
                                    iVar.f4537e = new C0102o(3, i7);
                                    iVar.f4534b.restartInput(view);
                                    iVar.f4541i = false;
                                } else {
                                    iVar.f4537e = new C0102o(4, i7);
                                    iVar.f4542j = null;
                                }
                                jVar.d(null);
                                break;
                            } catch (JSONException e7) {
                                jVar.a("error", e7.getMessage(), null);
                            }
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            try {
                                ((d) c0675e3.f5976c).j(p.a((JSONObject) obj));
                                jVar.d(null);
                                break;
                            } catch (JSONException e8) {
                                jVar.a("error", e8.getMessage(), null);
                                return;
                            }
                        case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((d) c0675e3.f5976c).h(jSONArray.getInt(0), n.a(jSONArray.getJSONObject(1)));
                                jVar.d(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e9) {
                                jVar.a("error", e9.getMessage(), null);
                                return;
                            }
                        case 3:
                            io.flutter.plugin.editing.i iVar2 = (io.flutter.plugin.editing.i) ((d) c0675e3.f5976c).f3172f;
                            if (iVar2.f4537e.f299a == 4) {
                                iVar2.c();
                            } else {
                                View view2 = iVar2.f4533a;
                                iVar2.c();
                                iVar2.f4534b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            jVar.d(null);
                            break;
                        case 4:
                            io.flutter.plugin.editing.i iVar3 = (io.flutter.plugin.editing.i) ((d) c0675e3.f5976c).f3172f;
                            InputMethodManager inputMethodManager = iVar3.f4534b;
                            View view3 = iVar3.f4533a;
                            n nVar = iVar3.f4538f;
                            if (nVar == null || nVar.f1738g.f1745a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                iVar3.c();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            jVar.d(null);
                            break;
                        case 5:
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
                                io.flutter.plugin.editing.i iVar4 = (io.flutter.plugin.editing.i) ((d) c0675e3.f5976c).f3172f;
                                iVar4.f4534b.sendAppPrivateCommand(iVar4.f4533a, string, bundle);
                                jVar.d(null);
                                break;
                            } catch (JSONException e10) {
                                jVar.a("error", e10.getMessage(), null);
                                return;
                            }
                        case 6:
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d7 = jSONObject4.getDouble("width");
                                double d8 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i8 = 0; i8 < 16; i8++) {
                                    dArr[i8] = jSONArray2.getDouble(i8);
                                }
                                ((d) c0675e3.f5976c).i(d7, d8, dArr);
                                jVar.d(null);
                                break;
                            } catch (JSONException e11) {
                                jVar.a("error", e11.getMessage(), null);
                                return;
                            }
                        case 7:
                            d dVar = (d) c0675e3.f5976c;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.i) dVar.f3172f).f4535c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                dVar.getClass();
                            }
                            jVar.d(null);
                            break;
                        case '\b':
                            io.flutter.plugin.editing.i iVar5 = (io.flutter.plugin.editing.i) ((d) c0675e3.f5976c).f3172f;
                            View view4 = iVar5.f4533a;
                            if (iVar5.f4537e.f299a != 3) {
                                iVar5.f4540h.e(iVar5);
                                iVar5.c();
                                iVar5.f4538f = null;
                                iVar5.d(null);
                                iVar5.f4537e = new C0102o(1, 0);
                                iVar5.f4545m = null;
                                Field field = D.f240a;
                                Y a8 = AbstractC0109w.a(view4);
                                if (a8 != null && !a8.f272a.n(8)) {
                                    iVar5.f4534b.restartInput(view4);
                                }
                            }
                            jVar.d(null);
                            break;
                        case '\t':
                            io.flutter.plugin.editing.i iVar6 = (io.flutter.plugin.editing.i) ((d) c0675e3.f5976c).f3172f;
                            View view5 = iVar6.f4533a;
                            if (Build.VERSION.SDK_INT >= 26 && iVar6.f4535c != null && iVar6.f4539g != null) {
                                String str3 = (String) iVar6.f4538f.f1741j.f5994g;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(iVar6.f4545m);
                                rect.offset(iArr[0], iArr[1]);
                                iVar6.f4535c.notifyViewEntered(view5, str3.hashCode(), rect);
                            }
                            jVar.d(null);
                            break;
                        default:
                            jVar.b();
                            break;
                    }
                }
                break;
            case 15:
                C0682l c0682l = (C0682l) this.f1289g;
                if (((g) c0682l.f5990g) != null) {
                    String str4 = (String) c0675e.f5975b;
                    Object obj2 = c0675e.f5976c;
                    try {
                        switch (str4.hashCode()) {
                            case -1501580720:
                                if (str4.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                    c8 = '\t';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -931781241:
                                if (str4.equals("Share.invoke")) {
                                    c8 = 14;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -766342101:
                                if (str4.equals("SystemNavigator.pop")) {
                                    c8 = '\n';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -720677196:
                                if (str4.equals("Clipboard.setData")) {
                                    c8 = '\f';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -577225884:
                                if (str4.equals("SystemChrome.setSystemUIChangeListener")) {
                                    c8 = 6;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -548468504:
                                if (str4.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                    c8 = 3;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -247230243:
                                if (str4.equals("HapticFeedback.vibrate")) {
                                    c8 = 1;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -215273374:
                                if (str4.equals("SystemSound.play")) {
                                    c8 = 0;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 241845679:
                                if (str4.equals("SystemChrome.restoreSystemUIOverlays")) {
                                    c8 = 7;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 875995648:
                                if (str4.equals("Clipboard.hasStrings")) {
                                    c8 = '\r';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1128339786:
                                if (str4.equals("SystemChrome.setEnabledSystemUIMode")) {
                                    c8 = 5;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1390477857:
                                if (str4.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                    c8 = '\b';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1514180520:
                                if (str4.equals("Clipboard.getData")) {
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1674312266:
                                if (str4.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                    c8 = 4;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2119655719:
                                if (str4.equals("SystemChrome.setPreferredOrientations")) {
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
                                    int c9 = C1.c.c((String) obj2);
                                    f fVar = (f) ((g) c0682l.f5990g).f2734g;
                                    if (c9 == 1) {
                                        fVar.f4555a.getWindow().getDecorView().playSoundEffect(0);
                                    }
                                    jVar.d(null);
                                    break;
                                } catch (NoSuchFieldException e12) {
                                    jVar.a("error", e12.getMessage(), null);
                                    return;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    ((g) c0682l.f5990g).t(C1.c.b((String) obj2));
                                    jVar.d(null);
                                    break;
                                } catch (NoSuchFieldException e13) {
                                    jVar.a("error", e13.getMessage(), null);
                                    return;
                                }
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                try {
                                    ((f) ((g) c0682l.f5990g).f2734g).f4555a.setRequestedOrientation(C0682l.a(c0682l, (JSONArray) obj2));
                                    jVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e14) {
                                    jVar.a("error", e14.getMessage(), null);
                                    return;
                                }
                            case 3:
                                try {
                                    JSONObject jSONObject5 = (JSONObject) obj2;
                                    int i9 = jSONObject5.getInt("primaryColor");
                                    if (i9 != 0) {
                                        i9 |= -16777216;
                                    }
                                    String string3 = jSONObject5.getString("label");
                                    Activity activity = ((f) ((g) c0682l.f5990g).f2734g).f4555a;
                                    if (Build.VERSION.SDK_INT < 28) {
                                        activity.setTaskDescription(new ActivityManager.TaskDescription(string3, (Bitmap) null, i9));
                                    } else {
                                        activity.setTaskDescription(io.flutter.plugin.platform.c.b(string3, i9));
                                    }
                                    jVar.d(null);
                                    break;
                                } catch (JSONException e15) {
                                    jVar.a("error", e15.getMessage(), null);
                                    return;
                                }
                            case 4:
                                try {
                                    ((g) c0682l.f5990g).r(C0682l.e(c0682l, (JSONArray) obj2));
                                    jVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e16) {
                                    jVar.a("error", e16.getMessage(), null);
                                    return;
                                }
                            case 5:
                                try {
                                    ((g) c0682l.f5990g).s(C0682l.f(c0682l, (String) obj2));
                                    jVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e17) {
                                    jVar.a("error", e17.getMessage(), null);
                                    return;
                                }
                            case 6:
                                f fVar2 = (f) ((g) c0682l.f5990g).f2734g;
                                View decorView = fVar2.f4555a.getWindow().getDecorView();
                                decorView.setOnSystemUiVisibilityChangeListener(new e(fVar2, decorView));
                                jVar.d(null);
                                break;
                            case 7:
                                ((f) ((g) c0682l.f5990g).f2734g).b();
                                jVar.d(null);
                                break;
                            case '\b':
                                try {
                                    ((f) ((g) c0682l.f5990g).f2734g).a(C0682l.g(c0682l, (JSONObject) obj2));
                                    jVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e18) {
                                    jVar.a("error", e18.getMessage(), null);
                                    return;
                                }
                            case '\t':
                                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                InterfaceC0120h interfaceC0120h = ((f) ((g) c0682l.f5990g).f2734g).f4557c;
                                if (interfaceC0120h != null) {
                                    ((AbstractActivityC0117e) interfaceC0120h).g(booleanValue2);
                                }
                                jVar.d(null);
                                break;
                            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                                Activity activity2 = ((f) ((g) c0682l.f5990g).f2734g).f4555a;
                                if (activity2 instanceof t) {
                                    ((t) activity2).getOnBackPressedDispatcher().a();
                                } else {
                                    activity2.finish();
                                }
                                jVar.d(null);
                                break;
                            case 11:
                                String str5 = (String) obj2;
                                if (str5 != null) {
                                    try {
                                        a7 = N3.d.a(str5);
                                    } catch (NoSuchFieldException unused) {
                                        jVar.a("error", "No such clipboard content format: ".concat(str5), null);
                                    }
                                    k4 = ((g) c0682l.f5990g).k(a7);
                                    if (k4 == null) {
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put("text", k4);
                                        jVar.d(jSONObject6);
                                        break;
                                    } else {
                                        jVar.d(null);
                                        break;
                                    }
                                }
                                a7 = null;
                                k4 = ((g) c0682l.f5990g).k(a7);
                                if (k4 == null) {
                                }
                            case '\f':
                                ((ClipboardManager) ((f) ((g) c0682l.f5990g).f2734g).f4555a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj2).getString("text")));
                                jVar.d(null);
                                break;
                            case '\r':
                                ClipboardManager clipboardManager = (ClipboardManager) ((f) ((g) c0682l.f5990g).f2734g).f4555a.getSystemService("clipboard");
                                if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                    z5 = primaryClipDescription.hasMimeType("text/*");
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("value", z5);
                                jVar.d(jSONObject7);
                                break;
                            case 14:
                                f fVar3 = (f) ((g) c0682l.f5990g).f2734g;
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", (String) obj2);
                                fVar3.f4555a.startActivity(Intent.createChooser(intent, null));
                                jVar.d(null);
                                break;
                            default:
                                jVar.b();
                                break;
                        }
                    } catch (JSONException e19) {
                        jVar.a("error", "JSON error: " + e19.getMessage(), null);
                        return;
                    }
                    jVar.a("error", "JSON error: " + e19.getMessage(), null);
                }
                break;
            case 16:
                r(c0675e, jVar);
                break;
            case 18:
                N3.k kVar = (N3.k) this.f1289g;
                String str6 = (String) c0675e.f5975b;
                Object obj3 = c0675e.f5976c;
                str6.getClass();
                if (str6.equals("get")) {
                    kVar.f1723d = true;
                    if (kVar.f1722c || !kVar.f1721b) {
                        jVar.d(N3.k.a((byte[]) kVar.f1724e));
                        break;
                    } else {
                        kVar.f1726g = jVar;
                        break;
                    }
                } else if (str6.equals("put")) {
                    kVar.f1724e = (byte[]) obj3;
                    jVar.d(null);
                    break;
                } else {
                    jVar.b();
                    break;
                }
        }
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        switch (this.f1288f) {
            case 5:
                return this.f1289g;
            default:
                String packageName = ((Context) ((InterfaceC0438a) this.f1289g).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public Integer h(String str) {
        String l7 = l(str);
        if (TextUtils.isEmpty(l7)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(l7));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + t(str) + "(" + l7 + ") into an int");
            return null;
        }
    }

    @Override // D3.L
    public void i() {
        N n7 = (N) this.f1289g;
        h hVar = n7.f403b;
        if (hVar != null) {
            hVar.a(n7.f405d);
        }
    }

    public JSONArray j(String str) {
        String l7 = l(str);
        if (TextUtils.isEmpty(l7)) {
            return null;
        }
        try {
            return new JSONArray(l7);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + t(str) + ": " + l7 + ", falling back to default");
            return null;
        }
    }

    public String k(Resources resources, String str, String str2) {
        String[] strArr;
        String l7 = l(str2);
        if (!TextUtils.isEmpty(l7)) {
            return l7;
        }
        String l8 = l(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(l8)) {
            return null;
        }
        int identifier = resources.getIdentifier(l8, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", t(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray j4 = j(str2.concat("_loc_args"));
        if (j4 == null) {
            strArr = null;
        } else {
            int length = j4.length();
            strArr = new String[length];
            for (int i7 = 0; i7 < length; i7++) {
                strArr[i7] = j4.optString(i7);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e4) {
            Log.w("NotificationParams", "Missing format argument for " + t(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e4);
            return null;
        }
    }

    public String l(String str) {
        Bundle bundle = (Bundle) this.f1289g;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public String m(String str, String str2) {
        P3.a aVar = (P3.a) this.f1289g;
        Context context = aVar.f1877b;
        if (str2 != null) {
            Locale a7 = P3.a.a(str2);
            Configuration configuration = new Configuration(aVar.f1877b.getResources().getConfiguration());
            configuration.setLocale(a7);
            context = aVar.f1877b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f1877b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public void o(Object obj, C0689s c0689s) {
        HashMap hashMap;
        HashMap hashMap2;
        B0.c cVar = (B0.c) this.f1289g;
        if (((io.flutter.view.c) cVar.f71g) == null) {
            c0689s.o(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY);
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.i iVar = (io.flutter.view.i) ((io.flutter.view.c) cVar.f71g).f4605a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent d7 = iVar.d(0, 32);
                        d7.getText().add(str2);
                        iVar.h(d7);
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) cVar.f71g;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) cVar2.f4605a).f4696a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) cVar.f71g;
                    ((io.flutter.view.i) cVar3.f4605a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) cVar.f71g;
                    ((io.flutter.view.i) cVar4.f4605a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar5 = (io.flutter.view.c) cVar.f71g;
                    ((io.flutter.view.i) cVar5.f4605a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        c0689s.o(null);
    }

    @Override // D3.L
    public void p(h hVar) {
        N n7 = (N) this.f1289g;
        h hVar2 = n7.f403b;
        if (hVar2 != null) {
            hVar2.c(n7.f405d);
        }
        n7.f403b = hVar;
    }

    @Override // T0.G
    public void q(int i7) {
        C0174i c0174i = (C0174i) this.f1289g;
        Lock lock = c0174i.f2303l;
        lock.lock();
        try {
            if (c0174i.f2302k) {
                c0174i.f2302k = false;
                C0174i.g(c0174i, i7);
            } else {
                c0174i.f2302k = true;
                c0174i.f2296e.onConnectionSuspended(i7);
            }
        } finally {
            lock.unlock();
        }
    }

    public Bundle s() {
        Bundle bundle = (Bundle) this.f1289g;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public c(F3.b bVar, int i7) {
        this.f1288f = i7;
        switch (i7) {
            case 17:
                new B0.c((Object) bVar, "flutter/platform_views", (Object) m.f1774a, 12).C(new M(12, this));
                break;
            case 18:
            default:
                new B0.c((Object) bVar, "flutter/mousecursor", (Object) m.f1774a, 12).C(new M(11, this));
                break;
            case 19:
                new B0.c((Object) bVar, "flutter/scribe", (Object) O3.g.f1770b, 12).C(new M(15, this));
                break;
            case 20:
                new B0.c((Object) bVar, "flutter/sensitivecontent", (Object) m.f1774a, 12).C(new M(16, this));
                break;
            case 21:
                new B0.c((Object) bVar, "flutter/spellcheck", (Object) m.f1774a, 12).C(new M(17, this));
                break;
        }
    }

    public c(int i7) {
        this.f1288f = i7;
        switch (i7) {
            case 4:
                this.f1289g = new HashMap();
                break;
            case 24:
                break;
            case r.MIN_SDK_VERSION /* 26 */:
                this.f1289g = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            case 29:
                this.f1289g = null;
                break;
            default:
                this.f1289g = new HashSet();
                break;
        }
    }

    public c(O3.e eVar) {
        this.f1288f = 12;
        this.f1289g = new B0.c((Object) eVar, "flutter/keyevent", (Object) O3.g.f1769a, 11);
    }

    public c(Bundle bundle) {
        this.f1288f = 6;
        this.f1289g = new Bundle(bundle);
    }
}
