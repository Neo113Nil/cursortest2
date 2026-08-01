package c3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public s f1131a;

    /* renamed from: b, reason: collision with root package name */
    public r f1132b;

    /* renamed from: d, reason: collision with root package name */
    public String f1133d;

    /* renamed from: e, reason: collision with root package name */
    public j f1134e;
    public w g;
    public u h;

    /* renamed from: i, reason: collision with root package name */
    public u f1136i;

    /* renamed from: j, reason: collision with root package name */
    public u f1137j;

    /* renamed from: k, reason: collision with root package name */
    public long f1138k;

    /* renamed from: l, reason: collision with root package name */
    public long f1139l;

    /* renamed from: m, reason: collision with root package name */
    public g3.d f1140m;
    public int c = -1;

    /* renamed from: f, reason: collision with root package name */
    public a2.e f1135f = new a2.e(10);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f1145l != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.f1146m != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.f1147n != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f1148o != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i4 = this.c;
        if (i4 < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        s sVar = this.f1131a;
        if (sVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f1132b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f1133d;
        if (str != null) {
            return new u(sVar, rVar, str, i4, this.f1134e, this.f1135f.u(), this.g, this.h, this.f1136i, this.f1137j, this.f1138k, this.f1139l, this.f1140m);
        }
        throw new IllegalStateException("message == null");
    }
}
