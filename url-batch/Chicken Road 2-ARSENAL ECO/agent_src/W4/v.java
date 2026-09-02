package W4;

import c4.C0289h;
import d5.C0332b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class v implements c4.q {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2832f = Logger.getLogger(v.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2833g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f2834h = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");

    /* renamed from: i, reason: collision with root package name */
    public static final c4.q f2835i = C0289h.f3817f.a("noop").build();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2836a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2837b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C0332b f2838c;

    /* renamed from: d, reason: collision with root package name */
    public final O4.a f2839d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f2840e;

    public v(C0332b c0332b, O4.a aVar, List list, X4.a aVar2) {
        this.f2839d = aVar;
        this.f2838c = c0332b;
        this.f2840e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new A4.b(23)));
    }

    public static boolean e(String str) {
        if (str != null && f2834h.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = f2832f;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, o.e("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // c4.q
    public final c4.p a(String str) {
        return !e(str) ? f2835i.a("noop") : f2833g ? new k(this, str, 2) : new p(this, str, 2);
    }

    @Override // c4.q
    public final c4.i b(String str) {
        return !e(str) ? f2835i.b("noop") : f2833g ? new e(this, str, 0) : new p(this, str, 0);
    }

    @Override // c4.q
    public final c4.k c(String str) {
        return !e(str) ? f2835i.c("noop") : f2833g ? new f(this, str) : new q(this, str);
    }

    @Override // c4.q
    public final c4.m d(String str) {
        return !e(str) ? f2835i.d("noop") : f2833g ? new h(this, str, 1) : new p(this, str, 1);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f2839d + "}";
    }
}
