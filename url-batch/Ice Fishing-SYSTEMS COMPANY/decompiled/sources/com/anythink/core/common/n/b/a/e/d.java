package com.anythink.core.common.n.b.a.e;

import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.common.n.c.w;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import com.google.android.gms.internal.ads.CL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f15294a;

    /* renamed from: b, reason: collision with root package name */
    static final Map<com.anythink.core.common.n.c.f, Integer> f15295b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15296c = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f15297d = 31;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15298e = 63;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15299f = 127;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        c[] f15300a;

        /* renamed from: b, reason: collision with root package name */
        int f15301b;

        /* renamed from: c, reason: collision with root package name */
        int f15302c;

        /* renamed from: d, reason: collision with root package name */
        int f15303d;

        /* renamed from: e, reason: collision with root package name */
        private final List<c> f15304e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15305f;

        /* renamed from: g, reason: collision with root package name */
        private final int f15306g;

        /* renamed from: h, reason: collision with root package name */
        private int f15307h;

        public a(w wVar, byte b9) {
            this(wVar);
        }

        private int a(int i) {
            int i4;
            int i9 = 0;
            if (i > 0) {
                int length = this.f15300a.length;
                while (true) {
                    length--;
                    i4 = this.f15301b;
                    if (length < i4 || i <= 0) {
                        break;
                    }
                    int i10 = this.f15300a[length].f15293n;
                    i -= i10;
                    this.f15303d -= i10;
                    this.f15302c--;
                    i9++;
                }
                c[] cVarArr = this.f15300a;
                System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i9, this.f15302c);
                this.f15301b += i9;
            }
            return i9;
        }

        private int c() {
            return this.f15307h;
        }

        private void d() {
            int i = this.f15307h;
            int i4 = this.f15303d;
            if (i < i4) {
                if (i == 0) {
                    e();
                } else {
                    a(i4 - i);
                }
            }
        }

        private void e() {
            Arrays.fill(this.f15300a, (Object) null);
            this.f15301b = this.f15300a.length - 1;
            this.f15302c = 0;
            this.f15303d = 0;
        }

        private void f() {
            this.f15304e.add(new c(d.a(i()), i()));
        }

        private void g() {
            a(new c(d.a(i()), i()));
        }

        private int h() {
            return this.f15305f.k() & 255;
        }

        private com.anythink.core.common.n.c.f i() {
            int h9 = h();
            boolean z8 = (h9 & 128) == 128;
            int a9 = a(h9, 127);
            return z8 ? com.anythink.core.common.n.c.f.a(k.a().a(this.f15305f.h(a9))) : this.f15305f.d(a9);
        }

        public final List<c> b() {
            ArrayList arrayList = new ArrayList(this.f15304e);
            this.f15304e.clear();
            return arrayList;
        }

        private a(w wVar) {
            this.f15304e = new ArrayList();
            this.f15300a = new c[8];
            this.f15301b = r0.length - 1;
            this.f15302c = 0;
            this.f15303d = 0;
            this.f15306g = 4096;
            this.f15307h = 4096;
            this.f15305f = com.anythink.core.common.n.c.n.a(wVar);
        }

        private int c(int i) {
            return this.f15301b + 1 + i;
        }

        private void b(int i) {
            if (g(i)) {
                this.f15304e.add(d.f15294a[i]);
                return;
            }
            int c4 = c(i - d.f15294a.length);
            if (c4 >= 0) {
                c[] cVarArr = this.f15300a;
                if (c4 < cVarArr.length) {
                    this.f15304e.add(cVarArr[c4]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void d(int i) {
            this.f15304e.add(new c(f(i), i()));
        }

        private com.anythink.core.common.n.c.f f(int i) {
            if (g(i)) {
                return d.f15294a[i].f15291l;
            }
            int c4 = c(i - d.f15294a.length);
            if (c4 >= 0) {
                c[] cVarArr = this.f15300a;
                if (c4 < cVarArr.length) {
                    return cVarArr[c4].f15291l;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private static boolean g(int i) {
            return i >= 0 && i <= d.f15294a.length - 1;
        }

        private void e(int i) {
            a(new c(f(i), i()));
        }

        public final void a() {
            while (!this.f15305f.g()) {
                byte k6 = this.f15305f.k();
                int i = k6 & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((k6 & com.anythink.core.common.s.a.c.f16474a) == 128) {
                    int a9 = a(i, 127);
                    int i4 = a9 - 1;
                    if (g(i4)) {
                        this.f15304e.add(d.f15294a[i4]);
                    } else {
                        int c4 = c(i4 - d.f15294a.length);
                        if (c4 >= 0) {
                            c[] cVarArr = this.f15300a;
                            if (c4 < cVarArr.length) {
                                this.f15304e.add(cVarArr[c4]);
                            }
                        }
                        throw new IOException(CL.i(a9, "Header index too large "));
                    }
                } else if (i == 64) {
                    a(new c(d.a(i()), i()));
                } else if ((k6 & com.anythink.core.common.s.a.c.f16475b) == 64) {
                    a(new c(f(a(i, d.f15298e) - 1), i()));
                } else if ((k6 & 32) == 32) {
                    int a10 = a(i, 31);
                    this.f15307h = a10;
                    if (a10 >= 0 && a10 <= this.f15306g) {
                        d();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f15307h);
                    }
                } else if (i != 16 && i != 0) {
                    this.f15304e.add(new c(f(a(i, 15) - 1), i()));
                } else {
                    this.f15304e.add(new c(d.a(i()), i()));
                }
            }
        }

        private void a(c cVar) {
            this.f15304e.add(cVar);
            int i = cVar.f15293n;
            int i4 = this.f15307h;
            if (i > i4) {
                e();
                return;
            }
            a((this.f15303d + i) - i4);
            int i9 = this.f15302c + 1;
            c[] cVarArr = this.f15300a;
            if (i9 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15301b = this.f15300a.length - 1;
                this.f15300a = cVarArr2;
            }
            int i10 = this.f15301b;
            this.f15301b = i10 - 1;
            this.f15300a[i10] = cVar;
            this.f15302c++;
            this.f15303d += i;
        }

        private int a(int i, int i4) {
            int i9 = i & i4;
            if (i9 < i4) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int h9 = h();
                if ((h9 & 128) == 0) {
                    return i4 + (h9 << i10);
                }
                i4 += (h9 & 127) << i10;
                i10 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        private static final int f15308g = 4096;

        /* renamed from: h, reason: collision with root package name */
        private static final int f15309h = 16384;

        /* renamed from: a, reason: collision with root package name */
        int f15310a;

        /* renamed from: b, reason: collision with root package name */
        int f15311b;

        /* renamed from: c, reason: collision with root package name */
        c[] f15312c;

        /* renamed from: d, reason: collision with root package name */
        int f15313d;

        /* renamed from: e, reason: collision with root package name */
        int f15314e;

        /* renamed from: f, reason: collision with root package name */
        int f15315f;
        private final com.anythink.core.common.n.c.c i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f15316j;

        /* renamed from: k, reason: collision with root package name */
        private int f15317k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15318l;

        public b(com.anythink.core.common.n.c.c cVar) {
            this(cVar, (byte) 0);
        }

        private void a() {
            Arrays.fill(this.f15312c, (Object) null);
            this.f15313d = this.f15312c.length - 1;
            this.f15314e = 0;
            this.f15315f = 0;
        }

        private int b(int i) {
            int i4;
            int i9 = 0;
            if (i > 0) {
                int length = this.f15312c.length;
                while (true) {
                    length--;
                    i4 = this.f15313d;
                    if (length < i4 || i <= 0) {
                        break;
                    }
                    int i10 = this.f15312c[length].f15293n;
                    i -= i10;
                    this.f15315f -= i10;
                    this.f15314e--;
                    i9++;
                }
                c[] cVarArr = this.f15312c;
                System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i9, this.f15314e);
                c[] cVarArr2 = this.f15312c;
                int i11 = this.f15313d;
                Arrays.fill(cVarArr2, i11 + 1, i11 + 1 + i9, (Object) null);
                this.f15313d += i9;
            }
            return i9;
        }

        private b(com.anythink.core.common.n.c.c cVar, byte b9) {
            this.f15317k = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f15312c = cVarArr;
            this.f15313d = cVarArr.length - 1;
            this.f15314e = 0;
            this.f15315f = 0;
            this.f15310a = f15308g;
            this.f15311b = f15308g;
            this.f15316j = true;
            this.i = cVar;
        }

        private void a(c cVar) {
            int i = cVar.f15293n;
            int i4 = this.f15311b;
            if (i > i4) {
                a();
                return;
            }
            b((this.f15315f + i) - i4);
            int i9 = this.f15314e + 1;
            c[] cVarArr = this.f15312c;
            if (i9 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15313d = this.f15312c.length - 1;
                this.f15312c = cVarArr2;
            }
            int i10 = this.f15313d;
            this.f15313d = i10 - 1;
            this.f15312c[i10] = cVar;
            this.f15314e++;
            this.f15315f += i;
        }

        private void b() {
            int i = this.f15311b;
            int i4 = this.f15315f;
            if (i < i4) {
                if (i == 0) {
                    a();
                } else {
                    b(i4 - i);
                }
            }
        }

        public final void a(List<c> list) {
            int i;
            int i4;
            if (this.f15318l) {
                int i9 = this.f15317k;
                if (i9 < this.f15311b) {
                    a(i9, 31, 32);
                }
                this.f15318l = false;
                this.f15317k = Integer.MAX_VALUE;
                a(this.f15311b, 31, 32);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = list.get(i10);
                com.anythink.core.common.n.c.f h9 = cVar.f15291l.h();
                com.anythink.core.common.n.c.f fVar = cVar.f15292m;
                Integer num = d.f15295b.get(h9);
                if (num != null) {
                    int intValue = num.intValue();
                    i4 = intValue + 1;
                    if (i4 > 1 && i4 < 8) {
                        c[] cVarArr = d.f15294a;
                        if (Objects.equals(cVarArr[intValue].f15292m, fVar)) {
                            i = i4;
                        } else if (Objects.equals(cVarArr[i4].f15292m, fVar)) {
                            i4 = intValue + 2;
                            i = i4;
                        }
                    }
                    i = i4;
                    i4 = -1;
                } else {
                    i = -1;
                    i4 = -1;
                }
                if (i4 == -1) {
                    int i11 = this.f15313d + 1;
                    int length = this.f15312c.length;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f15312c[i11].f15291l, h9)) {
                            if (Objects.equals(this.f15312c[i11].f15292m, fVar)) {
                                i4 = (i11 - this.f15313d) + d.f15294a.length;
                                break;
                            } else if (i == -1) {
                                i = (i11 - this.f15313d) + d.f15294a.length;
                            }
                        }
                        i11++;
                    }
                }
                if (i4 != -1) {
                    a(i4, 127, 128);
                } else if (i == -1) {
                    this.i.l(64);
                    a(h9);
                    a(fVar);
                    a(cVar);
                } else if (h9.c(c.f15281a) && !c.f15290k.equals(h9)) {
                    a(i, 15, 0);
                    a(fVar);
                } else {
                    a(i, d.f15298e, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        private void a(int i, int i4, int i9) {
            if (i < i4) {
                this.i.l(i | i9);
                return;
            }
            this.i.l(i9 | i4);
            int i10 = i - i4;
            while (i10 >= 128) {
                this.i.l(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.i.l(i10);
        }

        private void a(com.anythink.core.common.n.c.f fVar) {
            if (this.f15316j) {
                k.a();
                if (k.a(fVar) < fVar.j()) {
                    com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                    k.a();
                    k.a(fVar, cVar);
                    com.anythink.core.common.n.c.f t9 = cVar.t();
                    a(t9.j(), 127, 128);
                    this.i.d(t9);
                    return;
                }
            }
            a(fVar.j(), 127, 0);
            this.i.d(fVar);
        }

        public final void a(int i) {
            this.f15310a = i;
            int min = Math.min(i, f15309h);
            int i4 = this.f15311b;
            if (i4 == min) {
                return;
            }
            if (min < i4) {
                this.f15317k = Math.min(this.f15317k, min);
            }
            this.f15318l = true;
            this.f15311b = min;
            int i9 = this.f15315f;
            if (min < i9) {
                if (min == 0) {
                    a();
                } else {
                    b(i9 - min);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f15290k, "");
        com.anythink.core.common.n.c.f fVar = c.f15288h;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.anythink.core.common.n.c.f fVar2 = c.i;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.anythink.core.common.n.c.f fVar3 = c.f15289j;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.anythink.core.common.n.c.f fVar4 = c.f15287g;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c(ATCustomRuleKeys.AGE, ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f15294a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int i = 0;
        while (true) {
            c[] cVarArr2 = f15294a;
            if (i >= cVarArr2.length) {
                f15295b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(cVarArr2[i].f15291l)) {
                    linkedHashMap.put(cVarArr2[i].f15291l, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    private d() {
    }

    private static Map<com.anythink.core.common.n.c.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f15294a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f15294a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f15291l)) {
                linkedHashMap.put(cVarArr[i].f15291l, Integer.valueOf(i));
            }
            i++;
        }
    }

    public static com.anythink.core.common.n.c.f a(com.anythink.core.common.n.c.f fVar) {
        int j9 = fVar.j();
        for (int i = 0; i < j9; i++) {
            byte b9 = fVar.b(i);
            if (b9 >= 65 && b9 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.a());
            }
        }
        return fVar;
    }
}
