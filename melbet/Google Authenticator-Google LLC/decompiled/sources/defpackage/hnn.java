package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnn extends LogRecord {
    private static final Object[] b;
    public final hmr a;
    private final hlu c;

    static {
        new hnm();
        b = new Object[0];
    }

    protected hnn(hlu hluVar, hma hmaVar) {
        super(hluVar.o(), null);
        this.c = hluVar;
        this.a = hmr.g(hmaVar, hluVar.k());
        hkq f = hluVar.f();
        setSourceClassName(f.b());
        setSourceMethodName(f.d());
        setLoggerName(hluVar.n());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        setMillis(hluVar.e() / 1000000);
        super.setParameters(b);
    }

    private static void a(hlu hluVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (hluVar.l() == null) {
            sb.append(hly.b(hluVar.m()));
        } else {
            sb.append(hluVar.l().b);
            sb.append("\n  original arguments:");
            for (Object obj : hluVar.B()) {
                sb.append("\n    ");
                sb.append(hly.b(obj));
            }
        }
        hma k = hluVar.k();
        if (k.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < k.b(); i++) {
                sb.append("\n    ");
                sb.append(k.c(i).a);
                sb.append(": ");
                sb.append(hly.b(k.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(hly.b(hluVar.o()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(hluVar.e());
        sb.append("\n  class: ");
        sb.append(hluVar.f().b());
        sb.append("\n  method: ");
        sb.append(hluVar.f().d());
        sb.append("\n  line number: ");
        sb.append(hluVar.f().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            hlu hluVar = this.c;
            hmr hmrVar = this.a;
            hlv hlvVar = hmv.a;
            if (hmv.b(hluVar, hmrVar, hlvVar.b)) {
                StringBuilder sb = new StringBuilder();
                hoi.e(hluVar, sb);
                hmv.c(hmrVar, hlvVar.a, sb);
                message = sb.toString();
            } else {
                message = hmv.a(hluVar);
            }
            super.setMessage(message);
        }
        return message;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }

    protected hnn(RuntimeException runtimeException, hlu hluVar, hma hmaVar) {
        this(hluVar, hmaVar);
        setLevel(hluVar.o().intValue() < Level.WARNING.intValue() ? Level.WARNING : hluVar.o());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(hluVar, sb);
        super.setMessage(sb.toString());
    }

    public hnn(hlu hluVar, hma hmaVar, byte[] bArr) {
        this(hluVar, hmaVar);
        setThrown((Throwable) this.a.b(hkl.a));
        getMessage();
    }
}
