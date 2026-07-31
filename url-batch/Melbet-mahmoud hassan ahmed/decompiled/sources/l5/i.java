package l5;

import c4.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m5.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final m5.k f18656a;

    /* renamed from: b, reason: collision with root package name */
    private h f18657b;

    /* renamed from: c, reason: collision with root package name */
    final k.c f18658c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x011f A[Catch: JSONException -> 0x0216, TryCatch #9 {JSONException -> 0x0216, blocks: (B:7:0x002c, B:8:0x0030, B:12:0x00c3, B:14:0x00c8, B:16:0x00e1, B:17:0x00f0, B:19:0x00f5, B:27:0x00f9, B:22:0x0113, B:24:0x011f, B:29:0x00fe, B:30:0x012c, B:31:0x0158, B:32:0x0162, B:48:0x01e2, B:42:0x01fc, B:70:0x014f, B:39:0x0153, B:64:0x0185, B:58:0x01a3, B:38:0x01bf, B:76:0x01dc, B:52:0x01f6, B:46:0x0210, B:77:0x0035, B:80:0x0040, B:83:0x004b, B:86:0x0057, B:89:0x0062, B:92:0x006c, B:95:0x0077, B:98:0x0081, B:101:0x008b, B:104:0x0095, B:107:0x009f, B:110:0x00a9, B:113:0x00b4, B:34:0x01a8), top: B:6:0x002c, inners: #6, #8, #10, #11 }] */
        @Override // m5.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void C(m5.j jVar, k.d dVar) {
            String message;
            e b7;
            CharSequence f7;
            if (i.this.f18657b == null) {
            }
            String str = jVar.f19247a;
            Object obj = jVar.f19248b;
            z4.b.e("PlatformChannel", "Received '" + str + "' message.");
            try {
                switch (str) {
                    case "SystemSound.play":
                        try {
                            i.this.f18657b.c(EnumC0095i.b((String) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException e7) {
                            message = e7.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "HapticFeedback.vibrate":
                        try {
                            i.this.f18657b.e(g.b((String) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException e8) {
                            message = e8.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "SystemChrome.setPreferredOrientations":
                        try {
                            i.this.f18657b.l(i.this.h((JSONArray) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e9) {
                            message = e9.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "SystemChrome.setApplicationSwitcherDescription":
                        try {
                            i.this.f18657b.a(i.this.g((JSONObject) obj));
                            dVar.a(null);
                            break;
                        } catch (JSONException e10) {
                            message = e10.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "SystemChrome.setEnabledSystemUIOverlays":
                        try {
                            i.this.f18657b.d(i.this.k((JSONArray) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e11) {
                            message = e11.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "SystemChrome.setEnabledSystemUIMode":
                        try {
                            i.this.f18657b.k(i.this.j((String) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e12) {
                            message = e12.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "SystemChrome.setSystemUIChangeListener":
                        i.this.f18657b.g();
                        dVar.a(null);
                        break;
                    case "SystemChrome.restoreSystemUIOverlays":
                        i.this.f18657b.h();
                        dVar.a(null);
                        break;
                    case "SystemChrome.setSystemUIOverlayStyle":
                        try {
                            i.this.f18657b.j(i.this.i((JSONObject) obj));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e13) {
                            message = e13.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case "SystemNavigator.pop":
                        i.this.f18657b.b();
                        dVar.a(null);
                        break;
                    case "Clipboard.getData":
                        String str2 = (String) obj;
                        if (str2 != null) {
                            try {
                                b7 = e.b(str2);
                            } catch (NoSuchFieldException unused) {
                                dVar.b("error", "No such clipboard content format: " + str2, null);
                            }
                            f7 = i.this.f18657b.f(b7);
                            if (f7 != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("text", f7);
                                dVar.a(jSONObject);
                                break;
                            }
                            dVar.a(null);
                            break;
                        }
                        b7 = null;
                        f7 = i.this.f18657b.f(b7);
                        if (f7 != null) {
                        }
                        dVar.a(null);
                    case "Clipboard.setData":
                        i.this.f18657b.i(((JSONObject) obj).getString("text"));
                        dVar.a(null);
                        break;
                    case "Clipboard.hasStrings":
                        boolean m7 = i.this.f18657b.m();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("value", m7);
                        dVar.a(jSONObject2);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (JSONException e14) {
                dVar.b("error", "JSON error: " + e14.getMessage(), null);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18660a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18661b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f18662c;

        static {
            int[] iArr = new int[k.values().length];
            f18662c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18662c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18662c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18662c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f18661b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18661b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f18660a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18660a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18660a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18660a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18663a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18664b;

        public c(int i7, String str) {
            this.f18663a = i7;
            this.f18664b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: f, reason: collision with root package name */
        private String f18668f;

        d(String str) {
            this.f18668f = str;
        }

        static d b(String str) {
            for (d dVar : values()) {
                if (dVar.f18668f.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* renamed from: f, reason: collision with root package name */
        private String f18671f;

        e(String str) {
            this.f18671f = str;
        }

        static e b(String str) {
            for (e eVar : values()) {
                if (eVar.f18671f.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: f, reason: collision with root package name */
        private String f18677f;

        f(String str) {
            this.f18677f = str;
        }

        static f b(String str) {
            for (f fVar : values()) {
                if (fVar.f18677f.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: f, reason: collision with root package name */
        private final String f18684f;

        g(String str) {
            this.f18684f = str;
        }

        static g b(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f18684f;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a(c cVar);

        void b();

        void c(EnumC0095i enumC0095i);

        void d(List<l> list);

        void e(g gVar);

        CharSequence f(e eVar);

        void g();

        void h();

        void i(String str);

        void j(j jVar);

        void k(k kVar);

        void l(int i7);

        boolean m();
    }

    /* renamed from: l5.i$i, reason: collision with other inner class name */
    public enum EnumC0095i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: f, reason: collision with root package name */
        private final String f18688f;

        EnumC0095i(String str) {
            this.f18688f = str;
        }

        static EnumC0095i b(String str) {
            for (EnumC0095i enumC0095i : values()) {
                if (enumC0095i.f18688f.equals(str)) {
                    return enumC0095i;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f18689a;

        /* renamed from: b, reason: collision with root package name */
        public final d f18690b;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f18691c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f18692d;

        /* renamed from: e, reason: collision with root package name */
        public final d f18693e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f18694f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f18695g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f18689a = num;
            this.f18690b = dVar;
            this.f18691c = bool;
            this.f18692d = num2;
            this.f18693e = dVar2;
            this.f18694f = num3;
            this.f18695g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: f, reason: collision with root package name */
        private String f18701f;

        k(String str) {
            this.f18701f = str;
        }

        static k b(String str) {
            for (k kVar : values()) {
                if (kVar.f18701f.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: f, reason: collision with root package name */
        private String f18705f;

        l(String str) {
            this.f18705f = str;
        }

        static l b(String str) {
            for (l lVar : values()) {
                if (lVar.f18705f.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public i(a5.a aVar) {
        a aVar2 = new a();
        this.f18658c = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/platform", m5.g.f19246a);
        this.f18656a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int i7 = jSONObject.getInt("primaryColor");
        if (i7 != 0) {
            i7 |= -16777216;
        }
        return new c(i7, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int h(JSONArray jSONArray) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            int i10 = b.f18660a[f.b(jSONArray.getString(i9)).ordinal()];
            if (i10 == 1) {
                i7 |= 1;
            } else if (i10 == 2) {
                i7 |= 4;
            } else if (i10 == 3) {
                i7 |= 2;
            } else if (i10 == 4) {
                i7 |= 8;
            }
            if (i8 == 0) {
                i8 = i7;
            }
        }
        if (i7 == 0) {
            return -1;
        }
        switch (i7) {
            case 2:
                return 0;
            case 3:
            case 6:
            case w0.f2149o /* 7 */:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i8 != 2) {
                    if (i8 != 4) {
                        return i8 != 8 ? 1 : 8;
                    }
                    return 9;
                }
                return 0;
            case 4:
                return 9;
            case 5:
                return 12;
            case w0.f2150p /* 8 */:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.b(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.b(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int i7 = b.f18662c[k.b(str).ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            int i8 = b.f18661b[l.b(jSONArray.getString(i7)).ordinal()];
            if (i8 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i8 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f18657b = hVar;
    }

    public void m(boolean z6) {
        z4.b.e("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f18656a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z6)));
    }
}
