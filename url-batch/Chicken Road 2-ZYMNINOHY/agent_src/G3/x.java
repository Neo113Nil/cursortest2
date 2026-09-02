package G3;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public v f1020a;

    /* renamed from: b, reason: collision with root package name */
    public t f1021b;

    /* renamed from: d, reason: collision with root package name */
    public String f1023d;

    /* renamed from: e, reason: collision with root package name */
    public l f1024e;

    /* renamed from: g, reason: collision with root package name */
    public z f1026g;

    /* renamed from: h, reason: collision with root package name */
    public y f1027h;

    /* renamed from: i, reason: collision with root package name */
    public y f1028i;

    /* renamed from: j, reason: collision with root package name */
    public y f1029j;

    /* renamed from: k, reason: collision with root package name */
    public long f1030k;

    /* renamed from: l, reason: collision with root package name */
    public long f1031l;

    /* renamed from: m, reason: collision with root package name */
    public K3.e f1032m;

    /* renamed from: c, reason: collision with root package name */
    public int f1022c = -1;

    /* renamed from: f, reason: collision with root package name */
    public m f1025f = new m(0);

    public static void b(y yVar, String str) {
        if (yVar == null) {
            return;
        }
        if (yVar.f1039g != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".body != null", str).toString());
        }
        if (yVar.f1040h != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".networkResponse != null", str).toString());
        }
        if (yVar.f1041i != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".cacheResponse != null", str).toString());
        }
        if (yVar.f1042j != null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(".priorResponse != null", str).toString());
        }
    }

    public final y a() {
        int i4 = this.f1022c;
        if (i4 < 0) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "code < 0: ").toString());
        }
        v vVar = this.f1020a;
        if (vVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f1021b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f1023d;
        if (str != null) {
            return new y(vVar, tVar, str, i4, this.f1024e, this.f1025f.g(), this.f1026g, this.f1027h, this.f1028i, this.f1029j, this.f1030k, this.f1031l, this.f1032m);
        }
        throw new IllegalStateException("message == null");
    }
}
