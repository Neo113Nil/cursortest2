package l5;

import android.os.Build;
import android.os.Bundle;
import c4.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m5.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final m5.k f18762a;

    /* renamed from: b, reason: collision with root package name */
    private f f18763b;

    /* renamed from: c, reason: collision with root package name */
    final k.c f18764c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            String message;
            Bundle bundle;
            if (p.this.f18763b == null) {
            }
            String str = jVar.f19247a;
            Object obj = jVar.f19248b;
            z4.b.e("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c7 = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c7 = 0;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c7 = 1;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c7 = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c7 = 3;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c7 = 4;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c7 = 5;
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c7 = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c7 = 7;
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c7 = '\b';
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c7 = '\t';
                        break;
                    }
                    break;
            }
            try {
                switch (c7) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        p.this.f18763b.f(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    case 1:
                        p.this.f18763b.d(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            p.this.f18763b.c(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e7) {
                            message = e7.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case 3:
                        p.this.f18763b.j();
                        dVar.a(null);
                        break;
                    case 4:
                        p.this.f18763b.b();
                        dVar.a(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        p.this.f18763b.e(string, bundle);
                        dVar.a(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d7 = jSONObject3.getDouble("width");
                        double d8 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i7 = 0; i7 < 16; i7++) {
                            dArr[i7] = jSONArray2.getDouble(i7);
                        }
                        p.this.f18763b.g(d7, d8, dArr);
                        dVar.a(null);
                        break;
                    case w0.f2149o /* 7 */:
                        p.this.f18763b.i(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case w0.f2150p /* 8 */:
                        p.this.f18763b.a();
                        dVar.a(null);
                        break;
                    case '\t':
                        p.this.f18763b.h();
                        dVar.a(null);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (JSONException e8) {
                message = e8.getMessage();
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18766a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18767b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f18768c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f18769d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f18770e;

        /* renamed from: f, reason: collision with root package name */
        public final d f18771f;

        /* renamed from: g, reason: collision with root package name */
        public final c f18772g;

        /* renamed from: h, reason: collision with root package name */
        public final Integer f18773h;

        /* renamed from: i, reason: collision with root package name */
        public final String f18774i;

        /* renamed from: j, reason: collision with root package name */
        public final a f18775j;

        /* renamed from: k, reason: collision with root package name */
        public final b[] f18776k;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f18777a;

            /* renamed from: b, reason: collision with root package name */
            public final String[] f18778b;

            /* renamed from: c, reason: collision with root package name */
            public final e f18779c;

            /* renamed from: d, reason: collision with root package name */
            public final String f18780d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f18777a = str;
                this.f18778b = strArr;
                this.f18780d = str2;
                this.f18779c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    strArr[i7] = b(jSONArray.getString(i7));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a3, code lost:
            
                if (r16.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String b(String str) {
                char c7 = 26;
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (str.equals("birthdayYear")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1917283616:
                        if (str.equals("oneTimeCode")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1844815832:
                        if (str.equals("creditCardExpirationMonth")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1825589953:
                        if (str.equals("telephoneNumberNational")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1821235109:
                        if (str.equals("newPassword")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1757573738:
                        if (str.equals("creditCardSecurityCode")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1682373820:
                        if (str.equals("creditCardExpirationDay")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1658955742:
                        if (str.equals("fullStreetAddress")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1567118045:
                        if (str.equals("telephoneNumberDevice")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1476752575:
                        if (str.equals("countryName")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1413737489:
                        if (str.equals("middleInitial")) {
                            c7 = '\n';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1377792129:
                        if (str.equals("addressCity")) {
                            c7 = 11;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1249512767:
                        if (str.equals("gender")) {
                            c7 = '\f';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1186060294:
                        if (str.equals("postalAddressExtendedPostalCode")) {
                            c7 = '\r';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1151034798:
                        if (str.equals("creditCardNumber")) {
                            c7 = 14;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -835992323:
                        if (str.equals("namePrefix")) {
                            c7 = 15;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -818219584:
                        if (str.equals("middleName")) {
                            c7 = 16;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -747304516:
                        if (str.equals("nameSuffix")) {
                            c7 = 17;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -613980922:
                        if (str.equals("creditCardExpirationDate")) {
                            c7 = 18;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -613352043:
                        if (str.equals("creditCardExpirationYear")) {
                            c7 = 19;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -549230602:
                        if (str.equals("telephoneNumberCountryCode")) {
                            c7 = 20;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -265713450:
                        if (str.equals("username")) {
                            c7 = 21;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            c7 = 22;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c7 = 23;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 253202685:
                        if (str.equals("addressState")) {
                            c7 = 24;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 588174851:
                        if (str.equals("birthdayMonth")) {
                            c7 = 25;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 798554127:
                        break;
                    case 892233837:
                        if (str.equals("telephoneNumber")) {
                            c7 = 27;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 991032982:
                        if (str.equals("newUsername")) {
                            c7 = 28;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1069376125:
                        if (str.equals("birthday")) {
                            c7 = 29;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1216985755:
                        if (str.equals("password")) {
                            c7 = 30;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1469046696:
                        if (str.equals("givenName")) {
                            c7 = 31;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1662667945:
                        if (str.equals("postalAddress")) {
                            c7 = ' ';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1921869058:
                        if (str.equals("postalAddressExtended")) {
                            c7 = '!';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 2011152728:
                        if (str.equals("postalCode")) {
                            c7 = '\"';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 2011773919:
                        if (str.equals("birthdayDay")) {
                            c7 = '#';
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                }
                return str;
            }
        }

        public b(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, d dVar, c cVar, Integer num, String str, a aVar, b[] bVarArr) {
            this.f18766a = z6;
            this.f18767b = z7;
            this.f18768c = z8;
            this.f18769d = z9;
            this.f18770e = z10;
            this.f18771f = dVar;
            this.f18772g = cVar;
            this.f18773h = num;
            this.f18774i = str;
            this.f18775j = aVar;
            this.f18776k = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bVarArr2[i7] = a(jSONArray.getJSONObject(i7));
                }
                bVarArr = bVarArr2;
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.b(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b(string), jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static Integer b(String str) {
            str.hashCode();
            char c7 = 1;
            switch (str.hashCode()) {
                case -810971940:
                    if (str.equals("TextInputAction.unspecified")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -737377923:
                    break;
                case -737089298:
                    if (str.equals("TextInputAction.next")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -737080013:
                    if (str.equals("TextInputAction.none")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -736940669:
                    if (str.equals("TextInputAction.send")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 469250275:
                    if (str.equals("TextInputAction.search")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1241689507:
                    if (str.equals("TextInputAction.go")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1539450297:
                    if (str.equals("TextInputAction.newline")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 2110497650:
                    if (str.equals("TextInputAction.previous")) {
                        c7 = '\b';
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
                    return 0;
                case 1:
                    return 6;
                case 2:
                    return 5;
                case 3:
                    return 1;
                case 4:
                    return 4;
                case 5:
                    return 3;
                case 6:
                    return 2;
                case w0.f2149o /* 7 */:
                    return 1;
                case w0.f2150p /* 8 */:
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f18781a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18782b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f18783c;

        public c(g gVar, boolean z6, boolean z7) {
            this.f18781a = gVar;
            this.f18782b = z6;
            this.f18783c = z7;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.b(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: f, reason: collision with root package name */
        private final String f18789f;

        d(String str) {
            this.f18789f = str;
        }

        static d b(String str) {
            for (d dVar : values()) {
                if (dVar.f18789f.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f18790a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18791b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18792c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18793d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18794e;

        public e(String str, int i7, int i8, int i9, int i10) {
            if (!(i7 == -1 && i8 == -1) && (i7 < 0 || i8 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i7) + ", " + String.valueOf(i8) + ")");
            }
            if (!(i9 == -1 && i10 == -1) && (i9 < 0 || i9 > i10)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i9) + ", " + String.valueOf(i10) + ")");
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i9));
            }
            if (i7 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i7));
            }
            if (i8 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i8));
            }
            this.f18790a = str;
            this.f18791b = i7;
            this.f18792c = i8;
            this.f18793d = i9;
            this.f18794e = i10;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i7 = this.f18793d;
            return i7 >= 0 && this.f18794e > i7;
        }

        public boolean c() {
            return this.f18791b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(int i7, b bVar);

        void d(e eVar);

        void e(String str, Bundle bundle);

        void f(int i7, boolean z6);

        void g(double d7, double d8, double[] dArr);

        void h();

        void i(boolean z6);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* renamed from: f, reason: collision with root package name */
        private final String f18807f;

        g(String str) {
            this.f18807f = str;
        }

        static g b(String str) {
            for (g gVar : values()) {
                if (gVar.f18807f.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public p(a5.a aVar) {
        a aVar2 = new a();
        this.f18764c = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/textinput", m5.g.f19246a);
        this.f18762a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> b(ArrayList<io.flutter.plugin.editing.e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> c(String str, int i7, int i8, int i9, int i10) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i7));
        hashMap.put("selectionExtent", Integer.valueOf(i8));
        hashMap.put("composingBase", Integer.valueOf(i9));
        hashMap.put("composingExtent", Integer.valueOf(i10));
        return hashMap;
    }

    public void d(int i7) {
        z4.b.e("TextInputChannel", "Sending 'done' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.done"));
    }

    public void e(int i7) {
        z4.b.e("TextInputChannel", "Sending 'go' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.go"));
    }

    public void f(int i7) {
        z4.b.e("TextInputChannel", "Sending 'newline' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.newline"));
    }

    public void g(int i7) {
        z4.b.e("TextInputChannel", "Sending 'next' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.next"));
    }

    public void h(int i7, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f18762a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i7), hashMap));
    }

    public void i(int i7) {
        z4.b.e("TextInputChannel", "Sending 'previous' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.previous"));
    }

    public void j() {
        this.f18762a.c("TextInputClient.requestExistingInputState", null);
    }

    public void k(int i7) {
        z4.b.e("TextInputChannel", "Sending 'search' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.search"));
    }

    public void l(int i7) {
        z4.b.e("TextInputChannel", "Sending 'send' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.send"));
    }

    public void m(f fVar) {
        this.f18763b = fVar;
    }

    public void n(int i7) {
        z4.b.e("TextInputChannel", "Sending 'unspecified' message.");
        this.f18762a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.unspecified"));
    }

    public void o(int i7, String str, int i8, int i9, int i10, int i11) {
        z4.b.e("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i8 + "\nSelection end: " + i9 + "\nComposing start: " + i10 + "\nComposing end: " + i11);
        this.f18762a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i7), c(str, i8, i9, i10, i11)));
    }

    public void p(int i7, ArrayList<io.flutter.plugin.editing.e> arrayList) {
        z4.b.e("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f18762a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i7), b(arrayList)));
    }

    public void q(int i7, HashMap<String, e> hashMap) {
        z4.b.e("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, e> entry : hashMap.entrySet()) {
            e value = entry.getValue();
            hashMap2.put(entry.getKey(), c(value.f18790a, value.f18791b, value.f18792c, -1, -1));
        }
        this.f18762a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i7), hashMap2));
    }
}
