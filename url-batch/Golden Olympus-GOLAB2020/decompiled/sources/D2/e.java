package D2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f382a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f383b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f384c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f385d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f386e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f387f;

    /* renamed from: g, reason: collision with root package name */
    private String f388g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f389h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f390i;

    /* renamed from: j, reason: collision with root package name */
    private String f391j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f392k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f393l;

    /* renamed from: m, reason: collision with root package name */
    private F2.b f394m;

    public e(AbstractC0348a json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f382a = json.d().e();
        this.f383b = json.d().f();
        this.f384c = json.d().g();
        this.f385d = json.d().m();
        this.f386e = json.d().b();
        this.f387f = json.d().i();
        this.f388g = json.d().j();
        this.f389h = json.d().d();
        this.f390i = json.d().l();
        this.f391j = json.d().c();
        this.f392k = json.d().a();
        this.f393l = json.d().k();
        json.d().h();
        this.f394m = json.a();
    }

    public final g a() {
        if (this.f390i && !Intrinsics.areEqual(this.f391j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
        }
        if (this.f387f) {
            if (!Intrinsics.areEqual(this.f388g, "    ")) {
                String str = this.f388g;
                for (int i4 = 0; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f388g).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.f388g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new g(this.f382a, this.f384c, this.f385d, this.f386e, this.f387f, this.f383b, this.f388g, this.f389h, this.f390i, this.f391j, this.f392k, this.f393l, null);
    }

    public final F2.b b() {
        return this.f394m;
    }

    public final void c(boolean z4) {
        this.f382a = z4;
    }

    public final void d(boolean z4) {
        this.f383b = z4;
    }

    public final void e(boolean z4) {
        this.f384c = z4;
    }
}
