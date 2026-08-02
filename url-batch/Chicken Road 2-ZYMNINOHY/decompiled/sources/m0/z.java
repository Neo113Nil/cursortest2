package m0;

import E1.C0025a;
import E1.N;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.a0;
import v2.p0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14477a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14478b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14479c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14480d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14481e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f14482f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final String f14483g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f14484h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static a0 b(String str) {
        if (str == null) {
            v2.G g4 = v2.I.f15571b;
            return a0.f15605e;
        }
        v2.r.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String str2 = J.f3263a;
        int i4 = 0;
        for (String str3 : str.split(",\\s?", -1)) {
            int a3 = a(str3);
            if (a3 != 0) {
                Integer valueOf = Integer.valueOf(a3);
                int i5 = i4 + 1;
                int e4 = v2.C.e(objArr.length, i5);
                if (e4 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e4);
                }
                objArr[i4] = valueOf;
                i4 = i5;
            }
        }
        return v2.I.i(i4, objArr);
    }

    public static G0.c c(String str) {
        long parseInt;
        Matcher matcher = f14480d.matcher(str);
        if (!matcher.matches()) {
            throw T.G.b(str, null);
        }
        String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e4) {
                throw T.G.b(str, e4);
            }
        } else {
            parseInt = 60000;
        }
        return new G0.c(group, parseInt, 4);
    }

    public static C0025a d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return null;
        }
        String str = J.f3263a;
        String[] split = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
        return new C0025a(split[0], split[1], 3);
    }

    public static N e(String str) {
        String str2;
        Matcher matcher = f14481e.matcher(str);
        str2 = "";
        int i4 = 1;
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            return new N(2, group, group2, group3 != null ? group3 : "");
        }
        Matcher matcher2 = f14482f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new N(i4, group4, str2, str2);
        }
        throw T.G.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static a0 f(C1279A c1279a) {
        AbstractC0124a.h(c1279a.f14294c.b("CSeq") != null);
        v2.F f4 = new v2.F(4);
        Object[] objArr = {g(c1279a.f14293b), c1279a.f14292a, "RTSP/1.0"};
        String str = J.f3263a;
        f4.b(String.format(Locale.US, "%s %s %s", objArr));
        v2.J j4 = c1279a.f14294c.f14421a;
        p0 it = j4.f15572d.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            v2.I g4 = j4.g(str2);
            for (int i4 = 0; i4 < g4.size(); i4++) {
                f4.b(String.format(Locale.US, "%s: %s", str2, g4.get(i4)));
            }
        }
        f4.b("");
        f4.b(c1279a.f14295d);
        return f4.f();
    }

    public static String g(int i4) {
        switch (i4) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
