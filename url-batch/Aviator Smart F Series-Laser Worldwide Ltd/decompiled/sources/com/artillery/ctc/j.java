package com.artillery.ctc;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import cn.hutool.core.text.l;
import com.artillery.ctc.uitls.FileIOUtils;
import com.artillery.ctc.uitls.FileUtils;
import com.artillery.ctc.uitls.SDCardUtils;
import com.artillery.ctc.uitls.StringUtils;
import com.baidu.ar.auth.FeatureCodes;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: e, reason: collision with root package name */
    public static SimpleDateFormat f1082e;

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f1078a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* renamed from: b, reason: collision with root package name */
    public static final String f1079b = System.getProperty("file.separator");

    /* renamed from: c, reason: collision with root package name */
    public static final String f1080c = System.getProperty("line.separator");

    /* renamed from: d, reason: collision with root package name */
    public static final d f1081d = new d(null);

    /* renamed from: f, reason: collision with root package name */
    public static final ExecutorService f1083f = Executors.newSingleThreadExecutor();

    /* renamed from: g, reason: collision with root package name */
    public static final SimpleArrayMap f1084g = new SimpleArrayMap();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1085a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0024j f1086b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1087c;

        public a(int i8, C0024j c0024j, String str) {
            this.f1085a = i8;
            this.f1086b = c0024j;
            this.f1087c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c(this.f1085a, this.f1086b.f1111a, this.f1086b.f1113c + this.f1087c);
        }
    }

    public class b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return j.c(str);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f1088a;

        public c(File file) {
            this.f1088a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1088a.delete()) {
                return;
            }
            Log.e("LogUtils", "delete " + this.f1088a + " failed!");
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f1089a;

        /* renamed from: b, reason: collision with root package name */
        public String f1090b;

        /* renamed from: c, reason: collision with root package name */
        public String f1091c;

        /* renamed from: d, reason: collision with root package name */
        public String f1092d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1093e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1094f;

        /* renamed from: g, reason: collision with root package name */
        public String f1095g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f1096h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f1097i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1098j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1099k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f1100l;

        /* renamed from: m, reason: collision with root package name */
        public int f1101m;

        /* renamed from: n, reason: collision with root package name */
        public int f1102n;

        /* renamed from: o, reason: collision with root package name */
        public int f1103o;

        /* renamed from: p, reason: collision with root package name */
        public int f1104p;

        /* renamed from: q, reason: collision with root package name */
        public int f1105q;

        /* renamed from: r, reason: collision with root package name */
        public String f1106r;

        /* renamed from: s, reason: collision with root package name */
        public e f1107s;

        public /* synthetic */ d(a aVar) {
            this();
        }

        public static /* synthetic */ h d(d dVar) {
            dVar.getClass();
            return null;
        }

        public static /* synthetic */ f f(d dVar) {
            dVar.getClass();
            return null;
        }

        public static /* synthetic */ i g(d dVar) {
            dVar.getClass();
            return null;
        }

        public final d a(int i8) {
            this.f1105q = i8;
            return this;
        }

        public final d b(boolean z7) {
            this.f1098j = z7;
            return this;
        }

        public final String c() {
            return this.f1092d;
        }

        public final String e() {
            return this.f1091c;
        }

        public final int h() {
            return this.f1105q;
        }

        public final int i() {
            return this.f1103o;
        }

        public final int j() {
            return this.f1104p;
        }

        public final boolean k() {
            return this.f1094f;
        }

        public final boolean l() {
            return this.f1098j;
        }

        public final boolean m() {
            return this.f1099k;
        }

        public final boolean n() {
            return this.f1097i;
        }

        public final boolean o() {
            return this.f1093e;
        }

        public final boolean p() {
            return this.f1100l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(g());
            sb.append(j.f1080c);
            sb.append("logSwitch: ");
            sb.append(o());
            sb.append(j.f1080c);
            sb.append("consoleSwitch: ");
            sb.append(k());
            sb.append(j.f1080c);
            sb.append("tag: ");
            sb.append(f().equals("") ? "null" : f());
            sb.append(j.f1080c);
            sb.append("headSwitch: ");
            sb.append(n());
            sb.append(j.f1080c);
            sb.append("fileSwitch: ");
            sb.append(l());
            sb.append(j.f1080c);
            sb.append("dir: ");
            sb.append(b());
            sb.append(j.f1080c);
            sb.append("filePrefix: ");
            sb.append(e());
            sb.append(j.f1080c);
            sb.append("borderSwitch: ");
            sb.append(m());
            sb.append(j.f1080c);
            sb.append("singleTagSwitch: ");
            sb.append(p());
            sb.append(j.f1080c);
            sb.append("consoleFilter: ");
            sb.append(a());
            sb.append(j.f1080c);
            sb.append("fileFilter: ");
            sb.append(d());
            sb.append(j.f1080c);
            sb.append("stackDeep: ");
            sb.append(i());
            sb.append(j.f1080c);
            sb.append("stackOffset: ");
            sb.append(j());
            sb.append(j.f1080c);
            sb.append("saveDays: ");
            sb.append(h());
            sb.append(j.f1080c);
            sb.append("formatter: ");
            sb.append(j.f1084g);
            sb.append(j.f1080c);
            sb.append("fileWriter: ");
            sb.append((Object) null);
            sb.append(j.f1080c);
            sb.append("onConsoleOutputListener: ");
            sb.append((Object) null);
            sb.append(j.f1080c);
            sb.append("onFileOutputListener: ");
            sb.append((Object) null);
            sb.append(j.f1080c);
            sb.append("fileExtraHeader: ");
            sb.append(this.f1107s.a());
            return sb.toString();
        }

        public d() {
            this.f1091c = "util";
            this.f1092d = ".txt";
            this.f1093e = true;
            this.f1094f = true;
            this.f1095g = "";
            this.f1096h = true;
            this.f1097i = true;
            this.f1098j = false;
            this.f1099k = true;
            this.f1100l = true;
            this.f1101m = 2;
            this.f1102n = 2;
            this.f1103o = 1;
            this.f1104p = 0;
            this.f1105q = -1;
            this.f1106r = y.j.a();
            this.f1107s = new e("Log");
            if (!SDCardUtils.isSDCardEnableByEnvironment() || y.d.a().getExternalFilesDir(null) == null) {
                this.f1089a = y.d.a().getFilesDir() + j.f1079b + "log" + j.f1079b;
                return;
            }
            this.f1089a = y.d.a().getExternalFilesDir(null) + j.f1079b + "log" + j.f1079b;
        }

        public final d a(boolean z7) {
            this.f1099k = z7;
            return this;
        }

        public final String b() {
            String str = this.f1090b;
            return str == null ? this.f1089a : str;
        }

        public final char d() {
            return j.f1078a[this.f1102n - 2];
        }

        public final String f() {
            return StringUtils.isSpace(this.f1095g) ? "" : this.f1095g;
        }

        public final String g() {
            String str = this.f1106r;
            return str == null ? "" : str.replace(":", "_");
        }

        public final d a(String str) {
            if (StringUtils.isSpace(str)) {
                this.f1090b = null;
            } else {
                if (!str.endsWith(j.f1079b)) {
                    str = str + j.f1079b;
                }
                this.f1090b = str;
            }
            return this;
        }

        public final d b(String str) {
            if (StringUtils.isSpace(str)) {
                this.f1095g = "";
                this.f1096h = true;
            } else {
                this.f1095g = str;
                this.f1096h = false;
            }
            return this;
        }

        public final char a() {
            return j.f1078a[this.f1101m - 2];
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public String f1108a;

        /* renamed from: b, reason: collision with root package name */
        public LinkedHashMap f1109b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        public LinkedHashMap f1110c = new LinkedHashMap();

        public e(String str) {
            this.f1108a = str;
        }

        public void a(String str, String str2) {
            a(this.f1109b, str, str2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.f1108a + " Head ****************\n";
            sb.append(str);
            for (Map.Entry entry : this.f1109b.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(k.c());
            sb.append("\n");
            sb.append("Device Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append("\n");
            sb.append("Device Model       : ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("Android Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\n");
            sb.append("Android SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("App VersionName    : ");
            sb.append(y.a.c());
            sb.append("\n");
            sb.append("App VersionCode    : ");
            sb.append(y.a.b());
            sb.append("\n");
            sb.append(a());
            sb.append(str);
            sb.append("\n");
            return sb.toString();
        }

        public final void a(Map map, String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            int length = 19 - str.length();
            if (length > 0) {
                str = str + "                   ".substring(0, length);
            }
            map.put(str, str2);
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.f1110c.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    public interface f {
    }

    public interface h {
    }

    public interface i {
    }

    /* renamed from: com.artillery.ctc.j$j, reason: collision with other inner class name */
    public static final class C0024j {

        /* renamed from: a, reason: collision with root package name */
        public String f1111a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f1112b;

        /* renamed from: c, reason: collision with root package name */
        public String f1113c;

        public C0024j(String str, String[] strArr, String str2) {
            this.f1111a = str;
            this.f1112b = strArr;
            this.f1113c = str2;
        }
    }

    public static d e() {
        return f1081d;
    }

    public static void f(int i8, String str, String str2) {
        if (!f1081d.m()) {
            b(i8, str, str2);
            return;
        }
        for (String str3 : str2.split(f1080c)) {
            b(i8, str, "│ " + str3);
        }
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap simpleArrayMap = f1084g;
        if (!simpleArrayMap.isEmpty()) {
            y.i.a(simpleArrayMap.get(c(obj)));
        }
        return g.c(obj);
    }

    public static void c(int i8, String str, String str2) {
        Date date = new Date();
        String format = f().format(date);
        String substring = format.substring(0, 10);
        String a8 = a(date);
        if (!a(a8, substring)) {
            Log.e("LogUtils", "create " + a8 + " failed!");
            return;
        }
        c(a8, format.substring(11) + f1078a[i8 - 2] + "/" + str + str2 + f1080c);
    }

    public static C0024j d(String str) {
        String str2;
        String str3;
        String str4;
        d dVar = f1081d;
        if (dVar.f1096h || dVar.n()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int j8 = dVar.j() + 3;
            if (j8 >= stackTrace.length) {
                String a8 = a(stackTrace[3]);
                if (dVar.f1096h && StringUtils.isEmpty(str)) {
                    int indexOf = a8.indexOf(46);
                    str4 = indexOf == -1 ? a8 : a8.substring(0, indexOf);
                } else {
                    str4 = str;
                }
                return new C0024j(str4, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[j8];
            String a9 = a(stackTraceElement);
            if (dVar.f1096h && StringUtils.isEmpty(str)) {
                int indexOf2 = a9.indexOf(46);
                str2 = indexOf2 == -1 ? a9 : a9.substring(0, indexOf2);
            } else {
                str2 = str;
            }
            if (dVar.n()) {
                String name = Thread.currentThread().getName();
                String formatter = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), a9, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str5 = " [" + formatter + "]: ";
                if (dVar.i() <= 1) {
                    return new C0024j(str2, new String[]{formatter}, str5);
                }
                int min = Math.min(dVar.i(), stackTrace.length - j8);
                String[] strArr = new String[min];
                strArr[0] = formatter;
                int length = name.length() + 2;
                String formatter2 = new Formatter().format("%" + length + "s", "").toString();
                for (int i8 = 1; i8 < min; i8++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i8 + j8];
                    strArr[i8] = new Formatter().format("%s%s.%s(%s:%d)", formatter2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), a(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new C0024j(str2, strArr, str5);
            }
            str3 = str2;
        } else {
            str3 = dVar.f();
        }
        return new C0024j(str3, null, ": ");
    }

    public static void e(int i8, String str, String str2) {
        int length = str2.length();
        d dVar = f1081d;
        boolean m8 = dVar.m();
        int i9 = FeatureCodes.BASIC_FILTER;
        int i10 = m8 ? (length - 113) / FeatureCodes.BASIC_FILTER : length / FeatureCodes.BASIC_FILTER;
        if (i10 <= 0) {
            b(i8, str, str2);
            return;
        }
        int i11 = 1;
        if (!dVar.m()) {
            b(i8, str, str2.substring(0, FeatureCodes.BASIC_FILTER));
            while (i11 < i10) {
                StringBuilder sb = new StringBuilder();
                sb.append(l.SPACE);
                sb.append(f1080c);
                int i12 = i9 + FeatureCodes.BASIC_FILTER;
                sb.append(str2.substring(i9, i12));
                b(i8, str, sb.toString());
                i11++;
                i9 = i12;
            }
            if (i9 != length) {
                b(i8, str, l.SPACE + f1080c + str2.substring(i9, length));
                return;
            }
            return;
        }
        b(i8, str, str2.substring(0, FeatureCodes.BASIC_FILTER) + f1080c + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l.SPACE);
            String str3 = f1080c;
            sb2.append(str3);
            sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb2.append(str3);
            sb2.append("│ ");
            int i13 = i9 + FeatureCodes.BASIC_FILTER;
            sb2.append(str2.substring(i9, i13));
            sb2.append(str3);
            sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            b(i8, str, sb2.toString());
            i11++;
            i9 = i13;
        }
        if (i9 != length - 113) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(l.SPACE);
            String str4 = f1080c;
            sb3.append(str4);
            sb3.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb3.append(str4);
            sb3.append("│ ");
            sb3.append(str2.substring(i9, length));
            b(i8, str, sb3.toString());
        }
    }

    public static void a(Object... objArr) {
        a(4, f1081d.f(), objArr);
    }

    public static String b(int i8, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        if (f1081d.m()) {
            sb.append(l.SPACE);
            String str3 = f1080c;
            sb.append(str3);
            sb.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append("│ ");
                    sb.append(str4);
                    sb.append(f1080c);
                }
                sb.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                sb.append(f1080c);
            }
            String[] split = str2.split(f1080c);
            int length = split.length;
            while (i9 < length) {
                String str5 = split[i9];
                sb.append("│ ");
                sb.append(str5);
                sb.append(f1080c);
                i9++;
            }
            sb.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        } else {
            if (strArr != null) {
                sb.append(l.SPACE);
                sb.append(f1080c);
                int length2 = strArr.length;
                while (i9 < length2) {
                    sb.append(strArr[i9]);
                    sb.append(f1080c);
                    i9++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public static void a(int i8, String str, Object... objArr) {
        d dVar = f1081d;
        if (dVar.o()) {
            int i9 = i8 & 15;
            int i10 = i8 & 240;
            if (dVar.k() || dVar.l() || i10 == 16) {
                if (i9 >= dVar.f1101m || i9 >= dVar.f1102n) {
                    C0024j d8 = d(str);
                    String a8 = a(i10, objArr);
                    if (dVar.k() && i10 != 16 && i9 >= dVar.f1101m) {
                        a(i9, d8.f1111a, d8.f1112b, a8);
                    }
                    if ((dVar.l() || i10 == 16) && i9 >= dVar.f1102n) {
                        f1083f.execute(new a(i9, d8, a8));
                    }
                }
            }
        }
    }

    public static SimpleDateFormat f() {
        if (f1082e == null) {
            f1082e = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f1082e;
    }

    public static final class g {
        public static String a(Object obj, int i8) {
            return obj.getClass().isArray() ? a(obj) : obj instanceof Throwable ? y.b.a((Throwable) obj) : obj instanceof Bundle ? a((Bundle) obj) : obj instanceof Intent ? a((Intent) obj) : i8 == 32 ? b(obj) : i8 == 48 ? a(obj.toString()) : obj.toString();
        }

        public static String b(Object obj) {
            if (obj instanceof CharSequence) {
                return y.h.a(obj.toString());
            }
            try {
                return y.g.c().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        public static String c(Object obj) {
            return a(obj, -1);
        }

        public static String a(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                if (!(obj instanceof Bundle)) {
                    sb.append(j.b(obj));
                } else {
                    sb.append(obj == bundle ? "(this Bundle)" : a((Bundle) obj));
                }
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        public static String a(Intent intent) {
            boolean z7;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z8 = false;
            boolean z9 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z7 = false;
            } else {
                z7 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z9) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z9 = false;
                }
                sb.append("]");
                z7 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z7 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z7 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z7 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z7 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z7 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z7 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z7) {
                    sb.append(' ');
                }
                a(clipData, sb);
                z7 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(a(extras));
                sb.append('}');
            } else {
                z8 = z7;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z8) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : a(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        public static void a(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent != null) {
                sb.append("I:");
                sb.append(a(intent));
                sb.append("}");
            } else {
                sb.append("NULL");
                sb.append("}");
            }
        }

        public static String a(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                newTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + j.f1080c);
            } catch (Exception e8) {
                e8.printStackTrace();
                return str;
            }
        }

        public static String a(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }
    }

    public static boolean c(String str) {
        return str.matches("^" + f1081d.e() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    public static void c(String str, String str2) {
        d dVar = f1081d;
        d.f(dVar);
        FileIOUtils.writeFileFromString(str, str2, true);
        d.g(dVar);
    }

    public static String a(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return className + cn.hutool.core.io.file.c.EXT_JAVA;
    }

    public static Class c(Object obj) {
        String obj2;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                Type type = genericInterfaces[0];
                while (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getRawType();
                }
                obj2 = type.toString();
            } else {
                Type genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
                obj2 = genericSuperclass.toString();
            }
            if (obj2.startsWith("class ")) {
                obj2 = obj2.substring(6);
            } else if (obj2.startsWith("interface ")) {
                obj2 = obj2.substring(10);
            }
            try {
                return Class.forName(obj2);
            } catch (ClassNotFoundException e8) {
                e8.printStackTrace();
            }
        }
        return cls;
    }

    public static void b(int i8, String str, String str2) {
        Log.println(i8, str, str2);
        d.d(f1081d);
    }

    public static void b(String str, String str2) {
        File[] listFiles;
        if (f1081d.h() > 0 && (listFiles = new File(str).getParentFile().listFiles(new b())) != null && listFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (r0.h() * 86400000);
                for (File file : listFiles) {
                    String name = file.getName();
                    name.length();
                    if (simpleDateFormat.parse(b(name)).getTime() <= time) {
                        f1083f.execute(new c(file));
                    }
                }
            } catch (ParseException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static String a(int i8, Object... objArr) {
        String str;
        if (objArr != null) {
            if (objArr.length == 1) {
                str = a(i8, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    Object obj = objArr[i9];
                    sb.append("args");
                    sb.append("[");
                    sb.append(i9);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(b(obj));
                    sb.append(f1080c);
                }
                str = sb.toString();
            }
        } else {
            str = "null";
        }
        return str.length() == 0 ? "log nothing" : str;
    }

    public static String b(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    public static String a(int i8, Object obj) {
        if (obj == null) {
            return "null";
        }
        if (i8 == 32) {
            return g.a(obj, 32);
        }
        if (i8 == 48) {
            return g.a(obj, 48);
        }
        return b(obj);
    }

    public static void a(int i8, String str, String[] strArr, String str2) {
        if (f1081d.p()) {
            e(i8, str, b(i8, str, strArr, str2));
            return;
        }
        a(i8, str, true);
        a(i8, str, strArr);
        d(i8, str, str2);
        a(i8, str, false);
    }

    public static void d(int i8, String str, String str2) {
        int length = str2.length();
        int i9 = length / FeatureCodes.BASIC_FILTER;
        if (i9 <= 0) {
            f(i8, str, str2);
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i11 + FeatureCodes.BASIC_FILTER;
            f(i8, str, str2.substring(i11, i12));
            i10++;
            i11 = i12;
        }
        if (i11 != length) {
            f(i8, str, str2.substring(i11, length));
        }
    }

    public static void a(int i8, String str, boolean z7) {
        if (f1081d.m()) {
            b(i8, str, z7 ? "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────" : "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    public static void a(int i8, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (f1081d.m()) {
                    str2 = "│ " + str2;
                }
                b(i8, str, str2);
            }
            if (f1081d.m()) {
                b(i8, str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            }
        }
    }

    public static void d(String str, String str2) {
        d dVar = f1081d;
        dVar.f1107s.a("Date of Log", str2);
        c(str, dVar.f1107s.toString());
    }

    public static String a(Date date) {
        String substring = f().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        d dVar = f1081d;
        sb.append(dVar.b());
        sb.append(dVar.e());
        sb.append("_");
        sb.append(substring);
        sb.append("_");
        sb.append(dVar.g());
        sb.append(dVar.c());
        return sb.toString();
    }

    public static boolean a(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!FileUtils.createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            b(str, str2);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                d(str, str2);
            }
            return createNewFile;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
