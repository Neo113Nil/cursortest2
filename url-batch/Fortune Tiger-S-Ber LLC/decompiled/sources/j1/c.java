package j1;

import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2265a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2266b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2267d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2268e;

    /* renamed from: f, reason: collision with root package name */
    public String f2269f;
    public Double h;

    /* renamed from: i, reason: collision with root package name */
    public a f2270i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2271j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2272k;

    /* renamed from: l, reason: collision with root package name */
    public Double f2273l;

    /* renamed from: m, reason: collision with root package name */
    public int f2274m;
    public String g = "";

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2275n = new ArrayList();

    public c(String str, String str2, String str3, String str4, String str5) {
        this.f2265a = str;
        this.f2266b = str2;
        this.c = str3;
        this.f2267d = str4;
        this.f2268e = str5;
        this.f2269f = str5;
    }

    public final void a(b bVar) {
        double sqrt;
        String str;
        if (this.f2272k) {
            b();
        }
        Double e4 = e();
        if (e4 != null) {
            double doubleValue = e4.doubleValue();
            int ordinal = bVar.ordinal();
            String str2 = this.f2267d;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    sqrt = Math.sin(Math.toRadians(doubleValue));
                } else if (ordinal == 2) {
                    sqrt = Math.cos(Math.toRadians(doubleValue));
                } else if (ordinal == 3) {
                    sqrt = Math.tan(Math.toRadians(doubleValue));
                } else if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new t();
                    }
                    if (doubleValue <= 0.0d) {
                        f(str2);
                        return;
                    }
                    sqrt = Math.log(doubleValue);
                } else {
                    if (doubleValue <= 0.0d) {
                        f(str2);
                        return;
                    }
                    sqrt = Math.log10(doubleValue);
                }
            } else {
                if (doubleValue < 0.0d) {
                    f(str2);
                    return;
                }
                sqrt = Math.sqrt(doubleValue);
            }
            if (Double.isInfinite(sqrt) || Double.isNaN(sqrt)) {
                f(this.c);
                return;
            }
            int ordinal2 = bVar.ordinal();
            if (ordinal2 == 0) {
                str = "√";
            } else if (ordinal2 == 1) {
                str = "sin";
            } else if (ordinal2 == 2) {
                str = "cos";
            } else if (ordinal2 == 3) {
                str = "tan";
            } else if (ordinal2 == 4) {
                str = "log";
            } else {
                if (ordinal2 != 5) {
                    throw new t();
                }
                str = "ln";
            }
            this.g = str + "(" + d(doubleValue) + ")";
            this.f2269f = d(sqrt);
            this.f2271j = true;
            this.f2270i = null;
            this.h = null;
        }
    }

    public final void b() {
        this.f2269f = this.f2268e;
        this.g = "";
        this.h = null;
        this.f2270i = null;
        this.f2271j = false;
        this.f2272k = false;
    }

    public final Double c(double d4, double d5, a aVar) {
        double d6;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            d6 = d4 + d5;
        } else if (ordinal == 1) {
            d6 = d4 - d5;
        } else if (ordinal == 2) {
            d6 = d4 * d5;
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                throw new t();
            }
            d6 = Math.pow(d4, d5);
        } else {
            if (Math.abs(d5) < 1.0E-12d) {
                f(this.f2265a);
                return null;
            }
            d6 = d4 / d5;
        }
        if (!Double.isInfinite(d6) && !Double.isNaN(d6)) {
            return Double.valueOf(d6);
        }
        f(this.c);
        return null;
    }

    public final String d(double d4) {
        boolean isInfinite = Double.isInfinite(d4);
        String str = this.c;
        if (isInfinite || Double.isNaN(d4)) {
            return str;
        }
        if (Math.abs(d4) >= 1.0E15d) {
            return str;
        }
        long j4 = (long) d4;
        String valueOf = Math.abs(d4 - ((double) j4)) < 1.0E-12d ? String.valueOf(j4) : b3.e.r0(b3.e.r0(String.format(Locale.US, "%.10f", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1)), '0'), '.');
        return valueOf.length() > 14 ? String.format(Locale.US, "%.6e", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1)) : valueOf;
    }

    public final Double e() {
        try {
            return Double.valueOf(Double.parseDouble(this.f2269f));
        } catch (NumberFormatException unused) {
            f(this.f2266b);
            return null;
        }
    }

    public final void f(String str) {
        this.f2269f = str;
        this.g = "";
        this.h = null;
        this.f2270i = null;
        this.f2271j = true;
        this.f2272k = true;
        this.f2274m = 0;
    }

    public final void g(a aVar) {
        Double e4;
        c cVar;
        if (this.f2272k || (e4 = e()) == null) {
            return;
        }
        double doubleValue = e4.doubleValue();
        if (this.f2270i == null || this.f2271j) {
            cVar = this;
            cVar.h = e4;
        } else {
            Double d4 = this.h;
            u2.c.b(d4);
            double doubleValue2 = d4.doubleValue();
            a aVar2 = this.f2270i;
            u2.c.b(aVar2);
            cVar = this;
            Double c = cVar.c(doubleValue2, doubleValue, aVar2);
            if (c == null) {
                return;
            }
            cVar.h = c;
            cVar.f2269f = d(c.doubleValue());
        }
        cVar.f2270i = aVar;
        Double d5 = cVar.h;
        u2.c.b(d5);
        cVar.g = d(d5.doubleValue()) + " " + aVar.f2259f;
        cVar.f2271j = true;
    }
}
