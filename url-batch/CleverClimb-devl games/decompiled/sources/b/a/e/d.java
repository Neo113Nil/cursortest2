package b.a.e;

import c.r;
import com.mopub.common.Constants;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Hpack.java */
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f1903a = {new c(c.f, ""), new c(c.f1901c, "GET"), new c(c.f1901c, "POST"), new c(c.f1902d, "/"), new c(c.f1902d, "/index.html"), new c(c.e, Constants.HTTP), new c(c.e, Constants.HTTPS), new c(c.f1900b, "200"), new c(c.f1900b, "204"), new c(c.f1900b, "206"), new c(c.f1900b, "304"), new c(c.f1900b, "400"), new c(c.f1900b, "404"), new c(c.f1900b, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(GooglePlayServicesInterstitial.LOCATION_KEY, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};

    /* renamed from: b, reason: collision with root package name */
    static final Map<c.f, Integer> f1904b = a();

    /* compiled from: Hpack.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        c[] f1905a;

        /* renamed from: b, reason: collision with root package name */
        int f1906b;

        /* renamed from: c, reason: collision with root package name */
        int f1907c;

        /* renamed from: d, reason: collision with root package name */
        int f1908d;
        private final List<c> e;
        private final c.e f;
        private final int g;
        private int h;

        a(int i, r rVar) {
            this(i, i, rVar);
        }

        a(int i, int i2, r rVar) {
            this.e = new ArrayList();
            this.f1905a = new c[8];
            this.f1906b = this.f1905a.length - 1;
            this.f1907c = 0;
            this.f1908d = 0;
            this.g = i;
            this.h = i2;
            this.f = c.k.a(rVar);
        }

        private void d() {
            if (this.h < this.f1908d) {
                if (this.h == 0) {
                    e();
                } else {
                    a(this.f1908d - this.h);
                }
            }
        }

        private void e() {
            Arrays.fill(this.f1905a, (Object) null);
            this.f1906b = this.f1905a.length - 1;
            this.f1907c = 0;
            this.f1908d = 0;
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f1905a.length;
                while (true) {
                    length--;
                    if (length < this.f1906b || i <= 0) {
                        break;
                    }
                    i -= this.f1905a[length].i;
                    this.f1908d -= this.f1905a[length].i;
                    this.f1907c--;
                    i2++;
                }
                System.arraycopy(this.f1905a, this.f1906b + 1, this.f1905a, this.f1906b + 1 + i2, this.f1907c);
                this.f1906b += i2;
            }
            return i2;
        }

        void a() throws IOException {
            while (!this.f.f()) {
                int i = this.f.i() & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((i & 128) == 128) {
                    b(a(i, 127) - 1);
                } else if (i == 64) {
                    g();
                } else if ((i & 64) == 64) {
                    e(a(i, 63) - 1);
                } else if ((i & 32) == 32) {
                    this.h = a(i, 31);
                    if (this.h < 0 || this.h > this.g) {
                        throw new IOException("Invalid dynamic table size update " + this.h);
                    }
                    d();
                } else if (i == 16 || i == 0) {
                    f();
                } else {
                    d(a(i, 15) - 1);
                }
            }
        }

        public List<c> b() {
            ArrayList arrayList = new ArrayList(this.e);
            this.e.clear();
            return arrayList;
        }

        private void b(int i) throws IOException {
            if (g(i)) {
                this.e.add(d.f1903a[i]);
                return;
            }
            int c2 = c(i - d.f1903a.length);
            if (c2 < 0 || c2 > this.f1905a.length - 1) {
                throw new IOException("Header index too large " + (i + 1));
            }
            this.e.add(this.f1905a[c2]);
        }

        private int c(int i) {
            return this.f1906b + 1 + i;
        }

        private void d(int i) throws IOException {
            this.e.add(new c(f(i), c()));
        }

        private void f() throws IOException {
            this.e.add(new c(d.a(c()), c()));
        }

        private void e(int i) throws IOException {
            a(-1, new c(f(i), c()));
        }

        private void g() throws IOException {
            a(-1, new c(d.a(c()), c()));
        }

        private c.f f(int i) {
            if (g(i)) {
                return d.f1903a[i].g;
            }
            return this.f1905a[c(i - d.f1903a.length)].g;
        }

        private boolean g(int i) {
            return i >= 0 && i <= d.f1903a.length - 1;
        }

        private void a(int i, c cVar) {
            this.e.add(cVar);
            int i2 = cVar.i;
            if (i != -1) {
                i2 -= this.f1905a[c(i)].i;
            }
            if (i2 > this.h) {
                e();
                return;
            }
            int a2 = a((this.f1908d + i2) - this.h);
            if (i == -1) {
                if (this.f1907c + 1 > this.f1905a.length) {
                    c[] cVarArr = new c[this.f1905a.length * 2];
                    System.arraycopy(this.f1905a, 0, cVarArr, this.f1905a.length, this.f1905a.length);
                    this.f1906b = this.f1905a.length - 1;
                    this.f1905a = cVarArr;
                }
                int i3 = this.f1906b;
                this.f1906b = i3 - 1;
                this.f1905a[i3] = cVar;
                this.f1907c++;
            } else {
                this.f1905a[i + c(i) + a2] = cVar;
            }
            this.f1908d += i2;
        }

        private int h() throws IOException {
            return this.f.i() & 255;
        }

        int a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int h = h();
                if ((h & 128) == 0) {
                    return i2 + (h << i4);
                }
                i2 += (h & 127) << i4;
                i4 += 7;
            }
        }

        c.f c() throws IOException {
            int h = h();
            boolean z = (h & 128) == 128;
            int a2 = a(h, 127);
            if (z) {
                return c.f.a(k.a().a(this.f.g(a2)));
            }
            return this.f.c(a2);
        }
    }

    private static Map<c.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1903a.length);
        for (int i = 0; i < f1903a.length; i++) {
            if (!linkedHashMap.containsKey(f1903a[i].g)) {
                linkedHashMap.put(f1903a[i].g, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* compiled from: Hpack.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f1909a;

        /* renamed from: b, reason: collision with root package name */
        int f1910b;

        /* renamed from: c, reason: collision with root package name */
        c[] f1911c;

        /* renamed from: d, reason: collision with root package name */
        int f1912d;
        int e;
        int f;
        private final c.c g;
        private final boolean h;
        private int i;
        private boolean j;

        b(c.c cVar) {
            this(4096, true, cVar);
        }

        b(int i, boolean z, c.c cVar) {
            this.i = Integer.MAX_VALUE;
            this.f1911c = new c[8];
            this.f1912d = this.f1911c.length - 1;
            this.e = 0;
            this.f = 0;
            this.f1909a = i;
            this.f1910b = i;
            this.h = z;
            this.g = cVar;
        }

        private void a() {
            Arrays.fill(this.f1911c, (Object) null);
            this.f1912d = this.f1911c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f1911c.length;
                while (true) {
                    length--;
                    if (length < this.f1912d || i <= 0) {
                        break;
                    }
                    i -= this.f1911c[length].i;
                    this.f -= this.f1911c[length].i;
                    this.e--;
                    i2++;
                }
                System.arraycopy(this.f1911c, this.f1912d + 1, this.f1911c, this.f1912d + 1 + i2, this.e);
                Arrays.fill(this.f1911c, this.f1912d + 1, this.f1912d + 1 + i2, (Object) null);
                this.f1912d += i2;
            }
            return i2;
        }

        private void a(c cVar) {
            int i = cVar.i;
            if (i > this.f1910b) {
                a();
                return;
            }
            b((this.f + i) - this.f1910b);
            if (this.e + 1 > this.f1911c.length) {
                c[] cVarArr = new c[this.f1911c.length * 2];
                System.arraycopy(this.f1911c, 0, cVarArr, this.f1911c.length, this.f1911c.length);
                this.f1912d = this.f1911c.length - 1;
                this.f1911c = cVarArr;
            }
            int i2 = this.f1912d;
            this.f1912d = i2 - 1;
            this.f1911c[i2] = cVar;
            this.e++;
            this.f += i;
        }

        void a(List<c> list) throws IOException {
            int i;
            int i2;
            if (this.j) {
                if (this.i < this.f1910b) {
                    a(this.i, 31, 32);
                }
                this.j = false;
                this.i = Integer.MAX_VALUE;
                a(this.f1910b, 31, 32);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = list.get(i3);
                c.f f = cVar.g.f();
                c.f fVar = cVar.h;
                Integer num = d.f1904b.get(f);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (b.a.c.a(d.f1903a[i - 1].h, fVar)) {
                            i2 = i;
                        } else if (b.a.c.a(d.f1903a[i].h, fVar)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i4 = this.f1912d + 1;
                    int length = this.f1911c.length;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (b.a.c.a(this.f1911c[i4].g, f)) {
                            if (b.a.c.a(this.f1911c[i4].h, fVar)) {
                                i = d.f1903a.length + (i4 - this.f1912d);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i4 - this.f1912d) + d.f1903a.length;
                            }
                        }
                        i4++;
                    }
                }
                if (i != -1) {
                    a(i, 127, 128);
                } else if (i2 == -1) {
                    this.g.i(64);
                    a(f);
                    a(fVar);
                    a(cVar);
                } else if (f.a(c.f1899a) && !c.f.equals(f)) {
                    a(i2, 15, 0);
                    a(fVar);
                } else {
                    a(i2, 63, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        void a(int i, int i2, int i3) {
            if (i < i2) {
                this.g.i(i | i3);
                return;
            }
            this.g.i(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.g.i(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.g.i(i4);
        }

        void a(c.f fVar) throws IOException {
            if (this.h && k.a().a(fVar) < fVar.g()) {
                c.c cVar = new c.c();
                k.a().a(fVar, cVar);
                c.f o = cVar.o();
                a(o.g(), 127, 128);
                this.g.b(o);
                return;
            }
            a(fVar.g(), 127, 0);
            this.g.b(fVar);
        }

        void a(int i) {
            this.f1909a = i;
            int min = Math.min(i, 16384);
            if (this.f1910b == min) {
                return;
            }
            if (min < this.f1910b) {
                this.i = Math.min(this.i, min);
            }
            this.j = true;
            this.f1910b = min;
            b();
        }

        private void b() {
            if (this.f1910b < this.f) {
                if (this.f1910b == 0) {
                    a();
                } else {
                    b(this.f - this.f1910b);
                }
            }
        }
    }

    static c.f a(c.f fVar) throws IOException {
        int g = fVar.g();
        for (int i = 0; i < g; i++) {
            byte a2 = fVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.a());
            }
        }
        return fVar;
    }
}
