package M3;

/* loaded from: classes.dex */
public class m implements W2.f {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1976c;

    /* renamed from: a, reason: collision with root package name */
    public final i f1977a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.a f1978b;

    static {
        ((W2.h) V2.d.c(W2.d.f3408a, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
        f1976c = true;
    }

    public m(i iVar, J3.a aVar, Q3.a aVar2) {
        this.f1977a = iVar;
        this.f1978b = aVar;
    }

    @Override // W2.f
    public W2.e a() {
        boolean z = f1976c;
        J3.a aVar = this.f1978b;
        i iVar = this.f1977a;
        return z ? new d(iVar, aVar) : new l(iVar, aVar);
    }
}
