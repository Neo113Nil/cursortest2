package x5;

/* renamed from: x5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1017g {
    static {
        C4.e eVar = C4.e.f301d;
        H4.e.a(eVar, "exception.type");
        H4.e.a(eVar, "exception.message");
        H4.e.a(eVar, "exception.stacktrace");
    }

    static r4.d getDefault() {
        Boolean.parseBoolean(H4.d.b("otel.experimental.sdk.jvm_stacktrace", "false"));
        return new r4.d();
    }
}
