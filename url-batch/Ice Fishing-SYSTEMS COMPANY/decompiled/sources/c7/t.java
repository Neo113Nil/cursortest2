package c7;

import D.y;
import d7.C4461a;
import j7.C4611b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class t implements i6.q {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f5742f = Logger.getLogger(t.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5743g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f5744h = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
    public static final i6.q i = i6.h.f38327n.a("noop").mo50build();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5745a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5746b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C4611b f5747c;

    /* renamed from: d, reason: collision with root package name */
    public final U6.a f5748d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f5749e;

    public t(C4611b c4611b, U6.a aVar, List list, C4461a c4461a) {
        this.f5748d = aVar;
        this.f5747c = c4611b;
        this.f5749e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new G6.b(23)));
    }

    public static boolean e(String str) {
        if (str != null && f5744h.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = f5742f;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, y.k("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // i6.q
    public final i6.p a(String str) {
        return !e(str) ? i.a("noop") : f5743g ? new k(this, str, 1) : new o(this, str, 1);
    }

    @Override // i6.q
    public final i6.i b(String str) {
        return !e(str) ? i.b("noop") : f5743g ? new e(this, str, 0) : new o(this, str, 0);
    }

    @Override // i6.q
    public final i6.k c(String str) {
        return !e(str) ? i.c("noop") : f5743g ? new f(this, str) : new h4.c(this, str);
    }

    @Override // i6.q
    public final i6.m d(String str) {
        return !e(str) ? i.d("noop") : f5743g ? new h(this, str) : new I0.j(this, str);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f5748d + "}";
    }
}
