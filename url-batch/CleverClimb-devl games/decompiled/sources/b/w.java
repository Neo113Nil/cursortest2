package b;

import com.aiming.mdt.utils.Constants;
import com.umeng.commonsdk.proguard.ao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: MultipartBody.java */
/* loaded from: classes.dex */
public final class w extends ab {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2146a = v.a("multipart/mixed");

    /* renamed from: b, reason: collision with root package name */
    public static final v f2147b = v.a("multipart/alternative");

    /* renamed from: c, reason: collision with root package name */
    public static final v f2148c = v.a("multipart/digest");

    /* renamed from: d, reason: collision with root package name */
    public static final v f2149d = v.a("multipart/parallel");
    public static final v e = v.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {ao.k, 10};
    private static final byte[] h = {45, 45};
    private final c.f i;
    private final v j;
    private final v k;
    private final List<b> l;
    private long m = -1;

    w(c.f fVar, v vVar, List<b> list) {
        this.i = fVar;
        this.j = vVar;
        this.k = v.a(vVar + "; boundary=" + fVar.a());
        this.l = b.a.c.a(list);
    }

    @Override // b.ab
    public v a() {
        return this.k;
    }

    @Override // b.ab
    public long b() throws IOException {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        long a2 = a((c.d) null, true);
        this.m = a2;
        return a2;
    }

    @Override // b.ab
    public void a(c.d dVar) throws IOException {
        a(dVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long a(c.d dVar, boolean z) throws IOException {
        c.c cVar;
        if (z) {
            dVar = new c.c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar = this.l.get(i);
            s sVar = bVar.f2153a;
            ab abVar = bVar.f2154b;
            dVar.c(h);
            dVar.b(this.i);
            dVar.c(g);
            if (sVar != null) {
                int a2 = sVar.a();
                for (int i2 = 0; i2 < a2; i2++) {
                    dVar.b(sVar.a(i2)).c(f).b(sVar.b(i2)).c(g);
                }
            }
            v a3 = abVar.a();
            if (a3 != null) {
                dVar.b("Content-Type: ").b(a3.toString()).c(g);
            }
            long b2 = abVar.b();
            if (b2 != -1) {
                dVar.b("Content-Length: ").l(b2).c(g);
            } else if (z) {
                cVar.s();
                return -1L;
            }
            dVar.c(g);
            if (z) {
                j += b2;
            } else {
                abVar.a(dVar);
            }
            dVar.c(g);
        }
        dVar.c(h);
        dVar.b(this.i);
        dVar.c(h);
        dVar.c(g);
        if (!z) {
            return j;
        }
        long b3 = j + cVar.b();
        cVar.s();
        return b3;
    }

    /* compiled from: MultipartBody.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final s f2153a;

        /* renamed from: b, reason: collision with root package name */
        final ab f2154b;

        public static b a(s sVar, ab abVar) {
            if (abVar == null) {
                throw new NullPointerException("body == null");
            }
            if (sVar != null && sVar.a(Constants.KEY_CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (sVar != null && sVar.a("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new b(sVar, abVar);
        }

        private b(s sVar, ab abVar) {
            this.f2153a = sVar;
            this.f2154b = abVar;
        }
    }

    /* compiled from: MultipartBody.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c.f f2150a;

        /* renamed from: b, reason: collision with root package name */
        private v f2151b;

        /* renamed from: c, reason: collision with root package name */
        private final List<b> f2152c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.f2151b = w.f2146a;
            this.f2152c = new ArrayList();
            this.f2150a = c.f.a(str);
        }

        public a a(v vVar) {
            if (vVar == null) {
                throw new NullPointerException("type == null");
            }
            if (!vVar.a().equals("multipart")) {
                throw new IllegalArgumentException("multipart != " + vVar);
            }
            this.f2151b = vVar;
            return this;
        }

        public a a(s sVar, ab abVar) {
            return a(b.a(sVar, abVar));
        }

        public a a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.f2152c.add(bVar);
            return this;
        }

        public w a() {
            if (this.f2152c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new w(this.f2150a, this.f2151b, this.f2152c);
        }
    }
}
