package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hjy {
    public final hlw a;

    protected hjy(hlw hlwVar) {
        hlwVar.getClass();
        this.a = hlwVar;
    }

    public static void i(String str, hlu hluVar) {
        StringBuilder sb = new StringBuilder();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(hluVar.e() / 1000000)));
        sb.append(": logging error [");
        hoq.c(1, hluVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract hkv a(Level level);

    public final hkv b() {
        return a(Level.FINE);
    }

    public final hkv c() {
        return a(Level.FINER);
    }

    public final hkv d() {
        return a(Level.FINEST);
    }

    public final hkv e() {
        return a(Level.INFO);
    }

    public final hkv f() {
        return a(Level.SEVERE);
    }

    public final hkv g() {
        return a(Level.WARNING);
    }

    protected final String h() {
        return this.a.d();
    }

    protected final boolean j(Level level) {
        return this.a.c(level);
    }
}
