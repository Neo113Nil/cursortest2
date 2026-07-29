package b;

import com.aiming.mdt.utils.Constants;
import com.cmplay.base.util.webview.encode.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Cookie.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2107a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2108b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f2109c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f2110d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !b.a.c.c(str);
    }

    public static l a(t tVar, String str) {
        return a(System.currentTimeMillis(), tVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static l a(long j, t tVar, String str) {
        long j2;
        String f;
        l lVar;
        String str2;
        String str3;
        String substring;
        int length = str.length();
        char c2 = ';';
        int a2 = b.a.c.a(str, 0, length, ';');
        char c3 = '=';
        int a3 = b.a.c.a(str, 0, a2, '=');
        if (a3 == a2) {
            return null;
        }
        String c4 = b.a.c.c(str, 0, a3);
        if (c4.isEmpty() || b.a.c.b(c4) != -1) {
            return null;
        }
        String c5 = b.a.c.c(str, a3 + 1, a2);
        if (b.a.c.b(c5) != -1) {
            return null;
        }
        int i = a2 + 1;
        String str4 = null;
        String str5 = null;
        long j3 = -1;
        long j4 = 253402300799999L;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        while (i < length) {
            int a4 = b.a.c.a(str, i, length, c2);
            int a5 = b.a.c.a(str, i, a4, c3);
            String c6 = b.a.c.c(str, i, a5);
            String c7 = a5 < a4 ? b.a.c.c(str, a5 + 1, a4) : "";
            if (c6.equalsIgnoreCase("expires")) {
                try {
                    j4 = a(c7, 0, c7.length());
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (c6.equalsIgnoreCase(Constants.KEY_MAX_AGE)) {
                j3 = a(c7);
            } else {
                if (c6.equalsIgnoreCase("domain")) {
                    str4 = b(c7);
                    z3 = false;
                } else if (c6.equalsIgnoreCase("path")) {
                    str5 = c7;
                } else if (c6.equalsIgnoreCase("secure")) {
                    z = true;
                } else if (c6.equalsIgnoreCase("httponly")) {
                    z2 = true;
                }
                i = a4 + 1;
                c2 = ';';
                c3 = '=';
            }
            z4 = true;
            i = a4 + 1;
            c2 = ';';
            c3 = '=';
        }
        long j5 = Long.MIN_VALUE;
        if (j3 != Long.MIN_VALUE) {
            if (j3 != -1) {
                j5 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                if (j5 < j || j5 > 253402300799999L) {
                    j2 = 253402300799999L;
                }
            } else {
                j2 = j4;
            }
            f = tVar.f();
            if (str4 != null) {
                str2 = f;
                lVar = null;
            } else {
                if (!a(f, str4)) {
                    return null;
                }
                lVar = null;
                str2 = str4;
            }
            if (f.length() == str2.length() && b.a.h.a.a().a(str2) == null) {
                return lVar;
            }
            str3 = str5;
            if (str3 == null && str3.startsWith("/")) {
                substring = str3;
            } else {
                String h = tVar.h();
                int lastIndexOf = h.lastIndexOf(47);
                substring = lastIndexOf == 0 ? h.substring(0, lastIndexOf) : "/";
            }
            return new l(c4, c5, j2, str2, substring, z, z2, z3, z4);
        }
        j2 = j5;
        f = tVar.f();
        if (str4 != null) {
        }
        if (f.length() == str2.length()) {
        }
        str3 = str5;
        if (str3 == null) {
        }
        String h2 = tVar.h();
        int lastIndexOf2 = h2.lastIndexOf(47);
        substring = lastIndexOf2 == 0 ? h2.substring(0, lastIndexOf2) : "/";
        return new l(c4, c5, j2, str2, substring, z, z2, z3, z4);
    }

    private static long a(String str, int i, int i2) {
        int a2 = a(str, i, i2, false);
        Matcher matcher = f2110d.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i3 == -1 && matcher.usePattern(f2110d).matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
                i7 = parseInt2;
                i3 = parseInt;
            } else if (i5 == -1 && matcher.usePattern(f2109c).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f2108b).matches()) {
                i6 = f2108b.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(f2107a).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += ErrorCode.NETWORK_ERROR;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(b.a.c.f);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    private static String b(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String a2 = b.a.c.a(str);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException();
    }

    public static List<l> a(t tVar, s sVar) {
        List<String> b2 = sVar.b("Set-Cookie");
        int size = b2.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            l a2 = a(tVar, b2.get(i));
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        return a(false);
    }

    String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(b.a.c.d.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.e.equals(this.e) && lVar.f.equals(this.f) && lVar.h.equals(this.h) && lVar.i.equals(this.i) && lVar.g == this.g && lVar.j == this.j && lVar.k == this.k && lVar.l == this.l && lVar.m == this.m;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + ((int) (this.g ^ (this.g >>> 32)))) * 31) + (!this.j ? 1 : 0)) * 31) + (!this.k ? 1 : 0)) * 31) + (!this.l ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }
}
