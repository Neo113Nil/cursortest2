package G3;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final v f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1036d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1037e;

    /* renamed from: f, reason: collision with root package name */
    public final n f1038f;

    /* renamed from: g, reason: collision with root package name */
    public final z f1039g;

    /* renamed from: h, reason: collision with root package name */
    public final y f1040h;

    /* renamed from: i, reason: collision with root package name */
    public final y f1041i;

    /* renamed from: j, reason: collision with root package name */
    public final y f1042j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1043k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1044l;

    /* renamed from: m, reason: collision with root package name */
    public final K3.e f1045m;

    public y(v request, t protocol, String message, int i4, l lVar, n nVar, z zVar, y yVar, y yVar2, y yVar3, long j4, long j5, K3.e eVar) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(message, "message");
        this.f1033a = request;
        this.f1034b = protocol;
        this.f1035c = message;
        this.f1036d = i4;
        this.f1037e = lVar;
        this.f1038f = nVar;
        this.f1039g = zVar;
        this.f1040h = yVar;
        this.f1041i = yVar2;
        this.f1042j = yVar3;
        this.f1043k = j4;
        this.f1044l = j5;
        this.f1045m = eVar;
    }

    public static String a(y yVar, String str) {
        yVar.getClass();
        String b4 = yVar.f1038f.b(str);
        if (b4 == null) {
            return null;
        }
        return b4;
    }

    public final x b() {
        x xVar = new x();
        xVar.f1020a = this.f1033a;
        xVar.f1021b = this.f1034b;
        xVar.f1022c = this.f1036d;
        xVar.f1023d = this.f1035c;
        xVar.f1024e = this.f1037e;
        xVar.f1025f = this.f1038f.d();
        xVar.f1026g = this.f1039g;
        xVar.f1027h = this.f1040h;
        xVar.f1028i = this.f1041i;
        xVar.f1029j = this.f1042j;
        xVar.f1030k = this.f1043k;
        xVar.f1031l = this.f1044l;
        xVar.f1032m = this.f1045m;
        return xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f1039g;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f1034b + ", code=" + this.f1036d + ", message=" + this.f1035c + ", url=" + this.f1033a.f1012a + '}';
    }
}
