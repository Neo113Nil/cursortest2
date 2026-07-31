package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ep {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16113a = "com.google.market";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16114b = "com.android.vending";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16115c = "isInstalled";

    /* renamed from: d, reason: collision with root package name */
    private static final String f16116d = "ep";

    /* renamed from: e, reason: collision with root package name */
    private static final ArrayList<String> f16117e = new a();

    class a extends ArrayList<String> {
        a() {
            add(ep.f16113a);
            add("com.android.vending");
        }
    }

    class b extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16118a;

        b(boolean z4) {
            this.f16118a = z4;
            put("isInstalled", z4);
        }
    }

    private enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{ep.f16113a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* renamed from: h, reason: collision with root package name */
        private static final Map<String, c> f16124h = new HashMap();

        /* renamed from: a, reason: collision with root package name */
        private final int f16126a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f16127b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    f16124h.put(str, cVar);
                }
            }
        }

        c(int i4, String[] strArr) {
            this.f16126a = i4;
            this.f16127b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f16126a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.f16127b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(f16124h.keySet());
        }
    }

    private static JSONObject a(Context context) {
        return a(context, f16117e);
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> o4 = nm.S().f().o(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : o4) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer c(Context context) {
        JSONObject a4 = a(context, c.b());
        int i4 = 0;
        for (c cVar : c.values()) {
            String[] d4 = cVar.d();
            int length = d4.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                JSONObject optJSONObject = a4.optJSONObject(d4[i5]);
                if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                    i4 = (int) (i4 + Math.pow(2.0d, r5.c() - 1));
                    break;
                }
                i5++;
            }
        }
        return Integer.valueOf(i4);
    }

    public static boolean d(Context context) {
        JSONObject a4 = a(context);
        Iterator<String> keys = a4.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a4.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b4 = b(context);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                String str = arrayList.get(i4);
                i4++;
                String str2 = str;
                jSONObject.put(str2, a(b4.contains(str2.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            Log.d(f16116d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z4) {
        return new b(z4);
    }
}
