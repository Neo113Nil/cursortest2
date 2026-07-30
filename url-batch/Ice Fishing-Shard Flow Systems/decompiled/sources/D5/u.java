package D5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import v5.C0975a;

/* loaded from: classes.dex */
public final class u implements J4.q {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f386f = Logger.getLogger(u.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f387g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f388h = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");

    /* renamed from: i, reason: collision with root package name */
    public static final J4.q f389i = J4.h.f1386d.a("noop").mo5build();

    /* renamed from: a, reason: collision with root package name */
    public final Object f390a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f391b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final K5.b f392c;

    /* renamed from: d, reason: collision with root package name */
    public final C0975a f393d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f394e;

    public u(K5.b bVar, C0975a c0975a, List list, E5.a aVar) {
        this.f393d = c0975a;
        this.f392c = bVar;
        this.f394e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new C4.a(5)));
    }

    public static boolean e(String str) {
        if (str != null && f388h.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = f386f;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, r4.f.d("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // J4.q
    public final J4.p a(String str) {
        return !e(str) ? f389i.a("noop") : f387g ? new k(this, str, 2) : new o(this, str, 2);
    }

    @Override // J4.q
    public final J4.i b(String str) {
        return !e(str) ? f389i.b("noop") : f387g ? new e(this, str, 0) : new o(this, str, 0);
    }

    @Override // J4.q
    public final J4.k c(String str) {
        return !e(str) ? f389i.c("noop") : f387g ? new f(this, str) : new p(this, str);
    }

    @Override // J4.q
    public final J4.m d(String str) {
        return !e(str) ? f389i.d("noop") : f387g ? new h(this, str, 1) : new o(this, str, 1);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f393d + "}";
    }
}
