package Q4;

/* loaded from: classes.dex */
public interface f {
    static {
        V3.b bVar = V3.b.f2707f;
        a4.e.a(bVar, "exception.type");
        a4.e.a(bVar, "exception.message");
        a4.e.a(bVar, "exception.stacktrace");
    }

    static R0.g getDefault() {
        Boolean.parseBoolean(a4.d.b("otel.experimental.sdk.jvm_stacktrace", "false"));
        return new R0.g();
    }
}
