package l2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.a0;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18537c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18538d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final a0 f18539a = new a0();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f18540b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f18537c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.z((String) o2.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] Q0 = m0.Q0(str, "\\.");
        String str2 = Q0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.y(str2.substring(0, indexOf2));
            dVar.x(str2.substring(indexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (Q0.length > 1) {
            dVar.w((String[]) m0.H0(Q0, 1, Q0.length));
        }
    }

    private static boolean b(a0 a0Var) {
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        byte[] d7 = a0Var.d();
        if (e7 + 2 > f7) {
            return false;
        }
        int i7 = e7 + 1;
        if (d7[e7] != 47) {
            return false;
        }
        int i8 = i7 + 1;
        if (d7[i7] != 42) {
            return false;
        }
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= f7) {
                a0Var.P(f7 - a0Var.e());
                return true;
            }
            if (((char) d7[i8]) == '*' && ((char) d7[i9]) == '/') {
                i8 = i9 + 1;
                f7 = i8;
            } else {
                i8 = i9;
            }
        }
    }

    private static boolean c(a0 a0Var) {
        char k7 = k(a0Var, a0Var.e());
        if (k7 != '\t' && k7 != '\n' && k7 != '\f' && k7 != '\r' && k7 != ' ') {
            return false;
        }
        a0Var.P(1);
        return true;
    }

    private static void e(String str, d dVar) {
        int i7;
        Matcher matcher = f18538d.matcher(l4.b.e(str));
        if (!matcher.matches()) {
            r.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        i7 = 2;
        String str2 = (String) o2.a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                i7 = 3;
            case "em":
                dVar.t(i7);
                dVar.s(Float.parseFloat((String) o2.a.e(matcher.group(1))));
                return;
            case "px":
                dVar.t(1);
                dVar.s(Float.parseFloat((String) o2.a.e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private static String f(a0 a0Var, StringBuilder sb) {
        boolean z6 = false;
        sb.setLength(0);
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        while (e7 < f7 && !z6) {
            char c7 = (char) a0Var.d()[e7];
            if ((c7 < 'A' || c7 > 'Z') && ((c7 < 'a' || c7 > 'z') && !((c7 >= '0' && c7 <= '9') || c7 == '#' || c7 == '-' || c7 == '.' || c7 == '_'))) {
                z6 = true;
            } else {
                e7++;
                sb.append(c7);
            }
        }
        a0Var.P(e7 - a0Var.e());
        return sb.toString();
    }

    static String g(a0 a0Var, StringBuilder sb) {
        n(a0Var);
        if (a0Var.a() == 0) {
            return null;
        }
        String f7 = f(a0Var, sb);
        if (!"".equals(f7)) {
            return f7;
        }
        return "" + ((char) a0Var.C());
    }

    private static String h(a0 a0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z6 = false;
        while (!z6) {
            int e7 = a0Var.e();
            String g7 = g(a0Var, sb);
            if (g7 == null) {
                return null;
            }
            if ("}".equals(g7) || ";".equals(g7)) {
                a0Var.O(e7);
                z6 = true;
            } else {
                sb2.append(g7);
            }
        }
        return sb2.toString();
    }

    private static String i(a0 a0Var, StringBuilder sb) {
        n(a0Var);
        if (a0Var.a() < 5 || !"::cue".equals(a0Var.z(5))) {
            return null;
        }
        int e7 = a0Var.e();
        String g7 = g(a0Var, sb);
        if (g7 == null) {
            return null;
        }
        if ("{".equals(g7)) {
            a0Var.O(e7);
            return "";
        }
        String l7 = "(".equals(g7) ? l(a0Var) : null;
        if (")".equals(g(a0Var, sb))) {
            return l7;
        }
        return null;
    }

    private static void j(a0 a0Var, d dVar, StringBuilder sb) {
        n(a0Var);
        String f7 = f(a0Var, sb);
        if (!"".equals(f7) && ":".equals(g(a0Var, sb))) {
            n(a0Var);
            String h7 = h(a0Var, sb);
            if (h7 == null || "".equals(h7)) {
                return;
            }
            int e7 = a0Var.e();
            String g7 = g(a0Var, sb);
            if (!";".equals(g7)) {
                if (!"}".equals(g7)) {
                    return;
                } else {
                    a0Var.O(e7);
                }
            }
            if ("color".equals(f7)) {
                dVar.q(o2.f.b(h7));
                return;
            }
            if ("background-color".equals(f7)) {
                dVar.n(o2.f.b(h7));
                return;
            }
            boolean z6 = true;
            if ("ruby-position".equals(f7)) {
                if ("over".equals(h7)) {
                    dVar.v(1);
                    return;
                } else {
                    if ("under".equals(h7)) {
                        dVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f7)) {
                if (!"all".equals(h7) && !h7.startsWith("digits")) {
                    z6 = false;
                }
                dVar.p(z6);
                return;
            }
            if ("text-decoration".equals(f7)) {
                if ("underline".equals(h7)) {
                    dVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f7)) {
                dVar.r(h7);
                return;
            }
            if ("font-weight".equals(f7)) {
                if ("bold".equals(h7)) {
                    dVar.o(true);
                }
            } else if ("font-style".equals(f7)) {
                if ("italic".equals(h7)) {
                    dVar.u(true);
                }
            } else if ("font-size".equals(f7)) {
                e(h7, dVar);
            }
        }
    }

    private static char k(a0 a0Var, int i7) {
        return (char) a0Var.d()[i7];
    }

    private static String l(a0 a0Var) {
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        boolean z6 = false;
        while (e7 < f7 && !z6) {
            int i7 = e7 + 1;
            z6 = ((char) a0Var.d()[e7]) == ')';
            e7 = i7;
        }
        return a0Var.z((e7 - 1) - a0Var.e()).trim();
    }

    static void m(a0 a0Var) {
        while (!TextUtils.isEmpty(a0Var.o())) {
        }
    }

    static void n(a0 a0Var) {
        while (true) {
            for (boolean z6 = true; a0Var.a() > 0 && z6; z6 = false) {
                if (!c(a0Var) && !b(a0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(a0 a0Var) {
        this.f18540b.setLength(0);
        int e7 = a0Var.e();
        m(a0Var);
        this.f18539a.M(a0Var.d(), a0Var.e());
        this.f18539a.O(e7);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i7 = i(this.f18539a, this.f18540b);
            if (i7 == null || !"{".equals(g(this.f18539a, this.f18540b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i7);
            String str = null;
            boolean z6 = false;
            while (!z6) {
                int e8 = this.f18539a.e();
                String g7 = g(this.f18539a, this.f18540b);
                boolean z7 = g7 == null || "}".equals(g7);
                if (!z7) {
                    this.f18539a.O(e8);
                    j(this.f18539a, dVar, this.f18540b);
                }
                str = g7;
                z6 = z7;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
