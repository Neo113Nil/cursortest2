package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.l;
import com.apm.insight.l.o;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    static volatile boolean a = true;
    private static volatile boolean f;
    private c c;
    private final Context d;
    private volatile boolean e;
    private JSONObject j;
    private JSONObject k;
    private JSONArray p;
    private JSONObject q;
    private JSONArray t;
    private JSONArray u;
    private JSONObject v;
    private boolean w;
    private volatile boolean y;
    private long g = -1;
    private File h = null;
    private boolean i = true;
    private String l = EnvironmentCompat.MEDIA_UNKNOWN;
    private String m = EnvironmentCompat.MEDIA_UNKNOWN;
    private String n = EnvironmentCompat.MEDIA_UNKNOWN;
    private String o = "npth_inner_default";
    private int r = 0;
    private long s = -1;
    private final Object x = new Object();
    private long z = -1;
    private long A = 0;
    private final Runnable B = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    };
    private int C = 0;
    private List<Pattern> D = null;
    Pattern b = null;
    private File E = null;

    public b(Context context) {
        this.d = context;
    }

    private static String a(float f2) {
        return f2 <= 0.0f ? "0%" : f2 <= 0.1f ? "0% - 10%" : f2 <= 0.3f ? "10% - 30%" : f2 <= 0.6f ? "30% - 60%" : f2 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String a(float f2, float f3) {
        return f3 > 0.0f ? a(f2 / f3) : f2 > 0.0f ? "100%" : "0%";
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a2 = l.a(256, 128, jSONArray);
        if (a2.length() != jSONArray.length()) {
            this.r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0211, code lost:
    
        if (r8 != 5) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d4 A[LOOP:2: B:91:0x01fb->B:121:0x02d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a3 A[EDGE_INSN: B:122:0x03a3->B:123:0x03a3 BREAK  A[LOOP:2: B:91:0x01fb->B:121:0x02d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03f6 A[EDGE_INSN: B:21:0x03f6->B:22:0x03f6 BREAK  A[LOOP:0: B:2:0x0038->B:8:0x03df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, JSONObject jSONObject) {
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr;
        int i;
        String str2;
        char c;
        char c2;
        char c3;
        int i2;
        boolean z;
        String str3;
        String trim;
        String str4;
        HashMap hashMap3;
        String str5;
        int i3;
        char c4;
        String[] strArr2;
        String str6;
        float floatValue;
        float floatValue2;
        b bVar = this;
        SystemClock.uptimeMillis();
        String[] split = str.split("\n");
        float[] fArr = {-1.0f, -1.0f, -1.0f};
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        int length = split.length;
        String str7 = EnvironmentCompat.MEDIA_UNKNOWN;
        String str8 = EnvironmentCompat.MEDIA_UNKNOWN;
        String str9 = str8;
        int i4 = 0;
        char c5 = 0;
        boolean z2 = false;
        while (true) {
            if (i4 >= length) {
                hashMap = hashMap7;
                hashMap2 = hashMap8;
                break;
            }
            String str10 = split[i4];
            if (!TextUtils.isEmpty(str10)) {
                strArr = split;
                i = length;
                if (c5 != 0) {
                    str2 = str7;
                    if (c5 == 1) {
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                        c = c5;
                        i2 = 0;
                        str10 = str10.trim();
                        String lowerCase = str10.toLowerCase();
                        if (lowerCase.startsWith("shortmsg")) {
                            str10.substring(str10.indexOf(58));
                            z = false;
                        } else if (lowerCase.startsWith("reason:")) {
                            str10.substring(str10.indexOf(58));
                            z = true;
                        } else {
                            c2 = 3;
                            if (lowerCase.contains("appfreeze")) {
                                str9 = "AppFreeze";
                                c5 = '\n';
                                c3 = 4;
                            }
                            c5 = c;
                            c3 = 4;
                        }
                        if (lowerCase.contains("input dispatch")) {
                            str3 = "Input dispatching timed out";
                        } else if (lowerCase.contains("broadcast of intent")) {
                            str3 = "Broadcast of Intent";
                        } else {
                            if (lowerCase.contains("executing service")) {
                                if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(str8)) {
                                    str8 = str10.substring(str10.indexOf("service ") + 8).trim();
                                }
                                str9 = "executing service";
                            } else if (lowerCase.contains("service.startforeground")) {
                                str3 = "not call Service.startForeground";
                            } else {
                                str9 = str2;
                            }
                            if (z) {
                                c3 = 4;
                                c2 = 3;
                                c5 = 2;
                            }
                            trim = str10.trim();
                            if (trim.startsWith("Load:")) {
                            }
                            c2 = 3;
                            c5 = c;
                            c3 = 4;
                        }
                        str9 = str3;
                        if (z) {
                        }
                        trim = str10.trim();
                        if (trim.startsWith("Load:")) {
                        }
                        c2 = 3;
                        c5 = c;
                        c3 = 4;
                    } else if (c5 != 2) {
                        if (c5 != 3) {
                            hashMap = hashMap7;
                            hashMap2 = hashMap8;
                            c2 = 3;
                            c = c5;
                        } else {
                            String[] split2 = str10.split("\\s");
                            c = c5;
                            if (split2.length < 2) {
                                hashMap = hashMap7;
                                hashMap2 = hashMap8;
                                c2 = 3;
                            } else {
                                if ("CPU".equalsIgnoreCase(split2[0]) && "usage".equalsIgnoreCase(split2[1])) {
                                    if (str10.contains("ago")) {
                                        z2 = true;
                                    }
                                    if (hashMap4.isEmpty() && hashMap5.isEmpty() && hashMap6.isEmpty() && hashMap8.isEmpty() && hashMap7.isEmpty()) {
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        c5 = c;
                                        c3 = 4;
                                        c2 = 3;
                                    }
                                } else if (hashMap4.isEmpty() || hashMap5.isEmpty() || hashMap6.isEmpty() || hashMap8.isEmpty() || hashMap7.isEmpty()) {
                                    if (hashMap4.isEmpty() && split2[1].equalsIgnoreCase("TOTAL:")) {
                                        str4 = "";
                                        hashMap3 = hashMap4;
                                    } else if (str10.contains(bVar.d.getPackageName())) {
                                        str4 = "";
                                        int i5 = 0;
                                        while (i5 < split2.length) {
                                            if (split2[i5].contains(bVar.d.getPackageName())) {
                                                StringBuilder sb = new StringBuilder();
                                                String str11 = split2[i5];
                                                str4 = sb.append(str11.substring(str11.indexOf(47) + 1, split2[i5].length() - 1)).append('_').toString();
                                            }
                                            i5++;
                                            bVar = this;
                                        }
                                        hashMap3 = hashMap6;
                                    } else if (hashMap5.isEmpty() && str10.contains("system_server:")) {
                                        str4 = "";
                                        hashMap3 = hashMap5;
                                    } else if (hashMap8.isEmpty() && str10.contains("kswapd")) {
                                        str4 = "";
                                        hashMap3 = hashMap8;
                                    } else if (hashMap7.isEmpty() && str10.contains("dex2oat")) {
                                        str4 = "";
                                        hashMap3 = hashMap7;
                                    } else {
                                        str4 = "";
                                        hashMap3 = null;
                                    }
                                    if (hashMap3 != null) {
                                        int i6 = 0;
                                        try {
                                            do {
                                                str5 = "%";
                                                if (!split2[i6].contains("%")) {
                                                    i6++;
                                                }
                                                break;
                                            } while (i6 < split2.length);
                                            break;
                                            floatValue2 = Float.valueOf(split2[i6].replace("%", "")).floatValue();
                                            hashMap = hashMap7;
                                        } catch (Throwable unused) {
                                            hashMap = hashMap7;
                                        }
                                        try {
                                            String str12 = str4 + "total";
                                            if (hashMap3 == hashMap4) {
                                                hashMap2 = hashMap8;
                                            } else {
                                                hashMap2 = hashMap8;
                                                try {
                                                    floatValue2 /= com.apm.insight.l.d.e();
                                                } catch (Throwable unused2) {
                                                    hashMap3.put(str4 + "total", Float.valueOf(-1.0f));
                                                    i3 = i6 + 3;
                                                    char c6 = 0;
                                                    while (i3 < split2.length) {
                                                    }
                                                    c2 = 3;
                                                    c5 = c;
                                                    c3 = 4;
                                                    if (c5 >= c3) {
                                                    }
                                                }
                                            }
                                            hashMap3.put(str12, Float.valueOf(floatValue2));
                                        } catch (Throwable unused3) {
                                            hashMap2 = hashMap8;
                                            hashMap3.put(str4 + "total", Float.valueOf(-1.0f));
                                            i3 = i6 + 3;
                                            char c62 = 0;
                                            while (i3 < split2.length) {
                                            }
                                            c2 = 3;
                                            c5 = c;
                                            c3 = 4;
                                            if (c5 >= c3) {
                                            }
                                        }
                                        i3 = i6 + 3;
                                        char c622 = 0;
                                        while (i3 < split2.length) {
                                            String str13 = "softirq";
                                            if (c622 == 0) {
                                                c4 = c622;
                                                if ("user".equalsIgnoreCase(split2[i3])) {
                                                    str13 = "user";
                                                    c622 = 1;
                                                    if (str13 == null) {
                                                    }
                                                    if (c622 < 6) {
                                                    }
                                                }
                                            } else if (c622 == 1) {
                                                c4 = c622;
                                            } else if (c622 == 2) {
                                                c4 = c622;
                                                if ("iowait".equalsIgnoreCase(split2[i3])) {
                                                    str13 = "iowait";
                                                    c622 = 3;
                                                    if (str13 == null) {
                                                    }
                                                    if (c622 < 6) {
                                                    }
                                                }
                                                if ("irq".equalsIgnoreCase(split2[i3])) {
                                                }
                                                if ("softirq".equalsIgnoreCase(split2[i3])) {
                                                }
                                                if ("softirq".equalsIgnoreCase(split2[i3])) {
                                                }
                                                c622 = c4;
                                                str13 = null;
                                                if (str13 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            } else if (c622 == 3) {
                                                c4 = c622;
                                                if ("irq".equalsIgnoreCase(split2[i3])) {
                                                    str13 = "irq";
                                                    c622 = 4;
                                                    if (str13 == null) {
                                                    }
                                                    if (c622 < 6) {
                                                    }
                                                }
                                                if ("softirq".equalsIgnoreCase(split2[i3])) {
                                                }
                                                if ("softirq".equalsIgnoreCase(split2[i3])) {
                                                }
                                                c622 = c4;
                                                str13 = null;
                                                if (str13 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            } else if (c622 != 4) {
                                                c4 = c622;
                                            } else {
                                                c4 = c622;
                                                if ("softirq".equalsIgnoreCase(split2[i3])) {
                                                    c622 = 5;
                                                    if (str13 == null) {
                                                        try {
                                                            floatValue = Float.valueOf(split2[i3 - 1].replace(str5, "")).floatValue();
                                                            strArr2 = split2;
                                                        } catch (Throwable unused4) {
                                                            strArr2 = split2;
                                                        }
                                                        try {
                                                            String str14 = str4 + str13;
                                                            if (hashMap3 == hashMap4) {
                                                                str6 = str5;
                                                            } else {
                                                                str6 = str5;
                                                                try {
                                                                    floatValue /= com.apm.insight.l.d.e();
                                                                } catch (Throwable unused5) {
                                                                    hashMap3.put(str4 + str13, Float.valueOf(-1.0f));
                                                                    if (c622 < 6) {
                                                                    }
                                                                }
                                                            }
                                                            hashMap3.put(str14, Float.valueOf(floatValue));
                                                        } catch (Throwable unused6) {
                                                            str6 = str5;
                                                            hashMap3.put(str4 + str13, Float.valueOf(-1.0f));
                                                            if (c622 < 6) {
                                                            }
                                                        }
                                                    } else {
                                                        strArr2 = split2;
                                                        str6 = str5;
                                                    }
                                                    if (c622 < 6) {
                                                        break;
                                                    }
                                                    i3 += 3;
                                                    split2 = strArr2;
                                                    str5 = str6;
                                                }
                                                if ("softirq".equalsIgnoreCase(split2[i3])) {
                                                    c622 = 6;
                                                    if (str13 == null) {
                                                    }
                                                    if (c622 < 6) {
                                                    }
                                                }
                                                c622 = c4;
                                                str13 = null;
                                                if (str13 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            if ("kernel".equalsIgnoreCase(split2[i3])) {
                                                str13 = "kernel";
                                                c622 = 2;
                                                if (str13 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            if ("iowait".equalsIgnoreCase(split2[i3])) {
                                            }
                                            if ("irq".equalsIgnoreCase(split2[i3])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i3])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i3])) {
                                            }
                                            c622 = c4;
                                            str13 = null;
                                            if (str13 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        }
                                    } else {
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                    }
                                    c2 = 3;
                                    c5 = c;
                                    c3 = 4;
                                }
                                hashMap = hashMap7;
                                hashMap2 = hashMap8;
                                c3 = 4;
                                c2 = 3;
                                c5 = 4;
                            }
                        }
                        c5 = c;
                        c3 = 4;
                    } else {
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                        c = c5;
                        i2 = 0;
                        trim = str10.trim();
                        if (trim.startsWith("Load:")) {
                            String[] split3 = trim.replace("Load:", "").trim().split("/");
                            c2 = 3;
                            if (3 == split3.length) {
                                for (int i7 = i2; i7 < split3.length; i7++) {
                                    fArr[i7] = Float.valueOf(split3[i7]).floatValue();
                                }
                            }
                            c5 = 3;
                            c3 = 4;
                        }
                        c2 = 3;
                        c5 = c;
                        c3 = 4;
                    }
                } else {
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str7;
                    c = c5;
                    c2 = 3;
                    String trim2 = str10.trim();
                    if (trim2.startsWith("tag:")) {
                        str8 = trim2.replace("tag:", "").trim();
                        c3 = 4;
                        c5 = 1;
                    }
                    c5 = c;
                    c3 = 4;
                }
                if (c5 >= c3) {
                    break;
                }
            } else {
                strArr = split;
                hashMap = hashMap7;
                hashMap2 = hashMap8;
                i = length;
                str2 = str7;
                c2 = 3;
            }
            i4++;
            bVar = this;
            split = strArr;
            length = i;
            str7 = str2;
            hashMap7 = hashMap;
            hashMap8 = hashMap2;
        }
        jSONObject.put("anr_tag", str8);
        jSONObject.put("anr_has_ago", String.valueOf(z2));
        jSONObject.put("anr_reason", str9);
        a(hashMap6, jSONObject, "app");
        a(hashMap4, jSONObject, "total");
        if (hashMap5.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(r.a(hashMap5).floatValue()));
        }
        if (hashMap2.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(r.a(hashMap2).floatValue()));
        }
        if (hashMap.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(r.a(hashMap).floatValue()));
        }
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) {
        String str2;
        String a2;
        String str3 = "npth_anr_" + str;
        if (hashMap.isEmpty()) {
            str2 = str3 + "_total";
            a2 = "not found";
        } else {
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    f2 += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    f3 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    f4 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    f5 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    f6 += entry.getValue().floatValue();
                }
            }
            float f7 = f2 + f3 + f4 + f5 + f6;
            jSONObject.put(str3 + "_total", b(f7));
            jSONObject.put(str3 + "_kernel_user_ratio", a(f3, f7));
            str2 = str3 + "_iowait_user_ratio";
            a2 = a(f4, f7);
        }
        jSONObject.put(str2, a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018c, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONArray jSONArray) {
        int[] iArr;
        int[] iArr2;
        if (jSONArray == null) {
            return;
        }
        this.j = null;
        this.q = null;
        this.r = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.l = EnvironmentCompat.MEDIA_UNKNOWN;
        this.m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.n = EnvironmentCompat.MEDIA_UNKNOWN;
        int[] iArr3 = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String str = null;
        boolean z = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (TextUtils.isEmpty(optString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                    if (this.j == null && "main".equals(str)) {
                        this.j = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(str, jSONArray5));
                    }
                    try {
                        if (!"main".equals(str)) {
                            str = str.substring(0, str.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str2 = str;
                    if (!a(str2)) {
                        try {
                            iArr2 = b(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            com.apm.insight.c.a().a("NPTH_CATCH", e);
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            str = null;
                        } catch (Throwable unused2) {
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            str = null;
                        }
                        if (iArr2 != null) {
                            int i2 = iArr2[0];
                            if (i2 > iArr3[0]) {
                                iArr3[0] = i2;
                                this.l = str2;
                            }
                            int i3 = iArr2[1];
                            if (i3 > iArr3[1]) {
                                iArr3[1] = i3;
                                this.m = str2;
                            }
                            int i4 = iArr2[2];
                            if (i4 > iArr3[2]) {
                                iArr3[2] = i4;
                                this.n = str2;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                str = null;
            } else {
                if (z) {
                    if (z) {
                        if (optString.contains(" prio=")) {
                            if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                                if (this.j == null && "main".equals(str)) {
                                    this.j = c(jSONArray5);
                                } else {
                                    jSONArray2.put(a(str, jSONArray5));
                                }
                                try {
                                    if (!"main".equals(str)) {
                                        str = str.substring(0, str.indexOf(40)).trim();
                                    }
                                } catch (Throwable unused3) {
                                }
                                String str3 = str;
                                if (!a(str3)) {
                                    try {
                                        iArr = b(jSONArray5);
                                    } catch (IllegalArgumentException e2) {
                                        com.apm.insight.c.a().a("NPTH_CATCH", e2);
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        String substring = optString.substring(1, optString.indexOf(34, 1));
                                        if (!"main".equals(substring)) {
                                        }
                                        if (jSONArray5.length() > 0) {
                                        }
                                        jSONArray5.put(optString);
                                    } catch (Throwable unused4) {
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        String substring2 = optString.substring(1, optString.indexOf(34, 1));
                                        if (!"main".equals(substring2)) {
                                        }
                                        if (jSONArray5.length() > 0) {
                                        }
                                        jSONArray5.put(optString);
                                    }
                                    if (iArr != null) {
                                        int i5 = iArr[0];
                                        if (i5 > iArr3[0]) {
                                            iArr3[0] = i5;
                                            this.l = str3;
                                        }
                                        int i6 = iArr[1];
                                        if (i6 > iArr3[1]) {
                                            iArr3[1] = i6;
                                            this.m = str3;
                                        }
                                        int i7 = iArr[2];
                                        if (i7 > iArr3[2]) {
                                            iArr3[2] = i7;
                                            this.n = str3;
                                        }
                                    }
                                }
                            }
                            String substring22 = optString.substring(1, optString.indexOf(34, 1));
                            str = !"main".equals(substring22) ? substring22 + "  (" + optString.substring(optString.indexOf(34, 2) + 1) + " )" : substring22;
                            if (jSONArray5.length() > 0) {
                                jSONArray5 = new JSONArray();
                            }
                        }
                        jSONArray5.put(optString);
                    }
                } else if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                    z = true;
                }
                jSONArray3.put(optString);
            }
        }
        if (jSONArray2.length() > 0) {
            this.p = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.q = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.q.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    private boolean a(long j) {
        if (this.y) {
            this.y = false;
            b(j);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.D == null) {
            JSONArray c = com.apm.insight.runtime.a.c();
            if (c != null) {
                this.D = new LinkedList();
                this.o = c.optString(0);
                for (int i = 1; i < c.length(); i++) {
                    try {
                        this.D.add(Pattern.compile(c.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.D == null) {
                LinkedList linkedList = new LinkedList();
                this.D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.D.add(Pattern.compile("^default_npth_thread$"));
                this.D.add(Pattern.compile("^RenderThread$"));
                this.D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.D.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String b(float f2) {
        return a(f2 / 100.0f);
    }

    private void b(long j) {
        if (this.A != this.z) {
            try {
                this.s = System.currentTimeMillis();
                this.u = g.b().c();
                this.t = k.a(100, j);
                this.k = g.b().a(j).a();
                JSONObject jSONObject = new JSONObject();
                this.v = jSONObject;
                com.apm.insight.l.a.a(this.d, jSONObject);
                this.w = g();
                this.i = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.g = this.s;
                String b = o.b();
                File file = new File(new File(o.f(this.d), b), "trace_" + com.apm.insight.l.a.c(this.d).replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.i.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                com.apm.insight.runtime.r.a("anr_trace", b);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray b2 = com.apm.insight.l.i.b(file.getAbsolutePath());
                    this.p = b2;
                    a(b2);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
                if (this.j == null) {
                    this.j = d.a(true);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            com.apm.insight.l.f.a();
        } else {
            try {
                this.g = this.s;
                String b3 = o.b();
                File file2 = new File(new File(o.f(this.d), b3), "trace" + com.apm.insight.l.a.c(this.d).replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.i.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                com.apm.insight.runtime.r.a("anr_trace", b3);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray b4 = com.apm.insight.l.i.b(file2.getAbsolutePath());
                    this.p = b4;
                    a(b4);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th3);
                }
                if (this.j == null) {
                    this.j = d.a(true);
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a().a("NPTH_CATCH", th4);
            }
        }
        long j2 = this.z;
        this.A = j2;
        this.z = -1L;
        if (j2 == -1) {
            this.A = (-1) - 1;
        }
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.o.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    private int[] b(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.b == null) {
                    this.b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.b.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                int intValue = Integer.decode(split[1]).intValue();
                int intValue2 = Integer.decode(split[2]).intValue();
                return new int[]{intValue, intValue2, intValue + intValue2};
            }
        }
        return null;
    }

    private String c(long j) {
        long j2 = j - com.apm.insight.i.j();
        return j2 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS ? "0 - 30s" : j2 < 60000 ? "30s - 1min" : j2 < 120000 ? "1min - 2min" : j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS ? "2min - 5min" : j2 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j2 < 1800000 ? "10min - 30min" : j2 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a2 = l.a(256, 128, jSONArray);
        if (a2.length() != jSONArray.length()) {
            this.r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a2.length(); i++) {
                sb.append(a2.getString(i)).append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean g() {
        boolean z = !com.apm.insight.l.a.a(this.d);
        if (!z || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z;
        }
        return false;
    }

    private File h() {
        if (this.E == null) {
            this.E = new File(this.d.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.c(this.d).replaceAll(":", "_"));
        }
        return this.E;
    }

    private boolean i() {
        return com.apm.insight.runtime.a.i();
    }

    public void a() {
        if (this.e) {
            return;
        }
        this.c = new c(this);
        this.g = com.apm.insight.i.j();
        this.e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e1 A[Catch: all -> 0x0485, TRY_ENTER, TryCatch #5 {all -> 0x0485, blocks: (B:45:0x017f, B:48:0x01fc, B:50:0x0201, B:53:0x020a, B:55:0x020e, B:57:0x0214, B:58:0x021c, B:78:0x03e1, B:79:0x040a, B:81:0x040e, B:82:0x0414, B:93:0x0469, B:114:0x021a), top: B:44:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x040a A[Catch: all -> 0x0485, TryCatch #5 {all -> 0x0485, blocks: (B:45:0x017f, B:48:0x01fc, B:50:0x0201, B:53:0x020a, B:55:0x020e, B:57:0x0214, B:58:0x021c, B:78:0x03e1, B:79:0x040a, B:81:0x040e, B:82:0x0414, B:93:0x0469, B:114:0x021a), top: B:44:0x017f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean a(int i, int i2) {
        boolean z;
        boolean z2;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z3;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z5;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONArray jSONArray4;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONArray jSONArray5;
        boolean a2 = f.a();
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean a3 = a(uptimeMillis);
        String a4 = d.a(this.d, 1);
        final long currentTimeMillis = System.currentTimeMillis();
        String str5 = "normal";
        boolean z6 = TextUtils.isEmpty(a4) && a3;
        if (a3 || !TextUtils.isEmpty(a4)) {
            synchronized (this.x) {
                z = !z6;
            }
            if (this.j != null) {
                z2 = z;
                if (System.currentTimeMillis() - this.g <= 20000) {
                    str5 = z6 ? "trace_only" : "trace_last";
                    JSONObject jSONObject8 = this.j;
                    String str6 = this.l;
                    String str7 = this.m;
                    String str8 = this.n;
                    JSONArray jSONArray6 = this.p;
                    JSONArray jSONArray7 = this.u;
                    jSONArray = this.t;
                    jSONObject = this.v;
                    jSONObject2 = jSONObject8;
                    jSONObject3 = this.k;
                    boolean z7 = this.w;
                    long j = this.s;
                    z3 = z7;
                    if (!z6) {
                        this.j = null;
                        this.p = null;
                        this.t = null;
                        this.k = null;
                        this.u = null;
                        this.l = EnvironmentCompat.MEDIA_UNKNOWN;
                        this.m = EnvironmentCompat.MEDIA_UNKNOWN;
                        this.n = EnvironmentCompat.MEDIA_UNKNOWN;
                        this.r = 0;
                    }
                    jSONArray2 = jSONArray6;
                    jSONArray3 = jSONArray7;
                    String str9 = str5;
                    z4 = z2;
                    currentTimeMillis = j;
                    str = str8;
                    str2 = str7;
                    str3 = str6;
                    str4 = str9;
                }
            } else {
                z2 = z;
            }
            if (this.y) {
                this.y = false;
                str5 = "trace_after";
            }
            b(uptimeMillis);
            JSONObject jSONObject82 = this.j;
            String str62 = this.l;
            String str72 = this.m;
            String str82 = this.n;
            JSONArray jSONArray62 = this.p;
            JSONArray jSONArray72 = this.u;
            jSONArray = this.t;
            jSONObject = this.v;
            jSONObject2 = jSONObject82;
            jSONObject3 = this.k;
            boolean z72 = this.w;
            long j2 = this.s;
            z3 = z72;
            if (!z6) {
            }
            jSONArray2 = jSONArray62;
            jSONArray3 = jSONArray72;
            String str92 = str5;
            z4 = z2;
            currentTimeMillis = j2;
            str = str82;
            str2 = str72;
            str3 = str62;
            str4 = str92;
        } else {
            z3 = false;
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            jSONArray2 = null;
            jSONArray = null;
            jSONObject2 = null;
            jSONObject3 = null;
            jSONArray3 = null;
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            jSONObject = null;
            str3 = EnvironmentCompat.MEDIA_UNKNOWN;
            str4 = "normal";
            z4 = false;
        }
        if (!z6 && TextUtils.isEmpty(a4)) {
            if (this.j == null || System.currentTimeMillis() - this.g <= 20000) {
                if (this.j == null || System.currentTimeMillis() - this.g <= 2000 || !NativeImpl.g()) {
                    return false;
                }
                com.apm.insight.l.i.a(h());
                return false;
            }
            this.j = null;
            this.p = null;
            this.t = null;
            this.k = null;
            this.u = null;
            this.l = EnvironmentCompat.MEDIA_UNKNOWN;
            this.m = EnvironmentCompat.MEDIA_UNKNOWN;
            this.n = EnvironmentCompat.MEDIA_UNKNOWN;
            this.r = 0;
            File file = this.h;
            if (file != null) {
                com.apm.insight.l.i.a(file);
            }
            this.h = null;
            return false;
        }
        if (jSONObject2 == null) {
            if (jSONArray == null) {
                try {
                    jSONArray5 = g.b().c();
                    JSONObject jSONObject9 = jSONObject;
                    try {
                        jSONArray = k.a(100, uptimeMillis);
                        jSONObject3 = g.b().a(uptimeMillis).a();
                        JSONObject jSONObject10 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.d, jSONObject10);
                            jSONObject = jSONObject10;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject10;
                        }
                    } catch (Throwable unused2) {
                        jSONObject = jSONObject9;
                    }
                } catch (Throwable unused3) {
                    jSONArray5 = jSONArray3;
                }
            } else {
                jSONArray5 = jSONArray3;
            }
            try {
                jSONObject2 = d.a(a);
            } catch (Throwable unused4) {
            }
            jSONArray4 = jSONArray5;
            jSONObject4 = jSONObject2;
            z5 = z4;
            jSONObject5 = jSONObject3;
        } else {
            z5 = z4;
            jSONObject4 = jSONObject2;
            jSONObject5 = jSONObject3;
            jSONArray4 = jSONArray3;
        }
        if (jSONObject4 != null && jSONObject4.length() > 0) {
            try {
                jSONObject4.put("pid", Process.myPid());
                jSONObject4.put("package", this.d.getPackageName());
                jSONObject4.put("is_remote_process", 0);
                jSONObject4.put("is_new_stack", 10);
                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
                String str10 = str;
                aVar.a("data", (Object) jSONObject4.toString());
                JSONObject jSONObject11 = jSONObject4;
                boolean z8 = true;
                aVar.a("is_anr", (Object) 1);
                aVar.a("anrType", (Object) str4);
                aVar.a("history_message", (Object) jSONArray4);
                aVar.a("current_message", jSONObject5);
                aVar.a("pending_messages", (Object) jSONArray);
                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                aVar.a("crash_time", Long.valueOf(currentTimeMillis));
                com.apm.insight.c.b.b();
                aVar.c(jSONObject);
                aVar.a("anr_info", (Object) (z6 ? "Resons for no ANR_INFO:\n1. User click close button too quickly as soon as the ANR dialog appear.\n2. User close the app since can not stand the carton.\n3. Some OS force stop the process group without any hint dialog.\n\nThe ANR will be upload by the follow ways only:\n1. Receive the ANR signal(SIGQUIT).\n2. The app is forground or was forground last 2s.\n3. Happens in main process.\n4. Process was killed exactly." : a4));
                if (jSONArray2 != null) {
                    aVar.a("dump_trace", (Object) jSONArray2);
                }
                aVar.a("all_thread_stacks", (z6 || !((jSONObject7 = this.q) == null || jSONObject7.length() == 0)) ? this.q : v.b((String) null));
                com.apm.insight.entity.a a5 = com.apm.insight.runtime.a.f.a().a(CrashType.ANR, aVar);
                a5.a("is_background", Boolean.valueOf(z3));
                a5.a("logcat", (Object) com.apm.insight.runtime.k.b(com.apm.insight.i.f()));
                a5.a("has_dump", (Object) "true");
                a5.a("crash_uuid", (Object) com.apm.insight.i.a(currentTimeMillis, CrashType.ANR, false, false));
                a5.a("jiffy", Long.valueOf(q.a.a()));
                JSONObject optJSONObject = a5.h().optJSONObject("filters");
                com.apm.insight.entity.d.b(a5.h());
                if (optJSONObject == null) {
                    try {
                        jSONObject6 = new JSONObject();
                        try {
                            a5.a("filters", jSONObject6);
                        } catch (Throwable unused5) {
                            optJSONObject = jSONObject6;
                            jSONObject6 = optJSONObject;
                            if (z6) {
                            }
                            return z5;
                        }
                    } catch (Throwable unused6) {
                        jSONObject6 = optJSONObject;
                        if (z6) {
                        }
                        return z5;
                    }
                } else {
                    jSONObject6 = optJSONObject;
                }
                jSONObject6.put("anrType", str4);
                jSONObject6.put("max_utm_thread", str3);
                jSONObject6.put("max_stm_thread", str2);
                jSONObject6.put("max_utm_stm_thread", str10);
                jSONObject6.put("max_utm_thread_version", this.o);
                jSONObject6.put("crash_length", c(currentTimeMillis));
                jSONObject6.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                jSONObject6.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.b.b()));
                jSONObject6.put("sdk_version", "1.3.8.nourl-alpha.19");
                jSONObject6.put("has_logcat", String.valueOf(a5.a()));
                jSONObject6.put("memory_leak", String.valueOf(a5.f()));
                jSONObject6.put("fd_leak", String.valueOf(a5.d()));
                jSONObject6.put("threads_leak", String.valueOf(a5.e()));
                jSONObject6.put("is_64_devices", String.valueOf(Header.a()));
                jSONObject6.put("is_64_runtime", String.valueOf(NativeImpl.e()));
                jSONObject6.put("is_x86_devices", String.valueOf(Header.b()));
                jSONObject6.put("has_meminfo_file", String.valueOf(a5.g()));
                jSONObject6.put("is_root", com.apm.insight.nativecrash.c.m() ? "true" : "false");
                if (this.y) {
                    z8 = false;
                }
                jSONObject6.put("anr_normal_trace", String.valueOf(z8));
                jSONObject6.put("anr_no_run", String.valueOf(a2));
                jSONObject6.put("crash_after_crash", Npth.hasCrash() ? "true" : "false");
                jSONObject6.put("from_file", String.valueOf(d.a()));
                jSONObject6.put("has_dump", "true");
                jSONObject6.put("from_kill", String.valueOf(z6));
                jSONObject6.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                int i3 = this.r;
                if (i3 > 0) {
                    jSONObject6.put("may_have_stack_overflow", String.valueOf(i3));
                }
                if (!z6) {
                    try {
                        a(a4, jSONObject6);
                    } catch (Throwable th) {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                    }
                } else if (!i()) {
                    jSONObject6.put("aid", String.valueOf(a5.i().f().opt("aid")));
                    a5.i().f().put("aid", 2010);
                }
                if (z6) {
                    String c = com.apm.insight.k.e.c();
                    File file2 = new File(o.a(this.d), com.apm.insight.i.a(currentTimeMillis, CrashType.ANR, false, false));
                    this.h = file2;
                    com.apm.insight.l.i.a(file2, file2.getName(), c, a5.h(), com.apm.insight.k.e.b());
                } else {
                    File file3 = this.h;
                    if (file3 != null) {
                        com.apm.insight.l.i.a(file3);
                        this.h = null;
                    }
                    com.apm.insight.a.a.a().a(CrashType.ANR, currentTimeMillis, com.apm.insight.i.e());
                    try {
                        if (com.apm.insight.l.f.f().length() > 1024) {
                            a5.a("has_system_traces", "true");
                        }
                    } catch (Throwable unused7) {
                    }
                    try {
                        JSONArray a6 = com.apm.insight.nativecrash.d.a(o.e(com.apm.insight.i.f()), o.f(com.apm.insight.i.f()));
                        jSONObject6.put("leak_threads_count", String.valueOf(a6.length()));
                        if (a6.length() > 0) {
                            com.apm.insight.l.i.a(o.g(com.apm.insight.i.f()), a6, false);
                        }
                    } catch (Throwable unused8) {
                    }
                    String optString = jSONObject11.optString("mainStackFromTrace");
                    JSONArray a7 = com.apm.insight.entity.b.a(optString);
                    com.apm.insight.entity.b.a(a5.h(), a7, new b.a() { // from class: com.apm.insight.b.b.2
                        @Override // com.apm.insight.entity.b.a
                        public void a(JSONObject jSONObject12) {
                            com.apm.insight.k.d.a().a(jSONObject12, currentTimeMillis, b.this.i);
                        }
                    });
                    b(optString, a7);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        return z5;
    }

    public void b() {
        if (this.e) {
            this.e = false;
            c cVar = this.c;
            if (cVar != null) {
                cVar.b();
            }
            this.c = null;
        }
    }

    public void c() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void d() {
        if (f) {
            return;
        }
        synchronized (this.x) {
            if (f) {
                return;
            }
            this.B.run();
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                com.apm.insight.l.i.a(h(), String.valueOf(this.C + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        this.z = SystemClock.uptimeMillis();
        this.y = true;
    }

    public void f() {
        File h = h();
        try {
            int intValue = Integer.decode(com.apm.insight.l.i.c(h.getAbsolutePath())).intValue();
            this.C = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.i.a(h);
        }
    }
}
