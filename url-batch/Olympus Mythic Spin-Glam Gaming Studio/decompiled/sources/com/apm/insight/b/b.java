package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.c;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ANRManager.java */
/* loaded from: classes15.dex */
public final class b {
    private static volatile boolean z = true;
    private c a;
    private final Context b;
    private volatile boolean c;
    private JSONObject g;
    private JSONObject h;
    private JSONArray m;
    private JSONObject n;
    private JSONArray q;
    private JSONArray r;
    private JSONObject s;
    private boolean t;
    private volatile boolean v;
    private long d = -1;
    private File e = null;
    private boolean f = true;
    private String i = "unknown";
    private String j = "unknown";
    private String k = "unknown";
    private String l = "npth_inner_default";
    private int o = 0;
    private long p = -1;
    private final Object u = new Object();
    private long w = -1;
    private long x = 0;
    private final Runnable y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.b = context;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.a = new c(this);
        this.d = com.apm.insight.e.j();
        this.c = true;
    }

    public final void b() {
        if (this.c) {
            this.c = false;
            c cVar = this.a;
            if (cVar != null) {
                cVar.b();
            }
            this.a = null;
        }
    }

    public final void c() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.u) {
        }
        this.y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
        this.w = SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        File i = i();
        try {
            int intValue = Integer.decode(com.apm.insight.l.f.a(i.getAbsolutePath(), "\n")).intValue();
            this.A = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(i);
        }
    }

    private boolean a(long j) {
        if (this.v) {
            this.v = false;
            b(j);
        }
        return false;
    }

    private static boolean h() {
        boolean a = com.apm.insight.l.a.a();
        boolean z2 = !a;
        if (a || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private void b(long j) {
        if (this.x != this.w) {
            try {
                this.p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.r = f.b().b();
                    this.q = j.a(j);
                    this.h = f.b().a(j).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.s = jSONObject;
                com.apm.insight.l.a.a(this.b, jSONObject);
                this.t = h();
                this.f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.d = this.p;
                String b = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.b), b), "trace_" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", b);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray a = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.m = a;
                    a(a);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.d = this.p;
                String b2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.b), b2), "trace" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", b2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray a2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.m = a2;
                    a(a2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.w;
        this.x = j2;
        this.w = -1L;
        if (j2 == -1) {
            this.x = (-1) - 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONArray jSONArray) {
        char c;
        String substring;
        int[] iArr;
        int[] iArr2;
        if (jSONArray == null) {
            return;
        }
        this.g = null;
        this.n = null;
        this.o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int[] iArr3 = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String str = null;
        boolean z2 = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (TextUtils.isEmpty(optString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                    if (this.g == null && X3.i.Z.equals(str)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(str, jSONArray5));
                    }
                    try {
                        if (!X3.i.Z.equals(str)) {
                            str = str.substring(0, str.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str2 = str;
                    if (!a(str2)) {
                        try {
                            iArr2 = b(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e, "NPTH_CATCH");
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            str = null;
                            c = 2;
                        } catch (Throwable unused2) {
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            str = null;
                            c = 2;
                        }
                        if (iArr2 != null) {
                            int i2 = iArr2[0];
                            if (i2 > iArr3[0]) {
                                iArr3[0] = i2;
                                this.i = str2;
                            }
                            int i3 = iArr2[1];
                            if (i3 > iArr3[1]) {
                                iArr3[1] = i3;
                                this.j = str2;
                            }
                            int i4 = iArr2[2];
                            if (i4 > iArr3[2]) {
                                iArr3[2] = i4;
                                this.k = str2;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                str = null;
            } else {
                if (!z2) {
                    c = 2;
                    if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                        z2 = true;
                    }
                    jSONArray3.put(optString);
                } else if (z2) {
                    if (optString.contains(" prio=")) {
                        if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                            if (this.g == null && X3.i.Z.equals(str)) {
                                this.g = c(jSONArray5);
                            } else {
                                jSONArray2.put(a(str, jSONArray5));
                            }
                            try {
                                if (!X3.i.Z.equals(str)) {
                                    str = str.substring(0, str.indexOf(40)).trim();
                                }
                            } catch (Throwable unused3) {
                            }
                            String str3 = str;
                            if (!a(str3)) {
                                try {
                                    iArr = b(jSONArray5);
                                } catch (IllegalArgumentException e2) {
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(e2, "NPTH_CATCH");
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    substring = optString.substring(1, optString.indexOf(34, 1));
                                    if (X3.i.Z.equals(substring)) {
                                    }
                                    if (jSONArray5.length() > 0) {
                                    }
                                    jSONArray5.put(optString);
                                } catch (Throwable unused4) {
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    substring = optString.substring(1, optString.indexOf(34, 1));
                                    if (X3.i.Z.equals(substring)) {
                                    }
                                    if (jSONArray5.length() > 0) {
                                    }
                                    jSONArray5.put(optString);
                                }
                                if (iArr != null) {
                                    int i5 = iArr[0];
                                    if (i5 > iArr3[0]) {
                                        iArr3[0] = i5;
                                        this.i = str3;
                                    }
                                    int i6 = iArr[1];
                                    if (i6 > iArr3[1]) {
                                        iArr3[1] = i6;
                                        this.j = str3;
                                    }
                                    int i7 = iArr[2];
                                    if (i7 > iArr3[2]) {
                                        iArr3[2] = i7;
                                        this.k = str3;
                                    }
                                }
                            }
                        }
                        substring = optString.substring(1, optString.indexOf(34, 1));
                        if (X3.i.Z.equals(substring)) {
                            c = 2;
                            str = substring;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(substring);
                            sb.append("  (");
                            c = 2;
                            sb.append(optString.substring(optString.indexOf(34, 2) + 1));
                            sb.append(" )");
                            str = sb.toString();
                        }
                        if (jSONArray5.length() > 0) {
                            jSONArray5 = new JSONArray();
                        }
                        jSONArray5.put(optString);
                    } else {
                        c = 2;
                        if (TextUtils.isEmpty(str)) {
                            jSONArray3.put(optString);
                        } else {
                            jSONArray5.put(optString);
                        }
                    }
                }
            }
            c = 2;
        }
        if (jSONArray2.length() > 0) {
            this.m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray b = com.apm.insight.runtime.a.b();
            if (b != null) {
                this.B = new LinkedList();
                this.l = b.optString(0);
                for (int i = 1; i < b.length(); i++) {
                    try {
                        this.B.add(Pattern.compile(b.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] split = this.C.split(optString.substring(indexOf));
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

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray b = com.apm.insight.a.b(jSONArray);
        if (b.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < b.length(); i++) {
                sb.append(b.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray b = com.apm.insight.a.b(jSONArray);
        if (b.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(":", "_"));
        }
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r3 != 5) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b0 A[LOOP:2: B:91:0x01e4->B:120:0x02b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b8 A[EDGE_INSN: B:121:0x02b8->B:122:0x02b8 BREAK  A[LOOP:2: B:91:0x01e4->B:120:0x02b0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03cc A[EDGE_INSN: B:19:0x03cc->B:20:0x03cc BREAK  A[LOOP:0: B:2:0x0044->B:37:0x03e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, JSONObject jSONObject) throws JSONException {
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr;
        int i;
        String str2;
        char c;
        char c2;
        String str3;
        char c3;
        boolean z2;
        String str4;
        String str5;
        String trim;
        String str6;
        HashMap hashMap3;
        String str7;
        int i2;
        char c4;
        String[] strArr2;
        String str8;
        b bVar = this;
        SystemClock.uptimeMillis();
        String[] split = str.split("\n");
        float[] fArr = new float[3];
        int i3 = 0;
        Float valueOf = Float.valueOf(-1.0f);
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        fArr[2] = -1.0f;
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        int length = split.length;
        String str9 = "unknown";
        char c5 = 0;
        boolean z3 = false;
        String str10 = "unknown";
        String str11 = str10;
        while (true) {
            if (i3 >= length) {
                hashMap = hashMap7;
                hashMap2 = hashMap8;
                break;
            }
            String str12 = split[i3];
            if (!TextUtils.isEmpty(str12)) {
                strArr = split;
                i = length;
                if (c5 == 0) {
                    c2 = c5;
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str9;
                    str3 = str10;
                    String trim2 = str12.trim();
                    if (trim2.startsWith("tag:")) {
                        str10 = trim2.replace("tag:", "").trim();
                        c = 1;
                        c3 = 4;
                    }
                    str10 = str3;
                    c = c2;
                    c3 = 4;
                } else if (c5 == 1) {
                    c2 = c5;
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str9;
                    str12 = str12.trim();
                    String lowerCase = str12.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        str12.substring(str12.indexOf(58));
                        z2 = false;
                    } else if (lowerCase.startsWith("reason:")) {
                        str12.substring(str12.indexOf(58));
                        z2 = true;
                    } else {
                        str3 = str10;
                        if (lowerCase.contains("appfreeze")) {
                            str11 = "AppFreeze";
                            c = '\n';
                            str10 = str3;
                            c3 = 4;
                        }
                        str10 = str3;
                        c = c2;
                        c3 = 4;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str5 = "Input dispatching timed out";
                    } else if (lowerCase.contains("broadcast of intent")) {
                        str5 = "Broadcast of Intent";
                    } else if (lowerCase.contains("executing service")) {
                        str4 = str10;
                        if (!POBCommonConstants.NULL_VALUE.equalsIgnoreCase(str4)) {
                            str11 = "executing service";
                            str10 = str4;
                            if (z2) {
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        } else {
                            str10 = str12.substring(str12.indexOf("service ") + 8).trim();
                            str11 = "executing service";
                            if (z2) {
                                c = 2;
                                c3 = 4;
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        }
                    } else {
                        str4 = str10;
                        if (lowerCase.contains("service.startforeground")) {
                            str11 = "not call Service.startForeground";
                            str10 = str4;
                            if (z2) {
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        } else {
                            str10 = str4;
                            str11 = str2;
                            if (z2) {
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        }
                    }
                    str11 = str5;
                    if (z2) {
                    }
                    trim = str12.trim();
                    if (trim.startsWith("Load:")) {
                    }
                } else if (c5 != 2) {
                    if (c5 != 3) {
                        c2 = c5;
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                        str2 = str9;
                        str3 = str10;
                    } else {
                        String[] split2 = str12.split("\\s");
                        c2 = c5;
                        str2 = str9;
                        if (split2.length >= 2) {
                            if ("CPU".equalsIgnoreCase(split2[0]) && "usage".equalsIgnoreCase(split2[1])) {
                                if (str12.contains("ago")) {
                                    z3 = true;
                                }
                                if (hashMap4.isEmpty() && hashMap5.isEmpty() && hashMap6.isEmpty() && hashMap8.isEmpty() && hashMap7.isEmpty()) {
                                    hashMap = hashMap7;
                                    hashMap2 = hashMap8;
                                    c = c2;
                                    c3 = 4;
                                }
                            } else if (hashMap4.isEmpty() || hashMap5.isEmpty() || hashMap6.isEmpty() || hashMap8.isEmpty() || hashMap7.isEmpty()) {
                                if (hashMap4.isEmpty() && split2[1].equalsIgnoreCase("TOTAL:")) {
                                    str6 = "";
                                    hashMap3 = hashMap4;
                                } else if (str12.contains(bVar.b.getPackageName())) {
                                    str6 = "";
                                    int i4 = 0;
                                    while (i4 < split2.length) {
                                        if (split2[i4].contains(bVar.b.getPackageName())) {
                                            StringBuilder sb = new StringBuilder();
                                            String str13 = split2[i4];
                                            sb.append(str13.substring(str13.indexOf(47) + 1, split2[i4].length() - 1));
                                            sb.append('_');
                                            str6 = sb.toString();
                                        }
                                        i4++;
                                        bVar = this;
                                    }
                                    hashMap3 = hashMap6;
                                } else if (hashMap5.isEmpty() && str12.contains("system_server:")) {
                                    str6 = "";
                                    hashMap3 = hashMap5;
                                } else if (hashMap8.isEmpty() && str12.contains("kswapd")) {
                                    str6 = "";
                                    hashMap3 = hashMap8;
                                } else if (!hashMap7.isEmpty() || !str12.contains("dex2oat")) {
                                    str6 = "";
                                    hashMap3 = null;
                                } else {
                                    str6 = "";
                                    hashMap3 = hashMap7;
                                }
                                if (hashMap3 != null) {
                                    int i5 = 0;
                                    try {
                                        do {
                                            str7 = "%";
                                            if (!split2[i5].contains("%")) {
                                                i5++;
                                            }
                                            break;
                                        } while (i5 < split2.length);
                                        break;
                                        float floatValue = Float.valueOf(split2[i5].replace("%", "")).floatValue();
                                        hashMap = hashMap7;
                                        try {
                                            String str14 = str6 + X3.i.l;
                                            if (hashMap3 == hashMap4) {
                                                hashMap2 = hashMap8;
                                            } else {
                                                hashMap2 = hashMap8;
                                                try {
                                                    floatValue /= com.apm.insight.l.d.d();
                                                } catch (Throwable unused) {
                                                    hashMap3.put(str6 + X3.i.l, valueOf);
                                                    i2 = i5 + 3;
                                                    char c6 = 0;
                                                    while (i2 < split2.length) {
                                                    }
                                                    str3 = str10;
                                                    str10 = str3;
                                                    c = c2;
                                                    c3 = 4;
                                                    if (c >= c3) {
                                                    }
                                                }
                                            }
                                            hashMap3.put(str14, Float.valueOf(floatValue));
                                        } catch (Throwable unused2) {
                                            hashMap2 = hashMap8;
                                            hashMap3.put(str6 + X3.i.l, valueOf);
                                            i2 = i5 + 3;
                                            char c62 = 0;
                                            while (i2 < split2.length) {
                                            }
                                            str3 = str10;
                                            str10 = str3;
                                            c = c2;
                                            c3 = 4;
                                            if (c >= c3) {
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                        hashMap = hashMap7;
                                    }
                                    i2 = i5 + 3;
                                    char c622 = 0;
                                    while (i2 < split2.length) {
                                        String str15 = "softirq";
                                        if (c622 == 0) {
                                            c4 = c622;
                                            if (POBConstants.KEY_USER.equalsIgnoreCase(split2[i2])) {
                                                str15 = POBConstants.KEY_USER;
                                                c622 = 1;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                        } else if (c622 == 1) {
                                            c4 = c622;
                                        } else if (c622 == 2) {
                                            c4 = c622;
                                            if ("iowait".equalsIgnoreCase(split2[i2])) {
                                                str15 = "iowait";
                                                c622 = 3;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            if ("irq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            c622 = c4;
                                            str15 = null;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        } else if (c622 == 3) {
                                            c4 = c622;
                                            if ("irq".equalsIgnoreCase(split2[i2])) {
                                                str15 = "irq";
                                                c622 = 4;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            c622 = c4;
                                            str15 = null;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        } else if (c622 != 4) {
                                            c4 = c622;
                                        } else {
                                            c4 = c622;
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                                c622 = 5;
                                                if (str15 == null) {
                                                    try {
                                                        float floatValue2 = Float.valueOf(split2[i2 - 1].replace(str7, "")).floatValue();
                                                        strArr2 = split2;
                                                        try {
                                                            String str16 = str6 + str15;
                                                            if (hashMap3 == hashMap4) {
                                                                str8 = str7;
                                                            } else {
                                                                str8 = str7;
                                                                try {
                                                                    floatValue2 /= com.apm.insight.l.d.d();
                                                                } catch (Throwable unused4) {
                                                                    hashMap3.put(str6 + str15, valueOf);
                                                                    if (c622 < 6) {
                                                                    }
                                                                }
                                                            }
                                                            hashMap3.put(str16, Float.valueOf(floatValue2));
                                                        } catch (Throwable unused5) {
                                                            str8 = str7;
                                                            hashMap3.put(str6 + str15, valueOf);
                                                            if (c622 < 6) {
                                                            }
                                                        }
                                                    } catch (Throwable unused6) {
                                                        strArr2 = split2;
                                                    }
                                                } else {
                                                    strArr2 = split2;
                                                    str8 = str7;
                                                }
                                                if (c622 < 6) {
                                                    break;
                                                }
                                                i2 += 3;
                                                split2 = strArr2;
                                                str7 = str8;
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                                c622 = 6;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            c622 = c4;
                                            str15 = null;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(split2[i2])) {
                                            str15 = "kernel";
                                            c622 = 2;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        }
                                        if ("iowait".equalsIgnoreCase(split2[i2])) {
                                        }
                                        if ("irq".equalsIgnoreCase(split2[i2])) {
                                        }
                                        if ("softirq".equalsIgnoreCase(split2[i2])) {
                                        }
                                        if ("softirq".equalsIgnoreCase(split2[i2])) {
                                        }
                                        c622 = c4;
                                        str15 = null;
                                        if (str15 == null) {
                                        }
                                        if (c622 < 6) {
                                        }
                                    }
                                    str3 = str10;
                                }
                            }
                            hashMap = hashMap7;
                            hashMap2 = hashMap8;
                            c = 4;
                            c3 = 4;
                        }
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                        str3 = str10;
                    }
                    str10 = str3;
                    c = c2;
                    c3 = 4;
                } else {
                    c2 = c5;
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str9;
                    trim = str12.trim();
                    if (trim.startsWith("Load:")) {
                        c = c2;
                        c3 = 4;
                    } else {
                        String[] split3 = trim.replace("Load:", "").trim().split("/");
                        if (3 == split3.length) {
                            for (int i6 = 0; i6 < split3.length; i6++) {
                                fArr[i6] = Float.valueOf(split3[i6]).floatValue();
                            }
                        }
                        c = 3;
                        c3 = 4;
                    }
                }
                if (c >= c3) {
                    break;
                }
            } else {
                strArr = split;
                hashMap = hashMap7;
                hashMap2 = hashMap8;
                i = length;
                str2 = str9;
                c = c5;
            }
            i3++;
            c5 = c;
            split = strArr;
            length = i;
            str9 = str2;
            hashMap7 = hashMap;
            hashMap8 = hashMap2;
            bVar = this;
        }
        String str17 = str11;
        jSONObject.put("anr_tag", str10);
        jSONObject.put("anr_has_ago", String.valueOf(z3));
        jSONObject.put("anr_reason", str17);
        a(hashMap6, jSONObject, "app");
        a(hashMap4, jSONObject, X3.i.l);
        if (hashMap5.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(c.AnonymousClass1.a(hashMap5).floatValue()));
        }
        if (hashMap2.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(c.AnonymousClass1.a(hashMap2).floatValue()));
        }
        if (hashMap.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(c.AnonymousClass1.a(hashMap).floatValue()));
        }
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) throws JSONException {
        String concat = "npth_anr_".concat(String.valueOf(str));
        if (hashMap.isEmpty()) {
            jSONObject.put(concat + "_total", "not found");
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith(POBConstants.KEY_USER)) {
                f += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                f2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                f3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                f4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                f5 += entry.getValue().floatValue();
            }
        }
        float f6 = f + f2 + f3 + f4 + f5;
        jSONObject.put(concat + "_total", b(f6));
        jSONObject.put(concat + "_kernel_user_ratio", a(f2, f6));
        jSONObject.put(concat + "_iowait_user_ratio", a(f3, f6));
    }

    private static String a(float f, float f2) {
        if (f2 > 0.0f) {
            return a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    private static String a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        if (f <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }

    private static String b(float f) {
        return a(f / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0196 A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x0147, B:44:0x0196, B:45:0x01a9, B:47:0x01cc, B:48:0x01d1, B:50:0x01d7, B:52:0x01df, B:53:0x01e6, B:70:0x03c3, B:81:0x0412, B:120:0x01e2), top: B:41:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cc A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x0147, B:44:0x0196, B:45:0x01a9, B:47:0x01cc, B:48:0x01d1, B:50:0x01d7, B:52:0x01df, B:53:0x01e6, B:70:0x03c3, B:81:0x0412, B:120:0x01e2), top: B:41:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03aa A[Catch: all -> 0x0238, TRY_LEAVE, TryCatch #5 {all -> 0x0238, blocks: (B:117:0x0232, B:56:0x023c, B:59:0x02a8, B:62:0x0355, B:65:0x037b, B:67:0x03aa, B:88:0x03b9, B:69:0x03b3), top: B:116:0x0232, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03d9 A[Catch: all -> 0x03e0, TRY_LEAVE, TryCatch #0 {all -> 0x03e0, blocks: (B:72:0x03cb, B:74:0x03d9), top: B:71:0x03cb }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0407 A[Catch: all -> 0x0412, TRY_LEAVE, TryCatch #1 {all -> 0x0412, blocks: (B:77:0x03e0, B:79:0x0407), top: B:76:0x03e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean g() {
        String str;
        String str2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        boolean z2;
        JSONObject jSONObject2;
        boolean z3;
        String str3;
        String str4;
        JSONArray jSONArray3;
        final long j;
        JSONObject jSONObject3;
        JSONObject optJSONObject;
        JSONObject jSONObject4;
        JSONArray a;
        long j2;
        String str5;
        int i;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        boolean b = com.apm.insight.runtime.i.a().b();
        long uptimeMillis = SystemClock.uptimeMillis();
        a(uptimeMillis);
        String a2 = d.a(this.b);
        long currentTimeMillis = System.currentTimeMillis();
        String str6 = Constants.NORMAL;
        TextUtils.isEmpty(a2);
        if (TextUtils.isEmpty(a2)) {
            str = "unknown";
            str2 = "unknown";
            jSONArray = null;
            jSONArray2 = null;
            jSONObject = null;
            z2 = false;
            jSONObject2 = null;
            z3 = false;
            str3 = Constants.NORMAL;
            str4 = "unknown";
            jSONArray3 = null;
            j = currentTimeMillis;
            jSONObject3 = null;
        } else {
            synchronized (this.u) {
            }
            if (this.g != null && System.currentTimeMillis() - this.d <= 20000) {
                str6 = "trace_last";
            } else {
                if (this.v) {
                    this.v = false;
                    str6 = "trace_after";
                }
                b(uptimeMillis);
            }
            JSONObject jSONObject7 = this.g;
            String str7 = this.i;
            String str8 = this.j;
            String str9 = this.k;
            JSONArray jSONArray4 = this.m;
            JSONArray jSONArray5 = this.r;
            JSONArray jSONArray6 = this.q;
            JSONObject jSONObject8 = this.s;
            JSONObject jSONObject9 = this.h;
            z3 = this.t;
            long j3 = this.p;
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            jSONArray2 = jSONArray6;
            str2 = str9;
            str4 = str7;
            jSONArray3 = jSONArray4;
            jSONObject2 = jSONObject9;
            jSONObject = jSONObject8;
            jSONArray = jSONArray5;
            str = str8;
            str3 = str6;
            j = j3;
            jSONObject3 = jSONObject7;
            z2 = true;
        }
        if (TextUtils.isEmpty(a2)) {
            if (this.g != null && System.currentTimeMillis() - this.d > 20000) {
                this.g = null;
                this.m = null;
                this.q = null;
                this.h = null;
                this.r = null;
                this.i = "unknown";
                this.j = "unknown";
                this.k = "unknown";
                this.o = 0;
                this.e = null;
                return false;
            }
            if (this.g == null || System.currentTimeMillis() - this.d <= 2000 || !NativeImpl.h()) {
                return false;
            }
            com.apm.insight.l.f.a(i());
            return false;
        }
        if (jSONObject3 == null) {
            if (jSONArray2 == null) {
                try {
                    jSONArray = f.b().b();
                    jSONArray2 = j.a(uptimeMillis);
                    jSONObject5 = jSONObject3;
                    try {
                        jSONObject2 = f.b().a(uptimeMillis).a();
                        jSONObject6 = new JSONObject();
                    } catch (Throwable unused) {
                    }
                    try {
                        com.apm.insight.l.a.a(this.b, jSONObject6);
                        jSONObject = jSONObject6;
                    } catch (Throwable unused2) {
                        jSONObject = jSONObject6;
                        jSONObject3 = jSONObject5;
                        JSONObject jSONObject10 = jSONObject2;
                        if (jSONObject3 != null) {
                            try {
                                jSONObject3.put("pid", Process.myPid());
                                jSONObject3.put("package", this.b.getPackageName());
                                jSONObject3.put("is_remote_process", 0);
                                jSONObject3.put("is_new_stack", 10);
                                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
                                String str10 = str2;
                                aVar.a("data", (Object) jSONObject3.toString());
                                JSONObject jSONObject11 = jSONObject3;
                                aVar.a("is_anr", (Object) 1);
                                aVar.a("anrType", (Object) str3);
                                if (com.apm.insight.e.x()) {
                                }
                                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                                aVar.a("crash_time", Long.valueOf(j));
                                com.apm.insight.c.a.b();
                                aVar.c(jSONObject);
                                aVar.a("anr_info", (Object) a2);
                                if (jSONArray3 != null) {
                                }
                                JSONObject jSONObject12 = this.n;
                                aVar.a("all_thread_stacks", (jSONObject12 != null || jSONObject12.length() == 0) ? m.b((String) null) : this.n);
                                com.apm.insight.runtime.a.f a3 = com.apm.insight.runtime.a.f.a();
                                CrashType crashType = CrashType.ANR;
                                com.apm.insight.entity.a a4 = a3.a(crashType, aVar);
                                a4.a("is_background", Boolean.valueOf(z3));
                                a4.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                                a4.a("has_dump", (Object) "true");
                                a4.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType, false, false));
                                optJSONObject = a4.c().optJSONObject("filters");
                                com.apm.insight.entity.d.b(a4.c());
                                if (optJSONObject != null) {
                                }
                                jSONObject4.put("anrType", str3);
                                jSONObject4.put("max_utm_thread", str4);
                                jSONObject4.put("max_stm_thread", str);
                                jSONObject4.put("max_utm_stm_thread", str10);
                                jSONObject4.put("max_utm_thread_version", this.l);
                                j2 = j - com.apm.insight.e.j();
                                if (j2 >= 30000) {
                                }
                                jSONObject4.put("crash_length", str5);
                                jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                                jSONObject4.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                                jSONObject4.put("sdk_version", "2008-20250701130429");
                                jSONObject4.put("has_logcat", String.valueOf(a4.a()));
                                jSONObject4.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                                jSONObject4.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                                jSONObject4.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                                jSONObject4.put("is_64_devices", String.valueOf(Header.a()));
                                jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                                jSONObject4.put("is_x86_devices", String.valueOf(Header.b()));
                                jSONObject4.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                                jSONObject4.put("is_root", !com.apm.insight.nativecrash.a.k() ? "true" : "false");
                                jSONObject4.put("anr_normal_trace", String.valueOf(!this.v));
                                jSONObject4.put("anr_no_run", String.valueOf(b));
                                jSONObject4.put("crash_after_crash", !Npth.hasCrash() ? "true" : "false");
                                jSONObject4.put("from_file", String.valueOf(d.b()));
                                jSONObject4.put("has_dump", "true");
                                jSONObject4.put("from_kill", "false");
                                jSONObject4.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                                i = this.o;
                                if (i > 0) {
                                }
                                try {
                                    a(a2, jSONObject4);
                                } catch (Throwable th) {
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                }
                                com.apm.insight.a.a.a();
                                CrashType crashType2 = CrashType.LAUNCH;
                                com.apm.insight.e.e();
                                try {
                                    if (com.apm.insight.a.e().length() > 1024) {
                                    }
                                } catch (Throwable unused3) {
                                }
                                try {
                                    a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                                    jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
                                    if (a.length() > 0) {
                                    }
                                } catch (Throwable unused4) {
                                }
                                String optString = jSONObject11.optString("mainStackFromTrace");
                                JSONArray a5 = com.apm.insight.entity.b.a(optString);
                                com.apm.insight.entity.b.a(a4.c(), a5, new b.a() { // from class: com.apm.insight.b.b.2
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject13) {
                                        com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                                    }
                                });
                                b(optString, a5);
                            } catch (Throwable th2) {
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                            }
                        }
                        return z2;
                    }
                } catch (Throwable unused5) {
                    jSONObject5 = jSONObject3;
                }
            } else {
                jSONObject5 = jSONObject3;
            }
            jSONObject3 = d.a();
        }
        JSONObject jSONObject102 = jSONObject2;
        if (jSONObject3 != null && jSONObject3.length() > 0) {
            jSONObject3.put("pid", Process.myPid());
            jSONObject3.put("package", this.b.getPackageName());
            jSONObject3.put("is_remote_process", 0);
            jSONObject3.put("is_new_stack", 10);
            com.apm.insight.entity.a aVar2 = new com.apm.insight.entity.a(new JSONObject());
            String str102 = str2;
            aVar2.a("data", (Object) jSONObject3.toString());
            JSONObject jSONObject112 = jSONObject3;
            aVar2.a("is_anr", (Object) 1);
            aVar2.a("anrType", (Object) str3);
            if (com.apm.insight.e.x()) {
                aVar2.a("history_message", (Object) jSONArray);
                aVar2.a("current_message", jSONObject102);
                aVar2.a("pending_messages", (Object) jSONArray2);
            }
            aVar2.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar2.a("crash_time", Long.valueOf(j));
            com.apm.insight.c.a.b();
            aVar2.c(jSONObject);
            aVar2.a("anr_info", (Object) a2);
            if (jSONArray3 != null) {
                aVar2.a("dump_trace", (Object) jSONArray3);
            }
            JSONObject jSONObject122 = this.n;
            aVar2.a("all_thread_stacks", (jSONObject122 != null || jSONObject122.length() == 0) ? m.b((String) null) : this.n);
            com.apm.insight.runtime.a.f a32 = com.apm.insight.runtime.a.f.a();
            CrashType crashType3 = CrashType.ANR;
            com.apm.insight.entity.a a42 = a32.a(crashType3, aVar2);
            a42.a("is_background", Boolean.valueOf(z3));
            a42.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
            a42.a("has_dump", (Object) "true");
            a42.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType3, false, false));
            optJSONObject = a42.c().optJSONObject("filters");
            com.apm.insight.entity.d.b(a42.c());
            if (optJSONObject != null) {
                try {
                    jSONObject4 = new JSONObject();
                } catch (Throwable unused6) {
                    jSONObject4 = optJSONObject;
                    com.apm.insight.a.a.a();
                    CrashType crashType22 = CrashType.LAUNCH;
                    com.apm.insight.e.e();
                    if (com.apm.insight.a.e().length() > 1024) {
                    }
                    a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                    jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
                    if (a.length() > 0) {
                    }
                    String optString2 = jSONObject112.optString("mainStackFromTrace");
                    JSONArray a52 = com.apm.insight.entity.b.a(optString2);
                    com.apm.insight.entity.b.a(a42.c(), a52, new b.a() { // from class: com.apm.insight.b.b.2
                        @Override // com.apm.insight.entity.b.a
                        public final void a(JSONObject jSONObject13) {
                            com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                        }
                    });
                    b(optString2, a52);
                    return z2;
                }
                try {
                    a42.a("filters", jSONObject4);
                } catch (Throwable unused7) {
                    optJSONObject = jSONObject4;
                    jSONObject4 = optJSONObject;
                    com.apm.insight.a.a.a();
                    CrashType crashType222 = CrashType.LAUNCH;
                    com.apm.insight.e.e();
                    if (com.apm.insight.a.e().length() > 1024) {
                    }
                    a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                    jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
                    if (a.length() > 0) {
                    }
                    String optString22 = jSONObject112.optString("mainStackFromTrace");
                    JSONArray a522 = com.apm.insight.entity.b.a(optString22);
                    com.apm.insight.entity.b.a(a42.c(), a522, new b.a() { // from class: com.apm.insight.b.b.2
                        @Override // com.apm.insight.entity.b.a
                        public final void a(JSONObject jSONObject13) {
                            com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                        }
                    });
                    b(optString22, a522);
                    return z2;
                }
            } else {
                jSONObject4 = optJSONObject;
            }
            jSONObject4.put("anrType", str3);
            jSONObject4.put("max_utm_thread", str4);
            jSONObject4.put("max_stm_thread", str);
            jSONObject4.put("max_utm_stm_thread", str102);
            jSONObject4.put("max_utm_thread_version", this.l);
            j2 = j - com.apm.insight.e.j();
            if (j2 >= 30000) {
                str5 = "0 - 30s";
            } else if (j2 < 60000) {
                str5 = "30s - 1min";
            } else if (j2 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                str5 = "1min - 2min";
            } else if (j2 < 300000) {
                str5 = "2min - 5min";
            } else if (j2 < 600000) {
                str5 = "5min - 10min";
            } else if (j2 < 1800000) {
                str5 = "10min - 30min";
            } else if (j2 < 3600000) {
                str5 = "30min - 1h";
            } else {
                str5 = "1h - ";
            }
            jSONObject4.put("crash_length", str5);
            jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
            jSONObject4.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
            jSONObject4.put("sdk_version", "2008-20250701130429");
            jSONObject4.put("has_logcat", String.valueOf(a42.a()));
            jSONObject4.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
            jSONObject4.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
            jSONObject4.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
            jSONObject4.put("is_64_devices", String.valueOf(Header.a()));
            jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.f()));
            jSONObject4.put("is_x86_devices", String.valueOf(Header.b()));
            jSONObject4.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
            jSONObject4.put("is_root", !com.apm.insight.nativecrash.a.k() ? "true" : "false");
            jSONObject4.put("anr_normal_trace", String.valueOf(!this.v));
            jSONObject4.put("anr_no_run", String.valueOf(b));
            jSONObject4.put("crash_after_crash", !Npth.hasCrash() ? "true" : "false");
            jSONObject4.put("from_file", String.valueOf(d.b()));
            jSONObject4.put("has_dump", "true");
            jSONObject4.put("from_kill", "false");
            jSONObject4.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
            i = this.o;
            if (i > 0) {
                jSONObject4.put("may_have_stack_overflow", String.valueOf(i));
            }
            a(a2, jSONObject4);
            com.apm.insight.a.a.a();
            CrashType crashType2222 = CrashType.LAUNCH;
            com.apm.insight.e.e();
            if (com.apm.insight.a.e().length() > 1024) {
                a42.a("has_system_traces", "true");
            }
            a = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
            jSONObject4.put("leak_threads_count", String.valueOf(a.length()));
            if (a.length() > 0) {
                com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), a);
            }
            String optString222 = jSONObject112.optString("mainStackFromTrace");
            JSONArray a5222 = com.apm.insight.entity.b.a(optString222);
            com.apm.insight.entity.b.a(a42.c(), a5222, new b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.b.a
                public final void a(JSONObject jSONObject13) {
                    com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                }
            });
            b(optString222, a5222);
        }
        return z2;
    }
}
