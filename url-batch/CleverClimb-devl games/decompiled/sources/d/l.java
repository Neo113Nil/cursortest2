package d;

import b.aa;
import b.ab;
import b.q;
import b.s;
import b.t;
import b.v;
import b.w;
import com.aiming.mdt.utils.Constants;
import java.io.IOException;

/* compiled from: RequestBuilder.java */
/* loaded from: classes2.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f9601a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private final String f9602b;

    /* renamed from: c, reason: collision with root package name */
    private final t f9603c;

    /* renamed from: d, reason: collision with root package name */
    private String f9604d;
    private t.a e;
    private final aa.a f = new aa.a();
    private v g;
    private final boolean h;
    private w.a i;
    private q.a j;
    private ab k;

    l(String str, t tVar, String str2, s sVar, v vVar, boolean z, boolean z2, boolean z3) {
        this.f9602b = str;
        this.f9603c = tVar;
        this.f9604d = str2;
        this.g = vVar;
        this.h = z;
        if (sVar != null) {
            this.f.a(sVar);
        }
        if (z2) {
            this.j = new q.a();
        } else if (z3) {
            this.i = new w.a();
            this.i.a(w.e);
        }
    }

    void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("@Url parameter is null.");
        }
        this.f9604d = obj.toString();
    }

    void a(String str, String str2) {
        if (Constants.KEY_CONTENT_TYPE.equalsIgnoreCase(str)) {
            v a2 = v.a(str2);
            if (a2 == null) {
                throw new IllegalArgumentException("Malformed content type: " + str2);
            }
            this.g = a2;
            return;
        }
        this.f.b(str, str2);
    }

    void a(String str, String str2, boolean z) {
        if (this.f9604d == null) {
            throw new AssertionError();
        }
        this.f9604d = this.f9604d.replace("{" + str + "}", a(str2, z));
    }

    private static String a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                c.c cVar = new c.c();
                cVar.a(str, 0, i);
                a(cVar, str, i, length, z);
                return cVar.p();
            }
        }
        return str;
    }

    private static void a(c.c cVar, String str, int i, int i2, boolean z) {
        c.c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new c.c();
                    }
                    cVar2.a(codePointAt);
                    while (!cVar2.f()) {
                        int i3 = cVar2.i() & 255;
                        cVar.i(37);
                        cVar.i((int) f9601a[(i3 >> 4) & 15]);
                        cVar.i((int) f9601a[i3 & 15]);
                    }
                } else {
                    cVar.a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    void b(String str, String str2, boolean z) {
        if (this.f9604d != null) {
            this.e = this.f9603c.d(this.f9604d);
            if (this.e == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f9603c + ", Relative: " + this.f9604d);
            }
            this.f9604d = null;
        }
        if (z) {
            this.e.b(str, str2);
        } else {
            this.e.a(str, str2);
        }
    }

    void c(String str, String str2, boolean z) {
        if (z) {
            this.j.b(str, str2);
        } else {
            this.j.a(str, str2);
        }
    }

    void a(s sVar, ab abVar) {
        this.i.a(sVar, abVar);
    }

    void a(w.b bVar) {
        this.i.a(bVar);
    }

    void a(ab abVar) {
        this.k = abVar;
    }

    aa a() {
        t c2;
        t.a aVar = this.e;
        if (aVar != null) {
            c2 = aVar.c();
        } else {
            c2 = this.f9603c.c(this.f9604d);
            if (c2 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f9603c + ", Relative: " + this.f9604d);
            }
        }
        ab abVar = this.k;
        if (abVar == null) {
            if (this.j != null) {
                abVar = this.j.a();
            } else if (this.i != null) {
                abVar = this.i.a();
            } else if (this.h) {
                abVar = ab.a((v) null, new byte[0]);
            }
        }
        v vVar = this.g;
        if (vVar != null) {
            if (abVar != null) {
                abVar = new a(abVar, vVar);
            } else {
                this.f.b(Constants.KEY_CONTENT_TYPE, vVar.toString());
            }
        }
        return this.f.a(c2).a(this.f9602b, abVar).a();
    }

    /* compiled from: RequestBuilder.java */
    private static class a extends ab {

        /* renamed from: a, reason: collision with root package name */
        private final ab f9605a;

        /* renamed from: b, reason: collision with root package name */
        private final v f9606b;

        a(ab abVar, v vVar) {
            this.f9605a = abVar;
            this.f9606b = vVar;
        }

        @Override // b.ab
        public v a() {
            return this.f9606b;
        }

        @Override // b.ab
        public long b() throws IOException {
            return this.f9605a.b();
        }

        @Override // b.ab
        public void a(c.d dVar) throws IOException {
            this.f9605a.a(dVar);
        }
    }
}
